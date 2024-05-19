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

// checks if the ToolIomadpolicyGetIomadpolicyVersion200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ToolIomadpolicyGetIomadpolicyVersion200Response{}

// ToolIomadpolicyGetIomadpolicyVersion200Response struct for ToolIomadpolicyGetIomadpolicyVersion200Response
type ToolIomadpolicyGetIomadpolicyVersion200Response struct {
	Result ToolIomadpolicyGetIomadpolicyVersion200ResponseResult `json:"result"`
	Warnings []AuthEmailSignupUser200ResponseWarningsInner `json:"warnings,omitempty"`
}

type _ToolIomadpolicyGetIomadpolicyVersion200Response ToolIomadpolicyGetIomadpolicyVersion200Response

// NewToolIomadpolicyGetIomadpolicyVersion200Response instantiates a new ToolIomadpolicyGetIomadpolicyVersion200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewToolIomadpolicyGetIomadpolicyVersion200Response(result ToolIomadpolicyGetIomadpolicyVersion200ResponseResult) *ToolIomadpolicyGetIomadpolicyVersion200Response {
	this := ToolIomadpolicyGetIomadpolicyVersion200Response{}
	this.Result = result
	return &this
}

// NewToolIomadpolicyGetIomadpolicyVersion200ResponseWithDefaults instantiates a new ToolIomadpolicyGetIomadpolicyVersion200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewToolIomadpolicyGetIomadpolicyVersion200ResponseWithDefaults() *ToolIomadpolicyGetIomadpolicyVersion200Response {
	this := ToolIomadpolicyGetIomadpolicyVersion200Response{}
	return &this
}

// GetResult returns the Result field value
func (o *ToolIomadpolicyGetIomadpolicyVersion200Response) GetResult() ToolIomadpolicyGetIomadpolicyVersion200ResponseResult {
	if o == nil {
		var ret ToolIomadpolicyGetIomadpolicyVersion200ResponseResult
		return ret
	}

	return o.Result
}

// GetResultOk returns a tuple with the Result field value
// and a boolean to check if the value has been set.
func (o *ToolIomadpolicyGetIomadpolicyVersion200Response) GetResultOk() (*ToolIomadpolicyGetIomadpolicyVersion200ResponseResult, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Result, true
}

// SetResult sets field value
func (o *ToolIomadpolicyGetIomadpolicyVersion200Response) SetResult(v ToolIomadpolicyGetIomadpolicyVersion200ResponseResult) {
	o.Result = v
}

// GetWarnings returns the Warnings field value if set, zero value otherwise.
func (o *ToolIomadpolicyGetIomadpolicyVersion200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner {
	if o == nil || IsNil(o.Warnings) {
		var ret []AuthEmailSignupUser200ResponseWarningsInner
		return ret
	}
	return o.Warnings
}

// GetWarningsOk returns a tuple with the Warnings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ToolIomadpolicyGetIomadpolicyVersion200Response) GetWarningsOk() ([]AuthEmailSignupUser200ResponseWarningsInner, bool) {
	if o == nil || IsNil(o.Warnings) {
		return nil, false
	}
	return o.Warnings, true
}

// HasWarnings returns a boolean if a field has been set.
func (o *ToolIomadpolicyGetIomadpolicyVersion200Response) HasWarnings() bool {
	if o != nil && !IsNil(o.Warnings) {
		return true
	}

	return false
}

// SetWarnings gets a reference to the given []AuthEmailSignupUser200ResponseWarningsInner and assigns it to the Warnings field.
func (o *ToolIomadpolicyGetIomadpolicyVersion200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner) {
	o.Warnings = v
}

func (o ToolIomadpolicyGetIomadpolicyVersion200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ToolIomadpolicyGetIomadpolicyVersion200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["result"] = o.Result
	if !IsNil(o.Warnings) {
		toSerialize["warnings"] = o.Warnings
	}
	return toSerialize, nil
}

func (o *ToolIomadpolicyGetIomadpolicyVersion200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"result",
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

	varToolIomadpolicyGetIomadpolicyVersion200Response := _ToolIomadpolicyGetIomadpolicyVersion200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varToolIomadpolicyGetIomadpolicyVersion200Response)

	if err != nil {
		return err
	}

	*o = ToolIomadpolicyGetIomadpolicyVersion200Response(varToolIomadpolicyGetIomadpolicyVersion200Response)

	return err
}

type NullableToolIomadpolicyGetIomadpolicyVersion200Response struct {
	value *ToolIomadpolicyGetIomadpolicyVersion200Response
	isSet bool
}

func (v NullableToolIomadpolicyGetIomadpolicyVersion200Response) Get() *ToolIomadpolicyGetIomadpolicyVersion200Response {
	return v.value
}

func (v *NullableToolIomadpolicyGetIomadpolicyVersion200Response) Set(val *ToolIomadpolicyGetIomadpolicyVersion200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableToolIomadpolicyGetIomadpolicyVersion200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableToolIomadpolicyGetIomadpolicyVersion200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableToolIomadpolicyGetIomadpolicyVersion200Response(val *ToolIomadpolicyGetIomadpolicyVersion200Response) *NullableToolIomadpolicyGetIomadpolicyVersion200Response {
	return &NullableToolIomadpolicyGetIomadpolicyVersion200Response{value: val, isSet: true}
}

func (v NullableToolIomadpolicyGetIomadpolicyVersion200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableToolIomadpolicyGetIomadpolicyVersion200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


