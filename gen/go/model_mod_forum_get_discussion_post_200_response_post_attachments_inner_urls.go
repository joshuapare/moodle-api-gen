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

// checks if the ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls{}

// ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls struct for ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls
type ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls struct {
	// The URL used to export the attachment
	Export *string `json:"export,omitempty"`
}

// NewModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls instantiates a new ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls() *ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls {
	this := ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls{}
	return &this
}

// NewModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrlsWithDefaults instantiates a new ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrlsWithDefaults() *ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls {
	this := ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls{}
	return &this
}

// GetExport returns the Export field value if set, zero value otherwise.
func (o *ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls) GetExport() string {
	if o == nil || IsNil(o.Export) {
		var ret string
		return ret
	}
	return *o.Export
}

// GetExportOk returns a tuple with the Export field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls) GetExportOk() (*string, bool) {
	if o == nil || IsNil(o.Export) {
		return nil, false
	}
	return o.Export, true
}

// HasExport returns a boolean if a field has been set.
func (o *ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls) HasExport() bool {
	if o != nil && !IsNil(o.Export) {
		return true
	}

	return false
}

// SetExport gets a reference to the given string and assigns it to the Export field.
func (o *ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls) SetExport(v string) {
	o.Export = &v
}

func (o ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Export) {
		toSerialize["export"] = o.Export
	}
	return toSerialize, nil
}

type NullableModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls struct {
	value *ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls
	isSet bool
}

func (v NullableModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls) Get() *ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls {
	return v.value
}

func (v *NullableModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls) Set(val *ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls) {
	v.value = val
	v.isSet = true
}

func (v NullableModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls) IsSet() bool {
	return v.isSet
}

func (v *NullableModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls(val *ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls) *NullableModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls {
	return &NullableModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls{value: val, isSet: true}
}

func (v NullableModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


