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

// checks if the CoreCourseAddContentItemToUserFavouritesRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreCourseAddContentItemToUserFavouritesRequest{}

// CoreCourseAddContentItemToUserFavouritesRequest struct for CoreCourseAddContentItemToUserFavouritesRequest
type CoreCourseAddContentItemToUserFavouritesRequest struct {
	// frankenstyle name of the component to which the content item belongs
	Componentname string `json:"componentname"`
	// id of the content item
	Contentitemid int32 `json:"contentitemid"`
}

type _CoreCourseAddContentItemToUserFavouritesRequest CoreCourseAddContentItemToUserFavouritesRequest

// NewCoreCourseAddContentItemToUserFavouritesRequest instantiates a new CoreCourseAddContentItemToUserFavouritesRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreCourseAddContentItemToUserFavouritesRequest(componentname string, contentitemid int32) *CoreCourseAddContentItemToUserFavouritesRequest {
	this := CoreCourseAddContentItemToUserFavouritesRequest{}
	this.Componentname = componentname
	this.Contentitemid = contentitemid
	return &this
}

// NewCoreCourseAddContentItemToUserFavouritesRequestWithDefaults instantiates a new CoreCourseAddContentItemToUserFavouritesRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreCourseAddContentItemToUserFavouritesRequestWithDefaults() *CoreCourseAddContentItemToUserFavouritesRequest {
	this := CoreCourseAddContentItemToUserFavouritesRequest{}
	var componentname string = "null"
	this.Componentname = componentname
	var contentitemid int32 = 
	this.Contentitemid = contentitemid
	return &this
}

// GetComponentname returns the Componentname field value
func (o *CoreCourseAddContentItemToUserFavouritesRequest) GetComponentname() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Componentname
}

// GetComponentnameOk returns a tuple with the Componentname field value
// and a boolean to check if the value has been set.
func (o *CoreCourseAddContentItemToUserFavouritesRequest) GetComponentnameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Componentname, true
}

// SetComponentname sets field value
func (o *CoreCourseAddContentItemToUserFavouritesRequest) SetComponentname(v string) {
	o.Componentname = v
}

// GetContentitemid returns the Contentitemid field value
func (o *CoreCourseAddContentItemToUserFavouritesRequest) GetContentitemid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Contentitemid
}

// GetContentitemidOk returns a tuple with the Contentitemid field value
// and a boolean to check if the value has been set.
func (o *CoreCourseAddContentItemToUserFavouritesRequest) GetContentitemidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Contentitemid, true
}

// SetContentitemid sets field value
func (o *CoreCourseAddContentItemToUserFavouritesRequest) SetContentitemid(v int32) {
	o.Contentitemid = v
}

func (o CoreCourseAddContentItemToUserFavouritesRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreCourseAddContentItemToUserFavouritesRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["componentname"] = o.Componentname
	toSerialize["contentitemid"] = o.Contentitemid
	return toSerialize, nil
}

func (o *CoreCourseAddContentItemToUserFavouritesRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"componentname",
		"contentitemid",
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

	varCoreCourseAddContentItemToUserFavouritesRequest := _CoreCourseAddContentItemToUserFavouritesRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreCourseAddContentItemToUserFavouritesRequest)

	if err != nil {
		return err
	}

	*o = CoreCourseAddContentItemToUserFavouritesRequest(varCoreCourseAddContentItemToUserFavouritesRequest)

	return err
}

type NullableCoreCourseAddContentItemToUserFavouritesRequest struct {
	value *CoreCourseAddContentItemToUserFavouritesRequest
	isSet bool
}

func (v NullableCoreCourseAddContentItemToUserFavouritesRequest) Get() *CoreCourseAddContentItemToUserFavouritesRequest {
	return v.value
}

func (v *NullableCoreCourseAddContentItemToUserFavouritesRequest) Set(val *CoreCourseAddContentItemToUserFavouritesRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreCourseAddContentItemToUserFavouritesRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreCourseAddContentItemToUserFavouritesRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreCourseAddContentItemToUserFavouritesRequest(val *CoreCourseAddContentItemToUserFavouritesRequest) *NullableCoreCourseAddContentItemToUserFavouritesRequest {
	return &NullableCoreCourseAddContentItemToUserFavouritesRequest{value: val, isSet: true}
}

func (v NullableCoreCourseAddContentItemToUserFavouritesRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreCourseAddContentItemToUserFavouritesRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


