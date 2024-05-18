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

// checks if the ModPageGetPagesByCourses200ResponsePagesInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModPageGetPagesByCourses200ResponsePagesInner{}

// ModPageGetPagesByCourses200ResponsePagesInner struct for ModPageGetPagesByCourses200ResponsePagesInner
type ModPageGetPagesByCourses200ResponsePagesInner struct {
	// Page content
	Content *string `json:"content,omitempty"`
	Contentfiles []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner `json:"contentfiles,omitempty"`
	// content format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
	Contentformat *int32 `json:"contentformat,omitempty"`
	// Course id
	Course *int32 `json:"course,omitempty"`
	// Course module id
	Coursemodule *int32 `json:"coursemodule,omitempty"`
	// How to display the page
	Display *int32 `json:"display,omitempty"`
	// Display options (width, height)
	Displayoptions *string `json:"displayoptions,omitempty"`
	// Group id
	Groupingid *int32 `json:"groupingid,omitempty"`
	// Group mode
	Groupmode *int32 `json:"groupmode,omitempty"`
	// Activity instance id
	Id *int32 `json:"id,omitempty"`
	// Activity introduction
	Intro *string `json:"intro,omitempty"`
	Introfiles []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner `json:"introfiles,omitempty"`
	// intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
	Introformat *int32 `json:"introformat,omitempty"`
	// Forced activity language
	Lang *string `json:"lang,omitempty"`
	// Legacy files flag
	Legacyfiles *int32 `json:"legacyfiles,omitempty"`
	// Legacy files last control flag
	Legacyfileslast *int32 `json:"legacyfileslast,omitempty"`
	// Activity name
	Name *string `json:"name,omitempty"`
	// Incremented when after each file changes, to avoid cache
	Revision *int32 `json:"revision,omitempty"`
	// Course section id
	Section *int32 `json:"section,omitempty"`
	// Last time the page was modified
	Timemodified *int32 `json:"timemodified,omitempty"`
	// Visible
	Visible *bool `json:"visible,omitempty"`
}

// NewModPageGetPagesByCourses200ResponsePagesInner instantiates a new ModPageGetPagesByCourses200ResponsePagesInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModPageGetPagesByCourses200ResponsePagesInner() *ModPageGetPagesByCourses200ResponsePagesInner {
	this := ModPageGetPagesByCourses200ResponsePagesInner{}
	var content string = "null"
	this.Content = &content
	var display int32 = null
	this.Display = &display
	var displayoptions string = "null"
	this.Displayoptions = &displayoptions
	var legacyfiles int32 = null
	this.Legacyfiles = &legacyfiles
	var legacyfileslast int32 = null
	this.Legacyfileslast = &legacyfileslast
	var timemodified int32 = null
	this.Timemodified = &timemodified
	return &this
}

// NewModPageGetPagesByCourses200ResponsePagesInnerWithDefaults instantiates a new ModPageGetPagesByCourses200ResponsePagesInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModPageGetPagesByCourses200ResponsePagesInnerWithDefaults() *ModPageGetPagesByCourses200ResponsePagesInner {
	this := ModPageGetPagesByCourses200ResponsePagesInner{}
	var content string = "null"
	this.Content = &content
	var display int32 = null
	this.Display = &display
	var displayoptions string = "null"
	this.Displayoptions = &displayoptions
	var legacyfiles int32 = null
	this.Legacyfiles = &legacyfiles
	var legacyfileslast int32 = null
	this.Legacyfileslast = &legacyfileslast
	var timemodified int32 = null
	this.Timemodified = &timemodified
	return &this
}

// GetContent returns the Content field value if set, zero value otherwise.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetContent() string {
	if o == nil || IsNil(o.Content) {
		var ret string
		return ret
	}
	return *o.Content
}

// GetContentOk returns a tuple with the Content field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetContentOk() (*string, bool) {
	if o == nil || IsNil(o.Content) {
		return nil, false
	}
	return o.Content, true
}

// HasContent returns a boolean if a field has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasContent() bool {
	if o != nil && !IsNil(o.Content) {
		return true
	}

	return false
}

// SetContent gets a reference to the given string and assigns it to the Content field.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetContent(v string) {
	o.Content = &v
}

