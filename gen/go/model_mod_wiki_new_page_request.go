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

// checks if the ModWikiNewPageRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModWikiNewPageRequest{}

// ModWikiNewPageRequest struct for ModWikiNewPageRequest
type ModWikiNewPageRequest struct {
	// Page contents.
	Content string `json:"content"`
	// Page contents format. If an invalid format is provided, default                     wiki format is used.
	Contentformat *string `json:"contentformat,omitempty"`
	// Subwiki's group ID. Used if subwiki does not exists.
	Groupid *int32 `json:"groupid,omitempty"`
	// Page's subwiki ID.
	Subwikiid *int32 `json:"subwikiid,omitempty"`
	// New page title.
	Title string `json:"title"`
	// Subwiki's user ID. Used if subwiki does not exists.
	Userid *int32 `json:"userid,omitempty"`
	// Page's wiki ID. Used if subwiki does not exists.
	Wikiid *int32 `json:"wikiid,omitempty"`
}

type _ModWikiNewPageRequest ModWikiNewPageRequest

// NewModWikiNewPageRequest instantiates a new ModWikiNewPageRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModWikiNewPageRequest(content string, title string) *ModWikiNewPageRequest {
	this := ModWikiNewPageRequest{}
	this.Content = content
	var contentformat string = "null"
	this.Contentformat = &contentformat
	var groupid int32 = null
	this.Groupid = &groupid
	this.Title = title
	var userid int32 = null
	this.Userid = &userid
	var wikiid int32 = null
	this.Wikiid = &wikiid
	return &this
}

// NewModWikiNewPageRequestWithDefaults instantiates a new ModWikiNewPageRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModWikiNewPageRequestWithDefaults() *ModWikiNewPageRequest {
	this := ModWikiNewPageRequest{}
	var contentformat string = "null"
	this.Contentformat = &contentformat
	var groupid int32 = null
	this.Groupid = &groupid
	var title string = "null"
	this.Title = title
	var userid int32 = null
	this.Userid = &userid
	var wikiid int32 = null
	this.Wikiid = &wikiid
	return &this
}

// GetContent returns the Content field value
func (o *ModWikiNewPageRequest) GetContent() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Content
}

// GetContentOk returns a tuple with the Content field value
// and a boolean to check if the value has been set.
func (o *ModWikiNewPageRequest) GetContentOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Content, true
}

// SetContent sets field value
func (o *ModWikiNewPageRequest) SetContent(v string) {
	o.Content = v
}

// GetContentformat returns the Contentformat field value if set, zero value otherwise.
func (o *ModWikiNewPageRequest) GetContentformat() string {
	if o == nil || IsNil(o.Contentformat) {
		var ret string
		return ret
	}
	return *o.Contentformat
}

// GetContentformatOk returns a tuple with the Contentformat field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModWikiNewPageRequest) GetContentformatOk() (*string, bool) {
	if o == nil || IsNil(o.Contentformat) {
		return nil, false
	}
	return o.Contentformat, true
}

// HasContentformat returns a boolean if a field has been set.
func (o *ModWikiNewPageRequest) HasContentformat() bool {
	if o != nil && !IsNil(o.Contentformat) {
		return true
	}

	return false
}

// SetContentformat gets a reference to the given string and assigns it to the Contentformat field.
func (o *ModWikiNewPageRequest) SetContentformat(v string) {
	o.Contentformat = &v
}

// GetGroupid returns the Groupid field value if set, zero value otherwise.
func (o *ModWikiNewPageRequest) GetGroupid() int32 {
	if o == nil || IsNil(o.Groupid) {
		var ret int32
		return ret
	}
	return *o.Groupid
}

// GetGroupidOk returns a tuple with the Groupid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModWikiNewPageRequest) GetGroupidOk() (*int32, bool) {
	if o == nil || IsNil(o.Groupid) {
		return nil, false
	}
	return o.Groupid, true
}

// HasGroupid returns a boolean if a field has been set.
func (o *ModWikiNewPageRequest) HasGroupid() bool {
	if o != nil && !IsNil(o.Groupid) {
		return true
	}

	return false
}

// SetGroupid gets a reference to the given int32 and assigns it to the Groupid field.
func (o *ModWikiNewPageRequest) SetGroupid(v int32) {
	o.Groupid = &v
}

// GetSubwikiid returns the Subwikiid field value if set, zero value otherwise.
func (o *ModWikiNewPageRequest) GetSubwikiid() int32 {
	if o == nil || IsNil(o.Subwikiid) {
		var ret int32
		return ret
	}
	return *o.Subwikiid
}

