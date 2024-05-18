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

// checks if the CoreCompetencyReadPlan200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreCompetencyReadPlan200Response{}

// CoreCompetencyReadPlan200Response struct for CoreCompetencyReadPlan200Response
type CoreCompetencyReadPlan200Response struct {
	// canbeedited
	Canbeedited bool `json:"canbeedited"`
	// canmanage
	Canmanage bool `json:"canmanage"`
	// canrequestreview
	Canrequestreview bool `json:"canrequestreview"`
	// canreview
	Canreview bool `json:"canreview"`
	Commentarea CoreCompetencyReadPlan200ResponseCommentarea `json:"commentarea"`
	// description
	Description string `json:"description"`
	// description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
	Descriptionformat *int32 `json:"descriptionformat,omitempty"`
	// duedate
	Duedate int32 `json:"duedate"`
	// duedateformatted
	Duedateformatted string `json:"duedateformatted"`
	// id
	Id int32 `json:"id"`
	// isactive
	Isactive bool `json:"isactive"`
	// isapproveallowed
	Isapproveallowed bool `json:"isapproveallowed"`
	// isbasedontemplate
	Isbasedontemplate bool `json:"isbasedontemplate"`
	// iscancelreviewrequestallowed
	Iscancelreviewrequestallowed bool `json:"iscancelreviewrequestallowed"`
	// iscompleteallowed
	Iscompleteallowed bool `json:"iscompleteallowed"`
	// iscompleted
	Iscompleted bool `json:"iscompleted"`
	// isdraft
	Isdraft bool `json:"isdraft"`
	// isinreview
	Isinreview bool `json:"isinreview"`
	// isreopenallowed
	Isreopenallowed bool `json:"isreopenallowed"`
	// isrequestreviewallowed
	Isrequestreviewallowed bool `json:"isrequestreviewallowed"`
	// isstartreviewallowed
	Isstartreviewallowed bool `json:"isstartreviewallowed"`
	// isstopreviewallowed
	Isstopreviewallowed bool `json:"isstopreviewallowed"`
	// isunapproveallowed
	Isunapproveallowed bool `json:"isunapproveallowed"`
	// isunlinkallowed
	Isunlinkallowed bool `json:"isunlinkallowed"`
	// iswaitingforreview
	Iswaitingforreview bool `json:"iswaitingforreview"`
	// name
	Name string `json:"name"`
	// origtemplateid
	Origtemplateid int32 `json:"origtemplateid"`
	Reviewer *CoreCompetencyGradeCompetency200ResponseActionuser `json:"reviewer,omitempty"`
	// reviewerid
	Reviewerid int32 `json:"reviewerid"`
	// status
	Status int32 `json:"status"`
	// statusname
	Statusname string `json:"statusname"`
	Template *CoreCompetencyCreateTemplate200Response `json:"template,omitempty"`
	// templateid
	Templateid int32 `json:"templateid"`
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

type _CoreCompetencyReadPlan200Response CoreCompetencyReadPlan200Response

// NewCoreCompetencyReadPlan200Response instantiates a new CoreCompetencyReadPlan200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreCompetencyReadPlan200Response(canbeedited bool, canmanage bool, canrequestreview bool, canreview bool, commentarea CoreCompetencyReadPlan200ResponseCommentarea, description string, duedate int32, duedateformatted string, id int32, isactive bool, isapproveallowed bool, isbasedontemplate bool, iscancelreviewrequestallowed bool, iscompleteallowed bool, iscompleted bool, isdraft bool, isinreview bool, isreopenallowed bool, isrequestreviewallowed bool, isstartreviewallowed bool, isstopreviewallowed bool, isunapproveallowed bool, isunlinkallowed bool, iswaitingforreview bool, name string, origtemplateid int32, reviewerid int32, status int32, statusname string, templateid int32, timecreated int32, timemodified int32, url string, userid int32, usermodified int32) *CoreCompetencyReadPlan200Response {
	this := CoreCompetencyReadPlan200Response{}
	this.Canbeedited = canbeedited
	this.Canmanage = canmanage
	this.Canrequestreview = canrequestreview
	this.Canreview = canreview
	this.Commentarea = commentarea
	this.Description = description
	var descriptionformat int32 = 1
	this.Descriptionformat = &descriptionformat
	this.Duedate = duedate
	this.Duedateformatted = duedateformatted
	this.Id = id
	this.Isactive = isactive
	this.Isapproveallowed = isapproveallowed
	this.Isbasedontemplate = isbasedontemplate
	this.Iscancelreviewrequestallowed = iscancelreviewrequestallowed
	this.Iscompleteallowed = iscompleteallowed
	this.Iscompleted = iscompleted
	this.Isdraft = isdraft
	this.Isinreview = isinreview
	this.Isreopenallowed = isreopenallowed
	this.Isrequestreviewallowed = isrequestreviewallowed
	this.Isstartreviewallowed = isstartreviewallowed
	this.Isstopreviewallowed = isstopreviewallowed
	this.Isunapproveallowed = isunapproveallowed
	this.Isunlinkallowed = isunlinkallowed
	this.Iswaitingforreview = iswaitingforreview
	this.Name = name
	this.Origtemplateid = origtemplateid
	this.Reviewerid = reviewerid
	this.Status = status
	this.Statusname = statusname
	this.Templateid = templateid
	this.Timecreated = timecreated
	this.Timemodified = timemodified
	this.Url = url
	this.Userid = userid
	this.Usermodified = usermodified
	return &this
}

