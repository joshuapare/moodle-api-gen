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

// checks if the ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer{}

// ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer struct for ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer
type ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer struct {
	// Option text value
	Answer *string `json:"answer,omitempty"`
	// If has to be displayed as a checked option
	Checked *bool `json:"checked,omitempty"`
	// If has to be displayed as correct
	Correct *bool `json:"correct,omitempty"`
	// If has to be displayed as failed
	Fail *bool `json:"fail,omitempty"`
	// If has to be displayed as incorrect
	Incorrect *bool `json:"incorrect,omitempty"`
	// If has to be displayed as passed
	Pass *bool `json:"pass,omitempty"`
	// If has to be displayed as simple text
	Text *bool `json:"text,omitempty"`
	// If has to be displayed as a unchecked option
	Unchecked *bool `json:"unchecked,omitempty"`
}

// NewModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer instantiates a new ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer() *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer {
	this := ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer{}
	var answer string = "null"
	this.Answer = &answer
	var checked bool = null
	this.Checked = &checked
	var correct bool = null
	this.Correct = &correct
	var fail bool = null
	this.Fail = &fail
	var incorrect bool = null
	this.Incorrect = &incorrect
	var pass bool = null
	this.Pass = &pass
	var text bool = null
	this.Text = &text
	var unchecked bool = null
	this.Unchecked = &unchecked
	return &this
}

// NewModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswerWithDefaults instantiates a new ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswerWithDefaults() *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer {
	this := ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer{}
	var answer string = "null"
	this.Answer = &answer
	var checked bool = null
	this.Checked = &checked
	var correct bool = null
	this.Correct = &correct
	var fail bool = null
	this.Fail = &fail
	var incorrect bool = null
	this.Incorrect = &incorrect
	var pass bool = null
	this.Pass = &pass
	var text bool = null
	this.Text = &text
	var unchecked bool = null
	this.Unchecked = &unchecked
	return &this
}

// GetAnswer returns the Answer field value if set, zero value otherwise.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) GetAnswer() string {
	if o == nil || IsNil(o.Answer) {
		var ret string
		return ret
	}
	return *o.Answer
}

// GetAnswerOk returns a tuple with the Answer field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) GetAnswerOk() (*string, bool) {
	if o == nil || IsNil(o.Answer) {
		return nil, false
	}
	return o.Answer, true
}

// HasAnswer returns a boolean if a field has been set.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) HasAnswer() bool {
	if o != nil && !IsNil(o.Answer) {
		return true
	}

	return false
}

// SetAnswer gets a reference to the given string and assigns it to the Answer field.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) SetAnswer(v string) {
	o.Answer = &v
}

// GetChecked returns the Checked field value if set, zero value otherwise.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) GetChecked() bool {
	if o == nil || IsNil(o.Checked) {
		var ret bool
		return ret
	}
	return *o.Checked
}

// GetCheckedOk returns a tuple with the Checked field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) GetCheckedOk() (*bool, bool) {
	if o == nil || IsNil(o.Checked) {
		return nil, false
	}
	return o.Checked, true
}

// HasChecked returns a boolean if a field has been set.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) HasChecked() bool {
	if o != nil && !IsNil(o.Checked) {
		return true
	}

	return false
}

// SetChecked gets a reference to the given bool and assigns it to the Checked field.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) SetChecked(v bool) {
	o.Checked = &v
}

// GetCorrect returns the Correct field value if set, zero value otherwise.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) GetCorrect() bool {
	if o == nil || IsNil(o.Correct) {
		var ret bool
		return ret
	}
	return *o.Correct
}

// GetCorrectOk returns a tuple with the Correct field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) GetCorrectOk() (*bool, bool) {
	if o == nil || IsNil(o.Correct) {
		return nil, false
	}
	return o.Correct, true
}

// HasCorrect returns a boolean if a field has been set.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) HasCorrect() bool {
	if o != nil && !IsNil(o.Correct) {
		return true
	}

	return false
}

// SetCorrect gets a reference to the given bool and assigns it to the Correct field.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) SetCorrect(v bool) {
	o.Correct = &v
}

// GetFail returns the Fail field value if set, zero value otherwise.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) GetFail() bool {
	if o == nil || IsNil(o.Fail) {
		var ret bool
		return ret
	}
	return *o.Fail
}

// GetFailOk returns a tuple with the Fail field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) GetFailOk() (*bool, bool) {
	if o == nil || IsNil(o.Fail) {
		return nil, false
	}
	return o.Fail, true
}

