/*
Moodle Webservice API

Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

API version: 4.3.4
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package moodleclient

import (
	"encoding/json"
)

// checks if the CoreFormGetFiletypesBrowserDataRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreFormGetFiletypesBrowserDataRequest{}

// CoreFormGetFiletypesBrowserDataRequest struct for CoreFormGetFiletypesBrowserDataRequest
type CoreFormGetFiletypesBrowserDataRequest struct {
	// Allows to select All file types, does not apply with onlytypes are set.
	Allowall *bool `json:"allowall,omitempty"`
	// Current types that should be selected.
	Current *string `json:"current,omitempty"`
	// Limit the browser to the given groups and extensions
	Onlytypes *string `json:"onlytypes,omitempty"`
}

// NewCoreFormGetFiletypesBrowserDataRequest instantiates a new CoreFormGetFiletypesBrowserDataRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreFormGetFiletypesBrowserDataRequest() *CoreFormGetFiletypesBrowserDataRequest {
	this := CoreFormGetFiletypesBrowserDataRequest{}
	var allowall bool = true
	this.Allowall = &allowall
	var current string = ""
	this.Current = &current
	var onlytypes string = ""
	this.Onlytypes = &onlytypes
	return &this
}

// NewCoreFormGetFiletypesBrowserDataRequestWithDefaults instantiates a new CoreFormGetFiletypesBrowserDataRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreFormGetFiletypesBrowserDataRequestWithDefaults() *CoreFormGetFiletypesBrowserDataRequest {
	this := CoreFormGetFiletypesBrowserDataRequest{}
	var allowall bool = true
	this.Allowall = &allowall
	var current string = ""
	this.Current = &current
	var onlytypes string = ""
	this.Onlytypes = &onlytypes
	return &this
}

// GetAllowall returns the Allowall field value if set, zero value otherwise.
func (o *CoreFormGetFiletypesBrowserDataRequest) GetAllowall() bool {
	if o == nil || IsNil(o.Allowall) {
		var ret bool
		return ret
	}
	return *o.Allowall
}

// GetAllowallOk returns a tuple with the Allowall field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreFormGetFiletypesBrowserDataRequest) GetAllowallOk() (*bool, bool) {
	if o == nil || IsNil(o.Allowall) {
		return nil, false
	}
	return o.Allowall, true
}

// HasAllowall returns a boolean if a field has been set.
func (o *CoreFormGetFiletypesBrowserDataRequest) HasAllowall() bool {
	if o != nil && !IsNil(o.Allowall) {
		return true
	}

	return false
}

// SetAllowall gets a reference to the given bool and assigns it to the Allowall field.
func (o *CoreFormGetFiletypesBrowserDataRequest) SetAllowall(v bool) {
	o.Allowall = &v
}

// GetCurrent returns the Current field value if set, zero value otherwise.
func (o *CoreFormGetFiletypesBrowserDataRequest) GetCurrent() string {
	if o == nil || IsNil(o.Current) {
		var ret string
		return ret
	}
	return *o.Current
}

// GetCurrentOk returns a tuple with the Current field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreFormGetFiletypesBrowserDataRequest) GetCurrentOk() (*string, bool) {
	if o == nil || IsNil(o.Current) {
		return nil, false
	}
	return o.Current, true
}

// HasCurrent returns a boolean if a field has been set.
func (o *CoreFormGetFiletypesBrowserDataRequest) HasCurrent() bool {
	if o != nil && !IsNil(o.Current) {
		return true
	}

	return false
}

// SetCurrent gets a reference to the given string and assigns it to the Current field.
func (o *CoreFormGetFiletypesBrowserDataRequest) SetCurrent(v string) {
	o.Current = &v
}

// GetOnlytypes returns the Onlytypes field value if set, zero value otherwise.
func (o *CoreFormGetFiletypesBrowserDataRequest) GetOnlytypes() string {
	if o == nil || IsNil(o.Onlytypes) {
		var ret string
		return ret
	}
	return *o.Onlytypes
}

// GetOnlytypesOk returns a tuple with the Onlytypes field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreFormGetFiletypesBrowserDataRequest) GetOnlytypesOk() (*string, bool) {
	if o == nil || IsNil(o.Onlytypes) {
		return nil, false
	}
	return o.Onlytypes, true
}

// HasOnlytypes returns a boolean if a field has been set.
func (o *CoreFormGetFiletypesBrowserDataRequest) HasOnlytypes() bool {
	if o != nil && !IsNil(o.Onlytypes) {
		return true
	}

	return false
}

// SetOnlytypes gets a reference to the given string and assigns it to the Onlytypes field.
func (o *CoreFormGetFiletypesBrowserDataRequest) SetOnlytypes(v string) {
	o.Onlytypes = &v
}

func (o CoreFormGetFiletypesBrowserDataRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreFormGetFiletypesBrowserDataRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Allowall) {
		toSerialize["allowall"] = o.Allowall
	}
	if !IsNil(o.Current) {
		toSerialize["current"] = o.Current
	}
	if !IsNil(o.Onlytypes) {
		toSerialize["onlytypes"] = o.Onlytypes
	}
	return toSerialize, nil
}

type NullableCoreFormGetFiletypesBrowserDataRequest struct {
	value *CoreFormGetFiletypesBrowserDataRequest
	isSet bool
}

func (v NullableCoreFormGetFiletypesBrowserDataRequest) Get() *CoreFormGetFiletypesBrowserDataRequest {
	return v.value
}

func (v *NullableCoreFormGetFiletypesBrowserDataRequest) Set(val *CoreFormGetFiletypesBrowserDataRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreFormGetFiletypesBrowserDataRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreFormGetFiletypesBrowserDataRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreFormGetFiletypesBrowserDataRequest(val *CoreFormGetFiletypesBrowserDataRequest) *NullableCoreFormGetFiletypesBrowserDataRequest {
	return &NullableCoreFormGetFiletypesBrowserDataRequest{value: val, isSet: true}
}

func (v NullableCoreFormGetFiletypesBrowserDataRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreFormGetFiletypesBrowserDataRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