// NewCoreCompetencyReadPlan200ResponseWithDefaults instantiates a new CoreCompetencyReadPlan200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreCompetencyReadPlan200ResponseWithDefaults() *CoreCompetencyReadPlan200Response {
	this := CoreCompetencyReadPlan200Response{}
	var description string = ""
	this.Description = description
	var descriptionformat int32 = 1
	this.Descriptionformat = &descriptionformat
	var duedate int32 = 0
	this.Duedate = duedate
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

// GetCanbeedited returns the Canbeedited field value
func (o *CoreCompetencyReadPlan200Response) GetCanbeedited() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Canbeedited
}

// GetCanbeeditedOk returns a tuple with the Canbeedited field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetCanbeeditedOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Canbeedited, true
}

// SetCanbeedited sets field value
func (o *CoreCompetencyReadPlan200Response) SetCanbeedited(v bool) {
	o.Canbeedited = v
}

// GetCanmanage returns the Canmanage field value
func (o *CoreCompetencyReadPlan200Response) GetCanmanage() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Canmanage
}

// GetCanmanageOk returns a tuple with the Canmanage field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetCanmanageOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Canmanage, true
}

// SetCanmanage sets field value
func (o *CoreCompetencyReadPlan200Response) SetCanmanage(v bool) {
	o.Canmanage = v
}

// GetCanrequestreview returns the Canrequestreview field value
func (o *CoreCompetencyReadPlan200Response) GetCanrequestreview() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Canrequestreview
}

// GetCanrequestreviewOk returns a tuple with the Canrequestreview field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetCanrequestreviewOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Canrequestreview, true
}

// SetCanrequestreview sets field value
func (o *CoreCompetencyReadPlan200Response) SetCanrequestreview(v bool) {
	o.Canrequestreview = v
}

// GetCanreview returns the Canreview field value
func (o *CoreCompetencyReadPlan200Response) GetCanreview() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Canreview
}

// GetCanreviewOk returns a tuple with the Canreview field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetCanreviewOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Canreview, true
}

// SetCanreview sets field value
func (o *CoreCompetencyReadPlan200Response) SetCanreview(v bool) {
	o.Canreview = v
}

// GetCommentarea returns the Commentarea field value
func (o *CoreCompetencyReadPlan200Response) GetCommentarea() CoreCompetencyReadPlan200ResponseCommentarea {
	if o == nil {
		var ret CoreCompetencyReadPlan200ResponseCommentarea
		return ret
	}

	return o.Commentarea
}

// GetCommentareaOk returns a tuple with the Commentarea field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetCommentareaOk() (*CoreCompetencyReadPlan200ResponseCommentarea, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Commentarea, true
}

// SetCommentarea sets field value
func (o *CoreCompetencyReadPlan200Response) SetCommentarea(v CoreCompetencyReadPlan200ResponseCommentarea) {
	o.Commentarea = v
}

