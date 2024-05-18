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

// checks if the CoreCalendarGetTimestamps200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreCalendarGetTimestamps200Response{}

// CoreCalendarGetTimestamps200Response struct for CoreCalendarGetTimestamps200Response
type CoreCalendarGetTimestamps200Response struct {
	Timestamps []CoreCalendarGetTimestamps200ResponseTimestampsInner `json:"timestamps"`
}

type _CoreCalendarGetTimestamps200Response CoreCalendarGetTimestamps200Response

// NewCoreCalendarGetTimestamps200Response instantiates a new CoreCalendarGetTimestamps200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreCalendarGetTimestamps200Response(timestamps []CoreCalendarGetTimestamps200ResponseTimestampsInner) *CoreCalendarGetTimestamps200Response {
	this := CoreCalendarGetTimestamps200Response{}
	this.Timestamps = timestamps
	return &this
}

// NewCoreCalendarGetTimestamps200ResponseWithDefaults instantiates a new CoreCalendarGetTimestamps200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreCalendarGetTimestamps200ResponseWithDefaults() *CoreCalendarGetTimestamps200Response {
	this := CoreCalendarGetTimestamps200Response{}
	return &this
}

// GetTimestamps returns the Timestamps field value
func (o *CoreCalendarGetTimestamps200Response) GetTimestamps() []CoreCalendarGetTimestamps200ResponseTimestampsInner {
	if o == nil {
		var ret []CoreCalendarGetTimestamps200ResponseTimestampsInner
		return ret
	}

	return o.Timestamps
}

// GetTimestampsOk returns a tuple with the Timestamps field value
// and a boolean to check if the value has been set.
func (o *CoreCalendarGetTimestamps200Response) GetTimestampsOk() ([]CoreCalendarGetTimestamps200ResponseTimestampsInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Timestamps, true
}

// SetTimestamps sets field value
func (o *CoreCalendarGetTimestamps200Response) SetTimestamps(v []CoreCalendarGetTimestamps200ResponseTimestampsInner) {
	o.Timestamps = v
}

func (o CoreCalendarGetTimestamps200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreCalendarGetTimestamps200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["timestamps"] = o.Timestamps
	return toSerialize, nil
}

func (o *CoreCalendarGetTimestamps200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"timestamps",
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

	varCoreCalendarGetTimestamps200Response := _CoreCalendarGetTimestamps200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreCalendarGetTimestamps200Response)

	if err != nil {
		return err
	}

	*o = CoreCalendarGetTimestamps200Response(varCoreCalendarGetTimestamps200Response)

	return err
}

type NullableCoreCalendarGetTimestamps200Response struct {
	value *CoreCalendarGetTimestamps200Response
	isSet bool
}

func (v NullableCoreCalendarGetTimestamps200Response) Get() *CoreCalendarGetTimestamps200Response {
	return v.value
}

func (v *NullableCoreCalendarGetTimestamps200Response) Set(val *CoreCalendarGetTimestamps200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreCalendarGetTimestamps200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreCalendarGetTimestamps200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreCalendarGetTimestamps200Response(val *CoreCalendarGetTimestamps200Response) *NullableCoreCalendarGetTimestamps200Response {
	return &NullableCoreCalendarGetTimestamps200Response{value: val, isSet: true}
}

func (v NullableCoreCalendarGetTimestamps200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreCalendarGetTimestamps200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

