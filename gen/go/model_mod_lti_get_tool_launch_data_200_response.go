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

// checks if the ModLtiGetToolLaunchData200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModLtiGetToolLaunchData200Response{}

// ModLtiGetToolLaunchData200Response struct for ModLtiGetToolLaunchData200Response
type ModLtiGetToolLaunchData200Response struct {
	// Endpoint URL
	Endpoint string `json:"endpoint"`
	Parameters []ModLtiGetToolLaunchData200ResponseParametersInner `json:"parameters"`
	Warnings []AuthEmailSignupUser200ResponseWarningsInner `json:"warnings,omitempty"`
}

type _ModLtiGetToolLaunchData200Response ModLtiGetToolLaunchData200Response

// NewModLtiGetToolLaunchData200Response instantiates a new ModLtiGetToolLaunchData200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModLtiGetToolLaunchData200Response(endpoint string, parameters []ModLtiGetToolLaunchData200ResponseParametersInner) *ModLtiGetToolLaunchData200Response {
	this := ModLtiGetToolLaunchData200Response{}
	this.Endpoint = endpoint
	this.Parameters = parameters
	return &this
}

// NewModLtiGetToolLaunchData200ResponseWithDefaults instantiates a new ModLtiGetToolLaunchData200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModLtiGetToolLaunchData200ResponseWithDefaults() *ModLtiGetToolLaunchData200Response {
	this := ModLtiGetToolLaunchData200Response{}
	var endpoint string = "null"
	this.Endpoint = endpoint
	return &this
}

// GetEndpoint returns the Endpoint field value
func (o *ModLtiGetToolLaunchData200Response) GetEndpoint() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Endpoint
}

// GetEndpointOk returns a tuple with the Endpoint field value
// and a boolean to check if the value has been set.
func (o *ModLtiGetToolLaunchData200Response) GetEndpointOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Endpoint, true
}

// SetEndpoint sets field value
func (o *ModLtiGetToolLaunchData200Response) SetEndpoint(v string) {
	o.Endpoint = v
}

// GetParameters returns the Parameters field value
func (o *ModLtiGetToolLaunchData200Response) GetParameters() []ModLtiGetToolLaunchData200ResponseParametersInner {
	if o == nil {
		var ret []ModLtiGetToolLaunchData200ResponseParametersInner
		return ret
	}

	return o.Parameters
}

// GetParametersOk returns a tuple with the Parameters field value
// and a boolean to check if the value has been set.
func (o *ModLtiGetToolLaunchData200Response) GetParametersOk() ([]ModLtiGetToolLaunchData200ResponseParametersInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Parameters, true
}

// SetParameters sets field value
func (o *ModLtiGetToolLaunchData200Response) SetParameters(v []ModLtiGetToolLaunchData200ResponseParametersInner) {
	o.Parameters = v
}

// GetWarnings returns the Warnings field value if set, zero value otherwise.
func (o *ModLtiGetToolLaunchData200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner {
	if o == nil || IsNil(o.Warnings) {
		var ret []AuthEmailSignupUser200ResponseWarningsInner
		return ret
	}
	return o.Warnings
}

// GetWarningsOk returns a tuple with the Warnings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModLtiGetToolLaunchData200Response) GetWarningsOk() ([]AuthEmailSignupUser200ResponseWarningsInner, bool) {
	if o == nil || IsNil(o.Warnings) {
		return nil, false
	}
	return o.Warnings, true
}

// HasWarnings returns a boolean if a field has been set.
func (o *ModLtiGetToolLaunchData200Response) HasWarnings() bool {
	if o != nil && !IsNil(o.Warnings) {
		return true
	}

	return false
}

// SetWarnings gets a reference to the given []AuthEmailSignupUser200ResponseWarningsInner and assigns it to the Warnings field.
func (o *ModLtiGetToolLaunchData200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner) {
	o.Warnings = v
}

func (o ModLtiGetToolLaunchData200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModLtiGetToolLaunchData200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["endpoint"] = o.Endpoint
	toSerialize["parameters"] = o.Parameters
	if !IsNil(o.Warnings) {
		toSerialize["warnings"] = o.Warnings
	}
	return toSerialize, nil
}

func (o *ModLtiGetToolLaunchData200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"endpoint",
		"parameters",
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

	varModLtiGetToolLaunchData200Response := _ModLtiGetToolLaunchData200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModLtiGetToolLaunchData200Response)

	if err != nil {
		return err
	}

	*o = ModLtiGetToolLaunchData200Response(varModLtiGetToolLaunchData200Response)

	return err
}

type NullableModLtiGetToolLaunchData200Response struct {
	value *ModLtiGetToolLaunchData200Response
	isSet bool
}

func (v NullableModLtiGetToolLaunchData200Response) Get() *ModLtiGetToolLaunchData200Response {
	return v.value
}

func (v *NullableModLtiGetToolLaunchData200Response) Set(val *ModLtiGetToolLaunchData200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableModLtiGetToolLaunchData200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableModLtiGetToolLaunchData200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModLtiGetToolLaunchData200Response(val *ModLtiGetToolLaunchData200Response) *NullableModLtiGetToolLaunchData200Response {
	return &NullableModLtiGetToolLaunchData200Response{value: val, isSet: true}
}

func (v NullableModLtiGetToolLaunchData200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModLtiGetToolLaunchData200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


