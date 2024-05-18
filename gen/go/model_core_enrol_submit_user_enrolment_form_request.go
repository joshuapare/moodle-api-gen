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

// checks if the CoreEnrolSubmitUserEnrolmentFormRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreEnrolSubmitUserEnrolmentFormRequest{}

// CoreEnrolSubmitUserEnrolmentFormRequest struct for CoreEnrolSubmitUserEnrolmentFormRequest
type CoreEnrolSubmitUserEnrolmentFormRequest struct {
	// The data from the event form
	Formdata string `json:"formdata"`
}

type _CoreEnrolSubmitUserEnrolmentFormRequest CoreEnrolSubmitUserEnrolmentFormRequest

// NewCoreEnrolSubmitUserEnrolmentFormRequest instantiates a new CoreEnrolSubmitUserEnrolmentFormRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreEnrolSubmitUserEnrolmentFormRequest(formdata string) *CoreEnrolSubmitUserEnrolmentFormRequest {
	this := CoreEnrolSubmitUserEnrolmentFormRequest{}
	this.Formdata = formdata
	return &this
}

// NewCoreEnrolSubmitUserEnrolmentFormRequestWithDefaults instantiates a new CoreEnrolSubmitUserEnrolmentFormRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreEnrolSubmitUserEnrolmentFormRequestWithDefaults() *CoreEnrolSubmitUserEnrolmentFormRequest {
	this := CoreEnrolSubmitUserEnrolmentFormRequest{}
	return &this
}

// GetFormdata returns the Formdata field value
func (o *CoreEnrolSubmitUserEnrolmentFormRequest) GetFormdata() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Formdata
}

// GetFormdataOk returns a tuple with the Formdata field value
// and a boolean to check if the value has been set.
func (o *CoreEnrolSubmitUserEnrolmentFormRequest) GetFormdataOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Formdata, true
}

// SetFormdata sets field value
func (o *CoreEnrolSubmitUserEnrolmentFormRequest) SetFormdata(v string) {
	o.Formdata = v
}

func (o CoreEnrolSubmitUserEnrolmentFormRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreEnrolSubmitUserEnrolmentFormRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["formdata"] = o.Formdata
	return toSerialize, nil
}

func (o *CoreEnrolSubmitUserEnrolmentFormRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"formdata",
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

	varCoreEnrolSubmitUserEnrolmentFormRequest := _CoreEnrolSubmitUserEnrolmentFormRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreEnrolSubmitUserEnrolmentFormRequest)

	if err != nil {
		return err
	}

	*o = CoreEnrolSubmitUserEnrolmentFormRequest(varCoreEnrolSubmitUserEnrolmentFormRequest)

	return err
}

type NullableCoreEnrolSubmitUserEnrolmentFormRequest struct {
	value *CoreEnrolSubmitUserEnrolmentFormRequest
	isSet bool
}

func (v NullableCoreEnrolSubmitUserEnrolmentFormRequest) Get() *CoreEnrolSubmitUserEnrolmentFormRequest {
	return v.value
}

func (v *NullableCoreEnrolSubmitUserEnrolmentFormRequest) Set(val *CoreEnrolSubmitUserEnrolmentFormRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreEnrolSubmitUserEnrolmentFormRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreEnrolSubmitUserEnrolmentFormRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreEnrolSubmitUserEnrolmentFormRequest(val *CoreEnrolSubmitUserEnrolmentFormRequest) *NullableCoreEnrolSubmitUserEnrolmentFormRequest {
	return &NullableCoreEnrolSubmitUserEnrolmentFormRequest{value: val, isSet: true}
}

func (v NullableCoreEnrolSubmitUserEnrolmentFormRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreEnrolSubmitUserEnrolmentFormRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


