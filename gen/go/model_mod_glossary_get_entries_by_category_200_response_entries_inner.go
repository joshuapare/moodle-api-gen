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

// checks if the ModGlossaryGetEntriesByCategory200ResponseEntriesInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModGlossaryGetEntriesByCategory200ResponseEntriesInner{}

// ModGlossaryGetEntriesByCategory200ResponseEntriesInner struct for ModGlossaryGetEntriesByCategory200ResponseEntriesInner
type ModGlossaryGetEntriesByCategory200ResponseEntriesInner struct {
	// Whether the entry was approved
	Approved *bool `json:"approved,omitempty"`
	// Whether or not the entry has attachments
	Attachment *bool `json:"attachment,omitempty"`
	Attachments []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner `json:"attachments,omitempty"`
	// When true, the matching is case sensitive
	Casesensitive *bool `json:"casesensitive,omitempty"`
	// The category ID. This may be '-1' when the entry is not categorised
	Categoryid *int32 `json:"categoryid,omitempty"`
	// The category name. May be empty when the entry is not categorised, or the request was limited to one category.
	Categoryname *string `json:"categoryname,omitempty"`
	// The concept
	Concept *string `json:"concept,omitempty"`
	// The definition
	Definition *string `json:"definition,omitempty"`
	// definition format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
	Definitionformat *int32 `json:"definitionformat,omitempty"`
	Definitioninlinefiles []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner `json:"definitioninlinefiles,omitempty"`
	// The definition trust flag
	Definitiontrust *bool `json:"definitiontrust,omitempty"`
	// When true, the matching is done on full words only
	Fullmatch *bool `json:"fullmatch,omitempty"`
	// The glossary ID
	Glossaryid *int32 `json:"glossaryid,omitempty"`
	// The entry ID
	Id *int32 `json:"id,omitempty"`
	// The source glossary ID
	Sourceglossaryid *int32 `json:"sourceglossaryid,omitempty"`
	Tags []ModDataGetEntries200ResponseEntriesInnerTagsInner `json:"tags,omitempty"`
	// The entry was created by a teacher, or equivalent.
	Teacherentry *bool `json:"teacherentry,omitempty"`
	// Time created
	Timecreated *int32 `json:"timecreated,omitempty"`
	// Time modified
	Timemodified *int32 `json:"timemodified,omitempty"`
	// Whether the concept should be automatically linked
	Usedynalink *bool `json:"usedynalink,omitempty"`
	// Author full name
	Userfullname *string `json:"userfullname,omitempty"`
	// Author ID
	Userid *int32 `json:"userid,omitempty"`
	// Author picture
	Userpictureurl *string `json:"userpictureurl,omitempty"`
}

// NewModGlossaryGetEntriesByCategory200ResponseEntriesInner instantiates a new ModGlossaryGetEntriesByCategory200ResponseEntriesInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModGlossaryGetEntriesByCategory200ResponseEntriesInner() *ModGlossaryGetEntriesByCategory200ResponseEntriesInner {
	this := ModGlossaryGetEntriesByCategory200ResponseEntriesInner{}
	var categoryid int32 = -1
	this.Categoryid = &categoryid
	var categoryname string = ""
	this.Categoryname = &categoryname
	return &this
}

// NewModGlossaryGetEntriesByCategory200ResponseEntriesInnerWithDefaults instantiates a new ModGlossaryGetEntriesByCategory200ResponseEntriesInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModGlossaryGetEntriesByCategory200ResponseEntriesInnerWithDefaults() *ModGlossaryGetEntriesByCategory200ResponseEntriesInner {
	this := ModGlossaryGetEntriesByCategory200ResponseEntriesInner{}
	var categoryid int32 = -1
	this.Categoryid = &categoryid
	var categoryname string = ""
	this.Categoryname = &categoryname
	return &this
}

// GetApproved returns the Approved field value if set, zero value otherwise.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetApproved() bool {
	if o == nil || IsNil(o.Approved) {
		var ret bool
		return ret
	}
	return *o.Approved
}

// GetApprovedOk returns a tuple with the Approved field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetApprovedOk() (*bool, bool) {
	if o == nil || IsNil(o.Approved) {
		return nil, false
	}
	return o.Approved, true
}

