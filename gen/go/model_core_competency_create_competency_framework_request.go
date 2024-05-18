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

// checks if the CoreCompetencyCreateCompetencyFrameworkRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreCompetencyCreateCompetencyFrameworkRequest{}

// CoreCompetencyCreateCompetencyFrameworkRequest struct for CoreCompetencyCreateCompetencyFrameworkRequest
type CoreCompetencyCreateCompetencyFrameworkRequest struct {
	Competencyframework CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework `json:"competencyframework"`
}

type _CoreCompetencyCreateCompetencyFrameworkRequest CoreCompetencyCreateCompetencyFrameworkRequest

// NewCoreCompetencyCreateCompetencyFrameworkRequest instantiates a new CoreCompetencyCreateCompetencyFrameworkRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreCompetencyCreateCompetencyFrameworkRequest(competencyframework CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) *CoreCompetencyCreateCompetencyFrameworkRequest {
	this := CoreCompetencyCreateCompetencyFrameworkRequest{}
	this.Competencyframework = competencyframework
	return &this
}

// NewCoreCompetencyCreateCompetencyFrameworkRequestWithDefaults instantiates a new CoreCompetencyCreateCompetencyFrameworkRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreCompetencyCreateCompetencyFrameworkRequestWithDefaults() *CoreCompetencyCreateCompetencyFrameworkRequest {
	this := CoreCompetencyCreateCompetencyFrameworkRequest{}
	return &this
}

// GetCompetencyframework returns the Competencyframework field value
func (o *CoreCompetencyCreateCompetencyFrameworkRequest) GetCompetencyframework() CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework {
	if o == nil {
		var ret CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework
		return ret
	}

	return o.Competencyframework
}

// GetCompetencyframeworkOk returns a tuple with the Competencyframework field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyCreateCompetencyFrameworkRequest) GetCompetencyframeworkOk() (*CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Competencyframework, true
}

// SetCompetencyframework sets field value
func (o *CoreCompetencyCreateCompetencyFrameworkRequest) SetCompetencyframework(v CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework) {
	o.Competencyframework = v
}

func (o CoreCompetencyCreateCompetencyFrameworkRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreCompetencyCreateCompetencyFrameworkRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["competencyframework"] = o.Competencyframework
	return toSerialize, nil
}

func (o *CoreCompetencyCreateCompetencyFrameworkRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"competencyframework",
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

	varCoreCompetencyCreateCompetencyFrameworkRequest := _CoreCompetencyCreateCompetencyFrameworkRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreCompetencyCreateCompetencyFrameworkRequest)

	if err != nil {
		return err
	}

	*o = CoreCompetencyCreateCompetencyFrameworkRequest(varCoreCompetencyCreateCompetencyFrameworkRequest)

	return err
}

type NullableCoreCompetencyCreateCompetencyFrameworkRequest struct {
	value *CoreCompetencyCreateCompetencyFrameworkRequest
	isSet bool
}

func (v NullableCoreCompetencyCreateCompetencyFrameworkRequest) Get() *CoreCompetencyCreateCompetencyFrameworkRequest {
	return v.value
}

func (v *NullableCoreCompetencyCreateCompetencyFrameworkRequest) Set(val *CoreCompetencyCreateCompetencyFrameworkRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreCompetencyCreateCompetencyFrameworkRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreCompetencyCreateCompetencyFrameworkRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreCompetencyCreateCompetencyFrameworkRequest(val *CoreCompetencyCreateCompetencyFrameworkRequest) *NullableCoreCompetencyCreateCompetencyFrameworkRequest {
	return &NullableCoreCompetencyCreateCompetencyFrameworkRequest{value: val, isSet: true}
}

func (v NullableCoreCompetencyCreateCompetencyFrameworkRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreCompetencyCreateCompetencyFrameworkRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


