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

// checks if the CoreCourseGetRecentCoursesRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreCourseGetRecentCoursesRequest{}

// CoreCourseGetRecentCoursesRequest struct for CoreCourseGetRecentCoursesRequest
type CoreCourseGetRecentCoursesRequest struct {
	// result set limit
	Limit *int32 `json:"limit,omitempty"`
	// Result set offset
	Offset *int32 `json:"offset,omitempty"`
	// Sort string
	Sort *string `json:"sort,omitempty"`
	// id of the user, default to current user
	Userid *int32 `json:"userid,omitempty"`
}

// NewCoreCourseGetRecentCoursesRequest instantiates a new CoreCourseGetRecentCoursesRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreCourseGetRecentCoursesRequest() *CoreCourseGetRecentCoursesRequest {
	this := CoreCourseGetRecentCoursesRequest{}
	var limit int32 = 0
	this.Limit = &limit
	var offset int32 = 0
	this.Offset = &offset
	var userid int32 = 0
	this.Userid = &userid
	return &this
}

// NewCoreCourseGetRecentCoursesRequestWithDefaults instantiates a new CoreCourseGetRecentCoursesRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreCourseGetRecentCoursesRequestWithDefaults() *CoreCourseGetRecentCoursesRequest {
	this := CoreCourseGetRecentCoursesRequest{}
	var limit int32 = 0
	this.Limit = &limit
	var offset int32 = 0
	this.Offset = &offset
	var userid int32 = 0
	this.Userid = &userid
	return &this
}

// GetLimit returns the Limit field value if set, zero value otherwise.
func (o *CoreCourseGetRecentCoursesRequest) GetLimit() int32 {
	if o == nil || IsNil(o.Limit) {
		var ret int32
		return ret
	}
	return *o.Limit
}

// GetLimitOk returns a tuple with the Limit field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetRecentCoursesRequest) GetLimitOk() (*int32, bool) {
	if o == nil || IsNil(o.Limit) {
		return nil, false
	}
	return o.Limit, true
}

// HasLimit returns a boolean if a field has been set.
func (o *CoreCourseGetRecentCoursesRequest) HasLimit() bool {
	if o != nil && !IsNil(o.Limit) {
		return true
	}

	return false
}

// SetLimit gets a reference to the given int32 and assigns it to the Limit field.
func (o *CoreCourseGetRecentCoursesRequest) SetLimit(v int32) {
	o.Limit = &v
}

// GetOffset returns the Offset field value if set, zero value otherwise.
func (o *CoreCourseGetRecentCoursesRequest) GetOffset() int32 {
	if o == nil || IsNil(o.Offset) {
		var ret int32
		return ret
	}
	return *o.Offset
}

// GetOffsetOk returns a tuple with the Offset field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetRecentCoursesRequest) GetOffsetOk() (*int32, bool) {
	if o == nil || IsNil(o.Offset) {
		return nil, false
	}
	return o.Offset, true
}

// HasOffset returns a boolean if a field has been set.
func (o *CoreCourseGetRecentCoursesRequest) HasOffset() bool {
	if o != nil && !IsNil(o.Offset) {
		return true
	}

	return false
}

// SetOffset gets a reference to the given int32 and assigns it to the Offset field.
func (o *CoreCourseGetRecentCoursesRequest) SetOffset(v int32) {
	o.Offset = &v
}

// GetSort returns the Sort field value if set, zero value otherwise.
func (o *CoreCourseGetRecentCoursesRequest) GetSort() string {
	if o == nil || IsNil(o.Sort) {
		var ret string
		return ret
	}
	return *o.Sort
}

// GetSortOk returns a tuple with the Sort field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetRecentCoursesRequest) GetSortOk() (*string, bool) {
	if o == nil || IsNil(o.Sort) {
		return nil, false
	}
	return o.Sort, true
}

// HasSort returns a boolean if a field has been set.
func (o *CoreCourseGetRecentCoursesRequest) HasSort() bool {
	if o != nil && !IsNil(o.Sort) {
		return true
	}

	return false
}

// SetSort gets a reference to the given string and assigns it to the Sort field.
func (o *CoreCourseGetRecentCoursesRequest) SetSort(v string) {
	o.Sort = &v
}

// GetUserid returns the Userid field value if set, zero value otherwise.
func (o *CoreCourseGetRecentCoursesRequest) GetUserid() int32 {
	if o == nil || IsNil(o.Userid) {
		var ret int32
		return ret
	}
	return *o.Userid
}

// GetUseridOk returns a tuple with the Userid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetRecentCoursesRequest) GetUseridOk() (*int32, bool) {
	if o == nil || IsNil(o.Userid) {
		return nil, false
	}
	return o.Userid, true
}

// HasUserid returns a boolean if a field has been set.
func (o *CoreCourseGetRecentCoursesRequest) HasUserid() bool {
	if o != nil && !IsNil(o.Userid) {
		return true
	}

	return false
}

// SetUserid gets a reference to the given int32 and assigns it to the Userid field.
func (o *CoreCourseGetRecentCoursesRequest) SetUserid(v int32) {
	o.Userid = &v
}

func (o CoreCourseGetRecentCoursesRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreCourseGetRecentCoursesRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Limit) {
		toSerialize["limit"] = o.Limit
	}
	if !IsNil(o.Offset) {
		toSerialize["offset"] = o.Offset
	}
	if !IsNil(o.Sort) {
		toSerialize["sort"] = o.Sort
	}
	if !IsNil(o.Userid) {
		toSerialize["userid"] = o.Userid
	}
	return toSerialize, nil
}

type NullableCoreCourseGetRecentCoursesRequest struct {
	value *CoreCourseGetRecentCoursesRequest
	isSet bool
}

func (v NullableCoreCourseGetRecentCoursesRequest) Get() *CoreCourseGetRecentCoursesRequest {
	return v.value
}

func (v *NullableCoreCourseGetRecentCoursesRequest) Set(val *CoreCourseGetRecentCoursesRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreCourseGetRecentCoursesRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreCourseGetRecentCoursesRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreCourseGetRecentCoursesRequest(val *CoreCourseGetRecentCoursesRequest) *NullableCoreCourseGetRecentCoursesRequest {
	return &NullableCoreCourseGetRecentCoursesRequest{value: val, isSet: true}
}

func (v NullableCoreCourseGetRecentCoursesRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreCourseGetRecentCoursesRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

