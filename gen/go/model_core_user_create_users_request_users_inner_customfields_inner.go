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

// checks if the CoreUserCreateUsersRequestUsersInnerCustomfieldsInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreUserCreateUsersRequestUsersInnerCustomfieldsInner{}

// CoreUserCreateUsersRequestUsersInnerCustomfieldsInner struct for CoreUserCreateUsersRequestUsersInnerCustomfieldsInner
type CoreUserCreateUsersRequestUsersInnerCustomfieldsInner struct {
	// The name of the custom field
	Type *string `json:"type,omitempty"`
	// The value of the custom field
	Value *string `json:"value,omitempty"`
}

// NewCoreUserCreateUsersRequestUsersInnerCustomfieldsInner instantiates a new CoreUserCreateUsersRequestUsersInnerCustomfieldsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreUserCreateUsersRequestUsersInnerCustomfieldsInner() *CoreUserCreateUsersRequestUsersInnerCustomfieldsInner {
	this := CoreUserCreateUsersRequestUsersInnerCustomfieldsInner{}
	return &this
}

// NewCoreUserCreateUsersRequestUsersInnerCustomfieldsInnerWithDefaults instantiates a new CoreUserCreateUsersRequestUsersInnerCustomfieldsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreUserCreateUsersRequestUsersInnerCustomfieldsInnerWithDefaults() *CoreUserCreateUsersRequestUsersInnerCustomfieldsInner {
	this := CoreUserCreateUsersRequestUsersInnerCustomfieldsInner{}
	return &this
}

// GetType returns the Type field value if set, zero value otherwise.
func (o *CoreUserCreateUsersRequestUsersInnerCustomfieldsInner) GetType() string {
	if o == nil || IsNil(o.Type) {
		var ret string
		return ret
	}
	return *o.Type
}

// GetTypeOk returns a tuple with the Type field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserCreateUsersRequestUsersInnerCustomfieldsInner) GetTypeOk() (*string, bool) {
	if o == nil || IsNil(o.Type) {
		return nil, false
	}
	return o.Type, true
}

// HasType returns a boolean if a field has been set.
func (o *CoreUserCreateUsersRequestUsersInnerCustomfieldsInner) HasType() bool {
	if o != nil && !IsNil(o.Type) {
		return true
	}

	return false
}

// SetType gets a reference to the given string and assigns it to the Type field.
func (o *CoreUserCreateUsersRequestUsersInnerCustomfieldsInner) SetType(v string) {
	o.Type = &v
}

// GetValue returns the Value field value if set, zero value otherwise.
func (o *CoreUserCreateUsersRequestUsersInnerCustomfieldsInner) GetValue() string {
	if o == nil || IsNil(o.Value) {
		var ret string
		return ret
	}
	return *o.Value
}

// GetValueOk returns a tuple with the Value field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserCreateUsersRequestUsersInnerCustomfieldsInner) GetValueOk() (*string, bool) {
	if o == nil || IsNil(o.Value) {
		return nil, false
	}
	return o.Value, true
}

// HasValue returns a boolean if a field has been set.
func (o *CoreUserCreateUsersRequestUsersInnerCustomfieldsInner) HasValue() bool {
	if o != nil && !IsNil(o.Value) {
		return true
	}

	return false
}

// SetValue gets a reference to the given string and assigns it to the Value field.
func (o *CoreUserCreateUsersRequestUsersInnerCustomfieldsInner) SetValue(v string) {
	o.Value = &v
}

func (o CoreUserCreateUsersRequestUsersInnerCustomfieldsInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreUserCreateUsersRequestUsersInnerCustomfieldsInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Type) {
		toSerialize["type"] = o.Type
	}
	if !IsNil(o.Value) {
		toSerialize["value"] = o.Value
	}
	return toSerialize, nil
}

type NullableCoreUserCreateUsersRequestUsersInnerCustomfieldsInner struct {
	value *CoreUserCreateUsersRequestUsersInnerCustomfieldsInner
	isSet bool
}

func (v NullableCoreUserCreateUsersRequestUsersInnerCustomfieldsInner) Get() *CoreUserCreateUsersRequestUsersInnerCustomfieldsInner {
	return v.value
}

func (v *NullableCoreUserCreateUsersRequestUsersInnerCustomfieldsInner) Set(val *CoreUserCreateUsersRequestUsersInnerCustomfieldsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreUserCreateUsersRequestUsersInnerCustomfieldsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreUserCreateUsersRequestUsersInnerCustomfieldsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreUserCreateUsersRequestUsersInnerCustomfieldsInner(val *CoreUserCreateUsersRequestUsersInnerCustomfieldsInner) *NullableCoreUserCreateUsersRequestUsersInnerCustomfieldsInner {
	return &NullableCoreUserCreateUsersRequestUsersInnerCustomfieldsInner{value: val, isSet: true}
}

func (v NullableCoreUserCreateUsersRequestUsersInnerCustomfieldsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreUserCreateUsersRequestUsersInnerCustomfieldsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

