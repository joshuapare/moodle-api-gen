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

// checks if the ModForumSetLockState200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModForumSetLockState200Response{}

// ModForumSetLockState200Response struct for ModForumSetLockState200Response
type ModForumSetLockState200Response struct {
	// The discussion we are locking.
	Id int32 `json:"id"`
	// The locked state of the discussion.
	Locked bool `json:"locked"`
	Times ModForumSetLockState200ResponseTimes `json:"times"`
}

type _ModForumSetLockState200Response ModForumSetLockState200Response

// NewModForumSetLockState200Response instantiates a new ModForumSetLockState200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModForumSetLockState200Response(id int32, locked bool, times ModForumSetLockState200ResponseTimes) *ModForumSetLockState200Response {
	this := ModForumSetLockState200Response{}
	this.Id = id
	this.Locked = locked
	this.Times = times
	return &this
}

// NewModForumSetLockState200ResponseWithDefaults instantiates a new ModForumSetLockState200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModForumSetLockState200ResponseWithDefaults() *ModForumSetLockState200Response {
	this := ModForumSetLockState200Response{}
	var id int32 = null
	this.Id = id
	var locked bool = null
	this.Locked = locked
	return &this
}

// GetId returns the Id field value
func (o *ModForumSetLockState200Response) GetId() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *ModForumSetLockState200Response) GetIdOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *ModForumSetLockState200Response) SetId(v int32) {
	o.Id = v
}

// GetLocked returns the Locked field value
func (o *ModForumSetLockState200Response) GetLocked() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Locked
}

// GetLockedOk returns a tuple with the Locked field value
// and a boolean to check if the value has been set.
func (o *ModForumSetLockState200Response) GetLockedOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Locked, true
}

// SetLocked sets field value
func (o *ModForumSetLockState200Response) SetLocked(v bool) {
	o.Locked = v
}

// GetTimes returns the Times field value
func (o *ModForumSetLockState200Response) GetTimes() ModForumSetLockState200ResponseTimes {
	if o == nil {
		var ret ModForumSetLockState200ResponseTimes
		return ret
	}

	return o.Times
}

// GetTimesOk returns a tuple with the Times field value
// and a boolean to check if the value has been set.
func (o *ModForumSetLockState200Response) GetTimesOk() (*ModForumSetLockState200ResponseTimes, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Times, true
}

// SetTimes sets field value
func (o *ModForumSetLockState200Response) SetTimes(v ModForumSetLockState200ResponseTimes) {
	o.Times = v
}

func (o ModForumSetLockState200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModForumSetLockState200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["id"] = o.Id
	toSerialize["locked"] = o.Locked
	toSerialize["times"] = o.Times
	return toSerialize, nil
}

func (o *ModForumSetLockState200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"id",
		"locked",
		"times",
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

	varModForumSetLockState200Response := _ModForumSetLockState200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModForumSetLockState200Response)

	if err != nil {
		return err
	}

	*o = ModForumSetLockState200Response(varModForumSetLockState200Response)

	return err
}

type NullableModForumSetLockState200Response struct {
	value *ModForumSetLockState200Response
	isSet bool
}

func (v NullableModForumSetLockState200Response) Get() *ModForumSetLockState200Response {
	return v.value
}

func (v *NullableModForumSetLockState200Response) Set(val *ModForumSetLockState200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableModForumSetLockState200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableModForumSetLockState200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModForumSetLockState200Response(val *ModForumSetLockState200Response) *NullableModForumSetLockState200Response {
	return &NullableModForumSetLockState200Response{value: val, isSet: true}
}

func (v NullableModForumSetLockState200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModForumSetLockState200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


