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

// checks if the ModLessonGetUserAttempt200ResponseUserstats type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModLessonGetUserAttempt200ResponseUserstats{}

// ModLessonGetUserAttempt200ResponseUserstats struct for ModLessonGetUserAttempt200ResponseUserstats
type ModLessonGetUserAttempt200ResponseUserstats struct {
	// Time completed.
	Completed int32 `json:"completed"`
	// Attempt final grade.
	Grade float32 `json:"grade"`
	Gradeinfo *ModLessonGetUserAttempt200ResponseUserstatsGradeinfo `json:"gradeinfo,omitempty"`
	// Time taken.
	Timetotake int32 `json:"timetotake"`
}

type _ModLessonGetUserAttempt200ResponseUserstats ModLessonGetUserAttempt200ResponseUserstats

// NewModLessonGetUserAttempt200ResponseUserstats instantiates a new ModLessonGetUserAttempt200ResponseUserstats object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModLessonGetUserAttempt200ResponseUserstats(completed int32, grade float32, timetotake int32) *ModLessonGetUserAttempt200ResponseUserstats {
	this := ModLessonGetUserAttempt200ResponseUserstats{}
	this.Completed = completed
	this.Grade = grade
	this.Timetotake = timetotake
	return &this
}

// NewModLessonGetUserAttempt200ResponseUserstatsWithDefaults instantiates a new ModLessonGetUserAttempt200ResponseUserstats object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModLessonGetUserAttempt200ResponseUserstatsWithDefaults() *ModLessonGetUserAttempt200ResponseUserstats {
	this := ModLessonGetUserAttempt200ResponseUserstats{}
	var completed int32 = null
	this.Completed = completed
	var grade float32 = null
	this.Grade = grade
	var timetotake int32 = null
	this.Timetotake = timetotake
	return &this
}

// GetCompleted returns the Completed field value
func (o *ModLessonGetUserAttempt200ResponseUserstats) GetCompleted() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Completed
}

// GetCompletedOk returns a tuple with the Completed field value
// and a boolean to check if the value has been set.
func (o *ModLessonGetUserAttempt200ResponseUserstats) GetCompletedOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Completed, true
}

// SetCompleted sets field value
func (o *ModLessonGetUserAttempt200ResponseUserstats) SetCompleted(v int32) {
	o.Completed = v
}

// GetGrade returns the Grade field value
func (o *ModLessonGetUserAttempt200ResponseUserstats) GetGrade() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Grade
}

// GetGradeOk returns a tuple with the Grade field value
// and a boolean to check if the value has been set.
func (o *ModLessonGetUserAttempt200ResponseUserstats) GetGradeOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Grade, true
}

// SetGrade sets field value
func (o *ModLessonGetUserAttempt200ResponseUserstats) SetGrade(v float32) {
	o.Grade = v
}

// GetGradeinfo returns the Gradeinfo field value if set, zero value otherwise.
func (o *ModLessonGetUserAttempt200ResponseUserstats) GetGradeinfo() ModLessonGetUserAttempt200ResponseUserstatsGradeinfo {
	if o == nil || IsNil(o.Gradeinfo) {
		var ret ModLessonGetUserAttempt200ResponseUserstatsGradeinfo
		return ret
	}
	return *o.Gradeinfo
}

// GetGradeinfoOk returns a tuple with the Gradeinfo field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModLessonGetUserAttempt200ResponseUserstats) GetGradeinfoOk() (*ModLessonGetUserAttempt200ResponseUserstatsGradeinfo, bool) {
	if o == nil || IsNil(o.Gradeinfo) {
		return nil, false
	}
	return o.Gradeinfo, true
}

// HasGradeinfo returns a boolean if a field has been set.
func (o *ModLessonGetUserAttempt200ResponseUserstats) HasGradeinfo() bool {
	if o != nil && !IsNil(o.Gradeinfo) {
		return true
	}

	return false
}

// SetGradeinfo gets a reference to the given ModLessonGetUserAttempt200ResponseUserstatsGradeinfo and assigns it to the Gradeinfo field.
func (o *ModLessonGetUserAttempt200ResponseUserstats) SetGradeinfo(v ModLessonGetUserAttempt200ResponseUserstatsGradeinfo) {
	o.Gradeinfo = &v
}

// GetTimetotake returns the Timetotake field value
func (o *ModLessonGetUserAttempt200ResponseUserstats) GetTimetotake() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Timetotake
}

// GetTimetotakeOk returns a tuple with the Timetotake field value
// and a boolean to check if the value has been set.
func (o *ModLessonGetUserAttempt200ResponseUserstats) GetTimetotakeOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Timetotake, true
}

// SetTimetotake sets field value
func (o *ModLessonGetUserAttempt200ResponseUserstats) SetTimetotake(v int32) {
	o.Timetotake = v
}

func (o ModLessonGetUserAttempt200ResponseUserstats) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModLessonGetUserAttempt200ResponseUserstats) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["completed"] = o.Completed
	toSerialize["grade"] = o.Grade
	if !IsNil(o.Gradeinfo) {
		toSerialize["gradeinfo"] = o.Gradeinfo
	}
	toSerialize["timetotake"] = o.Timetotake
	return toSerialize, nil
}

func (o *ModLessonGetUserAttempt200ResponseUserstats) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"completed",
		"grade",
		"timetotake",
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

	varModLessonGetUserAttempt200ResponseUserstats := _ModLessonGetUserAttempt200ResponseUserstats{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModLessonGetUserAttempt200ResponseUserstats)

	if err != nil {
		return err
	}

	*o = ModLessonGetUserAttempt200ResponseUserstats(varModLessonGetUserAttempt200ResponseUserstats)

	return err
}

type NullableModLessonGetUserAttempt200ResponseUserstats struct {
	value *ModLessonGetUserAttempt200ResponseUserstats
	isSet bool
}

func (v NullableModLessonGetUserAttempt200ResponseUserstats) Get() *ModLessonGetUserAttempt200ResponseUserstats {
	return v.value
}

func (v *NullableModLessonGetUserAttempt200ResponseUserstats) Set(val *ModLessonGetUserAttempt200ResponseUserstats) {
	v.value = val
	v.isSet = true
}

func (v NullableModLessonGetUserAttempt200ResponseUserstats) IsSet() bool {
	return v.isSet
}

func (v *NullableModLessonGetUserAttempt200ResponseUserstats) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModLessonGetUserAttempt200ResponseUserstats(val *ModLessonGetUserAttempt200ResponseUserstats) *NullableModLessonGetUserAttempt200ResponseUserstats {
	return &NullableModLessonGetUserAttempt200ResponseUserstats{value: val, isSet: true}
}

func (v NullableModLessonGetUserAttempt200ResponseUserstats) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModLessonGetUserAttempt200ResponseUserstats) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


