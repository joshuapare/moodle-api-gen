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

// checks if the CoreBlogGetEntries200ResponseEntriesInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreBlogGetEntries200ResponseEntriesInner{}

// CoreBlogGetEntries200ResponseEntriesInner struct for CoreBlogGetEntries200ResponseEntriesInner
type CoreBlogGetEntries200ResponseEntriesInner struct {
	// Post atachment.
	Attachment *string `json:"attachment,omitempty"`
	Attachmentfiles []CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner `json:"attachmentfiles,omitempty"`
	// Post content.
	Content *string `json:"content,omitempty"`
	// Course where the post was created.
	Courseid *int32 `json:"courseid,omitempty"`
	// Course module id where the post was created.
	Coursemoduleid *int32 `json:"coursemoduleid,omitempty"`
	// When it was created.
	Created *int32 `json:"created,omitempty"`
	// Post content format.
	Format *int32 `json:"format,omitempty"`
	// Group post was created for.
	Groupid *int32 `json:"groupid,omitempty"`
	// Post/entry id.
	Id *int32 `json:"id,omitempty"`
	// When it was last modified.
	Lastmodified *int32 `json:"lastmodified,omitempty"`
	// Where it was published the post (blog, blog_external...).
	Module *string `json:"module,omitempty"`
	// Module id where the post was created (not used anymore).
	Moduleid *int32 `json:"moduleid,omitempty"`
	// Post publish state.
	Publishstate *string `json:"publishstate,omitempty"`
	// Post rating.
	Rating *int32 `json:"rating,omitempty"`
	// Post subject.
	Subject *string `json:"subject,omitempty"`
	// Post summary.
	Summary *string `json:"summary,omitempty"`
	Summaryfiles []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner `json:"summaryfiles,omitempty"`
	// summary format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
	Summaryformat *int32 `json:"summaryformat,omitempty"`
	Tags []CoreBlogGetEntries200ResponseEntriesInnerTagsInner `json:"tags,omitempty"`
	// Post unique hash.
	Uniquehash *string `json:"uniquehash,omitempty"`
	// Post author.
	Userid *int32 `json:"userid,omitempty"`
	// User that updated the post.
	Usermodified *int32 `json:"usermodified,omitempty"`
}

// NewCoreBlogGetEntries200ResponseEntriesInner instantiates a new CoreBlogGetEntries200ResponseEntriesInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreBlogGetEntries200ResponseEntriesInner() *CoreBlogGetEntries200ResponseEntriesInner {
	this := CoreBlogGetEntries200ResponseEntriesInner{}
	var attachment string = "null"
	this.Attachment = &attachment
	var content string = "null"
	this.Content = &content
	var courseid int32 = 0
	this.Courseid = &courseid
	var coursemoduleid int32 = 0
	this.Coursemoduleid = &coursemoduleid
	var created int32 = 0
	this.Created = &created
	var format int32 = 0
	this.Format = &format
	var groupid int32 = 0
	this.Groupid = &groupid
	var id int32 = null
	this.Id = &id
	var lastmodified int32 = 0
	this.Lastmodified = &lastmodified
	var module string = "null"
	this.Module = &module
	var moduleid int32 = 0
	this.Moduleid = &moduleid
	var publishstate string = "draft"
	this.Publishstate = &publishstate
	var rating int32 = 0
	this.Rating = &rating
	var subject string = "null"
	this.Subject = &subject
	var summary string = "null"
	this.Summary = &summary
	var summaryformat int32 = 0
	this.Summaryformat = &summaryformat
	var uniquehash string = "null"
	this.Uniquehash = &uniquehash
	var userid int32 = 0
	this.Userid = &userid
	var usermodified int32 = null
	this.Usermodified = &usermodified
	return &this
}

