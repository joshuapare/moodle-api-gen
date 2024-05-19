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

// checks if the CoreMoodlenetSendCourse200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreMoodlenetSendCourse200Response{}

// CoreMoodlenetSendCourse200Response struct for CoreMoodlenetSendCourse200Response
type CoreMoodlenetSendCourse200Response struct {
	// Resource URL from MoodleNet
	Resourceurl string `json:"resourceurl"`
	// Status: true if success
	Status bool `json:"status"`
	Warnings []AuthEmailSignupUser200ResponseWarningsInner `json:"warnings,omitempty"`
}

type _CoreMoodlenetSendCourse200Response CoreMoodlenetSendCourse200Response

// NewCoreMoodlenetSendCourse200Response instantiates a new CoreMoodlenetSendCourse200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreMoodlenetSendCourse200Response(resourceurl string, status bool) *CoreMoodlenetSendCourse200Response {
	this := CoreMoodlenetSendCourse200Response{}
	this.Resourceurl = resourceurl
	this.Status = status
	return &this
}

// NewCoreMoodlenetSendCourse200ResponseWithDefaults instantiates a new CoreMoodlenetSendCourse200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreMoodlenetSendCourse200ResponseWithDefaults() *CoreMoodlenetSendCourse200Response {
	this := CoreMoodlenetSendCourse200Response{}
	return &this
}

// GetResourceurl returns the Resourceurl field value
func (o *CoreMoodlenetSendCourse200Response) GetResourceurl() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Resourceurl
}

// GetResourceurlOk returns a tuple with the Resourceurl field value
// and a boolean to check if the value has been set.
func (o *CoreMoodlenetSendCourse200Response) GetResourceurlOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Resourceurl, true
}

// SetResourceurl sets field value
func (o *CoreMoodlenetSendCourse200Response) SetResourceurl(v string) {
	o.Resourceurl = v
}

// GetStatus returns the Status field value
func (o *CoreMoodlenetSendCourse200Response) GetStatus() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Status
}

// GetStatusOk returns a tuple with the Status field value
// and a boolean to check if the value has been set.
func (o *CoreMoodlenetSendCourse200Response) GetStatusOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Status, true
}

// SetStatus sets field value
func (o *CoreMoodlenetSendCourse200Response) SetStatus(v bool) {
	o.Status = v
}

// GetWarnings returns the Warnings field value if set, zero value otherwise.
func (o *CoreMoodlenetSendCourse200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner {
	if o == nil || IsNil(o.Warnings) {
		var ret []AuthEmailSignupUser200ResponseWarningsInner
		return ret
	}
	return o.Warnings
}

// GetWarningsOk returns a tuple with the Warnings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreMoodlenetSendCourse200Response) GetWarningsOk() ([]AuthEmailSignupUser200ResponseWarningsInner, bool) {
	if o == nil || IsNil(o.Warnings) {
		return nil, false
	}
	return o.Warnings, true
}

// HasWarnings returns a boolean if a field has been set.
func (o *CoreMoodlenetSendCourse200Response) HasWarnings() bool {
	if o != nil && !IsNil(o.Warnings) {
		return true
	}

	return false
}

// SetWarnings gets a reference to the given []AuthEmailSignupUser200ResponseWarningsInner and assigns it to the Warnings field.
func (o *CoreMoodlenetSendCourse200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner) {
	o.Warnings = v
}

func (o CoreMoodlenetSendCourse200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreMoodlenetSendCourse200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["resourceurl"] = o.Resourceurl
	toSerialize["status"] = o.Status
	if !IsNil(o.Warnings) {
		toSerialize["warnings"] = o.Warnings
	}
	return toSerialize, nil
}

func (o *CoreMoodlenetSendCourse200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"resourceurl",
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

	varCoreMoodlenetSendCourse200Response := _CoreMoodlenetSendCourse200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreMoodlenetSendCourse200Response)

	if err != nil {
		return err
	}

	*o = CoreMoodlenetSendCourse200Response(varCoreMoodlenetSendCourse200Response)

	return err
}

type NullableCoreMoodlenetSendCourse200Response struct {
	value *CoreMoodlenetSendCourse200Response
	isSet bool
}

func (v NullableCoreMoodlenetSendCourse200Response) Get() *CoreMoodlenetSendCourse200Response {
	return v.value
}

func (v *NullableCoreMoodlenetSendCourse200Response) Set(val *CoreMoodlenetSendCourse200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreMoodlenetSendCourse200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreMoodlenetSendCourse200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreMoodlenetSendCourse200Response(val *CoreMoodlenetSendCourse200Response) *NullableCoreMoodlenetSendCourse200Response {
	return &NullableCoreMoodlenetSendCourse200Response{value: val, isSet: true}
}

func (v NullableCoreMoodlenetSendCourse200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreMoodlenetSendCourse200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


