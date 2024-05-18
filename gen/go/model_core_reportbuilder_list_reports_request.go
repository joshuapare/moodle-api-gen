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

// checks if the CoreReportbuilderListReportsRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreReportbuilderListReportsRequest{}

// CoreReportbuilderListReportsRequest struct for CoreReportbuilderListReportsRequest
type CoreReportbuilderListReportsRequest struct {
	// Page number
	Page *int32 `json:"page,omitempty"`
	// Reports per page
	Perpage *int32 `json:"perpage,omitempty"`
}

// NewCoreReportbuilderListReportsRequest instantiates a new CoreReportbuilderListReportsRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreReportbuilderListReportsRequest() *CoreReportbuilderListReportsRequest {
	this := CoreReportbuilderListReportsRequest{}
	var page int32 = 0
	this.Page = &page
	var perpage int32 = 10
	this.Perpage = &perpage
	return &this
}

// NewCoreReportbuilderListReportsRequestWithDefaults instantiates a new CoreReportbuilderListReportsRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreReportbuilderListReportsRequestWithDefaults() *CoreReportbuilderListReportsRequest {
	this := CoreReportbuilderListReportsRequest{}
	var page int32 = 0
	this.Page = &page
	var perpage int32 = 10
	this.Perpage = &perpage
	return &this
}

// GetPage returns the Page field value if set, zero value otherwise.
func (o *CoreReportbuilderListReportsRequest) GetPage() int32 {
	if o == nil || IsNil(o.Page) {
		var ret int32
		return ret
	}
	return *o.Page
}

// GetPageOk returns a tuple with the Page field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreReportbuilderListReportsRequest) GetPageOk() (*int32, bool) {
	if o == nil || IsNil(o.Page) {
		return nil, false
	}
	return o.Page, true
}

// HasPage returns a boolean if a field has been set.
func (o *CoreReportbuilderListReportsRequest) HasPage() bool {
	if o != nil && !IsNil(o.Page) {
		return true
	}

	return false
}

// SetPage gets a reference to the given int32 and assigns it to the Page field.
func (o *CoreReportbuilderListReportsRequest) SetPage(v int32) {
	o.Page = &v
}

// GetPerpage returns the Perpage field value if set, zero value otherwise.
func (o *CoreReportbuilderListReportsRequest) GetPerpage() int32 {
	if o == nil || IsNil(o.Perpage) {
		var ret int32
		return ret
	}
	return *o.Perpage
}

// GetPerpageOk returns a tuple with the Perpage field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreReportbuilderListReportsRequest) GetPerpageOk() (*int32, bool) {
	if o == nil || IsNil(o.Perpage) {
		return nil, false
	}
	return o.Perpage, true
}

// HasPerpage returns a boolean if a field has been set.
func (o *CoreReportbuilderListReportsRequest) HasPerpage() bool {
	if o != nil && !IsNil(o.Perpage) {
		return true
	}

	return false
}

// SetPerpage gets a reference to the given int32 and assigns it to the Perpage field.
func (o *CoreReportbuilderListReportsRequest) SetPerpage(v int32) {
	o.Perpage = &v
}

func (o CoreReportbuilderListReportsRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreReportbuilderListReportsRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Page) {
		toSerialize["page"] = o.Page
	}
	if !IsNil(o.Perpage) {
		toSerialize["perpage"] = o.Perpage
	}
	return toSerialize, nil
}

type NullableCoreReportbuilderListReportsRequest struct {
	value *CoreReportbuilderListReportsRequest
	isSet bool
}

func (v NullableCoreReportbuilderListReportsRequest) Get() *CoreReportbuilderListReportsRequest {
	return v.value
}

func (v *NullableCoreReportbuilderListReportsRequest) Set(val *CoreReportbuilderListReportsRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreReportbuilderListReportsRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreReportbuilderListReportsRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreReportbuilderListReportsRequest(val *CoreReportbuilderListReportsRequest) *NullableCoreReportbuilderListReportsRequest {
	return &NullableCoreReportbuilderListReportsRequest{value: val, isSet: true}
}

func (v NullableCoreReportbuilderListReportsRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreReportbuilderListReportsRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

