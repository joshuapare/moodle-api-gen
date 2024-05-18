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

// checks if the CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse{}

// CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse struct for CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse
type CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse struct {
	// coursecategory
	Coursecategory string `json:"coursecategory"`
	// courseimage
	Courseimage string `json:"courseimage"`
	// enddate
	Enddate int32 `json:"enddate"`
	// fullname
	Fullname string `json:"fullname"`
	// fullnamedisplay
	Fullnamedisplay string `json:"fullnamedisplay"`
	// hasprogress
	Hasprogress bool `json:"hasprogress"`
	// hidden
	Hidden bool `json:"hidden"`
	// id
	Id int32 `json:"id"`
	// idnumber
	Idnumber string `json:"idnumber"`
	// isfavourite
	Isfavourite bool `json:"isfavourite"`
	// pdfexportfont
	Pdfexportfont string `json:"pdfexportfont"`
	// progress
	Progress *int32 `json:"progress,omitempty"`
	// shortname
	Shortname string `json:"shortname"`
	// showactivitydates
	Showactivitydates bool `json:"showactivitydates"`
	// showcompletionconditions
	Showcompletionconditions bool `json:"showcompletionconditions"`
	// showshortname
	Showshortname bool `json:"showshortname"`
	// startdate
	Startdate int32 `json:"startdate"`
	// summary
	Summary string `json:"summary"`
	// summary format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
	Summaryformat int32 `json:"summaryformat"`
	// timeaccess
	Timeaccess *int32 `json:"timeaccess,omitempty"`
	// viewurl
	Viewurl string `json:"viewurl"`
	// visible
	Visible bool `json:"visible"`
}

type _CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse

// NewCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse instantiates a new CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse(coursecategory string, courseimage string, enddate int32, fullname string, fullnamedisplay string, hasprogress bool, hidden bool, id int32, idnumber string, isfavourite bool, pdfexportfont string, shortname string, showactivitydates bool, showcompletionconditions bool, showshortname bool, startdate int32, summary string, summaryformat int32, viewurl string, visible bool) *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse {
	this := CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse{}
	this.Coursecategory = coursecategory
	this.Courseimage = courseimage
	this.Enddate = enddate
	this.Fullname = fullname
	this.Fullnamedisplay = fullnamedisplay
	this.Hasprogress = hasprogress
	this.Hidden = hidden
	this.Id = id
	this.Idnumber = idnumber
	this.Isfavourite = isfavourite
	this.Pdfexportfont = pdfexportfont
	this.Shortname = shortname
	this.Showactivitydates = showactivitydates
	this.Showcompletionconditions = showcompletionconditions
	this.Showshortname = showshortname
	this.Startdate = startdate
	this.Summary = summary
	this.Summaryformat = summaryformat
	this.Viewurl = viewurl
	this.Visible = visible
	return &this
}

// NewCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourseWithDefaults instantiates a new CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourseWithDefaults() *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse {
	this := CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse{}
	return &this
}

// GetCoursecategory returns the Coursecategory field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetCoursecategory() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Coursecategory
}

// GetCoursecategoryOk returns a tuple with the Coursecategory field value
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetCoursecategoryOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Coursecategory, true
}

// SetCoursecategory sets field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) SetCoursecategory(v string) {
	o.Coursecategory = v
}

// GetCourseimage returns the Courseimage field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetCourseimage() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Courseimage
}

// GetCourseimageOk returns a tuple with the Courseimage field value
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetCourseimageOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Courseimage, true
}

// SetCourseimage sets field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) SetCourseimage(v string) {
	o.Courseimage = v
}

// GetEnddate returns the Enddate field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetEnddate() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Enddate
}

// GetEnddateOk returns a tuple with the Enddate field value
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetEnddateOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Enddate, true
}

// SetEnddate sets field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) SetEnddate(v int32) {
	o.Enddate = v
}

// GetFullname returns the Fullname field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetFullname() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Fullname
}

// GetFullnameOk returns a tuple with the Fullname field value
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetFullnameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Fullname, true
}

// SetFullname sets field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) SetFullname(v string) {
	o.Fullname = v
}

// GetFullnamedisplay returns the Fullnamedisplay field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetFullnamedisplay() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Fullnamedisplay
}