// NewCoreBlogGetEntries200ResponseEntriesInnerWithDefaults instantiates a new CoreBlogGetEntries200ResponseEntriesInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreBlogGetEntries200ResponseEntriesInnerWithDefaults() *CoreBlogGetEntries200ResponseEntriesInner {
	this := CoreBlogGetEntries200ResponseEntriesInner{}
	var attachment string = "null"
	this.Attachment = &attachment
	var content string = "null"
	this.Content = &content
	var courseid int32 = 0
	this.Courseid = &courseid
	var coursemoduleid int32 = 0
	this.Coursemoduleid = &coursemoduleid
	var created int32 = 0
	this.Created = &created
	var format int32 = 0
	this.Format = &format
	var groupid int32 = 0
	this.Groupid = &groupid
	var id int32 = null
	this.Id = &id
	var lastmodified int32 = 0
	this.Lastmodified = &lastmodified
	var module string = "null"
	this.Module = &module
	var moduleid int32 = 0
	this.Moduleid = &moduleid
	var publishstate string = "draft"
	this.Publishstate = &publishstate
	var rating int32 = 0
	this.Rating = &rating
	var subject string = "null"
	this.Subject = &subject
	var summary string = "null"
	this.Summary = &summary
	var summaryformat int32 = 0
	this.Summaryformat = &summaryformat
	var uniquehash string = "null"
	this.Uniquehash = &uniquehash
	var userid int32 = 0
	this.Userid = &userid
	var usermodified int32 = null
	this.Usermodified = &usermodified
	return &this
}

// GetAttachment returns the Attachment field value if set, zero value otherwise.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetAttachment() string {
	if o == nil || IsNil(o.Attachment) {
		var ret string
		return ret
	}
	return *o.Attachment
}

// GetAttachmentOk returns a tuple with the Attachment field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetAttachmentOk() (*string, bool) {
	if o == nil || IsNil(o.Attachment) {
		return nil, false
	}
	return o.Attachment, true
}

// HasAttachment returns a boolean if a field has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) HasAttachment() bool {
	if o != nil && !IsNil(o.Attachment) {
		return true
	}

	return false
}

// SetAttachment gets a reference to the given string and assigns it to the Attachment field.
func (o *CoreBlogGetEntries200ResponseEntriesInner) SetAttachment(v string) {
	o.Attachment = &v
}

// GetAttachmentfiles returns the Attachmentfiles field value if set, zero value otherwise.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetAttachmentfiles() []CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner {
	if o == nil || IsNil(o.Attachmentfiles) {
		var ret []CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner
		return ret
	}
	return o.Attachmentfiles
}

// GetAttachmentfilesOk returns a tuple with the Attachmentfiles field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetAttachmentfilesOk() ([]CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner, bool) {
	if o == nil || IsNil(o.Attachmentfiles) {
		return nil, false
	}
	return o.Attachmentfiles, true
}

// HasAttachmentfiles returns a boolean if a field has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) HasAttachmentfiles() bool {
	if o != nil && !IsNil(o.Attachmentfiles) {
		return true
	}

	return false
}

// SetAttachmentfiles gets a reference to the given []CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner and assigns it to the Attachmentfiles field.
func (o *CoreBlogGetEntries200ResponseEntriesInner) SetAttachmentfiles(v []CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner) {
	o.Attachmentfiles = v
}

// GetContent returns the Content field value if set, zero value otherwise.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetContent() string {
	if o == nil || IsNil(o.Content) {
		var ret string
		return ret
	}
	return *o.Content
}

// GetContentOk returns a tuple with the Content field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetContentOk() (*string, bool) {
	if o == nil || IsNil(o.Content) {
		return nil, false
	}
	return o.Content, true
}

// HasContent returns a boolean if a field has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) HasContent() bool {
	if o != nil && !IsNil(o.Content) {
		return true
	}

	return false
}

// SetContent gets a reference to the given string and assigns it to the Content field.
func (o *CoreBlogGetEntries200ResponseEntriesInner) SetContent(v string) {
	o.Content = &v
}

// GetCourseid returns the Courseid field value if set, zero value otherwise.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetCourseid() int32 {
	if o == nil || IsNil(o.Courseid) {
		var ret int32
		return ret
	}
	return *o.Courseid
}

// GetCourseidOk returns a tuple with the Courseid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetCourseidOk() (*int32, bool) {
	if o == nil || IsNil(o.Courseid) {
		return nil, false
	}
	return o.Courseid, true
}

// HasCourseid returns a boolean if a field has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) HasCourseid() bool {
	if o != nil && !IsNil(o.Courseid) {
		return true
	}

	return false
}

// SetCourseid gets a reference to the given int32 and assigns it to the Courseid field.
func (o *CoreBlogGetEntries200ResponseEntriesInner) SetCourseid(v int32) {
	o.Courseid = &v
}

// GetCoursemoduleid returns the Coursemoduleid field value if set, zero value otherwise.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetCoursemoduleid() int32 {
	if o == nil || IsNil(o.Coursemoduleid) {
		var ret int32
		return ret
	}
	return *o.Coursemoduleid
}

