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

// checks if the CoreNotesGetCourseNotes200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreNotesGetCourseNotes200Response{}

// CoreNotesGetCourseNotes200Response struct for CoreNotesGetCourseNotes200Response
type CoreNotesGetCourseNotes200Response struct {
	// Whether the user can manage notes at the given course.
	Canmanagecoursenotes *bool `json:"canmanagecoursenotes,omitempty"`
	// Whether the user can manage notes at system level.
	Canmanagesystemnotes *bool `json:"canmanagesystemnotes,omitempty"`
	Coursenotes []CoreNotesGetCourseNotes200ResponseCoursenotesInner `json:"coursenotes,omitempty"`
	Personalnotes []CoreNotesGetCourseNotes200ResponsePersonalnotesInner `json:"personalnotes,omitempty"`
	Sitenotes []CoreNotesGetCourseNotes200ResponsePersonalnotesInner `json:"sitenotes,omitempty"`
	Warnings []AuthEmailSignupUser200ResponseWarningsInner `json:"warnings,omitempty"`
}

// NewCoreNotesGetCourseNotes200Response instantiates a new CoreNotesGetCourseNotes200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreNotesGetCourseNotes200Response() *CoreNotesGetCourseNotes200Response {
	this := CoreNotesGetCourseNotes200Response{}
	var canmanagecoursenotes bool = null
	this.Canmanagecoursenotes = &canmanagecoursenotes
	var canmanagesystemnotes bool = null
	this.Canmanagesystemnotes = &canmanagesystemnotes
	return &this
}

// NewCoreNotesGetCourseNotes200ResponseWithDefaults instantiates a new CoreNotesGetCourseNotes200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreNotesGetCourseNotes200ResponseWithDefaults() *CoreNotesGetCourseNotes200Response {
	this := CoreNotesGetCourseNotes200Response{}
	var canmanagecoursenotes bool = null
	this.Canmanagecoursenotes = &canmanagecoursenotes
	var canmanagesystemnotes bool = null
	this.Canmanagesystemnotes = &canmanagesystemnotes
	return &this
}

// GetCanmanagecoursenotes returns the Canmanagecoursenotes field value if set, zero value otherwise.
func (o *CoreNotesGetCourseNotes200Response) GetCanmanagecoursenotes() bool {
	if o == nil || IsNil(o.Canmanagecoursenotes) {
		var ret bool
		return ret
	}
	return *o.Canmanagecoursenotes
}

// GetCanmanagecoursenotesOk returns a tuple with the Canmanagecoursenotes field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreNotesGetCourseNotes200Response) GetCanmanagecoursenotesOk() (*bool, bool) {
	if o == nil || IsNil(o.Canmanagecoursenotes) {
		return nil, false
	}
	return o.Canmanagecoursenotes, true
}

// HasCanmanagecoursenotes returns a boolean if a field has been set.
func (o *CoreNotesGetCourseNotes200Response) HasCanmanagecoursenotes() bool {
	if o != nil && !IsNil(o.Canmanagecoursenotes) {
		return true
	}

	return false
}

// SetCanmanagecoursenotes gets a reference to the given bool and assigns it to the Canmanagecoursenotes field.
func (o *CoreNotesGetCourseNotes200Response) SetCanmanagecoursenotes(v bool) {
	o.Canmanagecoursenotes = &v
}

// GetCanmanagesystemnotes returns the Canmanagesystemnotes field value if set, zero value otherwise.
func (o *CoreNotesGetCourseNotes200Response) GetCanmanagesystemnotes() bool {
	if o == nil || IsNil(o.Canmanagesystemnotes) {
		var ret bool
		return ret
	}
	return *o.Canmanagesystemnotes
}

// GetCanmanagesystemnotesOk returns a tuple with the Canmanagesystemnotes field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreNotesGetCourseNotes200Response) GetCanmanagesystemnotesOk() (*bool, bool) {
	if o == nil || IsNil(o.Canmanagesystemnotes) {
		return nil, false
	}
	return o.Canmanagesystemnotes, true
}

// HasCanmanagesystemnotes returns a boolean if a field has been set.
func (o *CoreNotesGetCourseNotes200Response) HasCanmanagesystemnotes() bool {
	if o != nil && !IsNil(o.Canmanagesystemnotes) {
		return true
	}

	return false
}

// SetCanmanagesystemnotes gets a reference to the given bool and assigns it to the Canmanagesystemnotes field.
func (o *CoreNotesGetCourseNotes200Response) SetCanmanagesystemnotes(v bool) {
	o.Canmanagesystemnotes = &v
}

// GetCoursenotes returns the Coursenotes field value if set, zero value otherwise.
func (o *CoreNotesGetCourseNotes200Response) GetCoursenotes() []CoreNotesGetCourseNotes200ResponseCoursenotesInner {
	if o == nil || IsNil(o.Coursenotes) {
		var ret []CoreNotesGetCourseNotes200ResponseCoursenotesInner
		return ret
	}
	return o.Coursenotes
}

// GetCoursenotesOk returns a tuple with the Coursenotes field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreNotesGetCourseNotes200Response) GetCoursenotesOk() ([]CoreNotesGetCourseNotes200ResponseCoursenotesInner, bool) {
	if o == nil || IsNil(o.Coursenotes) {
		return nil, false
	}
	return o.Coursenotes, true
}

// HasCoursenotes returns a boolean if a field has been set.
func (o *CoreNotesGetCourseNotes200Response) HasCoursenotes() bool {
	if o != nil && !IsNil(o.Coursenotes) {
		return true
	}

	return false
}

