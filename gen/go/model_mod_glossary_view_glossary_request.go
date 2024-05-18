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

// checks if the ModGlossaryViewGlossaryRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModGlossaryViewGlossaryRequest{}

// ModGlossaryViewGlossaryRequest struct for ModGlossaryViewGlossaryRequest
type ModGlossaryViewGlossaryRequest struct {
	// Glossary instance ID
	Id int32 `json:"id"`
	// The mode in which the glossary is viewed
	Mode string `json:"mode"`
}

type _ModGlossaryViewGlossaryRequest ModGlossaryViewGlossaryRequest

// NewModGlossaryViewGlossaryRequest instantiates a new ModGlossaryViewGlossaryRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModGlossaryViewGlossaryRequest(id int32, mode string) *ModGlossaryViewGlossaryRequest {
	this := ModGlossaryViewGlossaryRequest{}
	this.Id = id
	this.Mode = mode
	return &this
}

// NewModGlossaryViewGlossaryRequestWithDefaults instantiates a new ModGlossaryViewGlossaryRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModGlossaryViewGlossaryRequestWithDefaults() *ModGlossaryViewGlossaryRequest {
	this := ModGlossaryViewGlossaryRequest{}
	var id int32 = null
	this.Id = id
	var mode string = "null"
	this.Mode = mode
	return &this
}

// GetId returns the Id field value
func (o *ModGlossaryViewGlossaryRequest) GetId() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *ModGlossaryViewGlossaryRequest) GetIdOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *ModGlossaryViewGlossaryRequest) SetId(v int32) {
	o.Id = v
}

// GetMode returns the Mode field value
func (o *ModGlossaryViewGlossaryRequest) GetMode() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Mode
}

// GetModeOk returns a tuple with the Mode field value
// and a boolean to check if the value has been set.
func (o *ModGlossaryViewGlossaryRequest) GetModeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Mode, true
}

// SetMode sets field value
func (o *ModGlossaryViewGlossaryRequest) SetMode(v string) {
	o.Mode = v
}

func (o ModGlossaryViewGlossaryRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModGlossaryViewGlossaryRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["id"] = o.Id
	toSerialize["mode"] = o.Mode
	return toSerialize, nil
}

func (o *ModGlossaryViewGlossaryRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"id",
		"mode",
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

	varModGlossaryViewGlossaryRequest := _ModGlossaryViewGlossaryRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModGlossaryViewGlossaryRequest)

	if err != nil {
		return err
	}

	*o = ModGlossaryViewGlossaryRequest(varModGlossaryViewGlossaryRequest)

	return err
}

type NullableModGlossaryViewGlossaryRequest struct {
	value *ModGlossaryViewGlossaryRequest
	isSet bool
}

func (v NullableModGlossaryViewGlossaryRequest) Get() *ModGlossaryViewGlossaryRequest {
	return v.value
}

func (v *NullableModGlossaryViewGlossaryRequest) Set(val *ModGlossaryViewGlossaryRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableModGlossaryViewGlossaryRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableModGlossaryViewGlossaryRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModGlossaryViewGlossaryRequest(val *ModGlossaryViewGlossaryRequest) *NullableModGlossaryViewGlossaryRequest {
	return &NullableModGlossaryViewGlossaryRequest{value: val, isSet: true}
}

func (v NullableModGlossaryViewGlossaryRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModGlossaryViewGlossaryRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

