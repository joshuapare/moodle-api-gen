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

// checks if the GradereportUserGetAccessInformation200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &GradereportUserGetAccessInformation200Response{}

// GradereportUserGetAccessInformation200Response struct for GradereportUserGetAccessInformation200Response
type GradereportUserGetAccessInformation200Response struct {
	// Whether the user can view all users grades in the course.
	Canviewallgrades bool `json:"canviewallgrades"`
	// Whether the user can view his grades in the course.
	Canviewmygrades bool `json:"canviewmygrades"`
	// Whether the user can view the user grade report.
	Canviewusergradereport bool `json:"canviewusergradereport"`
	Warnings []AuthEmailSignupUser200ResponseWarningsInner `json:"warnings,omitempty"`
}

type _GradereportUserGetAccessInformation200Response GradereportUserGetAccessInformation200Response

// NewGradereportUserGetAccessInformation200Response instantiates a new GradereportUserGetAccessInformation200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGradereportUserGetAccessInformation200Response(canviewallgrades bool, canviewmygrades bool, canviewusergradereport bool) *GradereportUserGetAccessInformation200Response {
	this := GradereportUserGetAccessInformation200Response{}
	this.Canviewallgrades = canviewallgrades
	this.Canviewmygrades = canviewmygrades
	this.Canviewusergradereport = canviewusergradereport
	return &this
}

// NewGradereportUserGetAccessInformation200ResponseWithDefaults instantiates a new GradereportUserGetAccessInformation200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGradereportUserGetAccessInformation200ResponseWithDefaults() *GradereportUserGetAccessInformation200Response {
	this := GradereportUserGetAccessInformation200Response{}
	var canviewallgrades bool = null
	this.Canviewallgrades = canviewallgrades
	var canviewmygrades bool = null
	this.Canviewmygrades = canviewmygrades
	var canviewusergradereport bool = null
	this.Canviewusergradereport = canviewusergradereport
	return &this
}

// GetCanviewallgrades returns the Canviewallgrades field value
func (o *GradereportUserGetAccessInformation200Response) GetCanviewallgrades() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Canviewallgrades
}

// GetCanviewallgradesOk returns a tuple with the Canviewallgrades field value
// and a boolean to check if the value has been set.
func (o *GradereportUserGetAccessInformation200Response) GetCanviewallgradesOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Canviewallgrades, true
}

// SetCanviewallgrades sets field value
func (o *GradereportUserGetAccessInformation200Response) SetCanviewallgrades(v bool) {
	o.Canviewallgrades = v
}

// GetCanviewmygrades returns the Canviewmygrades field value
func (o *GradereportUserGetAccessInformation200Response) GetCanviewmygrades() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Canviewmygrades
}

// GetCanviewmygradesOk returns a tuple with the Canviewmygrades field value
// and a boolean to check if the value has been set.
func (o *GradereportUserGetAccessInformation200Response) GetCanviewmygradesOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Canviewmygrades, true
}

// SetCanviewmygrades sets field value
func (o *GradereportUserGetAccessInformation200Response) SetCanviewmygrades(v bool) {
	o.Canviewmygrades = v
}

// GetCanviewusergradereport returns the Canviewusergradereport field value
func (o *GradereportUserGetAccessInformation200Response) GetCanviewusergradereport() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Canviewusergradereport
}

// GetCanviewusergradereportOk returns a tuple with the Canviewusergradereport field value
// and a boolean to check if the value has been set.
func (o *GradereportUserGetAccessInformation200Response) GetCanviewusergradereportOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Canviewusergradereport, true
}

// SetCanviewusergradereport sets field value
func (o *GradereportUserGetAccessInformation200Response) SetCanviewusergradereport(v bool) {
	o.Canviewusergradereport = v
}

// GetWarnings returns the Warnings field value if set, zero value otherwise.
func (o *GradereportUserGetAccessInformation200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner {
	if o == nil || IsNil(o.Warnings) {
		var ret []AuthEmailSignupUser200ResponseWarningsInner
		return ret
	}
	return o.Warnings
}

// GetWarningsOk returns a tuple with the Warnings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GradereportUserGetAccessInformation200Response) GetWarningsOk() ([]AuthEmailSignupUser200ResponseWarningsInner, bool) {
	if o == nil || IsNil(o.Warnings) {
		return nil, false
	}
	return o.Warnings, true
}

// HasWarnings returns a boolean if a field has been set.
func (o *GradereportUserGetAccessInformation200Response) HasWarnings() bool {
	if o != nil && !IsNil(o.Warnings) {
		return true
	}

	return false
}

// SetWarnings gets a reference to the given []AuthEmailSignupUser200ResponseWarningsInner and assigns it to the Warnings field.
func (o *GradereportUserGetAccessInformation200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner) {
	o.Warnings = v
}

func (o GradereportUserGetAccessInformation200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o GradereportUserGetAccessInformation200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["canviewallgrades"] = o.Canviewallgrades
	toSerialize["canviewmygrades"] = o.Canviewmygrades
	toSerialize["canviewusergradereport"] = o.Canviewusergradereport
	if !IsNil(o.Warnings) {
		toSerialize["warnings"] = o.Warnings
	}
	return toSerialize, nil
}

func (o *GradereportUserGetAccessInformation200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"canviewallgrades",
		"canviewmygrades",
		"canviewusergradereport",
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

	varGradereportUserGetAccessInformation200Response := _GradereportUserGetAccessInformation200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varGradereportUserGetAccessInformation200Response)

	if err != nil {
		return err
	}

	*o = GradereportUserGetAccessInformation200Response(varGradereportUserGetAccessInformation200Response)

	return err
}

type NullableGradereportUserGetAccessInformation200Response struct {
	value *GradereportUserGetAccessInformation200Response
	isSet bool
}

func (v NullableGradereportUserGetAccessInformation200Response) Get() *GradereportUserGetAccessInformation200Response {
	return v.value
}

func (v *NullableGradereportUserGetAccessInformation200Response) Set(val *GradereportUserGetAccessInformation200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableGradereportUserGetAccessInformation200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableGradereportUserGetAccessInformation200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGradereportUserGetAccessInformation200Response(val *GradereportUserGetAccessInformation200Response) *NullableGradereportUserGetAccessInformation200Response {
	return &NullableGradereportUserGetAccessInformation200Response{value: val, isSet: true}
}

func (v NullableGradereportUserGetAccessInformation200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGradereportUserGetAccessInformation200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


