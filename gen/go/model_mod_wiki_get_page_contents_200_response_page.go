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

// checks if the ModWikiGetPageContents200ResponsePage type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModWikiGetPageContents200ResponsePage{}

// ModWikiGetPageContents200ResponsePage struct for ModWikiGetPageContents200ResponsePage
type ModWikiGetPageContents200ResponsePage struct {
	// Page contents.
	Cachedcontent string `json:"cachedcontent"`
	// True if user can edit the page.
	Caneditpage bool `json:"caneditpage"`
	// cachedcontent format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
	Contentformat *int32 `json:"contentformat,omitempty"`
	// Page's group ID.
	Groupid int32 `json:"groupid"`
	// Page ID.
	Id int32 `json:"id"`
	// Page's subwiki ID.
	Subwikiid int32 `json:"subwikiid"`
	Tags []ModDataGetEntries200ResponseEntriesInnerTagsInner `json:"tags,omitempty"`
	// Page title.
	Title string `json:"title"`
	// Page's user ID.
	Userid int32 `json:"userid"`
	// Latest version of the page.
	Version *int32 `json:"version,omitempty"`
	// Page's wiki ID.
	Wikiid int32 `json:"wikiid"`
}

type _ModWikiGetPageContents200ResponsePage ModWikiGetPageContents200ResponsePage

// NewModWikiGetPageContents200ResponsePage instantiates a new ModWikiGetPageContents200ResponsePage object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModWikiGetPageContents200ResponsePage(cachedcontent string, caneditpage bool, groupid int32, id int32, subwikiid int32, title string, userid int32, wikiid int32) *ModWikiGetPageContents200ResponsePage {
	this := ModWikiGetPageContents200ResponsePage{}
	this.Cachedcontent = cachedcontent
	this.Caneditpage = caneditpage
	var contentformat int32 = null
	this.Contentformat = &contentformat
	this.Groupid = groupid
	this.Id = id
	this.Subwikiid = subwikiid
	this.Title = title
	this.Userid = userid
	var version int32 = null
	this.Version = &version
	this.Wikiid = wikiid
	return &this
}

// NewModWikiGetPageContents200ResponsePageWithDefaults instantiates a new ModWikiGetPageContents200ResponsePage object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModWikiGetPageContents200ResponsePageWithDefaults() *ModWikiGetPageContents200ResponsePage {
	this := ModWikiGetPageContents200ResponsePage{}
	var caneditpage bool = null
	this.Caneditpage = caneditpage
	var contentformat int32 = null
	this.Contentformat = &contentformat
	var groupid int32 = null
	this.Groupid = groupid
	var subwikiid int32 = null
	this.Subwikiid = subwikiid
	var userid int32 = null
	this.Userid = userid
	var version int32 = null
	this.Version = &version
	var wikiid int32 = null
	this.Wikiid = wikiid
	return &this
}

// GetCachedcontent returns the Cachedcontent field value
func (o *ModWikiGetPageContents200ResponsePage) GetCachedcontent() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Cachedcontent
}

// GetCachedcontentOk returns a tuple with the Cachedcontent field value
// and a boolean to check if the value has been set.
func (o *ModWikiGetPageContents200ResponsePage) GetCachedcontentOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Cachedcontent, true
}

// SetCachedcontent sets field value
func (o *ModWikiGetPageContents200ResponsePage) SetCachedcontent(v string) {
	o.Cachedcontent = v
}

// GetCaneditpage returns the Caneditpage field value
func (o *ModWikiGetPageContents200ResponsePage) GetCaneditpage() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Caneditpage
}

// GetCaneditpageOk returns a tuple with the Caneditpage field value
// and a boolean to check if the value has been set.
func (o *ModWikiGetPageContents200ResponsePage) GetCaneditpageOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Caneditpage, true
}

// SetCaneditpage sets field value
func (o *ModWikiGetPageContents200ResponsePage) SetCaneditpage(v bool) {
	o.Caneditpage = v
}

