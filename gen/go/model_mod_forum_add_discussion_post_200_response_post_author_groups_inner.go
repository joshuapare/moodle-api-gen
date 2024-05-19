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

// checks if the ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner{}

// ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner struct for ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner
type ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner struct {
	// id
	Id *int32 `json:"id,omitempty"`
	// name
	Name *string `json:"name,omitempty"`
	Urls *ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrls `json:"urls,omitempty"`
}

// NewModForumAddDiscussionPost200ResponsePostAuthorGroupsInner instantiates a new ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModForumAddDiscussionPost200ResponsePostAuthorGroupsInner() *ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner {
	this := ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner{}
	return &this
}

// NewModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerWithDefaults instantiates a new ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerWithDefaults() *ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner {
	this := ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner{}
	return &this
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner) GetId() int32 {
	if o == nil || IsNil(o.Id) {
		var ret int32
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner) GetIdOk() (*int32, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given int32 and assigns it to the Id field.
func (o *ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner) SetId(v int32) {
	o.Id = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner) SetName(v string) {
	o.Name = &v
}

// GetUrls returns the Urls field value if set, zero value otherwise.
func (o *ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner) GetUrls() ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrls {
	if o == nil || IsNil(o.Urls) {
		var ret ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrls
		return ret
	}
	return *o.Urls
}

// GetUrlsOk returns a tuple with the Urls field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner) GetUrlsOk() (*ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrls, bool) {
	if o == nil || IsNil(o.Urls) {
		return nil, false
	}
	return o.Urls, true
}

// HasUrls returns a boolean if a field has been set.
func (o *ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner) HasUrls() bool {
	if o != nil && !IsNil(o.Urls) {
		return true
	}

	return false
}

// SetUrls gets a reference to the given ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrls and assigns it to the Urls field.
func (o *ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner) SetUrls(v ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrls) {
	o.Urls = &v
}

func (o ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !IsNil(o.Urls) {
		toSerialize["urls"] = o.Urls
	}
	return toSerialize, nil
}

type NullableModForumAddDiscussionPost200ResponsePostAuthorGroupsInner struct {
	value *ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner
	isSet bool
}

func (v NullableModForumAddDiscussionPost200ResponsePostAuthorGroupsInner) Get() *ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner {
	return v.value
}

func (v *NullableModForumAddDiscussionPost200ResponsePostAuthorGroupsInner) Set(val *ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableModForumAddDiscussionPost200ResponsePostAuthorGroupsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableModForumAddDiscussionPost200ResponsePostAuthorGroupsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModForumAddDiscussionPost200ResponsePostAuthorGroupsInner(val *ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner) *NullableModForumAddDiscussionPost200ResponsePostAuthorGroupsInner {
	return &NullableModForumAddDiscussionPost200ResponsePostAuthorGroupsInner{value: val, isSet: true}
}

func (v NullableModForumAddDiscussionPost200ResponsePostAuthorGroupsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModForumAddDiscussionPost200ResponsePostAuthorGroupsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


