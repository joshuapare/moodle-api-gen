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

// checks if the CoreCourseGetCoursesByFieldRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreCourseGetCoursesByFieldRequest{}

// CoreCourseGetCoursesByFieldRequest struct for CoreCourseGetCoursesByFieldRequest
type CoreCourseGetCoursesByFieldRequest struct {
	// The field to search can be left empty for all courses or:                     id: course id                     ids: comma separated course ids                     shortname: course short name                     idnumber: course id number                     category: category id the course belongs to                 
	Field *string `json:"field,omitempty"`
	// The value to match
	Value *string `json:"value,omitempty"`
}

// NewCoreCourseGetCoursesByFieldRequest instantiates a new CoreCourseGetCoursesByFieldRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreCourseGetCoursesByFieldRequest() *CoreCourseGetCoursesByFieldRequest {
	this := CoreCourseGetCoursesByFieldRequest{}
	var field string = ""
	this.Field = &field
	var value string = ""
	this.Value = &value
	return &this
}

// NewCoreCourseGetCoursesByFieldRequestWithDefaults instantiates a new CoreCourseGetCoursesByFieldRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreCourseGetCoursesByFieldRequestWithDefaults() *CoreCourseGetCoursesByFieldRequest {
	this := CoreCourseGetCoursesByFieldRequest{}
	var field string = ""
	this.Field = &field
	var value string = ""
	this.Value = &value
	return &this
}

// GetField returns the Field field value if set, zero value otherwise.
func (o *CoreCourseGetCoursesByFieldRequest) GetField() string {
	if o == nil || IsNil(o.Field) {
		var ret string
		return ret
	}
	return *o.Field
}

// GetFieldOk returns a tuple with the Field field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetCoursesByFieldRequest) GetFieldOk() (*string, bool) {
	if o == nil || IsNil(o.Field) {
		return nil, false
	}
	return o.Field, true
}

// HasField returns a boolean if a field has been set.
func (o *CoreCourseGetCoursesByFieldRequest) HasField() bool {
	if o != nil && !IsNil(o.Field) {
		return true
	}

	return false
}

// SetField gets a reference to the given string and assigns it to the Field field.
func (o *CoreCourseGetCoursesByFieldRequest) SetField(v string) {
	o.Field = &v
}

// GetValue returns the Value field value if set, zero value otherwise.
func (o *CoreCourseGetCoursesByFieldRequest) GetValue() string {
	if o == nil || IsNil(o.Value) {
		var ret string
		return ret
	}
	return *o.Value
}

// GetValueOk returns a tuple with the Value field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetCoursesByFieldRequest) GetValueOk() (*string, bool) {
	if o == nil || IsNil(o.Value) {
		return nil, false
	}
	return o.Value, true
}

// HasValue returns a boolean if a field has been set.
func (o *CoreCourseGetCoursesByFieldRequest) HasValue() bool {
	if o != nil && !IsNil(o.Value) {
		return true
	}

	return false
}

// SetValue gets a reference to the given string and assigns it to the Value field.
func (o *CoreCourseGetCoursesByFieldRequest) SetValue(v string) {
	o.Value = &v
}

func (o CoreCourseGetCoursesByFieldRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreCourseGetCoursesByFieldRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Field) {
		toSerialize["field"] = o.Field
	}
	if !IsNil(o.Value) {
		toSerialize["value"] = o.Value
	}
	return toSerialize, nil
}

type NullableCoreCourseGetCoursesByFieldRequest struct {
	value *CoreCourseGetCoursesByFieldRequest
	isSet bool
}

func (v NullableCoreCourseGetCoursesByFieldRequest) Get() *CoreCourseGetCoursesByFieldRequest {
	return v.value
}

func (v *NullableCoreCourseGetCoursesByFieldRequest) Set(val *CoreCourseGetCoursesByFieldRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreCourseGetCoursesByFieldRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreCourseGetCoursesByFieldRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreCourseGetCoursesByFieldRequest(val *CoreCourseGetCoursesByFieldRequest) *NullableCoreCourseGetCoursesByFieldRequest {
	return &NullableCoreCourseGetCoursesByFieldRequest{value: val, isSet: true}
}

func (v NullableCoreCourseGetCoursesByFieldRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreCourseGetCoursesByFieldRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


