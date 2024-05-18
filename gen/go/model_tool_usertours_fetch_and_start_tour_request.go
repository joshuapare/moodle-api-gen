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

// checks if the ToolUsertoursFetchAndStartTourRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ToolUsertoursFetchAndStartTourRequest{}

// ToolUsertoursFetchAndStartTourRequest struct for ToolUsertoursFetchAndStartTourRequest
type ToolUsertoursFetchAndStartTourRequest struct {
	// Context ID
	Context int32 `json:"context"`
	// Page URL
	Pageurl string `json:"pageurl"`
	// Tour ID
	Tourid int32 `json:"tourid"`
}

type _ToolUsertoursFetchAndStartTourRequest ToolUsertoursFetchAndStartTourRequest

// NewToolUsertoursFetchAndStartTourRequest instantiates a new ToolUsertoursFetchAndStartTourRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewToolUsertoursFetchAndStartTourRequest(context int32, pageurl string, tourid int32) *ToolUsertoursFetchAndStartTourRequest {
	this := ToolUsertoursFetchAndStartTourRequest{}
	this.Context = context
	this.Pageurl = pageurl
	this.Tourid = tourid
	return &this
}

// NewToolUsertoursFetchAndStartTourRequestWithDefaults instantiates a new ToolUsertoursFetchAndStartTourRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewToolUsertoursFetchAndStartTourRequestWithDefaults() *ToolUsertoursFetchAndStartTourRequest {
	this := ToolUsertoursFetchAndStartTourRequest{}
	return &this
}

// GetContext returns the Context field value
func (o *ToolUsertoursFetchAndStartTourRequest) GetContext() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Context
}

// GetContextOk returns a tuple with the Context field value
// and a boolean to check if the value has been set.
func (o *ToolUsertoursFetchAndStartTourRequest) GetContextOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Context, true
}

// SetContext sets field value
func (o *ToolUsertoursFetchAndStartTourRequest) SetContext(v int32) {
	o.Context = v
}

// GetPageurl returns the Pageurl field value
func (o *ToolUsertoursFetchAndStartTourRequest) GetPageurl() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Pageurl
}

// GetPageurlOk returns a tuple with the Pageurl field value
// and a boolean to check if the value has been set.
func (o *ToolUsertoursFetchAndStartTourRequest) GetPageurlOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Pageurl, true
}

// SetPageurl sets field value
func (o *ToolUsertoursFetchAndStartTourRequest) SetPageurl(v string) {
	o.Pageurl = v
}

// GetTourid returns the Tourid field value
func (o *ToolUsertoursFetchAndStartTourRequest) GetTourid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Tourid
}

// GetTouridOk returns a tuple with the Tourid field value
// and a boolean to check if the value has been set.
func (o *ToolUsertoursFetchAndStartTourRequest) GetTouridOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Tourid, true
}

// SetTourid sets field value
func (o *ToolUsertoursFetchAndStartTourRequest) SetTourid(v int32) {
	o.Tourid = v
}

func (o ToolUsertoursFetchAndStartTourRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ToolUsertoursFetchAndStartTourRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["context"] = o.Context
	toSerialize["pageurl"] = o.Pageurl
	toSerialize["tourid"] = o.Tourid
	return toSerialize, nil
}

func (o *ToolUsertoursFetchAndStartTourRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"context",
		"pageurl",
		"tourid",
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

	varToolUsertoursFetchAndStartTourRequest := _ToolUsertoursFetchAndStartTourRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varToolUsertoursFetchAndStartTourRequest)

	if err != nil {
		return err
	}

	*o = ToolUsertoursFetchAndStartTourRequest(varToolUsertoursFetchAndStartTourRequest)

	return err
}

type NullableToolUsertoursFetchAndStartTourRequest struct {
	value *ToolUsertoursFetchAndStartTourRequest
	isSet bool
}

func (v NullableToolUsertoursFetchAndStartTourRequest) Get() *ToolUsertoursFetchAndStartTourRequest {
	return v.value
}

func (v *NullableToolUsertoursFetchAndStartTourRequest) Set(val *ToolUsertoursFetchAndStartTourRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableToolUsertoursFetchAndStartTourRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableToolUsertoursFetchAndStartTourRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableToolUsertoursFetchAndStartTourRequest(val *ToolUsertoursFetchAndStartTourRequest) *NullableToolUsertoursFetchAndStartTourRequest {
	return &NullableToolUsertoursFetchAndStartTourRequest{value: val, isSet: true}
}

func (v NullableToolUsertoursFetchAndStartTourRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableToolUsertoursFetchAndStartTourRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


