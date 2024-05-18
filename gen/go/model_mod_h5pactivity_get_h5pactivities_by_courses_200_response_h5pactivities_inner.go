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

// checks if the ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner{}

// ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner struct for ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner
type ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner struct {
	// Sha1 hash of file content.
	Contenthash *string `json:"contenthash,omitempty"`
	// context
	Context *int32 `json:"context,omitempty"`
	// Course id this h5p activity is part of.
	Course *int32 `json:"course,omitempty"`
	// coursemodule
	Coursemodule *int32 `json:"coursemodule,omitempty"`
	Deployedfile *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile `json:"deployedfile,omitempty"`
	// H5P Button display options.
	Displayoptions *int32 `json:"displayoptions,omitempty"`
	// Enable xAPI tracking.
	Enabletracking *int32 `json:"enabletracking,omitempty"`
	// The maximum grade for submission.
	Grade *int32 `json:"grade,omitempty"`
	// Which H5P attempt is used for grading.
	Grademethod *int32 `json:"grademethod,omitempty"`
	// The primary key of the record.
	Id *int32 `json:"id,omitempty"`
	// H5P activity description.
	Intro *string `json:"intro,omitempty"`
	Introfiles []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner `json:"introfiles,omitempty"`
	// intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
	Introformat *int32 `json:"introformat,omitempty"`
	// The name of the activity module instance.
	Name *string `json:"name,omitempty"`
	Package []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner `json:"package,omitempty"`
	// Timestamp of when the instance was added to the course.
	Timecreated *int32 `json:"timecreated,omitempty"`
	// Timestamp of when the instance was last modified.
	Timemodified *int32 `json:"timemodified,omitempty"`
}

// NewModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner instantiates a new ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner() *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner {
	this := ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner{}
	var contenthash string = "null"
	this.Contenthash = &contenthash
	var context int32 = null
	this.Context = &context
	var course int32 = null
	this.Course = &course
	var displayoptions int32 = 0
	this.Displayoptions = &displayoptions
	var enabletracking int32 = 1
	this.Enabletracking = &enabletracking
	var grade int32 = 0
	this.Grade = &grade
	var grademethod int32 = 1
	this.Grademethod = &grademethod
	var intro string = ""
	this.Intro = &intro
	var introformat int32 = 0
	this.Introformat = &introformat
	var name string = "null"
	this.Name = &name
	var timecreated int32 = null
	this.Timecreated = &timecreated
	var timemodified int32 = null
	this.Timemodified = &timemodified
	return &this
}

// NewModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerWithDefaults instantiates a new ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerWithDefaults() *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner {
	this := ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner{}
	var contenthash string = "null"
	this.Contenthash = &contenthash
	var context int32 = null
	this.Context = &context
	var course int32 = null
	this.Course = &course
	var displayoptions int32 = 0
	this.Displayoptions = &displayoptions
	var enabletracking int32 = 1
	this.Enabletracking = &enabletracking
	var grade int32 = 0
	this.Grade = &grade
	var grademethod int32 = 1
	this.Grademethod = &grademethod
	var intro string = ""
	this.Intro = &intro
	var introformat int32 = 0
	this.Introformat = &introformat
	var name string = "null"
	this.Name = &name
	var timecreated int32 = null
	this.Timecreated = &timecreated
	var timemodified int32 = null
	this.Timemodified = &timemodified
	return &this
}

// GetContenthash returns the Contenthash field value if set, zero value otherwise.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetContenthash() string {
	if o == nil || IsNil(o.Contenthash) {
		var ret string
		return ret
	}
	return *o.Contenthash
}

// GetContenthashOk returns a tuple with the Contenthash field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetContenthashOk() (*string, bool) {
	if o == nil || IsNil(o.Contenthash) {
		return nil, false
	}
	return o.Contenthash, true
}

// HasContenthash returns a boolean if a field has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasContenthash() bool {
	if o != nil && !IsNil(o.Contenthash) {
		return true
	}

	return false
}

// SetContenthash gets a reference to the given string and assigns it to the Contenthash field.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetContenthash(v string) {
	o.Contenthash = &v
}

