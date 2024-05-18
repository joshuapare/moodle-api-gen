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

// checks if the ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy{}

// ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy struct for ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy
type ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy struct {
	// The iomadpolicy version content
	Content *string `json:"content,omitempty"`
	// The iomadpolicy version name
	Name *string `json:"name,omitempty"`
	// The iomadpolicy version id
	Versionid *int32 `json:"versionid,omitempty"`
}

// NewToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy instantiates a new ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy() *ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy {
	this := ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy{}
	var content string = "null"
	this.Content = &content
	var name string = "null"
	this.Name = &name
	var versionid int32 = null
	this.Versionid = &versionid
	return &this
}

// NewToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicyWithDefaults instantiates a new ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicyWithDefaults() *ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy {
	this := ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy{}
	var content string = "null"
	this.Content = &content
	var name string = "null"
	this.Name = &name
	var versionid int32 = null
	this.Versionid = &versionid
	return &this
}

// GetContent returns the Content field value if set, zero value otherwise.
func (o *ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy) GetContent() string {
	if o == nil || IsNil(o.Content) {
		var ret string
		return ret
	}
	return *o.Content
}

// GetContentOk returns a tuple with the Content field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy) GetContentOk() (*string, bool) {
	if o == nil || IsNil(o.Content) {
		return nil, false
	}
	return o.Content, true
}

// HasContent returns a boolean if a field has been set.
func (o *ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy) HasContent() bool {
	if o != nil && !IsNil(o.Content) {
		return true
	}

	return false
}

// SetContent gets a reference to the given string and assigns it to the Content field.
func (o *ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy) SetContent(v string) {
	o.Content = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy) SetName(v string) {
	o.Name = &v
}

// GetVersionid returns the Versionid field value if set, zero value otherwise.
func (o *ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy) GetVersionid() int32 {
	if o == nil || IsNil(o.Versionid) {
		var ret int32
		return ret
	}
	return *o.Versionid
}

// GetVersionidOk returns a tuple with the Versionid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy) GetVersionidOk() (*int32, bool) {
	if o == nil || IsNil(o.Versionid) {
		return nil, false
	}
	return o.Versionid, true
}

// HasVersionid returns a boolean if a field has been set.
func (o *ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy) HasVersionid() bool {
	if o != nil && !IsNil(o.Versionid) {
		return true
	}

	return false
}

// SetVersionid gets a reference to the given int32 and assigns it to the Versionid field.
func (o *ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy) SetVersionid(v int32) {
	o.Versionid = &v
}

func (o ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Content) {
		toSerialize["content"] = o.Content
	}
	if !IsNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !IsNil(o.Versionid) {
		toSerialize["versionid"] = o.Versionid
	}
	return toSerialize, nil
}

type NullableToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy struct {
	value *ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy
	isSet bool
}

func (v NullableToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy) Get() *ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy {
	return v.value
}

func (v *NullableToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy) Set(val *ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy) {
	v.value = val
	v.isSet = true
}

func (v NullableToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy) IsSet() bool {
	return v.isSet
}

func (v *NullableToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy(val *ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy) *NullableToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy {
	return &NullableToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy{value: val, isSet: true}
}

func (v NullableToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

