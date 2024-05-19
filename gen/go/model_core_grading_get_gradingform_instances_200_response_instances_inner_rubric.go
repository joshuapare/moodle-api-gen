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

// checks if the CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric{}

// CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric struct for CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric
type CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric struct {
	Criteria []CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner `json:"criteria,omitempty"`
}

// NewCoreGradingGetGradingformInstances200ResponseInstancesInnerRubric instantiates a new CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreGradingGetGradingformInstances200ResponseInstancesInnerRubric() *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric {
	this := CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric{}
	return &this
}

// NewCoreGradingGetGradingformInstances200ResponseInstancesInnerRubricWithDefaults instantiates a new CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreGradingGetGradingformInstances200ResponseInstancesInnerRubricWithDefaults() *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric {
	this := CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric{}
	return &this
}

// GetCriteria returns the Criteria field value if set, zero value otherwise.
func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric) GetCriteria() []CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner {
	if o == nil || IsNil(o.Criteria) {
		var ret []CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner
		return ret
	}
	return o.Criteria
}

// GetCriteriaOk returns a tuple with the Criteria field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric) GetCriteriaOk() ([]CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner, bool) {
	if o == nil || IsNil(o.Criteria) {
		return nil, false
	}
	return o.Criteria, true
}

// HasCriteria returns a boolean if a field has been set.
func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric) HasCriteria() bool {
	if o != nil && !IsNil(o.Criteria) {
		return true
	}

	return false
}

// SetCriteria gets a reference to the given []CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner and assigns it to the Criteria field.
func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric) SetCriteria(v []CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) {
	o.Criteria = v
}

func (o CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Criteria) {
		toSerialize["criteria"] = o.Criteria
	}
	return toSerialize, nil
}

type NullableCoreGradingGetGradingformInstances200ResponseInstancesInnerRubric struct {
	value *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric
	isSet bool
}

func (v NullableCoreGradingGetGradingformInstances200ResponseInstancesInnerRubric) Get() *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric {
	return v.value
}

func (v *NullableCoreGradingGetGradingformInstances200ResponseInstancesInnerRubric) Set(val *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreGradingGetGradingformInstances200ResponseInstancesInnerRubric) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreGradingGetGradingformInstances200ResponseInstancesInnerRubric) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreGradingGetGradingformInstances200ResponseInstancesInnerRubric(val *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric) *NullableCoreGradingGetGradingformInstances200ResponseInstancesInnerRubric {
	return &NullableCoreGradingGetGradingformInstances200ResponseInstancesInnerRubric{value: val, isSet: true}
}

func (v NullableCoreGradingGetGradingformInstances200ResponseInstancesInnerRubric) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreGradingGetGradingformInstances200ResponseInstancesInnerRubric) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


