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

// checks if the ToolDataprivacyGetActivityOptions200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ToolDataprivacyGetActivityOptions200Response{}

// ToolDataprivacyGetActivityOptions200Response struct for ToolDataprivacyGetActivityOptions200Response
type ToolDataprivacyGetActivityOptions200Response struct {
	Options []ToolDataprivacyGetActivityOptions200ResponseOptionsInner `json:"options"`
	Warnings []AuthEmailSignupUser200ResponseWarningsInner `json:"warnings,omitempty"`
}

type _ToolDataprivacyGetActivityOptions200Response ToolDataprivacyGetActivityOptions200Response

// NewToolDataprivacyGetActivityOptions200Response instantiates a new ToolDataprivacyGetActivityOptions200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewToolDataprivacyGetActivityOptions200Response(options []ToolDataprivacyGetActivityOptions200ResponseOptionsInner) *ToolDataprivacyGetActivityOptions200Response {
	this := ToolDataprivacyGetActivityOptions200Response{}
	this.Options = options
	return &this
}

// NewToolDataprivacyGetActivityOptions200ResponseWithDefaults instantiates a new ToolDataprivacyGetActivityOptions200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewToolDataprivacyGetActivityOptions200ResponseWithDefaults() *ToolDataprivacyGetActivityOptions200Response {
	this := ToolDataprivacyGetActivityOptions200Response{}
	return &this
}

// GetOptions returns the Options field value
func (o *ToolDataprivacyGetActivityOptions200Response) GetOptions() []ToolDataprivacyGetActivityOptions200ResponseOptionsInner {
	if o == nil {
		var ret []ToolDataprivacyGetActivityOptions200ResponseOptionsInner
		return ret
	}

	return o.Options
}

// GetOptionsOk returns a tuple with the Options field value
// and a boolean to check if the value has been set.
func (o *ToolDataprivacyGetActivityOptions200Response) GetOptionsOk() ([]ToolDataprivacyGetActivityOptions200ResponseOptionsInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Options, true
}

// SetOptions sets field value
func (o *ToolDataprivacyGetActivityOptions200Response) SetOptions(v []ToolDataprivacyGetActivityOptions200ResponseOptionsInner) {
	o.Options = v
}

// GetWarnings returns the Warnings field value if set, zero value otherwise.
func (o *ToolDataprivacyGetActivityOptions200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner {
	if o == nil || IsNil(o.Warnings) {
		var ret []AuthEmailSignupUser200ResponseWarningsInner
		return ret
	}
	return o.Warnings
}

// GetWarningsOk returns a tuple with the Warnings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ToolDataprivacyGetActivityOptions200Response) GetWarningsOk() ([]AuthEmailSignupUser200ResponseWarningsInner, bool) {
	if o == nil || IsNil(o.Warnings) {
		return nil, false
	}
	return o.Warnings, true
}

// HasWarnings returns a boolean if a field has been set.
func (o *ToolDataprivacyGetActivityOptions200Response) HasWarnings() bool {
	if o != nil && !IsNil(o.Warnings) {
		return true
	}

	return false
}

// SetWarnings gets a reference to the given []AuthEmailSignupUser200ResponseWarningsInner and assigns it to the Warnings field.
func (o *ToolDataprivacyGetActivityOptions200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner) {
	o.Warnings = v
}

func (o ToolDataprivacyGetActivityOptions200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ToolDataprivacyGetActivityOptions200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["options"] = o.Options
	if !IsNil(o.Warnings) {
		toSerialize["warnings"] = o.Warnings
	}
	return toSerialize, nil
}

func (o *ToolDataprivacyGetActivityOptions200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"options",
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

	varToolDataprivacyGetActivityOptions200Response := _ToolDataprivacyGetActivityOptions200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varToolDataprivacyGetActivityOptions200Response)

	if err != nil {
		return err
	}

	*o = ToolDataprivacyGetActivityOptions200Response(varToolDataprivacyGetActivityOptions200Response)

	return err
}

type NullableToolDataprivacyGetActivityOptions200Response struct {
	value *ToolDataprivacyGetActivityOptions200Response
	isSet bool
}

func (v NullableToolDataprivacyGetActivityOptions200Response) Get() *ToolDataprivacyGetActivityOptions200Response {
	return v.value
}

func (v *NullableToolDataprivacyGetActivityOptions200Response) Set(val *ToolDataprivacyGetActivityOptions200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableToolDataprivacyGetActivityOptions200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableToolDataprivacyGetActivityOptions200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableToolDataprivacyGetActivityOptions200Response(val *ToolDataprivacyGetActivityOptions200Response) *NullableToolDataprivacyGetActivityOptions200Response {
	return &NullableToolDataprivacyGetActivityOptions200Response{value: val, isSet: true}
}

func (v NullableToolDataprivacyGetActivityOptions200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableToolDataprivacyGetActivityOptions200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

