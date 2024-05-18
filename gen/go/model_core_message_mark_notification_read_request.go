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

// checks if the CoreMessageMarkNotificationReadRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreMessageMarkNotificationReadRequest{}

// CoreMessageMarkNotificationReadRequest struct for CoreMessageMarkNotificationReadRequest
type CoreMessageMarkNotificationReadRequest struct {
	// id of the notification
	Notificationid int32 `json:"notificationid"`
	// timestamp for when the notification should be marked read
	Timeread *int32 `json:"timeread,omitempty"`
}

type _CoreMessageMarkNotificationReadRequest CoreMessageMarkNotificationReadRequest

// NewCoreMessageMarkNotificationReadRequest instantiates a new CoreMessageMarkNotificationReadRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreMessageMarkNotificationReadRequest(notificationid int32) *CoreMessageMarkNotificationReadRequest {
	this := CoreMessageMarkNotificationReadRequest{}
	this.Notificationid = notificationid
	var timeread int32 = 0
	this.Timeread = &timeread
	return &this
}

// NewCoreMessageMarkNotificationReadRequestWithDefaults instantiates a new CoreMessageMarkNotificationReadRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreMessageMarkNotificationReadRequestWithDefaults() *CoreMessageMarkNotificationReadRequest {
	this := CoreMessageMarkNotificationReadRequest{}
	var notificationid int32 = null
	this.Notificationid = notificationid
	var timeread int32 = 0
	this.Timeread = &timeread
	return &this
}

// GetNotificationid returns the Notificationid field value
func (o *CoreMessageMarkNotificationReadRequest) GetNotificationid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Notificationid
}

// GetNotificationidOk returns a tuple with the Notificationid field value
// and a boolean to check if the value has been set.
func (o *CoreMessageMarkNotificationReadRequest) GetNotificationidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Notificationid, true
}

// SetNotificationid sets field value
func (o *CoreMessageMarkNotificationReadRequest) SetNotificationid(v int32) {
	o.Notificationid = v
}

// GetTimeread returns the Timeread field value if set, zero value otherwise.
func (o *CoreMessageMarkNotificationReadRequest) GetTimeread() int32 {
	if o == nil || IsNil(o.Timeread) {
		var ret int32
		return ret
	}
	return *o.Timeread
}

// GetTimereadOk returns a tuple with the Timeread field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreMessageMarkNotificationReadRequest) GetTimereadOk() (*int32, bool) {
	if o == nil || IsNil(o.Timeread) {
		return nil, false
	}
	return o.Timeread, true
}

// HasTimeread returns a boolean if a field has been set.
func (o *CoreMessageMarkNotificationReadRequest) HasTimeread() bool {
	if o != nil && !IsNil(o.Timeread) {
		return true
	}

	return false
}

// SetTimeread gets a reference to the given int32 and assigns it to the Timeread field.
func (o *CoreMessageMarkNotificationReadRequest) SetTimeread(v int32) {
	o.Timeread = &v
}

func (o CoreMessageMarkNotificationReadRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreMessageMarkNotificationReadRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["notificationid"] = o.Notificationid
	if !IsNil(o.Timeread) {
		toSerialize["timeread"] = o.Timeread
	}
	return toSerialize, nil
}

func (o *CoreMessageMarkNotificationReadRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"notificationid",
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

	varCoreMessageMarkNotificationReadRequest := _CoreMessageMarkNotificationReadRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreMessageMarkNotificationReadRequest)

	if err != nil {
		return err
	}

	*o = CoreMessageMarkNotificationReadRequest(varCoreMessageMarkNotificationReadRequest)

	return err
}

type NullableCoreMessageMarkNotificationReadRequest struct {
	value *CoreMessageMarkNotificationReadRequest
	isSet bool
}

func (v NullableCoreMessageMarkNotificationReadRequest) Get() *CoreMessageMarkNotificationReadRequest {
	return v.value
}

func (v *NullableCoreMessageMarkNotificationReadRequest) Set(val *CoreMessageMarkNotificationReadRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreMessageMarkNotificationReadRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreMessageMarkNotificationReadRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreMessageMarkNotificationReadRequest(val *CoreMessageMarkNotificationReadRequest) *NullableCoreMessageMarkNotificationReadRequest {
	return &NullableCoreMessageMarkNotificationReadRequest{value: val, isSet: true}
}

func (v NullableCoreMessageMarkNotificationReadRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreMessageMarkNotificationReadRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