// GetContentfiles returns the Contentfiles field value if set, zero value otherwise.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetContentfiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner {
	if o == nil || IsNil(o.Contentfiles) {
		var ret []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner
		return ret
	}
	return o.Contentfiles
}

// GetContentfilesOk returns a tuple with the Contentfiles field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetContentfilesOk() ([]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool) {
	if o == nil || IsNil(o.Contentfiles) {
		return nil, false
	}
	return o.Contentfiles, true
}

// HasContentfiles returns a boolean if a field has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasContentfiles() bool {
	if o != nil && !IsNil(o.Contentfiles) {
		return true
	}

	return false
}

// SetContentfiles gets a reference to the given []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner and assigns it to the Contentfiles field.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetContentfiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner) {
	o.Contentfiles = v
}

// GetContentformat returns the Contentformat field value if set, zero value otherwise.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetContentformat() int32 {
	if o == nil || IsNil(o.Contentformat) {
		var ret int32
		return ret
	}
	return *o.Contentformat
}

// GetContentformatOk returns a tuple with the Contentformat field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetContentformatOk() (*int32, bool) {
	if o == nil || IsNil(o.Contentformat) {
		return nil, false
	}
	return o.Contentformat, true
}

// HasContentformat returns a boolean if a field has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasContentformat() bool {
	if o != nil && !IsNil(o.Contentformat) {
		return true
	}

	return false
}

// SetContentformat gets a reference to the given int32 and assigns it to the Contentformat field.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetContentformat(v int32) {
	o.Contentformat = &v
}

// GetCourse returns the Course field value if set, zero value otherwise.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetCourse() int32 {
	if o == nil || IsNil(o.Course) {
		var ret int32
		return ret
	}
	return *o.Course
}

// GetCourseOk returns a tuple with the Course field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetCourseOk() (*int32, bool) {
	if o == nil || IsNil(o.Course) {
		return nil, false
	}
	return o.Course, true
}

// HasCourse returns a boolean if a field has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasCourse() bool {
	if o != nil && !IsNil(o.Course) {
		return true
	}

	return false
}

// SetCourse gets a reference to the given int32 and assigns it to the Course field.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetCourse(v int32) {
	o.Course = &v
}

// GetCoursemodule returns the Coursemodule field value if set, zero value otherwise.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetCoursemodule() int32 {
	if o == nil || IsNil(o.Coursemodule) {
		var ret int32
		return ret
	}
	return *o.Coursemodule
}

// GetCoursemoduleOk returns a tuple with the Coursemodule field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetCoursemoduleOk() (*int32, bool) {
	if o == nil || IsNil(o.Coursemodule) {
		return nil, false
	}
	return o.Coursemodule, true
}

// HasCoursemodule returns a boolean if a field has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasCoursemodule() bool {
	if o != nil && !IsNil(o.Coursemodule) {
		return true
	}

	return false
}

// SetCoursemodule gets a reference to the given int32 and assigns it to the Coursemodule field.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetCoursemodule(v int32) {
	o.Coursemodule = &v
}

// GetDisplay returns the Display field value if set, zero value otherwise.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetDisplay() int32 {
	if o == nil || IsNil(o.Display) {
		var ret int32
		return ret
	}
	return *o.Display
}

// GetDisplayOk returns a tuple with the Display field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetDisplayOk() (*int32, bool) {
	if o == nil || IsNil(o.Display) {
		return nil, false
	}
	return o.Display, true
}

// HasDisplay returns a boolean if a field has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasDisplay() bool {
	if o != nil && !IsNil(o.Display) {
		return true
	}

	return false
}

// SetDisplay gets a reference to the given int32 and assigns it to the Display field.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetDisplay(v int32) {
	o.Display = &v
}

// GetDisplayoptions returns the Displayoptions field value if set, zero value otherwise.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetDisplayoptions() string {
	if o == nil || IsNil(o.Displayoptions) {
		var ret string
		return ret
	}
	return *o.Displayoptions
}

// GetDisplayoptionsOk returns a tuple with the Displayoptions field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetDisplayoptionsOk() (*string, bool) {
	if o == nil || IsNil(o.Displayoptions) {
		return nil, false
	}
	return o.Displayoptions, true
}

// HasDisplayoptions returns a boolean if a field has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasDisplayoptions() bool {
	if o != nil && !IsNil(o.Displayoptions) {
		return true
	}

	return false
}

