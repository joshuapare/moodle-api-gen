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

// checks if the CoreCourseEditSectionRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreCourseEditSectionRequest{}

// CoreCourseEditSectionRequest struct for CoreCourseEditSectionRequest
type CoreCourseEditSectionRequest struct {
	// action: hide, show, stealth, setmarker, removemarker
	Action string `json:"action"`
	// course section id
	Id int32 `json:"id"`
	// section to return to
	Sectionreturn *int32 `json:"sectionreturn,omitempty"`
}

type _CoreCourseEditSectionRequest CoreCourseEditSectionRequest

// NewCoreCourseEditSectionRequest instantiates a new CoreCourseEditSectionRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreCourseEditSectionRequest(action string, id int32) *CoreCourseEditSectionRequest {
	this := CoreCourseEditSectionRequest{}
	this.Action = action
	this.Id = id
	return &this
}

// NewCoreCourseEditSectionRequestWithDefaults instantiates a new CoreCourseEditSectionRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreCourseEditSectionRequestWithDefaults() *CoreCourseEditSectionRequest {
	this := CoreCourseEditSectionRequest{}
	var action string = "null"
	this.Action = action
	var id int32 = null
	this.Id = id
	return &this
}

// GetAction returns the Action field value
func (o *CoreCourseEditSectionRequest) GetAction() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Action
}

// GetActionOk returns a tuple with the Action field value
// and a boolean to check if the value has been set.
func (o *CoreCourseEditSectionRequest) GetActionOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Action, true
}

// SetAction sets field value
func (o *CoreCourseEditSectionRequest) SetAction(v string) {
	o.Action = v
}

// GetId returns the Id field value
func (o *CoreCourseEditSectionRequest) GetId() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *CoreCourseEditSectionRequest) GetIdOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *CoreCourseEditSectionRequest) SetId(v int32) {
	o.Id = v
}

// GetSectionreturn returns the Sectionreturn field value if set, zero value otherwise.
func (o *CoreCourseEditSectionRequest) GetSectionreturn() int32 {
	if o == nil || IsNil(o.Sectionreturn) {
		var ret int32
		return ret
	}
	return *o.Sectionreturn
}

// GetSectionreturnOk returns a tuple with the Sectionreturn field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseEditSectionRequest) GetSectionreturnOk() (*int32, bool) {
	if o == nil || IsNil(o.Sectionreturn) {
		return nil, false
	}
	return o.Sectionreturn, true
}

// HasSectionreturn returns a boolean if a field has been set.
func (o *CoreCourseEditSectionRequest) HasSectionreturn() bool {
	if o != nil && !IsNil(o.Sectionreturn) {
		return true
	}

	return false
}

// SetSectionreturn gets a reference to the given int32 and assigns it to the Sectionreturn field.
func (o *CoreCourseEditSectionRequest) SetSectionreturn(v int32) {
	o.Sectionreturn = &v
}

func (o CoreCourseEditSectionRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreCourseEditSectionRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["action"] = o.Action
	toSerialize["id"] = o.Id
	if !IsNil(o.Sectionreturn) {
		toSerialize["sectionreturn"] = o.Sectionreturn
	}
	return toSerialize, nil
}

func (o *CoreCourseEditSectionRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"action",
		"id",
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

	varCoreCourseEditSectionRequest := _CoreCourseEditSectionRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreCourseEditSectionRequest)

	if err != nil {
		return err
	}

	*o = CoreCourseEditSectionRequest(varCoreCourseEditSectionRequest)

	return err
}

type NullableCoreCourseEditSectionRequest struct {
	value *CoreCourseEditSectionRequest
	isSet bool
}

func (v NullableCoreCourseEditSectionRequest) Get() *CoreCourseEditSectionRequest {
	return v.value
}

func (v *NullableCoreCourseEditSectionRequest) Set(val *CoreCourseEditSectionRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreCourseEditSectionRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreCourseEditSectionRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreCourseEditSectionRequest(val *CoreCourseEditSectionRequest) *NullableCoreCourseEditSectionRequest {
	return &NullableCoreCourseEditSectionRequest{value: val, isSet: true}
}

func (v NullableCoreCourseEditSectionRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreCourseEditSectionRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


