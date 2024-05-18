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

// checks if the ModSurveySubmitAnswersRequestAnswersInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModSurveySubmitAnswersRequestAnswersInner{}

// ModSurveySubmitAnswersRequestAnswersInner struct for ModSurveySubmitAnswersRequestAnswersInner
type ModSurveySubmitAnswersRequestAnswersInner struct {
	// Answer key
	Key *string `json:"key,omitempty"`
	// Answer value
	Value *string `json:"value,omitempty"`
}

// NewModSurveySubmitAnswersRequestAnswersInner instantiates a new ModSurveySubmitAnswersRequestAnswersInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModSurveySubmitAnswersRequestAnswersInner() *ModSurveySubmitAnswersRequestAnswersInner {
	this := ModSurveySubmitAnswersRequestAnswersInner{}
	var key string = "null"
	this.Key = &key
	var value string = "null"
	this.Value = &value
	return &this
}

// NewModSurveySubmitAnswersRequestAnswersInnerWithDefaults instantiates a new ModSurveySubmitAnswersRequestAnswersInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModSurveySubmitAnswersRequestAnswersInnerWithDefaults() *ModSurveySubmitAnswersRequestAnswersInner {
	this := ModSurveySubmitAnswersRequestAnswersInner{}
	var key string = "null"
	this.Key = &key
	var value string = "null"
	this.Value = &value
	return &this
}

// GetKey returns the Key field value if set, zero value otherwise.
func (o *ModSurveySubmitAnswersRequestAnswersInner) GetKey() string {
	if o == nil || IsNil(o.Key) {
		var ret string
		return ret
	}
	return *o.Key
}

// GetKeyOk returns a tuple with the Key field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModSurveySubmitAnswersRequestAnswersInner) GetKeyOk() (*string, bool) {
	if o == nil || IsNil(o.Key) {
		return nil, false
	}
	return o.Key, true
}

// HasKey returns a boolean if a field has been set.
func (o *ModSurveySubmitAnswersRequestAnswersInner) HasKey() bool {
	if o != nil && !IsNil(o.Key) {
		return true
	}

	return false
}

// SetKey gets a reference to the given string and assigns it to the Key field.
func (o *ModSurveySubmitAnswersRequestAnswersInner) SetKey(v string) {
	o.Key = &v
}

// GetValue returns the Value field value if set, zero value otherwise.
func (o *ModSurveySubmitAnswersRequestAnswersInner) GetValue() string {
	if o == nil || IsNil(o.Value) {
		var ret string
		return ret
	}
	return *o.Value
}

// GetValueOk returns a tuple with the Value field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModSurveySubmitAnswersRequestAnswersInner) GetValueOk() (*string, bool) {
	if o == nil || IsNil(o.Value) {
		return nil, false
	}
	return o.Value, true
}

// HasValue returns a boolean if a field has been set.
func (o *ModSurveySubmitAnswersRequestAnswersInner) HasValue() bool {
	if o != nil && !IsNil(o.Value) {
		return true
	}

	return false
}

// SetValue gets a reference to the given string and assigns it to the Value field.
func (o *ModSurveySubmitAnswersRequestAnswersInner) SetValue(v string) {
	o.Value = &v
}

func (o ModSurveySubmitAnswersRequestAnswersInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModSurveySubmitAnswersRequestAnswersInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Key) {
		toSerialize["key"] = o.Key
	}
	if !IsNil(o.Value) {
		toSerialize["value"] = o.Value
	}
	return toSerialize, nil
}

type NullableModSurveySubmitAnswersRequestAnswersInner struct {
	value *ModSurveySubmitAnswersRequestAnswersInner
	isSet bool
}

func (v NullableModSurveySubmitAnswersRequestAnswersInner) Get() *ModSurveySubmitAnswersRequestAnswersInner {
	return v.value
}

func (v *NullableModSurveySubmitAnswersRequestAnswersInner) Set(val *ModSurveySubmitAnswersRequestAnswersInner) {
	v.value = val
	v.isSet = true
}

func (v NullableModSurveySubmitAnswersRequestAnswersInner) IsSet() bool {
	return v.isSet
}

func (v *NullableModSurveySubmitAnswersRequestAnswersInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModSurveySubmitAnswersRequestAnswersInner(val *ModSurveySubmitAnswersRequestAnswersInner) *NullableModSurveySubmitAnswersRequestAnswersInner {
	return &NullableModSurveySubmitAnswersRequestAnswersInner{value: val, isSet: true}
}

func (v NullableModSurveySubmitAnswersRequestAnswersInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModSurveySubmitAnswersRequestAnswersInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


