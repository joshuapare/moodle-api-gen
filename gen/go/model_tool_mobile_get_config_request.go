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

// checks if the ToolMobileGetConfigRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ToolMobileGetConfigRequest{}

// ToolMobileGetConfigRequest struct for ToolMobileGetConfigRequest
type ToolMobileGetConfigRequest struct {
	// Settings section name.
	Section *string `json:"section,omitempty"`
}

// NewToolMobileGetConfigRequest instantiates a new ToolMobileGetConfigRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewToolMobileGetConfigRequest() *ToolMobileGetConfigRequest {
	this := ToolMobileGetConfigRequest{}
	var section string = ""
	this.Section = &section
	return &this
}

// NewToolMobileGetConfigRequestWithDefaults instantiates a new ToolMobileGetConfigRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewToolMobileGetConfigRequestWithDefaults() *ToolMobileGetConfigRequest {
	this := ToolMobileGetConfigRequest{}
	var section string = ""
	this.Section = &section
	return &this
}

// GetSection returns the Section field value if set, zero value otherwise.
func (o *ToolMobileGetConfigRequest) GetSection() string {
	if o == nil || IsNil(o.Section) {
		var ret string
		return ret
	}
	return *o.Section
}

// GetSectionOk returns a tuple with the Section field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ToolMobileGetConfigRequest) GetSectionOk() (*string, bool) {
	if o == nil || IsNil(o.Section) {
		return nil, false
	}
	return o.Section, true
}

// HasSection returns a boolean if a field has been set.
func (o *ToolMobileGetConfigRequest) HasSection() bool {
	if o != nil && !IsNil(o.Section) {
		return true
	}

	return false
}

// SetSection gets a reference to the given string and assigns it to the Section field.
func (o *ToolMobileGetConfigRequest) SetSection(v string) {
	o.Section = &v
}

func (o ToolMobileGetConfigRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ToolMobileGetConfigRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Section) {
		toSerialize["section"] = o.Section
	}
	return toSerialize, nil
}

type NullableToolMobileGetConfigRequest struct {
	value *ToolMobileGetConfigRequest
	isSet bool
}

func (v NullableToolMobileGetConfigRequest) Get() *ToolMobileGetConfigRequest {
	return v.value
}

func (v *NullableToolMobileGetConfigRequest) Set(val *ToolMobileGetConfigRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableToolMobileGetConfigRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableToolMobileGetConfigRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableToolMobileGetConfigRequest(val *ToolMobileGetConfigRequest) *NullableToolMobileGetConfigRequest {
	return &NullableToolMobileGetConfigRequest{value: val, isSet: true}
}

func (v NullableToolMobileGetConfigRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableToolMobileGetConfigRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

