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

// checks if the LocalIomadLearningpathAddusersRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &LocalIomadLearningpathAddusersRequest{}

// LocalIomadLearningpathAddusersRequest struct for LocalIomadLearningpathAddusersRequest
type LocalIomadLearningpathAddusersRequest struct {
	// ID of Iomad Learning Path
	Pathid int32 `json:"pathid"`
	Userids []map[string]interface{} `json:"userids"`
}

type _LocalIomadLearningpathAddusersRequest LocalIomadLearningpathAddusersRequest

// NewLocalIomadLearningpathAddusersRequest instantiates a new LocalIomadLearningpathAddusersRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewLocalIomadLearningpathAddusersRequest(pathid int32, userids []map[string]interface{}) *LocalIomadLearningpathAddusersRequest {
	this := LocalIomadLearningpathAddusersRequest{}
	this.Pathid = pathid
	this.Userids = userids
	return &this
}

// NewLocalIomadLearningpathAddusersRequestWithDefaults instantiates a new LocalIomadLearningpathAddusersRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewLocalIomadLearningpathAddusersRequestWithDefaults() *LocalIomadLearningpathAddusersRequest {
	this := LocalIomadLearningpathAddusersRequest{}
	return &this
}

// GetPathid returns the Pathid field value
func (o *LocalIomadLearningpathAddusersRequest) GetPathid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Pathid
}

// GetPathidOk returns a tuple with the Pathid field value
// and a boolean to check if the value has been set.
func (o *LocalIomadLearningpathAddusersRequest) GetPathidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Pathid, true
}

// SetPathid sets field value
func (o *LocalIomadLearningpathAddusersRequest) SetPathid(v int32) {
	o.Pathid = v
}

// GetUserids returns the Userids field value
func (o *LocalIomadLearningpathAddusersRequest) GetUserids() []map[string]interface{} {
	if o == nil {
		var ret []map[string]interface{}
		return ret
	}

	return o.Userids
}

// GetUseridsOk returns a tuple with the Userids field value
// and a boolean to check if the value has been set.
func (o *LocalIomadLearningpathAddusersRequest) GetUseridsOk() ([]map[string]interface{}, bool) {
	if o == nil {
		return nil, false
	}
	return o.Userids, true
}

// SetUserids sets field value
func (o *LocalIomadLearningpathAddusersRequest) SetUserids(v []map[string]interface{}) {
	o.Userids = v
}

func (o LocalIomadLearningpathAddusersRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o LocalIomadLearningpathAddusersRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["pathid"] = o.Pathid
	toSerialize["userids"] = o.Userids
	return toSerialize, nil
}

func (o *LocalIomadLearningpathAddusersRequest) UnmarshalJSON(data []byte) (err error) {
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

	varLocalIomadLearningpathAddusersRequest := _LocalIomadLearningpathAddusersRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varLocalIomadLearningpathAddusersRequest)

	if err != nil {
		return err
	}

	*o = LocalIomadLearningpathAddusersRequest(varLocalIomadLearningpathAddusersRequest)

	return err
}

type NullableLocalIomadLearningpathAddusersRequest struct {
	value *LocalIomadLearningpathAddusersRequest
	isSet bool
}

func (v NullableLocalIomadLearningpathAddusersRequest) Get() *LocalIomadLearningpathAddusersRequest {
	return v.value
}

func (v *NullableLocalIomadLearningpathAddusersRequest) Set(val *LocalIomadLearningpathAddusersRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableLocalIomadLearningpathAddusersRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableLocalIomadLearningpathAddusersRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableLocalIomadLearningpathAddusersRequest(val *LocalIomadLearningpathAddusersRequest) *NullableLocalIomadLearningpathAddusersRequest {
	return &NullableLocalIomadLearningpathAddusersRequest{value: val, isSet: true}
}

func (v NullableLocalIomadLearningpathAddusersRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableLocalIomadLearningpathAddusersRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


