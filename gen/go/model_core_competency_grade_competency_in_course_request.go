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

// checks if the CoreCompetencyGradeCompetencyInCourseRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreCompetencyGradeCompetencyInCourseRequest{}

// CoreCompetencyGradeCompetencyInCourseRequest struct for CoreCompetencyGradeCompetencyInCourseRequest
type CoreCompetencyGradeCompetencyInCourseRequest struct {
	// Competency id
	Competencyid int32 `json:"competencyid"`
	// Course id
	Courseid int32 `json:"courseid"`
	// New grade
	Grade int32 `json:"grade"`
	// A note to attach to the evidence
	Note *string `json:"note,omitempty"`
	// User id
	Userid int32 `json:"userid"`
}

type _CoreCompetencyGradeCompetencyInCourseRequest CoreCompetencyGradeCompetencyInCourseRequest

// NewCoreCompetencyGradeCompetencyInCourseRequest instantiates a new CoreCompetencyGradeCompetencyInCourseRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreCompetencyGradeCompetencyInCourseRequest(competencyid int32, courseid int32, grade int32, userid int32) *CoreCompetencyGradeCompetencyInCourseRequest {
	this := CoreCompetencyGradeCompetencyInCourseRequest{}
	this.Competencyid = competencyid
	this.Courseid = courseid
	this.Grade = grade
	this.Userid = userid
	return &this
}

// NewCoreCompetencyGradeCompetencyInCourseRequestWithDefaults instantiates a new CoreCompetencyGradeCompetencyInCourseRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreCompetencyGradeCompetencyInCourseRequestWithDefaults() *CoreCompetencyGradeCompetencyInCourseRequest {
	this := CoreCompetencyGradeCompetencyInCourseRequest{}
	var competencyid int32 = null
	this.Competencyid = competencyid
	var userid int32 = null
	this.Userid = userid
	return &this
}

// GetCompetencyid returns the Competencyid field value
func (o *CoreCompetencyGradeCompetencyInCourseRequest) GetCompetencyid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Competencyid
}

// GetCompetencyidOk returns a tuple with the Competencyid field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyGradeCompetencyInCourseRequest) GetCompetencyidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Competencyid, true
}

// SetCompetencyid sets field value
func (o *CoreCompetencyGradeCompetencyInCourseRequest) SetCompetencyid(v int32) {
	o.Competencyid = v
}

// GetCourseid returns the Courseid field value
func (o *CoreCompetencyGradeCompetencyInCourseRequest) GetCourseid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Courseid
}

// GetCourseidOk returns a tuple with the Courseid field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyGradeCompetencyInCourseRequest) GetCourseidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Courseid, true
}

// SetCourseid sets field value
func (o *CoreCompetencyGradeCompetencyInCourseRequest) SetCourseid(v int32) {
	o.Courseid = v
}

// GetGrade returns the Grade field value
func (o *CoreCompetencyGradeCompetencyInCourseRequest) GetGrade() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Grade
}

// GetGradeOk returns a tuple with the Grade field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyGradeCompetencyInCourseRequest) GetGradeOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Grade, true
}

// SetGrade sets field value
func (o *CoreCompetencyGradeCompetencyInCourseRequest) SetGrade(v int32) {
	o.Grade = v
}

// GetNote returns the Note field value if set, zero value otherwise.
func (o *CoreCompetencyGradeCompetencyInCourseRequest) GetNote() string {
	if o == nil || IsNil(o.Note) {
		var ret string
		return ret
	}
	return *o.Note
}

// GetNoteOk returns a tuple with the Note field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCompetencyGradeCompetencyInCourseRequest) GetNoteOk() (*string, bool) {
	if o == nil || IsNil(o.Note) {
		return nil, false
	}
	return o.Note, true
}

// HasNote returns a boolean if a field has been set.
func (o *CoreCompetencyGradeCompetencyInCourseRequest) HasNote() bool {
	if o != nil && !IsNil(o.Note) {
		return true
	}

	return false
}

// SetNote gets a reference to the given string and assigns it to the Note field.
func (o *CoreCompetencyGradeCompetencyInCourseRequest) SetNote(v string) {
	o.Note = &v
}

// GetUserid returns the Userid field value
func (o *CoreCompetencyGradeCompetencyInCourseRequest) GetUserid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Userid
}

// GetUseridOk returns a tuple with the Userid field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyGradeCompetencyInCourseRequest) GetUseridOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Userid, true
}

// SetUserid sets field value
func (o *CoreCompetencyGradeCompetencyInCourseRequest) SetUserid(v int32) {
	o.Userid = v
}

func (o CoreCompetencyGradeCompetencyInCourseRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreCompetencyGradeCompetencyInCourseRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["competencyid"] = o.Competencyid
	toSerialize["courseid"] = o.Courseid
	toSerialize["grade"] = o.Grade
	if !IsNil(o.Note) {
		toSerialize["note"] = o.Note
	}
	toSerialize["userid"] = o.Userid
	return toSerialize, nil
}

func (o *CoreCompetencyGradeCompetencyInCourseRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"competencyid",
		"courseid",
		"grade",
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

	varCoreCompetencyGradeCompetencyInCourseRequest := _CoreCompetencyGradeCompetencyInCourseRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreCompetencyGradeCompetencyInCourseRequest)

	if err != nil {
		return err
	}

	*o = CoreCompetencyGradeCompetencyInCourseRequest(varCoreCompetencyGradeCompetencyInCourseRequest)

	return err
}

type NullableCoreCompetencyGradeCompetencyInCourseRequest struct {
	value *CoreCompetencyGradeCompetencyInCourseRequest
	isSet bool
}

func (v NullableCoreCompetencyGradeCompetencyInCourseRequest) Get() *CoreCompetencyGradeCompetencyInCourseRequest {
	return v.value
}

func (v *NullableCoreCompetencyGradeCompetencyInCourseRequest) Set(val *CoreCompetencyGradeCompetencyInCourseRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreCompetencyGradeCompetencyInCourseRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreCompetencyGradeCompetencyInCourseRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreCompetencyGradeCompetencyInCourseRequest(val *CoreCompetencyGradeCompetencyInCourseRequest) *NullableCoreCompetencyGradeCompetencyInCourseRequest {
	return &NullableCoreCompetencyGradeCompetencyInCourseRequest{value: val, isSet: true}
}

func (v NullableCoreCompetencyGradeCompetencyInCourseRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreCompetencyGradeCompetencyInCourseRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


