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

// checks if the CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner{}

// CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner struct for CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner
type CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner struct {
	// Gradable area name
	Area *string `json:"area,omitempty"`
	// Grading method
	Method *string `json:"method,omitempty"`
}

// NewCoreCourseGetCourseModule200ResponseCmAdvancedgradingInner instantiates a new CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreCourseGetCourseModule200ResponseCmAdvancedgradingInner() *CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner {
	this := CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner{}
	var area string = "null"
	this.Area = &area
	var method string = "null"
	this.Method = &method
	return &this
}

// NewCoreCourseGetCourseModule200ResponseCmAdvancedgradingInnerWithDefaults instantiates a new CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreCourseGetCourseModule200ResponseCmAdvancedgradingInnerWithDefaults() *CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner {
	this := CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner{}
	var area string = "null"
	this.Area = &area
	var method string = "null"
	this.Method = &method
	return &this
}

// GetArea returns the Area field value if set, zero value otherwise.
func (o *CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner) GetArea() string {
	if o == nil || IsNil(o.Area) {
		var ret string
		return ret
	}
	return *o.Area
}

// GetAreaOk returns a tuple with the Area field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner) GetAreaOk() (*string, bool) {
	if o == nil || IsNil(o.Area) {
		return nil, false
	}
	return o.Area, true
}

// HasArea returns a boolean if a field has been set.
func (o *CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner) HasArea() bool {
	if o != nil && !IsNil(o.Area) {
		return true
	}

	return false
}

// SetArea gets a reference to the given string and assigns it to the Area field.
func (o *CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner) SetArea(v string) {
	o.Area = &v
}

// GetMethod returns the Method field value if set, zero value otherwise.
func (o *CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner) GetMethod() string {
	if o == nil || IsNil(o.Method) {
		var ret string
		return ret
	}
	return *o.Method
}

// GetMethodOk returns a tuple with the Method field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner) GetMethodOk() (*string, bool) {
	if o == nil || IsNil(o.Method) {
		return nil, false
	}
	return o.Method, true
}

// HasMethod returns a boolean if a field has been set.
func (o *CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner) HasMethod() bool {
	if o != nil && !IsNil(o.Method) {
		return true
	}

	return false
}

// SetMethod gets a reference to the given string and assigns it to the Method field.
func (o *CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner) SetMethod(v string) {
	o.Method = &v
}

func (o CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Area) {
		toSerialize["area"] = o.Area
	}
	if !IsNil(o.Method) {
		toSerialize["method"] = o.Method
	}
	return toSerialize, nil
}

type NullableCoreCourseGetCourseModule200ResponseCmAdvancedgradingInner struct {
	value *CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner
	isSet bool
}

func (v NullableCoreCourseGetCourseModule200ResponseCmAdvancedgradingInner) Get() *CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner {
	return v.value
}

func (v *NullableCoreCourseGetCourseModule200ResponseCmAdvancedgradingInner) Set(val *CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreCourseGetCourseModule200ResponseCmAdvancedgradingInner) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreCourseGetCourseModule200ResponseCmAdvancedgradingInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreCourseGetCourseModule200ResponseCmAdvancedgradingInner(val *CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner) *NullableCoreCourseGetCourseModule200ResponseCmAdvancedgradingInner {
	return &NullableCoreCourseGetCourseModule200ResponseCmAdvancedgradingInner{value: val, isSet: true}
}

func (v NullableCoreCourseGetCourseModule200ResponseCmAdvancedgradingInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreCourseGetCourseModule200ResponseCmAdvancedgradingInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


