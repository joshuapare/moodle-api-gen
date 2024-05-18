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

// checks if the ModDataGetEntry200ResponseEntry type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModDataGetEntry200ResponseEntry{}

// ModDataGetEntry200ResponseEntry struct for ModDataGetEntry200ResponseEntry
type ModDataGetEntry200ResponseEntry struct {
	// Whether the entry has been approved (if the database is configured in that way).
	Approved bool `json:"approved"`
	// Whether the current user can manage this entry
	Canmanageentry bool `json:"canmanageentry"`
	Contents []ModDataGetEntry200ResponseEntryContentsInner `json:"contents,omitempty"`
	// The database id this record belongs to.
	Dataid int32 `json:"dataid"`
	// The user who created the entry fullname.
	Fullname *string `json:"fullname,omitempty"`
	// The group id this record belongs to (0 for no groups).
	Groupid int32 `json:"groupid"`
	// Record id.
	Id int32 `json:"id"`
	Tags []ModDataGetEntries200ResponseEntriesInnerTagsInner `json:"tags,omitempty"`
	// Time the record was created.
	Timecreated int32 `json:"timecreated"`
	// Last time the record was modified.
	Timemodified int32 `json:"timemodified"`
	// The id of the user who created the record.
	Userid int32 `json:"userid"`
}

type _ModDataGetEntry200ResponseEntry ModDataGetEntry200ResponseEntry

// NewModDataGetEntry200ResponseEntry instantiates a new ModDataGetEntry200ResponseEntry object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModDataGetEntry200ResponseEntry(approved bool, canmanageentry bool, dataid int32, groupid int32, id int32, timecreated int32, timemodified int32, userid int32) *ModDataGetEntry200ResponseEntry {
	this := ModDataGetEntry200ResponseEntry{}
	this.Approved = approved
	this.Canmanageentry = canmanageentry
	this.Dataid = dataid
	this.Groupid = groupid
	this.Id = id
	this.Timecreated = timecreated
	this.Timemodified = timemodified
	this.Userid = userid
	return &this
}

// NewModDataGetEntry200ResponseEntryWithDefaults instantiates a new ModDataGetEntry200ResponseEntry object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModDataGetEntry200ResponseEntryWithDefaults() *ModDataGetEntry200ResponseEntry {
	this := ModDataGetEntry200ResponseEntry{}
	var approved bool = 0
	this.Approved = approved
	var dataid int32 = 0
	this.Dataid = dataid
	var groupid int32 = 0
	this.Groupid = groupid
	var timecreated int32 = 0
	this.Timecreated = timecreated
	var timemodified int32 = 0
	this.Timemodified = timemodified
	var userid int32 = 0
	this.Userid = userid
	return &this
}

// GetApproved returns the Approved field value
func (o *ModDataGetEntry200ResponseEntry) GetApproved() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Approved
}

// GetApprovedOk returns a tuple with the Approved field value
// and a boolean to check if the value has been set.
func (o *ModDataGetEntry200ResponseEntry) GetApprovedOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Approved, true
}

// SetApproved sets field value
func (o *ModDataGetEntry200ResponseEntry) SetApproved(v bool) {
	o.Approved = v
}

// GetCanmanageentry returns the Canmanageentry field value
func (o *ModDataGetEntry200ResponseEntry) GetCanmanageentry() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Canmanageentry
}

// GetCanmanageentryOk returns a tuple with the Canmanageentry field value
// and a boolean to check if the value has been set.
func (o *ModDataGetEntry200ResponseEntry) GetCanmanageentryOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Canmanageentry, true
}

// SetCanmanageentry sets field value
func (o *ModDataGetEntry200ResponseEntry) SetCanmanageentry(v bool) {
	o.Canmanageentry = v
}

// GetContents returns the Contents field value if set, zero value otherwise.
func (o *ModDataGetEntry200ResponseEntry) GetContents() []ModDataGetEntry200ResponseEntryContentsInner {
	if o == nil || IsNil(o.Contents) {
		var ret []ModDataGetEntry200ResponseEntryContentsInner
		return ret
	}
	return o.Contents
}