// HasApproved returns a boolean if a field has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasApproved() bool {
	if o != nil && !IsNil(o.Approved) {
		return true
	}

	return false
}

// SetApproved gets a reference to the given bool and assigns it to the Approved field.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetApproved(v bool) {
	o.Approved = &v
}

// GetAttachment returns the Attachment field value if set, zero value otherwise.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetAttachment() bool {
	if o == nil || IsNil(o.Attachment) {
		var ret bool
		return ret
	}
	return *o.Attachment
}

// GetAttachmentOk returns a tuple with the Attachment field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetAttachmentOk() (*bool, bool) {
	if o == nil || IsNil(o.Attachment) {
		return nil, false
	}
	return o.Attachment, true
}

// HasAttachment returns a boolean if a field has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasAttachment() bool {
	if o != nil && !IsNil(o.Attachment) {
		return true
	}

	return false
}

// SetAttachment gets a reference to the given bool and assigns it to the Attachment field.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetAttachment(v bool) {
	o.Attachment = &v
}

// GetAttachments returns the Attachments field value if set, zero value otherwise.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetAttachments() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner {
	if o == nil || IsNil(o.Attachments) {
		var ret []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner
		return ret
	}
	return o.Attachments
}

// GetAttachmentsOk returns a tuple with the Attachments field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetAttachmentsOk() ([]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool) {
	if o == nil || IsNil(o.Attachments) {
		return nil, false
	}
	return o.Attachments, true
}

// HasAttachments returns a boolean if a field has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasAttachments() bool {
	if o != nil && !IsNil(o.Attachments) {
		return true
	}

	return false
}

// SetAttachments gets a reference to the given []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner and assigns it to the Attachments field.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetAttachments(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner) {
	o.Attachments = v
}

// GetCasesensitive returns the Casesensitive field value if set, zero value otherwise.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetCasesensitive() bool {
	if o == nil || IsNil(o.Casesensitive) {
		var ret bool
		return ret
	}
	return *o.Casesensitive
}

// GetCasesensitiveOk returns a tuple with the Casesensitive field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetCasesensitiveOk() (*bool, bool) {
	if o == nil || IsNil(o.Casesensitive) {
		return nil, false
	}
	return o.Casesensitive, true
}

// HasCasesensitive returns a boolean if a field has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasCasesensitive() bool {
	if o != nil && !IsNil(o.Casesensitive) {
		return true
	}

	return false
}

// SetCasesensitive gets a reference to the given bool and assigns it to the Casesensitive field.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetCasesensitive(v bool) {
	o.Casesensitive = &v
}

// GetCategoryid returns the Categoryid field value if set, zero value otherwise.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetCategoryid() int32 {
	if o == nil || IsNil(o.Categoryid) {
		var ret int32
		return ret
	}
	return *o.Categoryid
}

// GetCategoryidOk returns a tuple with the Categoryid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetCategoryidOk() (*int32, bool) {
	if o == nil || IsNil(o.Categoryid) {
		return nil, false
	}
	return o.Categoryid, true
}

// HasCategoryid returns a boolean if a field has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasCategoryid() bool {
	if o != nil && !IsNil(o.Categoryid) {
		return true
	}

	return false
}

// SetCategoryid gets a reference to the given int32 and assigns it to the Categoryid field.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetCategoryid(v int32) {
	o.Categoryid = &v
}

// GetCategoryname returns the Categoryname field value if set, zero value otherwise.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetCategoryname() string {
	if o == nil || IsNil(o.Categoryname) {
		var ret string
		return ret
	}
	return *o.Categoryname
}

// GetCategorynameOk returns a tuple with the Categoryname field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetCategorynameOk() (*string, bool) {
	if o == nil || IsNil(o.Categoryname) {
		return nil, false
	}
	return o.Categoryname, true
}

// HasCategoryname returns a boolean if a field has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasCategoryname() bool {
	if o != nil && !IsNil(o.Categoryname) {
		return true
	}

	return false
}

// SetCategoryname gets a reference to the given string and assigns it to the Categoryname field.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetCategoryname(v string) {
	o.Categoryname = &v
}

// GetConcept returns the Concept field value if set, zero value otherwise.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetConcept() string {
	if o == nil || IsNil(o.Concept) {
		var ret string
		return ret
	}
	return *o.Concept
}

