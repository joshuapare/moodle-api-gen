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

// checks if the ToolLpDataForRelatedCompetenciesSection200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ToolLpDataForRelatedCompetenciesSection200Response{}

// ToolLpDataForRelatedCompetenciesSection200Response struct for ToolLpDataForRelatedCompetenciesSection200Response
type ToolLpDataForRelatedCompetenciesSection200Response struct {
	Relatedcompetencies []CoreCompetencyReadUserEvidence200ResponseCompetenciesInner `json:"relatedcompetencies"`
	// Whether to show the delete relation link or not
	Showdeleterelatedaction bool `json:"showdeleterelatedaction"`
}

type _ToolLpDataForRelatedCompetenciesSection200Response ToolLpDataForRelatedCompetenciesSection200Response

// NewToolLpDataForRelatedCompetenciesSection200Response instantiates a new ToolLpDataForRelatedCompetenciesSection200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewToolLpDataForRelatedCompetenciesSection200Response(relatedcompetencies []CoreCompetencyReadUserEvidence200ResponseCompetenciesInner, showdeleterelatedaction bool) *ToolLpDataForRelatedCompetenciesSection200Response {
	this := ToolLpDataForRelatedCompetenciesSection200Response{}
	this.Relatedcompetencies = relatedcompetencies
	this.Showdeleterelatedaction = showdeleterelatedaction
	return &this
}

// NewToolLpDataForRelatedCompetenciesSection200ResponseWithDefaults instantiates a new ToolLpDataForRelatedCompetenciesSection200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewToolLpDataForRelatedCompetenciesSection200ResponseWithDefaults() *ToolLpDataForRelatedCompetenciesSection200Response {
	this := ToolLpDataForRelatedCompetenciesSection200Response{}
	var showdeleterelatedaction bool = null
	this.Showdeleterelatedaction = showdeleterelatedaction
	return &this
}

// GetRelatedcompetencies returns the Relatedcompetencies field value
func (o *ToolLpDataForRelatedCompetenciesSection200Response) GetRelatedcompetencies() []CoreCompetencyReadUserEvidence200ResponseCompetenciesInner {
	if o == nil {
		var ret []CoreCompetencyReadUserEvidence200ResponseCompetenciesInner
		return ret
	}

	return o.Relatedcompetencies
}

// GetRelatedcompetenciesOk returns a tuple with the Relatedcompetencies field value
// and a boolean to check if the value has been set.
func (o *ToolLpDataForRelatedCompetenciesSection200Response) GetRelatedcompetenciesOk() ([]CoreCompetencyReadUserEvidence200ResponseCompetenciesInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Relatedcompetencies, true
}

// SetRelatedcompetencies sets field value
func (o *ToolLpDataForRelatedCompetenciesSection200Response) SetRelatedcompetencies(v []CoreCompetencyReadUserEvidence200ResponseCompetenciesInner) {
	o.Relatedcompetencies = v
}

// GetShowdeleterelatedaction returns the Showdeleterelatedaction field value
func (o *ToolLpDataForRelatedCompetenciesSection200Response) GetShowdeleterelatedaction() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Showdeleterelatedaction
}

// GetShowdeleterelatedactionOk returns a tuple with the Showdeleterelatedaction field value
// and a boolean to check if the value has been set.
func (o *ToolLpDataForRelatedCompetenciesSection200Response) GetShowdeleterelatedactionOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Showdeleterelatedaction, true
}

// SetShowdeleterelatedaction sets field value
func (o *ToolLpDataForRelatedCompetenciesSection200Response) SetShowdeleterelatedaction(v bool) {
	o.Showdeleterelatedaction = v
}

func (o ToolLpDataForRelatedCompetenciesSection200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ToolLpDataForRelatedCompetenciesSection200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["relatedcompetencies"] = o.Relatedcompetencies
	toSerialize["showdeleterelatedaction"] = o.Showdeleterelatedaction
	return toSerialize, nil
}

func (o *ToolLpDataForRelatedCompetenciesSection200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"relatedcompetencies",
		"showdeleterelatedaction",
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

	varToolLpDataForRelatedCompetenciesSection200Response := _ToolLpDataForRelatedCompetenciesSection200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varToolLpDataForRelatedCompetenciesSection200Response)

	if err != nil {
		return err
	}

	*o = ToolLpDataForRelatedCompetenciesSection200Response(varToolLpDataForRelatedCompetenciesSection200Response)

	return err
}

type NullableToolLpDataForRelatedCompetenciesSection200Response struct {
	value *ToolLpDataForRelatedCompetenciesSection200Response
	isSet bool
}

func (v NullableToolLpDataForRelatedCompetenciesSection200Response) Get() *ToolLpDataForRelatedCompetenciesSection200Response {
	return v.value
}

func (v *NullableToolLpDataForRelatedCompetenciesSection200Response) Set(val *ToolLpDataForRelatedCompetenciesSection200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableToolLpDataForRelatedCompetenciesSection200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableToolLpDataForRelatedCompetenciesSection200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableToolLpDataForRelatedCompetenciesSection200Response(val *ToolLpDataForRelatedCompetenciesSection200Response) *NullableToolLpDataForRelatedCompetenciesSection200Response {
	return &NullableToolLpDataForRelatedCompetenciesSection200Response{value: val, isSet: true}
}

func (v NullableToolLpDataForRelatedCompetenciesSection200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableToolLpDataForRelatedCompetenciesSection200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

