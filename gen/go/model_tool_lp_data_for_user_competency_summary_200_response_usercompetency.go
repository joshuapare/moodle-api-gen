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

// checks if the ToolLpDataForUserCompetencySummary200ResponseUsercompetency type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ToolLpDataForUserCompetencySummary200ResponseUsercompetency{}

// ToolLpDataForUserCompetencySummary200ResponseUsercompetency struct for ToolLpDataForUserCompetencySummary200ResponseUsercompetency
type ToolLpDataForUserCompetencySummary200ResponseUsercompetency struct {
	// canrequestreview
	Canrequestreview bool `json:"canrequestreview"`
	// canreview
	Canreview bool `json:"canreview"`
	// competencyid
	Competencyid int32 `json:"competencyid"`
	// grade
	Grade int32 `json:"grade"`
	// gradename
	Gradename string `json:"gradename"`
	// id
	Id int32 `json:"id"`
	// iscancelreviewrequestallowed
	Iscancelreviewrequestallowed bool `json:"iscancelreviewrequestallowed"`
	// isrequestreviewallowed
	Isrequestreviewallowed bool `json:"isrequestreviewallowed"`
	// isstartreviewallowed
	Isstartreviewallowed bool `json:"isstartreviewallowed"`
	// isstatusidle
	Isstatusidle bool `json:"isstatusidle"`
	// isstatusinreview
	Isstatusinreview bool `json:"isstatusinreview"`
	// isstatuswaitingforreview
	Isstatuswaitingforreview bool `json:"isstatuswaitingforreview"`
	// isstopreviewallowed
	Isstopreviewallowed bool `json:"isstopreviewallowed"`
	// proficiency
	Proficiency bool `json:"proficiency"`
	// proficiencyname
	Proficiencyname string `json:"proficiencyname"`
	Reviewer *CoreCompetencyGradeCompetency200ResponseActionuser `json:"reviewer,omitempty"`
	// reviewerid
	Reviewerid int32 `json:"reviewerid"`
	// status
	Status int32 `json:"status"`
	// statusname
	Statusname string `json:"statusname"`
	// timecreated
	Timecreated int32 `json:"timecreated"`
	// timemodified
	Timemodified int32 `json:"timemodified"`
	// url
	Url string `json:"url"`
	// userid
	Userid int32 `json:"userid"`
	// usermodified
	Usermodified int32 `json:"usermodified"`
}

type _ToolLpDataForUserCompetencySummary200ResponseUsercompetency ToolLpDataForUserCompetencySummary200ResponseUsercompetency

// NewToolLpDataForUserCompetencySummary200ResponseUsercompetency instantiates a new ToolLpDataForUserCompetencySummary200ResponseUsercompetency object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewToolLpDataForUserCompetencySummary200ResponseUsercompetency(canrequestreview bool, canreview bool, competencyid int32, grade int32, gradename string, id int32, iscancelreviewrequestallowed bool, isrequestreviewallowed bool, isstartreviewallowed bool, isstatusidle bool, isstatusinreview bool, isstatuswaitingforreview bool, isstopreviewallowed bool, proficiency bool, proficiencyname string, reviewerid int32, status int32, statusname string, timecreated int32, timemodified int32, url string, userid int32, usermodified int32) *ToolLpDataForUserCompetencySummary200ResponseUsercompetency {
	this := ToolLpDataForUserCompetencySummary200ResponseUsercompetency{}
	this.Canrequestreview = canrequestreview
	this.Canreview = canreview
	this.Competencyid = competencyid
	this.Grade = grade
	this.Gradename = gradename
	this.Id = id
	this.Iscancelreviewrequestallowed = iscancelreviewrequestallowed
	this.Isrequestreviewallowed = isrequestreviewallowed
	this.Isstartreviewallowed = isstartreviewallowed
	this.Isstatusidle = isstatusidle
	this.Isstatusinreview = isstatusinreview
	this.Isstatuswaitingforreview = isstatuswaitingforreview
	this.Isstopreviewallowed = isstopreviewallowed
	this.Proficiency = proficiency
	this.Proficiencyname = proficiencyname
	this.Reviewerid = reviewerid
	this.Status = status
	this.Statusname = statusname
	this.Timecreated = timecreated
	this.Timemodified = timemodified
	this.Url = url
	this.Userid = userid
	this.Usermodified = usermodified
	return &this
}

