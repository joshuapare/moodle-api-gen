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

// checks if the ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor{}

// ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor struct for ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor
type ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor struct {
	// The format for this feedback
	Format int32 `json:"format"`
	// The text for this feedback.
	Text string `json:"text"`
}

type _ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor

// NewModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor instantiates a new ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor(format int32, text string) *ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor {
	this := ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor{}
	this.Format = format
	this.Text = text
	return &this
}

// NewModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditorWithDefaults instantiates a new ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditorWithDefaults() *ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor {
	this := ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor{}
	var format int32 = null
	this.Format = format
	var text string = "null"
	this.Text = text
	return &this
}

// GetFormat returns the Format field value
func (o *ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor) GetFormat() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Format
}

// GetFormatOk returns a tuple with the Format field value
// and a boolean to check if the value has been set.
func (o *ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor) GetFormatOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Format, true
}

// SetFormat sets field value
func (o *ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor) SetFormat(v int32) {
	o.Format = v
}

// GetText returns the Text field value
func (o *ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor) GetText() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Text
}

// GetTextOk returns a tuple with the Text field value
// and a boolean to check if the value has been set.
func (o *ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor) GetTextOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Text, true
}

// SetText sets field value
func (o *ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor) SetText(v string) {
	o.Text = v
}

func (o ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["format"] = o.Format
	toSerialize["text"] = o.Text
	return toSerialize, nil
}

func (o *ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"format",
		"text",
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

	varModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor := _ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor)

	if err != nil {
		return err
	}

	*o = ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor(varModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor)

	return err
}

type NullableModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor struct {
	value *ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor
	isSet bool
}

func (v NullableModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor) Get() *ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor {
	return v.value
}

func (v *NullableModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor) Set(val *ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor) {
	v.value = val
	v.isSet = true
}

func (v NullableModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor) IsSet() bool {
	return v.isSet
}

func (v *NullableModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor(val *ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor) *NullableModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor {
	return &NullableModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor{value: val, isSet: true}
}

func (v NullableModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

