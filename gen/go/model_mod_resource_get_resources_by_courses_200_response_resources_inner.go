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

// checks if the ModResourceGetResourcesByCourses200ResponseResourcesInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModResourceGetResourcesByCourses200ResponseResourcesInner{}

// ModResourceGetResourcesByCourses200ResponseResourcesInner struct for ModResourceGetResourcesByCourses200ResponseResourcesInner
type ModResourceGetResourcesByCourses200ResponseResourcesInner struct {
	Contentfiles []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner `json:"contentfiles,omitempty"`
	// Course id
	Course *int32 `json:"course,omitempty"`
	// Course module id
	Coursemodule *int32 `json:"coursemodule,omitempty"`
	// How to display the resource
	Display *int32 `json:"display,omitempty"`
	// Display options (width, height)
	Displayoptions *string `json:"displayoptions,omitempty"`
	// If filters should be applied to the resource content
	Filterfiles *int32 `json:"filterfiles,omitempty"`
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
	// Last time the resource was modified
	Timemodified *int32 `json:"timemodified,omitempty"`
	// Whether this resource was migrated
	Tobemigrated *int32 `json:"tobemigrated,omitempty"`
	// Visible
	Visible *bool `json:"visible,omitempty"`
}

// NewModResourceGetResourcesByCourses200ResponseResourcesInner instantiates a new ModResourceGetResourcesByCourses200ResponseResourcesInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModResourceGetResourcesByCourses200ResponseResourcesInner() *ModResourceGetResourcesByCourses200ResponseResourcesInner {
	this := ModResourceGetResourcesByCourses200ResponseResourcesInner{}
	var display int32 = null
	this.Display = &display
	var filterfiles int32 = null
	this.Filterfiles = &filterfiles
	var timemodified int32 = null
	this.Timemodified = &timemodified
	var tobemigrated int32 = null
	this.Tobemigrated = &tobemigrated
	return &this
}

// NewModResourceGetResourcesByCourses200ResponseResourcesInnerWithDefaults instantiates a new ModResourceGetResourcesByCourses200ResponseResourcesInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModResourceGetResourcesByCourses200ResponseResourcesInnerWithDefaults() *ModResourceGetResourcesByCourses200ResponseResourcesInner {
	this := ModResourceGetResourcesByCourses200ResponseResourcesInner{}
	var display int32 = null
	this.Display = &display
	var filterfiles int32 = null
	this.Filterfiles = &filterfiles
	var timemodified int32 = null
	this.Timemodified = &timemodified
	var tobemigrated int32 = null
	this.Tobemigrated = &tobemigrated
	return &this
}

// GetContentfiles returns the Contentfiles field value if set, zero value otherwise.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetContentfiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner {
	if o == nil || IsNil(o.Contentfiles) {
		var ret []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner
		return ret
	}
	return o.Contentfiles
}

// GetContentfilesOk returns a tuple with the Contentfiles field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetContentfilesOk() ([]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool) {
	if o == nil || IsNil(o.Contentfiles) {
		return nil, false
	}
	return o.Contentfiles, true
}

// HasContentfiles returns a boolean if a field has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasContentfiles() bool {
	if o != nil && !IsNil(o.Contentfiles) {
		return true
	}

	return false
}

// SetContentfiles gets a reference to the given []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner and assigns it to the Contentfiles field.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetContentfiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner) {
	o.Contentfiles = v
}

// GetCourse returns the Course field value if set, zero value otherwise.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetCourse() int32 {
	if o == nil || IsNil(o.Course) {
		var ret int32
		return ret
	}
	return *o.Course
}

// GetCourseOk returns a tuple with the Course field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetCourseOk() (*int32, bool) {
	if o == nil || IsNil(o.Course) {
		return nil, false
	}
	return o.Course, true
}

// HasCourse returns a boolean if a field has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasCourse() bool {
	if o != nil && !IsNil(o.Course) {
		return true
	}

	return false
}

// SetCourse gets a reference to the given int32 and assigns it to the Course field.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetCourse(v int32) {
	o.Course = &v
}

// GetCoursemodule returns the Coursemodule field value if set, zero value otherwise.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetCoursemodule() int32 {
	if o == nil || IsNil(o.Coursemodule) {
		var ret int32
		return ret
	}
	return *o.Coursemodule
}

// GetCoursemoduleOk returns a tuple with the Coursemodule field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetCoursemoduleOk() (*int32, bool) {
	if o == nil || IsNil(o.Coursemodule) {
		return nil, false
	}
	return o.Coursemodule, true
}

// HasCoursemodule returns a boolean if a field has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasCoursemodule() bool {
	if o != nil && !IsNil(o.Coursemodule) {
		return true
	}

	return false
}

// SetCoursemodule gets a reference to the given int32 and assigns it to the Coursemodule field.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetCoursemodule(v int32) {
	o.Coursemodule = &v
}

