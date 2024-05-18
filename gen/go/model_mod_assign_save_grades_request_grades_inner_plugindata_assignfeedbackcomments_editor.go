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

// checks if the ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor{}

// ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor struct for ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor
type ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor struct {
	// The format for this feedback
	Format int32 `json:"format"`
	// The text for this feedback.
	Text string `json:"text"`
}

type _ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor

// NewModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor instantiates a new ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor(format int32, text string) *ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor {
	this := ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor{}
	this.Format = format
	this.Text = text
	return &this
}

// NewModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditorWithDefaults instantiates a new ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditorWithDefaults() *ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor {
	this := ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor{}
	return &this
}

// GetFormat returns the Format field value
func (o *ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor) GetFormat() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Format
}

// GetFormatOk returns a tuple with the Format field value
// and a boolean to check if the value has been set.
func (o *ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor) GetFormatOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Format, true
}

// SetFormat sets field value
func (o *ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor) SetFormat(v int32) {
	o.Format = v
}

// GetText returns the Text field value
func (o *ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor) GetText() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Text
}

// GetTextOk returns a tuple with the Text field value
// and a boolean to check if the value has been set.
func (o *ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor) GetTextOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Text, true
}

// SetText sets field value
func (o *ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor) SetText(v string) {
	o.Text = v
}

func (o ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["format"] = o.Format
	toSerialize["text"] = o.Text
	return toSerialize, nil
}

func (o *ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor) UnmarshalJSON(data []byte) (err error) {
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

	varModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor := _ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor)

	if err != nil {
		return err
	}

	*o = ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor(varModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor)

	return err
}

type NullableModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor struct {
	value *ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor
	isSet bool
}

func (v NullableModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor) Get() *ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor {
	return v.value
}

func (v *NullableModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor) Set(val *ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor) {
	v.value = val
	v.isSet = true
}

func (v NullableModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor) IsSet() bool {
	return v.isSet
}

func (v *NullableModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor(val *ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor) *NullableModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor {
	return &NullableModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor{value: val, isSet: true}
}

func (v NullableModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