// SetDisplayoptions gets a reference to the given string and assigns it to the Displayoptions field.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetDisplayoptions(v string) {
	o.Displayoptions = &v
}

// GetGroupingid returns the Groupingid field value if set, zero value otherwise.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetGroupingid() int32 {
	if o == nil || IsNil(o.Groupingid) {
		var ret int32
		return ret
	}
	return *o.Groupingid
}

// GetGroupingidOk returns a tuple with the Groupingid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetGroupingidOk() (*int32, bool) {
	if o == nil || IsNil(o.Groupingid) {
		return nil, false
	}
	return o.Groupingid, true
}

// HasGroupingid returns a boolean if a field has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasGroupingid() bool {
	if o != nil && !IsNil(o.Groupingid) {
		return true
	}

	return false
}

// SetGroupingid gets a reference to the given int32 and assigns it to the Groupingid field.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetGroupingid(v int32) {
	o.Groupingid = &v
}

// GetGroupmode returns the Groupmode field value if set, zero value otherwise.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetGroupmode() int32 {
	if o == nil || IsNil(o.Groupmode) {
		var ret int32
		return ret
	}
	return *o.Groupmode
}

// GetGroupmodeOk returns a tuple with the Groupmode field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetGroupmodeOk() (*int32, bool) {
	if o == nil || IsNil(o.Groupmode) {
		return nil, false
	}
	return o.Groupmode, true
}

// HasGroupmode returns a boolean if a field has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasGroupmode() bool {
	if o != nil && !IsNil(o.Groupmode) {
		return true
	}

	return false
}

// SetGroupmode gets a reference to the given int32 and assigns it to the Groupmode field.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetGroupmode(v int32) {
	o.Groupmode = &v
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetId() int32 {
	if o == nil || IsNil(o.Id) {
		var ret int32
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetIdOk() (*int32, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given int32 and assigns it to the Id field.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetId(v int32) {
	o.Id = &v
}

// GetIntro returns the Intro field value if set, zero value otherwise.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetIntro() string {
	if o == nil || IsNil(o.Intro) {
		var ret string
		return ret
	}
	return *o.Intro
}

// GetIntroOk returns a tuple with the Intro field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetIntroOk() (*string, bool) {
	if o == nil || IsNil(o.Intro) {
		return nil, false
	}
	return o.Intro, true
}

// HasIntro returns a boolean if a field has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasIntro() bool {
	if o != nil && !IsNil(o.Intro) {
		return true
	}

	return false
}

// SetIntro gets a reference to the given string and assigns it to the Intro field.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetIntro(v string) {
	o.Intro = &v
}

// GetIntrofiles returns the Introfiles field value if set, zero value otherwise.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetIntrofiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner {
	if o == nil || IsNil(o.Introfiles) {
		var ret []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner
		return ret
	}
	return o.Introfiles
}

// GetIntrofilesOk returns a tuple with the Introfiles field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetIntrofilesOk() ([]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool) {
	if o == nil || IsNil(o.Introfiles) {
		return nil, false
	}
	return o.Introfiles, true
}

// HasIntrofiles returns a boolean if a field has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasIntrofiles() bool {
	if o != nil && !IsNil(o.Introfiles) {
		return true
	}

	return false
}

// SetIntrofiles gets a reference to the given []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner and assigns it to the Introfiles field.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetIntrofiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner) {
	o.Introfiles = v
}

// GetIntroformat returns the Introformat field value if set, zero value otherwise.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetIntroformat() int32 {
	if o == nil || IsNil(o.Introformat) {
		var ret int32
		return ret
	}
	return *o.Introformat
}

// GetIntroformatOk returns a tuple with the Introformat field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetIntroformatOk() (*int32, bool) {
	if o == nil || IsNil(o.Introformat) {
		return nil, false
	}
	return o.Introformat, true
}

// HasIntroformat returns a boolean if a field has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasIntroformat() bool {
	if o != nil && !IsNil(o.Introformat) {
		return true
	}

	return false
}

// SetIntroformat gets a reference to the given int32 and assigns it to the Introformat field.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetIntroformat(v int32) {
	o.Introformat = &v
}

