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

// checks if the ModBigbluebuttonbnEndMeetingRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModBigbluebuttonbnEndMeetingRequest{}

// ModBigbluebuttonbnEndMeetingRequest struct for ModBigbluebuttonbnEndMeetingRequest
type ModBigbluebuttonbnEndMeetingRequest struct {
	// bigbluebuttonbn instance id
	Bigbluebuttonbnid int32 `json:"bigbluebuttonbnid"`
	// bigbluebuttonbn group id
	Groupid *int32 `json:"groupid,omitempty"`
}

type _ModBigbluebuttonbnEndMeetingRequest ModBigbluebuttonbnEndMeetingRequest

// NewModBigbluebuttonbnEndMeetingRequest instantiates a new ModBigbluebuttonbnEndMeetingRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModBigbluebuttonbnEndMeetingRequest(bigbluebuttonbnid int32) *ModBigbluebuttonbnEndMeetingRequest {
	this := ModBigbluebuttonbnEndMeetingRequest{}
	this.Bigbluebuttonbnid = bigbluebuttonbnid
	var groupid int32 = 0
	this.Groupid = &groupid
	return &this
}

// NewModBigbluebuttonbnEndMeetingRequestWithDefaults instantiates a new ModBigbluebuttonbnEndMeetingRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModBigbluebuttonbnEndMeetingRequestWithDefaults() *ModBigbluebuttonbnEndMeetingRequest {
	this := ModBigbluebuttonbnEndMeetingRequest{}
	var groupid int32 = 0
	this.Groupid = &groupid
	return &this
}

// GetBigbluebuttonbnid returns the Bigbluebuttonbnid field value
func (o *ModBigbluebuttonbnEndMeetingRequest) GetBigbluebuttonbnid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Bigbluebuttonbnid
}

// GetBigbluebuttonbnidOk returns a tuple with the Bigbluebuttonbnid field value
// and a boolean to check if the value has been set.
func (o *ModBigbluebuttonbnEndMeetingRequest) GetBigbluebuttonbnidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Bigbluebuttonbnid, true
}

// SetBigbluebuttonbnid sets field value
func (o *ModBigbluebuttonbnEndMeetingRequest) SetBigbluebuttonbnid(v int32) {
	o.Bigbluebuttonbnid = v
}

// GetGroupid returns the Groupid field value if set, zero value otherwise.
func (o *ModBigbluebuttonbnEndMeetingRequest) GetGroupid() int32 {
	if o == nil || IsNil(o.Groupid) {
		var ret int32
		return ret
	}
	return *o.Groupid
}

// GetGroupidOk returns a tuple with the Groupid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModBigbluebuttonbnEndMeetingRequest) GetGroupidOk() (*int32, bool) {
	if o == nil || IsNil(o.Groupid) {
		return nil, false
	}
	return o.Groupid, true
}

// HasGroupid returns a boolean if a field has been set.
func (o *ModBigbluebuttonbnEndMeetingRequest) HasGroupid() bool {
	if o != nil && !IsNil(o.Groupid) {
		return true
	}

	return false
}

// SetGroupid gets a reference to the given int32 and assigns it to the Groupid field.
func (o *ModBigbluebuttonbnEndMeetingRequest) SetGroupid(v int32) {
	o.Groupid = &v
}

func (o ModBigbluebuttonbnEndMeetingRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModBigbluebuttonbnEndMeetingRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["bigbluebuttonbnid"] = o.Bigbluebuttonbnid
	if !IsNil(o.Groupid) {
		toSerialize["groupid"] = o.Groupid
	}
	return toSerialize, nil
}

func (o *ModBigbluebuttonbnEndMeetingRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"bigbluebuttonbnid",
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

	varModBigbluebuttonbnEndMeetingRequest := _ModBigbluebuttonbnEndMeetingRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModBigbluebuttonbnEndMeetingRequest)

	if err != nil {
		return err
	}

	*o = ModBigbluebuttonbnEndMeetingRequest(varModBigbluebuttonbnEndMeetingRequest)

	return err
}

type NullableModBigbluebuttonbnEndMeetingRequest struct {
	value *ModBigbluebuttonbnEndMeetingRequest
	isSet bool
}

func (v NullableModBigbluebuttonbnEndMeetingRequest) Get() *ModBigbluebuttonbnEndMeetingRequest {
	return v.value
}

func (v *NullableModBigbluebuttonbnEndMeetingRequest) Set(val *ModBigbluebuttonbnEndMeetingRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableModBigbluebuttonbnEndMeetingRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableModBigbluebuttonbnEndMeetingRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModBigbluebuttonbnEndMeetingRequest(val *ModBigbluebuttonbnEndMeetingRequest) *NullableModBigbluebuttonbnEndMeetingRequest {
	return &NullableModBigbluebuttonbnEndMeetingRequest{value: val, isSet: true}
}

func (v NullableModBigbluebuttonbnEndMeetingRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModBigbluebuttonbnEndMeetingRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