// GetConceptOk returns a tuple with the Concept field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetConceptOk() (*string, bool) {
	if o == nil || IsNil(o.Concept) {
		return nil, false
	}
	return o.Concept, true
}

// HasConcept returns a boolean if a field has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasConcept() bool {
	if o != nil && !IsNil(o.Concept) {
		return true
	}

	return false
}

// SetConcept gets a reference to the given string and assigns it to the Concept field.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetConcept(v string) {
	o.Concept = &v
}

// GetDefinition returns the Definition field value if set, zero value otherwise.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetDefinition() string {
	if o == nil || IsNil(o.Definition) {
		var ret string
		return ret
	}
	return *o.Definition
}

// GetDefinitionOk returns a tuple with the Definition field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetDefinitionOk() (*string, bool) {
	if o == nil || IsNil(o.Definition) {
		return nil, false
	}
	return o.Definition, true
}

// HasDefinition returns a boolean if a field has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasDefinition() bool {
	if o != nil && !IsNil(o.Definition) {
		return true
	}

	return false
}

// SetDefinition gets a reference to the given string and assigns it to the Definition field.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetDefinition(v string) {
	o.Definition = &v
}

// GetDefinitionformat returns the Definitionformat field value if set, zero value otherwise.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetDefinitionformat() int32 {
	if o == nil || IsNil(o.Definitionformat) {
		var ret int32
		return ret
	}
	return *o.Definitionformat
}

// GetDefinitionformatOk returns a tuple with the Definitionformat field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetDefinitionformatOk() (*int32, bool) {
	if o == nil || IsNil(o.Definitionformat) {
		return nil, false
	}
	return o.Definitionformat, true
}

// HasDefinitionformat returns a boolean if a field has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasDefinitionformat() bool {
	if o != nil && !IsNil(o.Definitionformat) {
		return true
	}

	return false
}

// SetDefinitionformat gets a reference to the given int32 and assigns it to the Definitionformat field.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetDefinitionformat(v int32) {
	o.Definitionformat = &v
}

// GetDefinitioninlinefiles returns the Definitioninlinefiles field value if set, zero value otherwise.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetDefinitioninlinefiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner {
	if o == nil || IsNil(o.Definitioninlinefiles) {
		var ret []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner
		return ret
	}
	return o.Definitioninlinefiles
}

// GetDefinitioninlinefilesOk returns a tuple with the Definitioninlinefiles field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetDefinitioninlinefilesOk() ([]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool) {
	if o == nil || IsNil(o.Definitioninlinefiles) {
		return nil, false
	}
	return o.Definitioninlinefiles, true
}

// HasDefinitioninlinefiles returns a boolean if a field has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasDefinitioninlinefiles() bool {
	if o != nil && !IsNil(o.Definitioninlinefiles) {
		return true
	}

	return false
}

// SetDefinitioninlinefiles gets a reference to the given []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner and assigns it to the Definitioninlinefiles field.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetDefinitioninlinefiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner) {
	o.Definitioninlinefiles = v
}

// GetDefinitiontrust returns the Definitiontrust field value if set, zero value otherwise.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetDefinitiontrust() bool {
	if o == nil || IsNil(o.Definitiontrust) {
		var ret bool
		return ret
	}
	return *o.Definitiontrust
}

// GetDefinitiontrustOk returns a tuple with the Definitiontrust field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetDefinitiontrustOk() (*bool, bool) {
	if o == nil || IsNil(o.Definitiontrust) {
		return nil, false
	}
	return o.Definitiontrust, true
}

// HasDefinitiontrust returns a boolean if a field has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasDefinitiontrust() bool {
	if o != nil && !IsNil(o.Definitiontrust) {
		return true
	}

	return false
}

// SetDefinitiontrust gets a reference to the given bool and assigns it to the Definitiontrust field.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetDefinitiontrust(v bool) {
	o.Definitiontrust = &v
}

// GetFullmatch returns the Fullmatch field value if set, zero value otherwise.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetFullmatch() bool {
	if o == nil || IsNil(o.Fullmatch) {
		var ret bool
		return ret
	}
	return *o.Fullmatch
}

