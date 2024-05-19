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

// checks if the ModAssignRevertSubmissionsToDraftRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModAssignRevertSubmissionsToDraftRequest{}

// ModAssignRevertSubmissionsToDraftRequest struct for ModAssignRevertSubmissionsToDraftRequest
type ModAssignRevertSubmissionsToDraftRequest struct {
	// The assignment id to operate on
	Assignmentid int32 `json:"assignmentid"`
	Userids []map[string]interface{} `json:"userids"`
}

type _ModAssignRevertSubmissionsToDraftRequest ModAssignRevertSubmissionsToDraftRequest

// NewModAssignRevertSubmissionsToDraftRequest instantiates a new ModAssignRevertSubmissionsToDraftRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModAssignRevertSubmissionsToDraftRequest(assignmentid int32, userids []map[string]interface{}) *ModAssignRevertSubmissionsToDraftRequest {
	this := ModAssignRevertSubmissionsToDraftRequest{}
	this.Assignmentid = assignmentid
	this.Userids = userids
	return &this
}

// NewModAssignRevertSubmissionsToDraftRequestWithDefaults instantiates a new ModAssignRevertSubmissionsToDraftRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModAssignRevertSubmissionsToDraftRequestWithDefaults() *ModAssignRevertSubmissionsToDraftRequest {
	this := ModAssignRevertSubmissionsToDraftRequest{}
	return &this
}

// GetAssignmentid returns the Assignmentid field value
func (o *ModAssignRevertSubmissionsToDraftRequest) GetAssignmentid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Assignmentid
}

// GetAssignmentidOk returns a tuple with the Assignmentid field value
// and a boolean to check if the value has been set.
func (o *ModAssignRevertSubmissionsToDraftRequest) GetAssignmentidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Assignmentid, true
}

// SetAssignmentid sets field value
func (o *ModAssignRevertSubmissionsToDraftRequest) SetAssignmentid(v int32) {
	o.Assignmentid = v
}

// GetUserids returns the Userids field value
func (o *ModAssignRevertSubmissionsToDraftRequest) GetUserids() []map[string]interface{} {
	if o == nil {
		var ret []map[string]interface{}
		return ret
	}

	return o.Userids
}

// GetUseridsOk returns a tuple with the Userids field value
// and a boolean to check if the value has been set.
func (o *ModAssignRevertSubmissionsToDraftRequest) GetUseridsOk() ([]map[string]interface{}, bool) {
	if o == nil {
		return nil, false
	}
	return o.Userids, true
}

// SetUserids sets field value
func (o *ModAssignRevertSubmissionsToDraftRequest) SetUserids(v []map[string]interface{}) {
	o.Userids = v
}

func (o ModAssignRevertSubmissionsToDraftRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModAssignRevertSubmissionsToDraftRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["assignmentid"] = o.Assignmentid
	toSerialize["userids"] = o.Userids
	return toSerialize, nil
}

func (o *ModAssignRevertSubmissionsToDraftRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"assignmentid",
		"userids",
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

	varModAssignRevertSubmissionsToDraftRequest := _ModAssignRevertSubmissionsToDraftRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModAssignRevertSubmissionsToDraftRequest)

	if err != nil {
		return err
	}

	*o = ModAssignRevertSubmissionsToDraftRequest(varModAssignRevertSubmissionsToDraftRequest)

	return err
}

type NullableModAssignRevertSubmissionsToDraftRequest struct {
	value *ModAssignRevertSubmissionsToDraftRequest
	isSet bool
}

func (v NullableModAssignRevertSubmissionsToDraftRequest) Get() *ModAssignRevertSubmissionsToDraftRequest {
	return v.value
}

func (v *NullableModAssignRevertSubmissionsToDraftRequest) Set(val *ModAssignRevertSubmissionsToDraftRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableModAssignRevertSubmissionsToDraftRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableModAssignRevertSubmissionsToDraftRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModAssignRevertSubmissionsToDraftRequest(val *ModAssignRevertSubmissionsToDraftRequest) *NullableModAssignRevertSubmissionsToDraftRequest {
	return &NullableModAssignRevertSubmissionsToDraftRequest{value: val, isSet: true}
}

func (v NullableModAssignRevertSubmissionsToDraftRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModAssignRevertSubmissionsToDraftRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


