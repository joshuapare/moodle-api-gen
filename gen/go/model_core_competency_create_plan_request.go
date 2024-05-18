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

// checks if the CoreCompetencyCreatePlanRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreCompetencyCreatePlanRequest{}

// CoreCompetencyCreatePlanRequest struct for CoreCompetencyCreatePlanRequest
type CoreCompetencyCreatePlanRequest struct {
	Plan CoreCompetencyCreatePlanRequestPlan `json:"plan"`
}

type _CoreCompetencyCreatePlanRequest CoreCompetencyCreatePlanRequest

// NewCoreCompetencyCreatePlanRequest instantiates a new CoreCompetencyCreatePlanRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreCompetencyCreatePlanRequest(plan CoreCompetencyCreatePlanRequestPlan) *CoreCompetencyCreatePlanRequest {
	this := CoreCompetencyCreatePlanRequest{}
	this.Plan = plan
	return &this
}

// NewCoreCompetencyCreatePlanRequestWithDefaults instantiates a new CoreCompetencyCreatePlanRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreCompetencyCreatePlanRequestWithDefaults() *CoreCompetencyCreatePlanRequest {
	this := CoreCompetencyCreatePlanRequest{}
	return &this
}

// GetPlan returns the Plan field value
func (o *CoreCompetencyCreatePlanRequest) GetPlan() CoreCompetencyCreatePlanRequestPlan {
	if o == nil {
		var ret CoreCompetencyCreatePlanRequestPlan
		return ret
	}

	return o.Plan
}

// GetPlanOk returns a tuple with the Plan field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyCreatePlanRequest) GetPlanOk() (*CoreCompetencyCreatePlanRequestPlan, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Plan, true
}

// SetPlan sets field value
func (o *CoreCompetencyCreatePlanRequest) SetPlan(v CoreCompetencyCreatePlanRequestPlan) {
	o.Plan = v
}

func (o CoreCompetencyCreatePlanRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreCompetencyCreatePlanRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["plan"] = o.Plan
	return toSerialize, nil
}

func (o *CoreCompetencyCreatePlanRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"plan",
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

	varCoreCompetencyCreatePlanRequest := _CoreCompetencyCreatePlanRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreCompetencyCreatePlanRequest)

	if err != nil {
		return err
	}

	*o = CoreCompetencyCreatePlanRequest(varCoreCompetencyCreatePlanRequest)

	return err
}

type NullableCoreCompetencyCreatePlanRequest struct {
	value *CoreCompetencyCreatePlanRequest
	isSet bool
}

func (v NullableCoreCompetencyCreatePlanRequest) Get() *CoreCompetencyCreatePlanRequest {
	return v.value
}

func (v *NullableCoreCompetencyCreatePlanRequest) Set(val *CoreCompetencyCreatePlanRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreCompetencyCreatePlanRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreCompetencyCreatePlanRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreCompetencyCreatePlanRequest(val *CoreCompetencyCreatePlanRequest) *NullableCoreCompetencyCreatePlanRequest {
	return &NullableCoreCompetencyCreatePlanRequest{value: val, isSet: true}
}

func (v NullableCoreCompetencyCreatePlanRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreCompetencyCreatePlanRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


