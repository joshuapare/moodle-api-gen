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

// checks if the CoreMessageDeleteMessageRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreMessageDeleteMessageRequest{}

// CoreMessageDeleteMessageRequest struct for CoreMessageDeleteMessageRequest
type CoreMessageDeleteMessageRequest struct {
	// The message id
	Messageid int32 `json:"messageid"`
	// If is a message read
	Read *bool `json:"read,omitempty"`
	// The user id of who we want to delete the message for
	Userid int32 `json:"userid"`
}

type _CoreMessageDeleteMessageRequest CoreMessageDeleteMessageRequest

// NewCoreMessageDeleteMessageRequest instantiates a new CoreMessageDeleteMessageRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreMessageDeleteMessageRequest(messageid int32, userid int32) *CoreMessageDeleteMessageRequest {
	this := CoreMessageDeleteMessageRequest{}
	this.Messageid = messageid
	var read bool = true
	this.Read = &read
	this.Userid = userid
	return &this
}

// NewCoreMessageDeleteMessageRequestWithDefaults instantiates a new CoreMessageDeleteMessageRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreMessageDeleteMessageRequestWithDefaults() *CoreMessageDeleteMessageRequest {
	this := CoreMessageDeleteMessageRequest{}
	var messageid int32 = null
	this.Messageid = messageid
	var read bool = true
	this.Read = &read
	var userid int32 = null
	this.Userid = userid
	return &this
}

// GetMessageid returns the Messageid field value
func (o *CoreMessageDeleteMessageRequest) GetMessageid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Messageid
}

// GetMessageidOk returns a tuple with the Messageid field value
// and a boolean to check if the value has been set.
func (o *CoreMessageDeleteMessageRequest) GetMessageidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Messageid, true
}

// SetMessageid sets field value
func (o *CoreMessageDeleteMessageRequest) SetMessageid(v int32) {
	o.Messageid = v
}

// GetRead returns the Read field value if set, zero value otherwise.
func (o *CoreMessageDeleteMessageRequest) GetRead() bool {
	if o == nil || IsNil(o.Read) {
		var ret bool
		return ret
	}
	return *o.Read
}

// GetReadOk returns a tuple with the Read field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreMessageDeleteMessageRequest) GetReadOk() (*bool, bool) {
	if o == nil || IsNil(o.Read) {
		return nil, false
	}
	return o.Read, true
}

// HasRead returns a boolean if a field has been set.
func (o *CoreMessageDeleteMessageRequest) HasRead() bool {
	if o != nil && !IsNil(o.Read) {
		return true
	}

	return false
}

// SetRead gets a reference to the given bool and assigns it to the Read field.
func (o *CoreMessageDeleteMessageRequest) SetRead(v bool) {
	o.Read = &v
}

// GetUserid returns the Userid field value
func (o *CoreMessageDeleteMessageRequest) GetUserid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Userid
}

// GetUseridOk returns a tuple with the Userid field value
// and a boolean to check if the value has been set.
func (o *CoreMessageDeleteMessageRequest) GetUseridOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Userid, true
}

// SetUserid sets field value
func (o *CoreMessageDeleteMessageRequest) SetUserid(v int32) {
	o.Userid = v
}

func (o CoreMessageDeleteMessageRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreMessageDeleteMessageRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["messageid"] = o.Messageid
	if !IsNil(o.Read) {
		toSerialize["read"] = o.Read
	}
	toSerialize["userid"] = o.Userid
	return toSerialize, nil
}

func (o *CoreMessageDeleteMessageRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"messageid",
		"userid",
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

	varCoreMessageDeleteMessageRequest := _CoreMessageDeleteMessageRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreMessageDeleteMessageRequest)

	if err != nil {
		return err
	}

	*o = CoreMessageDeleteMessageRequest(varCoreMessageDeleteMessageRequest)

	return err
}

type NullableCoreMessageDeleteMessageRequest struct {
	value *CoreMessageDeleteMessageRequest
	isSet bool
}

func (v NullableCoreMessageDeleteMessageRequest) Get() *CoreMessageDeleteMessageRequest {
	return v.value
}

func (v *NullableCoreMessageDeleteMessageRequest) Set(val *CoreMessageDeleteMessageRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreMessageDeleteMessageRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreMessageDeleteMessageRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreMessageDeleteMessageRequest(val *CoreMessageDeleteMessageRequest) *NullableCoreMessageDeleteMessageRequest {
	return &NullableCoreMessageDeleteMessageRequest{value: val, isSet: true}
}

func (v NullableCoreMessageDeleteMessageRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreMessageDeleteMessageRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


