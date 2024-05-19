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

// checks if the CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner{}

// CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner struct for CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner
type CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner struct {
	// coursecategory
	Coursecategory *string `json:"coursecategory,omitempty"`
	// courseimage
	Courseimage *string `json:"courseimage,omitempty"`
	// enddate
	Enddate *int32 `json:"enddate,omitempty"`
	// fullname
	Fullname *string `json:"fullname,omitempty"`
	// fullnamedisplay
	Fullnamedisplay *string `json:"fullnamedisplay,omitempty"`
	// hasprogress
	Hasprogress *bool `json:"hasprogress,omitempty"`
	// hidden
	Hidden *bool `json:"hidden,omitempty"`
	// id
	Id *int32 `json:"id,omitempty"`
	// idnumber
	Idnumber *string `json:"idnumber,omitempty"`
	// isfavourite
	Isfavourite *bool `json:"isfavourite,omitempty"`
	// pdfexportfont
	Pdfexportfont *string `json:"pdfexportfont,omitempty"`
	// progress
	Progress *int32 `json:"progress,omitempty"`
	// shortname
	Shortname *string `json:"shortname,omitempty"`
	// showactivitydates
	Showactivitydates *bool `json:"showactivitydates,omitempty"`
	// showcompletionconditions
	Showcompletionconditions *bool `json:"showcompletionconditions,omitempty"`
	// showshortname
	Showshortname *bool `json:"showshortname,omitempty"`
	// startdate
	Startdate *int32 `json:"startdate,omitempty"`
	// summary
	Summary *string `json:"summary,omitempty"`
	// summary format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
	Summaryformat *int32 `json:"summaryformat,omitempty"`
	// timeaccess
	Timeaccess *int32 `json:"timeaccess,omitempty"`
	// viewurl
	Viewurl *string `json:"viewurl,omitempty"`
	// visible
	Visible *bool `json:"visible,omitempty"`
}

// NewCoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner instantiates a new CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner() *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner {
	this := CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner{}
	return &this
}

// NewCoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInnerWithDefaults instantiates a new CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInnerWithDefaults() *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner {
	this := CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner{}
	return &this
}

// GetCoursecategory returns the Coursecategory field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetCoursecategory() string {
	if o == nil || IsNil(o.Coursecategory) {
		var ret string
		return ret
	}
	return *o.Coursecategory
}

// GetCoursecategoryOk returns a tuple with the Coursecategory field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetCoursecategoryOk() (*string, bool) {
	if o == nil || IsNil(o.Coursecategory) {
		return nil, false
	}
	return o.Coursecategory, true
}

// HasCoursecategory returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) HasCoursecategory() bool {
	if o != nil && !IsNil(o.Coursecategory) {
		return true
	}

	return false
}

// SetCoursecategory gets a reference to the given string and assigns it to the Coursecategory field.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) SetCoursecategory(v string) {
	o.Coursecategory = &v
}

// GetCourseimage returns the Courseimage field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetCourseimage() string {
	if o == nil || IsNil(o.Courseimage) {
		var ret string
		return ret
	}
	return *o.Courseimage
}

// GetCourseimageOk returns a tuple with the Courseimage field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetCourseimageOk() (*string, bool) {
	if o == nil || IsNil(o.Courseimage) {
		return nil, false
	}
	return o.Courseimage, true
}

// HasCourseimage returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) HasCourseimage() bool {
	if o != nil && !IsNil(o.Courseimage) {
		return true
	}

	return false
}

// SetCourseimage gets a reference to the given string and assigns it to the Courseimage field.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) SetCourseimage(v string) {
	o.Courseimage = &v
}

// GetEnddate returns the Enddate field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetEnddate() int32 {
	if o == nil || IsNil(o.Enddate) {
		var ret int32
		return ret
	}
	return *o.Enddate
}

// GetEnddateOk returns a tuple with the Enddate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetEnddateOk() (*int32, bool) {
	if o == nil || IsNil(o.Enddate) {
		return nil, false
	}
	return o.Enddate, true
}

