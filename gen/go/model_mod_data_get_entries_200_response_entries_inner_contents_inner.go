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

// checks if the ModDataGetEntries200ResponseEntriesInnerContentsInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModDataGetEntries200ResponseEntriesInnerContentsInner{}

// ModDataGetEntries200ResponseEntriesInnerContentsInner struct for ModDataGetEntries200ResponseEntriesInnerContentsInner
type ModDataGetEntries200ResponseEntriesInnerContentsInner struct {
	// Contents.
	Content *string `json:"content,omitempty"`
	// Contents.
	Content1 *string `json:"content1,omitempty"`
	// Contents.
	Content2 *string `json:"content2,omitempty"`
	// Contents.
	Content3 *string `json:"content3,omitempty"`
	// Contents.
	Content4 *string `json:"content4,omitempty"`
	// The field type of the content.
	Fieldid *int32 `json:"fieldid,omitempty"`
	Files []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner `json:"files,omitempty"`
	// Content id.
	Id *int32 `json:"id,omitempty"`
	// The record this content belongs to.
	Recordid *int32 `json:"recordid,omitempty"`
}

// NewModDataGetEntries200ResponseEntriesInnerContentsInner instantiates a new ModDataGetEntries200ResponseEntriesInnerContentsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModDataGetEntries200ResponseEntriesInnerContentsInner() *ModDataGetEntries200ResponseEntriesInnerContentsInner {
	this := ModDataGetEntries200ResponseEntriesInnerContentsInner{}
	var content string = "null"
	this.Content = &content
	var fieldid int32 = 0
	this.Fieldid = &fieldid
	var id int32 = null
	this.Id = &id
	var recordid int32 = 0
	this.Recordid = &recordid
	return &this
}

// NewModDataGetEntries200ResponseEntriesInnerContentsInnerWithDefaults instantiates a new ModDataGetEntries200ResponseEntriesInnerContentsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModDataGetEntries200ResponseEntriesInnerContentsInnerWithDefaults() *ModDataGetEntries200ResponseEntriesInnerContentsInner {
	this := ModDataGetEntries200ResponseEntriesInnerContentsInner{}
	var content string = "null"
	this.Content = &content
	var fieldid int32 = 0
	this.Fieldid = &fieldid
	var id int32 = null
	this.Id = &id
	var recordid int32 = 0
	this.Recordid = &recordid
	return &this
}

// GetContent returns the Content field value if set, zero value otherwise.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) GetContent() string {
	if o == nil || IsNil(o.Content) {
		var ret string
		return ret
	}
	return *o.Content
}

// GetContentOk returns a tuple with the Content field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) GetContentOk() (*string, bool) {
	if o == nil || IsNil(o.Content) {
		return nil, false
	}
	return o.Content, true
}

// HasContent returns a boolean if a field has been set.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) HasContent() bool {
	if o != nil && !IsNil(o.Content) {
		return true
	}

	return false
}

// SetContent gets a reference to the given string and assigns it to the Content field.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) SetContent(v string) {
	o.Content = &v
}

// GetContent1 returns the Content1 field value if set, zero value otherwise.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) GetContent1() string {
	if o == nil || IsNil(o.Content1) {
		var ret string
		return ret
	}
	return *o.Content1
}

// GetContent1Ok returns a tuple with the Content1 field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) GetContent1Ok() (*string, bool) {
	if o == nil || IsNil(o.Content1) {
		return nil, false
	}
	return o.Content1, true
}

// HasContent1 returns a boolean if a field has been set.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) HasContent1() bool {
	if o != nil && !IsNil(o.Content1) {
		return true
	}

	return false
}

// SetContent1 gets a reference to the given string and assigns it to the Content1 field.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) SetContent1(v string) {
	o.Content1 = &v
}

// GetContent2 returns the Content2 field value if set, zero value otherwise.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) GetContent2() string {
	if o == nil || IsNil(o.Content2) {
		var ret string
		return ret
	}
	return *o.Content2
}

// GetContent2Ok returns a tuple with the Content2 field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) GetContent2Ok() (*string, bool) {
	if o == nil || IsNil(o.Content2) {
		return nil, false
	}
	return o.Content2, true
}

// HasContent2 returns a boolean if a field has been set.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) HasContent2() bool {
	if o != nil && !IsNil(o.Content2) {
		return true
	}

	return false
}

// SetContent2 gets a reference to the given string and assigns it to the Content2 field.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) SetContent2(v string) {
	o.Content2 = &v
}

// GetContent3 returns the Content3 field value if set, zero value otherwise.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) GetContent3() string {
	if o == nil || IsNil(o.Content3) {
		var ret string
		return ret
	}
	return *o.Content3
}

// GetContent3Ok returns a tuple with the Content3 field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) GetContent3Ok() (*string, bool) {
	if o == nil || IsNil(o.Content3) {
		return nil, false
	}
	return o.Content3, true
}

// HasContent3 returns a boolean if a field has been set.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) HasContent3() bool {
	if o != nil && !IsNil(o.Content3) {
		return true
	}

	return false
}

// SetContent3 gets a reference to the given string and assigns it to the Content3 field.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) SetContent3(v string) {
	o.Content3 = &v
}

