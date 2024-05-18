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

// checks if the ModResourceViewResourceRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModResourceViewResourceRequest{}

// ModResourceViewResourceRequest struct for ModResourceViewResourceRequest
type ModResourceViewResourceRequest struct {
	// resource instance id
	Resourceid int32 `json:"resourceid"`
}

type _ModResourceViewResourceRequest ModResourceViewResourceRequest

// NewModResourceViewResourceRequest instantiates a new ModResourceViewResourceRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModResourceViewResourceRequest(resourceid int32) *ModResourceViewResourceRequest {
	this := ModResourceViewResourceRequest{}
	this.Resourceid = resourceid
	return &this
}

// NewModResourceViewResourceRequestWithDefaults instantiates a new ModResourceViewResourceRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModResourceViewResourceRequestWithDefaults() *ModResourceViewResourceRequest {
	this := ModResourceViewResourceRequest{}
	var resourceid int32 = null
	this.Resourceid = resourceid
	return &this
}

// GetResourceid returns the Resourceid field value
func (o *ModResourceViewResourceRequest) GetResourceid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Resourceid
}

// GetResourceidOk returns a tuple with the Resourceid field value
// and a boolean to check if the value has been set.
func (o *ModResourceViewResourceRequest) GetResourceidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Resourceid, true
}

// SetResourceid sets field value
func (o *ModResourceViewResourceRequest) SetResourceid(v int32) {
	o.Resourceid = v
}

func (o ModResourceViewResourceRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModResourceViewResourceRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["resourceid"] = o.Resourceid
	return toSerialize, nil
}

func (o *ModResourceViewResourceRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"resourceid",
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

	varModResourceViewResourceRequest := _ModResourceViewResourceRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModResourceViewResourceRequest)

	if err != nil {
		return err
	}

	*o = ModResourceViewResourceRequest(varModResourceViewResourceRequest)

	return err
}

type NullableModResourceViewResourceRequest struct {
	value *ModResourceViewResourceRequest
	isSet bool
}

func (v NullableModResourceViewResourceRequest) Get() *ModResourceViewResourceRequest {
	return v.value
}

func (v *NullableModResourceViewResourceRequest) Set(val *ModResourceViewResourceRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableModResourceViewResourceRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableModResourceViewResourceRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModResourceViewResourceRequest(val *ModResourceViewResourceRequest) *NullableModResourceViewResourceRequest {
	return &NullableModResourceViewResourceRequest{value: val, isSet: true}
}

func (v NullableModResourceViewResourceRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModResourceViewResourceRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


