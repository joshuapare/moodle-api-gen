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

// checks if the BlockIomadCompanyAdminGetCompanyCoursesRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &BlockIomadCompanyAdminGetCompanyCoursesRequest{}

// BlockIomadCompanyAdminGetCompanyCoursesRequest struct for BlockIomadCompanyAdminGetCompanyCoursesRequest
type BlockIomadCompanyAdminGetCompanyCoursesRequest struct {
	Criteria []BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner `json:"criteria"`
}

type _BlockIomadCompanyAdminGetCompanyCoursesRequest BlockIomadCompanyAdminGetCompanyCoursesRequest

// NewBlockIomadCompanyAdminGetCompanyCoursesRequest instantiates a new BlockIomadCompanyAdminGetCompanyCoursesRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBlockIomadCompanyAdminGetCompanyCoursesRequest(criteria []BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner) *BlockIomadCompanyAdminGetCompanyCoursesRequest {
	this := BlockIomadCompanyAdminGetCompanyCoursesRequest{}
	this.Criteria = criteria
	return &this
}

// NewBlockIomadCompanyAdminGetCompanyCoursesRequestWithDefaults instantiates a new BlockIomadCompanyAdminGetCompanyCoursesRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBlockIomadCompanyAdminGetCompanyCoursesRequestWithDefaults() *BlockIomadCompanyAdminGetCompanyCoursesRequest {
	this := BlockIomadCompanyAdminGetCompanyCoursesRequest{}
	return &this
}

// GetCriteria returns the Criteria field value
func (o *BlockIomadCompanyAdminGetCompanyCoursesRequest) GetCriteria() []BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner {
	if o == nil {
		var ret []BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner
		return ret
	}

	return o.Criteria
}

// GetCriteriaOk returns a tuple with the Criteria field value
// and a boolean to check if the value has been set.
func (o *BlockIomadCompanyAdminGetCompanyCoursesRequest) GetCriteriaOk() ([]BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Criteria, true
}

// SetCriteria sets field value
func (o *BlockIomadCompanyAdminGetCompanyCoursesRequest) SetCriteria(v []BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner) {
	o.Criteria = v
}

func (o BlockIomadCompanyAdminGetCompanyCoursesRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o BlockIomadCompanyAdminGetCompanyCoursesRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["criteria"] = o.Criteria
	return toSerialize, nil
}

func (o *BlockIomadCompanyAdminGetCompanyCoursesRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"criteria",
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

	varBlockIomadCompanyAdminGetCompanyCoursesRequest := _BlockIomadCompanyAdminGetCompanyCoursesRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varBlockIomadCompanyAdminGetCompanyCoursesRequest)

	if err != nil {
		return err
	}

	*o = BlockIomadCompanyAdminGetCompanyCoursesRequest(varBlockIomadCompanyAdminGetCompanyCoursesRequest)

	return err
}

type NullableBlockIomadCompanyAdminGetCompanyCoursesRequest struct {
	value *BlockIomadCompanyAdminGetCompanyCoursesRequest
	isSet bool
}

func (v NullableBlockIomadCompanyAdminGetCompanyCoursesRequest) Get() *BlockIomadCompanyAdminGetCompanyCoursesRequest {
	return v.value
}

func (v *NullableBlockIomadCompanyAdminGetCompanyCoursesRequest) Set(val *BlockIomadCompanyAdminGetCompanyCoursesRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableBlockIomadCompanyAdminGetCompanyCoursesRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableBlockIomadCompanyAdminGetCompanyCoursesRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBlockIomadCompanyAdminGetCompanyCoursesRequest(val *BlockIomadCompanyAdminGetCompanyCoursesRequest) *NullableBlockIomadCompanyAdminGetCompanyCoursesRequest {
	return &NullableBlockIomadCompanyAdminGetCompanyCoursesRequest{value: val, isSet: true}
}

func (v NullableBlockIomadCompanyAdminGetCompanyCoursesRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBlockIomadCompanyAdminGetCompanyCoursesRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