// GetDisplay returns the Display field value if set, zero value otherwise.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetDisplay() int32 {
	if o == nil || IsNil(o.Display) {
		var ret int32
		return ret
	}
	return *o.Display
}

// GetDisplayOk returns a tuple with the Display field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetDisplayOk() (*int32, bool) {
	if o == nil || IsNil(o.Display) {
		return nil, false
	}
	return o.Display, true
}

// HasDisplay returns a boolean if a field has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasDisplay() bool {
	if o != nil && !IsNil(o.Display) {
		return true
	}

	return false
}

// SetDisplay gets a reference to the given int32 and assigns it to the Display field.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetDisplay(v int32) {
	o.Display = &v
}

// GetDisplayoptions returns the Displayoptions field value if set, zero value otherwise.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetDisplayoptions() string {
	if o == nil || IsNil(o.Displayoptions) {
		var ret string
		return ret
	}
	return *o.Displayoptions
}

// GetDisplayoptionsOk returns a tuple with the Displayoptions field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetDisplayoptionsOk() (*string, bool) {
	if o == nil || IsNil(o.Displayoptions) {
		return nil, false
	}
	return o.Displayoptions, true
}

// HasDisplayoptions returns a boolean if a field has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasDisplayoptions() bool {
	if o != nil && !IsNil(o.Displayoptions) {
		return true
	}

	return false
}

// SetDisplayoptions gets a reference to the given string and assigns it to the Displayoptions field.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetDisplayoptions(v string) {
	o.Displayoptions = &v
}

// GetFilterfiles returns the Filterfiles field value if set, zero value otherwise.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetFilterfiles() int32 {
	if o == nil || IsNil(o.Filterfiles) {
		var ret int32
		return ret
	}
	return *o.Filterfiles
}

// GetFilterfilesOk returns a tuple with the Filterfiles field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetFilterfilesOk() (*int32, bool) {
	if o == nil || IsNil(o.Filterfiles) {
		return nil, false
	}
	return o.Filterfiles, true
}

// HasFilterfiles returns a boolean if a field has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasFilterfiles() bool {
	if o != nil && !IsNil(o.Filterfiles) {
		return true
	}

	return false
}

// SetFilterfiles gets a reference to the given int32 and assigns it to the Filterfiles field.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetFilterfiles(v int32) {
	o.Filterfiles = &v
}

// GetGroupingid returns the Groupingid field value if set, zero value otherwise.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetGroupingid() int32 {
	if o == nil || IsNil(o.Groupingid) {
		var ret int32
		return ret
	}
	return *o.Groupingid
}

// GetGroupingidOk returns a tuple with the Groupingid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetGroupingidOk() (*int32, bool) {
	if o == nil || IsNil(o.Groupingid) {
		return nil, false
	}
	return o.Groupingid, true
}

// HasGroupingid returns a boolean if a field has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasGroupingid() bool {
	if o != nil && !IsNil(o.Groupingid) {
		return true
	}

	return false
}

// SetGroupingid gets a reference to the given int32 and assigns it to the Groupingid field.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetGroupingid(v int32) {
	o.Groupingid = &v
}

// GetGroupmode returns the Groupmode field value if set, zero value otherwise.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetGroupmode() int32 {
	if o == nil || IsNil(o.Groupmode) {
		var ret int32
		return ret
	}
	return *o.Groupmode
}

// GetGroupmodeOk returns a tuple with the Groupmode field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetGroupmodeOk() (*int32, bool) {
	if o == nil || IsNil(o.Groupmode) {
		return nil, false
	}
	return o.Groupmode, true
}

// HasGroupmode returns a boolean if a field has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasGroupmode() bool {
	if o != nil && !IsNil(o.Groupmode) {
		return true
	}

	return false
}

// SetGroupmode gets a reference to the given int32 and assigns it to the Groupmode field.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetGroupmode(v int32) {
	o.Groupmode = &v
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetId() int32 {
	if o == nil || IsNil(o.Id) {
		var ret int32
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetIdOk() (*int32, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given int32 and assigns it to the Id field.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetId(v int32) {
	o.Id = &v
}

// GetIntro returns the Intro field value if set, zero value otherwise.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetIntro() string {
	if o == nil || IsNil(o.Intro) {
		var ret string
		return ret
	}
	return *o.Intro
}

// GetIntroOk returns a tuple with the Intro field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetIntroOk() (*string, bool) {
	if o == nil || IsNil(o.Intro) {
		return nil, false
	}
	return o.Intro, true
}

// HasIntro returns a boolean if a field has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasIntro() bool {
	if o != nil && !IsNil(o.Intro) {
		return true
	}

	return false
}

// SetIntro gets a reference to the given string and assigns it to the Intro field.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetIntro(v string) {
	o.Intro = &v
}