// NewToolLpDataForUserCompetencySummary200ResponseUsercompetencyWithDefaults instantiates a new ToolLpDataForUserCompetencySummary200ResponseUsercompetency object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewToolLpDataForUserCompetencySummary200ResponseUsercompetencyWithDefaults() *ToolLpDataForUserCompetencySummary200ResponseUsercompetency {
	this := ToolLpDataForUserCompetencySummary200ResponseUsercompetency{}
	var id int32 = 0
	this.Id = id
	var status int32 = 0
	this.Status = status
	var timecreated int32 = 0
	this.Timecreated = timecreated
	var timemodified int32 = 0
	this.Timemodified = timemodified
	var usermodified int32 = 0
	this.Usermodified = usermodified
	return &this
}

// GetCanrequestreview returns the Canrequestreview field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetCanrequestreview() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Canrequestreview
}

// GetCanrequestreviewOk returns a tuple with the Canrequestreview field value
// and a boolean to check if the value has been set.
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetCanrequestreviewOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Canrequestreview, true
}

// SetCanrequestreview sets field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) SetCanrequestreview(v bool) {
	o.Canrequestreview = v
}

// GetCanreview returns the Canreview field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetCanreview() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Canreview
}

// GetCanreviewOk returns a tuple with the Canreview field value
// and a boolean to check if the value has been set.
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetCanreviewOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Canreview, true
}

// SetCanreview sets field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) SetCanreview(v bool) {
	o.Canreview = v
}

// GetCompetencyid returns the Competencyid field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetCompetencyid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Competencyid
}

// GetCompetencyidOk returns a tuple with the Competencyid field value
// and a boolean to check if the value has been set.
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetCompetencyidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Competencyid, true
}

// SetCompetencyid sets field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) SetCompetencyid(v int32) {
	o.Competencyid = v
}

// GetGrade returns the Grade field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetGrade() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Grade
}

// GetGradeOk returns a tuple with the Grade field value
// and a boolean to check if the value has been set.
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetGradeOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Grade, true
}

// SetGrade sets field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) SetGrade(v int32) {
	o.Grade = v
}

// GetGradename returns the Gradename field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetGradename() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Gradename
}

// GetGradenameOk returns a tuple with the Gradename field value
// and a boolean to check if the value has been set.
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetGradenameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Gradename, true
}

// SetGradename sets field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) SetGradename(v string) {
	o.Gradename = v
}

// GetId returns the Id field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetId() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetIdOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) SetId(v int32) {
	o.Id = v
}

// GetIscancelreviewrequestallowed returns the Iscancelreviewrequestallowed field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetIscancelreviewrequestallowed() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Iscancelreviewrequestallowed
}

// GetIscancelreviewrequestallowedOk returns a tuple with the Iscancelreviewrequestallowed field value
// and a boolean to check if the value has been set.
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetIscancelreviewrequestallowedOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Iscancelreviewrequestallowed, true
}

// SetIscancelreviewrequestallowed sets field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) SetIscancelreviewrequestallowed(v bool) {
	o.Iscancelreviewrequestallowed = v
}

// GetIsrequestreviewallowed returns the Isrequestreviewallowed field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetIsrequestreviewallowed() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Isrequestreviewallowed
}

// GetIsrequestreviewallowedOk returns a tuple with the Isrequestreviewallowed field value
// and a boolean to check if the value has been set.
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetIsrequestreviewallowedOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Isrequestreviewallowed, true
}

// SetIsrequestreviewallowed sets field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) SetIsrequestreviewallowed(v bool) {
	o.Isrequestreviewallowed = v
}

// GetIsstartreviewallowed returns the Isstartreviewallowed field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetIsstartreviewallowed() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Isstartreviewallowed
}

// GetIsstartreviewallowedOk returns a tuple with the Isstartreviewallowed field value
// and a boolean to check if the value has been set.
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetIsstartreviewallowedOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Isstartreviewallowed, true
}

// SetIsstartreviewallowed sets field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) SetIsstartreviewallowed(v bool) {
	o.Isstartreviewallowed = v
}

// GetIsstatusidle returns the Isstatusidle field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetIsstatusidle() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Isstatusidle
}

// GetIsstatusidleOk returns a tuple with the Isstatusidle field value
// and a boolean to check if the value has been set.
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetIsstatusidleOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Isstatusidle, true
}

// SetIsstatusidle sets field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) SetIsstatusidle(v bool) {
	o.Isstatusidle = v
}

// GetIsstatusinreview returns the Isstatusinreview field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetIsstatusinreview() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Isstatusinreview
}

// GetIsstatusinreviewOk returns a tuple with the Isstatusinreview field value
// and a boolean to check if the value has been set.
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetIsstatusinreviewOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Isstatusinreview, true
}

// SetIsstatusinreview sets field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) SetIsstatusinreview(v bool) {
	o.Isstatusinreview = v
}

