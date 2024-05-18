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

// checks if the ModWikiGetPageContents200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModWikiGetPageContents200Response{}

// ModWikiGetPageContents200Response struct for ModWikiGetPageContents200Response
type ModWikiGetPageContents200Response struct {
	Page ModWikiGetPageContents200ResponsePage `json:"page"`
	Warnings []AuthEmailSignupUser200ResponseWarningsInner `json:"warnings,omitempty"`
}

type _ModWikiGetPageContents200Response ModWikiGetPageContents200Response

// NewModWikiGetPageContents200Response instantiates a new ModWikiGetPageContents200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModWikiGetPageContents200Response(page ModWikiGetPageContents200ResponsePage) *ModWikiGetPageContents200Response {
	this := ModWikiGetPageContents200Response{}
	this.Page = page
	return &this
}

// NewModWikiGetPageContents200ResponseWithDefaults instantiates a new ModWikiGetPageContents200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModWikiGetPageContents200ResponseWithDefaults() *ModWikiGetPageContents200Response {
	this := ModWikiGetPageContents200Response{}
	return &this
}

// GetPage returns the Page field value
func (o *ModWikiGetPageContents200Response) GetPage() ModWikiGetPageContents200ResponsePage {
	if o == nil {
		var ret ModWikiGetPageContents200ResponsePage
		return ret
	}

	return o.Page
}

// GetPageOk returns a tuple with the Page field value
// and a boolean to check if the value has been set.
func (o *ModWikiGetPageContents200Response) GetPageOk() (*ModWikiGetPageContents200ResponsePage, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Page, true
}

// SetPage sets field value
func (o *ModWikiGetPageContents200Response) SetPage(v ModWikiGetPageContents200ResponsePage) {
	o.Page = v
}

// GetWarnings returns the Warnings field value if set, zero value otherwise.
func (o *ModWikiGetPageContents200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner {
	if o == nil || IsNil(o.Warnings) {
		var ret []AuthEmailSignupUser200ResponseWarningsInner
		return ret
	}
	return o.Warnings
}

// GetWarningsOk returns a tuple with the Warnings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModWikiGetPageContents200Response) GetWarningsOk() ([]AuthEmailSignupUser200ResponseWarningsInner, bool) {
	if o == nil || IsNil(o.Warnings) {
		return nil, false
	}
	return o.Warnings, true
}

// HasWarnings returns a boolean if a field has been set.
func (o *ModWikiGetPageContents200Response) HasWarnings() bool {
	if o != nil && !IsNil(o.Warnings) {
		return true
	}

	return false
}

// SetWarnings gets a reference to the given []AuthEmailSignupUser200ResponseWarningsInner and assigns it to the Warnings field.
func (o *ModWikiGetPageContents200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner) {
	o.Warnings = v
}

func (o ModWikiGetPageContents200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModWikiGetPageContents200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["page"] = o.Page
	if !IsNil(o.Warnings) {
		toSerialize["warnings"] = o.Warnings
	}
	return toSerialize, nil
}

func (o *ModWikiGetPageContents200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"page",
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

	varModWikiGetPageContents200Response := _ModWikiGetPageContents200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModWikiGetPageContents200Response)

	if err != nil {
		return err
	}

	*o = ModWikiGetPageContents200Response(varModWikiGetPageContents200Response)

	return err
}

type NullableModWikiGetPageContents200Response struct {
	value *ModWikiGetPageContents200Response
	isSet bool
}

func (v NullableModWikiGetPageContents200Response) Get() *ModWikiGetPageContents200Response {
	return v.value
}

func (v *NullableModWikiGetPageContents200Response) Set(val *ModWikiGetPageContents200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableModWikiGetPageContents200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableModWikiGetPageContents200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModWikiGetPageContents200Response(val *ModWikiGetPageContents200Response) *NullableModWikiGetPageContents200Response {
	return &NullableModWikiGetPageContents200Response{value: val, isSet: true}
}

func (v NullableModWikiGetPageContents200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModWikiGetPageContents200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


