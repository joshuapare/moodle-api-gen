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

// checks if the CoreBackupGetAsyncBackupLinksRestore200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreBackupGetAsyncBackupLinksRestore200Response{}

// CoreBackupGetAsyncBackupLinksRestore200Response struct for CoreBackupGetAsyncBackupLinksRestore200Response
type CoreBackupGetAsyncBackupLinksRestore200Response struct {
	// Restore url
	Restoreurl string `json:"restoreurl"`
}

type _CoreBackupGetAsyncBackupLinksRestore200Response CoreBackupGetAsyncBackupLinksRestore200Response

// NewCoreBackupGetAsyncBackupLinksRestore200Response instantiates a new CoreBackupGetAsyncBackupLinksRestore200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreBackupGetAsyncBackupLinksRestore200Response(restoreurl string) *CoreBackupGetAsyncBackupLinksRestore200Response {
	this := CoreBackupGetAsyncBackupLinksRestore200Response{}
	this.Restoreurl = restoreurl
	return &this
}

// NewCoreBackupGetAsyncBackupLinksRestore200ResponseWithDefaults instantiates a new CoreBackupGetAsyncBackupLinksRestore200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreBackupGetAsyncBackupLinksRestore200ResponseWithDefaults() *CoreBackupGetAsyncBackupLinksRestore200Response {
	this := CoreBackupGetAsyncBackupLinksRestore200Response{}
	var restoreurl string = "null"
	this.Restoreurl = restoreurl
	return &this
}

// GetRestoreurl returns the Restoreurl field value
func (o *CoreBackupGetAsyncBackupLinksRestore200Response) GetRestoreurl() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Restoreurl
}

// GetRestoreurlOk returns a tuple with the Restoreurl field value
// and a boolean to check if the value has been set.
func (o *CoreBackupGetAsyncBackupLinksRestore200Response) GetRestoreurlOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Restoreurl, true
}

// SetRestoreurl sets field value
func (o *CoreBackupGetAsyncBackupLinksRestore200Response) SetRestoreurl(v string) {
	o.Restoreurl = v
}

func (o CoreBackupGetAsyncBackupLinksRestore200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreBackupGetAsyncBackupLinksRestore200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["restoreurl"] = o.Restoreurl
	return toSerialize, nil
}

func (o *CoreBackupGetAsyncBackupLinksRestore200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"restoreurl",
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

	varCoreBackupGetAsyncBackupLinksRestore200Response := _CoreBackupGetAsyncBackupLinksRestore200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreBackupGetAsyncBackupLinksRestore200Response)

	if err != nil {
		return err
	}

	*o = CoreBackupGetAsyncBackupLinksRestore200Response(varCoreBackupGetAsyncBackupLinksRestore200Response)

	return err
}

type NullableCoreBackupGetAsyncBackupLinksRestore200Response struct {
	value *CoreBackupGetAsyncBackupLinksRestore200Response
	isSet bool
}

func (v NullableCoreBackupGetAsyncBackupLinksRestore200Response) Get() *CoreBackupGetAsyncBackupLinksRestore200Response {
	return v.value
}

func (v *NullableCoreBackupGetAsyncBackupLinksRestore200Response) Set(val *CoreBackupGetAsyncBackupLinksRestore200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreBackupGetAsyncBackupLinksRestore200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreBackupGetAsyncBackupLinksRestore200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreBackupGetAsyncBackupLinksRestore200Response(val *CoreBackupGetAsyncBackupLinksRestore200Response) *NullableCoreBackupGetAsyncBackupLinksRestore200Response {
	return &NullableCoreBackupGetAsyncBackupLinksRestore200Response{value: val, isSet: true}
}

func (v NullableCoreBackupGetAsyncBackupLinksRestore200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreBackupGetAsyncBackupLinksRestore200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


