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

// checks if the MessageAirnotifierEnableDevice200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &MessageAirnotifierEnableDevice200Response{}

// MessageAirnotifierEnableDevice200Response struct for MessageAirnotifierEnableDevice200Response
type MessageAirnotifierEnableDevice200Response struct {
	// True if success
	Success bool `json:"success"`
	Warnings []AuthEmailSignupUser200ResponseWarningsInner `json:"warnings,omitempty"`
}

type _MessageAirnotifierEnableDevice200Response MessageAirnotifierEnableDevice200Response

// NewMessageAirnotifierEnableDevice200Response instantiates a new MessageAirnotifierEnableDevice200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewMessageAirnotifierEnableDevice200Response(success bool) *MessageAirnotifierEnableDevice200Response {
	this := MessageAirnotifierEnableDevice200Response{}
	this.Success = success
	return &this
}

// NewMessageAirnotifierEnableDevice200ResponseWithDefaults instantiates a new MessageAirnotifierEnableDevice200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewMessageAirnotifierEnableDevice200ResponseWithDefaults() *MessageAirnotifierEnableDevice200Response {
	this := MessageAirnotifierEnableDevice200Response{}
	var success bool = null
	this.Success = success
	return &this
}

// GetSuccess returns the Success field value
func (o *MessageAirnotifierEnableDevice200Response) GetSuccess() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Success
}

// GetSuccessOk returns a tuple with the Success field value
// and a boolean to check if the value has been set.
func (o *MessageAirnotifierEnableDevice200Response) GetSuccessOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Success, true
}

// SetSuccess sets field value
func (o *MessageAirnotifierEnableDevice200Response) SetSuccess(v bool) {
	o.Success = v
}

// GetWarnings returns the Warnings field value if set, zero value otherwise.
func (o *MessageAirnotifierEnableDevice200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner {
	if o == nil || IsNil(o.Warnings) {
		var ret []AuthEmailSignupUser200ResponseWarningsInner
		return ret
	}
	return o.Warnings
}

// GetWarningsOk returns a tuple with the Warnings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MessageAirnotifierEnableDevice200Response) GetWarningsOk() ([]AuthEmailSignupUser200ResponseWarningsInner, bool) {
	if o == nil || IsNil(o.Warnings) {
		return nil, false
	}
	return o.Warnings, true
}

// HasWarnings returns a boolean if a field has been set.
func (o *MessageAirnotifierEnableDevice200Response) HasWarnings() bool {
	if o != nil && !IsNil(o.Warnings) {
		return true
	}

	return false
}

// SetWarnings gets a reference to the given []AuthEmailSignupUser200ResponseWarningsInner and assigns it to the Warnings field.
func (o *MessageAirnotifierEnableDevice200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner) {
	o.Warnings = v
}

func (o MessageAirnotifierEnableDevice200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o MessageAirnotifierEnableDevice200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["success"] = o.Success
	if !IsNil(o.Warnings) {
		toSerialize["warnings"] = o.Warnings
	}
	return toSerialize, nil
}

func (o *MessageAirnotifierEnableDevice200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"success",
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

	varMessageAirnotifierEnableDevice200Response := _MessageAirnotifierEnableDevice200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varMessageAirnotifierEnableDevice200Response)

	if err != nil {
		return err
	}

	*o = MessageAirnotifierEnableDevice200Response(varMessageAirnotifierEnableDevice200Response)

	return err
}

type NullableMessageAirnotifierEnableDevice200Response struct {
	value *MessageAirnotifierEnableDevice200Response
	isSet bool
}

func (v NullableMessageAirnotifierEnableDevice200Response) Get() *MessageAirnotifierEnableDevice200Response {
	return v.value
}

func (v *NullableMessageAirnotifierEnableDevice200Response) Set(val *MessageAirnotifierEnableDevice200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableMessageAirnotifierEnableDevice200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableMessageAirnotifierEnableDevice200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMessageAirnotifierEnableDevice200Response(val *MessageAirnotifierEnableDevice200Response) *NullableMessageAirnotifierEnableDevice200Response {
	return &NullableMessageAirnotifierEnableDevice200Response{value: val, isSet: true}
}

func (v NullableMessageAirnotifierEnableDevice200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMessageAirnotifierEnableDevice200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