// GetDescription returns the Description field value
func (o *CoreCompetencyReadPlan200Response) GetDescription() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Description
}

// GetDescriptionOk returns a tuple with the Description field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetDescriptionOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Description, true
}

// SetDescription sets field value
func (o *CoreCompetencyReadPlan200Response) SetDescription(v string) {
	o.Description = v
}

// GetDescriptionformat returns the Descriptionformat field value if set, zero value otherwise.
func (o *CoreCompetencyReadPlan200Response) GetDescriptionformat() int32 {
	if o == nil || IsNil(o.Descriptionformat) {
		var ret int32
		return ret
	}
	return *o.Descriptionformat
}

// GetDescriptionformatOk returns a tuple with the Descriptionformat field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetDescriptionformatOk() (*int32, bool) {
	if o == nil || IsNil(o.Descriptionformat) {
		return nil, false
	}
	return o.Descriptionformat, true
}

// HasDescriptionformat returns a boolean if a field has been set.
func (o *CoreCompetencyReadPlan200Response) HasDescriptionformat() bool {
	if o != nil && !IsNil(o.Descriptionformat) {
		return true
	}

	return false
}

// SetDescriptionformat gets a reference to the given int32 and assigns it to the Descriptionformat field.
func (o *CoreCompetencyReadPlan200Response) SetDescriptionformat(v int32) {
	o.Descriptionformat = &v
}

// GetDuedate returns the Duedate field value
func (o *CoreCompetencyReadPlan200Response) GetDuedate() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Duedate
}

// GetDuedateOk returns a tuple with the Duedate field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetDuedateOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Duedate, true
}

// SetDuedate sets field value
func (o *CoreCompetencyReadPlan200Response) SetDuedate(v int32) {
	o.Duedate = v
}

// GetDuedateformatted returns the Duedateformatted field value
func (o *CoreCompetencyReadPlan200Response) GetDuedateformatted() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Duedateformatted
}

// GetDuedateformattedOk returns a tuple with the Duedateformatted field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetDuedateformattedOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Duedateformatted, true
}

// SetDuedateformatted sets field value
func (o *CoreCompetencyReadPlan200Response) SetDuedateformatted(v string) {
	o.Duedateformatted = v
}

// GetId returns the Id field value
func (o *CoreCompetencyReadPlan200Response) GetId() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetIdOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *CoreCompetencyReadPlan200Response) SetId(v int32) {
	o.Id = v
}

// GetIsactive returns the Isactive field value
func (o *CoreCompetencyReadPlan200Response) GetIsactive() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Isactive
}

// GetIsactiveOk returns a tuple with the Isactive field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetIsactiveOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Isactive, true
}

// SetIsactive sets field value
func (o *CoreCompetencyReadPlan200Response) SetIsactive(v bool) {
	o.Isactive = v
}

// GetIsapproveallowed returns the Isapproveallowed field value
func (o *CoreCompetencyReadPlan200Response) GetIsapproveallowed() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Isapproveallowed
}

// GetIsapproveallowedOk returns a tuple with the Isapproveallowed field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetIsapproveallowedOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Isapproveallowed, true
}

// SetIsapproveallowed sets field value
func (o *CoreCompetencyReadPlan200Response) SetIsapproveallowed(v bool) {
	o.Isapproveallowed = v
}

// GetIsbasedontemplate returns the Isbasedontemplate field value
func (o *CoreCompetencyReadPlan200Response) GetIsbasedontemplate() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Isbasedontemplate
}

// GetIsbasedontemplateOk returns a tuple with the Isbasedontemplate field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetIsbasedontemplateOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Isbasedontemplate, true
}

// SetIsbasedontemplate sets field value
func (o *CoreCompetencyReadPlan200Response) SetIsbasedontemplate(v bool) {
	o.Isbasedontemplate = v
}

// GetIscancelreviewrequestallowed returns the Iscancelreviewrequestallowed field value
func (o *CoreCompetencyReadPlan200Response) GetIscancelreviewrequestallowed() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Iscancelreviewrequestallowed
}

