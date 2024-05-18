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

// checks if the ToolBehatGetEntityGenerator200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ToolBehatGetEntityGenerator200Response{}

// ToolBehatGetEntityGenerator200Response struct for ToolBehatGetEntityGenerator200Response
type ToolBehatGetEntityGenerator200Response struct {
	Required []map[string]interface{} `json:"required,omitempty"`
}

// NewToolBehatGetEntityGenerator200Response instantiates a new ToolBehatGetEntityGenerator200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewToolBehatGetEntityGenerator200Response() *ToolBehatGetEntityGenerator200Response {
	this := ToolBehatGetEntityGenerator200Response{}
	return &this
}

// NewToolBehatGetEntityGenerator200ResponseWithDefaults instantiates a new ToolBehatGetEntityGenerator200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewToolBehatGetEntityGenerator200ResponseWithDefaults() *ToolBehatGetEntityGenerator200Response {
	this := ToolBehatGetEntityGenerator200Response{}
	return &this
}

// GetRequired returns the Required field value if set, zero value otherwise.
func (o *ToolBehatGetEntityGenerator200Response) GetRequired() []map[string]interface{} {
	if o == nil || IsNil(o.Required) {
		var ret []map[string]interface{}
		return ret
	}
	return o.Required
}

// GetRequiredOk returns a tuple with the Required field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ToolBehatGetEntityGenerator200Response) GetRequiredOk() ([]map[string]interface{}, bool) {
	if o == nil || IsNil(o.Required) {
		return nil, false
	}
	return o.Required, true
}

// HasRequired returns a boolean if a field has been set.
func (o *ToolBehatGetEntityGenerator200Response) HasRequired() bool {
	if o != nil && !IsNil(o.Required) {
		return true
	}

	return false
}

// SetRequired gets a reference to the given []map[string]interface{} and assigns it to the Required field.
func (o *ToolBehatGetEntityGenerator200Response) SetRequired(v []map[string]interface{}) {
	o.Required = v
}

func (o ToolBehatGetEntityGenerator200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ToolBehatGetEntityGenerator200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Required) {
		toSerialize["required"] = o.Required
	}
	return toSerialize, nil
}

type NullableToolBehatGetEntityGenerator200Response struct {
	value *ToolBehatGetEntityGenerator200Response
	isSet bool
}

func (v NullableToolBehatGetEntityGenerator200Response) Get() *ToolBehatGetEntityGenerator200Response {
	return v.value
}

func (v *NullableToolBehatGetEntityGenerator200Response) Set(val *ToolBehatGetEntityGenerator200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableToolBehatGetEntityGenerator200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableToolBehatGetEntityGenerator200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableToolBehatGetEntityGenerator200Response(val *ToolBehatGetEntityGenerator200Response) *NullableToolBehatGetEntityGenerator200Response {
	return &NullableToolBehatGetEntityGenerator200Response{value: val, isSet: true}
}

func (v NullableToolBehatGetEntityGenerator200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableToolBehatGetEntityGenerator200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