// GetCoursemoduleidOk returns a tuple with the Coursemoduleid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetCoursemoduleidOk() (*int32, bool) {
	if o == nil || IsNil(o.Coursemoduleid) {
		return nil, false
	}
	return o.Coursemoduleid, true
}

// HasCoursemoduleid returns a boolean if a field has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) HasCoursemoduleid() bool {
	if o != nil && !IsNil(o.Coursemoduleid) {
		return true
	}

	return false
}

// SetCoursemoduleid gets a reference to the given int32 and assigns it to the Coursemoduleid field.
func (o *CoreBlogGetEntries200ResponseEntriesInner) SetCoursemoduleid(v int32) {
	o.Coursemoduleid = &v
}

// GetCreated returns the Created field value if set, zero value otherwise.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetCreated() int32 {
	if o == nil || IsNil(o.Created) {
		var ret int32
		return ret
	}
	return *o.Created
}

// GetCreatedOk returns a tuple with the Created field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetCreatedOk() (*int32, bool) {
	if o == nil || IsNil(o.Created) {
		return nil, false
	}
	return o.Created, true
}

// HasCreated returns a boolean if a field has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) HasCreated() bool {
	if o != nil && !IsNil(o.Created) {
		return true
	}

	return false
}

// SetCreated gets a reference to the given int32 and assigns it to the Created field.
func (o *CoreBlogGetEntries200ResponseEntriesInner) SetCreated(v int32) {
	o.Created = &v
}

// GetFormat returns the Format field value if set, zero value otherwise.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetFormat() int32 {
	if o == nil || IsNil(o.Format) {
		var ret int32
		return ret
	}
	return *o.Format
}

// GetFormatOk returns a tuple with the Format field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetFormatOk() (*int32, bool) {
	if o == nil || IsNil(o.Format) {
		return nil, false
	}
	return o.Format, true
}

// HasFormat returns a boolean if a field has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) HasFormat() bool {
	if o != nil && !IsNil(o.Format) {
		return true
	}

	return false
}

// SetFormat gets a reference to the given int32 and assigns it to the Format field.
func (o *CoreBlogGetEntries200ResponseEntriesInner) SetFormat(v int32) {
	o.Format = &v
}

// GetGroupid returns the Groupid field value if set, zero value otherwise.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetGroupid() int32 {
	if o == nil || IsNil(o.Groupid) {
		var ret int32
		return ret
	}
	return *o.Groupid
}

// GetGroupidOk returns a tuple with the Groupid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetGroupidOk() (*int32, bool) {
	if o == nil || IsNil(o.Groupid) {
		return nil, false
	}
	return o.Groupid, true
}

// HasGroupid returns a boolean if a field has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) HasGroupid() bool {
	if o != nil && !IsNil(o.Groupid) {
		return true
	}

	return false
}

// SetGroupid gets a reference to the given int32 and assigns it to the Groupid field.
func (o *CoreBlogGetEntries200ResponseEntriesInner) SetGroupid(v int32) {
	o.Groupid = &v
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetId() int32 {
	if o == nil || IsNil(o.Id) {
		var ret int32
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetIdOk() (*int32, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given int32 and assigns it to the Id field.
func (o *CoreBlogGetEntries200ResponseEntriesInner) SetId(v int32) {
	o.Id = &v
}

// GetLastmodified returns the Lastmodified field value if set, zero value otherwise.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetLastmodified() int32 {
	if o == nil || IsNil(o.Lastmodified) {
		var ret int32
		return ret
	}
	return *o.Lastmodified
}

// GetLastmodifiedOk returns a tuple with the Lastmodified field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetLastmodifiedOk() (*int32, bool) {
	if o == nil || IsNil(o.Lastmodified) {
		return nil, false
	}
	return o.Lastmodified, true
}

// HasLastmodified returns a boolean if a field has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) HasLastmodified() bool {
	if o != nil && !IsNil(o.Lastmodified) {
		return true
	}

	return false
}

// SetLastmodified gets a reference to the given int32 and assigns it to the Lastmodified field.
func (o *CoreBlogGetEntries200ResponseEntriesInner) SetLastmodified(v int32) {
	o.Lastmodified = &v
}

// GetModule returns the Module field value if set, zero value otherwise.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetModule() string {
	if o == nil || IsNil(o.Module) {
		var ret string
		return ret
	}
	return *o.Module
}

