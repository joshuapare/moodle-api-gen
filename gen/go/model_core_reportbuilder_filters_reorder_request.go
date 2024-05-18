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

// checks if the CoreReportbuilderFiltersReorderRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreReportbuilderFiltersReorderRequest{}

// CoreReportbuilderFiltersReorderRequest struct for CoreReportbuilderFiltersReorderRequest
type CoreReportbuilderFiltersReorderRequest struct {
	// Filter ID
	Filterid int32 `json:"filterid"`
	// New filter position
	Position int32 `json:"position"`
	// Report ID
	Reportid int32 `json:"reportid"`
}

type _CoreReportbuilderFiltersReorderRequest CoreReportbuilderFiltersReorderRequest

// NewCoreReportbuilderFiltersReorderRequest instantiates a new CoreReportbuilderFiltersReorderRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreReportbuilderFiltersReorderRequest(filterid int32, position int32, reportid int32) *CoreReportbuilderFiltersReorderRequest {
	this := CoreReportbuilderFiltersReorderRequest{}
	this.Filterid = filterid
	this.Position = position
	this.Reportid = reportid
	return &this
}

// NewCoreReportbuilderFiltersReorderRequestWithDefaults instantiates a new CoreReportbuilderFiltersReorderRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreReportbuilderFiltersReorderRequestWithDefaults() *CoreReportbuilderFiltersReorderRequest {
	this := CoreReportbuilderFiltersReorderRequest{}
	var position int32 = null
	this.Position = position
	return &this
}

// GetFilterid returns the Filterid field value
func (o *CoreReportbuilderFiltersReorderRequest) GetFilterid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Filterid
}

// GetFilteridOk returns a tuple with the Filterid field value
// and a boolean to check if the value has been set.
func (o *CoreReportbuilderFiltersReorderRequest) GetFilteridOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Filterid, true
}

// SetFilterid sets field value
func (o *CoreReportbuilderFiltersReorderRequest) SetFilterid(v int32) {
	o.Filterid = v
}

// GetPosition returns the Position field value
func (o *CoreReportbuilderFiltersReorderRequest) GetPosition() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Position
}

// GetPositionOk returns a tuple with the Position field value
// and a boolean to check if the value has been set.
func (o *CoreReportbuilderFiltersReorderRequest) GetPositionOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Position, true
}

// SetPosition sets field value
func (o *CoreReportbuilderFiltersReorderRequest) SetPosition(v int32) {
	o.Position = v
}

// GetReportid returns the Reportid field value
func (o *CoreReportbuilderFiltersReorderRequest) GetReportid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Reportid
}

// GetReportidOk returns a tuple with the Reportid field value
// and a boolean to check if the value has been set.
func (o *CoreReportbuilderFiltersReorderRequest) GetReportidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Reportid, true
}

// SetReportid sets field value
func (o *CoreReportbuilderFiltersReorderRequest) SetReportid(v int32) {
	o.Reportid = v
}

func (o CoreReportbuilderFiltersReorderRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreReportbuilderFiltersReorderRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["filterid"] = o.Filterid
	toSerialize["position"] = o.Position
	toSerialize["reportid"] = o.Reportid
	return toSerialize, nil
}

func (o *CoreReportbuilderFiltersReorderRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"filterid",
		"position",
		"reportid",
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

	varCoreReportbuilderFiltersReorderRequest := _CoreReportbuilderFiltersReorderRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreReportbuilderFiltersReorderRequest)

	if err != nil {
		return err
	}

	*o = CoreReportbuilderFiltersReorderRequest(varCoreReportbuilderFiltersReorderRequest)

	return err
}

type NullableCoreReportbuilderFiltersReorderRequest struct {
	value *CoreReportbuilderFiltersReorderRequest
	isSet bool
}

func (v NullableCoreReportbuilderFiltersReorderRequest) Get() *CoreReportbuilderFiltersReorderRequest {
	return v.value
}

func (v *NullableCoreReportbuilderFiltersReorderRequest) Set(val *CoreReportbuilderFiltersReorderRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreReportbuilderFiltersReorderRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreReportbuilderFiltersReorderRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreReportbuilderFiltersReorderRequest(val *CoreReportbuilderFiltersReorderRequest) *NullableCoreReportbuilderFiltersReorderRequest {
	return &NullableCoreReportbuilderFiltersReorderRequest{value: val, isSet: true}
}

func (v NullableCoreReportbuilderFiltersReorderRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreReportbuilderFiltersReorderRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

