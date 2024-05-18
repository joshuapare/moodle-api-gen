package internal

import (
	"encoding/json"
	"errors"
	"fmt"
	"io"
	"os"
)

// General structure for descriptions
type Description struct {
	Default   interface{} `json:"default"`
	Desc      string      `json:"desc"`
	Required  int         `json:"required"`
	AllowNull bool        `json:"allownull"`
}

// Structure for keys within parameters or returns descriptions
type Key struct {
	Content *DynamicContent `json:"content,omitempty"`
	Keys    KeysList        `json:"keys,omitempty"`
	Type    string          `json:"type,omitempty"`
	Description
}

// Structure for dynamic content
type DynamicContent struct {
	Keys KeysList `json:"keys,omitempty"`
	Description
}

// Custom type for handling allowed_from_ajax that can be either a boolean or a string
type BoolOrString bool

func (bos *BoolOrString) UnmarshalJSON(data []byte) error {
	// Try unmarshalling as a boolean
	var b bool
	if err := json.Unmarshal(data, &b); err == nil {
		*bos = BoolOrString(b)
		return nil
	}

	// Try unmarshalling as a string and converting to boolean
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

// Custom type for handling keys that can be either an object or an array
type KeysList map[string]*Key

func (kl *KeysList) UnmarshalJSON(data []byte) error {
	// Try unmarshalling as an object
	var rawObject map[string]*Key
	err := json.Unmarshal(data, &rawObject)
	if err == nil {
		*kl = rawObject
		return nil
	}

	// Try unmarshalling as an array
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

// Struct for individual method details
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

// Main container for all methods
type Methods map[string]MethodDetails

// loadMethods loads methods from a JSON file
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
