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

// checks if the ModChoiceSubmitChoiceResponse200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModChoiceSubmitChoiceResponse200Response{}

// ModChoiceSubmitChoiceResponse200Response struct for ModChoiceSubmitChoiceResponse200Response
type ModChoiceSubmitChoiceResponse200Response struct {
	Answers []ModChoiceSubmitChoiceResponse200ResponseAnswersInner `json:"answers"`
	Warnings []AuthEmailSignupUser200ResponseWarningsInner `json:"warnings,omitempty"`
}

type _ModChoiceSubmitChoiceResponse200Response ModChoiceSubmitChoiceResponse200Response

// NewModChoiceSubmitChoiceResponse200Response instantiates a new ModChoiceSubmitChoiceResponse200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModChoiceSubmitChoiceResponse200Response(answers []ModChoiceSubmitChoiceResponse200ResponseAnswersInner) *ModChoiceSubmitChoiceResponse200Response {
	this := ModChoiceSubmitChoiceResponse200Response{}
	this.Answers = answers
	return &this
}

// NewModChoiceSubmitChoiceResponse200ResponseWithDefaults instantiates a new ModChoiceSubmitChoiceResponse200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModChoiceSubmitChoiceResponse200ResponseWithDefaults() *ModChoiceSubmitChoiceResponse200Response {
	this := ModChoiceSubmitChoiceResponse200Response{}
	return &this
}

// GetAnswers returns the Answers field value
func (o *ModChoiceSubmitChoiceResponse200Response) GetAnswers() []ModChoiceSubmitChoiceResponse200ResponseAnswersInner {
	if o == nil {
		var ret []ModChoiceSubmitChoiceResponse200ResponseAnswersInner
		return ret
	}

	return o.Answers
}

// GetAnswersOk returns a tuple with the Answers field value
// and a boolean to check if the value has been set.
func (o *ModChoiceSubmitChoiceResponse200Response) GetAnswersOk() ([]ModChoiceSubmitChoiceResponse200ResponseAnswersInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Answers, true
}

// SetAnswers sets field value
func (o *ModChoiceSubmitChoiceResponse200Response) SetAnswers(v []ModChoiceSubmitChoiceResponse200ResponseAnswersInner) {
	o.Answers = v
}

// GetWarnings returns the Warnings field value if set, zero value otherwise.
func (o *ModChoiceSubmitChoiceResponse200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner {
	if o == nil || IsNil(o.Warnings) {
		var ret []AuthEmailSignupUser200ResponseWarningsInner
		return ret
	}
	return o.Warnings
}

// GetWarningsOk returns a tuple with the Warnings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceSubmitChoiceResponse200Response) GetWarningsOk() ([]AuthEmailSignupUser200ResponseWarningsInner, bool) {
	if o == nil || IsNil(o.Warnings) {
		return nil, false
	}
	return o.Warnings, true
}

// HasWarnings returns a boolean if a field has been set.
func (o *ModChoiceSubmitChoiceResponse200Response) HasWarnings() bool {
	if o != nil && !IsNil(o.Warnings) {
		return true
	}

	return false
}

// SetWarnings gets a reference to the given []AuthEmailSignupUser200ResponseWarningsInner and assigns it to the Warnings field.
func (o *ModChoiceSubmitChoiceResponse200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner) {
	o.Warnings = v
}

func (o ModChoiceSubmitChoiceResponse200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModChoiceSubmitChoiceResponse200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["answers"] = o.Answers
	if !IsNil(o.Warnings) {
		toSerialize["warnings"] = o.Warnings
	}
	return toSerialize, nil
}

func (o *ModChoiceSubmitChoiceResponse200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"answers",
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

	varModChoiceSubmitChoiceResponse200Response := _ModChoiceSubmitChoiceResponse200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModChoiceSubmitChoiceResponse200Response)

	if err != nil {
		return err
	}

	*o = ModChoiceSubmitChoiceResponse200Response(varModChoiceSubmitChoiceResponse200Response)

	return err
}

type NullableModChoiceSubmitChoiceResponse200Response struct {
	value *ModChoiceSubmitChoiceResponse200Response
	isSet bool
}

func (v NullableModChoiceSubmitChoiceResponse200Response) Get() *ModChoiceSubmitChoiceResponse200Response {
	return v.value
}

func (v *NullableModChoiceSubmitChoiceResponse200Response) Set(val *ModChoiceSubmitChoiceResponse200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableModChoiceSubmitChoiceResponse200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableModChoiceSubmitChoiceResponse200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModChoiceSubmitChoiceResponse200Response(val *ModChoiceSubmitChoiceResponse200Response) *NullableModChoiceSubmitChoiceResponse200Response {
	return &NullableModChoiceSubmitChoiceResponse200Response{value: val, isSet: true}
}

func (v NullableModChoiceSubmitChoiceResponse200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModChoiceSubmitChoiceResponse200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