// GetIscancelreviewrequestallowedOk returns a tuple with the Iscancelreviewrequestallowed field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetIscancelreviewrequestallowedOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Iscancelreviewrequestallowed, true
}

// SetIscancelreviewrequestallowed sets field value
func (o *CoreCompetencyReadPlan200Response) SetIscancelreviewrequestallowed(v bool) {
	o.Iscancelreviewrequestallowed = v
}

// GetIscompleteallowed returns the Iscompleteallowed field value
func (o *CoreCompetencyReadPlan200Response) GetIscompleteallowed() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Iscompleteallowed
}

// GetIscompleteallowedOk returns a tuple with the Iscompleteallowed field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetIscompleteallowedOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Iscompleteallowed, true
}

// SetIscompleteallowed sets field value
func (o *CoreCompetencyReadPlan200Response) SetIscompleteallowed(v bool) {
	o.Iscompleteallowed = v
}

// GetIscompleted returns the Iscompleted field value
func (o *CoreCompetencyReadPlan200Response) GetIscompleted() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Iscompleted
}

// GetIscompletedOk returns a tuple with the Iscompleted field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetIscompletedOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Iscompleted, true
}

// SetIscompleted sets field value
func (o *CoreCompetencyReadPlan200Response) SetIscompleted(v bool) {
	o.Iscompleted = v
}

// GetIsdraft returns the Isdraft field value
func (o *CoreCompetencyReadPlan200Response) GetIsdraft() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Isdraft
}

// GetIsdraftOk returns a tuple with the Isdraft field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetIsdraftOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Isdraft, true
}

// SetIsdraft sets field value
func (o *CoreCompetencyReadPlan200Response) SetIsdraft(v bool) {
	o.Isdraft = v
}

// GetIsinreview returns the Isinreview field value
func (o *CoreCompetencyReadPlan200Response) GetIsinreview() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Isinreview
}

// GetIsinreviewOk returns a tuple with the Isinreview field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetIsinreviewOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Isinreview, true
}

// SetIsinreview sets field value
func (o *CoreCompetencyReadPlan200Response) SetIsinreview(v bool) {
	o.Isinreview = v
}

// GetIsreopenallowed returns the Isreopenallowed field value
func (o *CoreCompetencyReadPlan200Response) GetIsreopenallowed() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Isreopenallowed
}

// GetIsreopenallowedOk returns a tuple with the Isreopenallowed field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetIsreopenallowedOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Isreopenallowed, true
}

// SetIsreopenallowed sets field value
func (o *CoreCompetencyReadPlan200Response) SetIsreopenallowed(v bool) {
	o.Isreopenallowed = v
}

// GetIsrequestreviewallowed returns the Isrequestreviewallowed field value
func (o *CoreCompetencyReadPlan200Response) GetIsrequestreviewallowed() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Isrequestreviewallowed
}

// GetIsrequestreviewallowedOk returns a tuple with the Isrequestreviewallowed field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetIsrequestreviewallowedOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Isrequestreviewallowed, true
}

// SetIsrequestreviewallowed sets field value
func (o *CoreCompetencyReadPlan200Response) SetIsrequestreviewallowed(v bool) {
	o.Isrequestreviewallowed = v
}

// GetIsstartreviewallowed returns the Isstartreviewallowed field value
func (o *CoreCompetencyReadPlan200Response) GetIsstartreviewallowed() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Isstartreviewallowed
}

// GetIsstartreviewallowedOk returns a tuple with the Isstartreviewallowed field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetIsstartreviewallowedOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Isstartreviewallowed, true
}

// SetIsstartreviewallowed sets field value
func (o *CoreCompetencyReadPlan200Response) SetIsstartreviewallowed(v bool) {
	o.Isstartreviewallowed = v
}

// GetIsstopreviewallowed returns the Isstopreviewallowed field value
func (o *CoreCompetencyReadPlan200Response) GetIsstopreviewallowed() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Isstopreviewallowed
}

// GetIsstopreviewallowedOk returns a tuple with the Isstopreviewallowed field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetIsstopreviewallowedOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Isstopreviewallowed, true
}

