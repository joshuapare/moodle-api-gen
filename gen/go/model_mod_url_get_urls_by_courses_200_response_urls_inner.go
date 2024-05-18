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

// checks if the ModUrlGetUrlsByCourses200ResponseUrlsInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModUrlGetUrlsByCourses200ResponseUrlsInner{}

// ModUrlGetUrlsByCourses200ResponseUrlsInner struct for ModUrlGetUrlsByCourses200ResponseUrlsInner
type ModUrlGetUrlsByCourses200ResponseUrlsInner struct {
	// Course id
	Course *int32 `json:"course,omitempty"`
	// Course module id
	Coursemodule *int32 `json:"coursemodule,omitempty"`
	// How to display the url
	Display *int32 `json:"display,omitempty"`
	// Display options (width, height)
	Displayoptions *string `json:"displayoptions,omitempty"`
	// External URL
	Externalurl *string `json:"externalurl,omitempty"`
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
	// Activity name
	Name *string `json:"name,omitempty"`
	// Parameters to append to the URL
	Parameters *string `json:"parameters,omitempty"`
	// Course section id
	Section *int32 `json:"section,omitempty"`
	// Last time the url was modified
	Timemodified *int32 `json:"timemodified,omitempty"`
	// Visible
	Visible *bool `json:"visible,omitempty"`
}

// NewModUrlGetUrlsByCourses200ResponseUrlsInner instantiates a new ModUrlGetUrlsByCourses200ResponseUrlsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModUrlGetUrlsByCourses200ResponseUrlsInner() *ModUrlGetUrlsByCourses200ResponseUrlsInner {
	this := ModUrlGetUrlsByCourses200ResponseUrlsInner{}
	var display int32 = null
	this.Display = &display
	var externalurl string = "null"
	this.Externalurl = &externalurl
	var parameters string = "null"
	this.Parameters = &parameters
	var timemodified int32 = null
	this.Timemodified = &timemodified
	return &this
}

// NewModUrlGetUrlsByCourses200ResponseUrlsInnerWithDefaults instantiates a new ModUrlGetUrlsByCourses200ResponseUrlsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModUrlGetUrlsByCourses200ResponseUrlsInnerWithDefaults() *ModUrlGetUrlsByCourses200ResponseUrlsInner {
	this := ModUrlGetUrlsByCourses200ResponseUrlsInner{}
	var display int32 = null
	this.Display = &display
	var externalurl string = "null"
	this.Externalurl = &externalurl
	var parameters string = "null"
	this.Parameters = &parameters
	var timemodified int32 = null
	this.Timemodified = &timemodified
	return &this
}

// GetCourse returns the Course field value if set, zero value otherwise.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetCourse() int32 {
	if o == nil || IsNil(o.Course) {
		var ret int32
		return ret
	}
	return *o.Course
}

// GetCourseOk returns a tuple with the Course field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetCourseOk() (*int32, bool) {
	if o == nil || IsNil(o.Course) {
		return nil, false
	}
	return o.Course, true
}

// HasCourse returns a boolean if a field has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasCourse() bool {
	if o != nil && !IsNil(o.Course) {
		return true
	}

	return false
}

// SetCourse gets a reference to the given int32 and assigns it to the Course field.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetCourse(v int32) {
	o.Course = &v
}

// GetCoursemodule returns the Coursemodule field value if set, zero value otherwise.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetCoursemodule() int32 {
	if o == nil || IsNil(o.Coursemodule) {
		var ret int32
		return ret
	}
	return *o.Coursemodule
}

// GetCoursemoduleOk returns a tuple with the Coursemodule field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetCoursemoduleOk() (*int32, bool) {
	if o == nil || IsNil(o.Coursemodule) {
		return nil, false
	}
	return o.Coursemodule, true
}

// HasCoursemodule returns a boolean if a field has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasCoursemodule() bool {
	if o != nil && !IsNil(o.Coursemodule) {
		return true
	}

	return false
}

// SetCoursemodule gets a reference to the given int32 and assigns it to the Coursemodule field.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetCoursemodule(v int32) {
	o.Coursemodule = &v
}

// GetDisplay returns the Display field value if set, zero value otherwise.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetDisplay() int32 {
	if o == nil || IsNil(o.Display) {
		var ret int32
		return ret
	}
	return *o.Display
}

// GetDisplayOk returns a tuple with the Display field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetDisplayOk() (*int32, bool) {
	if o == nil || IsNil(o.Display) {
		return nil, false
	}
	return o.Display, true
}

// HasDisplay returns a boolean if a field has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasDisplay() bool {
	if o != nil && !IsNil(o.Display) {
		return true
	}

	return false
}

// SetDisplay gets a reference to the given int32 and assigns it to the Display field.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetDisplay(v int32) {
	o.Display = &v
}

// GetDisplayoptions returns the Displayoptions field value if set, zero value otherwise.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetDisplayoptions() string {
	if o == nil || IsNil(o.Displayoptions) {
		var ret string
		return ret
	}
	return *o.Displayoptions
}

