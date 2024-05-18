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

// checks if the ModGlossaryGetCategories200ResponseCategoriesInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModGlossaryGetCategories200ResponseCategoriesInner{}

// ModGlossaryGetCategories200ResponseCategoriesInner struct for ModGlossaryGetCategories200ResponseCategoriesInner
type ModGlossaryGetCategories200ResponseCategoriesInner struct {
	// The glossary ID
	Glossaryid *int32 `json:"glossaryid,omitempty"`
	// The category ID
	Id *int32 `json:"id,omitempty"`
	// The name of the category
	Name *string `json:"name,omitempty"`
	// Whether the category is automatically linked
	Usedynalink *bool `json:"usedynalink,omitempty"`
}

// NewModGlossaryGetCategories200ResponseCategoriesInner instantiates a new ModGlossaryGetCategories200ResponseCategoriesInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModGlossaryGetCategories200ResponseCategoriesInner() *ModGlossaryGetCategories200ResponseCategoriesInner {
	this := ModGlossaryGetCategories200ResponseCategoriesInner{}
	var id int32 = null
	this.Id = &id
	var name string = "null"
	this.Name = &name
	var usedynalink bool = null
	this.Usedynalink = &usedynalink
	return &this
}

// NewModGlossaryGetCategories200ResponseCategoriesInnerWithDefaults instantiates a new ModGlossaryGetCategories200ResponseCategoriesInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModGlossaryGetCategories200ResponseCategoriesInnerWithDefaults() *ModGlossaryGetCategories200ResponseCategoriesInner {
	this := ModGlossaryGetCategories200ResponseCategoriesInner{}
	var id int32 = null
	this.Id = &id
	var name string = "null"
	this.Name = &name
	var usedynalink bool = null
	this.Usedynalink = &usedynalink
	return &this
}

// GetGlossaryid returns the Glossaryid field value if set, zero value otherwise.
func (o *ModGlossaryGetCategories200ResponseCategoriesInner) GetGlossaryid() int32 {
	if o == nil || IsNil(o.Glossaryid) {
		var ret int32
		return ret
	}
	return *o.Glossaryid
}

// GetGlossaryidOk returns a tuple with the Glossaryid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModGlossaryGetCategories200ResponseCategoriesInner) GetGlossaryidOk() (*int32, bool) {
	if o == nil || IsNil(o.Glossaryid) {
		return nil, false
	}
	return o.Glossaryid, true
}

// HasGlossaryid returns a boolean if a field has been set.
func (o *ModGlossaryGetCategories200ResponseCategoriesInner) HasGlossaryid() bool {
	if o != nil && !IsNil(o.Glossaryid) {
		return true
	}

	return false
}

// SetGlossaryid gets a reference to the given int32 and assigns it to the Glossaryid field.
func (o *ModGlossaryGetCategories200ResponseCategoriesInner) SetGlossaryid(v int32) {
	o.Glossaryid = &v
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *ModGlossaryGetCategories200ResponseCategoriesInner) GetId() int32 {
	if o == nil || IsNil(o.Id) {
		var ret int32
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModGlossaryGetCategories200ResponseCategoriesInner) GetIdOk() (*int32, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *ModGlossaryGetCategories200ResponseCategoriesInner) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given int32 and assigns it to the Id field.
func (o *ModGlossaryGetCategories200ResponseCategoriesInner) SetId(v int32) {
	o.Id = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *ModGlossaryGetCategories200ResponseCategoriesInner) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModGlossaryGetCategories200ResponseCategoriesInner) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *ModGlossaryGetCategories200ResponseCategoriesInner) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *ModGlossaryGetCategories200ResponseCategoriesInner) SetName(v string) {
	o.Name = &v
}

// GetUsedynalink returns the Usedynalink field value if set, zero value otherwise.
func (o *ModGlossaryGetCategories200ResponseCategoriesInner) GetUsedynalink() bool {
	if o == nil || IsNil(o.Usedynalink) {
		var ret bool
		return ret
	}
	return *o.Usedynalink
}

// GetUsedynalinkOk returns a tuple with the Usedynalink field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModGlossaryGetCategories200ResponseCategoriesInner) GetUsedynalinkOk() (*bool, bool) {
	if o == nil || IsNil(o.Usedynalink) {
		return nil, false
	}
	return o.Usedynalink, true
}

// HasUsedynalink returns a boolean if a field has been set.
func (o *ModGlossaryGetCategories200ResponseCategoriesInner) HasUsedynalink() bool {
	if o != nil && !IsNil(o.Usedynalink) {
		return true
	}

	return false
}

// SetUsedynalink gets a reference to the given bool and assigns it to the Usedynalink field.
func (o *ModGlossaryGetCategories200ResponseCategoriesInner) SetUsedynalink(v bool) {
	o.Usedynalink = &v
}

func (o ModGlossaryGetCategories200ResponseCategoriesInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModGlossaryGetCategories200ResponseCategoriesInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Glossaryid) {
		toSerialize["glossaryid"] = o.Glossaryid
	}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !IsNil(o.Usedynalink) {
		toSerialize["usedynalink"] = o.Usedynalink
	}
	return toSerialize, nil
}

type NullableModGlossaryGetCategories200ResponseCategoriesInner struct {
	value *ModGlossaryGetCategories200ResponseCategoriesInner
	isSet bool
}

func (v NullableModGlossaryGetCategories200ResponseCategoriesInner) Get() *ModGlossaryGetCategories200ResponseCategoriesInner {
	return v.value
}

func (v *NullableModGlossaryGetCategories200ResponseCategoriesInner) Set(val *ModGlossaryGetCategories200ResponseCategoriesInner) {
	v.value = val
	v.isSet = true
}

func (v NullableModGlossaryGetCategories200ResponseCategoriesInner) IsSet() bool {
	return v.isSet
}

func (v *NullableModGlossaryGetCategories200ResponseCategoriesInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModGlossaryGetCategories200ResponseCategoriesInner(val *ModGlossaryGetCategories200ResponseCategoriesInner) *NullableModGlossaryGetCategories200ResponseCategoriesInner {
	return &NullableModGlossaryGetCategories200ResponseCategoriesInner{value: val, isSet: true}
}

func (v NullableModGlossaryGetCategories200ResponseCategoriesInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModGlossaryGetCategories200ResponseCategoriesInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