// SetIsstopreviewallowed sets field value
func (o *CoreCompetencyReadPlan200Response) SetIsstopreviewallowed(v bool) {
	o.Isstopreviewallowed = v
}

// GetIsunapproveallowed returns the Isunapproveallowed field value
func (o *CoreCompetencyReadPlan200Response) GetIsunapproveallowed() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Isunapproveallowed
}

// GetIsunapproveallowedOk returns a tuple with the Isunapproveallowed field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetIsunapproveallowedOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Isunapproveallowed, true
}

// SetIsunapproveallowed sets field value
func (o *CoreCompetencyReadPlan200Response) SetIsunapproveallowed(v bool) {
	o.Isunapproveallowed = v
}

// GetIsunlinkallowed returns the Isunlinkallowed field value
func (o *CoreCompetencyReadPlan200Response) GetIsunlinkallowed() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Isunlinkallowed
}

// GetIsunlinkallowedOk returns a tuple with the Isunlinkallowed field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetIsunlinkallowedOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Isunlinkallowed, true
}

// SetIsunlinkallowed sets field value
func (o *CoreCompetencyReadPlan200Response) SetIsunlinkallowed(v bool) {
	o.Isunlinkallowed = v
}

// GetIswaitingforreview returns the Iswaitingforreview field value
func (o *CoreCompetencyReadPlan200Response) GetIswaitingforreview() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Iswaitingforreview
}

// GetIswaitingforreviewOk returns a tuple with the Iswaitingforreview field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetIswaitingforreviewOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Iswaitingforreview, true
}

// SetIswaitingforreview sets field value
func (o *CoreCompetencyReadPlan200Response) SetIswaitingforreview(v bool) {
	o.Iswaitingforreview = v
}

// GetName returns the Name field value
func (o *CoreCompetencyReadPlan200Response) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *CoreCompetencyReadPlan200Response) SetName(v string) {
	o.Name = v
}

// GetOrigtemplateid returns the Origtemplateid field value
func (o *CoreCompetencyReadPlan200Response) GetOrigtemplateid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Origtemplateid
}

// GetOrigtemplateidOk returns a tuple with the Origtemplateid field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetOrigtemplateidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Origtemplateid, true
}

// SetOrigtemplateid sets field value
func (o *CoreCompetencyReadPlan200Response) SetOrigtemplateid(v int32) {
	o.Origtemplateid = v
}

// GetReviewer returns the Reviewer field value if set, zero value otherwise.
func (o *CoreCompetencyReadPlan200Response) GetReviewer() CoreCompetencyGradeCompetency200ResponseActionuser {
	if o == nil || IsNil(o.Reviewer) {
		var ret CoreCompetencyGradeCompetency200ResponseActionuser
		return ret
	}
	return *o.Reviewer
}

// GetReviewerOk returns a tuple with the Reviewer field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetReviewerOk() (*CoreCompetencyGradeCompetency200ResponseActionuser, bool) {
	if o == nil || IsNil(o.Reviewer) {
		return nil, false
	}
	return o.Reviewer, true
}

// HasReviewer returns a boolean if a field has been set.
func (o *CoreCompetencyReadPlan200Response) HasReviewer() bool {
	if o != nil && !IsNil(o.Reviewer) {
		return true
	}

	return false
}

// SetReviewer gets a reference to the given CoreCompetencyGradeCompetency200ResponseActionuser and assigns it to the Reviewer field.
func (o *CoreCompetencyReadPlan200Response) SetReviewer(v CoreCompetencyGradeCompetency200ResponseActionuser) {
	o.Reviewer = &v
}

// GetReviewerid returns the Reviewerid field value
func (o *CoreCompetencyReadPlan200Response) GetReviewerid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Reviewerid
}

// GetRevieweridOk returns a tuple with the Reviewerid field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetRevieweridOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Reviewerid, true
}

// SetReviewerid sets field value
func (o *CoreCompetencyReadPlan200Response) SetReviewerid(v int32) {
	o.Reviewerid = v
}

// GetStatus returns the Status field value
func (o *CoreCompetencyReadPlan200Response) GetStatus() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Status
}

// GetStatusOk returns a tuple with the Status field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetStatusOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Status, true
}

