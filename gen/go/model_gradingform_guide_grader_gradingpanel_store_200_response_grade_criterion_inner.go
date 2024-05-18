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

// checks if the GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner{}

// GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner struct for GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner
type GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner struct {
	// The description of the criterion
	Description *string `json:"description,omitempty"`
	// The description of the criterion for markers
	Descriptionmarkers *string `json:"descriptionmarkers,omitempty"`
	// The id of the criterion
	Id *int32 `json:"id,omitempty"`
	// The maximum score for this criterion
	Maxscore *float32 `json:"maxscore,omitempty"`
	// The name of the criterion
	Name *string `json:"name,omitempty"`
	// Any remarks for this criterion for the user being assessed
	Remark *string `json:"remark,omitempty"`
	// The current score for user being assessed
	Score *float32 `json:"score,omitempty"`
}

// NewGradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner instantiates a new GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner() *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner {
	this := GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner{}
	return &this
}

// NewGradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInnerWithDefaults instantiates a new GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInnerWithDefaults() *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner {
	this := GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner{}
	return &this
}

// GetDescription returns the Description field value if set, zero value otherwise.
func (o *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) GetDescription() string {
	if o == nil || IsNil(o.Description) {
		var ret string
		return ret
	}
	return *o.Description
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) GetDescriptionOk() (*string, bool) {
	if o == nil || IsNil(o.Description) {
		return nil, false
	}
	return o.Description, true
}

// HasDescription returns a boolean if a field has been set.
func (o *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) HasDescription() bool {
	if o != nil && !IsNil(o.Description) {
		return true
	}

	return false
}

// SetDescription gets a reference to the given string and assigns it to the Description field.
func (o *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) SetDescription(v string) {
	o.Description = &v
}

// GetDescriptionmarkers returns the Descriptionmarkers field value if set, zero value otherwise.
func (o *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) GetDescriptionmarkers() string {
	if o == nil || IsNil(o.Descriptionmarkers) {
		var ret string
		return ret
	}
	return *o.Descriptionmarkers
}

// GetDescriptionmarkersOk returns a tuple with the Descriptionmarkers field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) GetDescriptionmarkersOk() (*string, bool) {
	if o == nil || IsNil(o.Descriptionmarkers) {
		return nil, false
	}
	return o.Descriptionmarkers, true
}

// HasDescriptionmarkers returns a boolean if a field has been set.
func (o *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) HasDescriptionmarkers() bool {
	if o != nil && !IsNil(o.Descriptionmarkers) {
		return true
	}

	return false
}

// SetDescriptionmarkers gets a reference to the given string and assigns it to the Descriptionmarkers field.
func (o *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) SetDescriptionmarkers(v string) {
	o.Descriptionmarkers = &v
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) GetId() int32 {
	if o == nil || IsNil(o.Id) {
		var ret int32
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) GetIdOk() (*int32, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given int32 and assigns it to the Id field.
func (o *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) SetId(v int32) {
	o.Id = &v
}

// GetMaxscore returns the Maxscore field value if set, zero value otherwise.
func (o *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) GetMaxscore() float32 {
	if o == nil || IsNil(o.Maxscore) {
		var ret float32
		return ret
	}
	return *o.Maxscore
}

// GetMaxscoreOk returns a tuple with the Maxscore field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) GetMaxscoreOk() (*float32, bool) {
	if o == nil || IsNil(o.Maxscore) {
		return nil, false
	}
	return o.Maxscore, true
}

// HasMaxscore returns a boolean if a field has been set.
func (o *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) HasMaxscore() bool {
	if o != nil && !IsNil(o.Maxscore) {
		return true
	}

	return false
}

// SetMaxscore gets a reference to the given float32 and assigns it to the Maxscore field.
func (o *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) SetMaxscore(v float32) {
	o.Maxscore = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) SetName(v string) {
	o.Name = &v
}

// GetRemark returns the Remark field value if set, zero value otherwise.
func (o *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) GetRemark() string {
	if o == nil || IsNil(o.Remark) {
		var ret string
		return ret
	}
	return *o.Remark
}

// GetRemarkOk returns a tuple with the Remark field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) GetRemarkOk() (*string, bool) {
	if o == nil || IsNil(o.Remark) {
		return nil, false
	}
	return o.Remark, true
}

// HasRemark returns a boolean if a field has been set.
func (o *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) HasRemark() bool {
	if o != nil && !IsNil(o.Remark) {
		return true
	}

	return false
}

// SetRemark gets a reference to the given string and assigns it to the Remark field.
func (o *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) SetRemark(v string) {
	o.Remark = &v
}

// GetScore returns the Score field value if set, zero value otherwise.
func (o *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) GetScore() float32 {
	if o == nil || IsNil(o.Score) {
		var ret float32
		return ret
	}
	return *o.Score
}

// GetScoreOk returns a tuple with the Score field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) GetScoreOk() (*float32, bool) {
	if o == nil || IsNil(o.Score) {
		return nil, false
	}
	return o.Score, true
}

// HasScore returns a boolean if a field has been set.
func (o *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) HasScore() bool {
	if o != nil && !IsNil(o.Score) {
		return true
	}

	return false
}

// SetScore gets a reference to the given float32 and assigns it to the Score field.
func (o *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) SetScore(v float32) {
	o.Score = &v
}

func (o GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Description) {
		toSerialize["description"] = o.Description
	}
	if !IsNil(o.Descriptionmarkers) {
		toSerialize["descriptionmarkers"] = o.Descriptionmarkers
	}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.Maxscore) {
		toSerialize["maxscore"] = o.Maxscore
	}
	if !IsNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !IsNil(o.Remark) {
		toSerialize["remark"] = o.Remark
	}
	if !IsNil(o.Score) {
		toSerialize["score"] = o.Score
	}
	return toSerialize, nil
}

type NullableGradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner struct {
	value *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner
	isSet bool
}

func (v NullableGradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) Get() *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner {
	return v.value
}

func (v *NullableGradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) Set(val *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) {
	v.value = val
	v.isSet = true
}

func (v NullableGradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) IsSet() bool {
	return v.isSet
}

func (v *NullableGradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner(val *GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) *NullableGradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner {
	return &NullableGradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner{value: val, isSet: true}
}

func (v NullableGradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


