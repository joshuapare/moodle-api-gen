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

// checks if the ModDataGetMappingInformationRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModDataGetMappingInformationRequest{}

// ModDataGetMappingInformationRequest struct for ModDataGetMappingInformationRequest
type ModDataGetMappingInformationRequest struct {
	// Id of the data activity
	Cmid int32 `json:"cmid"`
	// Preset to be imported
	Importedpreset string `json:"importedpreset"`
}

type _ModDataGetMappingInformationRequest ModDataGetMappingInformationRequest

// NewModDataGetMappingInformationRequest instantiates a new ModDataGetMappingInformationRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModDataGetMappingInformationRequest(cmid int32, importedpreset string) *ModDataGetMappingInformationRequest {
	this := ModDataGetMappingInformationRequest{}
	this.Cmid = cmid
	this.Importedpreset = importedpreset
	return &this
}

// NewModDataGetMappingInformationRequestWithDefaults instantiates a new ModDataGetMappingInformationRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModDataGetMappingInformationRequestWithDefaults() *ModDataGetMappingInformationRequest {
	this := ModDataGetMappingInformationRequest{}
	var importedpreset string = "null"
	this.Importedpreset = importedpreset
	return &this
}

// GetCmid returns the Cmid field value
func (o *ModDataGetMappingInformationRequest) GetCmid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Cmid
}

// GetCmidOk returns a tuple with the Cmid field value
// and a boolean to check if the value has been set.
func (o *ModDataGetMappingInformationRequest) GetCmidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Cmid, true
}

// SetCmid sets field value
func (o *ModDataGetMappingInformationRequest) SetCmid(v int32) {
	o.Cmid = v
}

// GetImportedpreset returns the Importedpreset field value
func (o *ModDataGetMappingInformationRequest) GetImportedpreset() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Importedpreset
}

// GetImportedpresetOk returns a tuple with the Importedpreset field value
// and a boolean to check if the value has been set.
func (o *ModDataGetMappingInformationRequest) GetImportedpresetOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Importedpreset, true
}

// SetImportedpreset sets field value
func (o *ModDataGetMappingInformationRequest) SetImportedpreset(v string) {
	o.Importedpreset = v
}

func (o ModDataGetMappingInformationRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModDataGetMappingInformationRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["cmid"] = o.Cmid
	toSerialize["importedpreset"] = o.Importedpreset
	return toSerialize, nil
}

func (o *ModDataGetMappingInformationRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"cmid",
		"importedpreset",
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

	varModDataGetMappingInformationRequest := _ModDataGetMappingInformationRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModDataGetMappingInformationRequest)

	if err != nil {
		return err
	}

	*o = ModDataGetMappingInformationRequest(varModDataGetMappingInformationRequest)

	return err
}

type NullableModDataGetMappingInformationRequest struct {
	value *ModDataGetMappingInformationRequest
	isSet bool
}

func (v NullableModDataGetMappingInformationRequest) Get() *ModDataGetMappingInformationRequest {
	return v.value
}

func (v *NullableModDataGetMappingInformationRequest) Set(val *ModDataGetMappingInformationRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableModDataGetMappingInformationRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableModDataGetMappingInformationRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModDataGetMappingInformationRequest(val *ModDataGetMappingInformationRequest) *NullableModDataGetMappingInformationRequest {
	return &NullableModDataGetMappingInformationRequest{value: val, isSet: true}
}

func (v NullableModDataGetMappingInformationRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModDataGetMappingInformationRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