// GetContext returns the Context field value if set, zero value otherwise.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetContext() int32 {
	if o == nil || IsNil(o.Context) {
		var ret int32
		return ret
	}
	return *o.Context
}

// GetContextOk returns a tuple with the Context field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetContextOk() (*int32, bool) {
	if o == nil || IsNil(o.Context) {
		return nil, false
	}
	return o.Context, true
}

// HasContext returns a boolean if a field has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasContext() bool {
	if o != nil && !IsNil(o.Context) {
		return true
	}

	return false
}

// SetContext gets a reference to the given int32 and assigns it to the Context field.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetContext(v int32) {
	o.Context = &v
}

// GetCourse returns the Course field value if set, zero value otherwise.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetCourse() int32 {
	if o == nil || IsNil(o.Course) {
		var ret int32
		return ret
	}
	return *o.Course
}

// GetCourseOk returns a tuple with the Course field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetCourseOk() (*int32, bool) {
	if o == nil || IsNil(o.Course) {
		return nil, false
	}
	return o.Course, true
}

// HasCourse returns a boolean if a field has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasCourse() bool {
	if o != nil && !IsNil(o.Course) {
		return true
	}

	return false
}

// SetCourse gets a reference to the given int32 and assigns it to the Course field.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetCourse(v int32) {
	o.Course = &v
}

// GetCoursemodule returns the Coursemodule field value if set, zero value otherwise.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetCoursemodule() int32 {
	if o == nil || IsNil(o.Coursemodule) {
		var ret int32
		return ret
	}
	return *o.Coursemodule
}

// GetCoursemoduleOk returns a tuple with the Coursemodule field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetCoursemoduleOk() (*int32, bool) {
	if o == nil || IsNil(o.Coursemodule) {
		return nil, false
	}
	return o.Coursemodule, true
}

// HasCoursemodule returns a boolean if a field has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasCoursemodule() bool {
	if o != nil && !IsNil(o.Coursemodule) {
		return true
	}

	return false
}

// SetCoursemodule gets a reference to the given int32 and assigns it to the Coursemodule field.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetCoursemodule(v int32) {
	o.Coursemodule = &v
}

// GetDeployedfile returns the Deployedfile field value if set, zero value otherwise.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetDeployedfile() ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile {
	if o == nil || IsNil(o.Deployedfile) {
		var ret ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile
		return ret
	}
	return *o.Deployedfile
}

// GetDeployedfileOk returns a tuple with the Deployedfile field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetDeployedfileOk() (*ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile, bool) {
	if o == nil || IsNil(o.Deployedfile) {
		return nil, false
	}
	return o.Deployedfile, true
}

// HasDeployedfile returns a boolean if a field has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasDeployedfile() bool {
	if o != nil && !IsNil(o.Deployedfile) {
		return true
	}

	return false
}

// SetDeployedfile gets a reference to the given ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile and assigns it to the Deployedfile field.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetDeployedfile(v ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile) {
	o.Deployedfile = &v
}

// GetDisplayoptions returns the Displayoptions field value if set, zero value otherwise.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetDisplayoptions() int32 {
	if o == nil || IsNil(o.Displayoptions) {
		var ret int32
		return ret
	}
	return *o.Displayoptions
}

// GetDisplayoptionsOk returns a tuple with the Displayoptions field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetDisplayoptionsOk() (*int32, bool) {
	if o == nil || IsNil(o.Displayoptions) {
		return nil, false
	}
	return o.Displayoptions, true
}

// HasDisplayoptions returns a boolean if a field has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasDisplayoptions() bool {
	if o != nil && !IsNil(o.Displayoptions) {
		return true
	}

	return false
}

// SetDisplayoptions gets a reference to the given int32 and assigns it to the Displayoptions field.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetDisplayoptions(v int32) {
	o.Displayoptions = &v
}

// GetEnabletracking returns the Enabletracking field value if set, zero value otherwise.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetEnabletracking() int32 {
	if o == nil || IsNil(o.Enabletracking) {
		var ret int32
		return ret
	}
	return *o.Enabletracking
}

// GetEnabletrackingOk returns a tuple with the Enabletracking field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetEnabletrackingOk() (*int32, bool) {
	if o == nil || IsNil(o.Enabletracking) {
		return nil, false
	}
	return o.Enabletracking, true
}

