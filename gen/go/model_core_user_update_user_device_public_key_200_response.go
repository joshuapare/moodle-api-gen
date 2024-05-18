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

// checks if the CoreUserUpdateUserDevicePublicKey200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreUserUpdateUserDevicePublicKey200Response{}

// CoreUserUpdateUserDevicePublicKey200Response struct for CoreUserUpdateUserDevicePublicKey200Response
type CoreUserUpdateUserDevicePublicKey200Response struct {
	// Whether the request was successful
	Status bool `json:"status"`
	Warnings []AuthEmailSignupUser200ResponseWarningsInner `json:"warnings,omitempty"`
}

type _CoreUserUpdateUserDevicePublicKey200Response CoreUserUpdateUserDevicePublicKey200Response

// NewCoreUserUpdateUserDevicePublicKey200Response instantiates a new CoreUserUpdateUserDevicePublicKey200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreUserUpdateUserDevicePublicKey200Response(status bool) *CoreUserUpdateUserDevicePublicKey200Response {
	this := CoreUserUpdateUserDevicePublicKey200Response{}
	this.Status = status
	return &this
}

// NewCoreUserUpdateUserDevicePublicKey200ResponseWithDefaults instantiates a new CoreUserUpdateUserDevicePublicKey200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreUserUpdateUserDevicePublicKey200ResponseWithDefaults() *CoreUserUpdateUserDevicePublicKey200Response {
	this := CoreUserUpdateUserDevicePublicKey200Response{}
	var status bool = null
	this.Status = status
	return &this
}

// GetStatus returns the Status field value
func (o *CoreUserUpdateUserDevicePublicKey200Response) GetStatus() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Status
}

// GetStatusOk returns a tuple with the Status field value
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUserDevicePublicKey200Response) GetStatusOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Status, true
}

// SetStatus sets field value
func (o *CoreUserUpdateUserDevicePublicKey200Response) SetStatus(v bool) {
	o.Status = v
}

// GetWarnings returns the Warnings field value if set, zero value otherwise.
func (o *CoreUserUpdateUserDevicePublicKey200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner {
	if o == nil || IsNil(o.Warnings) {
		var ret []AuthEmailSignupUser200ResponseWarningsInner
		return ret
	}
	return o.Warnings
}

// GetWarningsOk returns a tuple with the Warnings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreUserUpdateUserDevicePublicKey200Response) GetWarningsOk() ([]AuthEmailSignupUser200ResponseWarningsInner, bool) {
	if o == nil || IsNil(o.Warnings) {
		return nil, false
	}
	return o.Warnings, true
}

// HasWarnings returns a boolean if a field has been set.
func (o *CoreUserUpdateUserDevicePublicKey200Response) HasWarnings() bool {
	if o != nil && !IsNil(o.Warnings) {
		return true
	}

	return false
}

// SetWarnings gets a reference to the given []AuthEmailSignupUser200ResponseWarningsInner and assigns it to the Warnings field.
func (o *CoreUserUpdateUserDevicePublicKey200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner) {
	o.Warnings = v
}

func (o CoreUserUpdateUserDevicePublicKey200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreUserUpdateUserDevicePublicKey200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["status"] = o.Status
	if !IsNil(o.Warnings) {
		toSerialize["warnings"] = o.Warnings
	}
	return toSerialize, nil
}

func (o *CoreUserUpdateUserDevicePublicKey200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"status",
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

	varCoreUserUpdateUserDevicePublicKey200Response := _CoreUserUpdateUserDevicePublicKey200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreUserUpdateUserDevicePublicKey200Response)

	if err != nil {
		return err
	}

	*o = CoreUserUpdateUserDevicePublicKey200Response(varCoreUserUpdateUserDevicePublicKey200Response)

	return err
}

type NullableCoreUserUpdateUserDevicePublicKey200Response struct {
	value *CoreUserUpdateUserDevicePublicKey200Response
	isSet bool
}

func (v NullableCoreUserUpdateUserDevicePublicKey200Response) Get() *CoreUserUpdateUserDevicePublicKey200Response {
	return v.value
}

func (v *NullableCoreUserUpdateUserDevicePublicKey200Response) Set(val *CoreUserUpdateUserDevicePublicKey200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreUserUpdateUserDevicePublicKey200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreUserUpdateUserDevicePublicKey200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreUserUpdateUserDevicePublicKey200Response(val *CoreUserUpdateUserDevicePublicKey200Response) *NullableCoreUserUpdateUserDevicePublicKey200Response {
	return &NullableCoreUserUpdateUserDevicePublicKey200Response{value: val, isSet: true}
}

func (v NullableCoreUserUpdateUserDevicePublicKey200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreUserUpdateUserDevicePublicKey200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

