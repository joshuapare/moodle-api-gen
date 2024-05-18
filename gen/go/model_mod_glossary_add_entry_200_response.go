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

// checks if the ModGlossaryAddEntry200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModGlossaryAddEntry200Response{}

// ModGlossaryAddEntry200Response struct for ModGlossaryAddEntry200Response
type ModGlossaryAddEntry200Response struct {
	// New glossary entry ID
	Entryid int32 `json:"entryid"`
	Warnings []AuthEmailSignupUser200ResponseWarningsInner `json:"warnings,omitempty"`
}

type _ModGlossaryAddEntry200Response ModGlossaryAddEntry200Response

// NewModGlossaryAddEntry200Response instantiates a new ModGlossaryAddEntry200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModGlossaryAddEntry200Response(entryid int32) *ModGlossaryAddEntry200Response {
	this := ModGlossaryAddEntry200Response{}
	this.Entryid = entryid
	return &this
}

// NewModGlossaryAddEntry200ResponseWithDefaults instantiates a new ModGlossaryAddEntry200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModGlossaryAddEntry200ResponseWithDefaults() *ModGlossaryAddEntry200Response {
	this := ModGlossaryAddEntry200Response{}
	var entryid int32 = null
	this.Entryid = entryid
	return &this
}

// GetEntryid returns the Entryid field value
func (o *ModGlossaryAddEntry200Response) GetEntryid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Entryid
}

// GetEntryidOk returns a tuple with the Entryid field value
// and a boolean to check if the value has been set.
func (o *ModGlossaryAddEntry200Response) GetEntryidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Entryid, true
}

// SetEntryid sets field value
func (o *ModGlossaryAddEntry200Response) SetEntryid(v int32) {
	o.Entryid = v
}

// GetWarnings returns the Warnings field value if set, zero value otherwise.
func (o *ModGlossaryAddEntry200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner {
	if o == nil || IsNil(o.Warnings) {
		var ret []AuthEmailSignupUser200ResponseWarningsInner
		return ret
	}
	return o.Warnings
}

// GetWarningsOk returns a tuple with the Warnings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModGlossaryAddEntry200Response) GetWarningsOk() ([]AuthEmailSignupUser200ResponseWarningsInner, bool) {
	if o == nil || IsNil(o.Warnings) {
		return nil, false
	}
	return o.Warnings, true
}

// HasWarnings returns a boolean if a field has been set.
func (o *ModGlossaryAddEntry200Response) HasWarnings() bool {
	if o != nil && !IsNil(o.Warnings) {
		return true
	}

	return false
}

// SetWarnings gets a reference to the given []AuthEmailSignupUser200ResponseWarningsInner and assigns it to the Warnings field.
func (o *ModGlossaryAddEntry200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner) {
	o.Warnings = v
}

func (o ModGlossaryAddEntry200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModGlossaryAddEntry200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["entryid"] = o.Entryid
	if !IsNil(o.Warnings) {
		toSerialize["warnings"] = o.Warnings
	}
	return toSerialize, nil
}

func (o *ModGlossaryAddEntry200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"entryid",
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

	varModGlossaryAddEntry200Response := _ModGlossaryAddEntry200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModGlossaryAddEntry200Response)

	if err != nil {
		return err
	}

	*o = ModGlossaryAddEntry200Response(varModGlossaryAddEntry200Response)

	return err
}

type NullableModGlossaryAddEntry200Response struct {
	value *ModGlossaryAddEntry200Response
	isSet bool
}

func (v NullableModGlossaryAddEntry200Response) Get() *ModGlossaryAddEntry200Response {
	return v.value
}

func (v *NullableModGlossaryAddEntry200Response) Set(val *ModGlossaryAddEntry200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableModGlossaryAddEntry200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableModGlossaryAddEntry200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModGlossaryAddEntry200Response(val *ModGlossaryAddEntry200Response) *NullableModGlossaryAddEntry200Response {
	return &NullableModGlossaryAddEntry200Response{value: val, isSet: true}
}

func (v NullableModGlossaryAddEntry200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModGlossaryAddEntry200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

