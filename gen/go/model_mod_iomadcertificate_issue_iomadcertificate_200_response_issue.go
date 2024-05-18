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

// checks if the ModIomadcertificateIssueIomadcertificate200ResponseIssue type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModIomadcertificateIssueIomadcertificate200ResponseIssue{}

// ModIomadcertificateIssueIomadcertificate200ResponseIssue struct for ModIomadcertificateIssueIomadcertificate200ResponseIssue
type ModIomadcertificateIssueIomadcertificate200ResponseIssue struct {
	// Certificate code
	Code string `json:"code"`
	// Time created
	Filename string `json:"filename"`
	// Time created
	Fileurl string `json:"fileurl"`
	// Certificate grade
	Grade *string `json:"grade,omitempty"`
	// Issue id
	Id int32 `json:"id"`
	// Certificate id
	Iomadcertificateid int32 `json:"iomadcertificateid"`
	// mime type
	Mimetype string `json:"mimetype"`
	// Time created
	Timecreated int32 `json:"timecreated"`
	// User id
	Userid int32 `json:"userid"`
}

type _ModIomadcertificateIssueIomadcertificate200ResponseIssue ModIomadcertificateIssueIomadcertificate200ResponseIssue

// NewModIomadcertificateIssueIomadcertificate200ResponseIssue instantiates a new ModIomadcertificateIssueIomadcertificate200ResponseIssue object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModIomadcertificateIssueIomadcertificate200ResponseIssue(code string, filename string, fileurl string, id int32, iomadcertificateid int32, mimetype string, timecreated int32, userid int32) *ModIomadcertificateIssueIomadcertificate200ResponseIssue {
	this := ModIomadcertificateIssueIomadcertificate200ResponseIssue{}
	this.Code = code
	this.Filename = filename
	this.Fileurl = fileurl
	this.Id = id
	this.Iomadcertificateid = iomadcertificateid
	this.Mimetype = mimetype
	this.Timecreated = timecreated
	this.Userid = userid
	return &this
}

// NewModIomadcertificateIssueIomadcertificate200ResponseIssueWithDefaults instantiates a new ModIomadcertificateIssueIomadcertificate200ResponseIssue object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModIomadcertificateIssueIomadcertificate200ResponseIssueWithDefaults() *ModIomadcertificateIssueIomadcertificate200ResponseIssue {
	this := ModIomadcertificateIssueIomadcertificate200ResponseIssue{}
	return &this
}

// GetCode returns the Code field value
func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) GetCode() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Code
}

// GetCodeOk returns a tuple with the Code field value
// and a boolean to check if the value has been set.
func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) GetCodeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Code, true
}

// SetCode sets field value
func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) SetCode(v string) {
	o.Code = v
}

// GetFilename returns the Filename field value
func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) GetFilename() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Filename
}

// GetFilenameOk returns a tuple with the Filename field value
// and a boolean to check if the value has been set.
func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) GetFilenameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Filename, true
}

// SetFilename sets field value
func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) SetFilename(v string) {
	o.Filename = v
}

// GetFileurl returns the Fileurl field value
func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) GetFileurl() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Fileurl
}

// GetFileurlOk returns a tuple with the Fileurl field value
// and a boolean to check if the value has been set.
func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) GetFileurlOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Fileurl, true
}

// SetFileurl sets field value
func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) SetFileurl(v string) {
	o.Fileurl = v
}

// GetGrade returns the Grade field value if set, zero value otherwise.
func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) GetGrade() string {
	if o == nil || IsNil(o.Grade) {
		var ret string
		return ret
	}
	return *o.Grade
}

// GetGradeOk returns a tuple with the Grade field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) GetGradeOk() (*string, bool) {
	if o == nil || IsNil(o.Grade) {
		return nil, false
	}
	return o.Grade, true
}

// HasGrade returns a boolean if a field has been set.
func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) HasGrade() bool {
	if o != nil && !IsNil(o.Grade) {
		return true
	}

	return false
}

// SetGrade gets a reference to the given string and assigns it to the Grade field.
func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) SetGrade(v string) {
	o.Grade = &v
}

// GetId returns the Id field value
func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) GetId() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) GetIdOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) SetId(v int32) {
	o.Id = v
}

