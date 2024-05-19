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

// checks if the ModLessonGetUserGrade200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModLessonGetUserGrade200Response{}

// ModLessonGetUserGrade200Response struct for ModLessonGetUserGrade200Response
type ModLessonGetUserGrade200Response struct {
	// The lesson final grade formatted
	Formattedgrade string `json:"formattedgrade"`
	// The lesson final raw grade
	Grade float32 `json:"grade"`
	Warnings []AuthEmailSignupUser200ResponseWarningsInner `json:"warnings,omitempty"`
}

type _ModLessonGetUserGrade200Response ModLessonGetUserGrade200Response

// NewModLessonGetUserGrade200Response instantiates a new ModLessonGetUserGrade200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModLessonGetUserGrade200Response(formattedgrade string, grade float32) *ModLessonGetUserGrade200Response {
	this := ModLessonGetUserGrade200Response{}
	this.Formattedgrade = formattedgrade
	this.Grade = grade
	return &this
}

// NewModLessonGetUserGrade200ResponseWithDefaults instantiates a new ModLessonGetUserGrade200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModLessonGetUserGrade200ResponseWithDefaults() *ModLessonGetUserGrade200Response {
	this := ModLessonGetUserGrade200Response{}
	var formattedgrade string = "null"
	this.Formattedgrade = formattedgrade
	var grade float32 = null
	this.Grade = grade
	return &this
}

// GetFormattedgrade returns the Formattedgrade field value
func (o *ModLessonGetUserGrade200Response) GetFormattedgrade() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Formattedgrade
}

// GetFormattedgradeOk returns a tuple with the Formattedgrade field value
// and a boolean to check if the value has been set.
func (o *ModLessonGetUserGrade200Response) GetFormattedgradeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Formattedgrade, true
}

// SetFormattedgrade sets field value
func (o *ModLessonGetUserGrade200Response) SetFormattedgrade(v string) {
	o.Formattedgrade = v
}

// GetGrade returns the Grade field value
func (o *ModLessonGetUserGrade200Response) GetGrade() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Grade
}

// GetGradeOk returns a tuple with the Grade field value
// and a boolean to check if the value has been set.
func (o *ModLessonGetUserGrade200Response) GetGradeOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Grade, true
}

// SetGrade sets field value
func (o *ModLessonGetUserGrade200Response) SetGrade(v float32) {
	o.Grade = v
}

// GetWarnings returns the Warnings field value if set, zero value otherwise.
func (o *ModLessonGetUserGrade200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner {
	if o == nil || IsNil(o.Warnings) {
		var ret []AuthEmailSignupUser200ResponseWarningsInner
		return ret
	}
	return o.Warnings
}

// GetWarningsOk returns a tuple with the Warnings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModLessonGetUserGrade200Response) GetWarningsOk() ([]AuthEmailSignupUser200ResponseWarningsInner, bool) {
	if o == nil || IsNil(o.Warnings) {
		return nil, false
	}
	return o.Warnings, true
}

// HasWarnings returns a boolean if a field has been set.
func (o *ModLessonGetUserGrade200Response) HasWarnings() bool {
	if o != nil && !IsNil(o.Warnings) {
		return true
	}

	return false
}

// SetWarnings gets a reference to the given []AuthEmailSignupUser200ResponseWarningsInner and assigns it to the Warnings field.
func (o *ModLessonGetUserGrade200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner) {
	o.Warnings = v
}

func (o ModLessonGetUserGrade200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModLessonGetUserGrade200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["formattedgrade"] = o.Formattedgrade
	toSerialize["grade"] = o.Grade
	if !IsNil(o.Warnings) {
		toSerialize["warnings"] = o.Warnings
	}
	return toSerialize, nil
}

func (o *ModLessonGetUserGrade200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"formattedgrade",
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

	varModLessonGetUserGrade200Response := _ModLessonGetUserGrade200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModLessonGetUserGrade200Response)

	if err != nil {
		return err
	}

	*o = ModLessonGetUserGrade200Response(varModLessonGetUserGrade200Response)

	return err
}

type NullableModLessonGetUserGrade200Response struct {
	value *ModLessonGetUserGrade200Response
	isSet bool
}

func (v NullableModLessonGetUserGrade200Response) Get() *ModLessonGetUserGrade200Response {
	return v.value
}

func (v *NullableModLessonGetUserGrade200Response) Set(val *ModLessonGetUserGrade200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableModLessonGetUserGrade200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableModLessonGetUserGrade200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModLessonGetUserGrade200Response(val *ModLessonGetUserGrade200Response) *NullableModLessonGetUserGrade200Response {
	return &NullableModLessonGetUserGrade200Response{value: val, isSet: true}
}

func (v NullableModLessonGetUserGrade200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModLessonGetUserGrade200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


