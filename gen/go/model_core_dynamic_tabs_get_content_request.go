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

// checks if the CoreDynamicTabsGetContentRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreDynamicTabsGetContentRequest{}

// CoreDynamicTabsGetContentRequest struct for CoreDynamicTabsGetContentRequest
type CoreDynamicTabsGetContentRequest struct {
	// Json-encoded data
	Jsondata string `json:"jsondata"`
	// Tab class
	Tab string `json:"tab"`
}

type _CoreDynamicTabsGetContentRequest CoreDynamicTabsGetContentRequest

// NewCoreDynamicTabsGetContentRequest instantiates a new CoreDynamicTabsGetContentRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreDynamicTabsGetContentRequest(jsondata string, tab string) *CoreDynamicTabsGetContentRequest {
	this := CoreDynamicTabsGetContentRequest{}
	this.Jsondata = jsondata
	this.Tab = tab
	return &this
}

// NewCoreDynamicTabsGetContentRequestWithDefaults instantiates a new CoreDynamicTabsGetContentRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreDynamicTabsGetContentRequestWithDefaults() *CoreDynamicTabsGetContentRequest {
	this := CoreDynamicTabsGetContentRequest{}
	var jsondata string = "null"
	this.Jsondata = jsondata
	var tab string = "null"
	this.Tab = tab
	return &this
}

// GetJsondata returns the Jsondata field value
func (o *CoreDynamicTabsGetContentRequest) GetJsondata() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Jsondata
}

// GetJsondataOk returns a tuple with the Jsondata field value
// and a boolean to check if the value has been set.
func (o *CoreDynamicTabsGetContentRequest) GetJsondataOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Jsondata, true
}

// SetJsondata sets field value
func (o *CoreDynamicTabsGetContentRequest) SetJsondata(v string) {
	o.Jsondata = v
}

// GetTab returns the Tab field value
func (o *CoreDynamicTabsGetContentRequest) GetTab() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Tab
}

// GetTabOk returns a tuple with the Tab field value
// and a boolean to check if the value has been set.
func (o *CoreDynamicTabsGetContentRequest) GetTabOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Tab, true
}

// SetTab sets field value
func (o *CoreDynamicTabsGetContentRequest) SetTab(v string) {
	o.Tab = v
}

func (o CoreDynamicTabsGetContentRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreDynamicTabsGetContentRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["jsondata"] = o.Jsondata
	toSerialize["tab"] = o.Tab
	return toSerialize, nil
}

func (o *CoreDynamicTabsGetContentRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"jsondata",
		"tab",
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

	varCoreDynamicTabsGetContentRequest := _CoreDynamicTabsGetContentRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreDynamicTabsGetContentRequest)

	if err != nil {
		return err
	}

	*o = CoreDynamicTabsGetContentRequest(varCoreDynamicTabsGetContentRequest)

	return err
}

type NullableCoreDynamicTabsGetContentRequest struct {
	value *CoreDynamicTabsGetContentRequest
	isSet bool
}

func (v NullableCoreDynamicTabsGetContentRequest) Get() *CoreDynamicTabsGetContentRequest {
	return v.value
}

func (v *NullableCoreDynamicTabsGetContentRequest) Set(val *CoreDynamicTabsGetContentRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreDynamicTabsGetContentRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreDynamicTabsGetContentRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreDynamicTabsGetContentRequest(val *CoreDynamicTabsGetContentRequest) *NullableCoreDynamicTabsGetContentRequest {
	return &NullableCoreDynamicTabsGetContentRequest{value: val, isSet: true}
}

func (v NullableCoreDynamicTabsGetContentRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreDynamicTabsGetContentRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

