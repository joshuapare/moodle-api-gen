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

// checks if the CoreCourseDeleteModulesRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreCourseDeleteModulesRequest{}

// CoreCourseDeleteModulesRequest struct for CoreCourseDeleteModulesRequest
type CoreCourseDeleteModulesRequest struct {
	Cmids []map[string]interface{} `json:"cmids"`
}

type _CoreCourseDeleteModulesRequest CoreCourseDeleteModulesRequest

// NewCoreCourseDeleteModulesRequest instantiates a new CoreCourseDeleteModulesRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreCourseDeleteModulesRequest(cmids []map[string]interface{}) *CoreCourseDeleteModulesRequest {
	this := CoreCourseDeleteModulesRequest{}
	this.Cmids = cmids
	return &this
}

// NewCoreCourseDeleteModulesRequestWithDefaults instantiates a new CoreCourseDeleteModulesRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreCourseDeleteModulesRequestWithDefaults() *CoreCourseDeleteModulesRequest {
	this := CoreCourseDeleteModulesRequest{}
	return &this
}

// GetCmids returns the Cmids field value
func (o *CoreCourseDeleteModulesRequest) GetCmids() []map[string]interface{} {
	if o == nil {
		var ret []map[string]interface{}
		return ret
	}

	return o.Cmids
}

// GetCmidsOk returns a tuple with the Cmids field value
// and a boolean to check if the value has been set.
func (o *CoreCourseDeleteModulesRequest) GetCmidsOk() ([]map[string]interface{}, bool) {
	if o == nil {
		return nil, false
	}
	return o.Cmids, true
}

// SetCmids sets field value
func (o *CoreCourseDeleteModulesRequest) SetCmids(v []map[string]interface{}) {
	o.Cmids = v
}

func (o CoreCourseDeleteModulesRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreCourseDeleteModulesRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["cmids"] = o.Cmids
	return toSerialize, nil
}

func (o *CoreCourseDeleteModulesRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"cmids",
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

	varCoreCourseDeleteModulesRequest := _CoreCourseDeleteModulesRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreCourseDeleteModulesRequest)

	if err != nil {
		return err
	}

	*o = CoreCourseDeleteModulesRequest(varCoreCourseDeleteModulesRequest)

	return err
}

type NullableCoreCourseDeleteModulesRequest struct {
	value *CoreCourseDeleteModulesRequest
	isSet bool
}

func (v NullableCoreCourseDeleteModulesRequest) Get() *CoreCourseDeleteModulesRequest {
	return v.value
}

func (v *NullableCoreCourseDeleteModulesRequest) Set(val *CoreCourseDeleteModulesRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreCourseDeleteModulesRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreCourseDeleteModulesRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreCourseDeleteModulesRequest(val *CoreCourseDeleteModulesRequest) *NullableCoreCourseDeleteModulesRequest {
	return &NullableCoreCourseDeleteModulesRequest{value: val, isSet: true}
}

func (v NullableCoreCourseDeleteModulesRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreCourseDeleteModulesRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


