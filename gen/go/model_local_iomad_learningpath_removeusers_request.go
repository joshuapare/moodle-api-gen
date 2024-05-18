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

// checks if the LocalIomadLearningpathRemoveusersRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &LocalIomadLearningpathRemoveusersRequest{}

// LocalIomadLearningpathRemoveusersRequest struct for LocalIomadLearningpathRemoveusersRequest
type LocalIomadLearningpathRemoveusersRequest struct {
	// ID of Iomad Learning Path
	Pathid int32 `json:"pathid"`
	Userids []map[string]interface{} `json:"userids"`
}

type _LocalIomadLearningpathRemoveusersRequest LocalIomadLearningpathRemoveusersRequest

// NewLocalIomadLearningpathRemoveusersRequest instantiates a new LocalIomadLearningpathRemoveusersRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewLocalIomadLearningpathRemoveusersRequest(pathid int32, userids []map[string]interface{}) *LocalIomadLearningpathRemoveusersRequest {
	this := LocalIomadLearningpathRemoveusersRequest{}
	this.Pathid = pathid
	this.Userids = userids
	return &this
}

// NewLocalIomadLearningpathRemoveusersRequestWithDefaults instantiates a new LocalIomadLearningpathRemoveusersRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewLocalIomadLearningpathRemoveusersRequestWithDefaults() *LocalIomadLearningpathRemoveusersRequest {
	this := LocalIomadLearningpathRemoveusersRequest{}
	return &this
}

// GetPathid returns the Pathid field value
func (o *LocalIomadLearningpathRemoveusersRequest) GetPathid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Pathid
}

// GetPathidOk returns a tuple with the Pathid field value
// and a boolean to check if the value has been set.
func (o *LocalIomadLearningpathRemoveusersRequest) GetPathidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Pathid, true
}

// SetPathid sets field value
func (o *LocalIomadLearningpathRemoveusersRequest) SetPathid(v int32) {
	o.Pathid = v
}

// GetUserids returns the Userids field value
func (o *LocalIomadLearningpathRemoveusersRequest) GetUserids() []map[string]interface{} {
	if o == nil {
		var ret []map[string]interface{}
		return ret
	}

	return o.Userids
}

// GetUseridsOk returns a tuple with the Userids field value
// and a boolean to check if the value has been set.
func (o *LocalIomadLearningpathRemoveusersRequest) GetUseridsOk() ([]map[string]interface{}, bool) {
	if o == nil {
		return nil, false
	}
	return o.Userids, true
}

// SetUserids sets field value
func (o *LocalIomadLearningpathRemoveusersRequest) SetUserids(v []map[string]interface{}) {
	o.Userids = v
}

func (o LocalIomadLearningpathRemoveusersRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o LocalIomadLearningpathRemoveusersRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["pathid"] = o.Pathid
	toSerialize["userids"] = o.Userids
	return toSerialize, nil
}

func (o *LocalIomadLearningpathRemoveusersRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"pathid",
		"userids",
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

	varLocalIomadLearningpathRemoveusersRequest := _LocalIomadLearningpathRemoveusersRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varLocalIomadLearningpathRemoveusersRequest)

	if err != nil {
		return err
	}

	*o = LocalIomadLearningpathRemoveusersRequest(varLocalIomadLearningpathRemoveusersRequest)

	return err
}

type NullableLocalIomadLearningpathRemoveusersRequest struct {
	value *LocalIomadLearningpathRemoveusersRequest
	isSet bool
}

func (v NullableLocalIomadLearningpathRemoveusersRequest) Get() *LocalIomadLearningpathRemoveusersRequest {
	return v.value
}

func (v *NullableLocalIomadLearningpathRemoveusersRequest) Set(val *LocalIomadLearningpathRemoveusersRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableLocalIomadLearningpathRemoveusersRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableLocalIomadLearningpathRemoveusersRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableLocalIomadLearningpathRemoveusersRequest(val *LocalIomadLearningpathRemoveusersRequest) *NullableLocalIomadLearningpathRemoveusersRequest {
	return &NullableLocalIomadLearningpathRemoveusersRequest{value: val, isSet: true}
}

func (v NullableLocalIomadLearningpathRemoveusersRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableLocalIomadLearningpathRemoveusersRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

