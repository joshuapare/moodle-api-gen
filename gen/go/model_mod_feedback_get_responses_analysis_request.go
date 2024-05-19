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

// checks if the ModFeedbackGetResponsesAnalysisRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModFeedbackGetResponsesAnalysisRequest{}

// ModFeedbackGetResponsesAnalysisRequest struct for ModFeedbackGetResponsesAnalysisRequest
type ModFeedbackGetResponsesAnalysisRequest struct {
	// Course where user completes the feedback (for site feedbacks only).
	Courseid *int32 `json:"courseid,omitempty"`
	// Feedback instance id
	Feedbackid int32 `json:"feedbackid"`
	// Group id, 0 means that the function will determine the user group
	Groupid *int32 `json:"groupid,omitempty"`
	// The page of records to return.
	Page *int32 `json:"page,omitempty"`
	// The number of records to return per page
	Perpage *int32 `json:"perpage,omitempty"`
}

type _ModFeedbackGetResponsesAnalysisRequest ModFeedbackGetResponsesAnalysisRequest

// NewModFeedbackGetResponsesAnalysisRequest instantiates a new ModFeedbackGetResponsesAnalysisRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModFeedbackGetResponsesAnalysisRequest(feedbackid int32) *ModFeedbackGetResponsesAnalysisRequest {
	this := ModFeedbackGetResponsesAnalysisRequest{}
	var courseid int32 = 0
	this.Courseid = &courseid
	this.Feedbackid = feedbackid
	var groupid int32 = 0
	this.Groupid = &groupid
	var page int32 = 0
	this.Page = &page
	var perpage int32 = 0
	this.Perpage = &perpage
	return &this
}

// NewModFeedbackGetResponsesAnalysisRequestWithDefaults instantiates a new ModFeedbackGetResponsesAnalysisRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModFeedbackGetResponsesAnalysisRequestWithDefaults() *ModFeedbackGetResponsesAnalysisRequest {
	this := ModFeedbackGetResponsesAnalysisRequest{}
	var courseid int32 = 0
	this.Courseid = &courseid
	var groupid int32 = 0
	this.Groupid = &groupid
	var page int32 = 0
	this.Page = &page
	var perpage int32 = 0
	this.Perpage = &perpage
	return &this
}

// GetCourseid returns the Courseid field value if set, zero value otherwise.
func (o *ModFeedbackGetResponsesAnalysisRequest) GetCourseid() int32 {
	if o == nil || IsNil(o.Courseid) {
		var ret int32
		return ret
	}
	return *o.Courseid
}

// GetCourseidOk returns a tuple with the Courseid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModFeedbackGetResponsesAnalysisRequest) GetCourseidOk() (*int32, bool) {
	if o == nil || IsNil(o.Courseid) {
		return nil, false
	}
	return o.Courseid, true
}

// HasCourseid returns a boolean if a field has been set.
func (o *ModFeedbackGetResponsesAnalysisRequest) HasCourseid() bool {
	if o != nil && !IsNil(o.Courseid) {
		return true
	}

	return false
}

// SetCourseid gets a reference to the given int32 and assigns it to the Courseid field.
func (o *ModFeedbackGetResponsesAnalysisRequest) SetCourseid(v int32) {
	o.Courseid = &v
}

// GetFeedbackid returns the Feedbackid field value
func (o *ModFeedbackGetResponsesAnalysisRequest) GetFeedbackid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Feedbackid
}

// GetFeedbackidOk returns a tuple with the Feedbackid field value
// and a boolean to check if the value has been set.
func (o *ModFeedbackGetResponsesAnalysisRequest) GetFeedbackidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Feedbackid, true
}

// SetFeedbackid sets field value
func (o *ModFeedbackGetResponsesAnalysisRequest) SetFeedbackid(v int32) {
	o.Feedbackid = v
}

// GetGroupid returns the Groupid field value if set, zero value otherwise.
func (o *ModFeedbackGetResponsesAnalysisRequest) GetGroupid() int32 {
	if o == nil || IsNil(o.Groupid) {
		var ret int32
		return ret
	}
	return *o.Groupid
}

// GetGroupidOk returns a tuple with the Groupid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModFeedbackGetResponsesAnalysisRequest) GetGroupidOk() (*int32, bool) {
	if o == nil || IsNil(o.Groupid) {
		return nil, false
	}
	return o.Groupid, true
}

