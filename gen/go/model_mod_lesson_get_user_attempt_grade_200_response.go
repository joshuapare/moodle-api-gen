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

// checks if the ModLessonGetUserAttemptGrade200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModLessonGetUserAttemptGrade200Response{}

// ModLessonGetUserAttemptGrade200Response struct for ModLessonGetUserAttemptGrade200Response
type ModLessonGetUserAttemptGrade200Response struct {
	Grade ModLessonGetUserAttemptGrade200ResponseGrade `json:"grade"`
	Warnings []AuthEmailSignupUser200ResponseWarningsInner `json:"warnings,omitempty"`
}

type _ModLessonGetUserAttemptGrade200Response ModLessonGetUserAttemptGrade200Response

// NewModLessonGetUserAttemptGrade200Response instantiates a new ModLessonGetUserAttemptGrade200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModLessonGetUserAttemptGrade200Response(grade ModLessonGetUserAttemptGrade200ResponseGrade) *ModLessonGetUserAttemptGrade200Response {
	this := ModLessonGetUserAttemptGrade200Response{}
	this.Grade = grade
	return &this
}

// NewModLessonGetUserAttemptGrade200ResponseWithDefaults instantiates a new ModLessonGetUserAttemptGrade200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModLessonGetUserAttemptGrade200ResponseWithDefaults() *ModLessonGetUserAttemptGrade200Response {
	this := ModLessonGetUserAttemptGrade200Response{}
	return &this
}

// GetGrade returns the Grade field value
func (o *ModLessonGetUserAttemptGrade200Response) GetGrade() ModLessonGetUserAttemptGrade200ResponseGrade {
	if o == nil {
		var ret ModLessonGetUserAttemptGrade200ResponseGrade
		return ret
	}

	return o.Grade
}

// GetGradeOk returns a tuple with the Grade field value
// and a boolean to check if the value has been set.
func (o *ModLessonGetUserAttemptGrade200Response) GetGradeOk() (*ModLessonGetUserAttemptGrade200ResponseGrade, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Grade, true
}

// SetGrade sets field value
func (o *ModLessonGetUserAttemptGrade200Response) SetGrade(v ModLessonGetUserAttemptGrade200ResponseGrade) {
	o.Grade = v
}

// GetWarnings returns the Warnings field value if set, zero value otherwise.
func (o *ModLessonGetUserAttemptGrade200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner {
	if o == nil || IsNil(o.Warnings) {
		var ret []AuthEmailSignupUser200ResponseWarningsInner
		return ret
	}
	return o.Warnings
}

// GetWarningsOk returns a tuple with the Warnings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModLessonGetUserAttemptGrade200Response) GetWarningsOk() ([]AuthEmailSignupUser200ResponseWarningsInner, bool) {
	if o == nil || IsNil(o.Warnings) {
		return nil, false
	}
	return o.Warnings, true
}

// HasWarnings returns a boolean if a field has been set.
func (o *ModLessonGetUserAttemptGrade200Response) HasWarnings() bool {
	if o != nil && !IsNil(o.Warnings) {
		return true
	}

	return false
}

// SetWarnings gets a reference to the given []AuthEmailSignupUser200ResponseWarningsInner and assigns it to the Warnings field.
func (o *ModLessonGetUserAttemptGrade200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner) {
	o.Warnings = v
}

func (o ModLessonGetUserAttemptGrade200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModLessonGetUserAttemptGrade200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["grade"] = o.Grade
	if !IsNil(o.Warnings) {
		toSerialize["warnings"] = o.Warnings
	}
	return toSerialize, nil
}

func (o *ModLessonGetUserAttemptGrade200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"grade",
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

	varModLessonGetUserAttemptGrade200Response := _ModLessonGetUserAttemptGrade200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModLessonGetUserAttemptGrade200Response)

	if err != nil {
		return err
	}

	*o = ModLessonGetUserAttemptGrade200Response(varModLessonGetUserAttemptGrade200Response)

	return err
}

type NullableModLessonGetUserAttemptGrade200Response struct {
	value *ModLessonGetUserAttemptGrade200Response
	isSet bool
}

func (v NullableModLessonGetUserAttemptGrade200Response) Get() *ModLessonGetUserAttemptGrade200Response {
	return v.value
}

func (v *NullableModLessonGetUserAttemptGrade200Response) Set(val *ModLessonGetUserAttemptGrade200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableModLessonGetUserAttemptGrade200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableModLessonGetUserAttemptGrade200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModLessonGetUserAttemptGrade200Response(val *ModLessonGetUserAttemptGrade200Response) *NullableModLessonGetUserAttemptGrade200Response {
	return &NullableModLessonGetUserAttemptGrade200Response{value: val, isSet: true}
}

func (v NullableModLessonGetUserAttemptGrade200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModLessonGetUserAttemptGrade200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


