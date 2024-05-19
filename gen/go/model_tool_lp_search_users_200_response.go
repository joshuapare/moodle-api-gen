/*
Moodle Webservice API

Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

API version: 4.3.4
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package moodleclient

import (
	"encoding/json"
	"bytes"
	"fmt"
)

// checks if the ToolLpSearchUsers200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ToolLpSearchUsers200Response{}

// ToolLpSearchUsers200Response struct for ToolLpSearchUsers200Response
type ToolLpSearchUsers200Response struct {
	// Total number of results.
	Count int32 `json:"count"`
	Users []ToolLpSearchUsers200ResponseUsersInner `json:"users"`
}

type _ToolLpSearchUsers200Response ToolLpSearchUsers200Response

// NewToolLpSearchUsers200Response instantiates a new ToolLpSearchUsers200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewToolLpSearchUsers200Response(count int32, users []ToolLpSearchUsers200ResponseUsersInner) *ToolLpSearchUsers200Response {
	this := ToolLpSearchUsers200Response{}
	this.Count = count
	this.Users = users
	return &this
}

// NewToolLpSearchUsers200ResponseWithDefaults instantiates a new ToolLpSearchUsers200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewToolLpSearchUsers200ResponseWithDefaults() *ToolLpSearchUsers200Response {
	this := ToolLpSearchUsers200Response{}
	var count int32 = null
	this.Count = count
	return &this
}

// GetCount returns the Count field value
func (o *ToolLpSearchUsers200Response) GetCount() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Count
}

// GetCountOk returns a tuple with the Count field value
// and a boolean to check if the value has been set.
func (o *ToolLpSearchUsers200Response) GetCountOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Count, true
}

// SetCount sets field value
func (o *ToolLpSearchUsers200Response) SetCount(v int32) {
	o.Count = v
}

// GetUsers returns the Users field value
func (o *ToolLpSearchUsers200Response) GetUsers() []ToolLpSearchUsers200ResponseUsersInner {
	if o == nil {
		var ret []ToolLpSearchUsers200ResponseUsersInner
		return ret
	}

	return o.Users
}

// GetUsersOk returns a tuple with the Users field value
// and a boolean to check if the value has been set.
func (o *ToolLpSearchUsers200Response) GetUsersOk() ([]ToolLpSearchUsers200ResponseUsersInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Users, true
}

// SetUsers sets field value
func (o *ToolLpSearchUsers200Response) SetUsers(v []ToolLpSearchUsers200ResponseUsersInner) {
	o.Users = v
}

func (o ToolLpSearchUsers200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ToolLpSearchUsers200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["count"] = o.Count
	toSerialize["users"] = o.Users
	return toSerialize, nil
}

func (o *ToolLpSearchUsers200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"count",
		"users",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varToolLpSearchUsers200Response := _ToolLpSearchUsers200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varToolLpSearchUsers200Response)

	if err != nil {
		return err
	}

	*o = ToolLpSearchUsers200Response(varToolLpSearchUsers200Response)

	return err
}

type NullableToolLpSearchUsers200Response struct {
	value *ToolLpSearchUsers200Response
	isSet bool
}

func (v NullableToolLpSearchUsers200Response) Get() *ToolLpSearchUsers200Response {
	return v.value
}

func (v *NullableToolLpSearchUsers200Response) Set(val *ToolLpSearchUsers200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableToolLpSearchUsers200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableToolLpSearchUsers200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableToolLpSearchUsers200Response(val *ToolLpSearchUsers200Response) *NullableToolLpSearchUsers200Response {
	return &NullableToolLpSearchUsers200Response{value: val, isSet: true}
}

func (v NullableToolLpSearchUsers200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableToolLpSearchUsers200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