// GetDisplayoptionsOk returns a tuple with the Displayoptions field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetDisplayoptionsOk() (*string, bool) {
	if o == nil || IsNil(o.Displayoptions) {
		return nil, false
	}
	return o.Displayoptions, true
}

// HasDisplayoptions returns a boolean if a field has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasDisplayoptions() bool {
	if o != nil && !IsNil(o.Displayoptions) {
		return true
	}

	return false
}

// SetDisplayoptions gets a reference to the given string and assigns it to the Displayoptions field.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetDisplayoptions(v string) {
	o.Displayoptions = &v
}

// GetExternalurl returns the Externalurl field value if set, zero value otherwise.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetExternalurl() string {
	if o == nil || IsNil(o.Externalurl) {
		var ret string
		return ret
	}
	return *o.Externalurl
}

// GetExternalurlOk returns a tuple with the Externalurl field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetExternalurlOk() (*string, bool) {
	if o == nil || IsNil(o.Externalurl) {
		return nil, false
	}
	return o.Externalurl, true
}

// HasExternalurl returns a boolean if a field has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasExternalurl() bool {
	if o != nil && !IsNil(o.Externalurl) {
		return true
	}

	return false
}

// SetExternalurl gets a reference to the given string and assigns it to the Externalurl field.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetExternalurl(v string) {
	o.Externalurl = &v
}

// GetGroupingid returns the Groupingid field value if set, zero value otherwise.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetGroupingid() int32 {
	if o == nil || IsNil(o.Groupingid) {
		var ret int32
		return ret
	}
	return *o.Groupingid
}

// GetGroupingidOk returns a tuple with the Groupingid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetGroupingidOk() (*int32, bool) {
	if o == nil || IsNil(o.Groupingid) {
		return nil, false
	}
	return o.Groupingid, true
}

// HasGroupingid returns a boolean if a field has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasGroupingid() bool {
	if o != nil && !IsNil(o.Groupingid) {
		return true
	}

	return false
}

// SetGroupingid gets a reference to the given int32 and assigns it to the Groupingid field.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetGroupingid(v int32) {
	o.Groupingid = &v
}

// GetGroupmode returns the Groupmode field value if set, zero value otherwise.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetGroupmode() int32 {
	if o == nil || IsNil(o.Groupmode) {
		var ret int32
		return ret
	}
	return *o.Groupmode
}

// GetGroupmodeOk returns a tuple with the Groupmode field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetGroupmodeOk() (*int32, bool) {
	if o == nil || IsNil(o.Groupmode) {
		return nil, false
	}
	return o.Groupmode, true
}

// HasGroupmode returns a boolean if a field has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasGroupmode() bool {
	if o != nil && !IsNil(o.Groupmode) {
		return true
	}

	return false
}

// SetGroupmode gets a reference to the given int32 and assigns it to the Groupmode field.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetGroupmode(v int32) {
	o.Groupmode = &v
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetId() int32 {
	if o == nil || IsNil(o.Id) {
		var ret int32
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetIdOk() (*int32, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given int32 and assigns it to the Id field.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetId(v int32) {
	o.Id = &v
}

// GetIntro returns the Intro field value if set, zero value otherwise.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetIntro() string {
	if o == nil || IsNil(o.Intro) {
		var ret string
		return ret
	}
	return *o.Intro
}

// GetIntroOk returns a tuple with the Intro field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetIntroOk() (*string, bool) {
	if o == nil || IsNil(o.Intro) {
		return nil, false
	}
	return o.Intro, true
}

// HasIntro returns a boolean if a field has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasIntro() bool {
	if o != nil && !IsNil(o.Intro) {
		return true
	}

	return false
}

// SetIntro gets a reference to the given string and assigns it to the Intro field.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetIntro(v string) {
	o.Intro = &v
}

// GetIntrofiles returns the Introfiles field value if set, zero value otherwise.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetIntrofiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner {
	if o == nil || IsNil(o.Introfiles) {
		var ret []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner
		return ret
	}
	return o.Introfiles
}

// GetIntrofilesOk returns a tuple with the Introfiles field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetIntrofilesOk() ([]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool) {
	if o == nil || IsNil(o.Introfiles) {
		return nil, false
	}
	return o.Introfiles, true
}

// HasIntrofiles returns a boolean if a field has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasIntrofiles() bool {
	if o != nil && !IsNil(o.Introfiles) {
		return true
	}

	return false
}

// SetIntrofiles gets a reference to the given []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner and assigns it to the Introfiles field.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetIntrofiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner) {
	o.Introfiles = v
}

// GetIntroformat returns the Introformat field value if set, zero value otherwise.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetIntroformat() int32 {
	if o == nil || IsNil(o.Introformat) {
		var ret int32
		return ret
	}
	return *o.Introformat
}

// GetIntroformatOk returns a tuple with the Introformat field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetIntroformatOk() (*int32, bool) {
	if o == nil || IsNil(o.Introformat) {
		return nil, false
	}
	return o.Introformat, true
}

// HasIntroformat returns a boolean if a field has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasIntroformat() bool {
	if o != nil && !IsNil(o.Introformat) {
		return true
	}

	return false
}

// SetIntroformat gets a reference to the given int32 and assigns it to the Introformat field.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetIntroformat(v int32) {
	o.Introformat = &v
}