// HasGroupid returns a boolean if a field has been set.
func (o *ModFeedbackGetResponsesAnalysisRequest) HasGroupid() bool {
	if o != nil && !IsNil(o.Groupid) {
		return true
	}

	return false
}

// SetGroupid gets a reference to the given int32 and assigns it to the Groupid field.
func (o *ModFeedbackGetResponsesAnalysisRequest) SetGroupid(v int32) {
	o.Groupid = &v
}

// GetPage returns the Page field value if set, zero value otherwise.
func (o *ModFeedbackGetResponsesAnalysisRequest) GetPage() int32 {
	if o == nil || IsNil(o.Page) {
		var ret int32
		return ret
	}
	return *o.Page
}

// GetPageOk returns a tuple with the Page field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModFeedbackGetResponsesAnalysisRequest) GetPageOk() (*int32, bool) {
	if o == nil || IsNil(o.Page) {
		return nil, false
	}
	return o.Page, true
}

// HasPage returns a boolean if a field has been set.
func (o *ModFeedbackGetResponsesAnalysisRequest) HasPage() bool {
	if o != nil && !IsNil(o.Page) {
		return true
	}

	return false
}

// SetPage gets a reference to the given int32 and assigns it to the Page field.
func (o *ModFeedbackGetResponsesAnalysisRequest) SetPage(v int32) {
	o.Page = &v
}

// GetPerpage returns the Perpage field value if set, zero value otherwise.
func (o *ModFeedbackGetResponsesAnalysisRequest) GetPerpage() int32 {
	if o == nil || IsNil(o.Perpage) {
		var ret int32
		return ret
	}
	return *o.Perpage
}

// GetPerpageOk returns a tuple with the Perpage field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModFeedbackGetResponsesAnalysisRequest) GetPerpageOk() (*int32, bool) {
	if o == nil || IsNil(o.Perpage) {
		return nil, false
	}
	return o.Perpage, true
}

// HasPerpage returns a boolean if a field has been set.
func (o *ModFeedbackGetResponsesAnalysisRequest) HasPerpage() bool {
	if o != nil && !IsNil(o.Perpage) {
		return true
	}

	return false
}

// SetPerpage gets a reference to the given int32 and assigns it to the Perpage field.
func (o *ModFeedbackGetResponsesAnalysisRequest) SetPerpage(v int32) {
	o.Perpage = &v
}

func (o ModFeedbackGetResponsesAnalysisRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModFeedbackGetResponsesAnalysisRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Courseid) {
		toSerialize["courseid"] = o.Courseid
	}
	toSerialize["feedbackid"] = o.Feedbackid
	if !IsNil(o.Groupid) {
		toSerialize["groupid"] = o.Groupid
	}
	if !IsNil(o.Page) {
		toSerialize["page"] = o.Page
	}
	if !IsNil(o.Perpage) {
		toSerialize["perpage"] = o.Perpage
	}
	return toSerialize, nil
}

func (o *ModFeedbackGetResponsesAnalysisRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"feedbackid",
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

	varModFeedbackGetResponsesAnalysisRequest := _ModFeedbackGetResponsesAnalysisRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModFeedbackGetResponsesAnalysisRequest)

	if err != nil {
		return err
	}

	*o = ModFeedbackGetResponsesAnalysisRequest(varModFeedbackGetResponsesAnalysisRequest)

	return err
}

type NullableModFeedbackGetResponsesAnalysisRequest struct {
	value *ModFeedbackGetResponsesAnalysisRequest
	isSet bool
}

func (v NullableModFeedbackGetResponsesAnalysisRequest) Get() *ModFeedbackGetResponsesAnalysisRequest {
	return v.value
}

func (v *NullableModFeedbackGetResponsesAnalysisRequest) Set(val *ModFeedbackGetResponsesAnalysisRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableModFeedbackGetResponsesAnalysisRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableModFeedbackGetResponsesAnalysisRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModFeedbackGetResponsesAnalysisRequest(val *ModFeedbackGetResponsesAnalysisRequest) *NullableModFeedbackGetResponsesAnalysisRequest {
	return &NullableModFeedbackGetResponsesAnalysisRequest{value: val, isSet: true}
}

func (v NullableModFeedbackGetResponsesAnalysisRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModFeedbackGetResponsesAnalysisRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