// GetContentsOk returns a tuple with the Contents field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModDataGetEntry200ResponseEntry) GetContentsOk() ([]ModDataGetEntry200ResponseEntryContentsInner, bool) {
	if o == nil || IsNil(o.Contents) {
		return nil, false
	}
	return o.Contents, true
}

// HasContents returns a boolean if a field has been set.
func (o *ModDataGetEntry200ResponseEntry) HasContents() bool {
	if o != nil && !IsNil(o.Contents) {
		return true
	}

	return false
}

// SetContents gets a reference to the given []ModDataGetEntry200ResponseEntryContentsInner and assigns it to the Contents field.
func (o *ModDataGetEntry200ResponseEntry) SetContents(v []ModDataGetEntry200ResponseEntryContentsInner) {
	o.Contents = v
}

// GetDataid returns the Dataid field value
func (o *ModDataGetEntry200ResponseEntry) GetDataid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Dataid
}

// GetDataidOk returns a tuple with the Dataid field value
// and a boolean to check if the value has been set.
func (o *ModDataGetEntry200ResponseEntry) GetDataidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Dataid, true
}

// SetDataid sets field value
func (o *ModDataGetEntry200ResponseEntry) SetDataid(v int32) {
	o.Dataid = v
}

// GetFullname returns the Fullname field value if set, zero value otherwise.
func (o *ModDataGetEntry200ResponseEntry) GetFullname() string {
	if o == nil || IsNil(o.Fullname) {
		var ret string
		return ret
	}
	return *o.Fullname
}

// GetFullnameOk returns a tuple with the Fullname field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModDataGetEntry200ResponseEntry) GetFullnameOk() (*string, bool) {
	if o == nil || IsNil(o.Fullname) {
		return nil, false
	}
	return o.Fullname, true
}

// HasFullname returns a boolean if a field has been set.
func (o *ModDataGetEntry200ResponseEntry) HasFullname() bool {
	if o != nil && !IsNil(o.Fullname) {
		return true
	}

	return false
}

// SetFullname gets a reference to the given string and assigns it to the Fullname field.
func (o *ModDataGetEntry200ResponseEntry) SetFullname(v string) {
	o.Fullname = &v
}

// GetGroupid returns the Groupid field value
func (o *ModDataGetEntry200ResponseEntry) GetGroupid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Groupid
}

// GetGroupidOk returns a tuple with the Groupid field value
// and a boolean to check if the value has been set.
func (o *ModDataGetEntry200ResponseEntry) GetGroupidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Groupid, true
}

// SetGroupid sets field value
func (o *ModDataGetEntry200ResponseEntry) SetGroupid(v int32) {
	o.Groupid = v
}

// GetId returns the Id field value
func (o *ModDataGetEntry200ResponseEntry) GetId() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *ModDataGetEntry200ResponseEntry) GetIdOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *ModDataGetEntry200ResponseEntry) SetId(v int32) {
	o.Id = v
}

// GetTags returns the Tags field value if set, zero value otherwise.
func (o *ModDataGetEntry200ResponseEntry) GetTags() []ModDataGetEntries200ResponseEntriesInnerTagsInner {
	if o == nil || IsNil(o.Tags) {
		var ret []ModDataGetEntries200ResponseEntriesInnerTagsInner
		return ret
	}
	return o.Tags
}

// GetTagsOk returns a tuple with the Tags field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModDataGetEntry200ResponseEntry) GetTagsOk() ([]ModDataGetEntries200ResponseEntriesInnerTagsInner, bool) {
	if o == nil || IsNil(o.Tags) {
		return nil, false
	}
	return o.Tags, true
}

// HasTags returns a boolean if a field has been set.
func (o *ModDataGetEntry200ResponseEntry) HasTags() bool {
	if o != nil && !IsNil(o.Tags) {
		return true
	}

	return false
}

