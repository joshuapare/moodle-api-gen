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

// checks if the BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner{}

// BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner struct for BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner
type BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner struct {
	Customfields []BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner `json:"customfields,omitempty"`
	// Course full name
	Fullname *string `json:"fullname,omitempty"`
	// Course ID
	Id *int32 `json:"id,omitempty"`
}

// NewBlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner instantiates a new BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner() *BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner {
	this := BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner{}
	var fullname string = "null"
	this.Fullname = &fullname
	return &this
}

// NewBlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerWithDefaults instantiates a new BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerWithDefaults() *BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner {
	this := BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner{}
	var fullname string = "null"
	this.Fullname = &fullname
	return &this
}

// GetCustomfields returns the Customfields field value if set, zero value otherwise.
func (o *BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner) GetCustomfields() []BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner {
	if o == nil || IsNil(o.Customfields) {
		var ret []BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner
		return ret
	}
	return o.Customfields
}

// GetCustomfieldsOk returns a tuple with the Customfields field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner) GetCustomfieldsOk() ([]BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner, bool) {
	if o == nil || IsNil(o.Customfields) {
		return nil, false
	}
	return o.Customfields, true
}

// HasCustomfields returns a boolean if a field has been set.
func (o *BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner) HasCustomfields() bool {
	if o != nil && !IsNil(o.Customfields) {
		return true
	}

	return false
}

// SetCustomfields gets a reference to the given []BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner and assigns it to the Customfields field.
func (o *BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner) SetCustomfields(v []BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner) {
	o.Customfields = v
}

// GetFullname returns the Fullname field value if set, zero value otherwise.
func (o *BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner) GetFullname() string {
	if o == nil || IsNil(o.Fullname) {
		var ret string
		return ret
	}
	return *o.Fullname
}

// GetFullnameOk returns a tuple with the Fullname field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner) GetFullnameOk() (*string, bool) {
	if o == nil || IsNil(o.Fullname) {
		return nil, false
	}
	return o.Fullname, true
}

// HasFullname returns a boolean if a field has been set.
func (o *BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner) HasFullname() bool {
	if o != nil && !IsNil(o.Fullname) {
		return true
	}

	return false
}

// SetFullname gets a reference to the given string and assigns it to the Fullname field.
func (o *BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner) SetFullname(v string) {
	o.Fullname = &v
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner) GetId() int32 {
	if o == nil || IsNil(o.Id) {
		var ret int32
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner) GetIdOk() (*int32, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given int32 and assigns it to the Id field.
func (o *BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner) SetId(v int32) {
	o.Id = &v
}

func (o BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Customfields) {
		toSerialize["customfields"] = o.Customfields
	}
	if !IsNil(o.Fullname) {
		toSerialize["fullname"] = o.Fullname
	}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	return toSerialize, nil
}

type NullableBlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner struct {
	value *BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner
	isSet bool
}

func (v NullableBlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner) Get() *BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner {
	return v.value
}

func (v *NullableBlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner) Set(val *BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner) {
	v.value = val
	v.isSet = true
}

func (v NullableBlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner) IsSet() bool {
	return v.isSet
}

func (v *NullableBlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner(val *BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner) *NullableBlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner {
	return &NullableBlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner{value: val, isSet: true}
}

func (v NullableBlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

