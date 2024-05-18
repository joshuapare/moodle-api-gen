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

// checks if the BlockIomadCompanyAdminGetDepartments200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &BlockIomadCompanyAdminGetDepartments200Response{}

// BlockIomadCompanyAdminGetDepartments200Response struct for BlockIomadCompanyAdminGetDepartments200Response
type BlockIomadCompanyAdminGetDepartments200Response struct {
	Departments []BlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner `json:"departments"`
	Warnings []BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner `json:"warnings,omitempty"`
}

type _BlockIomadCompanyAdminGetDepartments200Response BlockIomadCompanyAdminGetDepartments200Response

// NewBlockIomadCompanyAdminGetDepartments200Response instantiates a new BlockIomadCompanyAdminGetDepartments200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBlockIomadCompanyAdminGetDepartments200Response(departments []BlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner) *BlockIomadCompanyAdminGetDepartments200Response {
	this := BlockIomadCompanyAdminGetDepartments200Response{}
	this.Departments = departments
	return &this
}

// NewBlockIomadCompanyAdminGetDepartments200ResponseWithDefaults instantiates a new BlockIomadCompanyAdminGetDepartments200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBlockIomadCompanyAdminGetDepartments200ResponseWithDefaults() *BlockIomadCompanyAdminGetDepartments200Response {
	this := BlockIomadCompanyAdminGetDepartments200Response{}
	return &this
}

// GetDepartments returns the Departments field value
func (o *BlockIomadCompanyAdminGetDepartments200Response) GetDepartments() []BlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner {
	if o == nil {
		var ret []BlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner
		return ret
	}

	return o.Departments
}

// GetDepartmentsOk returns a tuple with the Departments field value
// and a boolean to check if the value has been set.
func (o *BlockIomadCompanyAdminGetDepartments200Response) GetDepartmentsOk() ([]BlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Departments, true
}

// SetDepartments sets field value
func (o *BlockIomadCompanyAdminGetDepartments200Response) SetDepartments(v []BlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner) {
	o.Departments = v
}

// GetWarnings returns the Warnings field value if set, zero value otherwise.
func (o *BlockIomadCompanyAdminGetDepartments200Response) GetWarnings() []BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner {
	if o == nil || IsNil(o.Warnings) {
		var ret []BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner
		return ret
	}
	return o.Warnings
}

// GetWarningsOk returns a tuple with the Warnings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BlockIomadCompanyAdminGetDepartments200Response) GetWarningsOk() ([]BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner, bool) {
	if o == nil || IsNil(o.Warnings) {
		return nil, false
	}
	return o.Warnings, true
}

// HasWarnings returns a boolean if a field has been set.
func (o *BlockIomadCompanyAdminGetDepartments200Response) HasWarnings() bool {
	if o != nil && !IsNil(o.Warnings) {
		return true
	}

	return false
}

// SetWarnings gets a reference to the given []BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner and assigns it to the Warnings field.
func (o *BlockIomadCompanyAdminGetDepartments200Response) SetWarnings(v []BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner) {
	o.Warnings = v
}

func (o BlockIomadCompanyAdminGetDepartments200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o BlockIomadCompanyAdminGetDepartments200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["departments"] = o.Departments
	if !IsNil(o.Warnings) {
		toSerialize["warnings"] = o.Warnings
	}
	return toSerialize, nil
}

func (o *BlockIomadCompanyAdminGetDepartments200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"departments",
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

	varBlockIomadCompanyAdminGetDepartments200Response := _BlockIomadCompanyAdminGetDepartments200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varBlockIomadCompanyAdminGetDepartments200Response)

	if err != nil {
		return err
	}

	*o = BlockIomadCompanyAdminGetDepartments200Response(varBlockIomadCompanyAdminGetDepartments200Response)

	return err
}

type NullableBlockIomadCompanyAdminGetDepartments200Response struct {
	value *BlockIomadCompanyAdminGetDepartments200Response
	isSet bool
}

func (v NullableBlockIomadCompanyAdminGetDepartments200Response) Get() *BlockIomadCompanyAdminGetDepartments200Response {
	return v.value
}

func (v *NullableBlockIomadCompanyAdminGetDepartments200Response) Set(val *BlockIomadCompanyAdminGetDepartments200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableBlockIomadCompanyAdminGetDepartments200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableBlockIomadCompanyAdminGetDepartments200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBlockIomadCompanyAdminGetDepartments200Response(val *BlockIomadCompanyAdminGetDepartments200Response) *NullableBlockIomadCompanyAdminGetDepartments200Response {
	return &NullableBlockIomadCompanyAdminGetDepartments200Response{value: val, isSet: true}
}

func (v NullableBlockIomadCompanyAdminGetDepartments200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBlockIomadCompanyAdminGetDepartments200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

