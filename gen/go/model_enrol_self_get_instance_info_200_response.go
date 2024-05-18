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

// checks if the EnrolSelfGetInstanceInfo200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &EnrolSelfGetInstanceInfo200Response{}

// EnrolSelfGetInstanceInfo200Response struct for EnrolSelfGetInstanceInfo200Response
type EnrolSelfGetInstanceInfo200Response struct {
	// id of course
	Courseid int32 `json:"courseid"`
	// password required for enrolment
	Enrolpassword *string `json:"enrolpassword,omitempty"`
	// id of course enrolment instance
	Id int32 `json:"id"`
	// name of enrolment plugin
	Name string `json:"name"`
	// status of enrolment plugin
	Status string `json:"status"`
	// type of enrolment plugin
	Type string `json:"type"`
}

type _EnrolSelfGetInstanceInfo200Response EnrolSelfGetInstanceInfo200Response

// NewEnrolSelfGetInstanceInfo200Response instantiates a new EnrolSelfGetInstanceInfo200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewEnrolSelfGetInstanceInfo200Response(courseid int32, id int32, name string, status string, type_ string) *EnrolSelfGetInstanceInfo200Response {
	this := EnrolSelfGetInstanceInfo200Response{}
	this.Courseid = courseid
	this.Id = id
	this.Name = name
	this.Status = status
	this.Type = type_
	return &this
}

// NewEnrolSelfGetInstanceInfo200ResponseWithDefaults instantiates a new EnrolSelfGetInstanceInfo200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewEnrolSelfGetInstanceInfo200ResponseWithDefaults() *EnrolSelfGetInstanceInfo200Response {
	this := EnrolSelfGetInstanceInfo200Response{}
	return &this
}

// GetCourseid returns the Courseid field value
func (o *EnrolSelfGetInstanceInfo200Response) GetCourseid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Courseid
}

// GetCourseidOk returns a tuple with the Courseid field value
// and a boolean to check if the value has been set.
func (o *EnrolSelfGetInstanceInfo200Response) GetCourseidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Courseid, true
}

// SetCourseid sets field value
func (o *EnrolSelfGetInstanceInfo200Response) SetCourseid(v int32) {
	o.Courseid = v
}

// GetEnrolpassword returns the Enrolpassword field value if set, zero value otherwise.
func (o *EnrolSelfGetInstanceInfo200Response) GetEnrolpassword() string {
	if o == nil || IsNil(o.Enrolpassword) {
		var ret string
		return ret
	}
	return *o.Enrolpassword
}

// GetEnrolpasswordOk returns a tuple with the Enrolpassword field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *EnrolSelfGetInstanceInfo200Response) GetEnrolpasswordOk() (*string, bool) {
	if o == nil || IsNil(o.Enrolpassword) {
		return nil, false
	}
	return o.Enrolpassword, true
}

// HasEnrolpassword returns a boolean if a field has been set.
func (o *EnrolSelfGetInstanceInfo200Response) HasEnrolpassword() bool {
	if o != nil && !IsNil(o.Enrolpassword) {
		return true
	}

	return false
}

// SetEnrolpassword gets a reference to the given string and assigns it to the Enrolpassword field.
func (o *EnrolSelfGetInstanceInfo200Response) SetEnrolpassword(v string) {
	o.Enrolpassword = &v
}

// GetId returns the Id field value
func (o *EnrolSelfGetInstanceInfo200Response) GetId() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *EnrolSelfGetInstanceInfo200Response) GetIdOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *EnrolSelfGetInstanceInfo200Response) SetId(v int32) {
	o.Id = v
}

// GetName returns the Name field value
func (o *EnrolSelfGetInstanceInfo200Response) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *EnrolSelfGetInstanceInfo200Response) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *EnrolSelfGetInstanceInfo200Response) SetName(v string) {
	o.Name = v
}

// GetStatus returns the Status field value
func (o *EnrolSelfGetInstanceInfo200Response) GetStatus() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Status
}

// GetStatusOk returns a tuple with the Status field value
// and a boolean to check if the value has been set.
func (o *EnrolSelfGetInstanceInfo200Response) GetStatusOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Status, true
}

// SetStatus sets field value
func (o *EnrolSelfGetInstanceInfo200Response) SetStatus(v string) {
	o.Status = v
}

// GetType returns the Type field value
func (o *EnrolSelfGetInstanceInfo200Response) GetType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *EnrolSelfGetInstanceInfo200Response) GetTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Type, true
}

// SetType sets field value
func (o *EnrolSelfGetInstanceInfo200Response) SetType(v string) {
	o.Type = v
}

func (o EnrolSelfGetInstanceInfo200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o EnrolSelfGetInstanceInfo200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["courseid"] = o.Courseid
	if !IsNil(o.Enrolpassword) {
		toSerialize["enrolpassword"] = o.Enrolpassword
	}
	toSerialize["id"] = o.Id
	toSerialize["name"] = o.Name
	toSerialize["status"] = o.Status
	toSerialize["type"] = o.Type
	return toSerialize, nil
}

func (o *EnrolSelfGetInstanceInfo200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"courseid",
		"id",
		"name",
		"status",
		"type",
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

	varEnrolSelfGetInstanceInfo200Response := _EnrolSelfGetInstanceInfo200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varEnrolSelfGetInstanceInfo200Response)

	if err != nil {
		return err
	}

	*o = EnrolSelfGetInstanceInfo200Response(varEnrolSelfGetInstanceInfo200Response)

	return err
}

type NullableEnrolSelfGetInstanceInfo200Response struct {
	value *EnrolSelfGetInstanceInfo200Response
	isSet bool
}

func (v NullableEnrolSelfGetInstanceInfo200Response) Get() *EnrolSelfGetInstanceInfo200Response {
	return v.value
}

func (v *NullableEnrolSelfGetInstanceInfo200Response) Set(val *EnrolSelfGetInstanceInfo200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableEnrolSelfGetInstanceInfo200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableEnrolSelfGetInstanceInfo200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableEnrolSelfGetInstanceInfo200Response(val *EnrolSelfGetInstanceInfo200Response) *NullableEnrolSelfGetInstanceInfo200Response {
	return &NullableEnrolSelfGetInstanceInfo200Response{value: val, isSet: true}
}

func (v NullableEnrolSelfGetInstanceInfo200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableEnrolSelfGetInstanceInfo200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