// HasFail returns a boolean if a field has been set.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) HasFail() bool {
	if o != nil && !IsNil(o.Fail) {
		return true
	}

	return false
}

// SetFail gets a reference to the given bool and assigns it to the Fail field.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) SetFail(v bool) {
	o.Fail = &v
}

// GetIncorrect returns the Incorrect field value if set, zero value otherwise.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) GetIncorrect() bool {
	if o == nil || IsNil(o.Incorrect) {
		var ret bool
		return ret
	}
	return *o.Incorrect
}

// GetIncorrectOk returns a tuple with the Incorrect field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) GetIncorrectOk() (*bool, bool) {
	if o == nil || IsNil(o.Incorrect) {
		return nil, false
	}
	return o.Incorrect, true
}

// HasIncorrect returns a boolean if a field has been set.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) HasIncorrect() bool {
	if o != nil && !IsNil(o.Incorrect) {
		return true
	}

	return false
}

// SetIncorrect gets a reference to the given bool and assigns it to the Incorrect field.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) SetIncorrect(v bool) {
	o.Incorrect = &v
}

// GetPass returns the Pass field value if set, zero value otherwise.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) GetPass() bool {
	if o == nil || IsNil(o.Pass) {
		var ret bool
		return ret
	}
	return *o.Pass
}

// GetPassOk returns a tuple with the Pass field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) GetPassOk() (*bool, bool) {
	if o == nil || IsNil(o.Pass) {
		return nil, false
	}
	return o.Pass, true
}

// HasPass returns a boolean if a field has been set.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) HasPass() bool {
	if o != nil && !IsNil(o.Pass) {
		return true
	}

	return false
}

// SetPass gets a reference to the given bool and assigns it to the Pass field.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) SetPass(v bool) {
	o.Pass = &v
}

// GetText returns the Text field value if set, zero value otherwise.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) GetText() bool {
	if o == nil || IsNil(o.Text) {
		var ret bool
		return ret
	}
	return *o.Text
}

// GetTextOk returns a tuple with the Text field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) GetTextOk() (*bool, bool) {
	if o == nil || IsNil(o.Text) {
		return nil, false
	}
	return o.Text, true
}

// HasText returns a boolean if a field has been set.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) HasText() bool {
	if o != nil && !IsNil(o.Text) {
		return true
	}

	return false
}

// SetText gets a reference to the given bool and assigns it to the Text field.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) SetText(v bool) {
	o.Text = &v
}

// GetUnchecked returns the Unchecked field value if set, zero value otherwise.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) GetUnchecked() bool {
	if o == nil || IsNil(o.Unchecked) {
		var ret bool
		return ret
	}
	return *o.Unchecked
}

// GetUncheckedOk returns a tuple with the Unchecked field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) GetUncheckedOk() (*bool, bool) {
	if o == nil || IsNil(o.Unchecked) {
		return nil, false
	}
	return o.Unchecked, true
}

// HasUnchecked returns a boolean if a field has been set.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) HasUnchecked() bool {
	if o != nil && !IsNil(o.Unchecked) {
		return true
	}

	return false
}

// SetUnchecked gets a reference to the given bool and assigns it to the Unchecked field.
func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) SetUnchecked(v bool) {
	o.Unchecked = &v
}

func (o ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Answer) {
		toSerialize["answer"] = o.Answer
	}
	if !IsNil(o.Checked) {
		toSerialize["checked"] = o.Checked
	}
	if !IsNil(o.Correct) {
		toSerialize["correct"] = o.Correct
	}
	if !IsNil(o.Fail) {
		toSerialize["fail"] = o.Fail
	}
	if !IsNil(o.Incorrect) {
		toSerialize["incorrect"] = o.Incorrect
	}
	if !IsNil(o.Pass) {
		toSerialize["pass"] = o.Pass
	}
	if !IsNil(o.Text) {
		toSerialize["text"] = o.Text
	}
	if !IsNil(o.Unchecked) {
		toSerialize["unchecked"] = o.Unchecked
	}
	return toSerialize, nil
}

type NullableModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer struct {
	value *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer
	isSet bool
}

func (v NullableModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) Get() *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer {
	return v.value
}

func (v *NullableModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) Set(val *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) {
	v.value = val
	v.isSet = true
}

func (v NullableModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) IsSet() bool {
	return v.isSet
}

func (v *NullableModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer(val *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) *NullableModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer {
	return &NullableModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer{value: val, isSet: true}
}

func (v NullableModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