// SetStatus sets field value
func (o *CoreCompetencyReadPlan200Response) SetStatus(v int32) {
	o.Status = v
}

// GetStatusname returns the Statusname field value
func (o *CoreCompetencyReadPlan200Response) GetStatusname() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Statusname
}

// GetStatusnameOk returns a tuple with the Statusname field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetStatusnameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Statusname, true
}

// SetStatusname sets field value
func (o *CoreCompetencyReadPlan200Response) SetStatusname(v string) {
	o.Statusname = v
}

// GetTemplate returns the Template field value if set, zero value otherwise.
func (o *CoreCompetencyReadPlan200Response) GetTemplate() CoreCompetencyCreateTemplate200Response {
	if o == nil || IsNil(o.Template) {
		var ret CoreCompetencyCreateTemplate200Response
		return ret
	}
	return *o.Template
}

// GetTemplateOk returns a tuple with the Template field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetTemplateOk() (*CoreCompetencyCreateTemplate200Response, bool) {
	if o == nil || IsNil(o.Template) {
		return nil, false
	}
	return o.Template, true
}

// HasTemplate returns a boolean if a field has been set.
func (o *CoreCompetencyReadPlan200Response) HasTemplate() bool {
	if o != nil && !IsNil(o.Template) {
		return true
	}

	return false
}

// SetTemplate gets a reference to the given CoreCompetencyCreateTemplate200Response and assigns it to the Template field.
func (o *CoreCompetencyReadPlan200Response) SetTemplate(v CoreCompetencyCreateTemplate200Response) {
	o.Template = &v
}

// GetTemplateid returns the Templateid field value
func (o *CoreCompetencyReadPlan200Response) GetTemplateid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Templateid
}

// GetTemplateidOk returns a tuple with the Templateid field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetTemplateidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Templateid, true
}

// SetTemplateid sets field value
func (o *CoreCompetencyReadPlan200Response) SetTemplateid(v int32) {
	o.Templateid = v
}

// GetTimecreated returns the Timecreated field value
func (o *CoreCompetencyReadPlan200Response) GetTimecreated() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Timecreated
}

// GetTimecreatedOk returns a tuple with the Timecreated field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetTimecreatedOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Timecreated, true
}

// SetTimecreated sets field value
func (o *CoreCompetencyReadPlan200Response) SetTimecreated(v int32) {
	o.Timecreated = v
}

// GetTimemodified returns the Timemodified field value
func (o *CoreCompetencyReadPlan200Response) GetTimemodified() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Timemodified
}

// GetTimemodifiedOk returns a tuple with the Timemodified field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetTimemodifiedOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Timemodified, true
}

// SetTimemodified sets field value
func (o *CoreCompetencyReadPlan200Response) SetTimemodified(v int32) {
	o.Timemodified = v
}

// GetUrl returns the Url field value
func (o *CoreCompetencyReadPlan200Response) GetUrl() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Url
}

// GetUrlOk returns a tuple with the Url field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetUrlOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Url, true
}

// SetUrl sets field value
func (o *CoreCompetencyReadPlan200Response) SetUrl(v string) {
	o.Url = v
}

// GetUserid returns the Userid field value
func (o *CoreCompetencyReadPlan200Response) GetUserid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Userid
}

// GetUseridOk returns a tuple with the Userid field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetUseridOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Userid, true
}

// SetUserid sets field value
func (o *CoreCompetencyReadPlan200Response) SetUserid(v int32) {
	o.Userid = v
}

// GetUsermodified returns the Usermodified field value
func (o *CoreCompetencyReadPlan200Response) GetUsermodified() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Usermodified
}

// GetUsermodifiedOk returns a tuple with the Usermodified field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyReadPlan200Response) GetUsermodifiedOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Usermodified, true
}

// SetUsermodified sets field value
func (o *CoreCompetencyReadPlan200Response) SetUsermodified(v int32) {
	o.Usermodified = v
}