// GetFullnamedisplayOk returns a tuple with the Fullnamedisplay field value
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetFullnamedisplayOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Fullnamedisplay, true
}

// SetFullnamedisplay sets field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) SetFullnamedisplay(v string) {
	o.Fullnamedisplay = v
}

// GetHasprogress returns the Hasprogress field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetHasprogress() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Hasprogress
}

// GetHasprogressOk returns a tuple with the Hasprogress field value
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetHasprogressOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Hasprogress, true
}

// SetHasprogress sets field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) SetHasprogress(v bool) {
	o.Hasprogress = v
}

// GetHidden returns the Hidden field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetHidden() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Hidden
}

// GetHiddenOk returns a tuple with the Hidden field value
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetHiddenOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Hidden, true
}

// SetHidden sets field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) SetHidden(v bool) {
	o.Hidden = v
}

// GetId returns the Id field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetId() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetIdOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) SetId(v int32) {
	o.Id = v
}

// GetIdnumber returns the Idnumber field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetIdnumber() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Idnumber
}

// GetIdnumberOk returns a tuple with the Idnumber field value
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetIdnumberOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Idnumber, true
}

// SetIdnumber sets field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) SetIdnumber(v string) {
	o.Idnumber = v
}

// GetIsfavourite returns the Isfavourite field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetIsfavourite() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Isfavourite
}

// GetIsfavouriteOk returns a tuple with the Isfavourite field value
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetIsfavouriteOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Isfavourite, true
}

// SetIsfavourite sets field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) SetIsfavourite(v bool) {
	o.Isfavourite = v
}

// GetPdfexportfont returns the Pdfexportfont field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetPdfexportfont() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Pdfexportfont
}

// GetPdfexportfontOk returns a tuple with the Pdfexportfont field value
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetPdfexportfontOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Pdfexportfont, true
}

// SetPdfexportfont sets field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) SetPdfexportfont(v string) {
	o.Pdfexportfont = v
}

// GetProgress returns the Progress field value if set, zero value otherwise.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetProgress() int32 {
	if o == nil || IsNil(o.Progress) {
		var ret int32
		return ret
	}
	return *o.Progress
}

// GetProgressOk returns a tuple with the Progress field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetProgressOk() (*int32, bool) {
	if o == nil || IsNil(o.Progress) {
		return nil, false
	}
	return o.Progress, true
}

// HasProgress returns a boolean if a field has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) HasProgress() bool {
	if o != nil && !IsNil(o.Progress) {
		return true
	}

	return false
}

// SetProgress gets a reference to the given int32 and assigns it to the Progress field.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) SetProgress(v int32) {
	o.Progress = &v
}

// GetShortname returns the Shortname field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetShortname() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Shortname
}

// GetShortnameOk returns a tuple with the Shortname field value
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetShortnameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Shortname, true
}

// SetShortname sets field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) SetShortname(v string) {
	o.Shortname = v
}

// GetShowactivitydates returns the Showactivitydates field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetShowactivitydates() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Showactivitydates
}

// GetShowactivitydatesOk returns a tuple with the Showactivitydates field value
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetShowactivitydatesOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Showactivitydates, true
}

// SetShowactivitydates sets field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) SetShowactivitydates(v bool) {
	o.Showactivitydates = v
}

// GetShowcompletionconditions returns the Showcompletionconditions field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetShowcompletionconditions() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Showcompletionconditions
}

// GetShowcompletionconditionsOk returns a tuple with the Showcompletionconditions field value
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetShowcompletionconditionsOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Showcompletionconditions, true
}

// SetShowcompletionconditions sets field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) SetShowcompletionconditions(v bool) {
	o.Showcompletionconditions = v
}

// GetShowshortname returns the Showshortname field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetShowshortname() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Showshortname
}

// GetShowshortnameOk returns a tuple with the Showshortname field value
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetShowshortnameOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Showshortname, true
}

// SetShowshortname sets field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) SetShowshortname(v bool) {
	o.Showshortname = v
}

// GetStartdate returns the Startdate field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetStartdate() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Startdate
}

// GetStartdateOk returns a tuple with the Startdate field value
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetStartdateOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Startdate, true
}

