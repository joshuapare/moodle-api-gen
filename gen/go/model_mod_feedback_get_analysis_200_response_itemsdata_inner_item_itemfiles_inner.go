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

// checks if the ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner{}

// ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner struct for ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner
type ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner struct {
	// author
	Author *string `json:"author,omitempty"`
	// component
	Component *string `json:"component,omitempty"`
	// contextid
	Contextid *int32 `json:"contextid,omitempty"`
	// filearea
	Filearea *string `json:"filearea,omitempty"`
	// filename
	Filename *string `json:"filename,omitempty"`
	// filenameshort
	Filenameshort *string `json:"filenameshort,omitempty"`
	// filepath
	Filepath *string `json:"filepath,omitempty"`
	// filesize
	Filesize *int32 `json:"filesize,omitempty"`
	// filesizeformatted
	Filesizeformatted *string `json:"filesizeformatted,omitempty"`
	// icon
	Icon *string `json:"icon,omitempty"`
	// isdir
	Isdir *bool `json:"isdir,omitempty"`
	// isimage
	Isimage *bool `json:"isimage,omitempty"`
	// itemid
	Itemid *int32 `json:"itemid,omitempty"`
	// license
	License *string `json:"license,omitempty"`
	// timecreated
	Timecreated *int32 `json:"timecreated,omitempty"`
	// timecreatedformatted
	Timecreatedformatted *string `json:"timecreatedformatted,omitempty"`
	// timemodified
	Timemodified *int32 `json:"timemodified,omitempty"`
	// timemodifiedformatted
	Timemodifiedformatted *string `json:"timemodifiedformatted,omitempty"`
	// url
	Url *string `json:"url,omitempty"`
}

// NewModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner instantiates a new ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner() *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner {
	this := ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner{}
	return &this
}

// NewModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInnerWithDefaults instantiates a new ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInnerWithDefaults() *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner {
	this := ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner{}
	return &this
}

// GetAuthor returns the Author field value if set, zero value otherwise.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetAuthor() string {
	if o == nil || IsNil(o.Author) {
		var ret string
		return ret
	}
	return *o.Author
}

// GetAuthorOk returns a tuple with the Author field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetAuthorOk() (*string, bool) {
	if o == nil || IsNil(o.Author) {
		return nil, false
	}
	return o.Author, true
}

// HasAuthor returns a boolean if a field has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) HasAuthor() bool {
	if o != nil && !IsNil(o.Author) {
		return true
	}

	return false
}

// SetAuthor gets a reference to the given string and assigns it to the Author field.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) SetAuthor(v string) {
	o.Author = &v
}

// GetComponent returns the Component field value if set, zero value otherwise.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetComponent() string {
	if o == nil || IsNil(o.Component) {
		var ret string
		return ret
	}
	return *o.Component
}

// GetComponentOk returns a tuple with the Component field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetComponentOk() (*string, bool) {
	if o == nil || IsNil(o.Component) {
		return nil, false
	}
	return o.Component, true
}

// HasComponent returns a boolean if a field has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) HasComponent() bool {
	if o != nil && !IsNil(o.Component) {
		return true
	}

	return false
}

// SetComponent gets a reference to the given string and assigns it to the Component field.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) SetComponent(v string) {
	o.Component = &v
}

// GetContextid returns the Contextid field value if set, zero value otherwise.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetContextid() int32 {
	if o == nil || IsNil(o.Contextid) {
		var ret int32
		return ret
	}
	return *o.Contextid
}

// GetContextidOk returns a tuple with the Contextid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetContextidOk() (*int32, bool) {
	if o == nil || IsNil(o.Contextid) {
		return nil, false
	}
	return o.Contextid, true
}

// HasContextid returns a boolean if a field has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) HasContextid() bool {
	if o != nil && !IsNil(o.Contextid) {
		return true
	}

	return false
}

// SetContextid gets a reference to the given int32 and assigns it to the Contextid field.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) SetContextid(v int32) {
	o.Contextid = &v
}

// GetFilearea returns the Filearea field value if set, zero value otherwise.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetFilearea() string {
	if o == nil || IsNil(o.Filearea) {
		var ret string
		return ret
	}
	return *o.Filearea
}

// GetFileareaOk returns a tuple with the Filearea field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetFileareaOk() (*string, bool) {
	if o == nil || IsNil(o.Filearea) {
		return nil, false
	}
	return o.Filearea, true
}

// HasFilearea returns a boolean if a field has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) HasFilearea() bool {
	if o != nil && !IsNil(o.Filearea) {
		return true
	}

	return false
}

// SetFilearea gets a reference to the given string and assigns it to the Filearea field.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) SetFilearea(v string) {
	o.Filearea = &v
}

