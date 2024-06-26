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

// checks if the ModChoiceGetChoicesByCourses200ResponseChoicesInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModChoiceGetChoicesByCourses200ResponseChoicesInner{}

// ModChoiceGetChoicesByCourses200ResponseChoicesInner Choices
type ModChoiceGetChoicesByCourses200ResponseChoicesInner struct {
	// Allow multiple choices
	Allowmultiple *bool `json:"allowmultiple,omitempty"`
	// Allow update
	Allowupdate *bool `json:"allowupdate,omitempty"`
	// Completion on user submission
	Completionsubmit *bool `json:"completionsubmit,omitempty"`
	// Course id
	Course *int32 `json:"course,omitempty"`
	// Course module id
	Coursemodule *int32 `json:"coursemodule,omitempty"`
	// Display mode (vertical, horizontal)
	Display *int32 `json:"display,omitempty"`
	// Group id
	Groupingid *int32 `json:"groupingid,omitempty"`
	// Group mode
	Groupmode *int32 `json:"groupmode,omitempty"`
	// Activity instance id
	Id *int32 `json:"id,omitempty"`
	// Include inactive users
	Includeinactive *bool `json:"includeinactive,omitempty"`
	// Activity introduction
	Intro *string `json:"intro,omitempty"`
	Introfiles []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner `json:"introfiles,omitempty"`
	// intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
	Introformat *int32 `json:"introformat,omitempty"`
	// Forced activity language
	Lang *string `json:"lang,omitempty"`
	// Limit unswers
	Limitanswers *bool `json:"limitanswers,omitempty"`
	// Activity name
	Name *string `json:"name,omitempty"`
	// If choice is published
	Publish *bool `json:"publish,omitempty"`
	// Course section id
	Section *int32 `json:"section,omitempty"`
	// Show available spaces
	Showavailable *bool `json:"showavailable,omitempty"`
	// Show preview before timeopen
	Showpreview *bool `json:"showpreview,omitempty"`
	// 0 never, 1 after answer, 2 after close, 3 always
	Showresults *int32 `json:"showresults,omitempty"`
	// Show users who not answered yet
	Showunanswered *bool `json:"showunanswered,omitempty"`
	// Date of closing validity
	Timeclose *int32 `json:"timeclose,omitempty"`
	// Time of last modification
	Timemodified *int32 `json:"timemodified,omitempty"`
	// Date of opening validity
	Timeopen *int32 `json:"timeopen,omitempty"`
	// Visible
	Visible *bool `json:"visible,omitempty"`
}

// NewModChoiceGetChoicesByCourses200ResponseChoicesInner instantiates a new ModChoiceGetChoicesByCourses200ResponseChoicesInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModChoiceGetChoicesByCourses200ResponseChoicesInner() *ModChoiceGetChoicesByCourses200ResponseChoicesInner {
	this := ModChoiceGetChoicesByCourses200ResponseChoicesInner{}
	var allowmultiple bool = null
	this.Allowmultiple = &allowmultiple
	var allowupdate bool = null
	this.Allowupdate = &allowupdate
	var completionsubmit bool = null
	this.Completionsubmit = &completionsubmit
	var display int32 = null
	this.Display = &display
	var includeinactive bool = null
	this.Includeinactive = &includeinactive
	var limitanswers bool = null
	this.Limitanswers = &limitanswers
	var publish bool = null
	this.Publish = &publish
	var showavailable bool = null
	this.Showavailable = &showavailable
	var showpreview bool = null
	this.Showpreview = &showpreview
	var showresults int32 = null
	this.Showresults = &showresults
	var showunanswered bool = null
	this.Showunanswered = &showunanswered
	var timeclose int32 = null
	this.Timeclose = &timeclose
	var timeopen int32 = null
	this.Timeopen = &timeopen
	return &this
}

// NewModChoiceGetChoicesByCourses200ResponseChoicesInnerWithDefaults instantiates a new ModChoiceGetChoicesByCourses200ResponseChoicesInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModChoiceGetChoicesByCourses200ResponseChoicesInnerWithDefaults() *ModChoiceGetChoicesByCourses200ResponseChoicesInner {
	this := ModChoiceGetChoicesByCourses200ResponseChoicesInner{}
	var allowmultiple bool = null
	this.Allowmultiple = &allowmultiple
	var allowupdate bool = null
	this.Allowupdate = &allowupdate
	var completionsubmit bool = null
	this.Completionsubmit = &completionsubmit
	var display int32 = null
	this.Display = &display
	var includeinactive bool = null
	this.Includeinactive = &includeinactive
	var limitanswers bool = null
	this.Limitanswers = &limitanswers
	var publish bool = null
	this.Publish = &publish
	var showavailable bool = null
	this.Showavailable = &showavailable
	var showpreview bool = null
	this.Showpreview = &showpreview
	var showresults int32 = null
	this.Showresults = &showresults
	var showunanswered bool = null
	this.Showunanswered = &showunanswered
	var timeclose int32 = null
	this.Timeclose = &timeclose
	var timeopen int32 = null
	this.Timeopen = &timeopen
	return &this
}

