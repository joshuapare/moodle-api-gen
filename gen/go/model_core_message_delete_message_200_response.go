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

// checks if the CoreMessageDeleteMessage200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreMessageDeleteMessage200Response{}

// CoreMessageDeleteMessage200Response struct for CoreMessageDeleteMessage200Response
type CoreMessageDeleteMessage200Response struct {
	// True if the message was deleted, false otherwise
	Status bool `json:"status"`
	Warnings []AuthEmailSignupUser200ResponseWarningsInner `json:"warnings,omitempty"`
}

type _CoreMessageDeleteMessage200Response CoreMessageDeleteMessage200Response

// NewCoreMessageDeleteMessage200Response instantiates a new CoreMessageDeleteMessage200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreMessageDeleteMessage200Response(status bool) *CoreMessageDeleteMessage200Response {
	this := CoreMessageDeleteMessage200Response{}
	this.Status = status
	return &this
}

// NewCoreMessageDeleteMessage200ResponseWithDefaults instantiates a new CoreMessageDeleteMessage200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreMessageDeleteMessage200ResponseWithDefaults() *CoreMessageDeleteMessage200Response {
	this := CoreMessageDeleteMessage200Response{}
	var status bool = null
	this.Status = status
	return &this
}

// GetStatus returns the Status field value
func (o *CoreMessageDeleteMessage200Response) GetStatus() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Status
}

// GetStatusOk returns a tuple with the Status field value
// and a boolean to check if the value has been set.
func (o *CoreMessageDeleteMessage200Response) GetStatusOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Status, true
}

// SetStatus sets field value
func (o *CoreMessageDeleteMessage200Response) SetStatus(v bool) {
	o.Status = v
}

// GetWarnings returns the Warnings field value if set, zero value otherwise.
func (o *CoreMessageDeleteMessage200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner {
	if o == nil || IsNil(o.Warnings) {
		var ret []AuthEmailSignupUser200ResponseWarningsInner
		return ret
	}
	return o.Warnings
}

// GetWarningsOk returns a tuple with the Warnings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreMessageDeleteMessage200Response) GetWarningsOk() ([]AuthEmailSignupUser200ResponseWarningsInner, bool) {
	if o == nil || IsNil(o.Warnings) {
		return nil, false
	}
	return o.Warnings, true
}

// HasWarnings returns a boolean if a field has been set.
func (o *CoreMessageDeleteMessage200Response) HasWarnings() bool {
	if o != nil && !IsNil(o.Warnings) {
		return true
	}

	return false
}

// SetWarnings gets a reference to the given []AuthEmailSignupUser200ResponseWarningsInner and assigns it to the Warnings field.
func (o *CoreMessageDeleteMessage200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner) {
	o.Warnings = v
}

func (o CoreMessageDeleteMessage200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreMessageDeleteMessage200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["status"] = o.Status
	if !IsNil(o.Warnings) {
		toSerialize["warnings"] = o.Warnings
	}
	return toSerialize, nil
}

func (o *CoreMessageDeleteMessage200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"status",
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

	varCoreMessageDeleteMessage200Response := _CoreMessageDeleteMessage200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreMessageDeleteMessage200Response)

	if err != nil {
		return err
	}

	*o = CoreMessageDeleteMessage200Response(varCoreMessageDeleteMessage200Response)

	return err
}

type NullableCoreMessageDeleteMessage200Response struct {
	value *CoreMessageDeleteMessage200Response
	isSet bool
}

func (v NullableCoreMessageDeleteMessage200Response) Get() *CoreMessageDeleteMessage200Response {
	return v.value
}

func (v *NullableCoreMessageDeleteMessage200Response) Set(val *CoreMessageDeleteMessage200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreMessageDeleteMessage200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreMessageDeleteMessage200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreMessageDeleteMessage200Response(val *CoreMessageDeleteMessage200Response) *NullableCoreMessageDeleteMessage200Response {
	return &NullableCoreMessageDeleteMessage200Response{value: val, isSet: true}
}

func (v NullableCoreMessageDeleteMessage200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreMessageDeleteMessage200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