// GetIntrofiles returns the Introfiles field value if set, zero value otherwise.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetIntrofiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner {
	if o == nil || IsNil(o.Introfiles) {
		var ret []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner
		return ret
	}
	return o.Introfiles
}

// GetIntrofilesOk returns a tuple with the Introfiles field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetIntrofilesOk() ([]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool) {
	if o == nil || IsNil(o.Introfiles) {
		return nil, false
	}
	return o.Introfiles, true
}

// HasIntrofiles returns a boolean if a field has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasIntrofiles() bool {
	if o != nil && !IsNil(o.Introfiles) {
		return true
	}

	return false
}

// SetIntrofiles gets a reference to the given []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner and assigns it to the Introfiles field.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetIntrofiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner) {
	o.Introfiles = v
}

// GetIntroformat returns the Introformat field value if set, zero value otherwise.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetIntroformat() int32 {
	if o == nil || IsNil(o.Introformat) {
		var ret int32
		return ret
	}
	return *o.Introformat
}

// GetIntroformatOk returns a tuple with the Introformat field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetIntroformatOk() (*int32, bool) {
	if o == nil || IsNil(o.Introformat) {
		return nil, false
	}
	return o.Introformat, true
}

// HasIntroformat returns a boolean if a field has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasIntroformat() bool {
	if o != nil && !IsNil(o.Introformat) {
		return true
	}

	return false
}

// SetIntroformat gets a reference to the given int32 and assigns it to the Introformat field.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetIntroformat(v int32) {
	o.Introformat = &v
}

// GetLang returns the Lang field value if set, zero value otherwise.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetLang() string {
	if o == nil || IsNil(o.Lang) {
		var ret string
		return ret
	}
	return *o.Lang
}

// GetLangOk returns a tuple with the Lang field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetLangOk() (*string, bool) {
	if o == nil || IsNil(o.Lang) {
		return nil, false
	}
	return o.Lang, true
}

// HasLang returns a boolean if a field has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasLang() bool {
	if o != nil && !IsNil(o.Lang) {
		return true
	}

	return false
}

// SetLang gets a reference to the given string and assigns it to the Lang field.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetLang(v string) {
	o.Lang = &v
}

// GetLegacyfiles returns the Legacyfiles field value if set, zero value otherwise.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetLegacyfiles() int32 {
	if o == nil || IsNil(o.Legacyfiles) {
		var ret int32
		return ret
	}
	return *o.Legacyfiles
}

// GetLegacyfilesOk returns a tuple with the Legacyfiles field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetLegacyfilesOk() (*int32, bool) {
	if o == nil || IsNil(o.Legacyfiles) {
		return nil, false
	}
	return o.Legacyfiles, true
}

// HasLegacyfiles returns a boolean if a field has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasLegacyfiles() bool {
	if o != nil && !IsNil(o.Legacyfiles) {
		return true
	}

	return false
}

// SetLegacyfiles gets a reference to the given int32 and assigns it to the Legacyfiles field.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetLegacyfiles(v int32) {
	o.Legacyfiles = &v
}

// GetLegacyfileslast returns the Legacyfileslast field value if set, zero value otherwise.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetLegacyfileslast() int32 {
	if o == nil || IsNil(o.Legacyfileslast) {
		var ret int32
		return ret
	}
	return *o.Legacyfileslast
}

// GetLegacyfileslastOk returns a tuple with the Legacyfileslast field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetLegacyfileslastOk() (*int32, bool) {
	if o == nil || IsNil(o.Legacyfileslast) {
		return nil, false
	}
	return o.Legacyfileslast, true
}

// HasLegacyfileslast returns a boolean if a field has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasLegacyfileslast() bool {
	if o != nil && !IsNil(o.Legacyfileslast) {
		return true
	}

	return false
}

// SetLegacyfileslast gets a reference to the given int32 and assigns it to the Legacyfileslast field.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetLegacyfileslast(v int32) {
	o.Legacyfileslast = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetName(v string) {
	o.Name = &v
}

// GetRevision returns the Revision field value if set, zero value otherwise.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetRevision() int32 {
	if o == nil || IsNil(o.Revision) {
		var ret int32
		return ret
	}
	return *o.Revision
}

// GetRevisionOk returns a tuple with the Revision field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetRevisionOk() (*int32, bool) {
	if o == nil || IsNil(o.Revision) {
		return nil, false
	}
	return o.Revision, true
}

// HasRevision returns a boolean if a field has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasRevision() bool {
	if o != nil && !IsNil(o.Revision) {
		return true
	}

	return false
}

// SetRevision gets a reference to the given int32 and assigns it to the Revision field.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetRevision(v int32) {
	o.Revision = &v
}

// GetSection returns the Section field value if set, zero value otherwise.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetSection() int32 {
	if o == nil || IsNil(o.Section) {
		var ret int32
		return ret
	}
	return *o.Section
}