// GetAllowmultiple returns the Allowmultiple field value if set, zero value otherwise.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetAllowmultiple() bool {
	if o == nil || IsNil(o.Allowmultiple) {
		var ret bool
		return ret
	}
	return *o.Allowmultiple
}

// GetAllowmultipleOk returns a tuple with the Allowmultiple field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetAllowmultipleOk() (*bool, bool) {
	if o == nil || IsNil(o.Allowmultiple) {
		return nil, false
	}
	return o.Allowmultiple, true
}

// HasAllowmultiple returns a boolean if a field has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasAllowmultiple() bool {
	if o != nil && !IsNil(o.Allowmultiple) {
		return true
	}

	return false
}

// SetAllowmultiple gets a reference to the given bool and assigns it to the Allowmultiple field.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetAllowmultiple(v bool) {
	o.Allowmultiple = &v
}

// GetAllowupdate returns the Allowupdate field value if set, zero value otherwise.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetAllowupdate() bool {
	if o == nil || IsNil(o.Allowupdate) {
		var ret bool
		return ret
	}
	return *o.Allowupdate
}

// GetAllowupdateOk returns a tuple with the Allowupdate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetAllowupdateOk() (*bool, bool) {
	if o == nil || IsNil(o.Allowupdate) {
		return nil, false
	}
	return o.Allowupdate, true
}

// HasAllowupdate returns a boolean if a field has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasAllowupdate() bool {
	if o != nil && !IsNil(o.Allowupdate) {
		return true
	}

	return false
}

// SetAllowupdate gets a reference to the given bool and assigns it to the Allowupdate field.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetAllowupdate(v bool) {
	o.Allowupdate = &v
}

// GetCompletionsubmit returns the Completionsubmit field value if set, zero value otherwise.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetCompletionsubmit() bool {
	if o == nil || IsNil(o.Completionsubmit) {
		var ret bool
		return ret
	}
	return *o.Completionsubmit
}

// GetCompletionsubmitOk returns a tuple with the Completionsubmit field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetCompletionsubmitOk() (*bool, bool) {
	if o == nil || IsNil(o.Completionsubmit) {
		return nil, false
	}
	return o.Completionsubmit, true
}

// HasCompletionsubmit returns a boolean if a field has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasCompletionsubmit() bool {
	if o != nil && !IsNil(o.Completionsubmit) {
		return true
	}

	return false
}

// SetCompletionsubmit gets a reference to the given bool and assigns it to the Completionsubmit field.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetCompletionsubmit(v bool) {
	o.Completionsubmit = &v
}

// GetCourse returns the Course field value if set, zero value otherwise.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetCourse() int32 {
	if o == nil || IsNil(o.Course) {
		var ret int32
		return ret
	}
	return *o.Course
}

// GetCourseOk returns a tuple with the Course field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetCourseOk() (*int32, bool) {
	if o == nil || IsNil(o.Course) {
		return nil, false
	}
	return o.Course, true
}

// HasCourse returns a boolean if a field has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasCourse() bool {
	if o != nil && !IsNil(o.Course) {
		return true
	}

	return false
}

// SetCourse gets a reference to the given int32 and assigns it to the Course field.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetCourse(v int32) {
	o.Course = &v
}

// GetCoursemodule returns the Coursemodule field value if set, zero value otherwise.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetCoursemodule() int32 {
	if o == nil || IsNil(o.Coursemodule) {
		var ret int32
		return ret
	}
	return *o.Coursemodule
}

// GetCoursemoduleOk returns a tuple with the Coursemodule field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetCoursemoduleOk() (*int32, bool) {
	if o == nil || IsNil(o.Coursemodule) {
		return nil, false
	}
	return o.Coursemodule, true
}

// HasCoursemodule returns a boolean if a field has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasCoursemodule() bool {
	if o != nil && !IsNil(o.Coursemodule) {
		return true
	}

	return false
}

