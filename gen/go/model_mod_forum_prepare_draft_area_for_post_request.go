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

// checks if the ModForumPrepareDraftAreaForPostRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModForumPrepareDraftAreaForPostRequest{}

// ModForumPrepareDraftAreaForPostRequest struct for ModForumPrepareDraftAreaForPostRequest
type ModForumPrepareDraftAreaForPostRequest struct {
	// Area to prepare: attachment or post.
	Area string `json:"area"`
	// The draft item id to use. 0 to generate one.
	Draftitemid *int32 `json:"draftitemid,omitempty"`
	Filestokeep []ModForumPrepareDraftAreaForPostRequestFilestokeepInner `json:"filestokeep,omitempty"`
	// Post to prepare the draft area for.
	Postid int32 `json:"postid"`
}

type _ModForumPrepareDraftAreaForPostRequest ModForumPrepareDraftAreaForPostRequest

// NewModForumPrepareDraftAreaForPostRequest instantiates a new ModForumPrepareDraftAreaForPostRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModForumPrepareDraftAreaForPostRequest(area string, postid int32) *ModForumPrepareDraftAreaForPostRequest {
	this := ModForumPrepareDraftAreaForPostRequest{}
	this.Area = area
	var draftitemid int32 = 0
	this.Draftitemid = &draftitemid
	this.Postid = postid
	return &this
}

// NewModForumPrepareDraftAreaForPostRequestWithDefaults instantiates a new ModForumPrepareDraftAreaForPostRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModForumPrepareDraftAreaForPostRequestWithDefaults() *ModForumPrepareDraftAreaForPostRequest {
	this := ModForumPrepareDraftAreaForPostRequest{}
	var area string = "null"
	this.Area = area
	var draftitemid int32 = 0
	this.Draftitemid = &draftitemid
	var postid int32 = null
	this.Postid = postid
	return &this
}

// GetArea returns the Area field value
func (o *ModForumPrepareDraftAreaForPostRequest) GetArea() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Area
}

// GetAreaOk returns a tuple with the Area field value
// and a boolean to check if the value has been set.
func (o *ModForumPrepareDraftAreaForPostRequest) GetAreaOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Area, true
}

// SetArea sets field value
func (o *ModForumPrepareDraftAreaForPostRequest) SetArea(v string) {
	o.Area = v
}

// GetDraftitemid returns the Draftitemid field value if set, zero value otherwise.
func (o *ModForumPrepareDraftAreaForPostRequest) GetDraftitemid() int32 {
	if o == nil || IsNil(o.Draftitemid) {
		var ret int32
		return ret
	}
	return *o.Draftitemid
}

// GetDraftitemidOk returns a tuple with the Draftitemid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModForumPrepareDraftAreaForPostRequest) GetDraftitemidOk() (*int32, bool) {
	if o == nil || IsNil(o.Draftitemid) {
		return nil, false
	}
	return o.Draftitemid, true
}

// HasDraftitemid returns a boolean if a field has been set.
func (o *ModForumPrepareDraftAreaForPostRequest) HasDraftitemid() bool {
	if o != nil && !IsNil(o.Draftitemid) {
		return true
	}

	return false
}

// SetDraftitemid gets a reference to the given int32 and assigns it to the Draftitemid field.
func (o *ModForumPrepareDraftAreaForPostRequest) SetDraftitemid(v int32) {
	o.Draftitemid = &v
}

// GetFilestokeep returns the Filestokeep field value if set, zero value otherwise.
func (o *ModForumPrepareDraftAreaForPostRequest) GetFilestokeep() []ModForumPrepareDraftAreaForPostRequestFilestokeepInner {
	if o == nil || IsNil(o.Filestokeep) {
		var ret []ModForumPrepareDraftAreaForPostRequestFilestokeepInner
		return ret
	}
	return o.Filestokeep
}

// GetFilestokeepOk returns a tuple with the Filestokeep field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModForumPrepareDraftAreaForPostRequest) GetFilestokeepOk() ([]ModForumPrepareDraftAreaForPostRequestFilestokeepInner, bool) {
	if o == nil || IsNil(o.Filestokeep) {
		return nil, false
	}
	return o.Filestokeep, true
}

// HasFilestokeep returns a boolean if a field has been set.
func (o *ModForumPrepareDraftAreaForPostRequest) HasFilestokeep() bool {
	if o != nil && !IsNil(o.Filestokeep) {
		return true
	}

	return false
}

// SetFilestokeep gets a reference to the given []ModForumPrepareDraftAreaForPostRequestFilestokeepInner and assigns it to the Filestokeep field.
func (o *ModForumPrepareDraftAreaForPostRequest) SetFilestokeep(v []ModForumPrepareDraftAreaForPostRequestFilestokeepInner) {
	o.Filestokeep = v
}

// GetPostid returns the Postid field value
func (o *ModForumPrepareDraftAreaForPostRequest) GetPostid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Postid
}

// GetPostidOk returns a tuple with the Postid field value
// and a boolean to check if the value has been set.
func (o *ModForumPrepareDraftAreaForPostRequest) GetPostidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Postid, true
}

// SetPostid sets field value
func (o *ModForumPrepareDraftAreaForPostRequest) SetPostid(v int32) {
	o.Postid = v
}

func (o ModForumPrepareDraftAreaForPostRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModForumPrepareDraftAreaForPostRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["area"] = o.Area
	if !IsNil(o.Draftitemid) {
		toSerialize["draftitemid"] = o.Draftitemid
	}
	if !IsNil(o.Filestokeep) {
		toSerialize["filestokeep"] = o.Filestokeep
	}
	toSerialize["postid"] = o.Postid
	return toSerialize, nil
}

func (o *ModForumPrepareDraftAreaForPostRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"area",
		"postid",
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

	varModForumPrepareDraftAreaForPostRequest := _ModForumPrepareDraftAreaForPostRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModForumPrepareDraftAreaForPostRequest)

	if err != nil {
		return err
	}

	*o = ModForumPrepareDraftAreaForPostRequest(varModForumPrepareDraftAreaForPostRequest)

	return err
}

type NullableModForumPrepareDraftAreaForPostRequest struct {
	value *ModForumPrepareDraftAreaForPostRequest
	isSet bool
}

func (v NullableModForumPrepareDraftAreaForPostRequest) Get() *ModForumPrepareDraftAreaForPostRequest {
	return v.value
}

func (v *NullableModForumPrepareDraftAreaForPostRequest) Set(val *ModForumPrepareDraftAreaForPostRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableModForumPrepareDraftAreaForPostRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableModForumPrepareDraftAreaForPostRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModForumPrepareDraftAreaForPostRequest(val *ModForumPrepareDraftAreaForPostRequest) *NullableModForumPrepareDraftAreaForPostRequest {
	return &NullableModForumPrepareDraftAreaForPostRequest{value: val, isSet: true}
}

func (v NullableModForumPrepareDraftAreaForPostRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModForumPrepareDraftAreaForPostRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


