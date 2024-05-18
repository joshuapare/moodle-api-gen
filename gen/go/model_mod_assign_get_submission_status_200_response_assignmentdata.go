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

// checks if the ModAssignGetSubmissionStatus200ResponseAssignmentdata type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModAssignGetSubmissionStatus200ResponseAssignmentdata{}

// ModAssignGetSubmissionStatus200ResponseAssignmentdata struct for ModAssignGetSubmissionStatus200ResponseAssignmentdata
type ModAssignGetSubmissionStatus200ResponseAssignmentdata struct {
	// Text of activity
	Activity *string `json:"activity,omitempty"`
	// activity format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
	Activityformat *int32 `json:"activityformat,omitempty"`
	Attachments *ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments `json:"attachments,omitempty"`
}

// NewModAssignGetSubmissionStatus200ResponseAssignmentdata instantiates a new ModAssignGetSubmissionStatus200ResponseAssignmentdata object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModAssignGetSubmissionStatus200ResponseAssignmentdata() *ModAssignGetSubmissionStatus200ResponseAssignmentdata {
	this := ModAssignGetSubmissionStatus200ResponseAssignmentdata{}
	var activity string = "null"
	this.Activity = &activity
	return &this
}

// NewModAssignGetSubmissionStatus200ResponseAssignmentdataWithDefaults instantiates a new ModAssignGetSubmissionStatus200ResponseAssignmentdata object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModAssignGetSubmissionStatus200ResponseAssignmentdataWithDefaults() *ModAssignGetSubmissionStatus200ResponseAssignmentdata {
	this := ModAssignGetSubmissionStatus200ResponseAssignmentdata{}
	var activity string = "null"
	this.Activity = &activity
	return &this
}

// GetActivity returns the Activity field value if set, zero value otherwise.
func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdata) GetActivity() string {
	if o == nil || IsNil(o.Activity) {
		var ret string
		return ret
	}
	return *o.Activity
}

// GetActivityOk returns a tuple with the Activity field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdata) GetActivityOk() (*string, bool) {
	if o == nil || IsNil(o.Activity) {
		return nil, false
	}
	return o.Activity, true
}

// HasActivity returns a boolean if a field has been set.
func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdata) HasActivity() bool {
	if o != nil && !IsNil(o.Activity) {
		return true
	}

	return false
}

// SetActivity gets a reference to the given string and assigns it to the Activity field.
func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdata) SetActivity(v string) {
	o.Activity = &v
}

// GetActivityformat returns the Activityformat field value if set, zero value otherwise.
func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdata) GetActivityformat() int32 {
	if o == nil || IsNil(o.Activityformat) {
		var ret int32
		return ret
	}
	return *o.Activityformat
}

// GetActivityformatOk returns a tuple with the Activityformat field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdata) GetActivityformatOk() (*int32, bool) {
	if o == nil || IsNil(o.Activityformat) {
		return nil, false
	}
	return o.Activityformat, true
}

// HasActivityformat returns a boolean if a field has been set.
func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdata) HasActivityformat() bool {
	if o != nil && !IsNil(o.Activityformat) {
		return true
	}

	return false
}

// SetActivityformat gets a reference to the given int32 and assigns it to the Activityformat field.
func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdata) SetActivityformat(v int32) {
	o.Activityformat = &v
}

// GetAttachments returns the Attachments field value if set, zero value otherwise.
func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdata) GetAttachments() ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments {
	if o == nil || IsNil(o.Attachments) {
		var ret ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments
		return ret
	}
	return *o.Attachments
}

// GetAttachmentsOk returns a tuple with the Attachments field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdata) GetAttachmentsOk() (*ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments, bool) {
	if o == nil || IsNil(o.Attachments) {
		return nil, false
	}
	return o.Attachments, true
}

// HasAttachments returns a boolean if a field has been set.
func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdata) HasAttachments() bool {
	if o != nil && !IsNil(o.Attachments) {
		return true
	}

	return false
}

// SetAttachments gets a reference to the given ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments and assigns it to the Attachments field.
func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdata) SetAttachments(v ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments) {
	o.Attachments = &v
}

func (o ModAssignGetSubmissionStatus200ResponseAssignmentdata) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModAssignGetSubmissionStatus200ResponseAssignmentdata) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Activity) {
		toSerialize["activity"] = o.Activity
	}
	if !IsNil(o.Activityformat) {
		toSerialize["activityformat"] = o.Activityformat
	}
	if !IsNil(o.Attachments) {
		toSerialize["attachments"] = o.Attachments
	}
	return toSerialize, nil
}

type NullableModAssignGetSubmissionStatus200ResponseAssignmentdata struct {
	value *ModAssignGetSubmissionStatus200ResponseAssignmentdata
	isSet bool
}

func (v NullableModAssignGetSubmissionStatus200ResponseAssignmentdata) Get() *ModAssignGetSubmissionStatus200ResponseAssignmentdata {
	return v.value
}

func (v *NullableModAssignGetSubmissionStatus200ResponseAssignmentdata) Set(val *ModAssignGetSubmissionStatus200ResponseAssignmentdata) {
	v.value = val
	v.isSet = true
}

func (v NullableModAssignGetSubmissionStatus200ResponseAssignmentdata) IsSet() bool {
	return v.isSet
}

func (v *NullableModAssignGetSubmissionStatus200ResponseAssignmentdata) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModAssignGetSubmissionStatus200ResponseAssignmentdata(val *ModAssignGetSubmissionStatus200ResponseAssignmentdata) *NullableModAssignGetSubmissionStatus200ResponseAssignmentdata {
	return &NullableModAssignGetSubmissionStatus200ResponseAssignmentdata{value: val, isSet: true}
}

func (v NullableModAssignGetSubmissionStatus200ResponseAssignmentdata) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModAssignGetSubmissionStatus200ResponseAssignmentdata) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

