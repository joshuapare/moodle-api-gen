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

// checks if the ModAssignGetUserMappings200ResponseAssignmentsInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModAssignGetUserMappings200ResponseAssignmentsInner{}

// ModAssignGetUserMappings200ResponseAssignmentsInner struct for ModAssignGetUserMappings200ResponseAssignmentsInner
type ModAssignGetUserMappings200ResponseAssignmentsInner struct {
	// assignment id
	Assignmentid *int32 `json:"assignmentid,omitempty"`
	Mappings []ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner `json:"mappings,omitempty"`
}

// NewModAssignGetUserMappings200ResponseAssignmentsInner instantiates a new ModAssignGetUserMappings200ResponseAssignmentsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModAssignGetUserMappings200ResponseAssignmentsInner() *ModAssignGetUserMappings200ResponseAssignmentsInner {
	this := ModAssignGetUserMappings200ResponseAssignmentsInner{}
	return &this
}

// NewModAssignGetUserMappings200ResponseAssignmentsInnerWithDefaults instantiates a new ModAssignGetUserMappings200ResponseAssignmentsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModAssignGetUserMappings200ResponseAssignmentsInnerWithDefaults() *ModAssignGetUserMappings200ResponseAssignmentsInner {
	this := ModAssignGetUserMappings200ResponseAssignmentsInner{}
	return &this
}

// GetAssignmentid returns the Assignmentid field value if set, zero value otherwise.
func (o *ModAssignGetUserMappings200ResponseAssignmentsInner) GetAssignmentid() int32 {
	if o == nil || IsNil(o.Assignmentid) {
		var ret int32
		return ret
	}
	return *o.Assignmentid
}

// GetAssignmentidOk returns a tuple with the Assignmentid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignGetUserMappings200ResponseAssignmentsInner) GetAssignmentidOk() (*int32, bool) {
	if o == nil || IsNil(o.Assignmentid) {
		return nil, false
	}
	return o.Assignmentid, true
}

// HasAssignmentid returns a boolean if a field has been set.
func (o *ModAssignGetUserMappings200ResponseAssignmentsInner) HasAssignmentid() bool {
	if o != nil && !IsNil(o.Assignmentid) {
		return true
	}

	return false
}

// SetAssignmentid gets a reference to the given int32 and assigns it to the Assignmentid field.
func (o *ModAssignGetUserMappings200ResponseAssignmentsInner) SetAssignmentid(v int32) {
	o.Assignmentid = &v
}

// GetMappings returns the Mappings field value if set, zero value otherwise.
func (o *ModAssignGetUserMappings200ResponseAssignmentsInner) GetMappings() []ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner {
	if o == nil || IsNil(o.Mappings) {
		var ret []ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner
		return ret
	}
	return o.Mappings
}

// GetMappingsOk returns a tuple with the Mappings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignGetUserMappings200ResponseAssignmentsInner) GetMappingsOk() ([]ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner, bool) {
	if o == nil || IsNil(o.Mappings) {
		return nil, false
	}
	return o.Mappings, true
}

// HasMappings returns a boolean if a field has been set.
func (o *ModAssignGetUserMappings200ResponseAssignmentsInner) HasMappings() bool {
	if o != nil && !IsNil(o.Mappings) {
		return true
	}

	return false
}

// SetMappings gets a reference to the given []ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner and assigns it to the Mappings field.
func (o *ModAssignGetUserMappings200ResponseAssignmentsInner) SetMappings(v []ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner) {
	o.Mappings = v
}

func (o ModAssignGetUserMappings200ResponseAssignmentsInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModAssignGetUserMappings200ResponseAssignmentsInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Assignmentid) {
		toSerialize["assignmentid"] = o.Assignmentid
	}
	if !IsNil(o.Mappings) {
		toSerialize["mappings"] = o.Mappings
	}
	return toSerialize, nil
}

type NullableModAssignGetUserMappings200ResponseAssignmentsInner struct {
	value *ModAssignGetUserMappings200ResponseAssignmentsInner
	isSet bool
}

func (v NullableModAssignGetUserMappings200ResponseAssignmentsInner) Get() *ModAssignGetUserMappings200ResponseAssignmentsInner {
	return v.value
}

func (v *NullableModAssignGetUserMappings200ResponseAssignmentsInner) Set(val *ModAssignGetUserMappings200ResponseAssignmentsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableModAssignGetUserMappings200ResponseAssignmentsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableModAssignGetUserMappings200ResponseAssignmentsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModAssignGetUserMappings200ResponseAssignmentsInner(val *ModAssignGetUserMappings200ResponseAssignmentsInner) *NullableModAssignGetUserMappings200ResponseAssignmentsInner {
	return &NullableModAssignGetUserMappings200ResponseAssignmentsInner{value: val, isSet: true}
}

func (v NullableModAssignGetUserMappings200ResponseAssignmentsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModAssignGetUserMappings200ResponseAssignmentsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