// GetModuleOk returns a tuple with the Module field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetModuleOk() (*string, bool) {
	if o == nil || IsNil(o.Module) {
		return nil, false
	}
	return o.Module, true
}

// HasModule returns a boolean if a field has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) HasModule() bool {
	if o != nil && !IsNil(o.Module) {
		return true
	}

	return false
}

// SetModule gets a reference to the given string and assigns it to the Module field.
func (o *CoreBlogGetEntries200ResponseEntriesInner) SetModule(v string) {
	o.Module = &v
}

// GetModuleid returns the Moduleid field value if set, zero value otherwise.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetModuleid() int32 {
	if o == nil || IsNil(o.Moduleid) {
		var ret int32
		return ret
	}
	return *o.Moduleid
}

// GetModuleidOk returns a tuple with the Moduleid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetModuleidOk() (*int32, bool) {
	if o == nil || IsNil(o.Moduleid) {
		return nil, false
	}
	return o.Moduleid, true
}

// HasModuleid returns a boolean if a field has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) HasModuleid() bool {
	if o != nil && !IsNil(o.Moduleid) {
		return true
	}

	return false
}

// SetModuleid gets a reference to the given int32 and assigns it to the Moduleid field.
func (o *CoreBlogGetEntries200ResponseEntriesInner) SetModuleid(v int32) {
	o.Moduleid = &v
}

// GetPublishstate returns the Publishstate field value if set, zero value otherwise.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetPublishstate() string {
	if o == nil || IsNil(o.Publishstate) {
		var ret string
		return ret
	}
	return *o.Publishstate
}

// GetPublishstateOk returns a tuple with the Publishstate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetPublishstateOk() (*string, bool) {
	if o == nil || IsNil(o.Publishstate) {
		return nil, false
	}
	return o.Publishstate, true
}

// HasPublishstate returns a boolean if a field has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) HasPublishstate() bool {
	if o != nil && !IsNil(o.Publishstate) {
		return true
	}

	return false
}

// SetPublishstate gets a reference to the given string and assigns it to the Publishstate field.
func (o *CoreBlogGetEntries200ResponseEntriesInner) SetPublishstate(v string) {
	o.Publishstate = &v
}

// GetRating returns the Rating field value if set, zero value otherwise.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetRating() int32 {
	if o == nil || IsNil(o.Rating) {
		var ret int32
		return ret
	}
	return *o.Rating
}

// GetRatingOk returns a tuple with the Rating field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetRatingOk() (*int32, bool) {
	if o == nil || IsNil(o.Rating) {
		return nil, false
	}
	return o.Rating, true
}

// HasRating returns a boolean if a field has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) HasRating() bool {
	if o != nil && !IsNil(o.Rating) {
		return true
	}

	return false
}

// SetRating gets a reference to the given int32 and assigns it to the Rating field.
func (o *CoreBlogGetEntries200ResponseEntriesInner) SetRating(v int32) {
	o.Rating = &v
}

// GetSubject returns the Subject field value if set, zero value otherwise.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetSubject() string {
	if o == nil || IsNil(o.Subject) {
		var ret string
		return ret
	}
	return *o.Subject
}

// GetSubjectOk returns a tuple with the Subject field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetSubjectOk() (*string, bool) {
	if o == nil || IsNil(o.Subject) {
		return nil, false
	}
	return o.Subject, true
}

// HasSubject returns a boolean if a field has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) HasSubject() bool {
	if o != nil && !IsNil(o.Subject) {
		return true
	}

	return false
}

// SetSubject gets a reference to the given string and assigns it to the Subject field.
func (o *CoreBlogGetEntries200ResponseEntriesInner) SetSubject(v string) {
	o.Subject = &v
}

// GetSummary returns the Summary field value if set, zero value otherwise.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetSummary() string {
	if o == nil || IsNil(o.Summary) {
		var ret string
		return ret
	}
	return *o.Summary
}

// GetSummaryOk returns a tuple with the Summary field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetSummaryOk() (*string, bool) {
	if o == nil || IsNil(o.Summary) {
		return nil, false
	}
	return o.Summary, true
}

// HasSummary returns a boolean if a field has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) HasSummary() bool {
	if o != nil && !IsNil(o.Summary) {
		return true
	}

	return false
}

// SetSummary gets a reference to the given string and assigns it to the Summary field.
func (o *CoreBlogGetEntries200ResponseEntriesInner) SetSummary(v string) {
	o.Summary = &v
}