// GetFilename returns the Filename field value if set, zero value otherwise.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetFilename() string {
	if o == nil || IsNil(o.Filename) {
		var ret string
		return ret
	}
	return *o.Filename
}

// GetFilenameOk returns a tuple with the Filename field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetFilenameOk() (*string, bool) {
	if o == nil || IsNil(o.Filename) {
		return nil, false
	}
	return o.Filename, true
}

// HasFilename returns a boolean if a field has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) HasFilename() bool {
	if o != nil && !IsNil(o.Filename) {
		return true
	}

	return false
}

// SetFilename gets a reference to the given string and assigns it to the Filename field.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) SetFilename(v string) {
	o.Filename = &v
}

// GetFilenameshort returns the Filenameshort field value if set, zero value otherwise.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetFilenameshort() string {
	if o == nil || IsNil(o.Filenameshort) {
		var ret string
		return ret
	}
	return *o.Filenameshort
}

// GetFilenameshortOk returns a tuple with the Filenameshort field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetFilenameshortOk() (*string, bool) {
	if o == nil || IsNil(o.Filenameshort) {
		return nil, false
	}
	return o.Filenameshort, true
}

// HasFilenameshort returns a boolean if a field has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) HasFilenameshort() bool {
	if o != nil && !IsNil(o.Filenameshort) {
		return true
	}

	return false
}

// SetFilenameshort gets a reference to the given string and assigns it to the Filenameshort field.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) SetFilenameshort(v string) {
	o.Filenameshort = &v
}

// GetFilepath returns the Filepath field value if set, zero value otherwise.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetFilepath() string {
	if o == nil || IsNil(o.Filepath) {
		var ret string
		return ret
	}
	return *o.Filepath
}

// GetFilepathOk returns a tuple with the Filepath field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetFilepathOk() (*string, bool) {
	if o == nil || IsNil(o.Filepath) {
		return nil, false
	}
	return o.Filepath, true
}

// HasFilepath returns a boolean if a field has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) HasFilepath() bool {
	if o != nil && !IsNil(o.Filepath) {
		return true
	}

	return false
}

// SetFilepath gets a reference to the given string and assigns it to the Filepath field.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) SetFilepath(v string) {
	o.Filepath = &v
}

// GetFilesize returns the Filesize field value if set, zero value otherwise.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetFilesize() int32 {
	if o == nil || IsNil(o.Filesize) {
		var ret int32
		return ret
	}
	return *o.Filesize
}

// GetFilesizeOk returns a tuple with the Filesize field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetFilesizeOk() (*int32, bool) {
	if o == nil || IsNil(o.Filesize) {
		return nil, false
	}
	return o.Filesize, true
}

// HasFilesize returns a boolean if a field has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) HasFilesize() bool {
	if o != nil && !IsNil(o.Filesize) {
		return true
	}

	return false
}

// SetFilesize gets a reference to the given int32 and assigns it to the Filesize field.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) SetFilesize(v int32) {
	o.Filesize = &v
}

// GetFilesizeformatted returns the Filesizeformatted field value if set, zero value otherwise.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetFilesizeformatted() string {
	if o == nil || IsNil(o.Filesizeformatted) {
		var ret string
		return ret
	}
	return *o.Filesizeformatted
}

// GetFilesizeformattedOk returns a tuple with the Filesizeformatted field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetFilesizeformattedOk() (*string, bool) {
	if o == nil || IsNil(o.Filesizeformatted) {
		return nil, false
	}
	return o.Filesizeformatted, true
}

// HasFilesizeformatted returns a boolean if a field has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) HasFilesizeformatted() bool {
	if o != nil && !IsNil(o.Filesizeformatted) {
		return true
	}

	return false
}

// SetFilesizeformatted gets a reference to the given string and assigns it to the Filesizeformatted field.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) SetFilesizeformatted(v string) {
	o.Filesizeformatted = &v
}

// GetIcon returns the Icon field value if set, zero value otherwise.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetIcon() string {
	if o == nil || IsNil(o.Icon) {
		var ret string
		return ret
	}
	return *o.Icon
}

// GetIconOk returns a tuple with the Icon field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetIconOk() (*string, bool) {
	if o == nil || IsNil(o.Icon) {
		return nil, false
	}
	return o.Icon, true
}

// HasIcon returns a boolean if a field has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) HasIcon() bool {
	if o != nil && !IsNil(o.Icon) {
		return true
	}

	return false
}

// SetIcon gets a reference to the given string and assigns it to the Icon field.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) SetIcon(v string) {
	o.Icon = &v
}

