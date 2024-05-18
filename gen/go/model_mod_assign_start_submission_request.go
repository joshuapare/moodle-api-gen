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

// checks if the ModAssignStartSubmissionRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModAssignStartSubmissionRequest{}

// ModAssignStartSubmissionRequest struct for ModAssignStartSubmissionRequest
type ModAssignStartSubmissionRequest struct {
	// Assignment instance id
	Assignid int32 `json:"assignid"`
}

type _ModAssignStartSubmissionRequest ModAssignStartSubmissionRequest

// NewModAssignStartSubmissionRequest instantiates a new ModAssignStartSubmissionRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModAssignStartSubmissionRequest(assignid int32) *ModAssignStartSubmissionRequest {
	this := ModAssignStartSubmissionRequest{}
	this.Assignid = assignid
	return &this
}

// NewModAssignStartSubmissionRequestWithDefaults instantiates a new ModAssignStartSubmissionRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModAssignStartSubmissionRequestWithDefaults() *ModAssignStartSubmissionRequest {
	this := ModAssignStartSubmissionRequest{}
	var assignid int32 = null
	this.Assignid = assignid
	return &this
}

// GetAssignid returns the Assignid field value
func (o *ModAssignStartSubmissionRequest) GetAssignid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Assignid
}

// GetAssignidOk returns a tuple with the Assignid field value
// and a boolean to check if the value has been set.
func (o *ModAssignStartSubmissionRequest) GetAssignidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Assignid, true
}

// SetAssignid sets field value
func (o *ModAssignStartSubmissionRequest) SetAssignid(v int32) {
	o.Assignid = v
}

func (o ModAssignStartSubmissionRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModAssignStartSubmissionRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["assignid"] = o.Assignid
	return toSerialize, nil
}

func (o *ModAssignStartSubmissionRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"assignid",
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

	varModAssignStartSubmissionRequest := _ModAssignStartSubmissionRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModAssignStartSubmissionRequest)

	if err != nil {
		return err
	}

	*o = ModAssignStartSubmissionRequest(varModAssignStartSubmissionRequest)

	return err
}

type NullableModAssignStartSubmissionRequest struct {
	value *ModAssignStartSubmissionRequest
	isSet bool
}

func (v NullableModAssignStartSubmissionRequest) Get() *ModAssignStartSubmissionRequest {
	return v.value
}

func (v *NullableModAssignStartSubmissionRequest) Set(val *ModAssignStartSubmissionRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableModAssignStartSubmissionRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableModAssignStartSubmissionRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModAssignStartSubmissionRequest(val *ModAssignStartSubmissionRequest) *NullableModAssignStartSubmissionRequest {
	return &NullableModAssignStartSubmissionRequest{value: val, isSet: true}
}

func (v NullableModAssignStartSubmissionRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModAssignStartSubmissionRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


