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

// checks if the ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner{}

// ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner The reasons why the user cannot attempt the lesson
type ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner struct {
	// Additional data
	Data *string `json:"data,omitempty"`
	// Complete html message
	Message *string `json:"message,omitempty"`
	// Reason lang string code
	Reason *string `json:"reason,omitempty"`
}

// NewModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner instantiates a new ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner() *ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner {
	this := ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner{}
	var data string = "null"
	this.Data = &data
	var message string = "null"
	this.Message = &message
	var reason string = "null"
	this.Reason = &reason
	return &this
}

// NewModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInnerWithDefaults instantiates a new ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInnerWithDefaults() *ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner {
	this := ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner{}
	var data string = "null"
	this.Data = &data
	var message string = "null"
	this.Message = &message
	var reason string = "null"
	this.Reason = &reason
	return &this
}

// GetData returns the Data field value if set, zero value otherwise.
func (o *ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner) GetData() string {
	if o == nil || IsNil(o.Data) {
		var ret string
		return ret
	}
	return *o.Data
}

// GetDataOk returns a tuple with the Data field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner) GetDataOk() (*string, bool) {
	if o == nil || IsNil(o.Data) {
		return nil, false
	}
	return o.Data, true
}

// HasData returns a boolean if a field has been set.
func (o *ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner) HasData() bool {
	if o != nil && !IsNil(o.Data) {
		return true
	}

	return false
}

// SetData gets a reference to the given string and assigns it to the Data field.
func (o *ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner) SetData(v string) {
	o.Data = &v
}

// GetMessage returns the Message field value if set, zero value otherwise.
func (o *ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner) GetMessage() string {
	if o == nil || IsNil(o.Message) {
		var ret string
		return ret
	}
	return *o.Message
}

// GetMessageOk returns a tuple with the Message field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner) GetMessageOk() (*string, bool) {
	if o == nil || IsNil(o.Message) {
		return nil, false
	}
	return o.Message, true
}

// HasMessage returns a boolean if a field has been set.
func (o *ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner) HasMessage() bool {
	if o != nil && !IsNil(o.Message) {
		return true
	}

	return false
}

// SetMessage gets a reference to the given string and assigns it to the Message field.
func (o *ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner) SetMessage(v string) {
	o.Message = &v
}

// GetReason returns the Reason field value if set, zero value otherwise.
func (o *ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner) GetReason() string {
	if o == nil || IsNil(o.Reason) {
		var ret string
		return ret
	}
	return *o.Reason
}

// GetReasonOk returns a tuple with the Reason field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner) GetReasonOk() (*string, bool) {
	if o == nil || IsNil(o.Reason) {
		return nil, false
	}
	return o.Reason, true
}

// HasReason returns a boolean if a field has been set.
func (o *ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner) HasReason() bool {
	if o != nil && !IsNil(o.Reason) {
		return true
	}

	return false
}

// SetReason gets a reference to the given string and assigns it to the Reason field.
func (o *ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner) SetReason(v string) {
	o.Reason = &v
}

func (o ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Data) {
		toSerialize["data"] = o.Data
	}
	if !IsNil(o.Message) {
		toSerialize["message"] = o.Message
	}
	if !IsNil(o.Reason) {
		toSerialize["reason"] = o.Reason
	}
	return toSerialize, nil
}

type NullableModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner struct {
	value *ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner
	isSet bool
}

func (v NullableModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner) Get() *ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner {
	return v.value
}

func (v *NullableModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner) Set(val *ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner(val *ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner) *NullableModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner {
	return &NullableModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner{value: val, isSet: true}
}

func (v NullableModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

