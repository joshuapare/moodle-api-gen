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

// checks if the CoreGroupUnassignGroupingRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreGroupUnassignGroupingRequest{}

// CoreGroupUnassignGroupingRequest struct for CoreGroupUnassignGroupingRequest
type CoreGroupUnassignGroupingRequest struct {
	Unassignments []CoreGroupUnassignGroupingRequestUnassignmentsInner `json:"unassignments"`
}

type _CoreGroupUnassignGroupingRequest CoreGroupUnassignGroupingRequest

// NewCoreGroupUnassignGroupingRequest instantiates a new CoreGroupUnassignGroupingRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreGroupUnassignGroupingRequest(unassignments []CoreGroupUnassignGroupingRequestUnassignmentsInner) *CoreGroupUnassignGroupingRequest {
	this := CoreGroupUnassignGroupingRequest{}
	this.Unassignments = unassignments
	return &this
}

// NewCoreGroupUnassignGroupingRequestWithDefaults instantiates a new CoreGroupUnassignGroupingRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreGroupUnassignGroupingRequestWithDefaults() *CoreGroupUnassignGroupingRequest {
	this := CoreGroupUnassignGroupingRequest{}
	return &this
}

// GetUnassignments returns the Unassignments field value
func (o *CoreGroupUnassignGroupingRequest) GetUnassignments() []CoreGroupUnassignGroupingRequestUnassignmentsInner {
	if o == nil {
		var ret []CoreGroupUnassignGroupingRequestUnassignmentsInner
		return ret
	}

	return o.Unassignments
}

// GetUnassignmentsOk returns a tuple with the Unassignments field value
// and a boolean to check if the value has been set.
func (o *CoreGroupUnassignGroupingRequest) GetUnassignmentsOk() ([]CoreGroupUnassignGroupingRequestUnassignmentsInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Unassignments, true
}

// SetUnassignments sets field value
func (o *CoreGroupUnassignGroupingRequest) SetUnassignments(v []CoreGroupUnassignGroupingRequestUnassignmentsInner) {
	o.Unassignments = v
}

func (o CoreGroupUnassignGroupingRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreGroupUnassignGroupingRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["unassignments"] = o.Unassignments
	return toSerialize, nil
}

func (o *CoreGroupUnassignGroupingRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"unassignments",
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

	varCoreGroupUnassignGroupingRequest := _CoreGroupUnassignGroupingRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreGroupUnassignGroupingRequest)

	if err != nil {
		return err
	}

	*o = CoreGroupUnassignGroupingRequest(varCoreGroupUnassignGroupingRequest)

	return err
}

type NullableCoreGroupUnassignGroupingRequest struct {
	value *CoreGroupUnassignGroupingRequest
	isSet bool
}

func (v NullableCoreGroupUnassignGroupingRequest) Get() *CoreGroupUnassignGroupingRequest {
	return v.value
}

func (v *NullableCoreGroupUnassignGroupingRequest) Set(val *CoreGroupUnassignGroupingRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreGroupUnassignGroupingRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreGroupUnassignGroupingRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreGroupUnassignGroupingRequest(val *CoreGroupUnassignGroupingRequest) *NullableCoreGroupUnassignGroupingRequest {
	return &NullableCoreGroupUnassignGroupingRequest{value: val, isSet: true}
}

func (v NullableCoreGroupUnassignGroupingRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreGroupUnassignGroupingRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

