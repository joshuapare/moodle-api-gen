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

// checks if the TinyAutosaveResetSessionRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &TinyAutosaveResetSessionRequest{}

// TinyAutosaveResetSessionRequest struct for TinyAutosaveResetSessionRequest
type TinyAutosaveResetSessionRequest struct {
	// The context id that owns the editor
	Contextid int32 `json:"contextid"`
	// The ID of the element
	Elementid string `json:"elementid"`
	// The page hash
	Pagehash string `json:"pagehash"`
	// The page instance
	Pageinstance string `json:"pageinstance"`
}

type _TinyAutosaveResetSessionRequest TinyAutosaveResetSessionRequest

// NewTinyAutosaveResetSessionRequest instantiates a new TinyAutosaveResetSessionRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewTinyAutosaveResetSessionRequest(contextid int32, elementid string, pagehash string, pageinstance string) *TinyAutosaveResetSessionRequest {
	this := TinyAutosaveResetSessionRequest{}
	this.Contextid = contextid
	this.Elementid = elementid
	this.Pagehash = pagehash
	this.Pageinstance = pageinstance
	return &this
}

// NewTinyAutosaveResetSessionRequestWithDefaults instantiates a new TinyAutosaveResetSessionRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewTinyAutosaveResetSessionRequestWithDefaults() *TinyAutosaveResetSessionRequest {
	this := TinyAutosaveResetSessionRequest{}
	var contextid int32 = null
	this.Contextid = contextid
	var elementid string = "null"
	this.Elementid = elementid
	var pagehash string = "null"
	this.Pagehash = pagehash
	var pageinstance string = "null"
	this.Pageinstance = pageinstance
	return &this
}

// GetContextid returns the Contextid field value
func (o *TinyAutosaveResetSessionRequest) GetContextid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Contextid
}

// GetContextidOk returns a tuple with the Contextid field value
// and a boolean to check if the value has been set.
func (o *TinyAutosaveResetSessionRequest) GetContextidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Contextid, true
}

// SetContextid sets field value
func (o *TinyAutosaveResetSessionRequest) SetContextid(v int32) {
	o.Contextid = v
}

// GetElementid returns the Elementid field value
func (o *TinyAutosaveResetSessionRequest) GetElementid() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Elementid
}

// GetElementidOk returns a tuple with the Elementid field value
// and a boolean to check if the value has been set.
func (o *TinyAutosaveResetSessionRequest) GetElementidOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Elementid, true
}

// SetElementid sets field value
func (o *TinyAutosaveResetSessionRequest) SetElementid(v string) {
	o.Elementid = v
}

// GetPagehash returns the Pagehash field value
func (o *TinyAutosaveResetSessionRequest) GetPagehash() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Pagehash
}

// GetPagehashOk returns a tuple with the Pagehash field value
// and a boolean to check if the value has been set.
func (o *TinyAutosaveResetSessionRequest) GetPagehashOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Pagehash, true
}

// SetPagehash sets field value
func (o *TinyAutosaveResetSessionRequest) SetPagehash(v string) {
	o.Pagehash = v
}

// GetPageinstance returns the Pageinstance field value
func (o *TinyAutosaveResetSessionRequest) GetPageinstance() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Pageinstance
}

// GetPageinstanceOk returns a tuple with the Pageinstance field value
// and a boolean to check if the value has been set.
func (o *TinyAutosaveResetSessionRequest) GetPageinstanceOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Pageinstance, true
}

// SetPageinstance sets field value
func (o *TinyAutosaveResetSessionRequest) SetPageinstance(v string) {
	o.Pageinstance = v
}

func (o TinyAutosaveResetSessionRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o TinyAutosaveResetSessionRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["contextid"] = o.Contextid
	toSerialize["elementid"] = o.Elementid
	toSerialize["pagehash"] = o.Pagehash
	toSerialize["pageinstance"] = o.Pageinstance
	return toSerialize, nil
}

func (o *TinyAutosaveResetSessionRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"contextid",
		"elementid",
		"pagehash",
		"pageinstance",
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

	varTinyAutosaveResetSessionRequest := _TinyAutosaveResetSessionRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varTinyAutosaveResetSessionRequest)

	if err != nil {
		return err
	}

	*o = TinyAutosaveResetSessionRequest(varTinyAutosaveResetSessionRequest)

	return err
}

type NullableTinyAutosaveResetSessionRequest struct {
	value *TinyAutosaveResetSessionRequest
	isSet bool
}

func (v NullableTinyAutosaveResetSessionRequest) Get() *TinyAutosaveResetSessionRequest {
	return v.value
}

func (v *NullableTinyAutosaveResetSessionRequest) Set(val *TinyAutosaveResetSessionRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableTinyAutosaveResetSessionRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableTinyAutosaveResetSessionRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableTinyAutosaveResetSessionRequest(val *TinyAutosaveResetSessionRequest) *NullableTinyAutosaveResetSessionRequest {
	return &NullableTinyAutosaveResetSessionRequest{value: val, isSet: true}
}

func (v NullableTinyAutosaveResetSessionRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableTinyAutosaveResetSessionRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


