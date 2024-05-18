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

// checks if the ModAssignCopyPreviousAttemptRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModAssignCopyPreviousAttemptRequest{}

// ModAssignCopyPreviousAttemptRequest struct for ModAssignCopyPreviousAttemptRequest
type ModAssignCopyPreviousAttemptRequest struct {
	// The assignment id to operate on
	Assignmentid int32 `json:"assignmentid"`
}

type _ModAssignCopyPreviousAttemptRequest ModAssignCopyPreviousAttemptRequest

// NewModAssignCopyPreviousAttemptRequest instantiates a new ModAssignCopyPreviousAttemptRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModAssignCopyPreviousAttemptRequest(assignmentid int32) *ModAssignCopyPreviousAttemptRequest {
	this := ModAssignCopyPreviousAttemptRequest{}
	this.Assignmentid = assignmentid
	return &this
}

// NewModAssignCopyPreviousAttemptRequestWithDefaults instantiates a new ModAssignCopyPreviousAttemptRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModAssignCopyPreviousAttemptRequestWithDefaults() *ModAssignCopyPreviousAttemptRequest {
	this := ModAssignCopyPreviousAttemptRequest{}
	var assignmentid int32 = null
	this.Assignmentid = assignmentid
	return &this
}

// GetAssignmentid returns the Assignmentid field value
func (o *ModAssignCopyPreviousAttemptRequest) GetAssignmentid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Assignmentid
}

// GetAssignmentidOk returns a tuple with the Assignmentid field value
// and a boolean to check if the value has been set.
func (o *ModAssignCopyPreviousAttemptRequest) GetAssignmentidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Assignmentid, true
}

// SetAssignmentid sets field value
func (o *ModAssignCopyPreviousAttemptRequest) SetAssignmentid(v int32) {
	o.Assignmentid = v
}

func (o ModAssignCopyPreviousAttemptRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModAssignCopyPreviousAttemptRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["assignmentid"] = o.Assignmentid
	return toSerialize, nil
}

func (o *ModAssignCopyPreviousAttemptRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"assignmentid",
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

	varModAssignCopyPreviousAttemptRequest := _ModAssignCopyPreviousAttemptRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModAssignCopyPreviousAttemptRequest)

	if err != nil {
		return err
	}

	*o = ModAssignCopyPreviousAttemptRequest(varModAssignCopyPreviousAttemptRequest)

	return err
}

type NullableModAssignCopyPreviousAttemptRequest struct {
	value *ModAssignCopyPreviousAttemptRequest
	isSet bool
}

func (v NullableModAssignCopyPreviousAttemptRequest) Get() *ModAssignCopyPreviousAttemptRequest {
	return v.value
}

func (v *NullableModAssignCopyPreviousAttemptRequest) Set(val *ModAssignCopyPreviousAttemptRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableModAssignCopyPreviousAttemptRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableModAssignCopyPreviousAttemptRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModAssignCopyPreviousAttemptRequest(val *ModAssignCopyPreviousAttemptRequest) *NullableModAssignCopyPreviousAttemptRequest {
	return &NullableModAssignCopyPreviousAttemptRequest{value: val, isSet: true}
}

func (v NullableModAssignCopyPreviousAttemptRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModAssignCopyPreviousAttemptRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