// SetCoursemodule gets a reference to the given int32 and assigns it to the Coursemodule field.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetCoursemodule(v int32) {
	o.Coursemodule = &v
}

// GetDisplay returns the Display field value if set, zero value otherwise.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetDisplay() int32 {
	if o == nil || IsNil(o.Display) {
		var ret int32
		return ret
	}
	return *o.Display
}

// GetDisplayOk returns a tuple with the Display field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetDisplayOk() (*int32, bool) {
	if o == nil || IsNil(o.Display) {
		return nil, false
	}
	return o.Display, true
}

// HasDisplay returns a boolean if a field has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasDisplay() bool {
	if o != nil && !IsNil(o.Display) {
		return true
	}

	return false
}

// SetDisplay gets a reference to the given int32 and assigns it to the Display field.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetDisplay(v int32) {
	o.Display = &v
}

// GetGroupingid returns the Groupingid field value if set, zero value otherwise.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetGroupingid() int32 {
	if o == nil || IsNil(o.Groupingid) {
		var ret int32
		return ret
	}
	return *o.Groupingid
}

// GetGroupingidOk returns a tuple with the Groupingid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetGroupingidOk() (*int32, bool) {
	if o == nil || IsNil(o.Groupingid) {
		return nil, false
	}
	return o.Groupingid, true
}

// HasGroupingid returns a boolean if a field has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasGroupingid() bool {
	if o != nil && !IsNil(o.Groupingid) {
		return true
	}

	return false
}

// SetGroupingid gets a reference to the given int32 and assigns it to the Groupingid field.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetGroupingid(v int32) {
	o.Groupingid = &v
}

// GetGroupmode returns the Groupmode field value if set, zero value otherwise.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetGroupmode() int32 {
	if o == nil || IsNil(o.Groupmode) {
		var ret int32
		return ret
	}
	return *o.Groupmode
}

// GetGroupmodeOk returns a tuple with the Groupmode field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetGroupmodeOk() (*int32, bool) {
	if o == nil || IsNil(o.Groupmode) {
		return nil, false
	}
	return o.Groupmode, true
}

// HasGroupmode returns a boolean if a field has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasGroupmode() bool {
	if o != nil && !IsNil(o.Groupmode) {
		return true
	}

	return false
}

// SetGroupmode gets a reference to the given int32 and assigns it to the Groupmode field.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetGroupmode(v int32) {
	o.Groupmode = &v
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetId() int32 {
	if o == nil || IsNil(o.Id) {
		var ret int32
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetIdOk() (*int32, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given int32 and assigns it to the Id field.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetId(v int32) {
	o.Id = &v
}

// GetIncludeinactive returns the Includeinactive field value if set, zero value otherwise.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetIncludeinactive() bool {
	if o == nil || IsNil(o.Includeinactive) {
		var ret bool
		return ret
	}
	return *o.Includeinactive
}

// GetIncludeinactiveOk returns a tuple with the Includeinactive field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetIncludeinactiveOk() (*bool, bool) {
	if o == nil || IsNil(o.Includeinactive) {
		return nil, false
	}
	return o.Includeinactive, true
}

// HasIncludeinactive returns a boolean if a field has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasIncludeinactive() bool {
	if o != nil && !IsNil(o.Includeinactive) {
		return true
	}

	return false
}

// SetIncludeinactive gets a reference to the given bool and assigns it to the Includeinactive field.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetIncludeinactive(v bool) {
	o.Includeinactive = &v
}

// GetIntro returns the Intro field value if set, zero value otherwise.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetIntro() string {
	if o == nil || IsNil(o.Intro) {
		var ret string
		return ret
	}
	return *o.Intro
}

// GetIntroOk returns a tuple with the Intro field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetIntroOk() (*string, bool) {
	if o == nil || IsNil(o.Intro) {
		return nil, false
	}
	return o.Intro, true
}

// HasIntro returns a boolean if a field has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasIntro() bool {
	if o != nil && !IsNil(o.Intro) {
		return true
	}

	return false
}

// SetIntro gets a reference to the given string and assigns it to the Intro field.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetIntro(v string) {
	o.Intro = &v
}

// GetIntrofiles returns the Introfiles field value if set, zero value otherwise.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetIntrofiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner {
	if o == nil || IsNil(o.Introfiles) {
		var ret []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner
		return ret
	}
	return o.Introfiles
}

// GetIntrofilesOk returns a tuple with the Introfiles field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetIntrofilesOk() ([]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool) {
	if o == nil || IsNil(o.Introfiles) {
		return nil, false
	}
	return o.Introfiles, true
}

