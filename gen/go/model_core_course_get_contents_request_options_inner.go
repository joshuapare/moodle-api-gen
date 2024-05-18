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

// checks if the CoreCourseGetContentsRequestOptionsInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreCourseGetContentsRequestOptionsInner{}

// CoreCourseGetContentsRequestOptionsInner struct for CoreCourseGetContentsRequestOptionsInner
type CoreCourseGetContentsRequestOptionsInner struct {
	// The expected keys (value format) are:                                                 excludemodules (bool) Do not return modules, return only the sections structure                                                 excludecontents (bool) Do not return module contents (i.e: files inside a resource)                                                 includestealthmodules (bool) Return stealth modules for students in a special                                                     section (with id -1)                                                 sectionid (int) Return only this section                                                 sectionnumber (int) Return only this section with number (order)                                                 cmid (int) Return only this module information (among the whole sections structure)                                                 modname (string) Return only modules with this name \"label, forum, etc...\"                                                 modid (int) Return only the module with this id (to be used with modname
	Name *string `json:"name,omitempty"`
	// the value of the option,                                                                     this param is personaly validated in the external function.
	Value *string `json:"value,omitempty"`
}

// NewCoreCourseGetContentsRequestOptionsInner instantiates a new CoreCourseGetContentsRequestOptionsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreCourseGetContentsRequestOptionsInner() *CoreCourseGetContentsRequestOptionsInner {
	this := CoreCourseGetContentsRequestOptionsInner{}
	var name string = "null"
	this.Name = &name
	var value string = "null"
	this.Value = &value
	return &this
}

// NewCoreCourseGetContentsRequestOptionsInnerWithDefaults instantiates a new CoreCourseGetContentsRequestOptionsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreCourseGetContentsRequestOptionsInnerWithDefaults() *CoreCourseGetContentsRequestOptionsInner {
	this := CoreCourseGetContentsRequestOptionsInner{}
	var name string = "null"
	this.Name = &name
	var value string = "null"
	this.Value = &value
	return &this
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *CoreCourseGetContentsRequestOptionsInner) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetContentsRequestOptionsInner) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *CoreCourseGetContentsRequestOptionsInner) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *CoreCourseGetContentsRequestOptionsInner) SetName(v string) {
	o.Name = &v
}

// GetValue returns the Value field value if set, zero value otherwise.
func (o *CoreCourseGetContentsRequestOptionsInner) GetValue() string {
	if o == nil || IsNil(o.Value) {
		var ret string
		return ret
	}
	return *o.Value
}

// GetValueOk returns a tuple with the Value field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetContentsRequestOptionsInner) GetValueOk() (*string, bool) {
	if o == nil || IsNil(o.Value) {
		return nil, false
	}
	return o.Value, true
}

// HasValue returns a boolean if a field has been set.
func (o *CoreCourseGetContentsRequestOptionsInner) HasValue() bool {
	if o != nil && !IsNil(o.Value) {
		return true
	}

	return false
}

// SetValue gets a reference to the given string and assigns it to the Value field.
func (o *CoreCourseGetContentsRequestOptionsInner) SetValue(v string) {
	o.Value = &v
}

func (o CoreCourseGetContentsRequestOptionsInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreCourseGetContentsRequestOptionsInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !IsNil(o.Value) {
		toSerialize["value"] = o.Value
	}
	return toSerialize, nil
}

type NullableCoreCourseGetContentsRequestOptionsInner struct {
	value *CoreCourseGetContentsRequestOptionsInner
	isSet bool
}

func (v NullableCoreCourseGetContentsRequestOptionsInner) Get() *CoreCourseGetContentsRequestOptionsInner {
	return v.value
}

func (v *NullableCoreCourseGetContentsRequestOptionsInner) Set(val *CoreCourseGetContentsRequestOptionsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreCourseGetContentsRequestOptionsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreCourseGetContentsRequestOptionsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreCourseGetContentsRequestOptionsInner(val *CoreCourseGetContentsRequestOptionsInner) *NullableCoreCourseGetContentsRequestOptionsInner {
	return &NullableCoreCourseGetContentsRequestOptionsInner{value: val, isSet: true}
}

func (v NullableCoreCourseGetContentsRequestOptionsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreCourseGetContentsRequestOptionsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


