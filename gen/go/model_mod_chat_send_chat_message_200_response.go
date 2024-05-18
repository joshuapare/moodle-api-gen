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

// checks if the ModChatSendChatMessage200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModChatSendChatMessage200Response{}

// ModChatSendChatMessage200Response struct for ModChatSendChatMessage200Response
type ModChatSendChatMessage200Response struct {
	// message sent id
	Messageid int32 `json:"messageid"`
	Warnings []AuthEmailSignupUser200ResponseWarningsInner `json:"warnings,omitempty"`
}

type _ModChatSendChatMessage200Response ModChatSendChatMessage200Response

// NewModChatSendChatMessage200Response instantiates a new ModChatSendChatMessage200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModChatSendChatMessage200Response(messageid int32) *ModChatSendChatMessage200Response {
	this := ModChatSendChatMessage200Response{}
	this.Messageid = messageid
	return &this
}

// NewModChatSendChatMessage200ResponseWithDefaults instantiates a new ModChatSendChatMessage200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModChatSendChatMessage200ResponseWithDefaults() *ModChatSendChatMessage200Response {
	this := ModChatSendChatMessage200Response{}
	var messageid int32 = null
	this.Messageid = messageid
	return &this
}

// GetMessageid returns the Messageid field value
func (o *ModChatSendChatMessage200Response) GetMessageid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Messageid
}

// GetMessageidOk returns a tuple with the Messageid field value
// and a boolean to check if the value has been set.
func (o *ModChatSendChatMessage200Response) GetMessageidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Messageid, true
}

// SetMessageid sets field value
func (o *ModChatSendChatMessage200Response) SetMessageid(v int32) {
	o.Messageid = v
}

// GetWarnings returns the Warnings field value if set, zero value otherwise.
func (o *ModChatSendChatMessage200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner {
	if o == nil || IsNil(o.Warnings) {
		var ret []AuthEmailSignupUser200ResponseWarningsInner
		return ret
	}
	return o.Warnings
}

// GetWarningsOk returns a tuple with the Warnings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChatSendChatMessage200Response) GetWarningsOk() ([]AuthEmailSignupUser200ResponseWarningsInner, bool) {
	if o == nil || IsNil(o.Warnings) {
		return nil, false
	}
	return o.Warnings, true
}

// HasWarnings returns a boolean if a field has been set.
func (o *ModChatSendChatMessage200Response) HasWarnings() bool {
	if o != nil && !IsNil(o.Warnings) {
		return true
	}

	return false
}

// SetWarnings gets a reference to the given []AuthEmailSignupUser200ResponseWarningsInner and assigns it to the Warnings field.
func (o *ModChatSendChatMessage200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner) {
	o.Warnings = v
}

func (o ModChatSendChatMessage200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModChatSendChatMessage200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["messageid"] = o.Messageid
	if !IsNil(o.Warnings) {
		toSerialize["warnings"] = o.Warnings
	}
	return toSerialize, nil
}

func (o *ModChatSendChatMessage200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"messageid",
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

	varModChatSendChatMessage200Response := _ModChatSendChatMessage200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModChatSendChatMessage200Response)

	if err != nil {
		return err
	}

	*o = ModChatSendChatMessage200Response(varModChatSendChatMessage200Response)

	return err
}

type NullableModChatSendChatMessage200Response struct {
	value *ModChatSendChatMessage200Response
	isSet bool
}

func (v NullableModChatSendChatMessage200Response) Get() *ModChatSendChatMessage200Response {
	return v.value
}

func (v *NullableModChatSendChatMessage200Response) Set(val *ModChatSendChatMessage200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableModChatSendChatMessage200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableModChatSendChatMessage200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModChatSendChatMessage200Response(val *ModChatSendChatMessage200Response) *NullableModChatSendChatMessage200Response {
	return &NullableModChatSendChatMessage200Response{value: val, isSet: true}
}

func (v NullableModChatSendChatMessage200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModChatSendChatMessage200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

