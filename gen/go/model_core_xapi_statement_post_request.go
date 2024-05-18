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

// checks if the CoreXapiStatementPostRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreXapiStatementPostRequest{}

// CoreXapiStatementPostRequest struct for CoreXapiStatementPostRequest
type CoreXapiStatementPostRequest struct {
	// Component name
	Component string `json:"component"`
	// json object with all the statements to post
	Requestjson string `json:"requestjson"`
}

type _CoreXapiStatementPostRequest CoreXapiStatementPostRequest

// NewCoreXapiStatementPostRequest instantiates a new CoreXapiStatementPostRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreXapiStatementPostRequest(component string, requestjson string) *CoreXapiStatementPostRequest {
	this := CoreXapiStatementPostRequest{}
	this.Component = component
	this.Requestjson = requestjson
	return &this
}

// NewCoreXapiStatementPostRequestWithDefaults instantiates a new CoreXapiStatementPostRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreXapiStatementPostRequestWithDefaults() *CoreXapiStatementPostRequest {
	this := CoreXapiStatementPostRequest{}
	var requestjson string = "null"
	this.Requestjson = requestjson
	return &this
}

// GetComponent returns the Component field value
func (o *CoreXapiStatementPostRequest) GetComponent() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Component
}

// GetComponentOk returns a tuple with the Component field value
// and a boolean to check if the value has been set.
func (o *CoreXapiStatementPostRequest) GetComponentOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Component, true
}

// SetComponent sets field value
func (o *CoreXapiStatementPostRequest) SetComponent(v string) {
	o.Component = v
}

// GetRequestjson returns the Requestjson field value
func (o *CoreXapiStatementPostRequest) GetRequestjson() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Requestjson
}

// GetRequestjsonOk returns a tuple with the Requestjson field value
// and a boolean to check if the value has been set.
func (o *CoreXapiStatementPostRequest) GetRequestjsonOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Requestjson, true
}

// SetRequestjson sets field value
func (o *CoreXapiStatementPostRequest) SetRequestjson(v string) {
	o.Requestjson = v
}

func (o CoreXapiStatementPostRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreXapiStatementPostRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["component"] = o.Component
	toSerialize["requestjson"] = o.Requestjson
	return toSerialize, nil
}

func (o *CoreXapiStatementPostRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"component",
		"requestjson",
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

	varCoreXapiStatementPostRequest := _CoreXapiStatementPostRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreXapiStatementPostRequest)

	if err != nil {
		return err
	}

	*o = CoreXapiStatementPostRequest(varCoreXapiStatementPostRequest)

	return err
}

type NullableCoreXapiStatementPostRequest struct {
	value *CoreXapiStatementPostRequest
	isSet bool
}

func (v NullableCoreXapiStatementPostRequest) Get() *CoreXapiStatementPostRequest {
	return v.value
}

func (v *NullableCoreXapiStatementPostRequest) Set(val *CoreXapiStatementPostRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreXapiStatementPostRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreXapiStatementPostRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreXapiStatementPostRequest(val *CoreXapiStatementPostRequest) *NullableCoreXapiStatementPostRequest {
	return &NullableCoreXapiStatementPostRequest{value: val, isSet: true}
}

func (v NullableCoreXapiStatementPostRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreXapiStatementPostRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

