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

// checks if the CoreMessageSendInstantMessagesRequestMessagesInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreMessageSendInstantMessagesRequestMessagesInner{}

// CoreMessageSendInstantMessagesRequestMessagesInner struct for CoreMessageSendInstantMessagesRequestMessagesInner
type CoreMessageSendInstantMessagesRequestMessagesInner struct {
	// your own client id for the message. If this id is provided, the fail message id will be returned to you
	Clientmsgid *string `json:"clientmsgid,omitempty"`
	// the text of the message
	Text *string `json:"text,omitempty"`
	// text format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
	Textformat *int32 `json:"textformat,omitempty"`
	// id of the user to send the private message
	Touserid *int32 `json:"touserid,omitempty"`
}

// NewCoreMessageSendInstantMessagesRequestMessagesInner instantiates a new CoreMessageSendInstantMessagesRequestMessagesInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreMessageSendInstantMessagesRequestMessagesInner() *CoreMessageSendInstantMessagesRequestMessagesInner {
	this := CoreMessageSendInstantMessagesRequestMessagesInner{}
	var clientmsgid string = "null"
	this.Clientmsgid = &clientmsgid
	var text string = "null"
	this.Text = &text
	var textformat int32 = 0
	this.Textformat = &textformat
	var touserid int32 = null
	this.Touserid = &touserid
	return &this
}

// NewCoreMessageSendInstantMessagesRequestMessagesInnerWithDefaults instantiates a new CoreMessageSendInstantMessagesRequestMessagesInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreMessageSendInstantMessagesRequestMessagesInnerWithDefaults() *CoreMessageSendInstantMessagesRequestMessagesInner {
	this := CoreMessageSendInstantMessagesRequestMessagesInner{}
	var clientmsgid string = "null"
	this.Clientmsgid = &clientmsgid
	var text string = "null"
	this.Text = &text
	var textformat int32 = 0
	this.Textformat = &textformat
	var touserid int32 = null
	this.Touserid = &touserid
	return &this
}

// GetClientmsgid returns the Clientmsgid field value if set, zero value otherwise.
func (o *CoreMessageSendInstantMessagesRequestMessagesInner) GetClientmsgid() string {
	if o == nil || IsNil(o.Clientmsgid) {
		var ret string
		return ret
	}
	return *o.Clientmsgid
}

// GetClientmsgidOk returns a tuple with the Clientmsgid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreMessageSendInstantMessagesRequestMessagesInner) GetClientmsgidOk() (*string, bool) {
	if o == nil || IsNil(o.Clientmsgid) {
		return nil, false
	}
	return o.Clientmsgid, true
}

// HasClientmsgid returns a boolean if a field has been set.
func (o *CoreMessageSendInstantMessagesRequestMessagesInner) HasClientmsgid() bool {
	if o != nil && !IsNil(o.Clientmsgid) {
		return true
	}

	return false
}

// SetClientmsgid gets a reference to the given string and assigns it to the Clientmsgid field.
func (o *CoreMessageSendInstantMessagesRequestMessagesInner) SetClientmsgid(v string) {
	o.Clientmsgid = &v
}

// GetText returns the Text field value if set, zero value otherwise.
func (o *CoreMessageSendInstantMessagesRequestMessagesInner) GetText() string {
	if o == nil || IsNil(o.Text) {
		var ret string
		return ret
	}
	return *o.Text
}

// GetTextOk returns a tuple with the Text field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreMessageSendInstantMessagesRequestMessagesInner) GetTextOk() (*string, bool) {
	if o == nil || IsNil(o.Text) {
		return nil, false
	}
	return o.Text, true
}

// HasText returns a boolean if a field has been set.
func (o *CoreMessageSendInstantMessagesRequestMessagesInner) HasText() bool {
	if o != nil && !IsNil(o.Text) {
		return true
	}

	return false
}

// SetText gets a reference to the given string and assigns it to the Text field.
func (o *CoreMessageSendInstantMessagesRequestMessagesInner) SetText(v string) {
	o.Text = &v
}

// GetTextformat returns the Textformat field value if set, zero value otherwise.
func (o *CoreMessageSendInstantMessagesRequestMessagesInner) GetTextformat() int32 {
	if o == nil || IsNil(o.Textformat) {
		var ret int32
		return ret
	}
	return *o.Textformat
}

// GetTextformatOk returns a tuple with the Textformat field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreMessageSendInstantMessagesRequestMessagesInner) GetTextformatOk() (*int32, bool) {
	if o == nil || IsNil(o.Textformat) {
		return nil, false
	}
	return o.Textformat, true
}

// HasTextformat returns a boolean if a field has been set.
func (o *CoreMessageSendInstantMessagesRequestMessagesInner) HasTextformat() bool {
	if o != nil && !IsNil(o.Textformat) {
		return true
	}

	return false
}

// SetTextformat gets a reference to the given int32 and assigns it to the Textformat field.
func (o *CoreMessageSendInstantMessagesRequestMessagesInner) SetTextformat(v int32) {
	o.Textformat = &v
}

// GetTouserid returns the Touserid field value if set, zero value otherwise.
func (o *CoreMessageSendInstantMessagesRequestMessagesInner) GetTouserid() int32 {
	if o == nil || IsNil(o.Touserid) {
		var ret int32
		return ret
	}
	return *o.Touserid
}

// GetTouseridOk returns a tuple with the Touserid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreMessageSendInstantMessagesRequestMessagesInner) GetTouseridOk() (*int32, bool) {
	if o == nil || IsNil(o.Touserid) {
		return nil, false
	}
	return o.Touserid, true
}

// HasTouserid returns a boolean if a field has been set.
func (o *CoreMessageSendInstantMessagesRequestMessagesInner) HasTouserid() bool {
	if o != nil && !IsNil(o.Touserid) {
		return true
	}

	return false
}

// SetTouserid gets a reference to the given int32 and assigns it to the Touserid field.
func (o *CoreMessageSendInstantMessagesRequestMessagesInner) SetTouserid(v int32) {
	o.Touserid = &v
}

func (o CoreMessageSendInstantMessagesRequestMessagesInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreMessageSendInstantMessagesRequestMessagesInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Clientmsgid) {
		toSerialize["clientmsgid"] = o.Clientmsgid
	}
	if !IsNil(o.Text) {
		toSerialize["text"] = o.Text
	}
	if !IsNil(o.Textformat) {
		toSerialize["textformat"] = o.Textformat
	}
	if !IsNil(o.Touserid) {
		toSerialize["touserid"] = o.Touserid
	}
	return toSerialize, nil
}

type NullableCoreMessageSendInstantMessagesRequestMessagesInner struct {
	value *CoreMessageSendInstantMessagesRequestMessagesInner
	isSet bool
}

func (v NullableCoreMessageSendInstantMessagesRequestMessagesInner) Get() *CoreMessageSendInstantMessagesRequestMessagesInner {
	return v.value
}

func (v *NullableCoreMessageSendInstantMessagesRequestMessagesInner) Set(val *CoreMessageSendInstantMessagesRequestMessagesInner) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreMessageSendInstantMessagesRequestMessagesInner) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreMessageSendInstantMessagesRequestMessagesInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreMessageSendInstantMessagesRequestMessagesInner(val *CoreMessageSendInstantMessagesRequestMessagesInner) *NullableCoreMessageSendInstantMessagesRequestMessagesInner {
	return &NullableCoreMessageSendInstantMessagesRequestMessagesInner{value: val, isSet: true}
}

func (v NullableCoreMessageSendInstantMessagesRequestMessagesInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreMessageSendInstantMessagesRequestMessagesInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

