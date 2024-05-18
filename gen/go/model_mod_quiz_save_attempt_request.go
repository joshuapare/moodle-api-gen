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

// checks if the ModQuizSaveAttemptRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModQuizSaveAttemptRequest{}

// ModQuizSaveAttemptRequest struct for ModQuizSaveAttemptRequest
type ModQuizSaveAttemptRequest struct {
	// attempt id
	Attemptid int32 `json:"attemptid"`
	Data []ModQuizGetAttemptDataRequestPreflightdataInner `json:"data"`
	Preflightdata []ModQuizGetAttemptDataRequestPreflightdataInner `json:"preflightdata,omitempty"`
}

type _ModQuizSaveAttemptRequest ModQuizSaveAttemptRequest

// NewModQuizSaveAttemptRequest instantiates a new ModQuizSaveAttemptRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModQuizSaveAttemptRequest(attemptid int32, data []ModQuizGetAttemptDataRequestPreflightdataInner) *ModQuizSaveAttemptRequest {
	this := ModQuizSaveAttemptRequest{}
	this.Attemptid = attemptid
	this.Data = data
	return &this
}

// NewModQuizSaveAttemptRequestWithDefaults instantiates a new ModQuizSaveAttemptRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModQuizSaveAttemptRequestWithDefaults() *ModQuizSaveAttemptRequest {
	this := ModQuizSaveAttemptRequest{}
	return &this
}

// GetAttemptid returns the Attemptid field value
func (o *ModQuizSaveAttemptRequest) GetAttemptid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Attemptid
}

// GetAttemptidOk returns a tuple with the Attemptid field value
// and a boolean to check if the value has been set.
func (o *ModQuizSaveAttemptRequest) GetAttemptidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Attemptid, true
}

// SetAttemptid sets field value
func (o *ModQuizSaveAttemptRequest) SetAttemptid(v int32) {
	o.Attemptid = v
}

// GetData returns the Data field value
func (o *ModQuizSaveAttemptRequest) GetData() []ModQuizGetAttemptDataRequestPreflightdataInner {
	if o == nil {
		var ret []ModQuizGetAttemptDataRequestPreflightdataInner
		return ret
	}

	return o.Data
}

// GetDataOk returns a tuple with the Data field value
// and a boolean to check if the value has been set.
func (o *ModQuizSaveAttemptRequest) GetDataOk() ([]ModQuizGetAttemptDataRequestPreflightdataInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Data, true
}

// SetData sets field value
func (o *ModQuizSaveAttemptRequest) SetData(v []ModQuizGetAttemptDataRequestPreflightdataInner) {
	o.Data = v
}

// GetPreflightdata returns the Preflightdata field value if set, zero value otherwise.
func (o *ModQuizSaveAttemptRequest) GetPreflightdata() []ModQuizGetAttemptDataRequestPreflightdataInner {
	if o == nil || IsNil(o.Preflightdata) {
		var ret []ModQuizGetAttemptDataRequestPreflightdataInner
		return ret
	}
	return o.Preflightdata
}

// GetPreflightdataOk returns a tuple with the Preflightdata field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModQuizSaveAttemptRequest) GetPreflightdataOk() ([]ModQuizGetAttemptDataRequestPreflightdataInner, bool) {
	if o == nil || IsNil(o.Preflightdata) {
		return nil, false
	}
	return o.Preflightdata, true
}

// HasPreflightdata returns a boolean if a field has been set.
func (o *ModQuizSaveAttemptRequest) HasPreflightdata() bool {
	if o != nil && !IsNil(o.Preflightdata) {
		return true
	}

	return false
}

// SetPreflightdata gets a reference to the given []ModQuizGetAttemptDataRequestPreflightdataInner and assigns it to the Preflightdata field.
func (o *ModQuizSaveAttemptRequest) SetPreflightdata(v []ModQuizGetAttemptDataRequestPreflightdataInner) {
	o.Preflightdata = v
}

func (o ModQuizSaveAttemptRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModQuizSaveAttemptRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["attemptid"] = o.Attemptid
	toSerialize["data"] = o.Data
	if !IsNil(o.Preflightdata) {
		toSerialize["preflightdata"] = o.Preflightdata
	}
	return toSerialize, nil
}

func (o *ModQuizSaveAttemptRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"attemptid",
		"data",
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

	varModQuizSaveAttemptRequest := _ModQuizSaveAttemptRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModQuizSaveAttemptRequest)

	if err != nil {
		return err
	}

	*o = ModQuizSaveAttemptRequest(varModQuizSaveAttemptRequest)

	return err
}

type NullableModQuizSaveAttemptRequest struct {
	value *ModQuizSaveAttemptRequest
	isSet bool
}

func (v NullableModQuizSaveAttemptRequest) Get() *ModQuizSaveAttemptRequest {
	return v.value
}

func (v *NullableModQuizSaveAttemptRequest) Set(val *ModQuizSaveAttemptRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableModQuizSaveAttemptRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableModQuizSaveAttemptRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModQuizSaveAttemptRequest(val *ModQuizSaveAttemptRequest) *NullableModQuizSaveAttemptRequest {
	return &NullableModQuizSaveAttemptRequest{value: val, isSet: true}
}

func (v NullableModQuizSaveAttemptRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModQuizSaveAttemptRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