// GetContentformat returns the Contentformat field value if set, zero value otherwise.
func (o *ModWikiGetPageContents200ResponsePage) GetContentformat() int32 {
	if o == nil || IsNil(o.Contentformat) {
		var ret int32
		return ret
	}
	return *o.Contentformat
}

// GetContentformatOk returns a tuple with the Contentformat field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModWikiGetPageContents200ResponsePage) GetContentformatOk() (*int32, bool) {
	if o == nil || IsNil(o.Contentformat) {
		return nil, false
	}
	return o.Contentformat, true
}

// HasContentformat returns a boolean if a field has been set.
func (o *ModWikiGetPageContents200ResponsePage) HasContentformat() bool {
	if o != nil && !IsNil(o.Contentformat) {
		return true
	}

	return false
}

// SetContentformat gets a reference to the given int32 and assigns it to the Contentformat field.
func (o *ModWikiGetPageContents200ResponsePage) SetContentformat(v int32) {
	o.Contentformat = &v
}

// GetGroupid returns the Groupid field value
func (o *ModWikiGetPageContents200ResponsePage) GetGroupid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Groupid
}

// GetGroupidOk returns a tuple with the Groupid field value
// and a boolean to check if the value has been set.
func (o *ModWikiGetPageContents200ResponsePage) GetGroupidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Groupid, true
}

// SetGroupid sets field value
func (o *ModWikiGetPageContents200ResponsePage) SetGroupid(v int32) {
	o.Groupid = v
}

// GetId returns the Id field value
func (o *ModWikiGetPageContents200ResponsePage) GetId() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *ModWikiGetPageContents200ResponsePage) GetIdOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *ModWikiGetPageContents200ResponsePage) SetId(v int32) {
	o.Id = v
}

// GetSubwikiid returns the Subwikiid field value
func (o *ModWikiGetPageContents200ResponsePage) GetSubwikiid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Subwikiid
}

// GetSubwikiidOk returns a tuple with the Subwikiid field value
// and a boolean to check if the value has been set.
func (o *ModWikiGetPageContents200ResponsePage) GetSubwikiidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Subwikiid, true
}

// SetSubwikiid sets field value
func (o *ModWikiGetPageContents200ResponsePage) SetSubwikiid(v int32) {
	o.Subwikiid = v
}

// GetTags returns the Tags field value if set, zero value otherwise.
func (o *ModWikiGetPageContents200ResponsePage) GetTags() []ModDataGetEntries200ResponseEntriesInnerTagsInner {
	if o == nil || IsNil(o.Tags) {
		var ret []ModDataGetEntries200ResponseEntriesInnerTagsInner
		return ret
	}
	return o.Tags
}

// GetTagsOk returns a tuple with the Tags field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModWikiGetPageContents200ResponsePage) GetTagsOk() ([]ModDataGetEntries200ResponseEntriesInnerTagsInner, bool) {
	if o == nil || IsNil(o.Tags) {
		return nil, false
	}
	return o.Tags, true
}

// HasTags returns a boolean if a field has been set.
func (o *ModWikiGetPageContents200ResponsePage) HasTags() bool {
	if o != nil && !IsNil(o.Tags) {
		return true
	}

	return false
}

// SetTags gets a reference to the given []ModDataGetEntries200ResponseEntriesInnerTagsInner and assigns it to the Tags field.
func (o *ModWikiGetPageContents200ResponsePage) SetTags(v []ModDataGetEntries200ResponseEntriesInnerTagsInner) {
	o.Tags = v
}

// GetTitle returns the Title field value
func (o *ModWikiGetPageContents200ResponsePage) GetTitle() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Title
}

// GetTitleOk returns a tuple with the Title field value
// and a boolean to check if the value has been set.
func (o *ModWikiGetPageContents200ResponsePage) GetTitleOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Title, true
}

// SetTitle sets field value
func (o *ModWikiGetPageContents200ResponsePage) SetTitle(v string) {
	o.Title = v
}

// GetUserid returns the Userid field value
func (o *ModWikiGetPageContents200ResponsePage) GetUserid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Userid
}