// HasEnabletracking returns a boolean if a field has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasEnabletracking() bool {
	if o != nil && !IsNil(o.Enabletracking) {
		return true
	}

	return false
}

// SetEnabletracking gets a reference to the given int32 and assigns it to the Enabletracking field.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetEnabletracking(v int32) {
	o.Enabletracking = &v
}

// GetGrade returns the Grade field value if set, zero value otherwise.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetGrade() int32 {
	if o == nil || IsNil(o.Grade) {
		var ret int32
		return ret
	}
	return *o.Grade
}

// GetGradeOk returns a tuple with the Grade field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetGradeOk() (*int32, bool) {
	if o == nil || IsNil(o.Grade) {
		return nil, false
	}
	return o.Grade, true
}

// HasGrade returns a boolean if a field has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasGrade() bool {
	if o != nil && !IsNil(o.Grade) {
		return true
	}

	return false
}

// SetGrade gets a reference to the given int32 and assigns it to the Grade field.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetGrade(v int32) {
	o.Grade = &v
}

// GetGrademethod returns the Grademethod field value if set, zero value otherwise.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetGrademethod() int32 {
	if o == nil || IsNil(o.Grademethod) {
		var ret int32
		return ret
	}
	return *o.Grademethod
}

// GetGrademethodOk returns a tuple with the Grademethod field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetGrademethodOk() (*int32, bool) {
	if o == nil || IsNil(o.Grademethod) {
		return nil, false
	}
	return o.Grademethod, true
}

// HasGrademethod returns a boolean if a field has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasGrademethod() bool {
	if o != nil && !IsNil(o.Grademethod) {
		return true
	}

	return false
}

// SetGrademethod gets a reference to the given int32 and assigns it to the Grademethod field.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetGrademethod(v int32) {
	o.Grademethod = &v
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetId() int32 {
	if o == nil || IsNil(o.Id) {
		var ret int32
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetIdOk() (*int32, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given int32 and assigns it to the Id field.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetId(v int32) {
	o.Id = &v
}

// GetIntro returns the Intro field value if set, zero value otherwise.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetIntro() string {
	if o == nil || IsNil(o.Intro) {
		var ret string
		return ret
	}
	return *o.Intro
}

// GetIntroOk returns a tuple with the Intro field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetIntroOk() (*string, bool) {
	if o == nil || IsNil(o.Intro) {
		return nil, false
	}
	return o.Intro, true
}

// HasIntro returns a boolean if a field has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasIntro() bool {
	if o != nil && !IsNil(o.Intro) {
		return true
	}

	return false
}

// SetIntro gets a reference to the given string and assigns it to the Intro field.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetIntro(v string) {
	o.Intro = &v
}

// GetIntrofiles returns the Introfiles field value if set, zero value otherwise.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetIntrofiles() []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner {
	if o == nil || IsNil(o.Introfiles) {
		var ret []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner
		return ret
	}
	return o.Introfiles
}

// GetIntrofilesOk returns a tuple with the Introfiles field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetIntrofilesOk() ([]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner, bool) {
	if o == nil || IsNil(o.Introfiles) {
		return nil, false
	}
	return o.Introfiles, true
}

// HasIntrofiles returns a boolean if a field has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasIntrofiles() bool {
	if o != nil && !IsNil(o.Introfiles) {
		return true
	}

	return false
}

// SetIntrofiles gets a reference to the given []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner and assigns it to the Introfiles field.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetIntrofiles(v []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner) {
	o.Introfiles = v
}

// GetIntroformat returns the Introformat field value if set, zero value otherwise.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetIntroformat() int32 {
	if o == nil || IsNil(o.Introformat) {
		var ret int32
		return ret
	}
	return *o.Introformat
}

// GetIntroformatOk returns a tuple with the Introformat field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetIntroformatOk() (*int32, bool) {
	if o == nil || IsNil(o.Introformat) {
		return nil, false
	}
	return o.Introformat, true
}

// HasIntroformat returns a boolean if a field has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasIntroformat() bool {
	if o != nil && !IsNil(o.Introformat) {
		return true
	}

	return false
}