// GetFullmatchOk returns a tuple with the Fullmatch field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetFullmatchOk() (*bool, bool) {
	if o == nil || IsNil(o.Fullmatch) {
		return nil, false
	}
	return o.Fullmatch, true
}

// HasFullmatch returns a boolean if a field has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasFullmatch() bool {
	if o != nil && !IsNil(o.Fullmatch) {
		return true
	}

	return false
}

// SetFullmatch gets a reference to the given bool and assigns it to the Fullmatch field.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetFullmatch(v bool) {
	o.Fullmatch = &v
}

// GetGlossaryid returns the Glossaryid field value if set, zero value otherwise.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetGlossaryid() int32 {
	if o == nil || IsNil(o.Glossaryid) {
		var ret int32
		return ret
	}
	return *o.Glossaryid
}

// GetGlossaryidOk returns a tuple with the Glossaryid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetGlossaryidOk() (*int32, bool) {
	if o == nil || IsNil(o.Glossaryid) {
		return nil, false
	}
	return o.Glossaryid, true
}

// HasGlossaryid returns a boolean if a field has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasGlossaryid() bool {
	if o != nil && !IsNil(o.Glossaryid) {
		return true
	}

	return false
}

// SetGlossaryid gets a reference to the given int32 and assigns it to the Glossaryid field.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetGlossaryid(v int32) {
	o.Glossaryid = &v
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetId() int32 {
	if o == nil || IsNil(o.Id) {
		var ret int32
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetIdOk() (*int32, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given int32 and assigns it to the Id field.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetId(v int32) {
	o.Id = &v
}

// GetSourceglossaryid returns the Sourceglossaryid field value if set, zero value otherwise.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetSourceglossaryid() int32 {
	if o == nil || IsNil(o.Sourceglossaryid) {
		var ret int32
		return ret
	}
	return *o.Sourceglossaryid
}

// GetSourceglossaryidOk returns a tuple with the Sourceglossaryid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetSourceglossaryidOk() (*int32, bool) {
	if o == nil || IsNil(o.Sourceglossaryid) {
		return nil, false
	}
	return o.Sourceglossaryid, true
}

// HasSourceglossaryid returns a boolean if a field has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasSourceglossaryid() bool {
	if o != nil && !IsNil(o.Sourceglossaryid) {
		return true
	}

	return false
}

// SetSourceglossaryid gets a reference to the given int32 and assigns it to the Sourceglossaryid field.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetSourceglossaryid(v int32) {
	o.Sourceglossaryid = &v
}

// GetTags returns the Tags field value if set, zero value otherwise.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetTags() []ModDataGetEntries200ResponseEntriesInnerTagsInner {
	if o == nil || IsNil(o.Tags) {
		var ret []ModDataGetEntries200ResponseEntriesInnerTagsInner
		return ret
	}
	return o.Tags
}

// GetTagsOk returns a tuple with the Tags field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetTagsOk() ([]ModDataGetEntries200ResponseEntriesInnerTagsInner, bool) {
	if o == nil || IsNil(o.Tags) {
		return nil, false
	}
	return o.Tags, true
}

// HasTags returns a boolean if a field has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasTags() bool {
	if o != nil && !IsNil(o.Tags) {
		return true
	}

	return false
}

// SetTags gets a reference to the given []ModDataGetEntries200ResponseEntriesInnerTagsInner and assigns it to the Tags field.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetTags(v []ModDataGetEntries200ResponseEntriesInnerTagsInner) {
	o.Tags = v
}

// GetTeacherentry returns the Teacherentry field value if set, zero value otherwise.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetTeacherentry() bool {
	if o == nil || IsNil(o.Teacherentry) {
		var ret bool
		return ret
	}
	return *o.Teacherentry
}

// GetTeacherentryOk returns a tuple with the Teacherentry field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetTeacherentryOk() (*bool, bool) {
	if o == nil || IsNil(o.Teacherentry) {
		return nil, false
	}
	return o.Teacherentry, true
}

// HasTeacherentry returns a boolean if a field has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasTeacherentry() bool {
	if o != nil && !IsNil(o.Teacherentry) {
		return true
	}

	return false
}

// SetTeacherentry gets a reference to the given bool and assigns it to the Teacherentry field.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetTeacherentry(v bool) {
	o.Teacherentry = &v
}

