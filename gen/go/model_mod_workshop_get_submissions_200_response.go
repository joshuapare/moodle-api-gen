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

// checks if the ModWorkshopGetSubmissions200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModWorkshopGetSubmissions200Response{}

// ModWorkshopGetSubmissions200Response struct for ModWorkshopGetSubmissions200Response
type ModWorkshopGetSubmissions200Response struct {
	Submissions []ModWorkshopGetSubmissions200ResponseSubmissionsInner `json:"submissions"`
	// Total count of submissions.
	Totalcount int32 `json:"totalcount"`
	// Total size (bytes) of the files attached to all the                     submissions (even the ones not returned due to pagination).
	Totalfilesize int32 `json:"totalfilesize"`
	Warnings []AuthEmailSignupUser200ResponseWarningsInner `json:"warnings,omitempty"`
}

type _ModWorkshopGetSubmissions200Response ModWorkshopGetSubmissions200Response

// NewModWorkshopGetSubmissions200Response instantiates a new ModWorkshopGetSubmissions200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModWorkshopGetSubmissions200Response(submissions []ModWorkshopGetSubmissions200ResponseSubmissionsInner, totalcount int32, totalfilesize int32) *ModWorkshopGetSubmissions200Response {
	this := ModWorkshopGetSubmissions200Response{}
	this.Submissions = submissions
	this.Totalcount = totalcount
	this.Totalfilesize = totalfilesize
	return &this
}

// NewModWorkshopGetSubmissions200ResponseWithDefaults instantiates a new ModWorkshopGetSubmissions200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModWorkshopGetSubmissions200ResponseWithDefaults() *ModWorkshopGetSubmissions200Response {
	this := ModWorkshopGetSubmissions200Response{}
	var totalcount int32 = null
	this.Totalcount = totalcount
	var totalfilesize int32 = null
	this.Totalfilesize = totalfilesize
	return &this
}

// GetSubmissions returns the Submissions field value
func (o *ModWorkshopGetSubmissions200Response) GetSubmissions() []ModWorkshopGetSubmissions200ResponseSubmissionsInner {
	if o == nil {
		var ret []ModWorkshopGetSubmissions200ResponseSubmissionsInner
		return ret
	}

	return o.Submissions
}

// GetSubmissionsOk returns a tuple with the Submissions field value
// and a boolean to check if the value has been set.
func (o *ModWorkshopGetSubmissions200Response) GetSubmissionsOk() ([]ModWorkshopGetSubmissions200ResponseSubmissionsInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Submissions, true
}

// SetSubmissions sets field value
func (o *ModWorkshopGetSubmissions200Response) SetSubmissions(v []ModWorkshopGetSubmissions200ResponseSubmissionsInner) {
	o.Submissions = v
}

// GetTotalcount returns the Totalcount field value
func (o *ModWorkshopGetSubmissions200Response) GetTotalcount() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Totalcount
}

// GetTotalcountOk returns a tuple with the Totalcount field value
// and a boolean to check if the value has been set.
func (o *ModWorkshopGetSubmissions200Response) GetTotalcountOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Totalcount, true
}

// SetTotalcount sets field value
func (o *ModWorkshopGetSubmissions200Response) SetTotalcount(v int32) {
	o.Totalcount = v
}

// GetTotalfilesize returns the Totalfilesize field value
func (o *ModWorkshopGetSubmissions200Response) GetTotalfilesize() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Totalfilesize
}

// GetTotalfilesizeOk returns a tuple with the Totalfilesize field value
// and a boolean to check if the value has been set.
func (o *ModWorkshopGetSubmissions200Response) GetTotalfilesizeOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Totalfilesize, true
}

// SetTotalfilesize sets field value
func (o *ModWorkshopGetSubmissions200Response) SetTotalfilesize(v int32) {
	o.Totalfilesize = v
}

// GetWarnings returns the Warnings field value if set, zero value otherwise.
func (o *ModWorkshopGetSubmissions200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner {
	if o == nil || IsNil(o.Warnings) {
		var ret []AuthEmailSignupUser200ResponseWarningsInner
		return ret
	}
	return o.Warnings
}

// GetWarningsOk returns a tuple with the Warnings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModWorkshopGetSubmissions200Response) GetWarningsOk() ([]AuthEmailSignupUser200ResponseWarningsInner, bool) {
	if o == nil || IsNil(o.Warnings) {
		return nil, false
	}
	return o.Warnings, true
}

// HasWarnings returns a boolean if a field has been set.
func (o *ModWorkshopGetSubmissions200Response) HasWarnings() bool {
	if o != nil && !IsNil(o.Warnings) {
		return true
	}

	return false
}

// SetWarnings gets a reference to the given []AuthEmailSignupUser200ResponseWarningsInner and assigns it to the Warnings field.
func (o *ModWorkshopGetSubmissions200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner) {
	o.Warnings = v
}

func (o ModWorkshopGetSubmissions200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModWorkshopGetSubmissions200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["submissions"] = o.Submissions
	toSerialize["totalcount"] = o.Totalcount
	toSerialize["totalfilesize"] = o.Totalfilesize
	if !IsNil(o.Warnings) {
		toSerialize["warnings"] = o.Warnings
	}
	return toSerialize, nil
}

func (o *ModWorkshopGetSubmissions200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"submissions",
		"totalcount",
		"totalfilesize",
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

	varModWorkshopGetSubmissions200Response := _ModWorkshopGetSubmissions200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModWorkshopGetSubmissions200Response)

	if err != nil {
		return err
	}

	*o = ModWorkshopGetSubmissions200Response(varModWorkshopGetSubmissions200Response)

	return err
}

type NullableModWorkshopGetSubmissions200Response struct {
	value *ModWorkshopGetSubmissions200Response
	isSet bool
}

func (v NullableModWorkshopGetSubmissions200Response) Get() *ModWorkshopGetSubmissions200Response {
	return v.value
}

func (v *NullableModWorkshopGetSubmissions200Response) Set(val *ModWorkshopGetSubmissions200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableModWorkshopGetSubmissions200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableModWorkshopGetSubmissions200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModWorkshopGetSubmissions200Response(val *ModWorkshopGetSubmissions200Response) *NullableModWorkshopGetSubmissions200Response {
	return &NullableModWorkshopGetSubmissions200Response{value: val, isSet: true}
}

func (v NullableModWorkshopGetSubmissions200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModWorkshopGetSubmissions200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

