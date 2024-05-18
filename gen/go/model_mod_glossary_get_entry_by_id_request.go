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

// checks if the ModGlossaryGetEntryByIdRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModGlossaryGetEntryByIdRequest{}

// ModGlossaryGetEntryByIdRequest struct for ModGlossaryGetEntryByIdRequest
type ModGlossaryGetEntryByIdRequest struct {
	// Glossary entry ID
	Id int32 `json:"id"`
}

type _ModGlossaryGetEntryByIdRequest ModGlossaryGetEntryByIdRequest

// NewModGlossaryGetEntryByIdRequest instantiates a new ModGlossaryGetEntryByIdRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModGlossaryGetEntryByIdRequest(id int32) *ModGlossaryGetEntryByIdRequest {
	this := ModGlossaryGetEntryByIdRequest{}
	this.Id = id
	return &this
}

// NewModGlossaryGetEntryByIdRequestWithDefaults instantiates a new ModGlossaryGetEntryByIdRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModGlossaryGetEntryByIdRequestWithDefaults() *ModGlossaryGetEntryByIdRequest {
	this := ModGlossaryGetEntryByIdRequest{}
	return &this
}

// GetId returns the Id field value
func (o *ModGlossaryGetEntryByIdRequest) GetId() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *ModGlossaryGetEntryByIdRequest) GetIdOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *ModGlossaryGetEntryByIdRequest) SetId(v int32) {
	o.Id = v
}

func (o ModGlossaryGetEntryByIdRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModGlossaryGetEntryByIdRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["id"] = o.Id
	return toSerialize, nil
}

func (o *ModGlossaryGetEntryByIdRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"id",
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

	varModGlossaryGetEntryByIdRequest := _ModGlossaryGetEntryByIdRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModGlossaryGetEntryByIdRequest)

	if err != nil {
		return err
	}

	*o = ModGlossaryGetEntryByIdRequest(varModGlossaryGetEntryByIdRequest)

	return err
}

type NullableModGlossaryGetEntryByIdRequest struct {
	value *ModGlossaryGetEntryByIdRequest
	isSet bool
}

func (v NullableModGlossaryGetEntryByIdRequest) Get() *ModGlossaryGetEntryByIdRequest {
	return v.value
}

func (v *NullableModGlossaryGetEntryByIdRequest) Set(val *ModGlossaryGetEntryByIdRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableModGlossaryGetEntryByIdRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableModGlossaryGetEntryByIdRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModGlossaryGetEntryByIdRequest(val *ModGlossaryGetEntryByIdRequest) *NullableModGlossaryGetEntryByIdRequest {
	return &NullableModGlossaryGetEntryByIdRequest{value: val, isSet: true}
}

func (v NullableModGlossaryGetEntryByIdRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModGlossaryGetEntryByIdRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


