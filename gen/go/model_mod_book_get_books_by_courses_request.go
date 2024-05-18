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

// checks if the ModBookGetBooksByCoursesRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModBookGetBooksByCoursesRequest{}

// ModBookGetBooksByCoursesRequest struct for ModBookGetBooksByCoursesRequest
type ModBookGetBooksByCoursesRequest struct {
	Courseids []map[string]interface{} `json:"courseids,omitempty"`
}

// NewModBookGetBooksByCoursesRequest instantiates a new ModBookGetBooksByCoursesRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModBookGetBooksByCoursesRequest() *ModBookGetBooksByCoursesRequest {
	this := ModBookGetBooksByCoursesRequest{}
	return &this
}

// NewModBookGetBooksByCoursesRequestWithDefaults instantiates a new ModBookGetBooksByCoursesRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModBookGetBooksByCoursesRequestWithDefaults() *ModBookGetBooksByCoursesRequest {
	this := ModBookGetBooksByCoursesRequest{}
	return &this
}

// GetCourseids returns the Courseids field value if set, zero value otherwise.
func (o *ModBookGetBooksByCoursesRequest) GetCourseids() []map[string]interface{} {
	if o == nil || IsNil(o.Courseids) {
		var ret []map[string]interface{}
		return ret
	}
	return o.Courseids
}

// GetCourseidsOk returns a tuple with the Courseids field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModBookGetBooksByCoursesRequest) GetCourseidsOk() ([]map[string]interface{}, bool) {
	if o == nil || IsNil(o.Courseids) {
		return nil, false
	}
	return o.Courseids, true
}

// HasCourseids returns a boolean if a field has been set.
func (o *ModBookGetBooksByCoursesRequest) HasCourseids() bool {
	if o != nil && !IsNil(o.Courseids) {
		return true
	}

	return false
}

// SetCourseids gets a reference to the given []map[string]interface{} and assigns it to the Courseids field.
func (o *ModBookGetBooksByCoursesRequest) SetCourseids(v []map[string]interface{}) {
	o.Courseids = v
}

func (o ModBookGetBooksByCoursesRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModBookGetBooksByCoursesRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Courseids) {
		toSerialize["courseids"] = o.Courseids
	}
	return toSerialize, nil
}

type NullableModBookGetBooksByCoursesRequest struct {
	value *ModBookGetBooksByCoursesRequest
	isSet bool
}

func (v NullableModBookGetBooksByCoursesRequest) Get() *ModBookGetBooksByCoursesRequest {
	return v.value
}

func (v *NullableModBookGetBooksByCoursesRequest) Set(val *ModBookGetBooksByCoursesRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableModBookGetBooksByCoursesRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableModBookGetBooksByCoursesRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModBookGetBooksByCoursesRequest(val *ModBookGetBooksByCoursesRequest) *NullableModBookGetBooksByCoursesRequest {
	return &NullableModBookGetBooksByCoursesRequest{value: val, isSet: true}
}

func (v NullableModBookGetBooksByCoursesRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModBookGetBooksByCoursesRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