// GetIomadcertificateid returns the Iomadcertificateid field value
func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) GetIomadcertificateid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Iomadcertificateid
}

// GetIomadcertificateidOk returns a tuple with the Iomadcertificateid field value
// and a boolean to check if the value has been set.
func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) GetIomadcertificateidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Iomadcertificateid, true
}

// SetIomadcertificateid sets field value
func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) SetIomadcertificateid(v int32) {
	o.Iomadcertificateid = v
}

// GetMimetype returns the Mimetype field value
func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) GetMimetype() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Mimetype
}

// GetMimetypeOk returns a tuple with the Mimetype field value
// and a boolean to check if the value has been set.
func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) GetMimetypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Mimetype, true
}

// SetMimetype sets field value
func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) SetMimetype(v string) {
	o.Mimetype = v
}

// GetTimecreated returns the Timecreated field value
func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) GetTimecreated() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Timecreated
}

// GetTimecreatedOk returns a tuple with the Timecreated field value
// and a boolean to check if the value has been set.
func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) GetTimecreatedOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Timecreated, true
}

// SetTimecreated sets field value
func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) SetTimecreated(v int32) {
	o.Timecreated = v
}

// GetUserid returns the Userid field value
func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) GetUserid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Userid
}

// GetUseridOk returns a tuple with the Userid field value
// and a boolean to check if the value has been set.
func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) GetUseridOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Userid, true
}

// SetUserid sets field value
func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) SetUserid(v int32) {
	o.Userid = v
}

func (o ModIomadcertificateIssueIomadcertificate200ResponseIssue) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModIomadcertificateIssueIomadcertificate200ResponseIssue) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["code"] = o.Code
	toSerialize["filename"] = o.Filename
	toSerialize["fileurl"] = o.Fileurl
	if !IsNil(o.Grade) {
		toSerialize["grade"] = o.Grade
	}
	toSerialize["id"] = o.Id
	toSerialize["iomadcertificateid"] = o.Iomadcertificateid
	toSerialize["mimetype"] = o.Mimetype
	toSerialize["timecreated"] = o.Timecreated
	toSerialize["userid"] = o.Userid
	return toSerialize, nil
}

func (o *ModIomadcertificateIssueIomadcertificate200ResponseIssue) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"code",
		"filename",
		"fileurl",
		"id",
		"iomadcertificateid",
		"mimetype",
		"timecreated",
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

	varModIomadcertificateIssueIomadcertificate200ResponseIssue := _ModIomadcertificateIssueIomadcertificate200ResponseIssue{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModIomadcertificateIssueIomadcertificate200ResponseIssue)

	if err != nil {
		return err
	}

	*o = ModIomadcertificateIssueIomadcertificate200ResponseIssue(varModIomadcertificateIssueIomadcertificate200ResponseIssue)

	return err
}

type NullableModIomadcertificateIssueIomadcertificate200ResponseIssue struct {
	value *ModIomadcertificateIssueIomadcertificate200ResponseIssue
	isSet bool
}

func (v NullableModIomadcertificateIssueIomadcertificate200ResponseIssue) Get() *ModIomadcertificateIssueIomadcertificate200ResponseIssue {
	return v.value
}

func (v *NullableModIomadcertificateIssueIomadcertificate200ResponseIssue) Set(val *ModIomadcertificateIssueIomadcertificate200ResponseIssue) {
	v.value = val
	v.isSet = true
}

func (v NullableModIomadcertificateIssueIomadcertificate200ResponseIssue) IsSet() bool {
	return v.isSet
}

func (v *NullableModIomadcertificateIssueIomadcertificate200ResponseIssue) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModIomadcertificateIssueIomadcertificate200ResponseIssue(val *ModIomadcertificateIssueIomadcertificate200ResponseIssue) *NullableModIomadcertificateIssueIomadcertificate200ResponseIssue {
	return &NullableModIomadcertificateIssueIomadcertificate200ResponseIssue{value: val, isSet: true}
}

func (v NullableModIomadcertificateIssueIomadcertificate200ResponseIssue) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModIomadcertificateIssueIomadcertificate200ResponseIssue) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