// GetTimecreated returns the Timecreated field value if set, zero value otherwise.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetTimecreated() int32 {
	if o == nil || IsNil(o.Timecreated) {
		var ret int32
		return ret
	}
	return *o.Timecreated
}

// GetTimecreatedOk returns a tuple with the Timecreated field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetTimecreatedOk() (*int32, bool) {
	if o == nil || IsNil(o.Timecreated) {
		return nil, false
	}
	return o.Timecreated, true
}

// HasTimecreated returns a boolean if a field has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasTimecreated() bool {
	if o != nil && !IsNil(o.Timecreated) {
		return true
	}

	return false
}

// SetTimecreated gets a reference to the given int32 and assigns it to the Timecreated field.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetTimecreated(v int32) {
	o.Timecreated = &v
}

// GetTimemodified returns the Timemodified field value if set, zero value otherwise.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetTimemodified() int32 {
	if o == nil || IsNil(o.Timemodified) {
		var ret int32
		return ret
	}
	return *o.Timemodified
}

// GetTimemodifiedOk returns a tuple with the Timemodified field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetTimemodifiedOk() (*int32, bool) {
	if o == nil || IsNil(o.Timemodified) {
		return nil, false
	}
	return o.Timemodified, true
}

// HasTimemodified returns a boolean if a field has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasTimemodified() bool {
	if o != nil && !IsNil(o.Timemodified) {
		return true
	}

	return false
}

// SetTimemodified gets a reference to the given int32 and assigns it to the Timemodified field.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetTimemodified(v int32) {
	o.Timemodified = &v
}

// GetUsedynalink returns the Usedynalink field value if set, zero value otherwise.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetUsedynalink() bool {
	if o == nil || IsNil(o.Usedynalink) {
		var ret bool
		return ret
	}
	return *o.Usedynalink
}

// GetUsedynalinkOk returns a tuple with the Usedynalink field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetUsedynalinkOk() (*bool, bool) {
	if o == nil || IsNil(o.Usedynalink) {
		return nil, false
	}
	return o.Usedynalink, true
}

// HasUsedynalink returns a boolean if a field has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasUsedynalink() bool {
	if o != nil && !IsNil(o.Usedynalink) {
		return true
	}

	return false
}

// SetUsedynalink gets a reference to the given bool and assigns it to the Usedynalink field.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetUsedynalink(v bool) {
	o.Usedynalink = &v
}

// GetUserfullname returns the Userfullname field value if set, zero value otherwise.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetUserfullname() string {
	if o == nil || IsNil(o.Userfullname) {
		var ret string
		return ret
	}
	return *o.Userfullname
}

// GetUserfullnameOk returns a tuple with the Userfullname field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetUserfullnameOk() (*string, bool) {
	if o == nil || IsNil(o.Userfullname) {
		return nil, false
	}
	return o.Userfullname, true
}

// HasUserfullname returns a boolean if a field has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasUserfullname() bool {
	if o != nil && !IsNil(o.Userfullname) {
		return true
	}

	return false
}

// SetUserfullname gets a reference to the given string and assigns it to the Userfullname field.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetUserfullname(v string) {
	o.Userfullname = &v
}

// GetUserid returns the Userid field value if set, zero value otherwise.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetUserid() int32 {
	if o == nil || IsNil(o.Userid) {
		var ret int32
		return ret
	}
	return *o.Userid
}

// GetUseridOk returns a tuple with the Userid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetUseridOk() (*int32, bool) {
	if o == nil || IsNil(o.Userid) {
		return nil, false
	}
	return o.Userid, true
}

// HasUserid returns a boolean if a field has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasUserid() bool {
	if o != nil && !IsNil(o.Userid) {
		return true
	}

	return false
}

// SetUserid gets a reference to the given int32 and assigns it to the Userid field.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetUserid(v int32) {
	o.Userid = &v
}

// GetUserpictureurl returns the Userpictureurl field value if set, zero value otherwise.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetUserpictureurl() string {
	if o == nil || IsNil(o.Userpictureurl) {
		var ret string
		return ret
	}
	return *o.Userpictureurl
}

// GetUserpictureurlOk returns a tuple with the Userpictureurl field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetUserpictureurlOk() (*string, bool) {
	if o == nil || IsNil(o.Userpictureurl) {
		return nil, false
	}
	return o.Userpictureurl, true
}

