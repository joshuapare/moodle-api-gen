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

// checks if the ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner{}

// ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner struct for ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner
type ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner struct {
	// field description
	Description *string `json:"description,omitempty"`
	// text format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
	Format *int32 `json:"format,omitempty"`
	// field name
	Name *string `json:"name,omitempty"`
	// field value
	Text *string `json:"text,omitempty"`
}

// NewModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner instantiates a new ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner() *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner {
	this := ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner{}
	var description string = "null"
	this.Description = &description
	var name string = "null"
	this.Name = &name
	var text string = "null"
	this.Text = &text
	return &this
}

// NewModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInnerWithDefaults instantiates a new ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInnerWithDefaults() *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner {
	this := ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner{}
	var description string = "null"
	this.Description = &description
	var name string = "null"
	this.Name = &name
	var text string = "null"
	this.Text = &text
	return &this
}

// GetDescription returns the Description field value if set, zero value otherwise.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner) GetDescription() string {
	if o == nil || IsNil(o.Description) {
		var ret string
		return ret
	}
	return *o.Description
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner) GetDescriptionOk() (*string, bool) {
	if o == nil || IsNil(o.Description) {
		return nil, false
	}
	return o.Description, true
}

// HasDescription returns a boolean if a field has been set.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner) HasDescription() bool {
	if o != nil && !IsNil(o.Description) {
		return true
	}

	return false
}

// SetDescription gets a reference to the given string and assigns it to the Description field.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner) SetDescription(v string) {
	o.Description = &v
}

// GetFormat returns the Format field value if set, zero value otherwise.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner) GetFormat() int32 {
	if o == nil || IsNil(o.Format) {
		var ret int32
		return ret
	}
	return *o.Format
}

// GetFormatOk returns a tuple with the Format field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner) GetFormatOk() (*int32, bool) {
	if o == nil || IsNil(o.Format) {
		return nil, false
	}
	return o.Format, true
}

// HasFormat returns a boolean if a field has been set.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner) HasFormat() bool {
	if o != nil && !IsNil(o.Format) {
		return true
	}

	return false
}

// SetFormat gets a reference to the given int32 and assigns it to the Format field.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner) SetFormat(v int32) {
	o.Format = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner) SetName(v string) {
	o.Name = &v
}

// GetText returns the Text field value if set, zero value otherwise.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner) GetText() string {
	if o == nil || IsNil(o.Text) {
		var ret string
		return ret
	}
	return *o.Text
}

// GetTextOk returns a tuple with the Text field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner) GetTextOk() (*string, bool) {
	if o == nil || IsNil(o.Text) {
		return nil, false
	}
	return o.Text, true
}

// HasText returns a boolean if a field has been set.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner) HasText() bool {
	if o != nil && !IsNil(o.Text) {
		return true
	}

	return false
}

// SetText gets a reference to the given string and assigns it to the Text field.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner) SetText(v string) {
	o.Text = &v
}

func (o ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Description) {
		toSerialize["description"] = o.Description
	}
	if !IsNil(o.Format) {
		toSerialize["format"] = o.Format
	}
	if !IsNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !IsNil(o.Text) {
		toSerialize["text"] = o.Text
	}
	return toSerialize, nil
}

type NullableModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner struct {
	value *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner
	isSet bool
}

func (v NullableModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner) Get() *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner {
	return v.value
}

func (v *NullableModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner) Set(val *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner(val *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner) *NullableModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner {
	return &NullableModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner{value: val, isSet: true}
}

func (v NullableModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