// HasIntrofiles returns a boolean if a field has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasIntrofiles() bool {
	if o != nil && !IsNil(o.Introfiles) {
		return true
	}

	return false
}

// SetIntrofiles gets a reference to the given []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner and assigns it to the Introfiles field.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetIntrofiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner) {
	o.Introfiles = v
}

// GetIntroformat returns the Introformat field value if set, zero value otherwise.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetIntroformat() int32 {
	if o == nil || IsNil(o.Introformat) {
		var ret int32
		return ret
	}
	return *o.Introformat
}

// GetIntroformatOk returns a tuple with the Introformat field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetIntroformatOk() (*int32, bool) {
	if o == nil || IsNil(o.Introformat) {
		return nil, false
	}
	return o.Introformat, true
}

// HasIntroformat returns a boolean if a field has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasIntroformat() bool {
	if o != nil && !IsNil(o.Introformat) {
		return true
	}

	return false
}

// SetIntroformat gets a reference to the given int32 and assigns it to the Introformat field.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetIntroformat(v int32) {
	o.Introformat = &v
}

// GetLang returns the Lang field value if set, zero value otherwise.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetLang() string {
	if o == nil || IsNil(o.Lang) {
		var ret string
		return ret
	}
	return *o.Lang
}

// GetLangOk returns a tuple with the Lang field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetLangOk() (*string, bool) {
	if o == nil || IsNil(o.Lang) {
		return nil, false
	}
	return o.Lang, true
}

// HasLang returns a boolean if a field has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasLang() bool {
	if o != nil && !IsNil(o.Lang) {
		return true
	}

	return false
}

// SetLang gets a reference to the given string and assigns it to the Lang field.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetLang(v string) {
	o.Lang = &v
}

// GetLimitanswers returns the Limitanswers field value if set, zero value otherwise.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetLimitanswers() bool {
	if o == nil || IsNil(o.Limitanswers) {
		var ret bool
		return ret
	}
	return *o.Limitanswers
}

// GetLimitanswersOk returns a tuple with the Limitanswers field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetLimitanswersOk() (*bool, bool) {
	if o == nil || IsNil(o.Limitanswers) {
		return nil, false
	}
	return o.Limitanswers, true
}

// HasLimitanswers returns a boolean if a field has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasLimitanswers() bool {
	if o != nil && !IsNil(o.Limitanswers) {
		return true
	}

	return false
}

// SetLimitanswers gets a reference to the given bool and assigns it to the Limitanswers field.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetLimitanswers(v bool) {
	o.Limitanswers = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetName(v string) {
	o.Name = &v
}

// GetPublish returns the Publish field value if set, zero value otherwise.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetPublish() bool {
	if o == nil || IsNil(o.Publish) {
		var ret bool
		return ret
	}
	return *o.Publish
}

// GetPublishOk returns a tuple with the Publish field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetPublishOk() (*bool, bool) {
	if o == nil || IsNil(o.Publish) {
		return nil, false
	}
	return o.Publish, true
}

// HasPublish returns a boolean if a field has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasPublish() bool {
	if o != nil && !IsNil(o.Publish) {
		return true
	}

	return false
}

// SetPublish gets a reference to the given bool and assigns it to the Publish field.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetPublish(v bool) {
	o.Publish = &v
}

// GetSection returns the Section field value if set, zero value otherwise.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetSection() int32 {
	if o == nil || IsNil(o.Section) {
		var ret int32
		return ret
	}
	return *o.Section
}

// GetSectionOk returns a tuple with the Section field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetSectionOk() (*int32, bool) {
	if o == nil || IsNil(o.Section) {
		return nil, false
	}
	return o.Section, true
}

// HasSection returns a boolean if a field has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasSection() bool {
	if o != nil && !IsNil(o.Section) {
		return true
	}

	return false
}

// SetSection gets a reference to the given int32 and assigns it to the Section field.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetSection(v int32) {
	o.Section = &v
}

// GetShowavailable returns the Showavailable field value if set, zero value otherwise.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetShowavailable() bool {
	if o == nil || IsNil(o.Showavailable) {
		var ret bool
		return ret
	}
	return *o.Showavailable
}

// GetShowavailableOk returns a tuple with the Showavailable field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetShowavailableOk() (*bool, bool) {
	if o == nil || IsNil(o.Showavailable) {
		return nil, false
	}
	return o.Showavailable, true
}