// GetIsstatuswaitingforreview returns the Isstatuswaitingforreview field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetIsstatuswaitingforreview() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Isstatuswaitingforreview
}

// GetIsstatuswaitingforreviewOk returns a tuple with the Isstatuswaitingforreview field value
// and a boolean to check if the value has been set.
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetIsstatuswaitingforreviewOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Isstatuswaitingforreview, true
}

// SetIsstatuswaitingforreview sets field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) SetIsstatuswaitingforreview(v bool) {
	o.Isstatuswaitingforreview = v
}

// GetIsstopreviewallowed returns the Isstopreviewallowed field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetIsstopreviewallowed() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Isstopreviewallowed
}

// GetIsstopreviewallowedOk returns a tuple with the Isstopreviewallowed field value
// and a boolean to check if the value has been set.
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetIsstopreviewallowedOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Isstopreviewallowed, true
}

// SetIsstopreviewallowed sets field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) SetIsstopreviewallowed(v bool) {
	o.Isstopreviewallowed = v
}

// GetProficiency returns the Proficiency field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetProficiency() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Proficiency
}

// GetProficiencyOk returns a tuple with the Proficiency field value
// and a boolean to check if the value has been set.
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetProficiencyOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Proficiency, true
}

// SetProficiency sets field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) SetProficiency(v bool) {
	o.Proficiency = v
}

// GetProficiencyname returns the Proficiencyname field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetProficiencyname() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Proficiencyname
}

// GetProficiencynameOk returns a tuple with the Proficiencyname field value
// and a boolean to check if the value has been set.
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetProficiencynameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Proficiencyname, true
}

// SetProficiencyname sets field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) SetProficiencyname(v string) {
	o.Proficiencyname = v
}

// GetReviewer returns the Reviewer field value if set, zero value otherwise.
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetReviewer() CoreCompetencyGradeCompetency200ResponseActionuser {
	if o == nil || IsNil(o.Reviewer) {
		var ret CoreCompetencyGradeCompetency200ResponseActionuser
		return ret
	}
	return *o.Reviewer
}

// GetReviewerOk returns a tuple with the Reviewer field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetReviewerOk() (*CoreCompetencyGradeCompetency200ResponseActionuser, bool) {
	if o == nil || IsNil(o.Reviewer) {
		return nil, false
	}
	return o.Reviewer, true
}

// HasReviewer returns a boolean if a field has been set.
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) HasReviewer() bool {
	if o != nil && !IsNil(o.Reviewer) {
		return true
	}

	return false
}

// SetReviewer gets a reference to the given CoreCompetencyGradeCompetency200ResponseActionuser and assigns it to the Reviewer field.
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) SetReviewer(v CoreCompetencyGradeCompetency200ResponseActionuser) {
	o.Reviewer = &v
}

// GetReviewerid returns the Reviewerid field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetReviewerid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Reviewerid
}

// GetRevieweridOk returns a tuple with the Reviewerid field value
// and a boolean to check if the value has been set.
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetRevieweridOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Reviewerid, true
}

// SetReviewerid sets field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) SetReviewerid(v int32) {
	o.Reviewerid = v
}

// GetStatus returns the Status field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetStatus() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Status
}

// GetStatusOk returns a tuple with the Status field value
// and a boolean to check if the value has been set.
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetStatusOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Status, true
}

// SetStatus sets field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) SetStatus(v int32) {
	o.Status = v
}

// GetStatusname returns the Statusname field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetStatusname() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Statusname
}

// GetStatusnameOk returns a tuple with the Statusname field value
// and a boolean to check if the value has been set.
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetStatusnameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Statusname, true
}

// SetStatusname sets field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) SetStatusname(v string) {
	o.Statusname = v
}

// GetTimecreated returns the Timecreated field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetTimecreated() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Timecreated
}

// GetTimecreatedOk returns a tuple with the Timecreated field value
// and a boolean to check if the value has been set.
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetTimecreatedOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Timecreated, true
}

// SetTimecreated sets field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) SetTimecreated(v int32) {
	o.Timecreated = v
}

// GetTimemodified returns the Timemodified field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetTimemodified() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Timemodified
}

// GetTimemodifiedOk returns a tuple with the Timemodified field value
// and a boolean to check if the value has been set.
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetTimemodifiedOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Timemodified, true
}

// SetTimemodified sets field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) SetTimemodified(v int32) {
	o.Timemodified = v
}

// GetUrl returns the Url field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetUrl() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Url
}

// GetUrlOk returns a tuple with the Url field value
// and a boolean to check if the value has been set.
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetUrlOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Url, true
}

// SetUrl sets field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) SetUrl(v string) {
	o.Url = v
}