// GetIsdir returns the Isdir field value if set, zero value otherwise.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetIsdir() bool {
	if o == nil || IsNil(o.Isdir) {
		var ret bool
		return ret
	}
	return *o.Isdir
}

// GetIsdirOk returns a tuple with the Isdir field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetIsdirOk() (*bool, bool) {
	if o == nil || IsNil(o.Isdir) {
		return nil, false
	}
	return o.Isdir, true
}

// HasIsdir returns a boolean if a field has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) HasIsdir() bool {
	if o != nil && !IsNil(o.Isdir) {
		return true
	}

	return false
}

// SetIsdir gets a reference to the given bool and assigns it to the Isdir field.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) SetIsdir(v bool) {
	o.Isdir = &v
}

// GetIsimage returns the Isimage field value if set, zero value otherwise.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetIsimage() bool {
	if o == nil || IsNil(o.Isimage) {
		var ret bool
		return ret
	}
	return *o.Isimage
}

// GetIsimageOk returns a tuple with the Isimage field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetIsimageOk() (*bool, bool) {
	if o == nil || IsNil(o.Isimage) {
		return nil, false
	}
	return o.Isimage, true
}

// HasIsimage returns a boolean if a field has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) HasIsimage() bool {
	if o != nil && !IsNil(o.Isimage) {
		return true
	}

	return false
}

// SetIsimage gets a reference to the given bool and assigns it to the Isimage field.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) SetIsimage(v bool) {
	o.Isimage = &v
}

// GetItemid returns the Itemid field value if set, zero value otherwise.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetItemid() int32 {
	if o == nil || IsNil(o.Itemid) {
		var ret int32
		return ret
	}
	return *o.Itemid
}

// GetItemidOk returns a tuple with the Itemid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetItemidOk() (*int32, bool) {
	if o == nil || IsNil(o.Itemid) {
		return nil, false
	}
	return o.Itemid, true
}

// HasItemid returns a boolean if a field has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) HasItemid() bool {
	if o != nil && !IsNil(o.Itemid) {
		return true
	}

	return false
}

// SetItemid gets a reference to the given int32 and assigns it to the Itemid field.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) SetItemid(v int32) {
	o.Itemid = &v
}

// GetLicense returns the License field value if set, zero value otherwise.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetLicense() string {
	if o == nil || IsNil(o.License) {
		var ret string
		return ret
	}
	return *o.License
}

// GetLicenseOk returns a tuple with the License field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetLicenseOk() (*string, bool) {
	if o == nil || IsNil(o.License) {
		return nil, false
	}
	return o.License, true
}

// HasLicense returns a boolean if a field has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) HasLicense() bool {
	if o != nil && !IsNil(o.License) {
		return true
	}

	return false
}

// SetLicense gets a reference to the given string and assigns it to the License field.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) SetLicense(v string) {
	o.License = &v
}

// GetTimecreated returns the Timecreated field value if set, zero value otherwise.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetTimecreated() int32 {
	if o == nil || IsNil(o.Timecreated) {
		var ret int32
		return ret
	}
	return *o.Timecreated
}

// GetTimecreatedOk returns a tuple with the Timecreated field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetTimecreatedOk() (*int32, bool) {
	if o == nil || IsNil(o.Timecreated) {
		return nil, false
	}
	return o.Timecreated, true
}

// HasTimecreated returns a boolean if a field has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) HasTimecreated() bool {
	if o != nil && !IsNil(o.Timecreated) {
		return true
	}

	return false
}

// SetTimecreated gets a reference to the given int32 and assigns it to the Timecreated field.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) SetTimecreated(v int32) {
	o.Timecreated = &v
}

// GetTimecreatedformatted returns the Timecreatedformatted field value if set, zero value otherwise.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetTimecreatedformatted() string {
	if o == nil || IsNil(o.Timecreatedformatted) {
		var ret string
		return ret
	}
	return *o.Timecreatedformatted
}

// GetTimecreatedformattedOk returns a tuple with the Timecreatedformatted field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetTimecreatedformattedOk() (*string, bool) {
	if o == nil || IsNil(o.Timecreatedformatted) {
		return nil, false
	}
	return o.Timecreatedformatted, true
}

// HasTimecreatedformatted returns a boolean if a field has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) HasTimecreatedformatted() bool {
	if o != nil && !IsNil(o.Timecreatedformatted) {
		return true
	}

	return false
}

// SetTimecreatedformatted gets a reference to the given string and assigns it to the Timecreatedformatted field.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) SetTimecreatedformatted(v string) {
	o.Timecreatedformatted = &v
}

// GetTimemodified returns the Timemodified field value if set, zero value otherwise.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetTimemodified() int32 {
	if o == nil || IsNil(o.Timemodified) {
		var ret int32
		return ret
	}
	return *o.Timemodified
}

