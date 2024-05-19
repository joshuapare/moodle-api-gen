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

// checks if the CoreCustomfieldReloadTemplate200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreCustomfieldReloadTemplate200Response{}

// CoreCustomfieldReloadTemplate200Response struct for CoreCustomfieldReloadTemplate200Response
type CoreCustomfieldReloadTemplate200Response struct {
	// area
	Area string `json:"area"`
	Categories []CoreCustomfieldReloadTemplate200ResponseCategoriesInner `json:"categories"`
	// component
	Component string `json:"component"`
	// itemid
	Itemid int32 `json:"itemid"`
	// view has categories
	Usescategories bool `json:"usescategories"`
}

type _CoreCustomfieldReloadTemplate200Response CoreCustomfieldReloadTemplate200Response

// NewCoreCustomfieldReloadTemplate200Response instantiates a new CoreCustomfieldReloadTemplate200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreCustomfieldReloadTemplate200Response(area string, categories []CoreCustomfieldReloadTemplate200ResponseCategoriesInner, component string, itemid int32, usescategories bool) *CoreCustomfieldReloadTemplate200Response {
	this := CoreCustomfieldReloadTemplate200Response{}
	this.Area = area
	this.Categories = categories
	this.Component = component
	this.Itemid = itemid
	this.Usescategories = usescategories
	return &this
}

// NewCoreCustomfieldReloadTemplate200ResponseWithDefaults instantiates a new CoreCustomfieldReloadTemplate200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreCustomfieldReloadTemplate200ResponseWithDefaults() *CoreCustomfieldReloadTemplate200Response {
	this := CoreCustomfieldReloadTemplate200Response{}
	var usescategories bool = null
	this.Usescategories = usescategories
	return &this
}

// GetArea returns the Area field value
func (o *CoreCustomfieldReloadTemplate200Response) GetArea() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Area
}

// GetAreaOk returns a tuple with the Area field value
// and a boolean to check if the value has been set.
func (o *CoreCustomfieldReloadTemplate200Response) GetAreaOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Area, true
}

// SetArea sets field value
func (o *CoreCustomfieldReloadTemplate200Response) SetArea(v string) {
	o.Area = v
}

// GetCategories returns the Categories field value
func (o *CoreCustomfieldReloadTemplate200Response) GetCategories() []CoreCustomfieldReloadTemplate200ResponseCategoriesInner {
	if o == nil {
		var ret []CoreCustomfieldReloadTemplate200ResponseCategoriesInner
		return ret
	}

	return o.Categories
}

// GetCategoriesOk returns a tuple with the Categories field value
// and a boolean to check if the value has been set.
func (o *CoreCustomfieldReloadTemplate200Response) GetCategoriesOk() ([]CoreCustomfieldReloadTemplate200ResponseCategoriesInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Categories, true
}

// SetCategories sets field value
func (o *CoreCustomfieldReloadTemplate200Response) SetCategories(v []CoreCustomfieldReloadTemplate200ResponseCategoriesInner) {
	o.Categories = v
}

// GetComponent returns the Component field value
func (o *CoreCustomfieldReloadTemplate200Response) GetComponent() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Component
}

// GetComponentOk returns a tuple with the Component field value
// and a boolean to check if the value has been set.
func (o *CoreCustomfieldReloadTemplate200Response) GetComponentOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Component, true
}

// SetComponent sets field value
func (o *CoreCustomfieldReloadTemplate200Response) SetComponent(v string) {
	o.Component = v
}

// GetItemid returns the Itemid field value
func (o *CoreCustomfieldReloadTemplate200Response) GetItemid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Itemid
}

// GetItemidOk returns a tuple with the Itemid field value
// and a boolean to check if the value has been set.
func (o *CoreCustomfieldReloadTemplate200Response) GetItemidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Itemid, true
}

// SetItemid sets field value
func (o *CoreCustomfieldReloadTemplate200Response) SetItemid(v int32) {
	o.Itemid = v
}

// GetUsescategories returns the Usescategories field value
func (o *CoreCustomfieldReloadTemplate200Response) GetUsescategories() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Usescategories
}

// GetUsescategoriesOk returns a tuple with the Usescategories field value
// and a boolean to check if the value has been set.
func (o *CoreCustomfieldReloadTemplate200Response) GetUsescategoriesOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Usescategories, true
}

// SetUsescategories sets field value
func (o *CoreCustomfieldReloadTemplate200Response) SetUsescategories(v bool) {
	o.Usescategories = v
}

func (o CoreCustomfieldReloadTemplate200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreCustomfieldReloadTemplate200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["area"] = o.Area
	toSerialize["categories"] = o.Categories
	toSerialize["component"] = o.Component
	toSerialize["itemid"] = o.Itemid
	toSerialize["usescategories"] = o.Usescategories
	return toSerialize, nil
}

func (o *CoreCustomfieldReloadTemplate200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"area",
		"categories",
		"component",
		"itemid",
		"usescategories",
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

	varCoreCustomfieldReloadTemplate200Response := _CoreCustomfieldReloadTemplate200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreCustomfieldReloadTemplate200Response)

	if err != nil {
		return err
	}

	*o = CoreCustomfieldReloadTemplate200Response(varCoreCustomfieldReloadTemplate200Response)

	return err
}

type NullableCoreCustomfieldReloadTemplate200Response struct {
	value *CoreCustomfieldReloadTemplate200Response
	isSet bool
}

func (v NullableCoreCustomfieldReloadTemplate200Response) Get() *CoreCustomfieldReloadTemplate200Response {
	return v.value
}

func (v *NullableCoreCustomfieldReloadTemplate200Response) Set(val *CoreCustomfieldReloadTemplate200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreCustomfieldReloadTemplate200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreCustomfieldReloadTemplate200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreCustomfieldReloadTemplate200Response(val *CoreCustomfieldReloadTemplate200Response) *NullableCoreCustomfieldReloadTemplate200Response {
	return &NullableCoreCustomfieldReloadTemplate200Response{value: val, isSet: true}
}

func (v NullableCoreCustomfieldReloadTemplate200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreCustomfieldReloadTemplate200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


