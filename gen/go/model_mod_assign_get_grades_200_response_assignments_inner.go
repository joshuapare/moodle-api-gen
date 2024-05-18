/*
Moodle Webservice API

Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

API version: 4.3.4
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package moodleclient

import (
	"encoding/json"
)

// checks if the ModAssignGetGrades200ResponseAssignmentsInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModAssignGetGrades200ResponseAssignmentsInner{}

// ModAssignGetGrades200ResponseAssignmentsInner struct for ModAssignGetGrades200ResponseAssignmentsInner
type ModAssignGetGrades200ResponseAssignmentsInner struct {
	// assignment id
	Assignmentid *int32 `json:"assignmentid,omitempty"`
	Grades []ModAssignGetGrades200ResponseAssignmentsInnerGradesInner `json:"grades,omitempty"`
}

// NewModAssignGetGrades200ResponseAssignmentsInner instantiates a new ModAssignGetGrades200ResponseAssignmentsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModAssignGetGrades200ResponseAssignmentsInner() *ModAssignGetGrades200ResponseAssignmentsInner {
	this := ModAssignGetGrades200ResponseAssignmentsInner{}
	return &this
}

// NewModAssignGetGrades200ResponseAssignmentsInnerWithDefaults instantiates a new ModAssignGetGrades200ResponseAssignmentsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModAssignGetGrades200ResponseAssignmentsInnerWithDefaults() *ModAssignGetGrades200ResponseAssignmentsInner {
	this := ModAssignGetGrades200ResponseAssignmentsInner{}
	return &this
}

// GetAssignmentid returns the Assignmentid field value if set, zero value otherwise.
func (o *ModAssignGetGrades200ResponseAssignmentsInner) GetAssignmentid() int32 {
	if o == nil || IsNil(o.Assignmentid) {
		var ret int32
		return ret
	}
	return *o.Assignmentid
}

// GetAssignmentidOk returns a tuple with the Assignmentid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignGetGrades200ResponseAssignmentsInner) GetAssignmentidOk() (*int32, bool) {
	if o == nil || IsNil(o.Assignmentid) {
		return nil, false
	}
	return o.Assignmentid, true
}

// HasAssignmentid returns a boolean if a field has been set.
func (o *ModAssignGetGrades200ResponseAssignmentsInner) HasAssignmentid() bool {
	if o != nil && !IsNil(o.Assignmentid) {
		return true
	}

	return false
}

// SetAssignmentid gets a reference to the given int32 and assigns it to the Assignmentid field.
func (o *ModAssignGetGrades200ResponseAssignmentsInner) SetAssignmentid(v int32) {
	o.Assignmentid = &v
}

// GetGrades returns the Grades field value if set, zero value otherwise.
func (o *ModAssignGetGrades200ResponseAssignmentsInner) GetGrades() []ModAssignGetGrades200ResponseAssignmentsInnerGradesInner {
	if o == nil || IsNil(o.Grades) {
		var ret []ModAssignGetGrades200ResponseAssignmentsInnerGradesInner
		return ret
	}
	return o.Grades
}

// GetGradesOk returns a tuple with the Grades field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignGetGrades200ResponseAssignmentsInner) GetGradesOk() ([]ModAssignGetGrades200ResponseAssignmentsInnerGradesInner, bool) {
	if o == nil || IsNil(o.Grades) {
		return nil, false
	}
	return o.Grades, true
}

// HasGrades returns a boolean if a field has been set.
func (o *ModAssignGetGrades200ResponseAssignmentsInner) HasGrades() bool {
	if o != nil && !IsNil(o.Grades) {
		return true
	}

	return false
}

// SetGrades gets a reference to the given []ModAssignGetGrades200ResponseAssignmentsInnerGradesInner and assigns it to the Grades field.
func (o *ModAssignGetGrades200ResponseAssignmentsInner) SetGrades(v []ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) {
	o.Grades = v
}

func (o ModAssignGetGrades200ResponseAssignmentsInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModAssignGetGrades200ResponseAssignmentsInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Assignmentid) {
		toSerialize["assignmentid"] = o.Assignmentid
	}
	if !IsNil(o.Grades) {
		toSerialize["grades"] = o.Grades
	}
	return toSerialize, nil
}

type NullableModAssignGetGrades200ResponseAssignmentsInner struct {
	value *ModAssignGetGrades200ResponseAssignmentsInner
	isSet bool
}

func (v NullableModAssignGetGrades200ResponseAssignmentsInner) Get() *ModAssignGetGrades200ResponseAssignmentsInner {
	return v.value
}

func (v *NullableModAssignGetGrades200ResponseAssignmentsInner) Set(val *ModAssignGetGrades200ResponseAssignmentsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableModAssignGetGrades200ResponseAssignmentsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableModAssignGetGrades200ResponseAssignmentsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModAssignGetGrades200ResponseAssignmentsInner(val *ModAssignGetGrades200ResponseAssignmentsInner) *NullableModAssignGetGrades200ResponseAssignmentsInner {
	return &NullableModAssignGetGrades200ResponseAssignmentsInner{value: val, isSet: true}
}

func (v NullableModAssignGetGrades200ResponseAssignmentsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModAssignGetGrades200ResponseAssignmentsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


