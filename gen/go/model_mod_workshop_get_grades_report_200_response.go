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

// checks if the ModWorkshopGetGradesReport200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModWorkshopGetGradesReport200Response{}

// ModWorkshopGetGradesReport200Response struct for ModWorkshopGetGradesReport200Response
type ModWorkshopGetGradesReport200Response struct {
	Report ModWorkshopGetGradesReport200ResponseReport `json:"report"`
	Warnings []AuthEmailSignupUser200ResponseWarningsInner `json:"warnings,omitempty"`
}

type _ModWorkshopGetGradesReport200Response ModWorkshopGetGradesReport200Response

// NewModWorkshopGetGradesReport200Response instantiates a new ModWorkshopGetGradesReport200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModWorkshopGetGradesReport200Response(report ModWorkshopGetGradesReport200ResponseReport) *ModWorkshopGetGradesReport200Response {
	this := ModWorkshopGetGradesReport200Response{}
	this.Report = report
	return &this
}

// NewModWorkshopGetGradesReport200ResponseWithDefaults instantiates a new ModWorkshopGetGradesReport200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModWorkshopGetGradesReport200ResponseWithDefaults() *ModWorkshopGetGradesReport200Response {
	this := ModWorkshopGetGradesReport200Response{}
	return &this
}

// GetReport returns the Report field value
func (o *ModWorkshopGetGradesReport200Response) GetReport() ModWorkshopGetGradesReport200ResponseReport {
	if o == nil {
		var ret ModWorkshopGetGradesReport200ResponseReport
		return ret
	}

	return o.Report
}

// GetReportOk returns a tuple with the Report field value
// and a boolean to check if the value has been set.
func (o *ModWorkshopGetGradesReport200Response) GetReportOk() (*ModWorkshopGetGradesReport200ResponseReport, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Report, true
}

// SetReport sets field value
func (o *ModWorkshopGetGradesReport200Response) SetReport(v ModWorkshopGetGradesReport200ResponseReport) {
	o.Report = v
}

// GetWarnings returns the Warnings field value if set, zero value otherwise.
func (o *ModWorkshopGetGradesReport200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner {
	if o == nil || IsNil(o.Warnings) {
		var ret []AuthEmailSignupUser200ResponseWarningsInner
		return ret
	}
	return o.Warnings
}

// GetWarningsOk returns a tuple with the Warnings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModWorkshopGetGradesReport200Response) GetWarningsOk() ([]AuthEmailSignupUser200ResponseWarningsInner, bool) {
	if o == nil || IsNil(o.Warnings) {
		return nil, false
	}
	return o.Warnings, true
}

// HasWarnings returns a boolean if a field has been set.
func (o *ModWorkshopGetGradesReport200Response) HasWarnings() bool {
	if o != nil && !IsNil(o.Warnings) {
		return true
	}

	return false
}

// SetWarnings gets a reference to the given []AuthEmailSignupUser200ResponseWarningsInner and assigns it to the Warnings field.
func (o *ModWorkshopGetGradesReport200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner) {
	o.Warnings = v
}

func (o ModWorkshopGetGradesReport200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModWorkshopGetGradesReport200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["report"] = o.Report
	if !IsNil(o.Warnings) {
		toSerialize["warnings"] = o.Warnings
	}
	return toSerialize, nil
}

func (o *ModWorkshopGetGradesReport200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"report",
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

	varModWorkshopGetGradesReport200Response := _ModWorkshopGetGradesReport200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModWorkshopGetGradesReport200Response)

	if err != nil {
		return err
	}

	*o = ModWorkshopGetGradesReport200Response(varModWorkshopGetGradesReport200Response)

	return err
}

type NullableModWorkshopGetGradesReport200Response struct {
	value *ModWorkshopGetGradesReport200Response
	isSet bool
}

func (v NullableModWorkshopGetGradesReport200Response) Get() *ModWorkshopGetGradesReport200Response {
	return v.value
}

func (v *NullableModWorkshopGetGradesReport200Response) Set(val *ModWorkshopGetGradesReport200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableModWorkshopGetGradesReport200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableModWorkshopGetGradesReport200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModWorkshopGetGradesReport200Response(val *ModWorkshopGetGradesReport200Response) *NullableModWorkshopGetGradesReport200Response {
	return &NullableModWorkshopGetGradesReport200Response{value: val, isSet: true}
}

func (v NullableModWorkshopGetGradesReport200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModWorkshopGetGradesReport200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


