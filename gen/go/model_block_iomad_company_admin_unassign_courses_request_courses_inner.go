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

// checks if the BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner{}

// BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner struct for BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner
type BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner struct {
	// Course company ID
	Companyid *int32 `json:"companyid,omitempty"`
	// Course ID
	Courseid *int32 `json:"courseid,omitempty"`
}

// NewBlockIomadCompanyAdminUnassignCoursesRequestCoursesInner instantiates a new BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBlockIomadCompanyAdminUnassignCoursesRequestCoursesInner() *BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner {
	this := BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner{}
	var companyid int32 = 0
	this.Companyid = &companyid
	var courseid int32 = 0
	this.Courseid = &courseid
	return &this
}

// NewBlockIomadCompanyAdminUnassignCoursesRequestCoursesInnerWithDefaults instantiates a new BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBlockIomadCompanyAdminUnassignCoursesRequestCoursesInnerWithDefaults() *BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner {
	this := BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner{}
	var companyid int32 = 0
	this.Companyid = &companyid
	var courseid int32 = 0
	this.Courseid = &courseid
	return &this
}

// GetCompanyid returns the Companyid field value if set, zero value otherwise.
func (o *BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner) GetCompanyid() int32 {
	if o == nil || IsNil(o.Companyid) {
		var ret int32
		return ret
	}
	return *o.Companyid
}

// GetCompanyidOk returns a tuple with the Companyid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner) GetCompanyidOk() (*int32, bool) {
	if o == nil || IsNil(o.Companyid) {
		return nil, false
	}
	return o.Companyid, true
}

// HasCompanyid returns a boolean if a field has been set.
func (o *BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner) HasCompanyid() bool {
	if o != nil && !IsNil(o.Companyid) {
		return true
	}

	return false
}

// SetCompanyid gets a reference to the given int32 and assigns it to the Companyid field.
func (o *BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner) SetCompanyid(v int32) {
	o.Companyid = &v
}

// GetCourseid returns the Courseid field value if set, zero value otherwise.
func (o *BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner) GetCourseid() int32 {
	if o == nil || IsNil(o.Courseid) {
		var ret int32
		return ret
	}
	return *o.Courseid
}

// GetCourseidOk returns a tuple with the Courseid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner) GetCourseidOk() (*int32, bool) {
	if o == nil || IsNil(o.Courseid) {
		return nil, false
	}
	return o.Courseid, true
}

// HasCourseid returns a boolean if a field has been set.
func (o *BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner) HasCourseid() bool {
	if o != nil && !IsNil(o.Courseid) {
		return true
	}

	return false
}

// SetCourseid gets a reference to the given int32 and assigns it to the Courseid field.
func (o *BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner) SetCourseid(v int32) {
	o.Courseid = &v
}

func (o BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Companyid) {
		toSerialize["companyid"] = o.Companyid
	}
	if !IsNil(o.Courseid) {
		toSerialize["courseid"] = o.Courseid
	}
	return toSerialize, nil
}

type NullableBlockIomadCompanyAdminUnassignCoursesRequestCoursesInner struct {
	value *BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner
	isSet bool
}

func (v NullableBlockIomadCompanyAdminUnassignCoursesRequestCoursesInner) Get() *BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner {
	return v.value
}

func (v *NullableBlockIomadCompanyAdminUnassignCoursesRequestCoursesInner) Set(val *BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner) {
	v.value = val
	v.isSet = true
}

func (v NullableBlockIomadCompanyAdminUnassignCoursesRequestCoursesInner) IsSet() bool {
	return v.isSet
}

func (v *NullableBlockIomadCompanyAdminUnassignCoursesRequestCoursesInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBlockIomadCompanyAdminUnassignCoursesRequestCoursesInner(val *BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner) *NullableBlockIomadCompanyAdminUnassignCoursesRequestCoursesInner {
	return &NullableBlockIomadCompanyAdminUnassignCoursesRequestCoursesInner{value: val, isSet: true}
}

func (v NullableBlockIomadCompanyAdminUnassignCoursesRequestCoursesInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBlockIomadCompanyAdminUnassignCoursesRequestCoursesInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