// SetIntroformat gets a reference to the given int32 and assigns it to the Introformat field.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetIntroformat(v int32) {
	o.Introformat = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetName(v string) {
	o.Name = &v
}

// GetPackage returns the Package field value if set, zero value otherwise.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetPackage() []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner {
	if o == nil || IsNil(o.Package) {
		var ret []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner
		return ret
	}
	return o.Package
}

// GetPackageOk returns a tuple with the Package field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetPackageOk() ([]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner, bool) {
	if o == nil || IsNil(o.Package) {
		return nil, false
	}
	return o.Package, true
}

// HasPackage returns a boolean if a field has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasPackage() bool {
	if o != nil && !IsNil(o.Package) {
		return true
	}

	return false
}

// SetPackage gets a reference to the given []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner and assigns it to the Package field.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetPackage(v []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner) {
	o.Package = v
}

// GetTimecreated returns the Timecreated field value if set, zero value otherwise.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetTimecreated() int32 {
	if o == nil || IsNil(o.Timecreated) {
		var ret int32
		return ret
	}
	return *o.Timecreated
}

// GetTimecreatedOk returns a tuple with the Timecreated field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetTimecreatedOk() (*int32, bool) {
	if o == nil || IsNil(o.Timecreated) {
		return nil, false
	}
	return o.Timecreated, true
}

// HasTimecreated returns a boolean if a field has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasTimecreated() bool {
	if o != nil && !IsNil(o.Timecreated) {
		return true
	}

	return false
}

// SetTimecreated gets a reference to the given int32 and assigns it to the Timecreated field.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetTimecreated(v int32) {
	o.Timecreated = &v
}

// GetTimemodified returns the Timemodified field value if set, zero value otherwise.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetTimemodified() int32 {
	if o == nil || IsNil(o.Timemodified) {
		var ret int32
		return ret
	}
	return *o.Timemodified
}

// GetTimemodifiedOk returns a tuple with the Timemodified field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetTimemodifiedOk() (*int32, bool) {
	if o == nil || IsNil(o.Timemodified) {
		return nil, false
	}
	return o.Timemodified, true
}

// HasTimemodified returns a boolean if a field has been set.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasTimemodified() bool {
	if o != nil && !IsNil(o.Timemodified) {
		return true
	}

	return false
}

// SetTimemodified gets a reference to the given int32 and assigns it to the Timemodified field.
func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetTimemodified(v int32) {
	o.Timemodified = &v
}

func (o ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Contenthash) {
		toSerialize["contenthash"] = o.Contenthash
	}
	if !IsNil(o.Context) {
		toSerialize["context"] = o.Context
	}
	if !IsNil(o.Course) {
		toSerialize["course"] = o.Course
	}
	if !IsNil(o.Coursemodule) {
		toSerialize["coursemodule"] = o.Coursemodule
	}
	if !IsNil(o.Deployedfile) {
		toSerialize["deployedfile"] = o.Deployedfile
	}
	if !IsNil(o.Displayoptions) {
		toSerialize["displayoptions"] = o.Displayoptions
	}
	if !IsNil(o.Enabletracking) {
		toSerialize["enabletracking"] = o.Enabletracking
	}
	if !IsNil(o.Grade) {
		toSerialize["grade"] = o.Grade
	}
	if !IsNil(o.Grademethod) {
		toSerialize["grademethod"] = o.Grademethod
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
	if !IsNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !IsNil(o.Package) {
		toSerialize["package"] = o.Package
	}
	if !IsNil(o.Timecreated) {
		toSerialize["timecreated"] = o.Timecreated
	}
	if !IsNil(o.Timemodified) {
		toSerialize["timemodified"] = o.Timemodified
	}
	return toSerialize, nil
}

type NullableModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner struct {
	value *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner
	isSet bool
}

func (v NullableModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) Get() *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner {
	return v.value
}

func (v *NullableModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) Set(val *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) {
	v.value = val
	v.isSet = true
}

func (v NullableModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) IsSet() bool {
	return v.isSet
}

func (v *NullableModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner(val *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) *NullableModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner {
	return &NullableModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner{value: val, isSet: true}
}

func (v NullableModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