// HasUserpictureurl returns a boolean if a field has been set.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasUserpictureurl() bool {
	if o != nil && !IsNil(o.Userpictureurl) {
		return true
	}

	return false
}

// SetUserpictureurl gets a reference to the given string and assigns it to the Userpictureurl field.
func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetUserpictureurl(v string) {
	o.Userpictureurl = &v
}

func (o ModGlossaryGetEntriesByCategory200ResponseEntriesInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModGlossaryGetEntriesByCategory200ResponseEntriesInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Approved) {
		toSerialize["approved"] = o.Approved
	}
	if !IsNil(o.Attachment) {
		toSerialize["attachment"] = o.Attachment
	}
	if !IsNil(o.Attachments) {
		toSerialize["attachments"] = o.Attachments
	}
	if !IsNil(o.Casesensitive) {
		toSerialize["casesensitive"] = o.Casesensitive
	}
	if !IsNil(o.Categoryid) {
		toSerialize["categoryid"] = o.Categoryid
	}
	if !IsNil(o.Categoryname) {
		toSerialize["categoryname"] = o.Categoryname
	}
	if !IsNil(o.Concept) {
		toSerialize["concept"] = o.Concept
	}
	if !IsNil(o.Definition) {
		toSerialize["definition"] = o.Definition
	}
	if !IsNil(o.Definitionformat) {
		toSerialize["definitionformat"] = o.Definitionformat
	}
	if !IsNil(o.Definitioninlinefiles) {
		toSerialize["definitioninlinefiles"] = o.Definitioninlinefiles
	}
	if !IsNil(o.Definitiontrust) {
		toSerialize["definitiontrust"] = o.Definitiontrust
	}
	if !IsNil(o.Fullmatch) {
		toSerialize["fullmatch"] = o.Fullmatch
	}
	if !IsNil(o.Glossaryid) {
		toSerialize["glossaryid"] = o.Glossaryid
	}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.Sourceglossaryid) {
		toSerialize["sourceglossaryid"] = o.Sourceglossaryid
	}
	if !IsNil(o.Tags) {
		toSerialize["tags"] = o.Tags
	}
	if !IsNil(o.Teacherentry) {
		toSerialize["teacherentry"] = o.Teacherentry
	}
	if !IsNil(o.Timecreated) {
		toSerialize["timecreated"] = o.Timecreated
	}
	if !IsNil(o.Timemodified) {
		toSerialize["timemodified"] = o.Timemodified
	}
	if !IsNil(o.Usedynalink) {
		toSerialize["usedynalink"] = o.Usedynalink
	}
	if !IsNil(o.Userfullname) {
		toSerialize["userfullname"] = o.Userfullname
	}
	if !IsNil(o.Userid) {
		toSerialize["userid"] = o.Userid
	}
	if !IsNil(o.Userpictureurl) {
		toSerialize["userpictureurl"] = o.Userpictureurl
	}
	return toSerialize, nil
}

type NullableModGlossaryGetEntriesByCategory200ResponseEntriesInner struct {
	value *ModGlossaryGetEntriesByCategory200ResponseEntriesInner
	isSet bool
}

func (v NullableModGlossaryGetEntriesByCategory200ResponseEntriesInner) Get() *ModGlossaryGetEntriesByCategory200ResponseEntriesInner {
	return v.value
}

func (v *NullableModGlossaryGetEntriesByCategory200ResponseEntriesInner) Set(val *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) {
	v.value = val
	v.isSet = true
}

func (v NullableModGlossaryGetEntriesByCategory200ResponseEntriesInner) IsSet() bool {
	return v.isSet
}

func (v *NullableModGlossaryGetEntriesByCategory200ResponseEntriesInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModGlossaryGetEntriesByCategory200ResponseEntriesInner(val *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) *NullableModGlossaryGetEntriesByCategory200ResponseEntriesInner {
	return &NullableModGlossaryGetEntriesByCategory200ResponseEntriesInner{value: val, isSet: true}
}

func (v NullableModGlossaryGetEntriesByCategory200ResponseEntriesInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModGlossaryGetEntriesByCategory200ResponseEntriesInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