// SetStartdate sets field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) SetStartdate(v int32) {
	o.Startdate = v
}

// GetSummary returns the Summary field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetSummary() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Summary
}

// GetSummaryOk returns a tuple with the Summary field value
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetSummaryOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Summary, true
}

// SetSummary sets field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) SetSummary(v string) {
	o.Summary = v
}

// GetSummaryformat returns the Summaryformat field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetSummaryformat() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Summaryformat
}

// GetSummaryformatOk returns a tuple with the Summaryformat field value
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetSummaryformatOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Summaryformat, true
}

// SetSummaryformat sets field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) SetSummaryformat(v int32) {
	o.Summaryformat = v
}

// GetTimeaccess returns the Timeaccess field value if set, zero value otherwise.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetTimeaccess() int32 {
	if o == nil || IsNil(o.Timeaccess) {
		var ret int32
		return ret
	}
	return *o.Timeaccess
}

// GetTimeaccessOk returns a tuple with the Timeaccess field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetTimeaccessOk() (*int32, bool) {
	if o == nil || IsNil(o.Timeaccess) {
		return nil, false
	}
	return o.Timeaccess, true
}

// HasTimeaccess returns a boolean if a field has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) HasTimeaccess() bool {
	if o != nil && !IsNil(o.Timeaccess) {
		return true
	}

	return false
}

// SetTimeaccess gets a reference to the given int32 and assigns it to the Timeaccess field.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) SetTimeaccess(v int32) {
	o.Timeaccess = &v
}

// GetViewurl returns the Viewurl field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetViewurl() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Viewurl
}

// GetViewurlOk returns a tuple with the Viewurl field value
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetViewurlOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Viewurl, true
}

// SetViewurl sets field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) SetViewurl(v string) {
	o.Viewurl = v
}

// GetVisible returns the Visible field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetVisible() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Visible
}

// GetVisibleOk returns a tuple with the Visible field value
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) GetVisibleOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Visible, true
}

// SetVisible sets field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) SetVisible(v bool) {
	o.Visible = v
}

func (o CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["coursecategory"] = o.Coursecategory
	toSerialize["courseimage"] = o.Courseimage
	toSerialize["enddate"] = o.Enddate
	toSerialize["fullname"] = o.Fullname
	toSerialize["fullnamedisplay"] = o.Fullnamedisplay
	toSerialize["hasprogress"] = o.Hasprogress
	toSerialize["hidden"] = o.Hidden
	toSerialize["id"] = o.Id
	toSerialize["idnumber"] = o.Idnumber
	toSerialize["isfavourite"] = o.Isfavourite
	toSerialize["pdfexportfont"] = o.Pdfexportfont
	if !IsNil(o.Progress) {
		toSerialize["progress"] = o.Progress
	}
	toSerialize["shortname"] = o.Shortname
	toSerialize["showactivitydates"] = o.Showactivitydates
	toSerialize["showcompletionconditions"] = o.Showcompletionconditions
	toSerialize["showshortname"] = o.Showshortname
	toSerialize["startdate"] = o.Startdate
	toSerialize["summary"] = o.Summary
	toSerialize["summaryformat"] = o.Summaryformat
	if !IsNil(o.Timeaccess) {
		toSerialize["timeaccess"] = o.Timeaccess
	}
	toSerialize["viewurl"] = o.Viewurl
	toSerialize["visible"] = o.Visible
	return toSerialize, nil
}

func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"coursecategory",
		"courseimage",
		"enddate",
		"fullname",
		"fullnamedisplay",
		"hasprogress",
		"hidden",
		"id",
		"idnumber",
		"isfavourite",
		"pdfexportfont",
		"shortname",
		"showactivitydates",
		"showcompletionconditions",
		"showshortname",
		"startdate",
		"summary",
		"summaryformat",
		"viewurl",
		"visible",
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

	varCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse := _CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse)

	if err != nil {
		return err
	}

	*o = CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse(varCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse)

	return err
}

type NullableCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse struct {
	value *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse
	isSet bool
}

func (v NullableCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) Get() *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse {
	return v.value
}

func (v *NullableCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) Set(val *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse(val *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) *NullableCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse {
	return &NullableCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse{value: val, isSet: true}
}

func (v NullableCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

