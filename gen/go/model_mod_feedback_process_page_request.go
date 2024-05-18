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

// checks if the ModFeedbackProcessPageRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModFeedbackProcessPageRequest{}

// ModFeedbackProcessPageRequest struct for ModFeedbackProcessPageRequest
type ModFeedbackProcessPageRequest struct {
	// Course where user completes the feedback (for site feedbacks only).
	Courseid *int32 `json:"courseid,omitempty"`
	// Feedback instance id.
	Feedbackid int32 `json:"feedbackid"`
	// Whether we want to jump to previous page.
	Goprevious *bool `json:"goprevious,omitempty"`
	// The page being processed.
	Page int32 `json:"page"`
	Responses []ModFeedbackProcessPageRequestResponsesInner `json:"responses,omitempty"`
}

type _ModFeedbackProcessPageRequest ModFeedbackProcessPageRequest

// NewModFeedbackProcessPageRequest instantiates a new ModFeedbackProcessPageRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModFeedbackProcessPageRequest(feedbackid int32, page int32) *ModFeedbackProcessPageRequest {
	this := ModFeedbackProcessPageRequest{}
	var courseid int32 = 0
	this.Courseid = &courseid
	this.Feedbackid = feedbackid
	var goprevious bool = false
	this.Goprevious = &goprevious
	this.Page = page
	return &this
}

// NewModFeedbackProcessPageRequestWithDefaults instantiates a new ModFeedbackProcessPageRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModFeedbackProcessPageRequestWithDefaults() *ModFeedbackProcessPageRequest {
	this := ModFeedbackProcessPageRequest{}
	var courseid int32 = 0
	this.Courseid = &courseid
	var goprevious bool = false
	this.Goprevious = &goprevious
	var page int32 = null
	this.Page = page
	return &this
}

// GetCourseid returns the Courseid field value if set, zero value otherwise.
func (o *ModFeedbackProcessPageRequest) GetCourseid() int32 {
	if o == nil || IsNil(o.Courseid) {
		var ret int32
		return ret
	}
	return *o.Courseid
}

// GetCourseidOk returns a tuple with the Courseid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModFeedbackProcessPageRequest) GetCourseidOk() (*int32, bool) {
	if o == nil || IsNil(o.Courseid) {
		return nil, false
	}
	return o.Courseid, true
}

// HasCourseid returns a boolean if a field has been set.
func (o *ModFeedbackProcessPageRequest) HasCourseid() bool {
	if o != nil && !IsNil(o.Courseid) {
		return true
	}

	return false
}

// SetCourseid gets a reference to the given int32 and assigns it to the Courseid field.
func (o *ModFeedbackProcessPageRequest) SetCourseid(v int32) {
	o.Courseid = &v
}

// GetFeedbackid returns the Feedbackid field value
func (o *ModFeedbackProcessPageRequest) GetFeedbackid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Feedbackid
}

// GetFeedbackidOk returns a tuple with the Feedbackid field value
// and a boolean to check if the value has been set.
func (o *ModFeedbackProcessPageRequest) GetFeedbackidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Feedbackid, true
}

// SetFeedbackid sets field value
func (o *ModFeedbackProcessPageRequest) SetFeedbackid(v int32) {
	o.Feedbackid = v
}

// GetGoprevious returns the Goprevious field value if set, zero value otherwise.
func (o *ModFeedbackProcessPageRequest) GetGoprevious() bool {
	if o == nil || IsNil(o.Goprevious) {
		var ret bool
		return ret
	}
	return *o.Goprevious
}

// GetGopreviousOk returns a tuple with the Goprevious field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModFeedbackProcessPageRequest) GetGopreviousOk() (*bool, bool) {
	if o == nil || IsNil(o.Goprevious) {
		return nil, false
	}
	return o.Goprevious, true
}

// HasGoprevious returns a boolean if a field has been set.
func (o *ModFeedbackProcessPageRequest) HasGoprevious() bool {
	if o != nil && !IsNil(o.Goprevious) {
		return true
	}

	return false
}

// SetGoprevious gets a reference to the given bool and assigns it to the Goprevious field.
func (o *ModFeedbackProcessPageRequest) SetGoprevious(v bool) {
	o.Goprevious = &v
}

// GetPage returns the Page field value
func (o *ModFeedbackProcessPageRequest) GetPage() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Page
}

// GetPageOk returns a tuple with the Page field value
// and a boolean to check if the value has been set.
func (o *ModFeedbackProcessPageRequest) GetPageOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Page, true
}

// SetPage sets field value
func (o *ModFeedbackProcessPageRequest) SetPage(v int32) {
	o.Page = v
}

// GetResponses returns the Responses field value if set, zero value otherwise.
func (o *ModFeedbackProcessPageRequest) GetResponses() []ModFeedbackProcessPageRequestResponsesInner {
	if o == nil || IsNil(o.Responses) {
		var ret []ModFeedbackProcessPageRequestResponsesInner
		return ret
	}
	return o.Responses
}

// GetResponsesOk returns a tuple with the Responses field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModFeedbackProcessPageRequest) GetResponsesOk() ([]ModFeedbackProcessPageRequestResponsesInner, bool) {
	if o == nil || IsNil(o.Responses) {
		return nil, false
	}
	return o.Responses, true
}

// HasResponses returns a boolean if a field has been set.
func (o *ModFeedbackProcessPageRequest) HasResponses() bool {
	if o != nil && !IsNil(o.Responses) {
		return true
	}

	return false
}

// SetResponses gets a reference to the given []ModFeedbackProcessPageRequestResponsesInner and assigns it to the Responses field.
func (o *ModFeedbackProcessPageRequest) SetResponses(v []ModFeedbackProcessPageRequestResponsesInner) {
	o.Responses = v
}

func (o ModFeedbackProcessPageRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModFeedbackProcessPageRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Courseid) {
		toSerialize["courseid"] = o.Courseid
	}
	toSerialize["feedbackid"] = o.Feedbackid
	if !IsNil(o.Goprevious) {
		toSerialize["goprevious"] = o.Goprevious
	}
	toSerialize["page"] = o.Page
	if !IsNil(o.Responses) {
		toSerialize["responses"] = o.Responses
	}
	return toSerialize, nil
}

func (o *ModFeedbackProcessPageRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"feedbackid",
		"page",
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

	varModFeedbackProcessPageRequest := _ModFeedbackProcessPageRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModFeedbackProcessPageRequest)

	if err != nil {
		return err
	}

	*o = ModFeedbackProcessPageRequest(varModFeedbackProcessPageRequest)

	return err
}

type NullableModFeedbackProcessPageRequest struct {
	value *ModFeedbackProcessPageRequest
	isSet bool
}

func (v NullableModFeedbackProcessPageRequest) Get() *ModFeedbackProcessPageRequest {
	return v.value
}

func (v *NullableModFeedbackProcessPageRequest) Set(val *ModFeedbackProcessPageRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableModFeedbackProcessPageRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableModFeedbackProcessPageRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModFeedbackProcessPageRequest(val *ModFeedbackProcessPageRequest) *NullableModFeedbackProcessPageRequest {
	return &NullableModFeedbackProcessPageRequest{value: val, isSet: true}
}

func (v NullableModFeedbackProcessPageRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModFeedbackProcessPageRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