// GetSubwikiidOk returns a tuple with the Subwikiid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModWikiNewPageRequest) GetSubwikiidOk() (*int32, bool) {
	if o == nil || IsNil(o.Subwikiid) {
		return nil, false
	}
	return o.Subwikiid, true
}

// HasSubwikiid returns a boolean if a field has been set.
func (o *ModWikiNewPageRequest) HasSubwikiid() bool {
	if o != nil && !IsNil(o.Subwikiid) {
		return true
	}

	return false
}

// SetSubwikiid gets a reference to the given int32 and assigns it to the Subwikiid field.
func (o *ModWikiNewPageRequest) SetSubwikiid(v int32) {
	o.Subwikiid = &v
}

// GetTitle returns the Title field value
func (o *ModWikiNewPageRequest) GetTitle() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Title
}

// GetTitleOk returns a tuple with the Title field value
// and a boolean to check if the value has been set.
func (o *ModWikiNewPageRequest) GetTitleOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Title, true
}

// SetTitle sets field value
func (o *ModWikiNewPageRequest) SetTitle(v string) {
	o.Title = v
}

// GetUserid returns the Userid field value if set, zero value otherwise.
func (o *ModWikiNewPageRequest) GetUserid() int32 {
	if o == nil || IsNil(o.Userid) {
		var ret int32
		return ret
	}
	return *o.Userid
}

// GetUseridOk returns a tuple with the Userid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModWikiNewPageRequest) GetUseridOk() (*int32, bool) {
	if o == nil || IsNil(o.Userid) {
		return nil, false
	}
	return o.Userid, true
}

// HasUserid returns a boolean if a field has been set.
func (o *ModWikiNewPageRequest) HasUserid() bool {
	if o != nil && !IsNil(o.Userid) {
		return true
	}

	return false
}

// SetUserid gets a reference to the given int32 and assigns it to the Userid field.
func (o *ModWikiNewPageRequest) SetUserid(v int32) {
	o.Userid = &v
}

// GetWikiid returns the Wikiid field value if set, zero value otherwise.
func (o *ModWikiNewPageRequest) GetWikiid() int32 {
	if o == nil || IsNil(o.Wikiid) {
		var ret int32
		return ret
	}
	return *o.Wikiid
}

// GetWikiidOk returns a tuple with the Wikiid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModWikiNewPageRequest) GetWikiidOk() (*int32, bool) {
	if o == nil || IsNil(o.Wikiid) {
		return nil, false
	}
	return o.Wikiid, true
}

// HasWikiid returns a boolean if a field has been set.
func (o *ModWikiNewPageRequest) HasWikiid() bool {
	if o != nil && !IsNil(o.Wikiid) {
		return true
	}

	return false
}

// SetWikiid gets a reference to the given int32 and assigns it to the Wikiid field.
func (o *ModWikiNewPageRequest) SetWikiid(v int32) {
	o.Wikiid = &v
}

func (o ModWikiNewPageRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModWikiNewPageRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["content"] = o.Content
	if !IsNil(o.Contentformat) {
		toSerialize["contentformat"] = o.Contentformat
	}
	if !IsNil(o.Groupid) {
		toSerialize["groupid"] = o.Groupid
	}
	if !IsNil(o.Subwikiid) {
		toSerialize["subwikiid"] = o.Subwikiid
	}
	toSerialize["title"] = o.Title
	if !IsNil(o.Userid) {
		toSerialize["userid"] = o.Userid
	}
	if !IsNil(o.Wikiid) {
		toSerialize["wikiid"] = o.Wikiid
	}
	return toSerialize, nil
}

func (o *ModWikiNewPageRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"content",
		"title",
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

	varModWikiNewPageRequest := _ModWikiNewPageRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModWikiNewPageRequest)

	if err != nil {
		return err
	}

	*o = ModWikiNewPageRequest(varModWikiNewPageRequest)

	return err
}

type NullableModWikiNewPageRequest struct {
	value *ModWikiNewPageRequest
	isSet bool
}

func (v NullableModWikiNewPageRequest) Get() *ModWikiNewPageRequest {
	return v.value
}

func (v *NullableModWikiNewPageRequest) Set(val *ModWikiNewPageRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableModWikiNewPageRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableModWikiNewPageRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModWikiNewPageRequest(val *ModWikiNewPageRequest) *NullableModWikiNewPageRequest {
	return &NullableModWikiNewPageRequest{value: val, isSet: true}
}

func (v NullableModWikiNewPageRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModWikiNewPageRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

