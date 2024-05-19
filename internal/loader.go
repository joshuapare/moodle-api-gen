package internal

import (
	"encoding/json"
	"errors"
	"fmt"
	"io"
	"os"
	"os/exec"
	"path/filepath"
)

type Description struct {
	Default   interface{} `json:"default"`
	Desc      string      `json:"desc"`
	Required  int         `json:"required"`
	AllowNull bool        `json:"allownull"`
}

type Key struct {
	Content *DynamicContent `json:"content,omitempty"`
	Keys    KeysList        `json:"keys,omitempty"`
	Type    string          `json:"type,omitempty"`
	Description
}

type DynamicContent struct {
	Keys KeysList `json:"keys,omitempty"`
	Description
}

// custom type for handling properties like allowed_from_ajax
// that can be either a boolean or a stringified boolean value
type BoolOrString bool

func (bos *BoolOrString) UnmarshalJSON(data []byte) error {
	var b bool
	if err := json.Unmarshal(data, &b); err == nil {
		*bos = BoolOrString(b)
		return nil
	}

	// try unmarshalling as a string and converting to boolean
	var s string
	if err := json.Unmarshal(data, &s); err == nil {
		switch s {
		case "true":
			*bos = BoolOrString(true)
		case "false":
			*bos = BoolOrString(false)
		default:
			return errors.New("invalid string value for BoolOrString")
		}
		return nil
	}

	return errors.New("failed to unmarshal BoolOrString")
}

// Moodle is unfortunately inconsistent here, so making a custom type for handling keys
// that can be either an object or an array
type KeysList map[string]*Key

func (kl *KeysList) UnmarshalJSON(data []byte) error {
	var rawObject map[string]*Key
	err := json.Unmarshal(data, &rawObject)
	if err == nil {
		*kl = rawObject
		return nil
	}

	// wasn't an object - try unmarshalling as an array
	var rawArray []json.RawMessage
	if err := json.Unmarshal(data, &rawArray); err == nil {
		*kl = make(map[string]*Key)
		for i, item := range rawArray {
			var key Key
			if err := json.Unmarshal(item, &key); err != nil {
				return err
			}
			(*kl)[fmt.Sprintf("key%d", i)] = &key
		}
		return nil
	}

	return errors.New("failed to unmarshal KeysList")
}

type MethodDetails struct {
	ClassPath        *string        `json:"classpath"`
	Services         *string        `json:"services"`
	AjaxMethod       string         `json:"ajax_method"`
	DeprecatedMethod string         `json:"deprecated_method"`
	ClassName        string         `json:"classname"`
	Component        string         `json:"component"`
	Capabilities     string         `json:"capabilities"`
	Name             string         `json:"name"`
	ID               string         `json:"id"`
	ParametersMethod string         `json:"parameters_method"`
	ReturnsMethod    string         `json:"returns_method"`
	MethodName       string         `json:"methodname"`
	Type             string         `json:"type"`
	Description      string         `json:"description"`
	ReturnsDesc      DynamicContent `json:"returns_desc"`
	ParametersDesc   DynamicContent `json:"parameters_desc"`
	AllowedFromAjax  BoolOrString   `json:"allowed_from_ajax"`
	LoginRequired    BoolOrString   `json:"loginrequired"`
	ReadOnlySession  BoolOrString   `json:"readonlysession"`
}

type Methods map[string]MethodDetails

// LoadMethods loads methods from a JSON file
func LoadMethods(filePath string) (Methods, error) {
	file, err := os.Open(filePath)
	if err != nil {
		return nil, err
	}
	defer file.Close()

	data, err := io.ReadAll(file)
	if err != nil {
		return nil, err
	}

	var methods Methods
	err = json.Unmarshal(data, &methods)
	if err != nil {
		return nil, err
	}

	return methods, nil
}

// LoadMethodsFromBytes loads methods from a byte slice
// containing JSON data
func LoadMethodsFromBytes(data []byte) (Methods, error) {
	var methods Methods
	err := json.Unmarshal(data, &methods)
	if err != nil {
		return nil, err
	}
	return methods, nil
}

// LoadMethodsFromExec runs the generator script and loads the methods
// from the output.
func LoadMethodsFromExec(scriptPath string) (Methods, error) {
	localPath := filepath.Join(scriptPath, ExportPath)

	cmd := exec.Command("php", localPath)
	output, err := cmd.Output()
	if err != nil {
		return nil, err
	}
	// Load the methods from the output
	return LoadMethodsFromBytes(output)
}