// GetLang returns the Lang field value if set, zero value otherwise.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetLang() string {
	if o == nil || IsNil(o.Lang) {
		var ret string
		return ret
	}
	return *o.Lang
}

// GetLangOk returns a tuple with the Lang field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetLangOk() (*string, bool) {
	if o == nil || IsNil(o.Lang) {
		return nil, false
	}
	return o.Lang, true
}

// HasLang returns a boolean if a field has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasLang() bool {
	if o != nil && !IsNil(o.Lang) {
		return true
	}

	return false
}

// SetLang gets a reference to the given string and assigns it to the Lang field.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetLang(v string) {
	o.Lang = &v
}

// GetLegacyfiles returns the Legacyfiles field value if set, zero value otherwise.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetLegacyfiles() int32 {
	if o == nil || IsNil(o.Legacyfiles) {
		var ret int32
		return ret
	}
	return *o.Legacyfiles
}

// GetLegacyfilesOk returns a tuple with the Legacyfiles field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetLegacyfilesOk() (*int32, bool) {
	if o == nil || IsNil(o.Legacyfiles) {
		return nil, false
	}
	return o.Legacyfiles, true
}

// HasLegacyfiles returns a boolean if a field has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasLegacyfiles() bool {
	if o != nil && !IsNil(o.Legacyfiles) {
		return true
	}

	return false
}

// SetLegacyfiles gets a reference to the given int32 and assigns it to the Legacyfiles field.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetLegacyfiles(v int32) {
	o.Legacyfiles = &v
}

// GetLegacyfileslast returns the Legacyfileslast field value if set, zero value otherwise.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetLegacyfileslast() int32 {
	if o == nil || IsNil(o.Legacyfileslast) {
		var ret int32
		return ret
	}
	return *o.Legacyfileslast
}

// GetLegacyfileslastOk returns a tuple with the Legacyfileslast field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetLegacyfileslastOk() (*int32, bool) {
	if o == nil || IsNil(o.Legacyfileslast) {
		return nil, false
	}
	return o.Legacyfileslast, true
}

// HasLegacyfileslast returns a boolean if a field has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasLegacyfileslast() bool {
	if o != nil && !IsNil(o.Legacyfileslast) {
		return true
	}

	return false
}

// SetLegacyfileslast gets a reference to the given int32 and assigns it to the Legacyfileslast field.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetLegacyfileslast(v int32) {
	o.Legacyfileslast = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetName(v string) {
	o.Name = &v
}

// GetRevision returns the Revision field value if set, zero value otherwise.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetRevision() int32 {
	if o == nil || IsNil(o.Revision) {
		var ret int32
		return ret
	}
	return *o.Revision
}

// GetRevisionOk returns a tuple with the Revision field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetRevisionOk() (*int32, bool) {
	if o == nil || IsNil(o.Revision) {
		return nil, false
	}
	return o.Revision, true
}

// HasRevision returns a boolean if a field has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasRevision() bool {
	if o != nil && !IsNil(o.Revision) {
		return true
	}

	return false
}

// SetRevision gets a reference to the given int32 and assigns it to the Revision field.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetRevision(v int32) {
	o.Revision = &v
}

// GetSection returns the Section field value if set, zero value otherwise.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetSection() int32 {
	if o == nil || IsNil(o.Section) {
		var ret int32
		return ret
	}
	return *o.Section
}

// GetSectionOk returns a tuple with the Section field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetSectionOk() (*int32, bool) {
	if o == nil || IsNil(o.Section) {
		return nil, false
	}
	return o.Section, true
}

// HasSection returns a boolean if a field has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasSection() bool {
	if o != nil && !IsNil(o.Section) {
		return true
	}

	return false
}

// SetSection gets a reference to the given int32 and assigns it to the Section field.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetSection(v int32) {
	o.Section = &v
}

// GetTimemodified returns the Timemodified field value if set, zero value otherwise.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetTimemodified() int32 {
	if o == nil || IsNil(o.Timemodified) {
		var ret int32
		return ret
	}
	return *o.Timemodified
}

// GetTimemodifiedOk returns a tuple with the Timemodified field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetTimemodifiedOk() (*int32, bool) {
	if o == nil || IsNil(o.Timemodified) {
		return nil, false
	}
	return o.Timemodified, true
}