// GetSummaryfiles returns the Summaryfiles field value if set, zero value otherwise.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetSummaryfiles() []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner {
	if o == nil || IsNil(o.Summaryfiles) {
		var ret []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner
		return ret
	}
	return o.Summaryfiles
}

// GetSummaryfilesOk returns a tuple with the Summaryfiles field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetSummaryfilesOk() ([]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner, bool) {
	if o == nil || IsNil(o.Summaryfiles) {
		return nil, false
	}
	return o.Summaryfiles, true
}

// HasSummaryfiles returns a boolean if a field has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) HasSummaryfiles() bool {
	if o != nil && !IsNil(o.Summaryfiles) {
		return true
	}

	return false
}

// SetSummaryfiles gets a reference to the given []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner and assigns it to the Summaryfiles field.
func (o *CoreBlogGetEntries200ResponseEntriesInner) SetSummaryfiles(v []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner) {
	o.Summaryfiles = v
}

// GetSummaryformat returns the Summaryformat field value if set, zero value otherwise.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetSummaryformat() int32 {
	if o == nil || IsNil(o.Summaryformat) {
		var ret int32
		return ret
	}
	return *o.Summaryformat
}

// GetSummaryformatOk returns a tuple with the Summaryformat field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetSummaryformatOk() (*int32, bool) {
	if o == nil || IsNil(o.Summaryformat) {
		return nil, false
	}
	return o.Summaryformat, true
}

// HasSummaryformat returns a boolean if a field has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) HasSummaryformat() bool {
	if o != nil && !IsNil(o.Summaryformat) {
		return true
	}

	return false
}

// SetSummaryformat gets a reference to the given int32 and assigns it to the Summaryformat field.
func (o *CoreBlogGetEntries200ResponseEntriesInner) SetSummaryformat(v int32) {
	o.Summaryformat = &v
}

// GetTags returns the Tags field value if set, zero value otherwise.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetTags() []CoreBlogGetEntries200ResponseEntriesInnerTagsInner {
	if o == nil || IsNil(o.Tags) {
		var ret []CoreBlogGetEntries200ResponseEntriesInnerTagsInner
		return ret
	}
	return o.Tags
}

// GetTagsOk returns a tuple with the Tags field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetTagsOk() ([]CoreBlogGetEntries200ResponseEntriesInnerTagsInner, bool) {
	if o == nil || IsNil(o.Tags) {
		return nil, false
	}
	return o.Tags, true
}

// HasTags returns a boolean if a field has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) HasTags() bool {
	if o != nil && !IsNil(o.Tags) {
		return true
	}

	return false
}

// SetTags gets a reference to the given []CoreBlogGetEntries200ResponseEntriesInnerTagsInner and assigns it to the Tags field.
func (o *CoreBlogGetEntries200ResponseEntriesInner) SetTags(v []CoreBlogGetEntries200ResponseEntriesInnerTagsInner) {
	o.Tags = v
}

// GetUniquehash returns the Uniquehash field value if set, zero value otherwise.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetUniquehash() string {
	if o == nil || IsNil(o.Uniquehash) {
		var ret string
		return ret
	}
	return *o.Uniquehash
}

// GetUniquehashOk returns a tuple with the Uniquehash field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetUniquehashOk() (*string, bool) {
	if o == nil || IsNil(o.Uniquehash) {
		return nil, false
	}
	return o.Uniquehash, true
}

// HasUniquehash returns a boolean if a field has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) HasUniquehash() bool {
	if o != nil && !IsNil(o.Uniquehash) {
		return true
	}

	return false
}

// SetUniquehash gets a reference to the given string and assigns it to the Uniquehash field.
func (o *CoreBlogGetEntries200ResponseEntriesInner) SetUniquehash(v string) {
	o.Uniquehash = &v
}

// GetUserid returns the Userid field value if set, zero value otherwise.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetUserid() int32 {
	if o == nil || IsNil(o.Userid) {
		var ret int32
		return ret
	}
	return *o.Userid
}

// GetUseridOk returns a tuple with the Userid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetUseridOk() (*int32, bool) {
	if o == nil || IsNil(o.Userid) {
		return nil, false
	}
	return o.Userid, true
}

// HasUserid returns a boolean if a field has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) HasUserid() bool {
	if o != nil && !IsNil(o.Userid) {
		return true
	}

	return false
}

