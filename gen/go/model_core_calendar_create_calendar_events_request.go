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

// checks if the CoreCalendarCreateCalendarEventsRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreCalendarCreateCalendarEventsRequest{}

// CoreCalendarCreateCalendarEventsRequest struct for CoreCalendarCreateCalendarEventsRequest
type CoreCalendarCreateCalendarEventsRequest struct {
	Events []CoreCalendarCreateCalendarEventsRequestEventsInner `json:"events"`
}

type _CoreCalendarCreateCalendarEventsRequest CoreCalendarCreateCalendarEventsRequest

// NewCoreCalendarCreateCalendarEventsRequest instantiates a new CoreCalendarCreateCalendarEventsRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreCalendarCreateCalendarEventsRequest(events []CoreCalendarCreateCalendarEventsRequestEventsInner) *CoreCalendarCreateCalendarEventsRequest {
	this := CoreCalendarCreateCalendarEventsRequest{}
	this.Events = events
	return &this
}

// NewCoreCalendarCreateCalendarEventsRequestWithDefaults instantiates a new CoreCalendarCreateCalendarEventsRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreCalendarCreateCalendarEventsRequestWithDefaults() *CoreCalendarCreateCalendarEventsRequest {
	this := CoreCalendarCreateCalendarEventsRequest{}
	return &this
}

// GetEvents returns the Events field value
func (o *CoreCalendarCreateCalendarEventsRequest) GetEvents() []CoreCalendarCreateCalendarEventsRequestEventsInner {
	if o == nil {
		var ret []CoreCalendarCreateCalendarEventsRequestEventsInner
		return ret
	}

	return o.Events
}

// GetEventsOk returns a tuple with the Events field value
// and a boolean to check if the value has been set.
func (o *CoreCalendarCreateCalendarEventsRequest) GetEventsOk() ([]CoreCalendarCreateCalendarEventsRequestEventsInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Events, true
}

// SetEvents sets field value
func (o *CoreCalendarCreateCalendarEventsRequest) SetEvents(v []CoreCalendarCreateCalendarEventsRequestEventsInner) {
	o.Events = v
}

func (o CoreCalendarCreateCalendarEventsRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreCalendarCreateCalendarEventsRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["events"] = o.Events
	return toSerialize, nil
}

func (o *CoreCalendarCreateCalendarEventsRequest) UnmarshalJSON(data []byte) (err error) {
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

	varCoreCalendarCreateCalendarEventsRequest := _CoreCalendarCreateCalendarEventsRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreCalendarCreateCalendarEventsRequest)

	if err != nil {
		return err
	}

	*o = CoreCalendarCreateCalendarEventsRequest(varCoreCalendarCreateCalendarEventsRequest)

	return err
}

type NullableCoreCalendarCreateCalendarEventsRequest struct {
	value *CoreCalendarCreateCalendarEventsRequest
	isSet bool
}

func (v NullableCoreCalendarCreateCalendarEventsRequest) Get() *CoreCalendarCreateCalendarEventsRequest {
	return v.value
}

func (v *NullableCoreCalendarCreateCalendarEventsRequest) Set(val *CoreCalendarCreateCalendarEventsRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreCalendarCreateCalendarEventsRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreCalendarCreateCalendarEventsRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreCalendarCreateCalendarEventsRequest(val *CoreCalendarCreateCalendarEventsRequest) *NullableCoreCalendarCreateCalendarEventsRequest {
	return &NullableCoreCalendarCreateCalendarEventsRequest{value: val, isSet: true}
}

func (v NullableCoreCalendarCreateCalendarEventsRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreCalendarCreateCalendarEventsRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