// GetSectionOk returns a tuple with the Section field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetSectionOk() (*int32, bool) {
	if o == nil || IsNil(o.Section) {
		return nil, false
	}
	return o.Section, true
}

// HasSection returns a boolean if a field has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasSection() bool {
	if o != nil && !IsNil(o.Section) {
		return true
	}

	return false
}

// SetSection gets a reference to the given int32 and assigns it to the Section field.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetSection(v int32) {
	o.Section = &v
}

// GetTimemodified returns the Timemodified field value if set, zero value otherwise.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetTimemodified() int32 {
	if o == nil || IsNil(o.Timemodified) {
		var ret int32
		return ret
	}
	return *o.Timemodified
}

// GetTimemodifiedOk returns a tuple with the Timemodified field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetTimemodifiedOk() (*int32, bool) {
	if o == nil || IsNil(o.Timemodified) {
		return nil, false
	}
	return o.Timemodified, true
}

// HasTimemodified returns a boolean if a field has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasTimemodified() bool {
	if o != nil && !IsNil(o.Timemodified) {
		return true
	}

	return false
}

// SetTimemodified gets a reference to the given int32 and assigns it to the Timemodified field.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetTimemodified(v int32) {
	o.Timemodified = &v
}

// GetTobemigrated returns the Tobemigrated field value if set, zero value otherwise.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetTobemigrated() int32 {
	if o == nil || IsNil(o.Tobemigrated) {
		var ret int32
		return ret
	}
	return *o.Tobemigrated
}

// GetTobemigratedOk returns a tuple with the Tobemigrated field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetTobemigratedOk() (*int32, bool) {
	if o == nil || IsNil(o.Tobemigrated) {
		return nil, false
	}
	return o.Tobemigrated, true
}

// HasTobemigrated returns a boolean if a field has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasTobemigrated() bool {
	if o != nil && !IsNil(o.Tobemigrated) {
		return true
	}

	return false
}

// SetTobemigrated gets a reference to the given int32 and assigns it to the Tobemigrated field.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetTobemigrated(v int32) {
	o.Tobemigrated = &v
}

// GetVisible returns the Visible field value if set, zero value otherwise.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetVisible() bool {
	if o == nil || IsNil(o.Visible) {
		var ret bool
		return ret
	}
	return *o.Visible
}

// GetVisibleOk returns a tuple with the Visible field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) GetVisibleOk() (*bool, bool) {
	if o == nil || IsNil(o.Visible) {
		return nil, false
	}
	return o.Visible, true
}

// HasVisible returns a boolean if a field has been set.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) HasVisible() bool {
	if o != nil && !IsNil(o.Visible) {
		return true
	}

	return false
}

// SetVisible gets a reference to the given bool and assigns it to the Visible field.
func (o *ModResourceGetResourcesByCourses200ResponseResourcesInner) SetVisible(v bool) {
	o.Visible = &v
}

func (o ModResourceGetResourcesByCourses200ResponseResourcesInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModResourceGetResourcesByCourses200ResponseResourcesInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Contentfiles) {
		toSerialize["contentfiles"] = o.Contentfiles
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
	if !IsNil(o.Filterfiles) {
		toSerialize["filterfiles"] = o.Filterfiles
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
	if !IsNil(o.Tobemigrated) {
		toSerialize["tobemigrated"] = o.Tobemigrated
	}
	if !IsNil(o.Visible) {
		toSerialize["visible"] = o.Visible
	}
	return toSerialize, nil
}

type NullableModResourceGetResourcesByCourses200ResponseResourcesInner struct {
	value *ModResourceGetResourcesByCourses200ResponseResourcesInner
	isSet bool
}

func (v NullableModResourceGetResourcesByCourses200ResponseResourcesInner) Get() *ModResourceGetResourcesByCourses200ResponseResourcesInner {
	return v.value
}

func (v *NullableModResourceGetResourcesByCourses200ResponseResourcesInner) Set(val *ModResourceGetResourcesByCourses200ResponseResourcesInner) {
	v.value = val
	v.isSet = true
}

func (v NullableModResourceGetResourcesByCourses200ResponseResourcesInner) IsSet() bool {
	return v.isSet
}

func (v *NullableModResourceGetResourcesByCourses200ResponseResourcesInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModResourceGetResourcesByCourses200ResponseResourcesInner(val *ModResourceGetResourcesByCourses200ResponseResourcesInner) *NullableModResourceGetResourcesByCourses200ResponseResourcesInner {
	return &NullableModResourceGetResourcesByCourses200ResponseResourcesInner{value: val, isSet: true}
}

func (v NullableModResourceGetResourcesByCourses200ResponseResourcesInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModResourceGetResourcesByCourses200ResponseResourcesInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