// GetLang returns the Lang field value if set, zero value otherwise.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetLang() string {
	if o == nil || IsNil(o.Lang) {
		var ret string
		return ret
	}
	return *o.Lang
}

// GetLangOk returns a tuple with the Lang field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetLangOk() (*string, bool) {
	if o == nil || IsNil(o.Lang) {
		return nil, false
	}
	return o.Lang, true
}

// HasLang returns a boolean if a field has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasLang() bool {
	if o != nil && !IsNil(o.Lang) {
		return true
	}

	return false
}

// SetLang gets a reference to the given string and assigns it to the Lang field.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetLang(v string) {
	o.Lang = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetName(v string) {
	o.Name = &v
}

// GetParameters returns the Parameters field value if set, zero value otherwise.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetParameters() string {
	if o == nil || IsNil(o.Parameters) {
		var ret string
		return ret
	}
	return *o.Parameters
}

// GetParametersOk returns a tuple with the Parameters field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetParametersOk() (*string, bool) {
	if o == nil || IsNil(o.Parameters) {
		return nil, false
	}
	return o.Parameters, true
}

// HasParameters returns a boolean if a field has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasParameters() bool {
	if o != nil && !IsNil(o.Parameters) {
		return true
	}

	return false
}

// SetParameters gets a reference to the given string and assigns it to the Parameters field.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetParameters(v string) {
	o.Parameters = &v
}

// GetSection returns the Section field value if set, zero value otherwise.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetSection() int32 {
	if o == nil || IsNil(o.Section) {
		var ret int32
		return ret
	}
	return *o.Section
}

// GetSectionOk returns a tuple with the Section field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetSectionOk() (*int32, bool) {
	if o == nil || IsNil(o.Section) {
		return nil, false
	}
	return o.Section, true
}

// HasSection returns a boolean if a field has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasSection() bool {
	if o != nil && !IsNil(o.Section) {
		return true
	}

	return false
}

// SetSection gets a reference to the given int32 and assigns it to the Section field.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetSection(v int32) {
	o.Section = &v
}

// GetTimemodified returns the Timemodified field value if set, zero value otherwise.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetTimemodified() int32 {
	if o == nil || IsNil(o.Timemodified) {
		var ret int32
		return ret
	}
	return *o.Timemodified
}

// GetTimemodifiedOk returns a tuple with the Timemodified field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetTimemodifiedOk() (*int32, bool) {
	if o == nil || IsNil(o.Timemodified) {
		return nil, false
	}
	return o.Timemodified, true
}

// HasTimemodified returns a boolean if a field has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasTimemodified() bool {
	if o != nil && !IsNil(o.Timemodified) {
		return true
	}

	return false
}

// SetTimemodified gets a reference to the given int32 and assigns it to the Timemodified field.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetTimemodified(v int32) {
	o.Timemodified = &v
}

// GetVisible returns the Visible field value if set, zero value otherwise.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetVisible() bool {
	if o == nil || IsNil(o.Visible) {
		var ret bool
		return ret
	}
	return *o.Visible
}

// GetVisibleOk returns a tuple with the Visible field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) GetVisibleOk() (*bool, bool) {
	if o == nil || IsNil(o.Visible) {
		return nil, false
	}
	return o.Visible, true
}

// HasVisible returns a boolean if a field has been set.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) HasVisible() bool {
	if o != nil && !IsNil(o.Visible) {
		return true
	}

	return false
}

// SetVisible gets a reference to the given bool and assigns it to the Visible field.
func (o *ModUrlGetUrlsByCourses200ResponseUrlsInner) SetVisible(v bool) {
	o.Visible = &v
}

func (o ModUrlGetUrlsByCourses200ResponseUrlsInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModUrlGetUrlsByCourses200ResponseUrlsInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
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
	if !IsNil(o.Externalurl) {
		toSerialize["externalurl"] = o.Externalurl
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
	if !IsNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !IsNil(o.Parameters) {
		toSerialize["parameters"] = o.Parameters
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

type NullableModUrlGetUrlsByCourses200ResponseUrlsInner struct {
	value *ModUrlGetUrlsByCourses200ResponseUrlsInner
	isSet bool
}

func (v NullableModUrlGetUrlsByCourses200ResponseUrlsInner) Get() *ModUrlGetUrlsByCourses200ResponseUrlsInner {
	return v.value
}

func (v *NullableModUrlGetUrlsByCourses200ResponseUrlsInner) Set(val *ModUrlGetUrlsByCourses200ResponseUrlsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableModUrlGetUrlsByCourses200ResponseUrlsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableModUrlGetUrlsByCourses200ResponseUrlsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModUrlGetUrlsByCourses200ResponseUrlsInner(val *ModUrlGetUrlsByCourses200ResponseUrlsInner) *NullableModUrlGetUrlsByCourses200ResponseUrlsInner {
	return &NullableModUrlGetUrlsByCourses200ResponseUrlsInner{value: val, isSet: true}
}

func (v NullableModUrlGetUrlsByCourses200ResponseUrlsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModUrlGetUrlsByCourses200ResponseUrlsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


