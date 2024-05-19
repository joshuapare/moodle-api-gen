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

// checks if the CoreCompetencyUpdateCompetencyRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreCompetencyUpdateCompetencyRequest{}

// CoreCompetencyUpdateCompetencyRequest struct for CoreCompetencyUpdateCompetencyRequest
type CoreCompetencyUpdateCompetencyRequest struct {
	Competency CoreCompetencyUpdateCompetencyRequestCompetency `json:"competency"`
}

type _CoreCompetencyUpdateCompetencyRequest CoreCompetencyUpdateCompetencyRequest

// NewCoreCompetencyUpdateCompetencyRequest instantiates a new CoreCompetencyUpdateCompetencyRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreCompetencyUpdateCompetencyRequest(competency CoreCompetencyUpdateCompetencyRequestCompetency) *CoreCompetencyUpdateCompetencyRequest {
	this := CoreCompetencyUpdateCompetencyRequest{}
	this.Competency = competency
	return &this
}

// NewCoreCompetencyUpdateCompetencyRequestWithDefaults instantiates a new CoreCompetencyUpdateCompetencyRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreCompetencyUpdateCompetencyRequestWithDefaults() *CoreCompetencyUpdateCompetencyRequest {
	this := CoreCompetencyUpdateCompetencyRequest{}
	return &this
}

// GetCompetency returns the Competency field value
func (o *CoreCompetencyUpdateCompetencyRequest) GetCompetency() CoreCompetencyUpdateCompetencyRequestCompetency {
	if o == nil {
		var ret CoreCompetencyUpdateCompetencyRequestCompetency
		return ret
	}

	return o.Competency
}

// GetCompetencyOk returns a tuple with the Competency field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyUpdateCompetencyRequest) GetCompetencyOk() (*CoreCompetencyUpdateCompetencyRequestCompetency, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Competency, true
}

// SetCompetency sets field value
func (o *CoreCompetencyUpdateCompetencyRequest) SetCompetency(v CoreCompetencyUpdateCompetencyRequestCompetency) {
	o.Competency = v
}

func (o CoreCompetencyUpdateCompetencyRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreCompetencyUpdateCompetencyRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["competency"] = o.Competency
	return toSerialize, nil
}

func (o *CoreCompetencyUpdateCompetencyRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"competency",
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

	varCoreCompetencyUpdateCompetencyRequest := _CoreCompetencyUpdateCompetencyRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreCompetencyUpdateCompetencyRequest)

	if err != nil {
		return err
	}

	*o = CoreCompetencyUpdateCompetencyRequest(varCoreCompetencyUpdateCompetencyRequest)

	return err
}

type NullableCoreCompetencyUpdateCompetencyRequest struct {
	value *CoreCompetencyUpdateCompetencyRequest
	isSet bool
}

func (v NullableCoreCompetencyUpdateCompetencyRequest) Get() *CoreCompetencyUpdateCompetencyRequest {
	return v.value
}

func (v *NullableCoreCompetencyUpdateCompetencyRequest) Set(val *CoreCompetencyUpdateCompetencyRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreCompetencyUpdateCompetencyRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreCompetencyUpdateCompetencyRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreCompetencyUpdateCompetencyRequest(val *CoreCompetencyUpdateCompetencyRequest) *NullableCoreCompetencyUpdateCompetencyRequest {
	return &NullableCoreCompetencyUpdateCompetencyRequest{value: val, isSet: true}
}

func (v NullableCoreCompetencyUpdateCompetencyRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreCompetencyUpdateCompetencyRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


