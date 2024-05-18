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

// checks if the ModAssignGetGrades200ResponseWarningsInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModAssignGetGrades200ResponseWarningsInner{}

// ModAssignGetGrades200ResponseWarningsInner warning
type ModAssignGetGrades200ResponseWarningsInner struct {
	// item is always 'assignment'
	Item *string `json:"item,omitempty"`
	// when errorcode is 3 then itemid is an assignment id. When errorcode is 1, itemid is a course module id
	Itemid *int32 `json:"itemid,omitempty"`
	// untranslated english message to explain the warning
	Message *string `json:"message,omitempty"`
	// errorcode can be 3 (no grades found) or 1 (no permission to get grades)
	Warningcode *string `json:"warningcode,omitempty"`
}

// NewModAssignGetGrades200ResponseWarningsInner instantiates a new ModAssignGetGrades200ResponseWarningsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModAssignGetGrades200ResponseWarningsInner() *ModAssignGetGrades200ResponseWarningsInner {
	this := ModAssignGetGrades200ResponseWarningsInner{}
	var item string = "null"
	this.Item = &item
	var itemid int32 = null
	this.Itemid = &itemid
	var warningcode string = "null"
	this.Warningcode = &warningcode
	return &this
}

// NewModAssignGetGrades200ResponseWarningsInnerWithDefaults instantiates a new ModAssignGetGrades200ResponseWarningsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModAssignGetGrades200ResponseWarningsInnerWithDefaults() *ModAssignGetGrades200ResponseWarningsInner {
	this := ModAssignGetGrades200ResponseWarningsInner{}
	var item string = "null"
	this.Item = &item
	var itemid int32 = null
	this.Itemid = &itemid
	var warningcode string = "null"
	this.Warningcode = &warningcode
	return &this
}

// GetItem returns the Item field value if set, zero value otherwise.
func (o *ModAssignGetGrades200ResponseWarningsInner) GetItem() string {
	if o == nil || IsNil(o.Item) {
		var ret string
		return ret
	}
	return *o.Item
}

// GetItemOk returns a tuple with the Item field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignGetGrades200ResponseWarningsInner) GetItemOk() (*string, bool) {
	if o == nil || IsNil(o.Item) {
		return nil, false
	}
	return o.Item, true
}

// HasItem returns a boolean if a field has been set.
func (o *ModAssignGetGrades200ResponseWarningsInner) HasItem() bool {
	if o != nil && !IsNil(o.Item) {
		return true
	}

	return false
}

// SetItem gets a reference to the given string and assigns it to the Item field.
func (o *ModAssignGetGrades200ResponseWarningsInner) SetItem(v string) {
	o.Item = &v
}

// GetItemid returns the Itemid field value if set, zero value otherwise.
func (o *ModAssignGetGrades200ResponseWarningsInner) GetItemid() int32 {
	if o == nil || IsNil(o.Itemid) {
		var ret int32
		return ret
	}
	return *o.Itemid
}

// GetItemidOk returns a tuple with the Itemid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignGetGrades200ResponseWarningsInner) GetItemidOk() (*int32, bool) {
	if o == nil || IsNil(o.Itemid) {
		return nil, false
	}
	return o.Itemid, true
}

// HasItemid returns a boolean if a field has been set.
func (o *ModAssignGetGrades200ResponseWarningsInner) HasItemid() bool {
	if o != nil && !IsNil(o.Itemid) {
		return true
	}

	return false
}

// SetItemid gets a reference to the given int32 and assigns it to the Itemid field.
func (o *ModAssignGetGrades200ResponseWarningsInner) SetItemid(v int32) {
	o.Itemid = &v
}

// GetMessage returns the Message field value if set, zero value otherwise.
func (o *ModAssignGetGrades200ResponseWarningsInner) GetMessage() string {
	if o == nil || IsNil(o.Message) {
		var ret string
		return ret
	}
	return *o.Message
}

// GetMessageOk returns a tuple with the Message field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignGetGrades200ResponseWarningsInner) GetMessageOk() (*string, bool) {
	if o == nil || IsNil(o.Message) {
		return nil, false
	}
	return o.Message, true
}

// HasMessage returns a boolean if a field has been set.
func (o *ModAssignGetGrades200ResponseWarningsInner) HasMessage() bool {
	if o != nil && !IsNil(o.Message) {
		return true
	}

	return false
}

// SetMessage gets a reference to the given string and assigns it to the Message field.
func (o *ModAssignGetGrades200ResponseWarningsInner) SetMessage(v string) {
	o.Message = &v
}

// GetWarningcode returns the Warningcode field value if set, zero value otherwise.
func (o *ModAssignGetGrades200ResponseWarningsInner) GetWarningcode() string {
	if o == nil || IsNil(o.Warningcode) {
		var ret string
		return ret
	}
	return *o.Warningcode
}

// GetWarningcodeOk returns a tuple with the Warningcode field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignGetGrades200ResponseWarningsInner) GetWarningcodeOk() (*string, bool) {
	if o == nil || IsNil(o.Warningcode) {
		return nil, false
	}
	return o.Warningcode, true
}

// HasWarningcode returns a boolean if a field has been set.
func (o *ModAssignGetGrades200ResponseWarningsInner) HasWarningcode() bool {
	if o != nil && !IsNil(o.Warningcode) {
		return true
	}

	return false
}

// SetWarningcode gets a reference to the given string and assigns it to the Warningcode field.
func (o *ModAssignGetGrades200ResponseWarningsInner) SetWarningcode(v string) {
	o.Warningcode = &v
}

func (o ModAssignGetGrades200ResponseWarningsInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModAssignGetGrades200ResponseWarningsInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Item) {
		toSerialize["item"] = o.Item
	}
	if !IsNil(o.Itemid) {
		toSerialize["itemid"] = o.Itemid
	}
	if !IsNil(o.Message) {
		toSerialize["message"] = o.Message
	}
	if !IsNil(o.Warningcode) {
		toSerialize["warningcode"] = o.Warningcode
	}
	return toSerialize, nil
}

type NullableModAssignGetGrades200ResponseWarningsInner struct {
	value *ModAssignGetGrades200ResponseWarningsInner
	isSet bool
}

func (v NullableModAssignGetGrades200ResponseWarningsInner) Get() *ModAssignGetGrades200ResponseWarningsInner {
	return v.value
}

func (v *NullableModAssignGetGrades200ResponseWarningsInner) Set(val *ModAssignGetGrades200ResponseWarningsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableModAssignGetGrades200ResponseWarningsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableModAssignGetGrades200ResponseWarningsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModAssignGetGrades200ResponseWarningsInner(val *ModAssignGetGrades200ResponseWarningsInner) *NullableModAssignGetGrades200ResponseWarningsInner {
	return &NullableModAssignGetGrades200ResponseWarningsInner{value: val, isSet: true}
}

func (v NullableModAssignGetGrades200ResponseWarningsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModAssignGetGrades200ResponseWarningsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


