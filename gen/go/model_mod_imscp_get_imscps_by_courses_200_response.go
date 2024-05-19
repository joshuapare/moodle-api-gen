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

// checks if the ModImscpGetImscpsByCourses200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModImscpGetImscpsByCourses200Response{}

// ModImscpGetImscpsByCourses200Response struct for ModImscpGetImscpsByCourses200Response
type ModImscpGetImscpsByCourses200Response struct {
	Imscps []ModImscpGetImscpsByCourses200ResponseImscpsInner `json:"imscps"`
	Warnings []AuthEmailSignupUser200ResponseWarningsInner `json:"warnings,omitempty"`
}

type _ModImscpGetImscpsByCourses200Response ModImscpGetImscpsByCourses200Response

// NewModImscpGetImscpsByCourses200Response instantiates a new ModImscpGetImscpsByCourses200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModImscpGetImscpsByCourses200Response(imscps []ModImscpGetImscpsByCourses200ResponseImscpsInner) *ModImscpGetImscpsByCourses200Response {
	this := ModImscpGetImscpsByCourses200Response{}
	this.Imscps = imscps
	return &this
}

// NewModImscpGetImscpsByCourses200ResponseWithDefaults instantiates a new ModImscpGetImscpsByCourses200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModImscpGetImscpsByCourses200ResponseWithDefaults() *ModImscpGetImscpsByCourses200Response {
	this := ModImscpGetImscpsByCourses200Response{}
	return &this
}

// GetImscps returns the Imscps field value
func (o *ModImscpGetImscpsByCourses200Response) GetImscps() []ModImscpGetImscpsByCourses200ResponseImscpsInner {
	if o == nil {
		var ret []ModImscpGetImscpsByCourses200ResponseImscpsInner
		return ret
	}

	return o.Imscps
}

// GetImscpsOk returns a tuple with the Imscps field value
// and a boolean to check if the value has been set.
func (o *ModImscpGetImscpsByCourses200Response) GetImscpsOk() ([]ModImscpGetImscpsByCourses200ResponseImscpsInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Imscps, true
}

// SetImscps sets field value
func (o *ModImscpGetImscpsByCourses200Response) SetImscps(v []ModImscpGetImscpsByCourses200ResponseImscpsInner) {
	o.Imscps = v
}

// GetWarnings returns the Warnings field value if set, zero value otherwise.
func (o *ModImscpGetImscpsByCourses200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner {
	if o == nil || IsNil(o.Warnings) {
		var ret []AuthEmailSignupUser200ResponseWarningsInner
		return ret
	}
	return o.Warnings
}

// GetWarningsOk returns a tuple with the Warnings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModImscpGetImscpsByCourses200Response) GetWarningsOk() ([]AuthEmailSignupUser200ResponseWarningsInner, bool) {
	if o == nil || IsNil(o.Warnings) {
		return nil, false
	}
	return o.Warnings, true
}

// HasWarnings returns a boolean if a field has been set.
func (o *ModImscpGetImscpsByCourses200Response) HasWarnings() bool {
	if o != nil && !IsNil(o.Warnings) {
		return true
	}

	return false
}

// SetWarnings gets a reference to the given []AuthEmailSignupUser200ResponseWarningsInner and assigns it to the Warnings field.
func (o *ModImscpGetImscpsByCourses200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner) {
	o.Warnings = v
}

func (o ModImscpGetImscpsByCourses200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModImscpGetImscpsByCourses200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["imscps"] = o.Imscps
	if !IsNil(o.Warnings) {
		toSerialize["warnings"] = o.Warnings
	}
	return toSerialize, nil
}

func (o *ModImscpGetImscpsByCourses200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"imscps",
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

	varModImscpGetImscpsByCourses200Response := _ModImscpGetImscpsByCourses200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModImscpGetImscpsByCourses200Response)

	if err != nil {
		return err
	}

	*o = ModImscpGetImscpsByCourses200Response(varModImscpGetImscpsByCourses200Response)

	return err
}

type NullableModImscpGetImscpsByCourses200Response struct {
	value *ModImscpGetImscpsByCourses200Response
	isSet bool
}

func (v NullableModImscpGetImscpsByCourses200Response) Get() *ModImscpGetImscpsByCourses200Response {
	return v.value
}

func (v *NullableModImscpGetImscpsByCourses200Response) Set(val *ModImscpGetImscpsByCourses200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableModImscpGetImscpsByCourses200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableModImscpGetImscpsByCourses200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModImscpGetImscpsByCourses200Response(val *ModImscpGetImscpsByCourses200Response) *NullableModImscpGetImscpsByCourses200Response {
	return &NullableModImscpGetImscpsByCourses200Response{value: val, isSet: true}
}

func (v NullableModImscpGetImscpsByCourses200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModImscpGetImscpsByCourses200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