// HasShowavailable returns a boolean if a field has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasShowavailable() bool {
	if o != nil && !IsNil(o.Showavailable) {
		return true
	}

	return false
}

// SetShowavailable gets a reference to the given bool and assigns it to the Showavailable field.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetShowavailable(v bool) {
	o.Showavailable = &v
}

// GetShowpreview returns the Showpreview field value if set, zero value otherwise.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetShowpreview() bool {
	if o == nil || IsNil(o.Showpreview) {
		var ret bool
		return ret
	}
	return *o.Showpreview
}

// GetShowpreviewOk returns a tuple with the Showpreview field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetShowpreviewOk() (*bool, bool) {
	if o == nil || IsNil(o.Showpreview) {
		return nil, false
	}
	return o.Showpreview, true
}

// HasShowpreview returns a boolean if a field has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasShowpreview() bool {
	if o != nil && !IsNil(o.Showpreview) {
		return true
	}

	return false
}

// SetShowpreview gets a reference to the given bool and assigns it to the Showpreview field.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetShowpreview(v bool) {
	o.Showpreview = &v
}

// GetShowresults returns the Showresults field value if set, zero value otherwise.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetShowresults() int32 {
	if o == nil || IsNil(o.Showresults) {
		var ret int32
		return ret
	}
	return *o.Showresults
}

// GetShowresultsOk returns a tuple with the Showresults field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetShowresultsOk() (*int32, bool) {
	if o == nil || IsNil(o.Showresults) {
		return nil, false
	}
	return o.Showresults, true
}

// HasShowresults returns a boolean if a field has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasShowresults() bool {
	if o != nil && !IsNil(o.Showresults) {
		return true
	}

	return false
}

// SetShowresults gets a reference to the given int32 and assigns it to the Showresults field.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetShowresults(v int32) {
	o.Showresults = &v
}

// GetShowunanswered returns the Showunanswered field value if set, zero value otherwise.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetShowunanswered() bool {
	if o == nil || IsNil(o.Showunanswered) {
		var ret bool
		return ret
	}
	return *o.Showunanswered
}

// GetShowunansweredOk returns a tuple with the Showunanswered field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetShowunansweredOk() (*bool, bool) {
	if o == nil || IsNil(o.Showunanswered) {
		return nil, false
	}
	return o.Showunanswered, true
}

// HasShowunanswered returns a boolean if a field has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasShowunanswered() bool {
	if o != nil && !IsNil(o.Showunanswered) {
		return true
	}

	return false
}

// SetShowunanswered gets a reference to the given bool and assigns it to the Showunanswered field.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetShowunanswered(v bool) {
	o.Showunanswered = &v
}

// GetTimeclose returns the Timeclose field value if set, zero value otherwise.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetTimeclose() int32 {
	if o == nil || IsNil(o.Timeclose) {
		var ret int32
		return ret
	}
	return *o.Timeclose
}

// GetTimecloseOk returns a tuple with the Timeclose field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetTimecloseOk() (*int32, bool) {
	if o == nil || IsNil(o.Timeclose) {
		return nil, false
	}
	return o.Timeclose, true
}

// HasTimeclose returns a boolean if a field has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasTimeclose() bool {
	if o != nil && !IsNil(o.Timeclose) {
		return true
	}

	return false
}

// SetTimeclose gets a reference to the given int32 and assigns it to the Timeclose field.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetTimeclose(v int32) {
	o.Timeclose = &v
}

// GetTimemodified returns the Timemodified field value if set, zero value otherwise.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetTimemodified() int32 {
	if o == nil || IsNil(o.Timemodified) {
		var ret int32
		return ret
	}
	return *o.Timemodified
}

// GetTimemodifiedOk returns a tuple with the Timemodified field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetTimemodifiedOk() (*int32, bool) {
	if o == nil || IsNil(o.Timemodified) {
		return nil, false
	}
	return o.Timemodified, true
}

// HasTimemodified returns a boolean if a field has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasTimemodified() bool {
	if o != nil && !IsNil(o.Timemodified) {
		return true
	}

	return false
}

// SetTimemodified gets a reference to the given int32 and assigns it to the Timemodified field.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetTimemodified(v int32) {
	o.Timemodified = &v
}

// GetTimeopen returns the Timeopen field value if set, zero value otherwise.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetTimeopen() int32 {
	if o == nil || IsNil(o.Timeopen) {
		var ret int32
		return ret
	}
	return *o.Timeopen
}

// GetTimeopenOk returns a tuple with the Timeopen field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetTimeopenOk() (*int32, bool) {
	if o == nil || IsNil(o.Timeopen) {
		return nil, false
	}
	return o.Timeopen, true
}