// GetContent4 returns the Content4 field value if set, zero value otherwise.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) GetContent4() string {
	if o == nil || IsNil(o.Content4) {
		var ret string
		return ret
	}
	return *o.Content4
}

// GetContent4Ok returns a tuple with the Content4 field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) GetContent4Ok() (*string, bool) {
	if o == nil || IsNil(o.Content4) {
		return nil, false
	}
	return o.Content4, true
}

// HasContent4 returns a boolean if a field has been set.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) HasContent4() bool {
	if o != nil && !IsNil(o.Content4) {
		return true
	}

	return false
}

// SetContent4 gets a reference to the given string and assigns it to the Content4 field.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) SetContent4(v string) {
	o.Content4 = &v
}

// GetFieldid returns the Fieldid field value if set, zero value otherwise.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) GetFieldid() int32 {
	if o == nil || IsNil(o.Fieldid) {
		var ret int32
		return ret
	}
	return *o.Fieldid
}

// GetFieldidOk returns a tuple with the Fieldid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) GetFieldidOk() (*int32, bool) {
	if o == nil || IsNil(o.Fieldid) {
		return nil, false
	}
	return o.Fieldid, true
}

// HasFieldid returns a boolean if a field has been set.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) HasFieldid() bool {
	if o != nil && !IsNil(o.Fieldid) {
		return true
	}

	return false
}

// SetFieldid gets a reference to the given int32 and assigns it to the Fieldid field.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) SetFieldid(v int32) {
	o.Fieldid = &v
}

// GetFiles returns the Files field value if set, zero value otherwise.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) GetFiles() []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner {
	if o == nil || IsNil(o.Files) {
		var ret []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner
		return ret
	}
	return o.Files
}

// GetFilesOk returns a tuple with the Files field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) GetFilesOk() ([]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner, bool) {
	if o == nil || IsNil(o.Files) {
		return nil, false
	}
	return o.Files, true
}

// HasFiles returns a boolean if a field has been set.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) HasFiles() bool {
	if o != nil && !IsNil(o.Files) {
		return true
	}

	return false
}

// SetFiles gets a reference to the given []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner and assigns it to the Files field.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) SetFiles(v []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner) {
	o.Files = v
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) GetId() int32 {
	if o == nil || IsNil(o.Id) {
		var ret int32
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) GetIdOk() (*int32, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given int32 and assigns it to the Id field.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) SetId(v int32) {
	o.Id = &v
}

// GetRecordid returns the Recordid field value if set, zero value otherwise.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) GetRecordid() int32 {
	if o == nil || IsNil(o.Recordid) {
		var ret int32
		return ret
	}
	return *o.Recordid
}

// GetRecordidOk returns a tuple with the Recordid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) GetRecordidOk() (*int32, bool) {
	if o == nil || IsNil(o.Recordid) {
		return nil, false
	}
	return o.Recordid, true
}

// HasRecordid returns a boolean if a field has been set.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) HasRecordid() bool {
	if o != nil && !IsNil(o.Recordid) {
		return true
	}

	return false
}

// SetRecordid gets a reference to the given int32 and assigns it to the Recordid field.
func (o *ModDataGetEntries200ResponseEntriesInnerContentsInner) SetRecordid(v int32) {
	o.Recordid = &v
}

func (o ModDataGetEntries200ResponseEntriesInnerContentsInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModDataGetEntries200ResponseEntriesInnerContentsInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Content) {
		toSerialize["content"] = o.Content
	}
	if !IsNil(o.Content1) {
		toSerialize["content1"] = o.Content1
	}
	if !IsNil(o.Content2) {
		toSerialize["content2"] = o.Content2
	}
	if !IsNil(o.Content3) {
		toSerialize["content3"] = o.Content3
	}
	if !IsNil(o.Content4) {
		toSerialize["content4"] = o.Content4
	}
	if !IsNil(o.Fieldid) {
		toSerialize["fieldid"] = o.Fieldid
	}
	if !IsNil(o.Files) {
		toSerialize["files"] = o.Files
	}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.Recordid) {
		toSerialize["recordid"] = o.Recordid
	}
	return toSerialize, nil
}

type NullableModDataGetEntries200ResponseEntriesInnerContentsInner struct {
	value *ModDataGetEntries200ResponseEntriesInnerContentsInner
	isSet bool
}

func (v NullableModDataGetEntries200ResponseEntriesInnerContentsInner) Get() *ModDataGetEntries200ResponseEntriesInnerContentsInner {
	return v.value
}

func (v *NullableModDataGetEntries200ResponseEntriesInnerContentsInner) Set(val *ModDataGetEntries200ResponseEntriesInnerContentsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableModDataGetEntries200ResponseEntriesInnerContentsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableModDataGetEntries200ResponseEntriesInnerContentsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModDataGetEntries200ResponseEntriesInnerContentsInner(val *ModDataGetEntries200ResponseEntriesInnerContentsInner) *NullableModDataGetEntries200ResponseEntriesInnerContentsInner {
	return &NullableModDataGetEntries200ResponseEntriesInnerContentsInner{value: val, isSet: true}
}

func (v NullableModDataGetEntries200ResponseEntriesInnerContentsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModDataGetEntries200ResponseEntriesInnerContentsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


