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

// checks if the ModChatGetChatLatestMessages200ResponseMessagesInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModChatGetChatLatestMessages200ResponseMessagesInner{}

// ModChatGetChatLatestMessages200ResponseMessagesInner struct for ModChatGetChatLatestMessages200ResponseMessagesInner
type ModChatGetChatLatestMessages200ResponseMessagesInner struct {
	// message id
	Id *int32 `json:"id,omitempty"`
	// message text
	Message *string `json:"message,omitempty"`
	// true if is a system message (like user joined)
	System *bool `json:"system,omitempty"`
	// timestamp for the message
	Timestamp *int32 `json:"timestamp,omitempty"`
	// user id
	Userid *int32 `json:"userid,omitempty"`
}

// NewModChatGetChatLatestMessages200ResponseMessagesInner instantiates a new ModChatGetChatLatestMessages200ResponseMessagesInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModChatGetChatLatestMessages200ResponseMessagesInner() *ModChatGetChatLatestMessages200ResponseMessagesInner {
	this := ModChatGetChatLatestMessages200ResponseMessagesInner{}
	var id int32 = null
	this.Id = &id
	var message string = "null"
	this.Message = &message
	var system bool = null
	this.System = &system
	var timestamp int32 = null
	this.Timestamp = &timestamp
	return &this
}

// NewModChatGetChatLatestMessages200ResponseMessagesInnerWithDefaults instantiates a new ModChatGetChatLatestMessages200ResponseMessagesInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModChatGetChatLatestMessages200ResponseMessagesInnerWithDefaults() *ModChatGetChatLatestMessages200ResponseMessagesInner {
	this := ModChatGetChatLatestMessages200ResponseMessagesInner{}
	var id int32 = null
	this.Id = &id
	var message string = "null"
	this.Message = &message
	var system bool = null
	this.System = &system
	var timestamp int32 = null
	this.Timestamp = &timestamp
	return &this
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) GetId() int32 {
	if o == nil || IsNil(o.Id) {
		var ret int32
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) GetIdOk() (*int32, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given int32 and assigns it to the Id field.
func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) SetId(v int32) {
	o.Id = &v
}

// GetMessage returns the Message field value if set, zero value otherwise.
func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) GetMessage() string {
	if o == nil || IsNil(o.Message) {
		var ret string
		return ret
	}
	return *o.Message
}

// GetMessageOk returns a tuple with the Message field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) GetMessageOk() (*string, bool) {
	if o == nil || IsNil(o.Message) {
		return nil, false
	}
	return o.Message, true
}

// HasMessage returns a boolean if a field has been set.
func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) HasMessage() bool {
	if o != nil && !IsNil(o.Message) {
		return true
	}

	return false
}

// SetMessage gets a reference to the given string and assigns it to the Message field.
func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) SetMessage(v string) {
	o.Message = &v
}

// GetSystem returns the System field value if set, zero value otherwise.
func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) GetSystem() bool {
	if o == nil || IsNil(o.System) {
		var ret bool
		return ret
	}
	return *o.System
}

// GetSystemOk returns a tuple with the System field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) GetSystemOk() (*bool, bool) {
	if o == nil || IsNil(o.System) {
		return nil, false
	}
	return o.System, true
}

// HasSystem returns a boolean if a field has been set.
func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) HasSystem() bool {
	if o != nil && !IsNil(o.System) {
		return true
	}

	return false
}

// SetSystem gets a reference to the given bool and assigns it to the System field.
func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) SetSystem(v bool) {
	o.System = &v
}

// GetTimestamp returns the Timestamp field value if set, zero value otherwise.
func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) GetTimestamp() int32 {
	if o == nil || IsNil(o.Timestamp) {
		var ret int32
		return ret
	}
	return *o.Timestamp
}

// GetTimestampOk returns a tuple with the Timestamp field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) GetTimestampOk() (*int32, bool) {
	if o == nil || IsNil(o.Timestamp) {
		return nil, false
	}
	return o.Timestamp, true
}

// HasTimestamp returns a boolean if a field has been set.
func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) HasTimestamp() bool {
	if o != nil && !IsNil(o.Timestamp) {
		return true
	}

	return false
}

// SetTimestamp gets a reference to the given int32 and assigns it to the Timestamp field.
func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) SetTimestamp(v int32) {
	o.Timestamp = &v
}

// GetUserid returns the Userid field value if set, zero value otherwise.
func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) GetUserid() int32 {
	if o == nil || IsNil(o.Userid) {
		var ret int32
		return ret
	}
	return *o.Userid
}

// GetUseridOk returns a tuple with the Userid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) GetUseridOk() (*int32, bool) {
	if o == nil || IsNil(o.Userid) {
		return nil, false
	}
	return o.Userid, true
}

// HasUserid returns a boolean if a field has been set.
func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) HasUserid() bool {
	if o != nil && !IsNil(o.Userid) {
		return true
	}

	return false
}

// SetUserid gets a reference to the given int32 and assigns it to the Userid field.
func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) SetUserid(v int32) {
	o.Userid = &v
}

func (o ModChatGetChatLatestMessages200ResponseMessagesInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModChatGetChatLatestMessages200ResponseMessagesInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.Message) {
		toSerialize["message"] = o.Message
	}
	if !IsNil(o.System) {
		toSerialize["system"] = o.System
	}
	if !IsNil(o.Timestamp) {
		toSerialize["timestamp"] = o.Timestamp
	}
	if !IsNil(o.Userid) {
		toSerialize["userid"] = o.Userid
	}
	return toSerialize, nil
}

type NullableModChatGetChatLatestMessages200ResponseMessagesInner struct {
	value *ModChatGetChatLatestMessages200ResponseMessagesInner
	isSet bool
}

func (v NullableModChatGetChatLatestMessages200ResponseMessagesInner) Get() *ModChatGetChatLatestMessages200ResponseMessagesInner {
	return v.value
}

func (v *NullableModChatGetChatLatestMessages200ResponseMessagesInner) Set(val *ModChatGetChatLatestMessages200ResponseMessagesInner) {
	v.value = val
	v.isSet = true
}

func (v NullableModChatGetChatLatestMessages200ResponseMessagesInner) IsSet() bool {
	return v.isSet
}

func (v *NullableModChatGetChatLatestMessages200ResponseMessagesInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModChatGetChatLatestMessages200ResponseMessagesInner(val *ModChatGetChatLatestMessages200ResponseMessagesInner) *NullableModChatGetChatLatestMessages200ResponseMessagesInner {
	return &NullableModChatGetChatLatestMessages200ResponseMessagesInner{value: val, isSet: true}
}

func (v NullableModChatGetChatLatestMessages200ResponseMessagesInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModChatGetChatLatestMessages200ResponseMessagesInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

