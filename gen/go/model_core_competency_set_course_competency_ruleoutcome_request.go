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

// checks if the CoreCompetencySetCourseCompetencyRuleoutcomeRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreCompetencySetCourseCompetencyRuleoutcomeRequest{}

// CoreCompetencySetCourseCompetencyRuleoutcomeRequest struct for CoreCompetencySetCourseCompetencyRuleoutcomeRequest
type CoreCompetencySetCourseCompetencyRuleoutcomeRequest struct {
	// Data base record id for the course competency
	Coursecompetencyid int32 `json:"coursecompetencyid"`
	// Ruleoutcome value
	Ruleoutcome int32 `json:"ruleoutcome"`
}

type _CoreCompetencySetCourseCompetencyRuleoutcomeRequest CoreCompetencySetCourseCompetencyRuleoutcomeRequest

// NewCoreCompetencySetCourseCompetencyRuleoutcomeRequest instantiates a new CoreCompetencySetCourseCompetencyRuleoutcomeRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreCompetencySetCourseCompetencyRuleoutcomeRequest(coursecompetencyid int32, ruleoutcome int32) *CoreCompetencySetCourseCompetencyRuleoutcomeRequest {
	this := CoreCompetencySetCourseCompetencyRuleoutcomeRequest{}
	this.Coursecompetencyid = coursecompetencyid
	this.Ruleoutcome = ruleoutcome
	return &this
}

// NewCoreCompetencySetCourseCompetencyRuleoutcomeRequestWithDefaults instantiates a new CoreCompetencySetCourseCompetencyRuleoutcomeRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreCompetencySetCourseCompetencyRuleoutcomeRequestWithDefaults() *CoreCompetencySetCourseCompetencyRuleoutcomeRequest {
	this := CoreCompetencySetCourseCompetencyRuleoutcomeRequest{}
	var coursecompetencyid int32 = null
	this.Coursecompetencyid = coursecompetencyid
	var ruleoutcome int32 = null
	this.Ruleoutcome = ruleoutcome
	return &this
}

// GetCoursecompetencyid returns the Coursecompetencyid field value
func (o *CoreCompetencySetCourseCompetencyRuleoutcomeRequest) GetCoursecompetencyid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Coursecompetencyid
}

// GetCoursecompetencyidOk returns a tuple with the Coursecompetencyid field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencySetCourseCompetencyRuleoutcomeRequest) GetCoursecompetencyidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Coursecompetencyid, true
}

// SetCoursecompetencyid sets field value
func (o *CoreCompetencySetCourseCompetencyRuleoutcomeRequest) SetCoursecompetencyid(v int32) {
	o.Coursecompetencyid = v
}

// GetRuleoutcome returns the Ruleoutcome field value
func (o *CoreCompetencySetCourseCompetencyRuleoutcomeRequest) GetRuleoutcome() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Ruleoutcome
}

// GetRuleoutcomeOk returns a tuple with the Ruleoutcome field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencySetCourseCompetencyRuleoutcomeRequest) GetRuleoutcomeOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Ruleoutcome, true
}

// SetRuleoutcome sets field value
func (o *CoreCompetencySetCourseCompetencyRuleoutcomeRequest) SetRuleoutcome(v int32) {
	o.Ruleoutcome = v
}

func (o CoreCompetencySetCourseCompetencyRuleoutcomeRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreCompetencySetCourseCompetencyRuleoutcomeRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["coursecompetencyid"] = o.Coursecompetencyid
	toSerialize["ruleoutcome"] = o.Ruleoutcome
	return toSerialize, nil
}

func (o *CoreCompetencySetCourseCompetencyRuleoutcomeRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"coursecompetencyid",
		"ruleoutcome",
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

	varCoreCompetencySetCourseCompetencyRuleoutcomeRequest := _CoreCompetencySetCourseCompetencyRuleoutcomeRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreCompetencySetCourseCompetencyRuleoutcomeRequest)

	if err != nil {
		return err
	}

	*o = CoreCompetencySetCourseCompetencyRuleoutcomeRequest(varCoreCompetencySetCourseCompetencyRuleoutcomeRequest)

	return err
}

type NullableCoreCompetencySetCourseCompetencyRuleoutcomeRequest struct {
	value *CoreCompetencySetCourseCompetencyRuleoutcomeRequest
	isSet bool
}

func (v NullableCoreCompetencySetCourseCompetencyRuleoutcomeRequest) Get() *CoreCompetencySetCourseCompetencyRuleoutcomeRequest {
	return v.value
}

func (v *NullableCoreCompetencySetCourseCompetencyRuleoutcomeRequest) Set(val *CoreCompetencySetCourseCompetencyRuleoutcomeRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreCompetencySetCourseCompetencyRuleoutcomeRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreCompetencySetCourseCompetencyRuleoutcomeRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreCompetencySetCourseCompetencyRuleoutcomeRequest(val *CoreCompetencySetCourseCompetencyRuleoutcomeRequest) *NullableCoreCompetencySetCourseCompetencyRuleoutcomeRequest {
	return &NullableCoreCompetencySetCourseCompetencyRuleoutcomeRequest{value: val, isSet: true}
}

func (v NullableCoreCompetencySetCourseCompetencyRuleoutcomeRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreCompetencySetCourseCompetencyRuleoutcomeRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

