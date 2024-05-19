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

// checks if the ToolMobileGetContent200ResponseRestrict type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ToolMobileGetContent200ResponseRestrict{}

// ToolMobileGetContent200ResponseRestrict struct for ToolMobileGetContent200ResponseRestrict
type ToolMobileGetContent200ResponseRestrict struct {
	Courses []map[string]interface{} `json:"courses,omitempty"`
	Users []map[string]interface{} `json:"users,omitempty"`
}

// NewToolMobileGetContent200ResponseRestrict instantiates a new ToolMobileGetContent200ResponseRestrict object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewToolMobileGetContent200ResponseRestrict() *ToolMobileGetContent200ResponseRestrict {
	this := ToolMobileGetContent200ResponseRestrict{}
	return &this
}

// NewToolMobileGetContent200ResponseRestrictWithDefaults instantiates a new ToolMobileGetContent200ResponseRestrict object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewToolMobileGetContent200ResponseRestrictWithDefaults() *ToolMobileGetContent200ResponseRestrict {
	this := ToolMobileGetContent200ResponseRestrict{}
	return &this
}

// GetCourses returns the Courses field value if set, zero value otherwise.
func (o *ToolMobileGetContent200ResponseRestrict) GetCourses() []map[string]interface{} {
	if o == nil || IsNil(o.Courses) {
		var ret []map[string]interface{}
		return ret
	}
	return o.Courses
}

// GetCoursesOk returns a tuple with the Courses field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ToolMobileGetContent200ResponseRestrict) GetCoursesOk() ([]map[string]interface{}, bool) {
	if o == nil || IsNil(o.Courses) {
		return nil, false
	}
	return o.Courses, true
}

// HasCourses returns a boolean if a field has been set.
func (o *ToolMobileGetContent200ResponseRestrict) HasCourses() bool {
	if o != nil && !IsNil(o.Courses) {
		return true
	}

	return false
}

// SetCourses gets a reference to the given []map[string]interface{} and assigns it to the Courses field.
func (o *ToolMobileGetContent200ResponseRestrict) SetCourses(v []map[string]interface{}) {
	o.Courses = v
}

// GetUsers returns the Users field value if set, zero value otherwise.
func (o *ToolMobileGetContent200ResponseRestrict) GetUsers() []map[string]interface{} {
	if o == nil || IsNil(o.Users) {
		var ret []map[string]interface{}
		return ret
	}
	return o.Users
}

// GetUsersOk returns a tuple with the Users field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ToolMobileGetContent200ResponseRestrict) GetUsersOk() ([]map[string]interface{}, bool) {
	if o == nil || IsNil(o.Users) {
		return nil, false
	}
	return o.Users, true
}

// HasUsers returns a boolean if a field has been set.
func (o *ToolMobileGetContent200ResponseRestrict) HasUsers() bool {
	if o != nil && !IsNil(o.Users) {
		return true
	}

	return false
}

// SetUsers gets a reference to the given []map[string]interface{} and assigns it to the Users field.
func (o *ToolMobileGetContent200ResponseRestrict) SetUsers(v []map[string]interface{}) {
	o.Users = v
}

func (o ToolMobileGetContent200ResponseRestrict) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ToolMobileGetContent200ResponseRestrict) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Courses) {
		toSerialize["courses"] = o.Courses
	}
	if !IsNil(o.Users) {
		toSerialize["users"] = o.Users
	}
	return toSerialize, nil
}

type NullableToolMobileGetContent200ResponseRestrict struct {
	value *ToolMobileGetContent200ResponseRestrict
	isSet bool
}

func (v NullableToolMobileGetContent200ResponseRestrict) Get() *ToolMobileGetContent200ResponseRestrict {
	return v.value
}

func (v *NullableToolMobileGetContent200ResponseRestrict) Set(val *ToolMobileGetContent200ResponseRestrict) {
	v.value = val
	v.isSet = true
}

func (v NullableToolMobileGetContent200ResponseRestrict) IsSet() bool {
	return v.isSet
}

func (v *NullableToolMobileGetContent200ResponseRestrict) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableToolMobileGetContent200ResponseRestrict(val *ToolMobileGetContent200ResponseRestrict) *NullableToolMobileGetContent200ResponseRestrict {
	return &NullableToolMobileGetContent200ResponseRestrict{value: val, isSet: true}
}

func (v NullableToolMobileGetContent200ResponseRestrict) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableToolMobileGetContent200ResponseRestrict) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


