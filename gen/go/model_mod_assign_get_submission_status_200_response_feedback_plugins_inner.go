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

// checks if the ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner{}

// ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner struct for ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner
type ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner struct {
	Editorfields []ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner `json:"editorfields,omitempty"`
	Fileareas []ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner `json:"fileareas,omitempty"`
	// submission plugin name
	Name *string `json:"name,omitempty"`
	// submission plugin type
	Type *string `json:"type,omitempty"`
}

// NewModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner instantiates a new ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner() *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner {
	this := ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner{}
	var name string = "null"
	this.Name = &name
	var type_ string = "null"
	this.Type = &type_
	return &this
}

// NewModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerWithDefaults instantiates a new ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerWithDefaults() *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner {
	this := ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner{}
	var name string = "null"
	this.Name = &name
	var type_ string = "null"
	this.Type = &type_
	return &this
}

// GetEditorfields returns the Editorfields field value if set, zero value otherwise.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner) GetEditorfields() []ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner {
	if o == nil || IsNil(o.Editorfields) {
		var ret []ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner
		return ret
	}
	return o.Editorfields
}

// GetEditorfieldsOk returns a tuple with the Editorfields field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner) GetEditorfieldsOk() ([]ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner, bool) {
	if o == nil || IsNil(o.Editorfields) {
		return nil, false
	}
	return o.Editorfields, true
}

// HasEditorfields returns a boolean if a field has been set.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner) HasEditorfields() bool {
	if o != nil && !IsNil(o.Editorfields) {
		return true
	}

	return false
}

// SetEditorfields gets a reference to the given []ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner and assigns it to the Editorfields field.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner) SetEditorfields(v []ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner) {
	o.Editorfields = v
}

// GetFileareas returns the Fileareas field value if set, zero value otherwise.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner) GetFileareas() []ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner {
	if o == nil || IsNil(o.Fileareas) {
		var ret []ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner
		return ret
	}
	return o.Fileareas
}

// GetFileareasOk returns a tuple with the Fileareas field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner) GetFileareasOk() ([]ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner, bool) {
	if o == nil || IsNil(o.Fileareas) {
		return nil, false
	}
	return o.Fileareas, true
}

// HasFileareas returns a boolean if a field has been set.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner) HasFileareas() bool {
	if o != nil && !IsNil(o.Fileareas) {
		return true
	}

	return false
}

// SetFileareas gets a reference to the given []ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner and assigns it to the Fileareas field.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner) SetFileareas(v []ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner) {
	o.Fileareas = v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner) SetName(v string) {
	o.Name = &v
}

// GetType returns the Type field value if set, zero value otherwise.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner) GetType() string {
	if o == nil || IsNil(o.Type) {
		var ret string
		return ret
	}
	return *o.Type
}

// GetTypeOk returns a tuple with the Type field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner) GetTypeOk() (*string, bool) {
	if o == nil || IsNil(o.Type) {
		return nil, false
	}
	return o.Type, true
}

// HasType returns a boolean if a field has been set.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner) HasType() bool {
	if o != nil && !IsNil(o.Type) {
		return true
	}

	return false
}

// SetType gets a reference to the given string and assigns it to the Type field.
func (o *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner) SetType(v string) {
	o.Type = &v
}

func (o ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Editorfields) {
		toSerialize["editorfields"] = o.Editorfields
	}
	if !IsNil(o.Fileareas) {
		toSerialize["fileareas"] = o.Fileareas
	}
	if !IsNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !IsNil(o.Type) {
		toSerialize["type"] = o.Type
	}
	return toSerialize, nil
}

type NullableModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner struct {
	value *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner
	isSet bool
}

func (v NullableModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner) Get() *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner {
	return v.value
}

func (v *NullableModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner) Set(val *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner(val *ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner) *NullableModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner {
	return &NullableModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner{value: val, isSet: true}
}

func (v NullableModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


