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

// checks if the CoreCalendarGetCalendarEvents200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreCalendarGetCalendarEvents200Response{}

// CoreCalendarGetCalendarEvents200Response struct for CoreCalendarGetCalendarEvents200Response
type CoreCalendarGetCalendarEvents200Response struct {
	Events []CoreCalendarGetCalendarEvents200ResponseEventsInner `json:"events"`
	Warnings []AuthEmailSignupUser200ResponseWarningsInner `json:"warnings,omitempty"`
}

type _CoreCalendarGetCalendarEvents200Response CoreCalendarGetCalendarEvents200Response

// NewCoreCalendarGetCalendarEvents200Response instantiates a new CoreCalendarGetCalendarEvents200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreCalendarGetCalendarEvents200Response(events []CoreCalendarGetCalendarEvents200ResponseEventsInner) *CoreCalendarGetCalendarEvents200Response {
	this := CoreCalendarGetCalendarEvents200Response{}
	this.Events = events
	return &this
}

// NewCoreCalendarGetCalendarEvents200ResponseWithDefaults instantiates a new CoreCalendarGetCalendarEvents200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreCalendarGetCalendarEvents200ResponseWithDefaults() *CoreCalendarGetCalendarEvents200Response {
	this := CoreCalendarGetCalendarEvents200Response{}
	return &this
}

// GetEvents returns the Events field value
func (o *CoreCalendarGetCalendarEvents200Response) GetEvents() []CoreCalendarGetCalendarEvents200ResponseEventsInner {
	if o == nil {
		var ret []CoreCalendarGetCalendarEvents200ResponseEventsInner
		return ret
	}

	return o.Events
}

// GetEventsOk returns a tuple with the Events field value
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetCalendarEvents200Response) GetEventsOk() ([]CoreCalendarGetCalendarEvents200ResponseEventsInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Events, true
}

// SetEvents sets field value
func (o *CoreCalendarGetCalendarEvents200Response) SetEvents(v []CoreCalendarGetCalendarEvents200ResponseEventsInner) {
	o.Events = v
}

// GetWarnings returns the Warnings field value if set, zero value otherwise.
func (o *CoreCalendarGetCalendarEvents200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner {
	if o == nil || IsNil(o.Warnings) {
		var ret []AuthEmailSignupUser200ResponseWarningsInner
		return ret
	}
	return o.Warnings
}

// GetWarningsOk returns a tuple with the Warnings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetCalendarEvents200Response) GetWarningsOk() ([]AuthEmailSignupUser200ResponseWarningsInner, bool) {
	if o == nil || IsNil(o.Warnings) {
		return nil, false
	}
	return o.Warnings, true
}

// HasWarnings returns a boolean if a field has been set.
func (o *CoreCalendarGetCalendarEvents200Response) HasWarnings() bool {
	if o != nil && !IsNil(o.Warnings) {
		return true
	}

	return false
}

// SetWarnings gets a reference to the given []AuthEmailSignupUser200ResponseWarningsInner and assigns it to the Warnings field.
func (o *CoreCalendarGetCalendarEvents200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner) {
	o.Warnings = v
}

func (o CoreCalendarGetCalendarEvents200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreCalendarGetCalendarEvents200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["events"] = o.Events
	if !IsNil(o.Warnings) {
		toSerialize["warnings"] = o.Warnings
	}
	return toSerialize, nil
}

func (o *CoreCalendarGetCalendarEvents200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"events",
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

	varCoreCalendarGetCalendarEvents200Response := _CoreCalendarGetCalendarEvents200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreCalendarGetCalendarEvents200Response)

	if err != nil {
		return err
	}

	*o = CoreCalendarGetCalendarEvents200Response(varCoreCalendarGetCalendarEvents200Response)

	return err
}

type NullableCoreCalendarGetCalendarEvents200Response struct {
	value *CoreCalendarGetCalendarEvents200Response
	isSet bool
}

func (v NullableCoreCalendarGetCalendarEvents200Response) Get() *CoreCalendarGetCalendarEvents200Response {
	return v.value
}

func (v *NullableCoreCalendarGetCalendarEvents200Response) Set(val *CoreCalendarGetCalendarEvents200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreCalendarGetCalendarEvents200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreCalendarGetCalendarEvents200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreCalendarGetCalendarEvents200Response(val *CoreCalendarGetCalendarEvents200Response) *NullableCoreCalendarGetCalendarEvents200Response {
	return &NullableCoreCalendarGetCalendarEvents200Response{value: val, isSet: true}
}

func (v NullableCoreCalendarGetCalendarEvents200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreCalendarGetCalendarEvents200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


