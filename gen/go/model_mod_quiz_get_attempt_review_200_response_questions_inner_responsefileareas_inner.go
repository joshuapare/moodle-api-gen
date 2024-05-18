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

// checks if the ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner{}

// ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner struct for ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner
type ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner struct {
	// File area name
	Area *string `json:"area,omitempty"`
	Files []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner `json:"files,omitempty"`
}

// NewModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner instantiates a new ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner() *ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner {
	this := ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner{}
	return &this
}

// NewModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInnerWithDefaults instantiates a new ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInnerWithDefaults() *ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner {
	this := ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner{}
	return &this
}

// GetArea returns the Area field value if set, zero value otherwise.
func (o *ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner) GetArea() string {
	if o == nil || IsNil(o.Area) {
		var ret string
		return ret
	}
	return *o.Area
}

// GetAreaOk returns a tuple with the Area field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner) GetAreaOk() (*string, bool) {
	if o == nil || IsNil(o.Area) {
		return nil, false
	}
	return o.Area, true
}

// HasArea returns a boolean if a field has been set.
func (o *ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner) HasArea() bool {
	if o != nil && !IsNil(o.Area) {
		return true
	}

	return false
}

// SetArea gets a reference to the given string and assigns it to the Area field.
func (o *ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner) SetArea(v string) {
	o.Area = &v
}

// GetFiles returns the Files field value if set, zero value otherwise.
func (o *ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner) GetFiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner {
	if o == nil || IsNil(o.Files) {
		var ret []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner
		return ret
	}
	return o.Files
}

// GetFilesOk returns a tuple with the Files field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner) GetFilesOk() ([]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool) {
	if o == nil || IsNil(o.Files) {
		return nil, false
	}
	return o.Files, true
}

// HasFiles returns a boolean if a field has been set.
func (o *ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner) HasFiles() bool {
	if o != nil && !IsNil(o.Files) {
		return true
	}

	return false
}

// SetFiles gets a reference to the given []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner and assigns it to the Files field.
func (o *ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner) SetFiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner) {
	o.Files = v
}

func (o ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Area) {
		toSerialize["area"] = o.Area
	}
	if !IsNil(o.Files) {
		toSerialize["files"] = o.Files
	}
	return toSerialize, nil
}

type NullableModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner struct {
	value *ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner
	isSet bool
}

func (v NullableModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner) Get() *ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner {
	return v.value
}

func (v *NullableModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner) Set(val *ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner) {
	v.value = val
	v.isSet = true
}

func (v NullableModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner) IsSet() bool {
	return v.isSet
}

func (v *NullableModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner(val *ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner) *NullableModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner {
	return &NullableModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner{value: val, isSet: true}
}

func (v NullableModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


