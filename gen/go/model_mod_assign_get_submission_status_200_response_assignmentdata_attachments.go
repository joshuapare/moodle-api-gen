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

// checks if the ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments{}

// ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments struct for ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments
type ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments struct {
	Activity []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner `json:"activity,omitempty"`
	Intro []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner `json:"intro,omitempty"`
}

// NewModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments instantiates a new ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments() *ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments {
	this := ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments{}
	return &this
}

// NewModAssignGetSubmissionStatus200ResponseAssignmentdataAttachmentsWithDefaults instantiates a new ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModAssignGetSubmissionStatus200ResponseAssignmentdataAttachmentsWithDefaults() *ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments {
	this := ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments{}
	return &this
}

// GetActivity returns the Activity field value if set, zero value otherwise.
func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments) GetActivity() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner {
	if o == nil || IsNil(o.Activity) {
		var ret []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner
		return ret
	}
	return o.Activity
}

// GetActivityOk returns a tuple with the Activity field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments) GetActivityOk() ([]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool) {
	if o == nil || IsNil(o.Activity) {
		return nil, false
	}
	return o.Activity, true
}

// HasActivity returns a boolean if a field has been set.
func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments) HasActivity() bool {
	if o != nil && !IsNil(o.Activity) {
		return true
	}

	return false
}

// SetActivity gets a reference to the given []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner and assigns it to the Activity field.
func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments) SetActivity(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner) {
	o.Activity = v
}

// GetIntro returns the Intro field value if set, zero value otherwise.
func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments) GetIntro() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner {
	if o == nil || IsNil(o.Intro) {
		var ret []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner
		return ret
	}
	return o.Intro
}

// GetIntroOk returns a tuple with the Intro field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments) GetIntroOk() ([]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool) {
	if o == nil || IsNil(o.Intro) {
		return nil, false
	}
	return o.Intro, true
}

// HasIntro returns a boolean if a field has been set.
func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments) HasIntro() bool {
	if o != nil && !IsNil(o.Intro) {
		return true
	}

	return false
}

// SetIntro gets a reference to the given []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner and assigns it to the Intro field.
func (o *ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments) SetIntro(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner) {
	o.Intro = v
}

func (o ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Activity) {
		toSerialize["activity"] = o.Activity
	}
	if !IsNil(o.Intro) {
		toSerialize["intro"] = o.Intro
	}
	return toSerialize, nil
}

type NullableModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments struct {
	value *ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments
	isSet bool
}

func (v NullableModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments) Get() *ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments {
	return v.value
}

func (v *NullableModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments) Set(val *ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments) {
	v.value = val
	v.isSet = true
}

func (v NullableModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments) IsSet() bool {
	return v.isSet
}

func (v *NullableModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments(val *ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments) *NullableModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments {
	return &NullableModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments{value: val, isSet: true}
}

func (v NullableModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


