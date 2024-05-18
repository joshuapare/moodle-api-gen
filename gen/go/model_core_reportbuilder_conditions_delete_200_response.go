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

// checks if the CoreReportbuilderConditionsDelete200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreReportbuilderConditionsDelete200Response{}

// CoreReportbuilderConditionsDelete200Response struct for CoreReportbuilderConditionsDelete200Response
type CoreReportbuilderConditionsDelete200Response struct {
	// activeconditionsform
	Activeconditionsform string `json:"activeconditionsform"`
	Availableconditions []CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner `json:"availableconditions"`
	// hasactiveconditions
	Hasactiveconditions bool `json:"hasactiveconditions"`
	// hasavailableconditions
	Hasavailableconditions bool `json:"hasavailableconditions"`
	// helpicon
	Helpicon string `json:"helpicon"`
	// javascript
	Javascript *string `json:"javascript,omitempty"`
}

type _CoreReportbuilderConditionsDelete200Response CoreReportbuilderConditionsDelete200Response

// NewCoreReportbuilderConditionsDelete200Response instantiates a new CoreReportbuilderConditionsDelete200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreReportbuilderConditionsDelete200Response(activeconditionsform string, availableconditions []CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner, hasactiveconditions bool, hasavailableconditions bool, helpicon string) *CoreReportbuilderConditionsDelete200Response {
	this := CoreReportbuilderConditionsDelete200Response{}
	this.Activeconditionsform = activeconditionsform
	this.Availableconditions = availableconditions
	this.Hasactiveconditions = hasactiveconditions
	this.Hasavailableconditions = hasavailableconditions
	this.Helpicon = helpicon
	return &this
}

// NewCoreReportbuilderConditionsDelete200ResponseWithDefaults instantiates a new CoreReportbuilderConditionsDelete200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreReportbuilderConditionsDelete200ResponseWithDefaults() *CoreReportbuilderConditionsDelete200Response {
	this := CoreReportbuilderConditionsDelete200Response{}
	return &this
}

// GetActiveconditionsform returns the Activeconditionsform field value
func (o *CoreReportbuilderConditionsDelete200Response) GetActiveconditionsform() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Activeconditionsform
}

// GetActiveconditionsformOk returns a tuple with the Activeconditionsform field value
// and a boolean to check if the value has been set.
func (o *CoreReportbuilderConditionsDelete200Response) GetActiveconditionsformOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Activeconditionsform, true
}

// SetActiveconditionsform sets field value
func (o *CoreReportbuilderConditionsDelete200Response) SetActiveconditionsform(v string) {
	o.Activeconditionsform = v
}

// GetAvailableconditions returns the Availableconditions field value
func (o *CoreReportbuilderConditionsDelete200Response) GetAvailableconditions() []CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner {
	if o == nil {
		var ret []CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner
		return ret
	}

	return o.Availableconditions
}

// GetAvailableconditionsOk returns a tuple with the Availableconditions field value
// and a boolean to check if the value has been set.
func (o *CoreReportbuilderConditionsDelete200Response) GetAvailableconditionsOk() ([]CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Availableconditions, true
}

// SetAvailableconditions sets field value
func (o *CoreReportbuilderConditionsDelete200Response) SetAvailableconditions(v []CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner) {
	o.Availableconditions = v
}

// GetHasactiveconditions returns the Hasactiveconditions field value
func (o *CoreReportbuilderConditionsDelete200Response) GetHasactiveconditions() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Hasactiveconditions
}

// GetHasactiveconditionsOk returns a tuple with the Hasactiveconditions field value
// and a boolean to check if the value has been set.
func (o *CoreReportbuilderConditionsDelete200Response) GetHasactiveconditionsOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Hasactiveconditions, true
}

// SetHasactiveconditions sets field value
func (o *CoreReportbuilderConditionsDelete200Response) SetHasactiveconditions(v bool) {
	o.Hasactiveconditions = v
}