// HasEnddate returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) HasEnddate() bool {
	if o != nil && !IsNil(o.Enddate) {
		return true
	}

	return false
}

// SetEnddate gets a reference to the given int32 and assigns it to the Enddate field.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) SetEnddate(v int32) {
	o.Enddate = &v
}

// GetFullname returns the Fullname field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetFullname() string {
	if o == nil || IsNil(o.Fullname) {
		var ret string
		return ret
	}
	return *o.Fullname
}

// GetFullnameOk returns a tuple with the Fullname field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetFullnameOk() (*string, bool) {
	if o == nil || IsNil(o.Fullname) {
		return nil, false
	}
	return o.Fullname, true
}

// HasFullname returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) HasFullname() bool {
	if o != nil && !IsNil(o.Fullname) {
		return true
	}

	return false
}

// SetFullname gets a reference to the given string and assigns it to the Fullname field.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) SetFullname(v string) {
	o.Fullname = &v
}

// GetFullnamedisplay returns the Fullnamedisplay field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetFullnamedisplay() string {
	if o == nil || IsNil(o.Fullnamedisplay) {
		var ret string
		return ret
	}
	return *o.Fullnamedisplay
}

// GetFullnamedisplayOk returns a tuple with the Fullnamedisplay field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetFullnamedisplayOk() (*string, bool) {
	if o == nil || IsNil(o.Fullnamedisplay) {
		return nil, false
	}
	return o.Fullnamedisplay, true
}

// HasFullnamedisplay returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) HasFullnamedisplay() bool {
	if o != nil && !IsNil(o.Fullnamedisplay) {
		return true
	}

	return false
}

// SetFullnamedisplay gets a reference to the given string and assigns it to the Fullnamedisplay field.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) SetFullnamedisplay(v string) {
	o.Fullnamedisplay = &v
}

// GetHasprogress returns the Hasprogress field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetHasprogress() bool {
	if o == nil || IsNil(o.Hasprogress) {
		var ret bool
		return ret
	}
	return *o.Hasprogress
}

// GetHasprogressOk returns a tuple with the Hasprogress field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetHasprogressOk() (*bool, bool) {
	if o == nil || IsNil(o.Hasprogress) {
		return nil, false
	}
	return o.Hasprogress, true
}

// HasHasprogress returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) HasHasprogress() bool {
	if o != nil && !IsNil(o.Hasprogress) {
		return true
	}

	return false
}

// SetHasprogress gets a reference to the given bool and assigns it to the Hasprogress field.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) SetHasprogress(v bool) {
	o.Hasprogress = &v
}

// GetHidden returns the Hidden field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetHidden() bool {
	if o == nil || IsNil(o.Hidden) {
		var ret bool
		return ret
	}
	return *o.Hidden
}

// GetHiddenOk returns a tuple with the Hidden field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetHiddenOk() (*bool, bool) {
	if o == nil || IsNil(o.Hidden) {
		return nil, false
	}
	return o.Hidden, true
}

// HasHidden returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) HasHidden() bool {
	if o != nil && !IsNil(o.Hidden) {
		return true
	}

	return false
}

// SetHidden gets a reference to the given bool and assigns it to the Hidden field.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) SetHidden(v bool) {
	o.Hidden = &v
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetId() int32 {
	if o == nil || IsNil(o.Id) {
		var ret int32
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetIdOk() (*int32, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given int32 and assigns it to the Id field.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) SetId(v int32) {
	o.Id = &v
}

// GetIdnumber returns the Idnumber field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetIdnumber() string {
	if o == nil || IsNil(o.Idnumber) {
		var ret string
		return ret
	}
	return *o.Idnumber
}

// GetIdnumberOk returns a tuple with the Idnumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetIdnumberOk() (*string, bool) {
	if o == nil || IsNil(o.Idnumber) {
		return nil, false
	}
	return o.Idnumber, true
}

// HasIdnumber returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) HasIdnumber() bool {
	if o != nil && !IsNil(o.Idnumber) {
		return true
	}

	return false
}

// SetIdnumber gets a reference to the given string and assigns it to the Idnumber field.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) SetIdnumber(v string) {
	o.Idnumber = &v
}

