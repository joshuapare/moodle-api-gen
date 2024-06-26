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

// checks if the ModQuizViewAttemptRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModQuizViewAttemptRequest{}

// ModQuizViewAttemptRequest struct for ModQuizViewAttemptRequest
type ModQuizViewAttemptRequest struct {
	// attempt id
	Attemptid int32 `json:"attemptid"`
	// page number
	Page int32 `json:"page"`
	Preflightdata []ModQuizGetAttemptDataRequestPreflightdataInner `json:"preflightdata,omitempty"`
}

type _ModQuizViewAttemptRequest ModQuizViewAttemptRequest

// NewModQuizViewAttemptRequest instantiates a new ModQuizViewAttemptRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModQuizViewAttemptRequest(attemptid int32, page int32) *ModQuizViewAttemptRequest {
	this := ModQuizViewAttemptRequest{}
	this.Attemptid = attemptid
	this.Page = page
	return &this
}

// NewModQuizViewAttemptRequestWithDefaults instantiates a new ModQuizViewAttemptRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModQuizViewAttemptRequestWithDefaults() *ModQuizViewAttemptRequest {
	this := ModQuizViewAttemptRequest{}
	return &this
}

// GetAttemptid returns the Attemptid field value
func (o *ModQuizViewAttemptRequest) GetAttemptid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Attemptid
}

// GetAttemptidOk returns a tuple with the Attemptid field value
// and a boolean to check if the value has been set.
func (o *ModQuizViewAttemptRequest) GetAttemptidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Attemptid, true
}

// SetAttemptid sets field value
func (o *ModQuizViewAttemptRequest) SetAttemptid(v int32) {
	o.Attemptid = v
}

// GetPage returns the Page field value
func (o *ModQuizViewAttemptRequest) GetPage() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Page
}

// GetPageOk returns a tuple with the Page field value
// and a boolean to check if the value has been set.
func (o *ModQuizViewAttemptRequest) GetPageOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Page, true
}

// SetPage sets field value
func (o *ModQuizViewAttemptRequest) SetPage(v int32) {
	o.Page = v
}

// GetPreflightdata returns the Preflightdata field value if set, zero value otherwise.
func (o *ModQuizViewAttemptRequest) GetPreflightdata() []ModQuizGetAttemptDataRequestPreflightdataInner {
	if o == nil || IsNil(o.Preflightdata) {
		var ret []ModQuizGetAttemptDataRequestPreflightdataInner
		return ret
	}
	return o.Preflightdata
}

// GetPreflightdataOk returns a tuple with the Preflightdata field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModQuizViewAttemptRequest) GetPreflightdataOk() ([]ModQuizGetAttemptDataRequestPreflightdataInner, bool) {
	if o == nil || IsNil(o.Preflightdata) {
		return nil, false
	}
	return o.Preflightdata, true
}

// HasPreflightdata returns a boolean if a field has been set.
func (o *ModQuizViewAttemptRequest) HasPreflightdata() bool {
	if o != nil && !IsNil(o.Preflightdata) {
		return true
	}

	return false
}

// SetPreflightdata gets a reference to the given []ModQuizGetAttemptDataRequestPreflightdataInner and assigns it to the Preflightdata field.
func (o *ModQuizViewAttemptRequest) SetPreflightdata(v []ModQuizGetAttemptDataRequestPreflightdataInner) {
	o.Preflightdata = v
}

func (o ModQuizViewAttemptRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModQuizViewAttemptRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["attemptid"] = o.Attemptid
	toSerialize["page"] = o.Page
	if !IsNil(o.Preflightdata) {
		toSerialize["preflightdata"] = o.Preflightdata
	}
	return toSerialize, nil
}

func (o *ModQuizViewAttemptRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"attemptid",
		"page",
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

	varModQuizViewAttemptRequest := _ModQuizViewAttemptRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModQuizViewAttemptRequest)

	if err != nil {
		return err
	}

	*o = ModQuizViewAttemptRequest(varModQuizViewAttemptRequest)

	return err
}

type NullableModQuizViewAttemptRequest struct {
	value *ModQuizViewAttemptRequest
	isSet bool
}

func (v NullableModQuizViewAttemptRequest) Get() *ModQuizViewAttemptRequest {
	return v.value
}

func (v *NullableModQuizViewAttemptRequest) Set(val *ModQuizViewAttemptRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableModQuizViewAttemptRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableModQuizViewAttemptRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModQuizViewAttemptRequest(val *ModQuizViewAttemptRequest) *NullableModQuizViewAttemptRequest {
	return &NullableModQuizViewAttemptRequest{value: val, isSet: true}
}

func (v NullableModQuizViewAttemptRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModQuizViewAttemptRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