// GetTimemodifiedOk returns a tuple with the Timemodified field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetTimemodifiedOk() (*int32, bool) {
	if o == nil || IsNil(o.Timemodified) {
		return nil, false
	}
	return o.Timemodified, true
}

// HasTimemodified returns a boolean if a field has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) HasTimemodified() bool {
	if o != nil && !IsNil(o.Timemodified) {
		return true
	}

	return false
}

// SetTimemodified gets a reference to the given int32 and assigns it to the Timemodified field.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) SetTimemodified(v int32) {
	o.Timemodified = &v
}

// GetTimemodifiedformatted returns the Timemodifiedformatted field value if set, zero value otherwise.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetTimemodifiedformatted() string {
	if o == nil || IsNil(o.Timemodifiedformatted) {
		var ret string
		return ret
	}
	return *o.Timemodifiedformatted
}

// GetTimemodifiedformattedOk returns a tuple with the Timemodifiedformatted field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetTimemodifiedformattedOk() (*string, bool) {
	if o == nil || IsNil(o.Timemodifiedformatted) {
		return nil, false
	}
	return o.Timemodifiedformatted, true
}

// HasTimemodifiedformatted returns a boolean if a field has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) HasTimemodifiedformatted() bool {
	if o != nil && !IsNil(o.Timemodifiedformatted) {
		return true
	}

	return false
}

// SetTimemodifiedformatted gets a reference to the given string and assigns it to the Timemodifiedformatted field.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) SetTimemodifiedformatted(v string) {
	o.Timemodifiedformatted = &v
}

// GetUrl returns the Url field value if set, zero value otherwise.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetUrl() string {
	if o == nil || IsNil(o.Url) {
		var ret string
		return ret
	}
	return *o.Url
}

// GetUrlOk returns a tuple with the Url field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) GetUrlOk() (*string, bool) {
	if o == nil || IsNil(o.Url) {
		return nil, false
	}
	return o.Url, true
}

// HasUrl returns a boolean if a field has been set.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) HasUrl() bool {
	if o != nil && !IsNil(o.Url) {
		return true
	}

	return false
}

// SetUrl gets a reference to the given string and assigns it to the Url field.
func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) SetUrl(v string) {
	o.Url = &v
}

func (o ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Author) {
		toSerialize["author"] = o.Author
	}
	if !IsNil(o.Component) {
		toSerialize["component"] = o.Component
	}
	if !IsNil(o.Contextid) {
		toSerialize["contextid"] = o.Contextid
	}
	if !IsNil(o.Filearea) {
		toSerialize["filearea"] = o.Filearea
	}
	if !IsNil(o.Filename) {
		toSerialize["filename"] = o.Filename
	}
	if !IsNil(o.Filenameshort) {
		toSerialize["filenameshort"] = o.Filenameshort
	}
	if !IsNil(o.Filepath) {
		toSerialize["filepath"] = o.Filepath
	}
	if !IsNil(o.Filesize) {
		toSerialize["filesize"] = o.Filesize
	}
	if !IsNil(o.Filesizeformatted) {
		toSerialize["filesizeformatted"] = o.Filesizeformatted
	}
	if !IsNil(o.Icon) {
		toSerialize["icon"] = o.Icon
	}
	if !IsNil(o.Isdir) {
		toSerialize["isdir"] = o.Isdir
	}
	if !IsNil(o.Isimage) {
		toSerialize["isimage"] = o.Isimage
	}
	if !IsNil(o.Itemid) {
		toSerialize["itemid"] = o.Itemid
	}
	if !IsNil(o.License) {
		toSerialize["license"] = o.License
	}
	if !IsNil(o.Timecreated) {
		toSerialize["timecreated"] = o.Timecreated
	}
	if !IsNil(o.Timecreatedformatted) {
		toSerialize["timecreatedformatted"] = o.Timecreatedformatted
	}
	if !IsNil(o.Timemodified) {
		toSerialize["timemodified"] = o.Timemodified
	}
	if !IsNil(o.Timemodifiedformatted) {
		toSerialize["timemodifiedformatted"] = o.Timemodifiedformatted
	}
	if !IsNil(o.Url) {
		toSerialize["url"] = o.Url
	}
	return toSerialize, nil
}

type NullableModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner struct {
	value *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner
	isSet bool
}

func (v NullableModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) Get() *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner {
	return v.value
}

func (v *NullableModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) Set(val *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) {
	v.value = val
	v.isSet = true
}

func (v NullableModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) IsSet() bool {
	return v.isSet
}

func (v *NullableModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner(val *ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) *NullableModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner {
	return &NullableModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner{value: val, isSet: true}
}

func (v NullableModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