// SetCoursenotes gets a reference to the given []CoreNotesGetCourseNotes200ResponseCoursenotesInner and assigns it to the Coursenotes field.
func (o *CoreNotesGetCourseNotes200Response) SetCoursenotes(v []CoreNotesGetCourseNotes200ResponseCoursenotesInner) {
	o.Coursenotes = v
}

// GetPersonalnotes returns the Personalnotes field value if set, zero value otherwise.
func (o *CoreNotesGetCourseNotes200Response) GetPersonalnotes() []CoreNotesGetCourseNotes200ResponsePersonalnotesInner {
	if o == nil || IsNil(o.Personalnotes) {
		var ret []CoreNotesGetCourseNotes200ResponsePersonalnotesInner
		return ret
	}
	return o.Personalnotes
}

// GetPersonalnotesOk returns a tuple with the Personalnotes field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreNotesGetCourseNotes200Response) GetPersonalnotesOk() ([]CoreNotesGetCourseNotes200ResponsePersonalnotesInner, bool) {
	if o == nil || IsNil(o.Personalnotes) {
		return nil, false
	}
	return o.Personalnotes, true
}

// HasPersonalnotes returns a boolean if a field has been set.
func (o *CoreNotesGetCourseNotes200Response) HasPersonalnotes() bool {
	if o != nil && !IsNil(o.Personalnotes) {
		return true
	}

	return false
}

// SetPersonalnotes gets a reference to the given []CoreNotesGetCourseNotes200ResponsePersonalnotesInner and assigns it to the Personalnotes field.
func (o *CoreNotesGetCourseNotes200Response) SetPersonalnotes(v []CoreNotesGetCourseNotes200ResponsePersonalnotesInner) {
	o.Personalnotes = v
}

// GetSitenotes returns the Sitenotes field value if set, zero value otherwise.
func (o *CoreNotesGetCourseNotes200Response) GetSitenotes() []CoreNotesGetCourseNotes200ResponsePersonalnotesInner {
	if o == nil || IsNil(o.Sitenotes) {
		var ret []CoreNotesGetCourseNotes200ResponsePersonalnotesInner
		return ret
	}
	return o.Sitenotes
}

// GetSitenotesOk returns a tuple with the Sitenotes field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreNotesGetCourseNotes200Response) GetSitenotesOk() ([]CoreNotesGetCourseNotes200ResponsePersonalnotesInner, bool) {
	if o == nil || IsNil(o.Sitenotes) {
		return nil, false
	}
	return o.Sitenotes, true
}

// HasSitenotes returns a boolean if a field has been set.
func (o *CoreNotesGetCourseNotes200Response) HasSitenotes() bool {
	if o != nil && !IsNil(o.Sitenotes) {
		return true
	}

	return false
}

// SetSitenotes gets a reference to the given []CoreNotesGetCourseNotes200ResponsePersonalnotesInner and assigns it to the Sitenotes field.
func (o *CoreNotesGetCourseNotes200Response) SetSitenotes(v []CoreNotesGetCourseNotes200ResponsePersonalnotesInner) {
	o.Sitenotes = v
}

// GetWarnings returns the Warnings field value if set, zero value otherwise.
func (o *CoreNotesGetCourseNotes200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner {
	if o == nil || IsNil(o.Warnings) {
		var ret []AuthEmailSignupUser200ResponseWarningsInner
		return ret
	}
	return o.Warnings
}

// GetWarningsOk returns a tuple with the Warnings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreNotesGetCourseNotes200Response) GetWarningsOk() ([]AuthEmailSignupUser200ResponseWarningsInner, bool) {
	if o == nil || IsNil(o.Warnings) {
		return nil, false
	}
	return o.Warnings, true
}

// HasWarnings returns a boolean if a field has been set.
func (o *CoreNotesGetCourseNotes200Response) HasWarnings() bool {
	if o != nil && !IsNil(o.Warnings) {
		return true
	}

	return false
}

// SetWarnings gets a reference to the given []AuthEmailSignupUser200ResponseWarningsInner and assigns it to the Warnings field.
func (o *CoreNotesGetCourseNotes200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner) {
	o.Warnings = v
}

func (o CoreNotesGetCourseNotes200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreNotesGetCourseNotes200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Canmanagecoursenotes) {
		toSerialize["canmanagecoursenotes"] = o.Canmanagecoursenotes
	}
	if !IsNil(o.Canmanagesystemnotes) {
		toSerialize["canmanagesystemnotes"] = o.Canmanagesystemnotes
	}
	if !IsNil(o.Coursenotes) {
		toSerialize["coursenotes"] = o.Coursenotes
	}
	if !IsNil(o.Personalnotes) {
		toSerialize["personalnotes"] = o.Personalnotes
	}
	if !IsNil(o.Sitenotes) {
		toSerialize["sitenotes"] = o.Sitenotes
	}
	if !IsNil(o.Warnings) {
		toSerialize["warnings"] = o.Warnings
	}
	return toSerialize, nil
}

type NullableCoreNotesGetCourseNotes200Response struct {
	value *CoreNotesGetCourseNotes200Response
	isSet bool
}

func (v NullableCoreNotesGetCourseNotes200Response) Get() *CoreNotesGetCourseNotes200Response {
	return v.value
}

func (v *NullableCoreNotesGetCourseNotes200Response) Set(val *CoreNotesGetCourseNotes200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreNotesGetCourseNotes200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreNotesGetCourseNotes200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreNotesGetCourseNotes200Response(val *CoreNotesGetCourseNotes200Response) *NullableCoreNotesGetCourseNotes200Response {
	return &NullableCoreNotesGetCourseNotes200Response{value: val, isSet: true}
}

func (v NullableCoreNotesGetCourseNotes200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreNotesGetCourseNotes200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