// GetHasavailableconditions returns the Hasavailableconditions field value
func (o *CoreReportbuilderConditionsDelete200Response) GetHasavailableconditions() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Hasavailableconditions
}

// GetHasavailableconditionsOk returns a tuple with the Hasavailableconditions field value
// and a boolean to check if the value has been set.
func (o *CoreReportbuilderConditionsDelete200Response) GetHasavailableconditionsOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Hasavailableconditions, true
}

// SetHasavailableconditions sets field value
func (o *CoreReportbuilderConditionsDelete200Response) SetHasavailableconditions(v bool) {
	o.Hasavailableconditions = v
}

// GetHelpicon returns the Helpicon field value
func (o *CoreReportbuilderConditionsDelete200Response) GetHelpicon() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Helpicon
}

// GetHelpiconOk returns a tuple with the Helpicon field value
// and a boolean to check if the value has been set.
func (o *CoreReportbuilderConditionsDelete200Response) GetHelpiconOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Helpicon, true
}

// SetHelpicon sets field value
func (o *CoreReportbuilderConditionsDelete200Response) SetHelpicon(v string) {
	o.Helpicon = v
}

// GetJavascript returns the Javascript field value if set, zero value otherwise.
func (o *CoreReportbuilderConditionsDelete200Response) GetJavascript() string {
	if o == nil || IsNil(o.Javascript) {
		var ret string
		return ret
	}
	return *o.Javascript
}

// GetJavascriptOk returns a tuple with the Javascript field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreReportbuilderConditionsDelete200Response) GetJavascriptOk() (*string, bool) {
	if o == nil || IsNil(o.Javascript) {
		return nil, false
	}
	return o.Javascript, true
}

// HasJavascript returns a boolean if a field has been set.
func (o *CoreReportbuilderConditionsDelete200Response) HasJavascript() bool {
	if o != nil && !IsNil(o.Javascript) {
		return true
	}

	return false
}

// SetJavascript gets a reference to the given string and assigns it to the Javascript field.
func (o *CoreReportbuilderConditionsDelete200Response) SetJavascript(v string) {
	o.Javascript = &v
}

func (o CoreReportbuilderConditionsDelete200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreReportbuilderConditionsDelete200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["activeconditionsform"] = o.Activeconditionsform
	toSerialize["availableconditions"] = o.Availableconditions
	toSerialize["hasactiveconditions"] = o.Hasactiveconditions
	toSerialize["hasavailableconditions"] = o.Hasavailableconditions
	toSerialize["helpicon"] = o.Helpicon
	if !IsNil(o.Javascript) {
		toSerialize["javascript"] = o.Javascript
	}
	return toSerialize, nil
}

func (o *CoreReportbuilderConditionsDelete200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"activeconditionsform",
		"availableconditions",
		"hasactiveconditions",
		"hasavailableconditions",
		"helpicon",
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

	varCoreReportbuilderConditionsDelete200Response := _CoreReportbuilderConditionsDelete200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreReportbuilderConditionsDelete200Response)

	if err != nil {
		return err
	}

	*o = CoreReportbuilderConditionsDelete200Response(varCoreReportbuilderConditionsDelete200Response)

	return err
}

type NullableCoreReportbuilderConditionsDelete200Response struct {
	value *CoreReportbuilderConditionsDelete200Response
	isSet bool
}

func (v NullableCoreReportbuilderConditionsDelete200Response) Get() *CoreReportbuilderConditionsDelete200Response {
	return v.value
}

func (v *NullableCoreReportbuilderConditionsDelete200Response) Set(val *CoreReportbuilderConditionsDelete200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreReportbuilderConditionsDelete200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreReportbuilderConditionsDelete200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreReportbuilderConditionsDelete200Response(val *CoreReportbuilderConditionsDelete200Response) *NullableCoreReportbuilderConditionsDelete200Response {
	return &NullableCoreReportbuilderConditionsDelete200Response{value: val, isSet: true}
}

func (v NullableCoreReportbuilderConditionsDelete200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreReportbuilderConditionsDelete200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