// GetUserid returns the Userid field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetUserid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Userid
}

// GetUseridOk returns a tuple with the Userid field value
// and a boolean to check if the value has been set.
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetUseridOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Userid, true
}

// SetUserid sets field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) SetUserid(v int32) {
	o.Userid = v
}

// GetUsermodified returns the Usermodified field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetUsermodified() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Usermodified
}

// GetUsermodifiedOk returns a tuple with the Usermodified field value
// and a boolean to check if the value has been set.
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) GetUsermodifiedOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Usermodified, true
}

// SetUsermodified sets field value
func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) SetUsermodified(v int32) {
	o.Usermodified = v
}

func (o ToolLpDataForUserCompetencySummary200ResponseUsercompetency) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ToolLpDataForUserCompetencySummary200ResponseUsercompetency) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["canrequestreview"] = o.Canrequestreview
	toSerialize["canreview"] = o.Canreview
	toSerialize["competencyid"] = o.Competencyid
	toSerialize["grade"] = o.Grade
	toSerialize["gradename"] = o.Gradename
	toSerialize["id"] = o.Id
	toSerialize["iscancelreviewrequestallowed"] = o.Iscancelreviewrequestallowed
	toSerialize["isrequestreviewallowed"] = o.Isrequestreviewallowed
	toSerialize["isstartreviewallowed"] = o.Isstartreviewallowed
	toSerialize["isstatusidle"] = o.Isstatusidle
	toSerialize["isstatusinreview"] = o.Isstatusinreview
	toSerialize["isstatuswaitingforreview"] = o.Isstatuswaitingforreview
	toSerialize["isstopreviewallowed"] = o.Isstopreviewallowed
	toSerialize["proficiency"] = o.Proficiency
	toSerialize["proficiencyname"] = o.Proficiencyname
	if !IsNil(o.Reviewer) {
		toSerialize["reviewer"] = o.Reviewer
	}
	toSerialize["reviewerid"] = o.Reviewerid
	toSerialize["status"] = o.Status
	toSerialize["statusname"] = o.Statusname
	toSerialize["timecreated"] = o.Timecreated
	toSerialize["timemodified"] = o.Timemodified
	toSerialize["url"] = o.Url
	toSerialize["userid"] = o.Userid
	toSerialize["usermodified"] = o.Usermodified
	return toSerialize, nil
}

func (o *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"canrequestreview",
		"canreview",
		"competencyid",
		"grade",
		"gradename",
		"id",
		"iscancelreviewrequestallowed",
		"isrequestreviewallowed",
		"isstartreviewallowed",
		"isstatusidle",
		"isstatusinreview",
		"isstatuswaitingforreview",
		"isstopreviewallowed",
		"proficiency",
		"proficiencyname",
		"reviewerid",
		"status",
		"statusname",
		"timecreated",
		"timemodified",
		"url",
		"userid",
		"usermodified",
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

	varToolLpDataForUserCompetencySummary200ResponseUsercompetency := _ToolLpDataForUserCompetencySummary200ResponseUsercompetency{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varToolLpDataForUserCompetencySummary200ResponseUsercompetency)

	if err != nil {
		return err
	}

	*o = ToolLpDataForUserCompetencySummary200ResponseUsercompetency(varToolLpDataForUserCompetencySummary200ResponseUsercompetency)

	return err
}

type NullableToolLpDataForUserCompetencySummary200ResponseUsercompetency struct {
	value *ToolLpDataForUserCompetencySummary200ResponseUsercompetency
	isSet bool
}

func (v NullableToolLpDataForUserCompetencySummary200ResponseUsercompetency) Get() *ToolLpDataForUserCompetencySummary200ResponseUsercompetency {
	return v.value
}

func (v *NullableToolLpDataForUserCompetencySummary200ResponseUsercompetency) Set(val *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) {
	v.value = val
	v.isSet = true
}

func (v NullableToolLpDataForUserCompetencySummary200ResponseUsercompetency) IsSet() bool {
	return v.isSet
}

func (v *NullableToolLpDataForUserCompetencySummary200ResponseUsercompetency) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableToolLpDataForUserCompetencySummary200ResponseUsercompetency(val *ToolLpDataForUserCompetencySummary200ResponseUsercompetency) *NullableToolLpDataForUserCompetencySummary200ResponseUsercompetency {
	return &NullableToolLpDataForUserCompetencySummary200ResponseUsercompetency{value: val, isSet: true}
}

func (v NullableToolLpDataForUserCompetencySummary200ResponseUsercompetency) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableToolLpDataForUserCompetencySummary200ResponseUsercompetency) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