// GetIsfavourite returns the Isfavourite field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetIsfavourite() bool {
	if o == nil || IsNil(o.Isfavourite) {
		var ret bool
		return ret
	}
	return *o.Isfavourite
}

// GetIsfavouriteOk returns a tuple with the Isfavourite field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetIsfavouriteOk() (*bool, bool) {
	if o == nil || IsNil(o.Isfavourite) {
		return nil, false
	}
	return o.Isfavourite, true
}

// HasIsfavourite returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) HasIsfavourite() bool {
	if o != nil && !IsNil(o.Isfavourite) {
		return true
	}

	return false
}

// SetIsfavourite gets a reference to the given bool and assigns it to the Isfavourite field.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) SetIsfavourite(v bool) {
	o.Isfavourite = &v
}

// GetPdfexportfont returns the Pdfexportfont field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetPdfexportfont() string {
	if o == nil || IsNil(o.Pdfexportfont) {
		var ret string
		return ret
	}
	return *o.Pdfexportfont
}

// GetPdfexportfontOk returns a tuple with the Pdfexportfont field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetPdfexportfontOk() (*string, bool) {
	if o == nil || IsNil(o.Pdfexportfont) {
		return nil, false
	}
	return o.Pdfexportfont, true
}

// HasPdfexportfont returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) HasPdfexportfont() bool {
	if o != nil && !IsNil(o.Pdfexportfont) {
		return true
	}

	return false
}

// SetPdfexportfont gets a reference to the given string and assigns it to the Pdfexportfont field.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) SetPdfexportfont(v string) {
	o.Pdfexportfont = &v
}

// GetProgress returns the Progress field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetProgress() int32 {
	if o == nil || IsNil(o.Progress) {
		var ret int32
		return ret
	}
	return *o.Progress
}

// GetProgressOk returns a tuple with the Progress field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetProgressOk() (*int32, bool) {
	if o == nil || IsNil(o.Progress) {
		return nil, false
	}
	return o.Progress, true
}

// HasProgress returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) HasProgress() bool {
	if o != nil && !IsNil(o.Progress) {
		return true
	}

	return false
}

// SetProgress gets a reference to the given int32 and assigns it to the Progress field.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) SetProgress(v int32) {
	o.Progress = &v
}

// GetShortname returns the Shortname field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetShortname() string {
	if o == nil || IsNil(o.Shortname) {
		var ret string
		return ret
	}
	return *o.Shortname
}

// GetShortnameOk returns a tuple with the Shortname field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetShortnameOk() (*string, bool) {
	if o == nil || IsNil(o.Shortname) {
		return nil, false
	}
	return o.Shortname, true
}

// HasShortname returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) HasShortname() bool {
	if o != nil && !IsNil(o.Shortname) {
		return true
	}

	return false
}

// SetShortname gets a reference to the given string and assigns it to the Shortname field.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) SetShortname(v string) {
	o.Shortname = &v
}

// GetShowactivitydates returns the Showactivitydates field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetShowactivitydates() bool {
	if o == nil || IsNil(o.Showactivitydates) {
		var ret bool
		return ret
	}
	return *o.Showactivitydates
}

// GetShowactivitydatesOk returns a tuple with the Showactivitydates field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetShowactivitydatesOk() (*bool, bool) {
	if o == nil || IsNil(o.Showactivitydates) {
		return nil, false
	}
	return o.Showactivitydates, true
}

// HasShowactivitydates returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) HasShowactivitydates() bool {
	if o != nil && !IsNil(o.Showactivitydates) {
		return true
	}

	return false
}

// SetShowactivitydates gets a reference to the given bool and assigns it to the Showactivitydates field.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) SetShowactivitydates(v bool) {
	o.Showactivitydates = &v
}

// GetShowcompletionconditions returns the Showcompletionconditions field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetShowcompletionconditions() bool {
	if o == nil || IsNil(o.Showcompletionconditions) {
		var ret bool
		return ret
	}
	return *o.Showcompletionconditions
}

