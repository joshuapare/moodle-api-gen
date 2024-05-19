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

// checks if the ModFeedbackGetCurrentCompletedTmp200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModFeedbackGetCurrentCompletedTmp200Response{}

// ModFeedbackGetCurrentCompletedTmp200Response struct for ModFeedbackGetCurrentCompletedTmp200Response
type ModFeedbackGetCurrentCompletedTmp200Response struct {
	Feedback ModFeedbackGetCurrentCompletedTmp200ResponseFeedback `json:"feedback"`
	Warnings []AuthEmailSignupUser200ResponseWarningsInner `json:"warnings,omitempty"`
}

type _ModFeedbackGetCurrentCompletedTmp200Response ModFeedbackGetCurrentCompletedTmp200Response

// NewModFeedbackGetCurrentCompletedTmp200Response instantiates a new ModFeedbackGetCurrentCompletedTmp200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModFeedbackGetCurrentCompletedTmp200Response(feedback ModFeedbackGetCurrentCompletedTmp200ResponseFeedback) *ModFeedbackGetCurrentCompletedTmp200Response {
	this := ModFeedbackGetCurrentCompletedTmp200Response{}
	this.Feedback = feedback
	return &this
}

// NewModFeedbackGetCurrentCompletedTmp200ResponseWithDefaults instantiates a new ModFeedbackGetCurrentCompletedTmp200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModFeedbackGetCurrentCompletedTmp200ResponseWithDefaults() *ModFeedbackGetCurrentCompletedTmp200Response {
	this := ModFeedbackGetCurrentCompletedTmp200Response{}
	return &this
}

// GetFeedback returns the Feedback field value
func (o *ModFeedbackGetCurrentCompletedTmp200Response) GetFeedback() ModFeedbackGetCurrentCompletedTmp200ResponseFeedback {
	if o == nil {
		var ret ModFeedbackGetCurrentCompletedTmp200ResponseFeedback
		return ret
	}

	return o.Feedback
}

// GetFeedbackOk returns a tuple with the Feedback field value
// and a boolean to check if the value has been set.
func (o *ModFeedbackGetCurrentCompletedTmp200Response) GetFeedbackOk() (*ModFeedbackGetCurrentCompletedTmp200ResponseFeedback, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Feedback, true
}

// SetFeedback sets field value
func (o *ModFeedbackGetCurrentCompletedTmp200Response) SetFeedback(v ModFeedbackGetCurrentCompletedTmp200ResponseFeedback) {
	o.Feedback = v
}

// GetWarnings returns the Warnings field value if set, zero value otherwise.
func (o *ModFeedbackGetCurrentCompletedTmp200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner {
	if o == nil || IsNil(o.Warnings) {
		var ret []AuthEmailSignupUser200ResponseWarningsInner
		return ret
	}
	return o.Warnings
}

// GetWarningsOk returns a tuple with the Warnings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModFeedbackGetCurrentCompletedTmp200Response) GetWarningsOk() ([]AuthEmailSignupUser200ResponseWarningsInner, bool) {
	if o == nil || IsNil(o.Warnings) {
		return nil, false
	}
	return o.Warnings, true
}

// HasWarnings returns a boolean if a field has been set.
func (o *ModFeedbackGetCurrentCompletedTmp200Response) HasWarnings() bool {
	if o != nil && !IsNil(o.Warnings) {
		return true
	}

	return false
}

// SetWarnings gets a reference to the given []AuthEmailSignupUser200ResponseWarningsInner and assigns it to the Warnings field.
func (o *ModFeedbackGetCurrentCompletedTmp200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner) {
	o.Warnings = v
}

func (o ModFeedbackGetCurrentCompletedTmp200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModFeedbackGetCurrentCompletedTmp200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["feedback"] = o.Feedback
	if !IsNil(o.Warnings) {
		toSerialize["warnings"] = o.Warnings
	}
	return toSerialize, nil
}

func (o *ModFeedbackGetCurrentCompletedTmp200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"feedback",
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

	varModFeedbackGetCurrentCompletedTmp200Response := _ModFeedbackGetCurrentCompletedTmp200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModFeedbackGetCurrentCompletedTmp200Response)

	if err != nil {
		return err
	}

	*o = ModFeedbackGetCurrentCompletedTmp200Response(varModFeedbackGetCurrentCompletedTmp200Response)

	return err
}

type NullableModFeedbackGetCurrentCompletedTmp200Response struct {
	value *ModFeedbackGetCurrentCompletedTmp200Response
	isSet bool
}

func (v NullableModFeedbackGetCurrentCompletedTmp200Response) Get() *ModFeedbackGetCurrentCompletedTmp200Response {
	return v.value
}

func (v *NullableModFeedbackGetCurrentCompletedTmp200Response) Set(val *ModFeedbackGetCurrentCompletedTmp200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableModFeedbackGetCurrentCompletedTmp200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableModFeedbackGetCurrentCompletedTmp200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModFeedbackGetCurrentCompletedTmp200Response(val *ModFeedbackGetCurrentCompletedTmp200Response) *NullableModFeedbackGetCurrentCompletedTmp200Response {
	return &NullableModFeedbackGetCurrentCompletedTmp200Response{value: val, isSet: true}
}

func (v NullableModFeedbackGetCurrentCompletedTmp200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModFeedbackGetCurrentCompletedTmp200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


