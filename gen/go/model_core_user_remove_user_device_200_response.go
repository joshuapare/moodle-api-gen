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

// checks if the CoreUserRemoveUserDevice200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreUserRemoveUserDevice200Response{}

// CoreUserRemoveUserDevice200Response struct for CoreUserRemoveUserDevice200Response
type CoreUserRemoveUserDevice200Response struct {
	// True if removed, false if not removed because it doesn't exists
	Removed bool `json:"removed"`
	Warnings []AuthEmailSignupUser200ResponseWarningsInner `json:"warnings,omitempty"`
}

type _CoreUserRemoveUserDevice200Response CoreUserRemoveUserDevice200Response

// NewCoreUserRemoveUserDevice200Response instantiates a new CoreUserRemoveUserDevice200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreUserRemoveUserDevice200Response(removed bool) *CoreUserRemoveUserDevice200Response {
	this := CoreUserRemoveUserDevice200Response{}
	this.Removed = removed
	return &this
}

// NewCoreUserRemoveUserDevice200ResponseWithDefaults instantiates a new CoreUserRemoveUserDevice200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreUserRemoveUserDevice200ResponseWithDefaults() *CoreUserRemoveUserDevice200Response {
	this := CoreUserRemoveUserDevice200Response{}
	var removed bool = null
	this.Removed = removed
	return &this
}

// GetRemoved returns the Removed field value
func (o *CoreUserRemoveUserDevice200Response) GetRemoved() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Removed
}

// GetRemovedOk returns a tuple with the Removed field value
// and a boolean to check if the value has been set.
func (o *CoreUserRemoveUserDevice200Response) GetRemovedOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Removed, true
}

// SetRemoved sets field value
func (o *CoreUserRemoveUserDevice200Response) SetRemoved(v bool) {
	o.Removed = v
}

// GetWarnings returns the Warnings field value if set, zero value otherwise.
func (o *CoreUserRemoveUserDevice200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner {
	if o == nil || IsNil(o.Warnings) {
		var ret []AuthEmailSignupUser200ResponseWarningsInner
		return ret
	}
	return o.Warnings
}

// GetWarningsOk returns a tuple with the Warnings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserRemoveUserDevice200Response) GetWarningsOk() ([]AuthEmailSignupUser200ResponseWarningsInner, bool) {
	if o == nil || IsNil(o.Warnings) {
		return nil, false
	}
	return o.Warnings, true
}

// HasWarnings returns a boolean if a field has been set.
func (o *CoreUserRemoveUserDevice200Response) HasWarnings() bool {
	if o != nil && !IsNil(o.Warnings) {
		return true
	}

	return false
}

// SetWarnings gets a reference to the given []AuthEmailSignupUser200ResponseWarningsInner and assigns it to the Warnings field.
func (o *CoreUserRemoveUserDevice200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner) {
	o.Warnings = v
}

func (o CoreUserRemoveUserDevice200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreUserRemoveUserDevice200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["removed"] = o.Removed
	if !IsNil(o.Warnings) {
		toSerialize["warnings"] = o.Warnings
	}
	return toSerialize, nil
}

func (o *CoreUserRemoveUserDevice200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"removed",
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

	varCoreUserRemoveUserDevice200Response := _CoreUserRemoveUserDevice200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreUserRemoveUserDevice200Response)

	if err != nil {
		return err
	}

	*o = CoreUserRemoveUserDevice200Response(varCoreUserRemoveUserDevice200Response)

	return err
}

type NullableCoreUserRemoveUserDevice200Response struct {
	value *CoreUserRemoveUserDevice200Response
	isSet bool
}

func (v NullableCoreUserRemoveUserDevice200Response) Get() *CoreUserRemoveUserDevice200Response {
	return v.value
}

func (v *NullableCoreUserRemoveUserDevice200Response) Set(val *CoreUserRemoveUserDevice200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreUserRemoveUserDevice200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreUserRemoveUserDevice200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreUserRemoveUserDevice200Response(val *CoreUserRemoveUserDevice200Response) *NullableCoreUserRemoveUserDevice200Response {
	return &NullableCoreUserRemoveUserDevice200Response{value: val, isSet: true}
}

func (v NullableCoreUserRemoveUserDevice200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreUserRemoveUserDevice200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


