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

// checks if the ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner{}

// ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner struct for ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner
type ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner struct {
	// option name
	Name *string `json:"name,omitempty"`
	// option value
	Value *int32 `json:"value,omitempty"`
}

// NewModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner instantiates a new ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner() *ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner {
	this := ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner{}
	return &this
}

// NewModQuizGetCombinedReviewOptions200ResponseSomeoptionsInnerWithDefaults instantiates a new ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModQuizGetCombinedReviewOptions200ResponseSomeoptionsInnerWithDefaults() *ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner {
	this := ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner{}
	return &this
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner) SetName(v string) {
	o.Name = &v
}

// GetValue returns the Value field value if set, zero value otherwise.
func (o *ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner) GetValue() int32 {
	if o == nil || IsNil(o.Value) {
		var ret int32
		return ret
	}
	return *o.Value
}

// GetValueOk returns a tuple with the Value field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner) GetValueOk() (*int32, bool) {
	if o == nil || IsNil(o.Value) {
		return nil, false
	}
	return o.Value, true
}

// HasValue returns a boolean if a field has been set.
func (o *ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner) HasValue() bool {
	if o != nil && !IsNil(o.Value) {
		return true
	}

	return false
}

// SetValue gets a reference to the given int32 and assigns it to the Value field.
func (o *ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner) SetValue(v int32) {
	o.Value = &v
}

func (o ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !IsNil(o.Value) {
		toSerialize["value"] = o.Value
	}
	return toSerialize, nil
}

type NullableModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner struct {
	value *ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner
	isSet bool
}

func (v NullableModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner) Get() *ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner {
	return v.value
}

func (v *NullableModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner) Set(val *ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner(val *ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner) *NullableModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner {
	return &NullableModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner{value: val, isSet: true}
}

func (v NullableModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


