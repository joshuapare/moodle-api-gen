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

// checks if the CoreCohortCreateCohortsRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreCohortCreateCohortsRequest{}

// CoreCohortCreateCohortsRequest struct for CoreCohortCreateCohortsRequest
type CoreCohortCreateCohortsRequest struct {
	Cohorts []CoreCohortCreateCohortsRequestCohortsInner `json:"cohorts"`
}

type _CoreCohortCreateCohortsRequest CoreCohortCreateCohortsRequest

// NewCoreCohortCreateCohortsRequest instantiates a new CoreCohortCreateCohortsRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreCohortCreateCohortsRequest(cohorts []CoreCohortCreateCohortsRequestCohortsInner) *CoreCohortCreateCohortsRequest {
	this := CoreCohortCreateCohortsRequest{}
	this.Cohorts = cohorts
	return &this
}

// NewCoreCohortCreateCohortsRequestWithDefaults instantiates a new CoreCohortCreateCohortsRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreCohortCreateCohortsRequestWithDefaults() *CoreCohortCreateCohortsRequest {
	this := CoreCohortCreateCohortsRequest{}
	return &this
}

// GetCohorts returns the Cohorts field value
func (o *CoreCohortCreateCohortsRequest) GetCohorts() []CoreCohortCreateCohortsRequestCohortsInner {
	if o == nil {
		var ret []CoreCohortCreateCohortsRequestCohortsInner
		return ret
	}

	return o.Cohorts
}

// GetCohortsOk returns a tuple with the Cohorts field value
// and a boolean to check if the value has been set.
func (o *CoreCohortCreateCohortsRequest) GetCohortsOk() ([]CoreCohortCreateCohortsRequestCohortsInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Cohorts, true
}

// SetCohorts sets field value
func (o *CoreCohortCreateCohortsRequest) SetCohorts(v []CoreCohortCreateCohortsRequestCohortsInner) {
	o.Cohorts = v
}

func (o CoreCohortCreateCohortsRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreCohortCreateCohortsRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["cohorts"] = o.Cohorts
	return toSerialize, nil
}

func (o *CoreCohortCreateCohortsRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"cohorts",
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

	varCoreCohortCreateCohortsRequest := _CoreCohortCreateCohortsRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreCohortCreateCohortsRequest)

	if err != nil {
		return err
	}

	*o = CoreCohortCreateCohortsRequest(varCoreCohortCreateCohortsRequest)

	return err
}

type NullableCoreCohortCreateCohortsRequest struct {
	value *CoreCohortCreateCohortsRequest
	isSet bool
}

func (v NullableCoreCohortCreateCohortsRequest) Get() *CoreCohortCreateCohortsRequest {
	return v.value
}

func (v *NullableCoreCohortCreateCohortsRequest) Set(val *CoreCohortCreateCohortsRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreCohortCreateCohortsRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreCohortCreateCohortsRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreCohortCreateCohortsRequest(val *CoreCohortCreateCohortsRequest) *NullableCoreCohortCreateCohortsRequest {
	return &NullableCoreCohortCreateCohortsRequest{value: val, isSet: true}
}

func (v NullableCoreCohortCreateCohortsRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreCohortCreateCohortsRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