// HasTimemodified returns a boolean if a field has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasTimemodified() bool {
	if o != nil && !IsNil(o.Timemodified) {
		return true
	}

	return false
}

// SetTimemodified gets a reference to the given int32 and assigns it to the Timemodified field.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetTimemodified(v int32) {
	o.Timemodified = &v
}

// GetVisible returns the Visible field value if set, zero value otherwise.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetVisible() bool {
	if o == nil || IsNil(o.Visible) {
		var ret bool
		return ret
	}
	return *o.Visible
}

// GetVisibleOk returns a tuple with the Visible field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) GetVisibleOk() (*bool, bool) {
	if o == nil || IsNil(o.Visible) {
		return nil, false
	}
	return o.Visible, true
}

// HasVisible returns a boolean if a field has been set.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) HasVisible() bool {
	if o != nil && !IsNil(o.Visible) {
		return true
	}

	return false
}

// SetVisible gets a reference to the given bool and assigns it to the Visible field.
func (o *ModPageGetPagesByCourses200ResponsePagesInner) SetVisible(v bool) {
	o.Visible = &v
}

func (o ModPageGetPagesByCourses200ResponsePagesInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModPageGetPagesByCourses200ResponsePagesInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Content) {
		toSerialize["content"] = o.Content
	}
	if !IsNil(o.Contentfiles) {
		toSerialize["contentfiles"] = o.Contentfiles
	}
	if !IsNil(o.Contentformat) {
		toSerialize["contentformat"] = o.Contentformat
	}
	if !IsNil(o.Course) {
		toSerialize["course"] = o.Course
	}
	if !IsNil(o.Coursemodule) {
		toSerialize["coursemodule"] = o.Coursemodule
	}
	if !IsNil(o.Display) {
		toSerialize["display"] = o.Display
	}
	if !IsNil(o.Displayoptions) {
		toSerialize["displayoptions"] = o.Displayoptions
	}
	if !IsNil(o.Groupingid) {
		toSerialize["groupingid"] = o.Groupingid
	}
	if !IsNil(o.Groupmode) {
		toSerialize["groupmode"] = o.Groupmode
	}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.Intro) {
		toSerialize["intro"] = o.Intro
	}
	if !IsNil(o.Introfiles) {
		toSerialize["introfiles"] = o.Introfiles
	}
	if !IsNil(o.Introformat) {
		toSerialize["introformat"] = o.Introformat
	}
	if !IsNil(o.Lang) {
		toSerialize["lang"] = o.Lang
	}
	if !IsNil(o.Legacyfiles) {
		toSerialize["legacyfiles"] = o.Legacyfiles
	}
	if !IsNil(o.Legacyfileslast) {
		toSerialize["legacyfileslast"] = o.Legacyfileslast
	}
	if !IsNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !IsNil(o.Revision) {
		toSerialize["revision"] = o.Revision
	}
	if !IsNil(o.Section) {
		toSerialize["section"] = o.Section
	}
	if !IsNil(o.Timemodified) {
		toSerialize["timemodified"] = o.Timemodified
	}
	if !IsNil(o.Visible) {
		toSerialize["visible"] = o.Visible
	}
	return toSerialize, nil
}

type NullableModPageGetPagesByCourses200ResponsePagesInner struct {
	value *ModPageGetPagesByCourses200ResponsePagesInner
	isSet bool
}

func (v NullableModPageGetPagesByCourses200ResponsePagesInner) Get() *ModPageGetPagesByCourses200ResponsePagesInner {
	return v.value
}

func (v *NullableModPageGetPagesByCourses200ResponsePagesInner) Set(val *ModPageGetPagesByCourses200ResponsePagesInner) {
	v.value = val
	v.isSet = true
}

func (v NullableModPageGetPagesByCourses200ResponsePagesInner) IsSet() bool {
	return v.isSet
}

func (v *NullableModPageGetPagesByCourses200ResponsePagesInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModPageGetPagesByCourses200ResponsePagesInner(val *ModPageGetPagesByCourses200ResponsePagesInner) *NullableModPageGetPagesByCourses200ResponsePagesInner {
	return &NullableModPageGetPagesByCourses200ResponsePagesInner{value: val, isSet: true}
}

func (v NullableModPageGetPagesByCourses200ResponsePagesInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModPageGetPagesByCourses200ResponsePagesInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