// GetUseridOk returns a tuple with the Userid field value
// and a boolean to check if the value has been set.
func (o *ModWikiGetPageContents200ResponsePage) GetUseridOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Userid, true
}

// SetUserid sets field value
func (o *ModWikiGetPageContents200ResponsePage) SetUserid(v int32) {
	o.Userid = v
}

// GetVersion returns the Version field value if set, zero value otherwise.
func (o *ModWikiGetPageContents200ResponsePage) GetVersion() int32 {
	if o == nil || IsNil(o.Version) {
		var ret int32
		return ret
	}
	return *o.Version
}

// GetVersionOk returns a tuple with the Version field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModWikiGetPageContents200ResponsePage) GetVersionOk() (*int32, bool) {
	if o == nil || IsNil(o.Version) {
		return nil, false
	}
	return o.Version, true
}

// HasVersion returns a boolean if a field has been set.
func (o *ModWikiGetPageContents200ResponsePage) HasVersion() bool {
	if o != nil && !IsNil(o.Version) {
		return true
	}

	return false
}

// SetVersion gets a reference to the given int32 and assigns it to the Version field.
func (o *ModWikiGetPageContents200ResponsePage) SetVersion(v int32) {
	o.Version = &v
}

// GetWikiid returns the Wikiid field value
func (o *ModWikiGetPageContents200ResponsePage) GetWikiid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Wikiid
}

// GetWikiidOk returns a tuple with the Wikiid field value
// and a boolean to check if the value has been set.
func (o *ModWikiGetPageContents200ResponsePage) GetWikiidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Wikiid, true
}

// SetWikiid sets field value
func (o *ModWikiGetPageContents200ResponsePage) SetWikiid(v int32) {
	o.Wikiid = v
}

func (o ModWikiGetPageContents200ResponsePage) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModWikiGetPageContents200ResponsePage) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["cachedcontent"] = o.Cachedcontent
	toSerialize["caneditpage"] = o.Caneditpage
	if !IsNil(o.Contentformat) {
		toSerialize["contentformat"] = o.Contentformat
	}
	toSerialize["groupid"] = o.Groupid
	toSerialize["id"] = o.Id
	toSerialize["subwikiid"] = o.Subwikiid
	if !IsNil(o.Tags) {
		toSerialize["tags"] = o.Tags
	}
	toSerialize["title"] = o.Title
	toSerialize["userid"] = o.Userid
	if !IsNil(o.Version) {
		toSerialize["version"] = o.Version
	}
	toSerialize["wikiid"] = o.Wikiid
	return toSerialize, nil
}

func (o *ModWikiGetPageContents200ResponsePage) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"cachedcontent",
		"caneditpage",
		"groupid",
		"id",
		"subwikiid",
		"title",
		"userid",
		"wikiid",
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

	varModWikiGetPageContents200ResponsePage := _ModWikiGetPageContents200ResponsePage{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModWikiGetPageContents200ResponsePage)

	if err != nil {
		return err
	}

	*o = ModWikiGetPageContents200ResponsePage(varModWikiGetPageContents200ResponsePage)

	return err
}

type NullableModWikiGetPageContents200ResponsePage struct {
	value *ModWikiGetPageContents200ResponsePage
	isSet bool
}

func (v NullableModWikiGetPageContents200ResponsePage) Get() *ModWikiGetPageContents200ResponsePage {
	return v.value
}

func (v *NullableModWikiGetPageContents200ResponsePage) Set(val *ModWikiGetPageContents200ResponsePage) {
	v.value = val
	v.isSet = true
}

func (v NullableModWikiGetPageContents200ResponsePage) IsSet() bool {
	return v.isSet
}

func (v *NullableModWikiGetPageContents200ResponsePage) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModWikiGetPageContents200ResponsePage(val *ModWikiGetPageContents200ResponsePage) *NullableModWikiGetPageContents200ResponsePage {
	return &NullableModWikiGetPageContents200ResponsePage{value: val, isSet: true}
}

func (v NullableModWikiGetPageContents200ResponsePage) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModWikiGetPageContents200ResponsePage) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


