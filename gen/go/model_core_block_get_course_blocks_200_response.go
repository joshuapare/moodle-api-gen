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

// checks if the CoreBlockGetCourseBlocks200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreBlockGetCourseBlocks200Response{}

// CoreBlockGetCourseBlocks200Response struct for CoreBlockGetCourseBlocks200Response
type CoreBlockGetCourseBlocks200Response struct {
	Blocks []CoreBlockGetCourseBlocks200ResponseBlocksInner `json:"blocks"`
	Warnings []AuthEmailSignupUser200ResponseWarningsInner `json:"warnings,omitempty"`
}

type _CoreBlockGetCourseBlocks200Response CoreBlockGetCourseBlocks200Response

// NewCoreBlockGetCourseBlocks200Response instantiates a new CoreBlockGetCourseBlocks200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreBlockGetCourseBlocks200Response(blocks []CoreBlockGetCourseBlocks200ResponseBlocksInner) *CoreBlockGetCourseBlocks200Response {
	this := CoreBlockGetCourseBlocks200Response{}
	this.Blocks = blocks
	return &this
}

// NewCoreBlockGetCourseBlocks200ResponseWithDefaults instantiates a new CoreBlockGetCourseBlocks200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreBlockGetCourseBlocks200ResponseWithDefaults() *CoreBlockGetCourseBlocks200Response {
	this := CoreBlockGetCourseBlocks200Response{}
	return &this
}

// GetBlocks returns the Blocks field value
func (o *CoreBlockGetCourseBlocks200Response) GetBlocks() []CoreBlockGetCourseBlocks200ResponseBlocksInner {
	if o == nil {
		var ret []CoreBlockGetCourseBlocks200ResponseBlocksInner
		return ret
	}

	return o.Blocks
}

// GetBlocksOk returns a tuple with the Blocks field value
// and a boolean to check if the value has been set.
func (o *CoreBlockGetCourseBlocks200Response) GetBlocksOk() ([]CoreBlockGetCourseBlocks200ResponseBlocksInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Blocks, true
}

// SetBlocks sets field value
func (o *CoreBlockGetCourseBlocks200Response) SetBlocks(v []CoreBlockGetCourseBlocks200ResponseBlocksInner) {
	o.Blocks = v
}

// GetWarnings returns the Warnings field value if set, zero value otherwise.
func (o *CoreBlockGetCourseBlocks200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner {
	if o == nil || IsNil(o.Warnings) {
		var ret []AuthEmailSignupUser200ResponseWarningsInner
		return ret
	}
	return o.Warnings
}

// GetWarningsOk returns a tuple with the Warnings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBlockGetCourseBlocks200Response) GetWarningsOk() ([]AuthEmailSignupUser200ResponseWarningsInner, bool) {
	if o == nil || IsNil(o.Warnings) {
		return nil, false
	}
	return o.Warnings, true
}

// HasWarnings returns a boolean if a field has been set.
func (o *CoreBlockGetCourseBlocks200Response) HasWarnings() bool {
	if o != nil && !IsNil(o.Warnings) {
		return true
	}

	return false
}

// SetWarnings gets a reference to the given []AuthEmailSignupUser200ResponseWarningsInner and assigns it to the Warnings field.
func (o *CoreBlockGetCourseBlocks200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner) {
	o.Warnings = v
}

func (o CoreBlockGetCourseBlocks200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreBlockGetCourseBlocks200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["blocks"] = o.Blocks
	if !IsNil(o.Warnings) {
		toSerialize["warnings"] = o.Warnings
	}
	return toSerialize, nil
}

func (o *CoreBlockGetCourseBlocks200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"blocks",
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

	varCoreBlockGetCourseBlocks200Response := _CoreBlockGetCourseBlocks200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreBlockGetCourseBlocks200Response)

	if err != nil {
		return err
	}

	*o = CoreBlockGetCourseBlocks200Response(varCoreBlockGetCourseBlocks200Response)

	return err
}

type NullableCoreBlockGetCourseBlocks200Response struct {
	value *CoreBlockGetCourseBlocks200Response
	isSet bool
}

func (v NullableCoreBlockGetCourseBlocks200Response) Get() *CoreBlockGetCourseBlocks200Response {
	return v.value
}

func (v *NullableCoreBlockGetCourseBlocks200Response) Set(val *CoreBlockGetCourseBlocks200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreBlockGetCourseBlocks200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreBlockGetCourseBlocks200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreBlockGetCourseBlocks200Response(val *CoreBlockGetCourseBlocks200Response) *NullableCoreBlockGetCourseBlocks200Response {
	return &NullableCoreBlockGetCourseBlocks200Response{value: val, isSet: true}
}

func (v NullableCoreBlockGetCourseBlocks200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreBlockGetCourseBlocks200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

