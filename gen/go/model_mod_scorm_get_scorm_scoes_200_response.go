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

// checks if the ModScormGetScormScoes200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModScormGetScormScoes200Response{}

// ModScormGetScormScoes200Response struct for ModScormGetScormScoes200Response
type ModScormGetScormScoes200Response struct {
	Scoes []ModScormGetScormScoes200ResponseScoesInner `json:"scoes"`
	Warnings []AuthEmailSignupUser200ResponseWarningsInner `json:"warnings,omitempty"`
}

type _ModScormGetScormScoes200Response ModScormGetScormScoes200Response

// NewModScormGetScormScoes200Response instantiates a new ModScormGetScormScoes200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModScormGetScormScoes200Response(scoes []ModScormGetScormScoes200ResponseScoesInner) *ModScormGetScormScoes200Response {
	this := ModScormGetScormScoes200Response{}
	this.Scoes = scoes
	return &this
}

// NewModScormGetScormScoes200ResponseWithDefaults instantiates a new ModScormGetScormScoes200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModScormGetScormScoes200ResponseWithDefaults() *ModScormGetScormScoes200Response {
	this := ModScormGetScormScoes200Response{}
	return &this
}

// GetScoes returns the Scoes field value
func (o *ModScormGetScormScoes200Response) GetScoes() []ModScormGetScormScoes200ResponseScoesInner {
	if o == nil {
		var ret []ModScormGetScormScoes200ResponseScoesInner
		return ret
	}

	return o.Scoes
}

// GetScoesOk returns a tuple with the Scoes field value
// and a boolean to check if the value has been set.
func (o *ModScormGetScormScoes200Response) GetScoesOk() ([]ModScormGetScormScoes200ResponseScoesInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Scoes, true
}

// SetScoes sets field value
func (o *ModScormGetScormScoes200Response) SetScoes(v []ModScormGetScormScoes200ResponseScoesInner) {
	o.Scoes = v
}

// GetWarnings returns the Warnings field value if set, zero value otherwise.
func (o *ModScormGetScormScoes200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner {
	if o == nil || IsNil(o.Warnings) {
		var ret []AuthEmailSignupUser200ResponseWarningsInner
		return ret
	}
	return o.Warnings
}

// GetWarningsOk returns a tuple with the Warnings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModScormGetScormScoes200Response) GetWarningsOk() ([]AuthEmailSignupUser200ResponseWarningsInner, bool) {
	if o == nil || IsNil(o.Warnings) {
		return nil, false
	}
	return o.Warnings, true
}

// HasWarnings returns a boolean if a field has been set.
func (o *ModScormGetScormScoes200Response) HasWarnings() bool {
	if o != nil && !IsNil(o.Warnings) {
		return true
	}

	return false
}

// SetWarnings gets a reference to the given []AuthEmailSignupUser200ResponseWarningsInner and assigns it to the Warnings field.
func (o *ModScormGetScormScoes200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner) {
	o.Warnings = v
}

func (o ModScormGetScormScoes200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModScormGetScormScoes200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["scoes"] = o.Scoes
	if !IsNil(o.Warnings) {
		toSerialize["warnings"] = o.Warnings
	}
	return toSerialize, nil
}

func (o *ModScormGetScormScoes200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"scoes",
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

	varModScormGetScormScoes200Response := _ModScormGetScormScoes200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModScormGetScormScoes200Response)

	if err != nil {
		return err
	}

	*o = ModScormGetScormScoes200Response(varModScormGetScormScoes200Response)

	return err
}

type NullableModScormGetScormScoes200Response struct {
	value *ModScormGetScormScoes200Response
	isSet bool
}

func (v NullableModScormGetScormScoes200Response) Get() *ModScormGetScormScoes200Response {
	return v.value
}

func (v *NullableModScormGetScormScoes200Response) Set(val *ModScormGetScormScoes200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableModScormGetScormScoes200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableModScormGetScormScoes200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModScormGetScormScoes200Response(val *ModScormGetScormScoes200Response) *NullableModScormGetScormScoes200Response {
	return &NullableModScormGetScormScoes200Response{value: val, isSet: true}
}

func (v NullableModScormGetScormScoes200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModScormGetScormScoes200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


