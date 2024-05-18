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

// checks if the ModForumCanAddDiscussion200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModForumCanAddDiscussion200Response{}

// ModForumCanAddDiscussion200Response struct for ModForumCanAddDiscussion200Response
type ModForumCanAddDiscussion200Response struct {
	// True if the user can add attachments, false otherwise.
	Cancreateattachment *bool `json:"cancreateattachment,omitempty"`
	// True if the user can pin discussions, false otherwise.
	Canpindiscussions *bool `json:"canpindiscussions,omitempty"`
	// True if the user can add discussions, false otherwise.
	Status bool `json:"status"`
	Warnings []AuthEmailSignupUser200ResponseWarningsInner `json:"warnings,omitempty"`
}

type _ModForumCanAddDiscussion200Response ModForumCanAddDiscussion200Response

// NewModForumCanAddDiscussion200Response instantiates a new ModForumCanAddDiscussion200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModForumCanAddDiscussion200Response(status bool) *ModForumCanAddDiscussion200Response {
	this := ModForumCanAddDiscussion200Response{}
	var cancreateattachment bool = null
	this.Cancreateattachment = &cancreateattachment
	var canpindiscussions bool = null
	this.Canpindiscussions = &canpindiscussions
	this.Status = status
	return &this
}

// NewModForumCanAddDiscussion200ResponseWithDefaults instantiates a new ModForumCanAddDiscussion200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModForumCanAddDiscussion200ResponseWithDefaults() *ModForumCanAddDiscussion200Response {
	this := ModForumCanAddDiscussion200Response{}
	var cancreateattachment bool = null
	this.Cancreateattachment = &cancreateattachment
	var canpindiscussions bool = null
	this.Canpindiscussions = &canpindiscussions
	var status bool = null
	this.Status = status
	return &this
}

// GetCancreateattachment returns the Cancreateattachment field value if set, zero value otherwise.
func (o *ModForumCanAddDiscussion200Response) GetCancreateattachment() bool {
	if o == nil || IsNil(o.Cancreateattachment) {
		var ret bool
		return ret
	}
	return *o.Cancreateattachment
}

// GetCancreateattachmentOk returns a tuple with the Cancreateattachment field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModForumCanAddDiscussion200Response) GetCancreateattachmentOk() (*bool, bool) {
	if o == nil || IsNil(o.Cancreateattachment) {
		return nil, false
	}
	return o.Cancreateattachment, true
}

// HasCancreateattachment returns a boolean if a field has been set.
func (o *ModForumCanAddDiscussion200Response) HasCancreateattachment() bool {
	if o != nil && !IsNil(o.Cancreateattachment) {
		return true
	}

	return false
}

// SetCancreateattachment gets a reference to the given bool and assigns it to the Cancreateattachment field.
func (o *ModForumCanAddDiscussion200Response) SetCancreateattachment(v bool) {
	o.Cancreateattachment = &v
}

// GetCanpindiscussions returns the Canpindiscussions field value if set, zero value otherwise.
func (o *ModForumCanAddDiscussion200Response) GetCanpindiscussions() bool {
	if o == nil || IsNil(o.Canpindiscussions) {
		var ret bool
		return ret
	}
	return *o.Canpindiscussions
}

// GetCanpindiscussionsOk returns a tuple with the Canpindiscussions field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModForumCanAddDiscussion200Response) GetCanpindiscussionsOk() (*bool, bool) {
	if o == nil || IsNil(o.Canpindiscussions) {
		return nil, false
	}
	return o.Canpindiscussions, true
}

// HasCanpindiscussions returns a boolean if a field has been set.
func (o *ModForumCanAddDiscussion200Response) HasCanpindiscussions() bool {
	if o != nil && !IsNil(o.Canpindiscussions) {
		return true
	}

	return false
}

// SetCanpindiscussions gets a reference to the given bool and assigns it to the Canpindiscussions field.
func (o *ModForumCanAddDiscussion200Response) SetCanpindiscussions(v bool) {
	o.Canpindiscussions = &v
}

// GetStatus returns the Status field value
func (o *ModForumCanAddDiscussion200Response) GetStatus() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Status
}

// GetStatusOk returns a tuple with the Status field value
// and a boolean to check if the value has been set.
func (o *ModForumCanAddDiscussion200Response) GetStatusOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Status, true
}

// SetStatus sets field value
func (o *ModForumCanAddDiscussion200Response) SetStatus(v bool) {
	o.Status = v
}

// GetWarnings returns the Warnings field value if set, zero value otherwise.
func (o *ModForumCanAddDiscussion200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner {
	if o == nil || IsNil(o.Warnings) {
		var ret []AuthEmailSignupUser200ResponseWarningsInner
		return ret
	}
	return o.Warnings
}

// GetWarningsOk returns a tuple with the Warnings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModForumCanAddDiscussion200Response) GetWarningsOk() ([]AuthEmailSignupUser200ResponseWarningsInner, bool) {
	if o == nil || IsNil(o.Warnings) {
		return nil, false
	}
	return o.Warnings, true
}

// HasWarnings returns a boolean if a field has been set.
func (o *ModForumCanAddDiscussion200Response) HasWarnings() bool {
	if o != nil && !IsNil(o.Warnings) {
		return true
	}

	return false
}

// SetWarnings gets a reference to the given []AuthEmailSignupUser200ResponseWarningsInner and assigns it to the Warnings field.
func (o *ModForumCanAddDiscussion200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner) {
	o.Warnings = v
}

func (o ModForumCanAddDiscussion200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModForumCanAddDiscussion200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Cancreateattachment) {
		toSerialize["cancreateattachment"] = o.Cancreateattachment
	}
	if !IsNil(o.Canpindiscussions) {
		toSerialize["canpindiscussions"] = o.Canpindiscussions
	}
	toSerialize["status"] = o.Status
	if !IsNil(o.Warnings) {
		toSerialize["warnings"] = o.Warnings
	}
	return toSerialize, nil
}

func (o *ModForumCanAddDiscussion200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"status",
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

	varModForumCanAddDiscussion200Response := _ModForumCanAddDiscussion200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModForumCanAddDiscussion200Response)

	if err != nil {
		return err
	}

	*o = ModForumCanAddDiscussion200Response(varModForumCanAddDiscussion200Response)

	return err
}

type NullableModForumCanAddDiscussion200Response struct {
	value *ModForumCanAddDiscussion200Response
	isSet bool
}

func (v NullableModForumCanAddDiscussion200Response) Get() *ModForumCanAddDiscussion200Response {
	return v.value
}

func (v *NullableModForumCanAddDiscussion200Response) Set(val *ModForumCanAddDiscussion200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableModForumCanAddDiscussion200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableModForumCanAddDiscussion200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModForumCanAddDiscussion200Response(val *ModForumCanAddDiscussion200Response) *NullableModForumCanAddDiscussion200Response {
	return &NullableModForumCanAddDiscussion200Response{value: val, isSet: true}
}

func (v NullableModForumCanAddDiscussion200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModForumCanAddDiscussion200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


