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

// checks if the ModScormViewScormRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModScormViewScormRequest{}

// ModScormViewScormRequest struct for ModScormViewScormRequest
type ModScormViewScormRequest struct {
	// scorm instance id
	Scormid int32 `json:"scormid"`
}

type _ModScormViewScormRequest ModScormViewScormRequest

// NewModScormViewScormRequest instantiates a new ModScormViewScormRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModScormViewScormRequest(scormid int32) *ModScormViewScormRequest {
	this := ModScormViewScormRequest{}
	this.Scormid = scormid
	return &this
}

// NewModScormViewScormRequestWithDefaults instantiates a new ModScormViewScormRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModScormViewScormRequestWithDefaults() *ModScormViewScormRequest {
	this := ModScormViewScormRequest{}
	return &this
}

// GetScormid returns the Scormid field value
func (o *ModScormViewScormRequest) GetScormid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Scormid
}

// GetScormidOk returns a tuple with the Scormid field value
// and a boolean to check if the value has been set.
func (o *ModScormViewScormRequest) GetScormidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Scormid, true
}

// SetScormid sets field value
func (o *ModScormViewScormRequest) SetScormid(v int32) {
	o.Scormid = v
}

func (o ModScormViewScormRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModScormViewScormRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["scormid"] = o.Scormid
	return toSerialize, nil
}

func (o *ModScormViewScormRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"scormid",
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

	varModScormViewScormRequest := _ModScormViewScormRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModScormViewScormRequest)

	if err != nil {
		return err
	}

	*o = ModScormViewScormRequest(varModScormViewScormRequest)

	return err
}

type NullableModScormViewScormRequest struct {
	value *ModScormViewScormRequest
	isSet bool
}

func (v NullableModScormViewScormRequest) Get() *ModScormViewScormRequest {
	return v.value
}

func (v *NullableModScormViewScormRequest) Set(val *ModScormViewScormRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableModScormViewScormRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableModScormViewScormRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModScormViewScormRequest(val *ModScormViewScormRequest) *NullableModScormViewScormRequest {
	return &NullableModScormViewScormRequest{value: val, isSet: true}
}

func (v NullableModScormViewScormRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModScormViewScormRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


