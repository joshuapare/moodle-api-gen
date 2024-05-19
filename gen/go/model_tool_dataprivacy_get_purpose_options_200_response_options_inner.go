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

// checks if the ToolDataprivacyGetPurposeOptions200ResponseOptionsInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ToolDataprivacyGetPurposeOptions200ResponseOptionsInner{}

// ToolDataprivacyGetPurposeOptions200ResponseOptionsInner struct for ToolDataprivacyGetPurposeOptions200ResponseOptionsInner
type ToolDataprivacyGetPurposeOptions200ResponseOptionsInner struct {
	// The purpose ID
	Id *int32 `json:"id,omitempty"`
	// The purpose name
	Name *string `json:"name,omitempty"`
}

// NewToolDataprivacyGetPurposeOptions200ResponseOptionsInner instantiates a new ToolDataprivacyGetPurposeOptions200ResponseOptionsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewToolDataprivacyGetPurposeOptions200ResponseOptionsInner() *ToolDataprivacyGetPurposeOptions200ResponseOptionsInner {
	this := ToolDataprivacyGetPurposeOptions200ResponseOptionsInner{}
	var name string = "null"
	this.Name = &name
	return &this
}

// NewToolDataprivacyGetPurposeOptions200ResponseOptionsInnerWithDefaults instantiates a new ToolDataprivacyGetPurposeOptions200ResponseOptionsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewToolDataprivacyGetPurposeOptions200ResponseOptionsInnerWithDefaults() *ToolDataprivacyGetPurposeOptions200ResponseOptionsInner {
	this := ToolDataprivacyGetPurposeOptions200ResponseOptionsInner{}
	var name string = "null"
	this.Name = &name
	return &this
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *ToolDataprivacyGetPurposeOptions200ResponseOptionsInner) GetId() int32 {
	if o == nil || IsNil(o.Id) {
		var ret int32
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ToolDataprivacyGetPurposeOptions200ResponseOptionsInner) GetIdOk() (*int32, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *ToolDataprivacyGetPurposeOptions200ResponseOptionsInner) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given int32 and assigns it to the Id field.
func (o *ToolDataprivacyGetPurposeOptions200ResponseOptionsInner) SetId(v int32) {
	o.Id = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *ToolDataprivacyGetPurposeOptions200ResponseOptionsInner) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ToolDataprivacyGetPurposeOptions200ResponseOptionsInner) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *ToolDataprivacyGetPurposeOptions200ResponseOptionsInner) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *ToolDataprivacyGetPurposeOptions200ResponseOptionsInner) SetName(v string) {
	o.Name = &v
}

func (o ToolDataprivacyGetPurposeOptions200ResponseOptionsInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ToolDataprivacyGetPurposeOptions200ResponseOptionsInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	return toSerialize, nil
}

type NullableToolDataprivacyGetPurposeOptions200ResponseOptionsInner struct {
	value *ToolDataprivacyGetPurposeOptions200ResponseOptionsInner
	isSet bool
}

func (v NullableToolDataprivacyGetPurposeOptions200ResponseOptionsInner) Get() *ToolDataprivacyGetPurposeOptions200ResponseOptionsInner {
	return v.value
}

func (v *NullableToolDataprivacyGetPurposeOptions200ResponseOptionsInner) Set(val *ToolDataprivacyGetPurposeOptions200ResponseOptionsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableToolDataprivacyGetPurposeOptions200ResponseOptionsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableToolDataprivacyGetPurposeOptions200ResponseOptionsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableToolDataprivacyGetPurposeOptions200ResponseOptionsInner(val *ToolDataprivacyGetPurposeOptions200ResponseOptionsInner) *NullableToolDataprivacyGetPurposeOptions200ResponseOptionsInner {
	return &NullableToolDataprivacyGetPurposeOptions200ResponseOptionsInner{value: val, isSet: true}
}

func (v NullableToolDataprivacyGetPurposeOptions200ResponseOptionsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableToolDataprivacyGetPurposeOptions200ResponseOptionsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


