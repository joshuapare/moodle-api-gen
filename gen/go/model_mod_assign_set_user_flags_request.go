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

// checks if the ModAssignSetUserFlagsRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModAssignSetUserFlagsRequest{}

// ModAssignSetUserFlagsRequest struct for ModAssignSetUserFlagsRequest
type ModAssignSetUserFlagsRequest struct {
	// assignment id
	Assignmentid int32 `json:"assignmentid"`
	Userflags []ModAssignSetUserFlagsRequestUserflagsInner `json:"userflags"`
}

type _ModAssignSetUserFlagsRequest ModAssignSetUserFlagsRequest

// NewModAssignSetUserFlagsRequest instantiates a new ModAssignSetUserFlagsRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModAssignSetUserFlagsRequest(assignmentid int32, userflags []ModAssignSetUserFlagsRequestUserflagsInner) *ModAssignSetUserFlagsRequest {
	this := ModAssignSetUserFlagsRequest{}
	this.Assignmentid = assignmentid
	this.Userflags = userflags
	return &this
}

// NewModAssignSetUserFlagsRequestWithDefaults instantiates a new ModAssignSetUserFlagsRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModAssignSetUserFlagsRequestWithDefaults() *ModAssignSetUserFlagsRequest {
	this := ModAssignSetUserFlagsRequest{}
	return &this
}

// GetAssignmentid returns the Assignmentid field value
func (o *ModAssignSetUserFlagsRequest) GetAssignmentid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Assignmentid
}

// GetAssignmentidOk returns a tuple with the Assignmentid field value
// and a boolean to check if the value has been set.
func (o *ModAssignSetUserFlagsRequest) GetAssignmentidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Assignmentid, true
}

// SetAssignmentid sets field value
func (o *ModAssignSetUserFlagsRequest) SetAssignmentid(v int32) {
	o.Assignmentid = v
}

// GetUserflags returns the Userflags field value
func (o *ModAssignSetUserFlagsRequest) GetUserflags() []ModAssignSetUserFlagsRequestUserflagsInner {
	if o == nil {
		var ret []ModAssignSetUserFlagsRequestUserflagsInner
		return ret
	}

	return o.Userflags
}

// GetUserflagsOk returns a tuple with the Userflags field value
// and a boolean to check if the value has been set.
func (o *ModAssignSetUserFlagsRequest) GetUserflagsOk() ([]ModAssignSetUserFlagsRequestUserflagsInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Userflags, true
}

// SetUserflags sets field value
func (o *ModAssignSetUserFlagsRequest) SetUserflags(v []ModAssignSetUserFlagsRequestUserflagsInner) {
	o.Userflags = v
}

func (o ModAssignSetUserFlagsRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModAssignSetUserFlagsRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["assignmentid"] = o.Assignmentid
	toSerialize["userflags"] = o.Userflags
	return toSerialize, nil
}

func (o *ModAssignSetUserFlagsRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"assignmentid",
		"userflags",
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

	varModAssignSetUserFlagsRequest := _ModAssignSetUserFlagsRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModAssignSetUserFlagsRequest)

	if err != nil {
		return err
	}

	*o = ModAssignSetUserFlagsRequest(varModAssignSetUserFlagsRequest)

	return err
}

type NullableModAssignSetUserFlagsRequest struct {
	value *ModAssignSetUserFlagsRequest
	isSet bool
}

func (v NullableModAssignSetUserFlagsRequest) Get() *ModAssignSetUserFlagsRequest {
	return v.value
}

func (v *NullableModAssignSetUserFlagsRequest) Set(val *ModAssignSetUserFlagsRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableModAssignSetUserFlagsRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableModAssignSetUserFlagsRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModAssignSetUserFlagsRequest(val *ModAssignSetUserFlagsRequest) *NullableModAssignSetUserFlagsRequest {
	return &NullableModAssignSetUserFlagsRequest{value: val, isSet: true}
}

func (v NullableModAssignSetUserFlagsRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModAssignSetUserFlagsRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

