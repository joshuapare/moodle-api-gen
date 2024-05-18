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

// checks if the CoreCompetencyAddCompetencyToCourseRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreCompetencyAddCompetencyToCourseRequest{}

// CoreCompetencyAddCompetencyToCourseRequest struct for CoreCompetencyAddCompetencyToCourseRequest
type CoreCompetencyAddCompetencyToCourseRequest struct {
	// The competency id
	Competencyid int32 `json:"competencyid"`
	// The course id
	Courseid int32 `json:"courseid"`
}

type _CoreCompetencyAddCompetencyToCourseRequest CoreCompetencyAddCompetencyToCourseRequest

// NewCoreCompetencyAddCompetencyToCourseRequest instantiates a new CoreCompetencyAddCompetencyToCourseRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreCompetencyAddCompetencyToCourseRequest(competencyid int32, courseid int32) *CoreCompetencyAddCompetencyToCourseRequest {
	this := CoreCompetencyAddCompetencyToCourseRequest{}
	this.Competencyid = competencyid
	this.Courseid = courseid
	return &this
}

// NewCoreCompetencyAddCompetencyToCourseRequestWithDefaults instantiates a new CoreCompetencyAddCompetencyToCourseRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreCompetencyAddCompetencyToCourseRequestWithDefaults() *CoreCompetencyAddCompetencyToCourseRequest {
	this := CoreCompetencyAddCompetencyToCourseRequest{}
	var competencyid int32 = null
	this.Competencyid = competencyid
	var courseid int32 = null
	this.Courseid = courseid
	return &this
}

// GetCompetencyid returns the Competencyid field value
func (o *CoreCompetencyAddCompetencyToCourseRequest) GetCompetencyid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Competencyid
}

// GetCompetencyidOk returns a tuple with the Competencyid field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyAddCompetencyToCourseRequest) GetCompetencyidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Competencyid, true
}

// SetCompetencyid sets field value
func (o *CoreCompetencyAddCompetencyToCourseRequest) SetCompetencyid(v int32) {
	o.Competencyid = v
}

// GetCourseid returns the Courseid field value
func (o *CoreCompetencyAddCompetencyToCourseRequest) GetCourseid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Courseid
}

// GetCourseidOk returns a tuple with the Courseid field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyAddCompetencyToCourseRequest) GetCourseidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Courseid, true
}

// SetCourseid sets field value
func (o *CoreCompetencyAddCompetencyToCourseRequest) SetCourseid(v int32) {
	o.Courseid = v
}

func (o CoreCompetencyAddCompetencyToCourseRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreCompetencyAddCompetencyToCourseRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["competencyid"] = o.Competencyid
	toSerialize["courseid"] = o.Courseid
	return toSerialize, nil
}

func (o *CoreCompetencyAddCompetencyToCourseRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"competencyid",
		"courseid",
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

	varCoreCompetencyAddCompetencyToCourseRequest := _CoreCompetencyAddCompetencyToCourseRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreCompetencyAddCompetencyToCourseRequest)

	if err != nil {
		return err
	}

	*o = CoreCompetencyAddCompetencyToCourseRequest(varCoreCompetencyAddCompetencyToCourseRequest)

	return err
}

type NullableCoreCompetencyAddCompetencyToCourseRequest struct {
	value *CoreCompetencyAddCompetencyToCourseRequest
	isSet bool
}

func (v NullableCoreCompetencyAddCompetencyToCourseRequest) Get() *CoreCompetencyAddCompetencyToCourseRequest {
	return v.value
}

func (v *NullableCoreCompetencyAddCompetencyToCourseRequest) Set(val *CoreCompetencyAddCompetencyToCourseRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreCompetencyAddCompetencyToCourseRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreCompetencyAddCompetencyToCourseRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreCompetencyAddCompetencyToCourseRequest(val *CoreCompetencyAddCompetencyToCourseRequest) *NullableCoreCompetencyAddCompetencyToCourseRequest {
	return &NullableCoreCompetencyAddCompetencyToCourseRequest{value: val, isSet: true}
}

func (v NullableCoreCompetencyAddCompetencyToCourseRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreCompetencyAddCompetencyToCourseRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


