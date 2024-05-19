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

// checks if the CoreCompetencyCountCompetenciesRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreCompetencyCountCompetenciesRequest{}

// CoreCompetencyCountCompetenciesRequest struct for CoreCompetencyCountCompetenciesRequest
type CoreCompetencyCountCompetenciesRequest struct {
	Filters []CoreCompetencyCountCompetenciesRequestFiltersInner `json:"filters"`
}

type _CoreCompetencyCountCompetenciesRequest CoreCompetencyCountCompetenciesRequest

// NewCoreCompetencyCountCompetenciesRequest instantiates a new CoreCompetencyCountCompetenciesRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreCompetencyCountCompetenciesRequest(filters []CoreCompetencyCountCompetenciesRequestFiltersInner) *CoreCompetencyCountCompetenciesRequest {
	this := CoreCompetencyCountCompetenciesRequest{}
	this.Filters = filters
	return &this
}

// NewCoreCompetencyCountCompetenciesRequestWithDefaults instantiates a new CoreCompetencyCountCompetenciesRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreCompetencyCountCompetenciesRequestWithDefaults() *CoreCompetencyCountCompetenciesRequest {
	this := CoreCompetencyCountCompetenciesRequest{}
	return &this
}

// GetFilters returns the Filters field value
func (o *CoreCompetencyCountCompetenciesRequest) GetFilters() []CoreCompetencyCountCompetenciesRequestFiltersInner {
	if o == nil {
		var ret []CoreCompetencyCountCompetenciesRequestFiltersInner
		return ret
	}

	return o.Filters
}

// GetFiltersOk returns a tuple with the Filters field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyCountCompetenciesRequest) GetFiltersOk() ([]CoreCompetencyCountCompetenciesRequestFiltersInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Filters, true
}

// SetFilters sets field value
func (o *CoreCompetencyCountCompetenciesRequest) SetFilters(v []CoreCompetencyCountCompetenciesRequestFiltersInner) {
	o.Filters = v
}

func (o CoreCompetencyCountCompetenciesRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreCompetencyCountCompetenciesRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["filters"] = o.Filters
	return toSerialize, nil
}

func (o *CoreCompetencyCountCompetenciesRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"filters",
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

	varCoreCompetencyCountCompetenciesRequest := _CoreCompetencyCountCompetenciesRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreCompetencyCountCompetenciesRequest)

	if err != nil {
		return err
	}

	*o = CoreCompetencyCountCompetenciesRequest(varCoreCompetencyCountCompetenciesRequest)

	return err
}

type NullableCoreCompetencyCountCompetenciesRequest struct {
	value *CoreCompetencyCountCompetenciesRequest
	isSet bool
}

func (v NullableCoreCompetencyCountCompetenciesRequest) Get() *CoreCompetencyCountCompetenciesRequest {
	return v.value
}

func (v *NullableCoreCompetencyCountCompetenciesRequest) Set(val *CoreCompetencyCountCompetenciesRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreCompetencyCountCompetenciesRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreCompetencyCountCompetenciesRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreCompetencyCountCompetenciesRequest(val *CoreCompetencyCountCompetenciesRequest) *NullableCoreCompetencyCountCompetenciesRequest {
	return &NullableCoreCompetencyCountCompetenciesRequest{value: val, isSet: true}
}

func (v NullableCoreCompetencyCountCompetenciesRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreCompetencyCountCompetenciesRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


