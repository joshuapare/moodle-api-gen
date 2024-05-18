/*
Moodle Webservice API

Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

API version: 4.3.4
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package moodleclient

import (
	"encoding/json"
	"bytes"
	"fmt"
)

// checks if the CoreBackupSubmitCopyFormRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreBackupSubmitCopyFormRequest{}

// CoreBackupSubmitCopyFormRequest struct for CoreBackupSubmitCopyFormRequest
type CoreBackupSubmitCopyFormRequest struct {
	// The data from the create copy form, encoded as a json array
	Jsonformdata string `json:"jsonformdata"`
}

type _CoreBackupSubmitCopyFormRequest CoreBackupSubmitCopyFormRequest

// NewCoreBackupSubmitCopyFormRequest instantiates a new CoreBackupSubmitCopyFormRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreBackupSubmitCopyFormRequest(jsonformdata string) *CoreBackupSubmitCopyFormRequest {
	this := CoreBackupSubmitCopyFormRequest{}
	this.Jsonformdata = jsonformdata
	return &this
}

// NewCoreBackupSubmitCopyFormRequestWithDefaults instantiates a new CoreBackupSubmitCopyFormRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreBackupSubmitCopyFormRequestWithDefaults() *CoreBackupSubmitCopyFormRequest {
	this := CoreBackupSubmitCopyFormRequest{}
	var jsonformdata string = "null"
	this.Jsonformdata = jsonformdata
	return &this
}

// GetJsonformdata returns the Jsonformdata field value
func (o *CoreBackupSubmitCopyFormRequest) GetJsonformdata() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Jsonformdata
}

// GetJsonformdataOk returns a tuple with the Jsonformdata field value
// and a boolean to check if the value has been set.
func (o *CoreBackupSubmitCopyFormRequest) GetJsonformdataOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Jsonformdata, true
}

// SetJsonformdata sets field value
func (o *CoreBackupSubmitCopyFormRequest) SetJsonformdata(v string) {
	o.Jsonformdata = v
}

func (o CoreBackupSubmitCopyFormRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreBackupSubmitCopyFormRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["jsonformdata"] = o.Jsonformdata
	return toSerialize, nil
}

func (o *CoreBackupSubmitCopyFormRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"jsonformdata",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varCoreBackupSubmitCopyFormRequest := _CoreBackupSubmitCopyFormRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreBackupSubmitCopyFormRequest)

	if err != nil {
		return err
	}

	*o = CoreBackupSubmitCopyFormRequest(varCoreBackupSubmitCopyFormRequest)

	return err
}

type NullableCoreBackupSubmitCopyFormRequest struct {
	value *CoreBackupSubmitCopyFormRequest
	isSet bool
}

func (v NullableCoreBackupSubmitCopyFormRequest) Get() *CoreBackupSubmitCopyFormRequest {
	return v.value
}

func (v *NullableCoreBackupSubmitCopyFormRequest) Set(val *CoreBackupSubmitCopyFormRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreBackupSubmitCopyFormRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreBackupSubmitCopyFormRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreBackupSubmitCopyFormRequest(val *CoreBackupSubmitCopyFormRequest) *NullableCoreBackupSubmitCopyFormRequest {
	return &NullableCoreBackupSubmitCopyFormRequest{value: val, isSet: true}
}

func (v NullableCoreBackupSubmitCopyFormRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreBackupSubmitCopyFormRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


