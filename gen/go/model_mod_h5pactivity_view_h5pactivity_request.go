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

// checks if the ModH5pactivityViewH5pactivityRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModH5pactivityViewH5pactivityRequest{}

// ModH5pactivityViewH5pactivityRequest struct for ModH5pactivityViewH5pactivityRequest
type ModH5pactivityViewH5pactivityRequest struct {
	// H5P activity instance id
	H5pactivityid int32 `json:"h5pactivityid"`
}

type _ModH5pactivityViewH5pactivityRequest ModH5pactivityViewH5pactivityRequest

// NewModH5pactivityViewH5pactivityRequest instantiates a new ModH5pactivityViewH5pactivityRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModH5pactivityViewH5pactivityRequest(h5pactivityid int32) *ModH5pactivityViewH5pactivityRequest {
	this := ModH5pactivityViewH5pactivityRequest{}
	this.H5pactivityid = h5pactivityid
	return &this
}

// NewModH5pactivityViewH5pactivityRequestWithDefaults instantiates a new ModH5pactivityViewH5pactivityRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModH5pactivityViewH5pactivityRequestWithDefaults() *ModH5pactivityViewH5pactivityRequest {
	this := ModH5pactivityViewH5pactivityRequest{}
	var h5pactivityid int32 = null
	this.H5pactivityid = h5pactivityid
	return &this
}

// GetH5pactivityid returns the H5pactivityid field value
func (o *ModH5pactivityViewH5pactivityRequest) GetH5pactivityid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.H5pactivityid
}

// GetH5pactivityidOk returns a tuple with the H5pactivityid field value
// and a boolean to check if the value has been set.
func (o *ModH5pactivityViewH5pactivityRequest) GetH5pactivityidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.H5pactivityid, true
}

// SetH5pactivityid sets field value
func (o *ModH5pactivityViewH5pactivityRequest) SetH5pactivityid(v int32) {
	o.H5pactivityid = v
}

func (o ModH5pactivityViewH5pactivityRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModH5pactivityViewH5pactivityRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["h5pactivityid"] = o.H5pactivityid
	return toSerialize, nil
}

func (o *ModH5pactivityViewH5pactivityRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"h5pactivityid",
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

	varModH5pactivityViewH5pactivityRequest := _ModH5pactivityViewH5pactivityRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModH5pactivityViewH5pactivityRequest)

	if err != nil {
		return err
	}

	*o = ModH5pactivityViewH5pactivityRequest(varModH5pactivityViewH5pactivityRequest)

	return err
}

type NullableModH5pactivityViewH5pactivityRequest struct {
	value *ModH5pactivityViewH5pactivityRequest
	isSet bool
}

func (v NullableModH5pactivityViewH5pactivityRequest) Get() *ModH5pactivityViewH5pactivityRequest {
	return v.value
}

func (v *NullableModH5pactivityViewH5pactivityRequest) Set(val *ModH5pactivityViewH5pactivityRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableModH5pactivityViewH5pactivityRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableModH5pactivityViewH5pactivityRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModH5pactivityViewH5pactivityRequest(val *ModH5pactivityViewH5pactivityRequest) *NullableModH5pactivityViewH5pactivityRequest {
	return &NullableModH5pactivityViewH5pactivityRequest{value: val, isSet: true}
}

func (v NullableModH5pactivityViewH5pactivityRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModH5pactivityViewH5pactivityRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

