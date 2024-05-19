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

// checks if the CoreFormGetFiletypesBrowserData200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreFormGetFiletypesBrowserData200Response{}

// CoreFormGetFiletypesBrowserData200Response struct for CoreFormGetFiletypesBrowserData200Response
type CoreFormGetFiletypesBrowserData200Response struct {
	Groups []CoreFormGetFiletypesBrowserData200ResponseGroupsInner `json:"groups"`
}

type _CoreFormGetFiletypesBrowserData200Response CoreFormGetFiletypesBrowserData200Response

// NewCoreFormGetFiletypesBrowserData200Response instantiates a new CoreFormGetFiletypesBrowserData200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreFormGetFiletypesBrowserData200Response(groups []CoreFormGetFiletypesBrowserData200ResponseGroupsInner) *CoreFormGetFiletypesBrowserData200Response {
	this := CoreFormGetFiletypesBrowserData200Response{}
	this.Groups = groups
	return &this
}

// NewCoreFormGetFiletypesBrowserData200ResponseWithDefaults instantiates a new CoreFormGetFiletypesBrowserData200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreFormGetFiletypesBrowserData200ResponseWithDefaults() *CoreFormGetFiletypesBrowserData200Response {
	this := CoreFormGetFiletypesBrowserData200Response{}
	return &this
}

// GetGroups returns the Groups field value
func (o *CoreFormGetFiletypesBrowserData200Response) GetGroups() []CoreFormGetFiletypesBrowserData200ResponseGroupsInner {
	if o == nil {
		var ret []CoreFormGetFiletypesBrowserData200ResponseGroupsInner
		return ret
	}

	return o.Groups
}

// GetGroupsOk returns a tuple with the Groups field value
// and a boolean to check if the value has been set.
func (o *CoreFormGetFiletypesBrowserData200Response) GetGroupsOk() ([]CoreFormGetFiletypesBrowserData200ResponseGroupsInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Groups, true
}

// SetGroups sets field value
func (o *CoreFormGetFiletypesBrowserData200Response) SetGroups(v []CoreFormGetFiletypesBrowserData200ResponseGroupsInner) {
	o.Groups = v
}

func (o CoreFormGetFiletypesBrowserData200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreFormGetFiletypesBrowserData200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["groups"] = o.Groups
	return toSerialize, nil
}

func (o *CoreFormGetFiletypesBrowserData200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"groups",
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

	varCoreFormGetFiletypesBrowserData200Response := _CoreFormGetFiletypesBrowserData200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreFormGetFiletypesBrowserData200Response)

	if err != nil {
		return err
	}

	*o = CoreFormGetFiletypesBrowserData200Response(varCoreFormGetFiletypesBrowserData200Response)

	return err
}

type NullableCoreFormGetFiletypesBrowserData200Response struct {
	value *CoreFormGetFiletypesBrowserData200Response
	isSet bool
}

func (v NullableCoreFormGetFiletypesBrowserData200Response) Get() *CoreFormGetFiletypesBrowserData200Response {
	return v.value
}

func (v *NullableCoreFormGetFiletypesBrowserData200Response) Set(val *CoreFormGetFiletypesBrowserData200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreFormGetFiletypesBrowserData200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreFormGetFiletypesBrowserData200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreFormGetFiletypesBrowserData200Response(val *CoreFormGetFiletypesBrowserData200Response) *NullableCoreFormGetFiletypesBrowserData200Response {
	return &NullableCoreFormGetFiletypesBrowserData200Response{value: val, isSet: true}
}

func (v NullableCoreFormGetFiletypesBrowserData200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreFormGetFiletypesBrowserData200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