// SetTags gets a reference to the given []ModDataGetEntries200ResponseEntriesInnerTagsInner and assigns it to the Tags field.
func (o *ModDataGetEntry200ResponseEntry) SetTags(v []ModDataGetEntries200ResponseEntriesInnerTagsInner) {
	o.Tags = v
}

// GetTimecreated returns the Timecreated field value
func (o *ModDataGetEntry200ResponseEntry) GetTimecreated() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Timecreated
}

// GetTimecreatedOk returns a tuple with the Timecreated field value
// and a boolean to check if the value has been set.
func (o *ModDataGetEntry200ResponseEntry) GetTimecreatedOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Timecreated, true
}

// SetTimecreated sets field value
func (o *ModDataGetEntry200ResponseEntry) SetTimecreated(v int32) {
	o.Timecreated = v
}

// GetTimemodified returns the Timemodified field value
func (o *ModDataGetEntry200ResponseEntry) GetTimemodified() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Timemodified
}

// GetTimemodifiedOk returns a tuple with the Timemodified field value
// and a boolean to check if the value has been set.
func (o *ModDataGetEntry200ResponseEntry) GetTimemodifiedOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Timemodified, true
}

// SetTimemodified sets field value
func (o *ModDataGetEntry200ResponseEntry) SetTimemodified(v int32) {
	o.Timemodified = v
}

// GetUserid returns the Userid field value
func (o *ModDataGetEntry200ResponseEntry) GetUserid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Userid
}

// GetUseridOk returns a tuple with the Userid field value
// and a boolean to check if the value has been set.
func (o *ModDataGetEntry200ResponseEntry) GetUseridOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Userid, true
}

// SetUserid sets field value
func (o *ModDataGetEntry200ResponseEntry) SetUserid(v int32) {
	o.Userid = v
}

func (o ModDataGetEntry200ResponseEntry) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModDataGetEntry200ResponseEntry) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["approved"] = o.Approved
	toSerialize["canmanageentry"] = o.Canmanageentry
	if !IsNil(o.Contents) {
		toSerialize["contents"] = o.Contents
	}
	toSerialize["dataid"] = o.Dataid
	if !IsNil(o.Fullname) {
		toSerialize["fullname"] = o.Fullname
	}
	toSerialize["groupid"] = o.Groupid
	toSerialize["id"] = o.Id
	if !IsNil(o.Tags) {
		toSerialize["tags"] = o.Tags
	}
	toSerialize["timecreated"] = o.Timecreated
	toSerialize["timemodified"] = o.Timemodified
	toSerialize["userid"] = o.Userid
	return toSerialize, nil
}

func (o *ModDataGetEntry200ResponseEntry) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"approved",
		"canmanageentry",
		"dataid",
		"groupid",
		"id",
		"timecreated",
		"timemodified",
		"userid",
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

	varModDataGetEntry200ResponseEntry := _ModDataGetEntry200ResponseEntry{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModDataGetEntry200ResponseEntry)

	if err != nil {
		return err
	}

	*o = ModDataGetEntry200ResponseEntry(varModDataGetEntry200ResponseEntry)

	return err
}

type NullableModDataGetEntry200ResponseEntry struct {
	value *ModDataGetEntry200ResponseEntry
	isSet bool
}

func (v NullableModDataGetEntry200ResponseEntry) Get() *ModDataGetEntry200ResponseEntry {
	return v.value
}

func (v *NullableModDataGetEntry200ResponseEntry) Set(val *ModDataGetEntry200ResponseEntry) {
	v.value = val
	v.isSet = true
}

func (v NullableModDataGetEntry200ResponseEntry) IsSet() bool {
	return v.isSet
}

func (v *NullableModDataGetEntry200ResponseEntry) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModDataGetEntry200ResponseEntry(val *ModDataGetEntry200ResponseEntry) *NullableModDataGetEntry200ResponseEntry {
	return &NullableModDataGetEntry200ResponseEntry{value: val, isSet: true}
}

func (v NullableModDataGetEntry200ResponseEntry) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModDataGetEntry200ResponseEntry) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