// GetShowcompletionconditionsOk returns a tuple with the Showcompletionconditions field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetShowcompletionconditionsOk() (*bool, bool) {
	if o == nil || IsNil(o.Showcompletionconditions) {
		return nil, false
	}
	return o.Showcompletionconditions, true
}

// HasShowcompletionconditions returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) HasShowcompletionconditions() bool {
	if o != nil && !IsNil(o.Showcompletionconditions) {
		return true
	}

	return false
}

// SetShowcompletionconditions gets a reference to the given bool and assigns it to the Showcompletionconditions field.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) SetShowcompletionconditions(v bool) {
	o.Showcompletionconditions = &v
}

// GetShowshortname returns the Showshortname field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetShowshortname() bool {
	if o == nil || IsNil(o.Showshortname) {
		var ret bool
		return ret
	}
	return *o.Showshortname
}

// GetShowshortnameOk returns a tuple with the Showshortname field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetShowshortnameOk() (*bool, bool) {
	if o == nil || IsNil(o.Showshortname) {
		return nil, false
	}
	return o.Showshortname, true
}

// HasShowshortname returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) HasShowshortname() bool {
	if o != nil && !IsNil(o.Showshortname) {
		return true
	}

	return false
}

// SetShowshortname gets a reference to the given bool and assigns it to the Showshortname field.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) SetShowshortname(v bool) {
	o.Showshortname = &v
}

// GetStartdate returns the Startdate field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetStartdate() int32 {
	if o == nil || IsNil(o.Startdate) {
		var ret int32
		return ret
	}
	return *o.Startdate
}

// GetStartdateOk returns a tuple with the Startdate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetStartdateOk() (*int32, bool) {
	if o == nil || IsNil(o.Startdate) {
		return nil, false
	}
	return o.Startdate, true
}

// HasStartdate returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) HasStartdate() bool {
	if o != nil && !IsNil(o.Startdate) {
		return true
	}

	return false
}

// SetStartdate gets a reference to the given int32 and assigns it to the Startdate field.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) SetStartdate(v int32) {
	o.Startdate = &v
}

// GetSummary returns the Summary field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetSummary() string {
	if o == nil || IsNil(o.Summary) {
		var ret string
		return ret
	}
	return *o.Summary
}

// GetSummaryOk returns a tuple with the Summary field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetSummaryOk() (*string, bool) {
	if o == nil || IsNil(o.Summary) {
		return nil, false
	}
	return o.Summary, true
}

// HasSummary returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) HasSummary() bool {
	if o != nil && !IsNil(o.Summary) {
		return true
	}

	return false
}

// SetSummary gets a reference to the given string and assigns it to the Summary field.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) SetSummary(v string) {
	o.Summary = &v
}

// GetSummaryformat returns the Summaryformat field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetSummaryformat() int32 {
	if o == nil || IsNil(o.Summaryformat) {
		var ret int32
		return ret
	}
	return *o.Summaryformat
}

// GetSummaryformatOk returns a tuple with the Summaryformat field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetSummaryformatOk() (*int32, bool) {
	if o == nil || IsNil(o.Summaryformat) {
		return nil, false
	}
	return o.Summaryformat, true
}

// HasSummaryformat returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) HasSummaryformat() bool {
	if o != nil && !IsNil(o.Summaryformat) {
		return true
	}

	return false
}

// SetSummaryformat gets a reference to the given int32 and assigns it to the Summaryformat field.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) SetSummaryformat(v int32) {
	o.Summaryformat = &v
}

// GetTimeaccess returns the Timeaccess field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetTimeaccess() int32 {
	if o == nil || IsNil(o.Timeaccess) {
		var ret int32
		return ret
	}
	return *o.Timeaccess
}

// GetTimeaccessOk returns a tuple with the Timeaccess field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetTimeaccessOk() (*int32, bool) {
	if o == nil || IsNil(o.Timeaccess) {
		return nil, false
	}
	return o.Timeaccess, true
}

// HasTimeaccess returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) HasTimeaccess() bool {
	if o != nil && !IsNil(o.Timeaccess) {
		return true
	}

	return false
}

