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

// checks if the CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon{}

// CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon struct for CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon
type CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon struct {
	// component
	Component string `json:"component"`
	// key
	Key string `json:"key"`
	// title
	Title string `json:"title"`
}

type _CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon

// NewCoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon instantiates a new CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon(component string, key string, title string) *CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon {
	this := CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon{}
	this.Component = component
	this.Key = key
	this.Title = title
	return &this
}

// NewCoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticonWithDefaults instantiates a new CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticonWithDefaults() *CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon {
	this := CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon{}
	return &this
}

// GetComponent returns the Component field value
func (o *CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon) GetComponent() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Component
}

// GetComponentOk returns a tuple with the Component field value
// and a boolean to check if the value has been set.
func (o *CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon) GetComponentOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Component, true
}

// SetComponent sets field value
func (o *CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon) SetComponent(v string) {
	o.Component = v
}

// GetKey returns the Key field value
func (o *CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon) GetKey() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Key
}

// GetKeyOk returns a tuple with the Key field value
// and a boolean to check if the value has been set.
func (o *CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon) GetKeyOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Key, true
}

// SetKey sets field value
func (o *CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon) SetKey(v string) {
	o.Key = v
}

// GetTitle returns the Title field value
func (o *CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon) GetTitle() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Title
}

// GetTitleOk returns a tuple with the Title field value
// and a boolean to check if the value has been set.
func (o *CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon) GetTitleOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Title, true
}

// SetTitle sets field value
func (o *CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon) SetTitle(v string) {
	o.Title = v
}

func (o CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["component"] = o.Component
	toSerialize["key"] = o.Key
	toSerialize["title"] = o.Title
	return toSerialize, nil
}

func (o *CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"component",
		"key",
		"title",
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

	varCoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon := _CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon)

	if err != nil {
		return err
	}

	*o = CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon(varCoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon)

	return err
}

type NullableCoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon struct {
	value *CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon
	isSet bool
}

func (v NullableCoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon) Get() *CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon {
	return v.value
}

func (v *NullableCoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon) Set(val *CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon(val *CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon) *NullableCoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon {
	return &NullableCoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon{value: val, isSet: true}
}

func (v NullableCoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


