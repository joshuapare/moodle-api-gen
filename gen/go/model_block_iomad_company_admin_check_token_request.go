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

// checks if the BlockIomadCompanyAdminCheckTokenRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &BlockIomadCompanyAdminCheckTokenRequest{}

// BlockIomadCompanyAdminCheckTokenRequest struct for BlockIomadCompanyAdminCheckTokenRequest
type BlockIomadCompanyAdminCheckTokenRequest struct {
	Key0 BlockIomadCompanyAdminCheckTokenRequestKey0 `json:"key0"`
}

type _BlockIomadCompanyAdminCheckTokenRequest BlockIomadCompanyAdminCheckTokenRequest

// NewBlockIomadCompanyAdminCheckTokenRequest instantiates a new BlockIomadCompanyAdminCheckTokenRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBlockIomadCompanyAdminCheckTokenRequest(key0 BlockIomadCompanyAdminCheckTokenRequestKey0) *BlockIomadCompanyAdminCheckTokenRequest {
	this := BlockIomadCompanyAdminCheckTokenRequest{}
	this.Key0 = key0
	return &this
}

// NewBlockIomadCompanyAdminCheckTokenRequestWithDefaults instantiates a new BlockIomadCompanyAdminCheckTokenRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBlockIomadCompanyAdminCheckTokenRequestWithDefaults() *BlockIomadCompanyAdminCheckTokenRequest {
	this := BlockIomadCompanyAdminCheckTokenRequest{}
	return &this
}

// GetKey0 returns the Key0 field value
func (o *BlockIomadCompanyAdminCheckTokenRequest) GetKey0() BlockIomadCompanyAdminCheckTokenRequestKey0 {
	if o == nil {
		var ret BlockIomadCompanyAdminCheckTokenRequestKey0
		return ret
	}

	return o.Key0
}

// GetKey0Ok returns a tuple with the Key0 field value
// and a boolean to check if the value has been set.
func (o *BlockIomadCompanyAdminCheckTokenRequest) GetKey0Ok() (*BlockIomadCompanyAdminCheckTokenRequestKey0, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Key0, true
}

// SetKey0 sets field value
func (o *BlockIomadCompanyAdminCheckTokenRequest) SetKey0(v BlockIomadCompanyAdminCheckTokenRequestKey0) {
	o.Key0 = v
}

func (o BlockIomadCompanyAdminCheckTokenRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o BlockIomadCompanyAdminCheckTokenRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["key0"] = o.Key0
	return toSerialize, nil
}

func (o *BlockIomadCompanyAdminCheckTokenRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"key0",
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

	varBlockIomadCompanyAdminCheckTokenRequest := _BlockIomadCompanyAdminCheckTokenRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varBlockIomadCompanyAdminCheckTokenRequest)

	if err != nil {
		return err
	}

	*o = BlockIomadCompanyAdminCheckTokenRequest(varBlockIomadCompanyAdminCheckTokenRequest)

	return err
}

type NullableBlockIomadCompanyAdminCheckTokenRequest struct {
	value *BlockIomadCompanyAdminCheckTokenRequest
	isSet bool
}

func (v NullableBlockIomadCompanyAdminCheckTokenRequest) Get() *BlockIomadCompanyAdminCheckTokenRequest {
	return v.value
}

func (v *NullableBlockIomadCompanyAdminCheckTokenRequest) Set(val *BlockIomadCompanyAdminCheckTokenRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableBlockIomadCompanyAdminCheckTokenRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableBlockIomadCompanyAdminCheckTokenRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBlockIomadCompanyAdminCheckTokenRequest(val *BlockIomadCompanyAdminCheckTokenRequest) *NullableBlockIomadCompanyAdminCheckTokenRequest {
	return &NullableBlockIomadCompanyAdminCheckTokenRequest{value: val, isSet: true}
}

func (v NullableBlockIomadCompanyAdminCheckTokenRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBlockIomadCompanyAdminCheckTokenRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


