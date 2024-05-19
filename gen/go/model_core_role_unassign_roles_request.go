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

// checks if the CoreRoleUnassignRolesRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreRoleUnassignRolesRequest{}

// CoreRoleUnassignRolesRequest struct for CoreRoleUnassignRolesRequest
type CoreRoleUnassignRolesRequest struct {
	Unassignments []CoreRoleUnassignRolesRequestUnassignmentsInner `json:"unassignments"`
}

type _CoreRoleUnassignRolesRequest CoreRoleUnassignRolesRequest

// NewCoreRoleUnassignRolesRequest instantiates a new CoreRoleUnassignRolesRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreRoleUnassignRolesRequest(unassignments []CoreRoleUnassignRolesRequestUnassignmentsInner) *CoreRoleUnassignRolesRequest {
	this := CoreRoleUnassignRolesRequest{}
	this.Unassignments = unassignments
	return &this
}

// NewCoreRoleUnassignRolesRequestWithDefaults instantiates a new CoreRoleUnassignRolesRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreRoleUnassignRolesRequestWithDefaults() *CoreRoleUnassignRolesRequest {
	this := CoreRoleUnassignRolesRequest{}
	return &this
}

// GetUnassignments returns the Unassignments field value
func (o *CoreRoleUnassignRolesRequest) GetUnassignments() []CoreRoleUnassignRolesRequestUnassignmentsInner {
	if o == nil {
		var ret []CoreRoleUnassignRolesRequestUnassignmentsInner
		return ret
	}

	return o.Unassignments
}

// GetUnassignmentsOk returns a tuple with the Unassignments field value
// and a boolean to check if the value has been set.
func (o *CoreRoleUnassignRolesRequest) GetUnassignmentsOk() ([]CoreRoleUnassignRolesRequestUnassignmentsInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Unassignments, true
}

// SetUnassignments sets field value
func (o *CoreRoleUnassignRolesRequest) SetUnassignments(v []CoreRoleUnassignRolesRequestUnassignmentsInner) {
	o.Unassignments = v
}

func (o CoreRoleUnassignRolesRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreRoleUnassignRolesRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["unassignments"] = o.Unassignments
	return toSerialize, nil
}

func (o *CoreRoleUnassignRolesRequest) UnmarshalJSON(data []byte) (err error) {
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

	varCoreRoleUnassignRolesRequest := _CoreRoleUnassignRolesRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreRoleUnassignRolesRequest)

	if err != nil {
		return err
	}

	*o = CoreRoleUnassignRolesRequest(varCoreRoleUnassignRolesRequest)

	return err
}

type NullableCoreRoleUnassignRolesRequest struct {
	value *CoreRoleUnassignRolesRequest
	isSet bool
}

func (v NullableCoreRoleUnassignRolesRequest) Get() *CoreRoleUnassignRolesRequest {
	return v.value
}

func (v *NullableCoreRoleUnassignRolesRequest) Set(val *CoreRoleUnassignRolesRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreRoleUnassignRolesRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreRoleUnassignRolesRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreRoleUnassignRolesRequest(val *CoreRoleUnassignRolesRequest) *NullableCoreRoleUnassignRolesRequest {
	return &NullableCoreRoleUnassignRolesRequest{value: val, isSet: true}
}

func (v NullableCoreRoleUnassignRolesRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreRoleUnassignRolesRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


