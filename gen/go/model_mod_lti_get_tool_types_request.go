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

// checks if the ModLtiGetToolTypesRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModLtiGetToolTypesRequest{}

// ModLtiGetToolTypesRequest struct for ModLtiGetToolTypesRequest
type ModLtiGetToolTypesRequest struct {
	// Tool proxy id
	Toolproxyid *int32 `json:"toolproxyid,omitempty"`
}

// NewModLtiGetToolTypesRequest instantiates a new ModLtiGetToolTypesRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModLtiGetToolTypesRequest() *ModLtiGetToolTypesRequest {
	this := ModLtiGetToolTypesRequest{}
	var toolproxyid int32 = 0
	this.Toolproxyid = &toolproxyid
	return &this
}

// NewModLtiGetToolTypesRequestWithDefaults instantiates a new ModLtiGetToolTypesRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModLtiGetToolTypesRequestWithDefaults() *ModLtiGetToolTypesRequest {
	this := ModLtiGetToolTypesRequest{}
	var toolproxyid int32 = 0
	this.Toolproxyid = &toolproxyid
	return &this
}

// GetToolproxyid returns the Toolproxyid field value if set, zero value otherwise.
func (o *ModLtiGetToolTypesRequest) GetToolproxyid() int32 {
	if o == nil || IsNil(o.Toolproxyid) {
		var ret int32
		return ret
	}
	return *o.Toolproxyid
}

// GetToolproxyidOk returns a tuple with the Toolproxyid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModLtiGetToolTypesRequest) GetToolproxyidOk() (*int32, bool) {
	if o == nil || IsNil(o.Toolproxyid) {
		return nil, false
	}
	return o.Toolproxyid, true
}

// HasToolproxyid returns a boolean if a field has been set.
func (o *ModLtiGetToolTypesRequest) HasToolproxyid() bool {
	if o != nil && !IsNil(o.Toolproxyid) {
		return true
	}

	return false
}

// SetToolproxyid gets a reference to the given int32 and assigns it to the Toolproxyid field.
func (o *ModLtiGetToolTypesRequest) SetToolproxyid(v int32) {
	o.Toolproxyid = &v
}

func (o ModLtiGetToolTypesRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModLtiGetToolTypesRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Toolproxyid) {
		toSerialize["toolproxyid"] = o.Toolproxyid
	}
	return toSerialize, nil
}

type NullableModLtiGetToolTypesRequest struct {
	value *ModLtiGetToolTypesRequest
	isSet bool
}

func (v NullableModLtiGetToolTypesRequest) Get() *ModLtiGetToolTypesRequest {
	return v.value
}

func (v *NullableModLtiGetToolTypesRequest) Set(val *ModLtiGetToolTypesRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableModLtiGetToolTypesRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableModLtiGetToolTypesRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModLtiGetToolTypesRequest(val *ModLtiGetToolTypesRequest) *NullableModLtiGetToolTypesRequest {
	return &NullableModLtiGetToolTypesRequest{value: val, isSet: true}
}

func (v NullableModLtiGetToolTypesRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModLtiGetToolTypesRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

