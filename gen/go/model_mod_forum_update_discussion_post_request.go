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

// checks if the ModForumUpdateDiscussionPostRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModForumUpdateDiscussionPostRequest{}

// ModForumUpdateDiscussionPostRequest struct for ModForumUpdateDiscussionPostRequest
type ModForumUpdateDiscussionPostRequest struct {
	// Updated post message (HTML assumed if messageformat is not provided)
	Message *string `json:"message,omitempty"`
	// message format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
	Messageformat *int32 `json:"messageformat,omitempty"`
	Options []ModForumUpdateDiscussionPostRequestOptionsInner `json:"options,omitempty"`
	// Post to be updated. It can be a discussion topic post.
	Postid int32 `json:"postid"`
	// Updated post subject
	Subject *string `json:"subject,omitempty"`
}

type _ModForumUpdateDiscussionPostRequest ModForumUpdateDiscussionPostRequest

// NewModForumUpdateDiscussionPostRequest instantiates a new ModForumUpdateDiscussionPostRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModForumUpdateDiscussionPostRequest(postid int32) *ModForumUpdateDiscussionPostRequest {
	this := ModForumUpdateDiscussionPostRequest{}
	var message string = ""
	this.Message = &message
	var messageformat int32 = 1
	this.Messageformat = &messageformat
	this.Postid = postid
	var subject string = ""
	this.Subject = &subject
	return &this
}

// NewModForumUpdateDiscussionPostRequestWithDefaults instantiates a new ModForumUpdateDiscussionPostRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModForumUpdateDiscussionPostRequestWithDefaults() *ModForumUpdateDiscussionPostRequest {
	this := ModForumUpdateDiscussionPostRequest{}
	var message string = ""
	this.Message = &message
	var messageformat int32 = 1
	this.Messageformat = &messageformat
	var postid int32 = null
	this.Postid = postid
	var subject string = ""
	this.Subject = &subject
	return &this
}

// GetMessage returns the Message field value if set, zero value otherwise.
func (o *ModForumUpdateDiscussionPostRequest) GetMessage() string {
	if o == nil || IsNil(o.Message) {
		var ret string
		return ret
	}
	return *o.Message
}

// GetMessageOk returns a tuple with the Message field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModForumUpdateDiscussionPostRequest) GetMessageOk() (*string, bool) {
	if o == nil || IsNil(o.Message) {
		return nil, false
	}
	return o.Message, true
}

// HasMessage returns a boolean if a field has been set.
func (o *ModForumUpdateDiscussionPostRequest) HasMessage() bool {
	if o != nil && !IsNil(o.Message) {
		return true
	}

	return false
}

// SetMessage gets a reference to the given string and assigns it to the Message field.
func (o *ModForumUpdateDiscussionPostRequest) SetMessage(v string) {
	o.Message = &v
}

// GetMessageformat returns the Messageformat field value if set, zero value otherwise.
func (o *ModForumUpdateDiscussionPostRequest) GetMessageformat() int32 {
	if o == nil || IsNil(o.Messageformat) {
		var ret int32
		return ret
	}
	return *o.Messageformat
}

// GetMessageformatOk returns a tuple with the Messageformat field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModForumUpdateDiscussionPostRequest) GetMessageformatOk() (*int32, bool) {
	if o == nil || IsNil(o.Messageformat) {
		return nil, false
	}
	return o.Messageformat, true
}

// HasMessageformat returns a boolean if a field has been set.
func (o *ModForumUpdateDiscussionPostRequest) HasMessageformat() bool {
	if o != nil && !IsNil(o.Messageformat) {
		return true
	}

	return false
}

// SetMessageformat gets a reference to the given int32 and assigns it to the Messageformat field.
func (o *ModForumUpdateDiscussionPostRequest) SetMessageformat(v int32) {
	o.Messageformat = &v
}

// GetOptions returns the Options field value if set, zero value otherwise.
func (o *ModForumUpdateDiscussionPostRequest) GetOptions() []ModForumUpdateDiscussionPostRequestOptionsInner {
	if o == nil || IsNil(o.Options) {
		var ret []ModForumUpdateDiscussionPostRequestOptionsInner
		return ret
	}
	return o.Options
}

