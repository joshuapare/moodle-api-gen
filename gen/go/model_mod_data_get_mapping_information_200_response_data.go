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

// checks if the ModDataGetMappingInformation200ResponseData type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModDataGetMappingInformation200ResponseData{}

// ModDataGetMappingInformation200ResponseData struct for ModDataGetMappingInformation200ResponseData
type ModDataGetMappingInformation200ResponseData struct {
	// List of field names to create
	Fieldstocreate string `json:"fieldstocreate"`
	// List of field names to remove
	Fieldstoremove string `json:"fieldstoremove"`
	// Whether the importing needs mapping or not
	Needsmapping bool `json:"needsmapping"`
	// Name of the applied preset
	Presetname string `json:"presetname"`
}

type _ModDataGetMappingInformation200ResponseData ModDataGetMappingInformation200ResponseData

// NewModDataGetMappingInformation200ResponseData instantiates a new ModDataGetMappingInformation200ResponseData object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModDataGetMappingInformation200ResponseData(fieldstocreate string, fieldstoremove string, needsmapping bool, presetname string) *ModDataGetMappingInformation200ResponseData {
	this := ModDataGetMappingInformation200ResponseData{}
	this.Fieldstocreate = fieldstocreate
	this.Fieldstoremove = fieldstoremove
	this.Needsmapping = needsmapping
	this.Presetname = presetname
	return &this
}

// NewModDataGetMappingInformation200ResponseDataWithDefaults instantiates a new ModDataGetMappingInformation200ResponseData object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModDataGetMappingInformation200ResponseDataWithDefaults() *ModDataGetMappingInformation200ResponseData {
	this := ModDataGetMappingInformation200ResponseData{}
	var fieldstocreate string = "null"
	this.Fieldstocreate = fieldstocreate
	var fieldstoremove string = "null"
	this.Fieldstoremove = fieldstoremove
	var needsmapping bool = null
	this.Needsmapping = needsmapping
	var presetname string = "null"
	this.Presetname = presetname
	return &this
}

// GetFieldstocreate returns the Fieldstocreate field value
func (o *ModDataGetMappingInformation200ResponseData) GetFieldstocreate() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Fieldstocreate
}

// GetFieldstocreateOk returns a tuple with the Fieldstocreate field value
// and a boolean to check if the value has been set.
func (o *ModDataGetMappingInformation200ResponseData) GetFieldstocreateOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Fieldstocreate, true
}

// SetFieldstocreate sets field value
func (o *ModDataGetMappingInformation200ResponseData) SetFieldstocreate(v string) {
	o.Fieldstocreate = v
}

// GetFieldstoremove returns the Fieldstoremove field value
func (o *ModDataGetMappingInformation200ResponseData) GetFieldstoremove() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Fieldstoremove
}

// GetFieldstoremoveOk returns a tuple with the Fieldstoremove field value
// and a boolean to check if the value has been set.
func (o *ModDataGetMappingInformation200ResponseData) GetFieldstoremoveOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Fieldstoremove, true
}

// SetFieldstoremove sets field value
func (o *ModDataGetMappingInformation200ResponseData) SetFieldstoremove(v string) {
	o.Fieldstoremove = v
}

// GetNeedsmapping returns the Needsmapping field value
func (o *ModDataGetMappingInformation200ResponseData) GetNeedsmapping() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Needsmapping
}

// GetNeedsmappingOk returns a tuple with the Needsmapping field value
// and a boolean to check if the value has been set.
func (o *ModDataGetMappingInformation200ResponseData) GetNeedsmappingOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Needsmapping, true
}

// SetNeedsmapping sets field value
func (o *ModDataGetMappingInformation200ResponseData) SetNeedsmapping(v bool) {
	o.Needsmapping = v
}

// GetPresetname returns the Presetname field value
func (o *ModDataGetMappingInformation200ResponseData) GetPresetname() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Presetname
}

// GetPresetnameOk returns a tuple with the Presetname field value
// and a boolean to check if the value has been set.
func (o *ModDataGetMappingInformation200ResponseData) GetPresetnameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Presetname, true
}

// SetPresetname sets field value
func (o *ModDataGetMappingInformation200ResponseData) SetPresetname(v string) {
	o.Presetname = v
}

func (o ModDataGetMappingInformation200ResponseData) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModDataGetMappingInformation200ResponseData) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["fieldstocreate"] = o.Fieldstocreate
	toSerialize["fieldstoremove"] = o.Fieldstoremove
	toSerialize["needsmapping"] = o.Needsmapping
	toSerialize["presetname"] = o.Presetname
	return toSerialize, nil
}

func (o *ModDataGetMappingInformation200ResponseData) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"fieldstocreate",
		"fieldstoremove",
		"needsmapping",
		"presetname",
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

	varModDataGetMappingInformation200ResponseData := _ModDataGetMappingInformation200ResponseData{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModDataGetMappingInformation200ResponseData)

	if err != nil {
		return err
	}

	*o = ModDataGetMappingInformation200ResponseData(varModDataGetMappingInformation200ResponseData)

	return err
}

type NullableModDataGetMappingInformation200ResponseData struct {
	value *ModDataGetMappingInformation200ResponseData
	isSet bool
}

func (v NullableModDataGetMappingInformation200ResponseData) Get() *ModDataGetMappingInformation200ResponseData {
	return v.value
}

func (v *NullableModDataGetMappingInformation200ResponseData) Set(val *ModDataGetMappingInformation200ResponseData) {
	v.value = val
	v.isSet = true
}

func (v NullableModDataGetMappingInformation200ResponseData) IsSet() bool {
	return v.isSet
}

func (v *NullableModDataGetMappingInformation200ResponseData) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModDataGetMappingInformation200ResponseData(val *ModDataGetMappingInformation200ResponseData) *NullableModDataGetMappingInformation200ResponseData {
	return &NullableModDataGetMappingInformation200ResponseData{value: val, isSet: true}
}

func (v NullableModDataGetMappingInformation200ResponseData) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModDataGetMappingInformation200ResponseData) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


