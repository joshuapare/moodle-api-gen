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

// checks if the CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon{}

// CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon struct for CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon
type CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon struct {
	// alttext
	Alttext string `json:"alttext"`
	// component
	Component string `json:"component"`
	// iconclass
	Iconclass string `json:"iconclass"`
	// iconurl
	Iconurl string `json:"iconurl"`
	// key
	Key string `json:"key"`
}

type _CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon

// NewCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon instantiates a new CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon(alttext string, component string, iconclass string, iconurl string, key string) *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon {
	this := CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon{}
	this.Alttext = alttext
	this.Component = component
	this.Iconclass = iconclass
	this.Iconurl = iconurl
	this.Key = key
	return &this
}

// NewCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIconWithDefaults instantiates a new CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIconWithDefaults() *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon {
	this := CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon{}
	return &this
}

// GetAlttext returns the Alttext field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon) GetAlttext() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Alttext
}

// GetAlttextOk returns a tuple with the Alttext field value
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon) GetAlttextOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Alttext, true
}

// SetAlttext sets field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon) SetAlttext(v string) {
	o.Alttext = v
}

// GetComponent returns the Component field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon) GetComponent() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Component
}

// GetComponentOk returns a tuple with the Component field value
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon) GetComponentOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Component, true
}

// SetComponent sets field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon) SetComponent(v string) {
	o.Component = v
}

// GetIconclass returns the Iconclass field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon) GetIconclass() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Iconclass
}

// GetIconclassOk returns a tuple with the Iconclass field value
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon) GetIconclassOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Iconclass, true
}

// SetIconclass sets field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon) SetIconclass(v string) {
	o.Iconclass = v
}

// GetIconurl returns the Iconurl field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon) GetIconurl() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Iconurl
}

// GetIconurlOk returns a tuple with the Iconurl field value
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon) GetIconurlOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Iconurl, true
}

// SetIconurl sets field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon) SetIconurl(v string) {
	o.Iconurl = v
}

// GetKey returns the Key field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon) GetKey() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Key
}

// GetKeyOk returns a tuple with the Key field value
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon) GetKeyOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Key, true
}

// SetKey sets field value
func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon) SetKey(v string) {
	o.Key = v
}

func (o CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["alttext"] = o.Alttext
	toSerialize["component"] = o.Component
	toSerialize["iconclass"] = o.Iconclass
	toSerialize["iconurl"] = o.Iconurl
	toSerialize["key"] = o.Key
	return toSerialize, nil
}

func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"alttext",
		"component",
		"iconclass",
		"iconurl",
		"key",
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

	varCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon := _CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon)

	if err != nil {
		return err
	}

	*o = CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon(varCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon)

	return err
}

type NullableCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon struct {
	value *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon
	isSet bool
}

func (v NullableCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon) Get() *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon {
	return v.value
}

func (v *NullableCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon) Set(val *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon(val *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon) *NullableCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon {
	return &NullableCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon{value: val, isSet: true}
}

func (v NullableCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

