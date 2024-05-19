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

// checks if the ModAssignGetAssignmentsRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModAssignGetAssignmentsRequest{}

// ModAssignGetAssignmentsRequest struct for ModAssignGetAssignmentsRequest
type ModAssignGetAssignmentsRequest struct {
	Capabilities []map[string]interface{} `json:"capabilities,omitempty"`
	Courseids []map[string]interface{} `json:"courseids,omitempty"`
	// whether to return courses that the user can see                                                                     even if is not enroled in. This requires the parameter courseids                                                                     to not be empty.
	Includenotenrolledcourses *bool `json:"includenotenrolledcourses,omitempty"`
}

// NewModAssignGetAssignmentsRequest instantiates a new ModAssignGetAssignmentsRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModAssignGetAssignmentsRequest() *ModAssignGetAssignmentsRequest {
	this := ModAssignGetAssignmentsRequest{}
	var includenotenrolledcourses bool = false
	this.Includenotenrolledcourses = &includenotenrolledcourses
	return &this
}

// NewModAssignGetAssignmentsRequestWithDefaults instantiates a new ModAssignGetAssignmentsRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModAssignGetAssignmentsRequestWithDefaults() *ModAssignGetAssignmentsRequest {
	this := ModAssignGetAssignmentsRequest{}
	var includenotenrolledcourses bool = false
	this.Includenotenrolledcourses = &includenotenrolledcourses
	return &this
}

// GetCapabilities returns the Capabilities field value if set, zero value otherwise.
func (o *ModAssignGetAssignmentsRequest) GetCapabilities() []map[string]interface{} {
	if o == nil || IsNil(o.Capabilities) {
		var ret []map[string]interface{}
		return ret
	}
	return o.Capabilities
}

// GetCapabilitiesOk returns a tuple with the Capabilities field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignGetAssignmentsRequest) GetCapabilitiesOk() ([]map[string]interface{}, bool) {
	if o == nil || IsNil(o.Capabilities) {
		return nil, false
	}
	return o.Capabilities, true
}

// HasCapabilities returns a boolean if a field has been set.
func (o *ModAssignGetAssignmentsRequest) HasCapabilities() bool {
	if o != nil && !IsNil(o.Capabilities) {
		return true
	}

	return false
}

// SetCapabilities gets a reference to the given []map[string]interface{} and assigns it to the Capabilities field.
func (o *ModAssignGetAssignmentsRequest) SetCapabilities(v []map[string]interface{}) {
	o.Capabilities = v
}

// GetCourseids returns the Courseids field value if set, zero value otherwise.
func (o *ModAssignGetAssignmentsRequest) GetCourseids() []map[string]interface{} {
	if o == nil || IsNil(o.Courseids) {
		var ret []map[string]interface{}
		return ret
	}
	return o.Courseids
}

// GetCourseidsOk returns a tuple with the Courseids field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignGetAssignmentsRequest) GetCourseidsOk() ([]map[string]interface{}, bool) {
	if o == nil || IsNil(o.Courseids) {
		return nil, false
	}
	return o.Courseids, true
}

// HasCourseids returns a boolean if a field has been set.
func (o *ModAssignGetAssignmentsRequest) HasCourseids() bool {
	if o != nil && !IsNil(o.Courseids) {
		return true
	}

	return false
}

// SetCourseids gets a reference to the given []map[string]interface{} and assigns it to the Courseids field.
func (o *ModAssignGetAssignmentsRequest) SetCourseids(v []map[string]interface{}) {
	o.Courseids = v
}

// GetIncludenotenrolledcourses returns the Includenotenrolledcourses field value if set, zero value otherwise.
func (o *ModAssignGetAssignmentsRequest) GetIncludenotenrolledcourses() bool {
	if o == nil || IsNil(o.Includenotenrolledcourses) {
		var ret bool
		return ret
	}
	return *o.Includenotenrolledcourses
}

// GetIncludenotenrolledcoursesOk returns a tuple with the Includenotenrolledcourses field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignGetAssignmentsRequest) GetIncludenotenrolledcoursesOk() (*bool, bool) {
	if o == nil || IsNil(o.Includenotenrolledcourses) {
		return nil, false
	}
	return o.Includenotenrolledcourses, true
}

// HasIncludenotenrolledcourses returns a boolean if a field has been set.
func (o *ModAssignGetAssignmentsRequest) HasIncludenotenrolledcourses() bool {
	if o != nil && !IsNil(o.Includenotenrolledcourses) {
		return true
	}

	return false
}

// SetIncludenotenrolledcourses gets a reference to the given bool and assigns it to the Includenotenrolledcourses field.
func (o *ModAssignGetAssignmentsRequest) SetIncludenotenrolledcourses(v bool) {
	o.Includenotenrolledcourses = &v
}

func (o ModAssignGetAssignmentsRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModAssignGetAssignmentsRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Capabilities) {
		toSerialize["capabilities"] = o.Capabilities
	}
	if !IsNil(o.Courseids) {
		toSerialize["courseids"] = o.Courseids
	}
	if !IsNil(o.Includenotenrolledcourses) {
		toSerialize["includenotenrolledcourses"] = o.Includenotenrolledcourses
	}
	return toSerialize, nil
}

type NullableModAssignGetAssignmentsRequest struct {
	value *ModAssignGetAssignmentsRequest
	isSet bool
}

func (v NullableModAssignGetAssignmentsRequest) Get() *ModAssignGetAssignmentsRequest {
	return v.value
}

func (v *NullableModAssignGetAssignmentsRequest) Set(val *ModAssignGetAssignmentsRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableModAssignGetAssignmentsRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableModAssignGetAssignmentsRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModAssignGetAssignmentsRequest(val *ModAssignGetAssignmentsRequest) *NullableModAssignGetAssignmentsRequest {
	return &NullableModAssignGetAssignmentsRequest{value: val, isSet: true}
}

func (v NullableModAssignGetAssignmentsRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModAssignGetAssignmentsRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


