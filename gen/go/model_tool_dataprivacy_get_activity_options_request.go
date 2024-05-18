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

// checks if the ToolDataprivacyGetActivityOptionsRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ToolDataprivacyGetActivityOptionsRequest{}

// ToolDataprivacyGetActivityOptionsRequest struct for ToolDataprivacyGetActivityOptionsRequest
type ToolDataprivacyGetActivityOptionsRequest struct {
	// Whether to fetch all activities or only those without defaults
	Nodefaults *bool `json:"nodefaults,omitempty"`
}

// NewToolDataprivacyGetActivityOptionsRequest instantiates a new ToolDataprivacyGetActivityOptionsRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewToolDataprivacyGetActivityOptionsRequest() *ToolDataprivacyGetActivityOptionsRequest {
	this := ToolDataprivacyGetActivityOptionsRequest{}
	var nodefaults bool = false
	this.Nodefaults = &nodefaults
	return &this
}

// NewToolDataprivacyGetActivityOptionsRequestWithDefaults instantiates a new ToolDataprivacyGetActivityOptionsRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewToolDataprivacyGetActivityOptionsRequestWithDefaults() *ToolDataprivacyGetActivityOptionsRequest {
	this := ToolDataprivacyGetActivityOptionsRequest{}
	var nodefaults bool = false
	this.Nodefaults = &nodefaults
	return &this
}

// GetNodefaults returns the Nodefaults field value if set, zero value otherwise.
func (o *ToolDataprivacyGetActivityOptionsRequest) GetNodefaults() bool {
	if o == nil || IsNil(o.Nodefaults) {
		var ret bool
		return ret
	}
	return *o.Nodefaults
}

// GetNodefaultsOk returns a tuple with the Nodefaults field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ToolDataprivacyGetActivityOptionsRequest) GetNodefaultsOk() (*bool, bool) {
	if o == nil || IsNil(o.Nodefaults) {
		return nil, false
	}
	return o.Nodefaults, true
}

// HasNodefaults returns a boolean if a field has been set.
func (o *ToolDataprivacyGetActivityOptionsRequest) HasNodefaults() bool {
	if o != nil && !IsNil(o.Nodefaults) {
		return true
	}

	return false
}

// SetNodefaults gets a reference to the given bool and assigns it to the Nodefaults field.
func (o *ToolDataprivacyGetActivityOptionsRequest) SetNodefaults(v bool) {
	o.Nodefaults = &v
}

func (o ToolDataprivacyGetActivityOptionsRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ToolDataprivacyGetActivityOptionsRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Nodefaults) {
		toSerialize["nodefaults"] = o.Nodefaults
	}
	return toSerialize, nil
}

type NullableToolDataprivacyGetActivityOptionsRequest struct {
	value *ToolDataprivacyGetActivityOptionsRequest
	isSet bool
}

func (v NullableToolDataprivacyGetActivityOptionsRequest) Get() *ToolDataprivacyGetActivityOptionsRequest {
	return v.value
}

func (v *NullableToolDataprivacyGetActivityOptionsRequest) Set(val *ToolDataprivacyGetActivityOptionsRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableToolDataprivacyGetActivityOptionsRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableToolDataprivacyGetActivityOptionsRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableToolDataprivacyGetActivityOptionsRequest(val *ToolDataprivacyGetActivityOptionsRequest) *NullableToolDataprivacyGetActivityOptionsRequest {
	return &NullableToolDataprivacyGetActivityOptionsRequest{value: val, isSet: true}
}

func (v NullableToolDataprivacyGetActivityOptionsRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableToolDataprivacyGetActivityOptionsRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