// GetOptionsOk returns a tuple with the Options field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModForumUpdateDiscussionPostRequest) GetOptionsOk() ([]ModForumUpdateDiscussionPostRequestOptionsInner, bool) {
	if o == nil || IsNil(o.Options) {
		return nil, false
	}
	return o.Options, true
}

// HasOptions returns a boolean if a field has been set.
func (o *ModForumUpdateDiscussionPostRequest) HasOptions() bool {
	if o != nil && !IsNil(o.Options) {
		return true
	}

	return false
}

// SetOptions gets a reference to the given []ModForumUpdateDiscussionPostRequestOptionsInner and assigns it to the Options field.
func (o *ModForumUpdateDiscussionPostRequest) SetOptions(v []ModForumUpdateDiscussionPostRequestOptionsInner) {
	o.Options = v
}

// GetPostid returns the Postid field value
func (o *ModForumUpdateDiscussionPostRequest) GetPostid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Postid
}

// GetPostidOk returns a tuple with the Postid field value
// and a boolean to check if the value has been set.
func (o *ModForumUpdateDiscussionPostRequest) GetPostidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Postid, true
}

// SetPostid sets field value
func (o *ModForumUpdateDiscussionPostRequest) SetPostid(v int32) {
	o.Postid = v
}

// GetSubject returns the Subject field value if set, zero value otherwise.
func (o *ModForumUpdateDiscussionPostRequest) GetSubject() string {
	if o == nil || IsNil(o.Subject) {
		var ret string
		return ret
	}
	return *o.Subject
}

// GetSubjectOk returns a tuple with the Subject field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModForumUpdateDiscussionPostRequest) GetSubjectOk() (*string, bool) {
	if o == nil || IsNil(o.Subject) {
		return nil, false
	}
	return o.Subject, true
}

// HasSubject returns a boolean if a field has been set.
func (o *ModForumUpdateDiscussionPostRequest) HasSubject() bool {
	if o != nil && !IsNil(o.Subject) {
		return true
	}

	return false
}

// SetSubject gets a reference to the given string and assigns it to the Subject field.
func (o *ModForumUpdateDiscussionPostRequest) SetSubject(v string) {
	o.Subject = &v
}

func (o ModForumUpdateDiscussionPostRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModForumUpdateDiscussionPostRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Message) {
		toSerialize["message"] = o.Message
	}
	if !IsNil(o.Messageformat) {
		toSerialize["messageformat"] = o.Messageformat
	}
	if !IsNil(o.Options) {
		toSerialize["options"] = o.Options
	}
	toSerialize["postid"] = o.Postid
	if !IsNil(o.Subject) {
		toSerialize["subject"] = o.Subject
	}
	return toSerialize, nil
}

func (o *ModForumUpdateDiscussionPostRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"postid",
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

	varModForumUpdateDiscussionPostRequest := _ModForumUpdateDiscussionPostRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModForumUpdateDiscussionPostRequest)

	if err != nil {
		return err
	}

	*o = ModForumUpdateDiscussionPostRequest(varModForumUpdateDiscussionPostRequest)

	return err
}

type NullableModForumUpdateDiscussionPostRequest struct {
	value *ModForumUpdateDiscussionPostRequest
	isSet bool
}

func (v NullableModForumUpdateDiscussionPostRequest) Get() *ModForumUpdateDiscussionPostRequest {
	return v.value
}

func (v *NullableModForumUpdateDiscussionPostRequest) Set(val *ModForumUpdateDiscussionPostRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableModForumUpdateDiscussionPostRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableModForumUpdateDiscussionPostRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModForumUpdateDiscussionPostRequest(val *ModForumUpdateDiscussionPostRequest) *NullableModForumUpdateDiscussionPostRequest {
	return &NullableModForumUpdateDiscussionPostRequest{value: val, isSet: true}
}

func (v NullableModForumUpdateDiscussionPostRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModForumUpdateDiscussionPostRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


