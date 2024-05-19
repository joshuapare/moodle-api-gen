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

// checks if the PaygwPaypalGetConfigForJsRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &PaygwPaypalGetConfigForJsRequest{}

// PaygwPaypalGetConfigForJsRequest struct for PaygwPaypalGetConfigForJsRequest
type PaygwPaypalGetConfigForJsRequest struct {
	// Component
	Component string `json:"component"`
	// An identifier for payment area in the component
	Itemid int32 `json:"itemid"`
	// Payment area in the component
	Paymentarea string `json:"paymentarea"`
}

type _PaygwPaypalGetConfigForJsRequest PaygwPaypalGetConfigForJsRequest

// NewPaygwPaypalGetConfigForJsRequest instantiates a new PaygwPaypalGetConfigForJsRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPaygwPaypalGetConfigForJsRequest(component string, itemid int32, paymentarea string) *PaygwPaypalGetConfigForJsRequest {
	this := PaygwPaypalGetConfigForJsRequest{}
	this.Component = component
	this.Itemid = itemid
	this.Paymentarea = paymentarea
	return &this
}

// NewPaygwPaypalGetConfigForJsRequestWithDefaults instantiates a new PaygwPaypalGetConfigForJsRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPaygwPaypalGetConfigForJsRequestWithDefaults() *PaygwPaypalGetConfigForJsRequest {
	this := PaygwPaypalGetConfigForJsRequest{}
	return &this
}

// GetComponent returns the Component field value
func (o *PaygwPaypalGetConfigForJsRequest) GetComponent() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Component
}

// GetComponentOk returns a tuple with the Component field value
// and a boolean to check if the value has been set.
func (o *PaygwPaypalGetConfigForJsRequest) GetComponentOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Component, true
}

// SetComponent sets field value
func (o *PaygwPaypalGetConfigForJsRequest) SetComponent(v string) {
	o.Component = v
}

// GetItemid returns the Itemid field value
func (o *PaygwPaypalGetConfigForJsRequest) GetItemid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Itemid
}

// GetItemidOk returns a tuple with the Itemid field value
// and a boolean to check if the value has been set.
func (o *PaygwPaypalGetConfigForJsRequest) GetItemidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Itemid, true
}

// SetItemid sets field value
func (o *PaygwPaypalGetConfigForJsRequest) SetItemid(v int32) {
	o.Itemid = v
}

// GetPaymentarea returns the Paymentarea field value
func (o *PaygwPaypalGetConfigForJsRequest) GetPaymentarea() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Paymentarea
}

// GetPaymentareaOk returns a tuple with the Paymentarea field value
// and a boolean to check if the value has been set.
func (o *PaygwPaypalGetConfigForJsRequest) GetPaymentareaOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Paymentarea, true
}

// SetPaymentarea sets field value
func (o *PaygwPaypalGetConfigForJsRequest) SetPaymentarea(v string) {
	o.Paymentarea = v
}

func (o PaygwPaypalGetConfigForJsRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o PaygwPaypalGetConfigForJsRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["component"] = o.Component
	toSerialize["itemid"] = o.Itemid
	toSerialize["paymentarea"] = o.Paymentarea
	return toSerialize, nil
}

func (o *PaygwPaypalGetConfigForJsRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"component",
		"itemid",
		"paymentarea",
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

	varPaygwPaypalGetConfigForJsRequest := _PaygwPaypalGetConfigForJsRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varPaygwPaypalGetConfigForJsRequest)

	if err != nil {
		return err
	}

	*o = PaygwPaypalGetConfigForJsRequest(varPaygwPaypalGetConfigForJsRequest)

	return err
}

type NullablePaygwPaypalGetConfigForJsRequest struct {
	value *PaygwPaypalGetConfigForJsRequest
	isSet bool
}

func (v NullablePaygwPaypalGetConfigForJsRequest) Get() *PaygwPaypalGetConfigForJsRequest {
	return v.value
}

func (v *NullablePaygwPaypalGetConfigForJsRequest) Set(val *PaygwPaypalGetConfigForJsRequest) {
	v.value = val
	v.isSet = true
}

func (v NullablePaygwPaypalGetConfigForJsRequest) IsSet() bool {
	return v.isSet
}

func (v *NullablePaygwPaypalGetConfigForJsRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePaygwPaypalGetConfigForJsRequest(val *PaygwPaypalGetConfigForJsRequest) *NullablePaygwPaypalGetConfigForJsRequest {
	return &NullablePaygwPaypalGetConfigForJsRequest{value: val, isSet: true}
}

func (v NullablePaygwPaypalGetConfigForJsRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePaygwPaypalGetConfigForJsRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


