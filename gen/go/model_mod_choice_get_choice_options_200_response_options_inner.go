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

// checks if the ModChoiceGetChoiceOptions200ResponseOptionsInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModChoiceGetChoiceOptions200ResponseOptionsInner{}

// ModChoiceGetChoiceOptions200ResponseOptionsInner struct for ModChoiceGetChoiceOptions200ResponseOptionsInner
type ModChoiceGetChoiceOptions200ResponseOptionsInner struct {
	// we already answered
	Checked *bool `json:"checked,omitempty"`
	// number of answers
	Countanswers *int32 `json:"countanswers,omitempty"`
	// option disabled
	Disabled *bool `json:"disabled,omitempty"`
	// true for orizontal, otherwise vertical
	Displaylayout *bool `json:"displaylayout,omitempty"`
	// option id
	Id *int32 `json:"id,omitempty"`
	// maximum number of answers
	Maxanswers *int32 `json:"maxanswers,omitempty"`
	// text of the choice
	Text *string `json:"text,omitempty"`
}

// NewModChoiceGetChoiceOptions200ResponseOptionsInner instantiates a new ModChoiceGetChoiceOptions200ResponseOptionsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModChoiceGetChoiceOptions200ResponseOptionsInner() *ModChoiceGetChoiceOptions200ResponseOptionsInner {
	this := ModChoiceGetChoiceOptions200ResponseOptionsInner{}
	var checked bool = null
	this.Checked = &checked
	var countanswers int32 = null
	this.Countanswers = &countanswers
	var disabled bool = null
	this.Disabled = &disabled
	var displaylayout bool = null
	this.Displaylayout = &displaylayout
	var id int32 = null
	this.Id = &id
	var maxanswers int32 = null
	this.Maxanswers = &maxanswers
	var text string = "null"
	this.Text = &text
	return &this
}

// NewModChoiceGetChoiceOptions200ResponseOptionsInnerWithDefaults instantiates a new ModChoiceGetChoiceOptions200ResponseOptionsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModChoiceGetChoiceOptions200ResponseOptionsInnerWithDefaults() *ModChoiceGetChoiceOptions200ResponseOptionsInner {
	this := ModChoiceGetChoiceOptions200ResponseOptionsInner{}
	var checked bool = null
	this.Checked = &checked
	var countanswers int32 = null
	this.Countanswers = &countanswers
	var disabled bool = null
	this.Disabled = &disabled
	var displaylayout bool = null
	this.Displaylayout = &displaylayout
	var id int32 = null
	this.Id = &id
	var maxanswers int32 = null
	this.Maxanswers = &maxanswers
	var text string = "null"
	this.Text = &text
	return &this
}

// GetChecked returns the Checked field value if set, zero value otherwise.
func (o *ModChoiceGetChoiceOptions200ResponseOptionsInner) GetChecked() bool {
	if o == nil || IsNil(o.Checked) {
		var ret bool
		return ret
	}
	return *o.Checked
}

// GetCheckedOk returns a tuple with the Checked field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoiceOptions200ResponseOptionsInner) GetCheckedOk() (*bool, bool) {
	if o == nil || IsNil(o.Checked) {
		return nil, false
	}
	return o.Checked, true
}

// HasChecked returns a boolean if a field has been set.
func (o *ModChoiceGetChoiceOptions200ResponseOptionsInner) HasChecked() bool {
	if o != nil && !IsNil(o.Checked) {
		return true
	}

	return false
}

// SetChecked gets a reference to the given bool and assigns it to the Checked field.
func (o *ModChoiceGetChoiceOptions200ResponseOptionsInner) SetChecked(v bool) {
	o.Checked = &v
}

// GetCountanswers returns the Countanswers field value if set, zero value otherwise.
func (o *ModChoiceGetChoiceOptions200ResponseOptionsInner) GetCountanswers() int32 {
	if o == nil || IsNil(o.Countanswers) {
		var ret int32
		return ret
	}
	return *o.Countanswers
}

// GetCountanswersOk returns a tuple with the Countanswers field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoiceOptions200ResponseOptionsInner) GetCountanswersOk() (*int32, bool) {
	if o == nil || IsNil(o.Countanswers) {
		return nil, false
	}
	return o.Countanswers, true
}

// HasCountanswers returns a boolean if a field has been set.
func (o *ModChoiceGetChoiceOptions200ResponseOptionsInner) HasCountanswers() bool {
	if o != nil && !IsNil(o.Countanswers) {
		return true
	}

	return false
}

// SetCountanswers gets a reference to the given int32 and assigns it to the Countanswers field.
func (o *ModChoiceGetChoiceOptions200ResponseOptionsInner) SetCountanswers(v int32) {
	o.Countanswers = &v
}

// GetDisabled returns the Disabled field value if set, zero value otherwise.
func (o *ModChoiceGetChoiceOptions200ResponseOptionsInner) GetDisabled() bool {
	if o == nil || IsNil(o.Disabled) {
		var ret bool
		return ret
	}
	return *o.Disabled
}

// GetDisabledOk returns a tuple with the Disabled field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoiceOptions200ResponseOptionsInner) GetDisabledOk() (*bool, bool) {
	if o == nil || IsNil(o.Disabled) {
		return nil, false
	}
	return o.Disabled, true
}

// HasDisabled returns a boolean if a field has been set.
func (o *ModChoiceGetChoiceOptions200ResponseOptionsInner) HasDisabled() bool {
	if o != nil && !IsNil(o.Disabled) {
		return true
	}

	return false
}

