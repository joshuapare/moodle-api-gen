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

// checks if the AuthEmailSignupUserRequestCustomprofilefieldsInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &AuthEmailSignupUserRequestCustomprofilefieldsInner{}

// AuthEmailSignupUserRequestCustomprofilefieldsInner struct for AuthEmailSignupUserRequestCustomprofilefieldsInner
type AuthEmailSignupUserRequestCustomprofilefieldsInner struct {
	// The name of the custom field
	Name *string `json:"name,omitempty"`
	// The type of the custom field
	Type *string `json:"type,omitempty"`
	// Custom field value, can be an encoded json if required
	Value *string `json:"value,omitempty"`
}

// NewAuthEmailSignupUserRequestCustomprofilefieldsInner instantiates a new AuthEmailSignupUserRequestCustomprofilefieldsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAuthEmailSignupUserRequestCustomprofilefieldsInner() *AuthEmailSignupUserRequestCustomprofilefieldsInner {
	this := AuthEmailSignupUserRequestCustomprofilefieldsInner{}
	var name string = "null"
	this.Name = &name
	var type_ string = "null"
	this.Type = &type_
	var value string = "null"
	this.Value = &value
	return &this
}

// NewAuthEmailSignupUserRequestCustomprofilefieldsInnerWithDefaults instantiates a new AuthEmailSignupUserRequestCustomprofilefieldsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAuthEmailSignupUserRequestCustomprofilefieldsInnerWithDefaults() *AuthEmailSignupUserRequestCustomprofilefieldsInner {
	this := AuthEmailSignupUserRequestCustomprofilefieldsInner{}
	var name string = "null"
	this.Name = &name
	var type_ string = "null"
	this.Type = &type_
	var value string = "null"
	this.Value = &value
	return &this
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *AuthEmailSignupUserRequestCustomprofilefieldsInner) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AuthEmailSignupUserRequestCustomprofilefieldsInner) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *AuthEmailSignupUserRequestCustomprofilefieldsInner) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *AuthEmailSignupUserRequestCustomprofilefieldsInner) SetName(v string) {
	o.Name = &v
}

// GetType returns the Type field value if set, zero value otherwise.
func (o *AuthEmailSignupUserRequestCustomprofilefieldsInner) GetType() string {
	if o == nil || IsNil(o.Type) {
		var ret string
		return ret
	}
	return *o.Type
}

// GetTypeOk returns a tuple with the Type field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AuthEmailSignupUserRequestCustomprofilefieldsInner) GetTypeOk() (*string, bool) {
	if o == nil || IsNil(o.Type) {
		return nil, false
	}
	return o.Type, true
}

// HasType returns a boolean if a field has been set.
func (o *AuthEmailSignupUserRequestCustomprofilefieldsInner) HasType() bool {
	if o != nil && !IsNil(o.Type) {
		return true
	}

	return false
}

// SetType gets a reference to the given string and assigns it to the Type field.
func (o *AuthEmailSignupUserRequestCustomprofilefieldsInner) SetType(v string) {
	o.Type = &v
}

// GetValue returns the Value field value if set, zero value otherwise.
func (o *AuthEmailSignupUserRequestCustomprofilefieldsInner) GetValue() string {
	if o == nil || IsNil(o.Value) {
		var ret string
		return ret
	}
	return *o.Value
}

// GetValueOk returns a tuple with the Value field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AuthEmailSignupUserRequestCustomprofilefieldsInner) GetValueOk() (*string, bool) {
	if o == nil || IsNil(o.Value) {
		return nil, false
	}
	return o.Value, true
}

// HasValue returns a boolean if a field has been set.
func (o *AuthEmailSignupUserRequestCustomprofilefieldsInner) HasValue() bool {
	if o != nil && !IsNil(o.Value) {
		return true
	}

	return false
}

// SetValue gets a reference to the given string and assigns it to the Value field.
func (o *AuthEmailSignupUserRequestCustomprofilefieldsInner) SetValue(v string) {
	o.Value = &v
}

func (o AuthEmailSignupUserRequestCustomprofilefieldsInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o AuthEmailSignupUserRequestCustomprofilefieldsInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !IsNil(o.Type) {
		toSerialize["type"] = o.Type
	}
	if !IsNil(o.Value) {
		toSerialize["value"] = o.Value
	}
	return toSerialize, nil
}

type NullableAuthEmailSignupUserRequestCustomprofilefieldsInner struct {
	value *AuthEmailSignupUserRequestCustomprofilefieldsInner
	isSet bool
}

func (v NullableAuthEmailSignupUserRequestCustomprofilefieldsInner) Get() *AuthEmailSignupUserRequestCustomprofilefieldsInner {
	return v.value
}

func (v *NullableAuthEmailSignupUserRequestCustomprofilefieldsInner) Set(val *AuthEmailSignupUserRequestCustomprofilefieldsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableAuthEmailSignupUserRequestCustomprofilefieldsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableAuthEmailSignupUserRequestCustomprofilefieldsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAuthEmailSignupUserRequestCustomprofilefieldsInner(val *AuthEmailSignupUserRequestCustomprofilefieldsInner) *NullableAuthEmailSignupUserRequestCustomprofilefieldsInner {
	return &NullableAuthEmailSignupUserRequestCustomprofilefieldsInner{value: val, isSet: true}
}

func (v NullableAuthEmailSignupUserRequestCustomprofilefieldsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAuthEmailSignupUserRequestCustomprofilefieldsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