func (o CoreCompetencyReadPlan200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreCompetencyReadPlan200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["canbeedited"] = o.Canbeedited
	toSerialize["canmanage"] = o.Canmanage
	toSerialize["canrequestreview"] = o.Canrequestreview
	toSerialize["canreview"] = o.Canreview
	toSerialize["commentarea"] = o.Commentarea
	toSerialize["description"] = o.Description
	if !IsNil(o.Descriptionformat) {
		toSerialize["descriptionformat"] = o.Descriptionformat
	}
	toSerialize["duedate"] = o.Duedate
	toSerialize["duedateformatted"] = o.Duedateformatted
	toSerialize["id"] = o.Id
	toSerialize["isactive"] = o.Isactive
	toSerialize["isapproveallowed"] = o.Isapproveallowed
	toSerialize["isbasedontemplate"] = o.Isbasedontemplate
	toSerialize["iscancelreviewrequestallowed"] = o.Iscancelreviewrequestallowed
	toSerialize["iscompleteallowed"] = o.Iscompleteallowed
	toSerialize["iscompleted"] = o.Iscompleted
	toSerialize["isdraft"] = o.Isdraft
	toSerialize["isinreview"] = o.Isinreview
	toSerialize["isreopenallowed"] = o.Isreopenallowed
	toSerialize["isrequestreviewallowed"] = o.Isrequestreviewallowed
	toSerialize["isstartreviewallowed"] = o.Isstartreviewallowed
	toSerialize["isstopreviewallowed"] = o.Isstopreviewallowed
	toSerialize["isunapproveallowed"] = o.Isunapproveallowed
	toSerialize["isunlinkallowed"] = o.Isunlinkallowed
	toSerialize["iswaitingforreview"] = o.Iswaitingforreview
	toSerialize["name"] = o.Name
	toSerialize["origtemplateid"] = o.Origtemplateid
	if !IsNil(o.Reviewer) {
		toSerialize["reviewer"] = o.Reviewer
	}
	toSerialize["reviewerid"] = o.Reviewerid
	toSerialize["status"] = o.Status
	toSerialize["statusname"] = o.Statusname
	if !IsNil(o.Template) {
		toSerialize["template"] = o.Template
	}
	toSerialize["templateid"] = o.Templateid
	toSerialize["timecreated"] = o.Timecreated
	toSerialize["timemodified"] = o.Timemodified
	toSerialize["url"] = o.Url
	toSerialize["userid"] = o.Userid
	toSerialize["usermodified"] = o.Usermodified
	return toSerialize, nil
}

func (o *CoreCompetencyReadPlan200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"canbeedited",
		"canmanage",
		"canrequestreview",
		"canreview",
		"commentarea",
		"description",
		"duedate",
		"duedateformatted",
		"id",
		"isactive",
		"isapproveallowed",
		"isbasedontemplate",
		"iscancelreviewrequestallowed",
		"iscompleteallowed",
		"iscompleted",
		"isdraft",
		"isinreview",
		"isreopenallowed",
		"isrequestreviewallowed",
		"isstartreviewallowed",
		"isstopreviewallowed",
		"isunapproveallowed",
		"isunlinkallowed",
		"iswaitingforreview",
		"name",
		"origtemplateid",
		"reviewerid",
		"status",
		"statusname",
		"templateid",
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

	varCoreCompetencyReadPlan200Response := _CoreCompetencyReadPlan200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreCompetencyReadPlan200Response)

	if err != nil {
		return err
	}

	*o = CoreCompetencyReadPlan200Response(varCoreCompetencyReadPlan200Response)

	return err
}

type NullableCoreCompetencyReadPlan200Response struct {
	value *CoreCompetencyReadPlan200Response
	isSet bool
}

func (v NullableCoreCompetencyReadPlan200Response) Get() *CoreCompetencyReadPlan200Response {
	return v.value
}

func (v *NullableCoreCompetencyReadPlan200Response) Set(val *CoreCompetencyReadPlan200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreCompetencyReadPlan200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreCompetencyReadPlan200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreCompetencyReadPlan200Response(val *CoreCompetencyReadPlan200Response) *NullableCoreCompetencyReadPlan200Response {
	return &NullableCoreCompetencyReadPlan200Response{value: val, isSet: true}
}

func (v NullableCoreCompetencyReadPlan200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreCompetencyReadPlan200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