// HasTimeopen returns a boolean if a field has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasTimeopen() bool {
	if o != nil && !IsNil(o.Timeopen) {
		return true
	}

	return false
}

// SetTimeopen gets a reference to the given int32 and assigns it to the Timeopen field.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetTimeopen(v int32) {
	o.Timeopen = &v
}

// GetVisible returns the Visible field value if set, zero value otherwise.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetVisible() bool {
	if o == nil || IsNil(o.Visible) {
		var ret bool
		return ret
	}
	return *o.Visible
}

// GetVisibleOk returns a tuple with the Visible field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) GetVisibleOk() (*bool, bool) {
	if o == nil || IsNil(o.Visible) {
		return nil, false
	}
	return o.Visible, true
}

// HasVisible returns a boolean if a field has been set.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) HasVisible() bool {
	if o != nil && !IsNil(o.Visible) {
		return true
	}

	return false
}

// SetVisible gets a reference to the given bool and assigns it to the Visible field.
func (o *ModChoiceGetChoicesByCourses200ResponseChoicesInner) SetVisible(v bool) {
	o.Visible = &v
}

func (o ModChoiceGetChoicesByCourses200ResponseChoicesInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModChoiceGetChoicesByCourses200ResponseChoicesInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Allowmultiple) {
		toSerialize["allowmultiple"] = o.Allowmultiple
	}
	if !IsNil(o.Allowupdate) {
		toSerialize["allowupdate"] = o.Allowupdate
	}
	if !IsNil(o.Completionsubmit) {
		toSerialize["completionsubmit"] = o.Completionsubmit
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
	if !IsNil(o.Groupingid) {
		toSerialize["groupingid"] = o.Groupingid
	}
	if !IsNil(o.Groupmode) {
		toSerialize["groupmode"] = o.Groupmode
	}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.Includeinactive) {
		toSerialize["includeinactive"] = o.Includeinactive
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
	if !IsNil(o.Limitanswers) {
		toSerialize["limitanswers"] = o.Limitanswers
	}
	if !IsNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !IsNil(o.Publish) {
		toSerialize["publish"] = o.Publish
	}
	if !IsNil(o.Section) {
		toSerialize["section"] = o.Section
	}
	if !IsNil(o.Showavailable) {
		toSerialize["showavailable"] = o.Showavailable
	}
	if !IsNil(o.Showpreview) {
		toSerialize["showpreview"] = o.Showpreview
	}
	if !IsNil(o.Showresults) {
		toSerialize["showresults"] = o.Showresults
	}
	if !IsNil(o.Showunanswered) {
		toSerialize["showunanswered"] = o.Showunanswered
	}
	if !IsNil(o.Timeclose) {
		toSerialize["timeclose"] = o.Timeclose
	}
	if !IsNil(o.Timemodified) {
		toSerialize["timemodified"] = o.Timemodified
	}
	if !IsNil(o.Timeopen) {
		toSerialize["timeopen"] = o.Timeopen
	}
	if !IsNil(o.Visible) {
		toSerialize["visible"] = o.Visible
	}
	return toSerialize, nil
}

type NullableModChoiceGetChoicesByCourses200ResponseChoicesInner struct {
	value *ModChoiceGetChoicesByCourses200ResponseChoicesInner
	isSet bool
}

func (v NullableModChoiceGetChoicesByCourses200ResponseChoicesInner) Get() *ModChoiceGetChoicesByCourses200ResponseChoicesInner {
	return v.value
}

func (v *NullableModChoiceGetChoicesByCourses200ResponseChoicesInner) Set(val *ModChoiceGetChoicesByCourses200ResponseChoicesInner) {
	v.value = val
	v.isSet = true
}

func (v NullableModChoiceGetChoicesByCourses200ResponseChoicesInner) IsSet() bool {
	return v.isSet
}

func (v *NullableModChoiceGetChoicesByCourses200ResponseChoicesInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModChoiceGetChoicesByCourses200ResponseChoicesInner(val *ModChoiceGetChoicesByCourses200ResponseChoicesInner) *NullableModChoiceGetChoicesByCourses200ResponseChoicesInner {
	return &NullableModChoiceGetChoicesByCourses200ResponseChoicesInner{value: val, isSet: true}
}

func (v NullableModChoiceGetChoicesByCourses200ResponseChoicesInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModChoiceGetChoicesByCourses200ResponseChoicesInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


