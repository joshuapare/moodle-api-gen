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

// checks if the PaygwPaypalGetConfigForJs200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &PaygwPaypalGetConfigForJs200Response{}

// PaygwPaypalGetConfigForJs200Response struct for PaygwPaypalGetConfigForJs200Response
type PaygwPaypalGetConfigForJs200Response struct {
	// Brand name
	Brandname string `json:"brandname"`
	// PayPal client ID
	Clientid string `json:"clientid"`
	// Cost with gateway surcharge
	Cost float32 `json:"cost"`
	// Currency
	Currency string `json:"currency"`
}

type _PaygwPaypalGetConfigForJs200Response PaygwPaypalGetConfigForJs200Response

// NewPaygwPaypalGetConfigForJs200Response instantiates a new PaygwPaypalGetConfigForJs200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPaygwPaypalGetConfigForJs200Response(brandname string, clientid string, cost float32, currency string) *PaygwPaypalGetConfigForJs200Response {
	this := PaygwPaypalGetConfigForJs200Response{}
	this.Brandname = brandname
	this.Clientid = clientid
	this.Cost = cost
	this.Currency = currency
	return &this
}

// NewPaygwPaypalGetConfigForJs200ResponseWithDefaults instantiates a new PaygwPaypalGetConfigForJs200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPaygwPaypalGetConfigForJs200ResponseWithDefaults() *PaygwPaypalGetConfigForJs200Response {
	this := PaygwPaypalGetConfigForJs200Response{}
	var brandname string = "null"
	this.Brandname = brandname
	var clientid string = "null"
	this.Clientid = clientid
	var cost float32 = null
	this.Cost = cost
	var currency string = "null"
	this.Currency = currency
	return &this
}

// GetBrandname returns the Brandname field value
func (o *PaygwPaypalGetConfigForJs200Response) GetBrandname() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Brandname
}

// GetBrandnameOk returns a tuple with the Brandname field value
// and a boolean to check if the value has been set.
func (o *PaygwPaypalGetConfigForJs200Response) GetBrandnameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Brandname, true
}

// SetBrandname sets field value
func (o *PaygwPaypalGetConfigForJs200Response) SetBrandname(v string) {
	o.Brandname = v
}

// GetClientid returns the Clientid field value
func (o *PaygwPaypalGetConfigForJs200Response) GetClientid() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Clientid
}

// GetClientidOk returns a tuple with the Clientid field value
// and a boolean to check if the value has been set.
func (o *PaygwPaypalGetConfigForJs200Response) GetClientidOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Clientid, true
}

// SetClientid sets field value
func (o *PaygwPaypalGetConfigForJs200Response) SetClientid(v string) {
	o.Clientid = v
}

// GetCost returns the Cost field value
func (o *PaygwPaypalGetConfigForJs200Response) GetCost() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Cost
}

// GetCostOk returns a tuple with the Cost field value
// and a boolean to check if the value has been set.
func (o *PaygwPaypalGetConfigForJs200Response) GetCostOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Cost, true
}

// SetCost sets field value
func (o *PaygwPaypalGetConfigForJs200Response) SetCost(v float32) {
	o.Cost = v
}

// GetCurrency returns the Currency field value
func (o *PaygwPaypalGetConfigForJs200Response) GetCurrency() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Currency
}

// GetCurrencyOk returns a tuple with the Currency field value
// and a boolean to check if the value has been set.
func (o *PaygwPaypalGetConfigForJs200Response) GetCurrencyOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Currency, true
}

// SetCurrency sets field value
func (o *PaygwPaypalGetConfigForJs200Response) SetCurrency(v string) {
	o.Currency = v
}

func (o PaygwPaypalGetConfigForJs200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o PaygwPaypalGetConfigForJs200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["brandname"] = o.Brandname
	toSerialize["clientid"] = o.Clientid
	toSerialize["cost"] = o.Cost
	toSerialize["currency"] = o.Currency
	return toSerialize, nil
}

func (o *PaygwPaypalGetConfigForJs200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"brandname",
		"clientid",
		"cost",
		"currency",
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

	varPaygwPaypalGetConfigForJs200Response := _PaygwPaypalGetConfigForJs200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varPaygwPaypalGetConfigForJs200Response)

	if err != nil {
		return err
	}

	*o = PaygwPaypalGetConfigForJs200Response(varPaygwPaypalGetConfigForJs200Response)

	return err
}

type NullablePaygwPaypalGetConfigForJs200Response struct {
	value *PaygwPaypalGetConfigForJs200Response
	isSet bool
}

func (v NullablePaygwPaypalGetConfigForJs200Response) Get() *PaygwPaypalGetConfigForJs200Response {
	return v.value
}

func (v *NullablePaygwPaypalGetConfigForJs200Response) Set(val *PaygwPaypalGetConfigForJs200Response) {
	v.value = val
	v.isSet = true
}

func (v NullablePaygwPaypalGetConfigForJs200Response) IsSet() bool {
	return v.isSet
}

func (v *NullablePaygwPaypalGetConfigForJs200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePaygwPaypalGetConfigForJs200Response(val *PaygwPaypalGetConfigForJs200Response) *NullablePaygwPaypalGetConfigForJs200Response {
	return &NullablePaygwPaypalGetConfigForJs200Response{value: val, isSet: true}
}

func (v NullablePaygwPaypalGetConfigForJs200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePaygwPaypalGetConfigForJs200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


