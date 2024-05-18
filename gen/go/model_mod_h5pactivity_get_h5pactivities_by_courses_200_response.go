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

// checks if the ModH5pactivityGetH5pactivitiesByCourses200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModH5pactivityGetH5pactivitiesByCourses200Response{}

// ModH5pactivityGetH5pactivitiesByCourses200Response struct for ModH5pactivityGetH5pactivitiesByCourses200Response
type ModH5pactivityGetH5pactivitiesByCourses200Response struct {
	H5pactivities []ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner `json:"h5pactivities"`
	H5pglobalsettings *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings `json:"h5pglobalsettings,omitempty"`
	Warnings []AuthEmailSignupUser200ResponseWarningsInner `json:"warnings,omitempty"`
}

type _ModH5pactivityGetH5pactivitiesByCourses200Response ModH5pactivityGetH5pactivitiesByCourses200Response

// NewModH5pactivityGetH5pactivitiesByCourses200Response instantiates a new ModH5pactivityGetH5pactivitiesByCourses200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModH5pactivityGetH5pactivitiesByCourses200Response(h5pactivities []ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) *ModH5pactivityGetH5pactivitiesByCourses200Response {
	this := ModH5pactivityGetH5pactivitiesByCourses200Response{}
	this.H5pactivities = h5pactivities
	return &this
}

// NewModH5pactivityGetH5pactivitiesByCourses200ResponseWithDefaults instantiates a new ModH5pactivityGetH5pactivitiesByCourses200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModH5pactivityGetH5pactivitiesByCourses200ResponseWithDefaults() *ModH5pactivityGetH5pactivitiesByCourses200Response {
	this := ModH5pactivityGetH5pactivitiesByCourses200Response{}
	return &this
}

// GetH5pactivities returns the H5pactivities field value
func (o *ModH5pactivityGetH5pactivitiesByCourses200Response) GetH5pactivities() []ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner {
	if o == nil {
		var ret []ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner
		return ret
	}

	return o.H5pactivities
}

// GetH5pactivitiesOk returns a tuple with the H5pactivities field value
// and a boolean to check if the value has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200Response) GetH5pactivitiesOk() ([]ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.H5pactivities, true
}

// SetH5pactivities sets field value
func (o *ModH5pactivityGetH5pactivitiesByCourses200Response) SetH5pactivities(v []ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) {
	o.H5pactivities = v
}

// GetH5pglobalsettings returns the H5pglobalsettings field value if set, zero value otherwise.
func (o *ModH5pactivityGetH5pactivitiesByCourses200Response) GetH5pglobalsettings() ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings {
	if o == nil || IsNil(o.H5pglobalsettings) {
		var ret ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings
		return ret
	}
	return *o.H5pglobalsettings
}

// GetH5pglobalsettingsOk returns a tuple with the H5pglobalsettings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200Response) GetH5pglobalsettingsOk() (*ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings, bool) {
	if o == nil || IsNil(o.H5pglobalsettings) {
		return nil, false
	}
	return o.H5pglobalsettings, true
}

// HasH5pglobalsettings returns a boolean if a field has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200Response) HasH5pglobalsettings() bool {
	if o != nil && !IsNil(o.H5pglobalsettings) {
		return true
	}

	return false
}

// SetH5pglobalsettings gets a reference to the given ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings and assigns it to the H5pglobalsettings field.
func (o *ModH5pactivityGetH5pactivitiesByCourses200Response) SetH5pglobalsettings(v ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings) {
	o.H5pglobalsettings = &v
}

// GetWarnings returns the Warnings field value if set, zero value otherwise.
func (o *ModH5pactivityGetH5pactivitiesByCourses200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner {
	if o == nil || IsNil(o.Warnings) {
		var ret []AuthEmailSignupUser200ResponseWarningsInner
		return ret
	}
	return o.Warnings
}

// GetWarningsOk returns a tuple with the Warnings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200Response) GetWarningsOk() ([]AuthEmailSignupUser200ResponseWarningsInner, bool) {
	if o == nil || IsNil(o.Warnings) {
		return nil, false
	}
	return o.Warnings, true
}

// HasWarnings returns a boolean if a field has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200Response) HasWarnings() bool {
	if o != nil && !IsNil(o.Warnings) {
		return true
	}

	return false
}

// SetWarnings gets a reference to the given []AuthEmailSignupUser200ResponseWarningsInner and assigns it to the Warnings field.
func (o *ModH5pactivityGetH5pactivitiesByCourses200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner) {
	o.Warnings = v
}

func (o ModH5pactivityGetH5pactivitiesByCourses200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModH5pactivityGetH5pactivitiesByCourses200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["h5pactivities"] = o.H5pactivities
	if !IsNil(o.H5pglobalsettings) {
		toSerialize["h5pglobalsettings"] = o.H5pglobalsettings
	}
	if !IsNil(o.Warnings) {
		toSerialize["warnings"] = o.Warnings
	}
	return toSerialize, nil
}

func (o *ModH5pactivityGetH5pactivitiesByCourses200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"h5pactivities",
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

	varModH5pactivityGetH5pactivitiesByCourses200Response := _ModH5pactivityGetH5pactivitiesByCourses200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModH5pactivityGetH5pactivitiesByCourses200Response)

	if err != nil {
		return err
	}

	*o = ModH5pactivityGetH5pactivitiesByCourses200Response(varModH5pactivityGetH5pactivitiesByCourses200Response)

	return err
}

type NullableModH5pactivityGetH5pactivitiesByCourses200Response struct {
	value *ModH5pactivityGetH5pactivitiesByCourses200Response
	isSet bool
}

func (v NullableModH5pactivityGetH5pactivitiesByCourses200Response) Get() *ModH5pactivityGetH5pactivitiesByCourses200Response {
	return v.value
}

func (v *NullableModH5pactivityGetH5pactivitiesByCourses200Response) Set(val *ModH5pactivityGetH5pactivitiesByCourses200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableModH5pactivityGetH5pactivitiesByCourses200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableModH5pactivityGetH5pactivitiesByCourses200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModH5pactivityGetH5pactivitiesByCourses200Response(val *ModH5pactivityGetH5pactivitiesByCourses200Response) *NullableModH5pactivityGetH5pactivitiesByCourses200Response {
	return &NullableModH5pactivityGetH5pactivitiesByCourses200Response{value: val, isSet: true}
}

func (v NullableModH5pactivityGetH5pactivitiesByCourses200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModH5pactivityGetH5pactivitiesByCourses200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

