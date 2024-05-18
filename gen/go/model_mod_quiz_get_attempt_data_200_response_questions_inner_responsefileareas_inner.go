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

// checks if the ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner{}

// ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner struct for ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner
type ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner struct {
	// File area name
	Area *string `json:"area,omitempty"`
	Files []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner `json:"files,omitempty"`
}

// NewModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner instantiates a new ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner() *ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner {
	this := ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner{}
	var area string = "null"
	this.Area = &area
	return &this
}

// NewModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInnerWithDefaults instantiates a new ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInnerWithDefaults() *ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner {
	this := ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner{}
	var area string = "null"
	this.Area = &area
	return &this
}

// GetArea returns the Area field value if set, zero value otherwise.
func (o *ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner) GetArea() string {
	if o == nil || IsNil(o.Area) {
		var ret string
		return ret
	}
	return *o.Area
}

// GetAreaOk returns a tuple with the Area field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner) GetAreaOk() (*string, bool) {
	if o == nil || IsNil(o.Area) {
		return nil, false
	}
	return o.Area, true
}

// HasArea returns a boolean if a field has been set.
func (o *ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner) HasArea() bool {
	if o != nil && !IsNil(o.Area) {
		return true
	}

	return false
}

// SetArea gets a reference to the given string and assigns it to the Area field.
func (o *ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner) SetArea(v string) {
	o.Area = &v
}

// GetFiles returns the Files field value if set, zero value otherwise.
func (o *ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner) GetFiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner {
	if o == nil || IsNil(o.Files) {
		var ret []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner
		return ret
	}
	return o.Files
}

// GetFilesOk returns a tuple with the Files field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner) GetFilesOk() ([]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool) {
	if o == nil || IsNil(o.Files) {
		return nil, false
	}
	return o.Files, true
}

// HasFiles returns a boolean if a field has been set.
func (o *ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner) HasFiles() bool {
	if o != nil && !IsNil(o.Files) {
		return true
	}

	return false
}

// SetFiles gets a reference to the given []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner and assigns it to the Files field.
func (o *ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner) SetFiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner) {
	o.Files = v
}

func (o ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Area) {
		toSerialize["area"] = o.Area
	}
	if !IsNil(o.Files) {
		toSerialize["files"] = o.Files
	}
	return toSerialize, nil
}

type NullableModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner struct {
	value *ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner
	isSet bool
}

func (v NullableModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner) Get() *ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner {
	return v.value
}

func (v *NullableModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner) Set(val *ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner) {
	v.value = val
	v.isSet = true
}

func (v NullableModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner) IsSet() bool {
	return v.isSet
}

func (v *NullableModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner(val *ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner) *NullableModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner {
	return &NullableModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner{value: val, isSet: true}
}

func (v NullableModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

