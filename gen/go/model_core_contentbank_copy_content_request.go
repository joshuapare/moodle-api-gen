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

// checks if the CoreContentbankCopyContentRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreContentbankCopyContentRequest{}

// CoreContentbankCopyContentRequest struct for CoreContentbankCopyContentRequest
type CoreContentbankCopyContentRequest struct {
	// The content id to copy
	Contentid int32 `json:"contentid"`
	// The new name for the content
	Name string `json:"name"`
}

type _CoreContentbankCopyContentRequest CoreContentbankCopyContentRequest

// NewCoreContentbankCopyContentRequest instantiates a new CoreContentbankCopyContentRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreContentbankCopyContentRequest(contentid int32, name string) *CoreContentbankCopyContentRequest {
	this := CoreContentbankCopyContentRequest{}
	this.Contentid = contentid
	this.Name = name
	return &this
}

// NewCoreContentbankCopyContentRequestWithDefaults instantiates a new CoreContentbankCopyContentRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreContentbankCopyContentRequestWithDefaults() *CoreContentbankCopyContentRequest {
	this := CoreContentbankCopyContentRequest{}
	var contentid int32 = null
	this.Contentid = contentid
	var name string = "null"
	this.Name = name
	return &this
}

// GetContentid returns the Contentid field value
func (o *CoreContentbankCopyContentRequest) GetContentid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Contentid
}

// GetContentidOk returns a tuple with the Contentid field value
// and a boolean to check if the value has been set.
func (o *CoreContentbankCopyContentRequest) GetContentidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Contentid, true
}

// SetContentid sets field value
func (o *CoreContentbankCopyContentRequest) SetContentid(v int32) {
	o.Contentid = v
}

// GetName returns the Name field value
func (o *CoreContentbankCopyContentRequest) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *CoreContentbankCopyContentRequest) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *CoreContentbankCopyContentRequest) SetName(v string) {
	o.Name = v
}

func (o CoreContentbankCopyContentRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreContentbankCopyContentRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["contentid"] = o.Contentid
	toSerialize["name"] = o.Name
	return toSerialize, nil
}

func (o *CoreContentbankCopyContentRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"contentid",
		"name",
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

	varCoreContentbankCopyContentRequest := _CoreContentbankCopyContentRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreContentbankCopyContentRequest)

	if err != nil {
		return err
	}

	*o = CoreContentbankCopyContentRequest(varCoreContentbankCopyContentRequest)

	return err
}

type NullableCoreContentbankCopyContentRequest struct {
	value *CoreContentbankCopyContentRequest
	isSet bool
}

func (v NullableCoreContentbankCopyContentRequest) Get() *CoreContentbankCopyContentRequest {
	return v.value
}

func (v *NullableCoreContentbankCopyContentRequest) Set(val *CoreContentbankCopyContentRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreContentbankCopyContentRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreContentbankCopyContentRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreContentbankCopyContentRequest(val *CoreContentbankCopyContentRequest) *NullableCoreContentbankCopyContentRequest {
	return &NullableCoreContentbankCopyContentRequest{value: val, isSet: true}
}

func (v NullableCoreContentbankCopyContentRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreContentbankCopyContentRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

