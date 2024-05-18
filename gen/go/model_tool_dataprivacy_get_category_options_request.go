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

// checks if the ToolDataprivacyGetCategoryOptionsRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ToolDataprivacyGetCategoryOptionsRequest{}

// ToolDataprivacyGetCategoryOptionsRequest struct for ToolDataprivacyGetCategoryOptionsRequest
type ToolDataprivacyGetCategoryOptionsRequest struct {
	// Include option \"Inherit\"
	Includeinherit *bool `json:"includeinherit,omitempty"`
	// Include option \"Not set\"
	Includenotset *bool `json:"includenotset,omitempty"`
}

// NewToolDataprivacyGetCategoryOptionsRequest instantiates a new ToolDataprivacyGetCategoryOptionsRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewToolDataprivacyGetCategoryOptionsRequest() *ToolDataprivacyGetCategoryOptionsRequest {
	this := ToolDataprivacyGetCategoryOptionsRequest{}
	var includeinherit bool = true
	this.Includeinherit = &includeinherit
	var includenotset bool = false
	this.Includenotset = &includenotset
	return &this
}

// NewToolDataprivacyGetCategoryOptionsRequestWithDefaults instantiates a new ToolDataprivacyGetCategoryOptionsRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewToolDataprivacyGetCategoryOptionsRequestWithDefaults() *ToolDataprivacyGetCategoryOptionsRequest {
	this := ToolDataprivacyGetCategoryOptionsRequest{}
	var includeinherit bool = true
	this.Includeinherit = &includeinherit
	var includenotset bool = false
	this.Includenotset = &includenotset
	return &this
}

// GetIncludeinherit returns the Includeinherit field value if set, zero value otherwise.
func (o *ToolDataprivacyGetCategoryOptionsRequest) GetIncludeinherit() bool {
	if o == nil || IsNil(o.Includeinherit) {
		var ret bool
		return ret
	}
	return *o.Includeinherit
}

// GetIncludeinheritOk returns a tuple with the Includeinherit field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ToolDataprivacyGetCategoryOptionsRequest) GetIncludeinheritOk() (*bool, bool) {
	if o == nil || IsNil(o.Includeinherit) {
		return nil, false
	}
	return o.Includeinherit, true
}

// HasIncludeinherit returns a boolean if a field has been set.
func (o *ToolDataprivacyGetCategoryOptionsRequest) HasIncludeinherit() bool {
	if o != nil && !IsNil(o.Includeinherit) {
		return true
	}

	return false
}

// SetIncludeinherit gets a reference to the given bool and assigns it to the Includeinherit field.
func (o *ToolDataprivacyGetCategoryOptionsRequest) SetIncludeinherit(v bool) {
	o.Includeinherit = &v
}

// GetIncludenotset returns the Includenotset field value if set, zero value otherwise.
func (o *ToolDataprivacyGetCategoryOptionsRequest) GetIncludenotset() bool {
	if o == nil || IsNil(o.Includenotset) {
		var ret bool
		return ret
	}
	return *o.Includenotset
}

// GetIncludenotsetOk returns a tuple with the Includenotset field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ToolDataprivacyGetCategoryOptionsRequest) GetIncludenotsetOk() (*bool, bool) {
	if o == nil || IsNil(o.Includenotset) {
		return nil, false
	}
	return o.Includenotset, true
}

// HasIncludenotset returns a boolean if a field has been set.
func (o *ToolDataprivacyGetCategoryOptionsRequest) HasIncludenotset() bool {
	if o != nil && !IsNil(o.Includenotset) {
		return true
	}

	return false
}

// SetIncludenotset gets a reference to the given bool and assigns it to the Includenotset field.
func (o *ToolDataprivacyGetCategoryOptionsRequest) SetIncludenotset(v bool) {
	o.Includenotset = &v
}

func (o ToolDataprivacyGetCategoryOptionsRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ToolDataprivacyGetCategoryOptionsRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Includeinherit) {
		toSerialize["includeinherit"] = o.Includeinherit
	}
	if !IsNil(o.Includenotset) {
		toSerialize["includenotset"] = o.Includenotset
	}
	return toSerialize, nil
}

type NullableToolDataprivacyGetCategoryOptionsRequest struct {
	value *ToolDataprivacyGetCategoryOptionsRequest
	isSet bool
}

func (v NullableToolDataprivacyGetCategoryOptionsRequest) Get() *ToolDataprivacyGetCategoryOptionsRequest {
	return v.value
}

func (v *NullableToolDataprivacyGetCategoryOptionsRequest) Set(val *ToolDataprivacyGetCategoryOptionsRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableToolDataprivacyGetCategoryOptionsRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableToolDataprivacyGetCategoryOptionsRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableToolDataprivacyGetCategoryOptionsRequest(val *ToolDataprivacyGetCategoryOptionsRequest) *NullableToolDataprivacyGetCategoryOptionsRequest {
	return &NullableToolDataprivacyGetCategoryOptionsRequest{value: val, isSet: true}
}

func (v NullableToolDataprivacyGetCategoryOptionsRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableToolDataprivacyGetCategoryOptionsRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