// SetTimeaccess gets a reference to the given int32 and assigns it to the Timeaccess field.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) SetTimeaccess(v int32) {
	o.Timeaccess = &v
}

// GetViewurl returns the Viewurl field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetViewurl() string {
	if o == nil || IsNil(o.Viewurl) {
		var ret string
		return ret
	}
	return *o.Viewurl
}

// GetViewurlOk returns a tuple with the Viewurl field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetViewurlOk() (*string, bool) {
	if o == nil || IsNil(o.Viewurl) {
		return nil, false
	}
	return o.Viewurl, true
}

// HasViewurl returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) HasViewurl() bool {
	if o != nil && !IsNil(o.Viewurl) {
		return true
	}

	return false
}

// SetViewurl gets a reference to the given string and assigns it to the Viewurl field.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) SetViewurl(v string) {
	o.Viewurl = &v
}

// GetVisible returns the Visible field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetVisible() bool {
	if o == nil || IsNil(o.Visible) {
		var ret bool
		return ret
	}
	return *o.Visible
}

// GetVisibleOk returns a tuple with the Visible field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) GetVisibleOk() (*bool, bool) {
	if o == nil || IsNil(o.Visible) {
		return nil, false
	}
	return o.Visible, true
}

// HasVisible returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) HasVisible() bool {
	if o != nil && !IsNil(o.Visible) {
		return true
	}

	return false
}

// SetVisible gets a reference to the given bool and assigns it to the Visible field.
func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) SetVisible(v bool) {
	o.Visible = &v
}

func (o CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Coursecategory) {
		toSerialize["coursecategory"] = o.Coursecategory
	}
	if !IsNil(o.Courseimage) {
		toSerialize["courseimage"] = o.Courseimage
	}
	if !IsNil(o.Enddate) {
		toSerialize["enddate"] = o.Enddate
	}
	if !IsNil(o.Fullname) {
		toSerialize["fullname"] = o.Fullname
	}
	if !IsNil(o.Fullnamedisplay) {
		toSerialize["fullnamedisplay"] = o.Fullnamedisplay
	}
	if !IsNil(o.Hasprogress) {
		toSerialize["hasprogress"] = o.Hasprogress
	}
	if !IsNil(o.Hidden) {
		toSerialize["hidden"] = o.Hidden
	}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.Idnumber) {
		toSerialize["idnumber"] = o.Idnumber
	}
	if !IsNil(o.Isfavourite) {
		toSerialize["isfavourite"] = o.Isfavourite
	}
	if !IsNil(o.Pdfexportfont) {
		toSerialize["pdfexportfont"] = o.Pdfexportfont
	}
	if !IsNil(o.Progress) {
		toSerialize["progress"] = o.Progress
	}
	if !IsNil(o.Shortname) {
		toSerialize["shortname"] = o.Shortname
	}
	if !IsNil(o.Showactivitydates) {
		toSerialize["showactivitydates"] = o.Showactivitydates
	}
	if !IsNil(o.Showcompletionconditions) {
		toSerialize["showcompletionconditions"] = o.Showcompletionconditions
	}
	if !IsNil(o.Showshortname) {
		toSerialize["showshortname"] = o.Showshortname
	}
	if !IsNil(o.Startdate) {
		toSerialize["startdate"] = o.Startdate
	}
	if !IsNil(o.Summary) {
		toSerialize["summary"] = o.Summary
	}
	if !IsNil(o.Summaryformat) {
		toSerialize["summaryformat"] = o.Summaryformat
	}
	if !IsNil(o.Timeaccess) {
		toSerialize["timeaccess"] = o.Timeaccess
	}
	if !IsNil(o.Viewurl) {
		toSerialize["viewurl"] = o.Viewurl
	}
	if !IsNil(o.Visible) {
		toSerialize["visible"] = o.Visible
	}
	return toSerialize, nil
}

type NullableCoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner struct {
	value *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner
	isSet bool
}

func (v NullableCoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) Get() *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner {
	return v.value
}

func (v *NullableCoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) Set(val *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner(val *CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) *NullableCoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner {
	return &NullableCoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner{value: val, isSet: true}
}

func (v NullableCoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