// SetUserid gets a reference to the given int32 and assigns it to the Userid field.
func (o *CoreBlogGetEntries200ResponseEntriesInner) SetUserid(v int32) {
	o.Userid = &v
}

// GetUsermodified returns the Usermodified field value if set, zero value otherwise.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetUsermodified() int32 {
	if o == nil || IsNil(o.Usermodified) {
		var ret int32
		return ret
	}
	return *o.Usermodified
}

// GetUsermodifiedOk returns a tuple with the Usermodified field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) GetUsermodifiedOk() (*int32, bool) {
	if o == nil || IsNil(o.Usermodified) {
		return nil, false
	}
	return o.Usermodified, true
}

// HasUsermodified returns a boolean if a field has been set.
func (o *CoreBlogGetEntries200ResponseEntriesInner) HasUsermodified() bool {
	if o != nil && !IsNil(o.Usermodified) {
		return true
	}

	return false
}

// SetUsermodified gets a reference to the given int32 and assigns it to the Usermodified field.
func (o *CoreBlogGetEntries200ResponseEntriesInner) SetUsermodified(v int32) {
	o.Usermodified = &v
}

func (o CoreBlogGetEntries200ResponseEntriesInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreBlogGetEntries200ResponseEntriesInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Attachment) {
		toSerialize["attachment"] = o.Attachment
	}
	if !IsNil(o.Attachmentfiles) {
		toSerialize["attachmentfiles"] = o.Attachmentfiles
	}
	if !IsNil(o.Content) {
		toSerialize["content"] = o.Content
	}
	if !IsNil(o.Courseid) {
		toSerialize["courseid"] = o.Courseid
	}
	if !IsNil(o.Coursemoduleid) {
		toSerialize["coursemoduleid"] = o.Coursemoduleid
	}
	if !IsNil(o.Created) {
		toSerialize["created"] = o.Created
	}
	if !IsNil(o.Format) {
		toSerialize["format"] = o.Format
	}
	if !IsNil(o.Groupid) {
		toSerialize["groupid"] = o.Groupid
	}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.Lastmodified) {
		toSerialize["lastmodified"] = o.Lastmodified
	}
	if !IsNil(o.Module) {
		toSerialize["module"] = o.Module
	}
	if !IsNil(o.Moduleid) {
		toSerialize["moduleid"] = o.Moduleid
	}
	if !IsNil(o.Publishstate) {
		toSerialize["publishstate"] = o.Publishstate
	}
	if !IsNil(o.Rating) {
		toSerialize["rating"] = o.Rating
	}
	if !IsNil(o.Subject) {
		toSerialize["subject"] = o.Subject
	}
	if !IsNil(o.Summary) {
		toSerialize["summary"] = o.Summary
	}
	if !IsNil(o.Summaryfiles) {
		toSerialize["summaryfiles"] = o.Summaryfiles
	}
	if !IsNil(o.Summaryformat) {
		toSerialize["summaryformat"] = o.Summaryformat
	}
	if !IsNil(o.Tags) {
		toSerialize["tags"] = o.Tags
	}
	if !IsNil(o.Uniquehash) {
		toSerialize["uniquehash"] = o.Uniquehash
	}
	if !IsNil(o.Userid) {
		toSerialize["userid"] = o.Userid
	}
	if !IsNil(o.Usermodified) {
		toSerialize["usermodified"] = o.Usermodified
	}
	return toSerialize, nil
}

type NullableCoreBlogGetEntries200ResponseEntriesInner struct {
	value *CoreBlogGetEntries200ResponseEntriesInner
	isSet bool
}

func (v NullableCoreBlogGetEntries200ResponseEntriesInner) Get() *CoreBlogGetEntries200ResponseEntriesInner {
	return v.value
}

func (v *NullableCoreBlogGetEntries200ResponseEntriesInner) Set(val *CoreBlogGetEntries200ResponseEntriesInner) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreBlogGetEntries200ResponseEntriesInner) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreBlogGetEntries200ResponseEntriesInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreBlogGetEntries200ResponseEntriesInner(val *CoreBlogGetEntries200ResponseEntriesInner) *NullableCoreBlogGetEntries200ResponseEntriesInner {
	return &NullableCoreBlogGetEntries200ResponseEntriesInner{value: val, isSet: true}
}

func (v NullableCoreBlogGetEntries200ResponseEntriesInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreBlogGetEntries200ResponseEntriesInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