// SetDisabled gets a reference to the given bool and assigns it to the Disabled field.
func (o *ModChoiceGetChoiceOptions200ResponseOptionsInner) SetDisabled(v bool) {
	o.Disabled = &v
}

// GetDisplaylayout returns the Displaylayout field value if set, zero value otherwise.
func (o *ModChoiceGetChoiceOptions200ResponseOptionsInner) GetDisplaylayout() bool {
	if o == nil || IsNil(o.Displaylayout) {
		var ret bool
		return ret
	}
	return *o.Displaylayout
}

// GetDisplaylayoutOk returns a tuple with the Displaylayout field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoiceOptions200ResponseOptionsInner) GetDisplaylayoutOk() (*bool, bool) {
	if o == nil || IsNil(o.Displaylayout) {
		return nil, false
	}
	return o.Displaylayout, true
}

// HasDisplaylayout returns a boolean if a field has been set.
func (o *ModChoiceGetChoiceOptions200ResponseOptionsInner) HasDisplaylayout() bool {
	if o != nil && !IsNil(o.Displaylayout) {
		return true
	}

	return false
}

// SetDisplaylayout gets a reference to the given bool and assigns it to the Displaylayout field.
func (o *ModChoiceGetChoiceOptions200ResponseOptionsInner) SetDisplaylayout(v bool) {
	o.Displaylayout = &v
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *ModChoiceGetChoiceOptions200ResponseOptionsInner) GetId() int32 {
	if o == nil || IsNil(o.Id) {
		var ret int32
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoiceOptions200ResponseOptionsInner) GetIdOk() (*int32, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *ModChoiceGetChoiceOptions200ResponseOptionsInner) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given int32 and assigns it to the Id field.
func (o *ModChoiceGetChoiceOptions200ResponseOptionsInner) SetId(v int32) {
	o.Id = &v
}

// GetMaxanswers returns the Maxanswers field value if set, zero value otherwise.
func (o *ModChoiceGetChoiceOptions200ResponseOptionsInner) GetMaxanswers() int32 {
	if o == nil || IsNil(o.Maxanswers) {
		var ret int32
		return ret
	}
	return *o.Maxanswers
}

// GetMaxanswersOk returns a tuple with the Maxanswers field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoiceOptions200ResponseOptionsInner) GetMaxanswersOk() (*int32, bool) {
	if o == nil || IsNil(o.Maxanswers) {
		return nil, false
	}
	return o.Maxanswers, true
}

// HasMaxanswers returns a boolean if a field has been set.
func (o *ModChoiceGetChoiceOptions200ResponseOptionsInner) HasMaxanswers() bool {
	if o != nil && !IsNil(o.Maxanswers) {
		return true
	}

	return false
}

// SetMaxanswers gets a reference to the given int32 and assigns it to the Maxanswers field.
func (o *ModChoiceGetChoiceOptions200ResponseOptionsInner) SetMaxanswers(v int32) {
	o.Maxanswers = &v
}

// GetText returns the Text field value if set, zero value otherwise.
func (o *ModChoiceGetChoiceOptions200ResponseOptionsInner) GetText() string {
	if o == nil || IsNil(o.Text) {
		var ret string
		return ret
	}
	return *o.Text
}

// GetTextOk returns a tuple with the Text field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModChoiceGetChoiceOptions200ResponseOptionsInner) GetTextOk() (*string, bool) {
	if o == nil || IsNil(o.Text) {
		return nil, false
	}
	return o.Text, true
}

// HasText returns a boolean if a field has been set.
func (o *ModChoiceGetChoiceOptions200ResponseOptionsInner) HasText() bool {
	if o != nil && !IsNil(o.Text) {
		return true
	}

	return false
}

// SetText gets a reference to the given string and assigns it to the Text field.
func (o *ModChoiceGetChoiceOptions200ResponseOptionsInner) SetText(v string) {
	o.Text = &v
}

func (o ModChoiceGetChoiceOptions200ResponseOptionsInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModChoiceGetChoiceOptions200ResponseOptionsInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Checked) {
		toSerialize["checked"] = o.Checked
	}
	if !IsNil(o.Countanswers) {
		toSerialize["countanswers"] = o.Countanswers
	}
	if !IsNil(o.Disabled) {
		toSerialize["disabled"] = o.Disabled
	}
	if !IsNil(o.Displaylayout) {
		toSerialize["displaylayout"] = o.Displaylayout
	}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.Maxanswers) {
		toSerialize["maxanswers"] = o.Maxanswers
	}
	if !IsNil(o.Text) {
		toSerialize["text"] = o.Text
	}
	return toSerialize, nil
}

type NullableModChoiceGetChoiceOptions200ResponseOptionsInner struct {
	value *ModChoiceGetChoiceOptions200ResponseOptionsInner
	isSet bool
}

func (v NullableModChoiceGetChoiceOptions200ResponseOptionsInner) Get() *ModChoiceGetChoiceOptions200ResponseOptionsInner {
	return v.value
}

func (v *NullableModChoiceGetChoiceOptions200ResponseOptionsInner) Set(val *ModChoiceGetChoiceOptions200ResponseOptionsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableModChoiceGetChoiceOptions200ResponseOptionsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableModChoiceGetChoiceOptions200ResponseOptionsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModChoiceGetChoiceOptions200ResponseOptionsInner(val *ModChoiceGetChoiceOptions200ResponseOptionsInner) *NullableModChoiceGetChoiceOptions200ResponseOptionsInner {
	return &NullableModChoiceGetChoiceOptions200ResponseOptionsInner{value: val, isSet: true}
}

func (v NullableModChoiceGetChoiceOptions200ResponseOptionsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModChoiceGetChoiceOptions200ResponseOptionsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

