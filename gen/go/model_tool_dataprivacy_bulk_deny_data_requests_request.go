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

// checks if the ToolDataprivacyBulkDenyDataRequestsRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ToolDataprivacyBulkDenyDataRequestsRequest{}

// ToolDataprivacyBulkDenyDataRequestsRequest struct for ToolDataprivacyBulkDenyDataRequestsRequest
type ToolDataprivacyBulkDenyDataRequestsRequest struct {
	Requestids []map[string]interface{} `json:"requestids"`
}

type _ToolDataprivacyBulkDenyDataRequestsRequest ToolDataprivacyBulkDenyDataRequestsRequest

// NewToolDataprivacyBulkDenyDataRequestsRequest instantiates a new ToolDataprivacyBulkDenyDataRequestsRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewToolDataprivacyBulkDenyDataRequestsRequest(requestids []map[string]interface{}) *ToolDataprivacyBulkDenyDataRequestsRequest {
	this := ToolDataprivacyBulkDenyDataRequestsRequest{}
	this.Requestids = requestids
	return &this
}

// NewToolDataprivacyBulkDenyDataRequestsRequestWithDefaults instantiates a new ToolDataprivacyBulkDenyDataRequestsRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewToolDataprivacyBulkDenyDataRequestsRequestWithDefaults() *ToolDataprivacyBulkDenyDataRequestsRequest {
	this := ToolDataprivacyBulkDenyDataRequestsRequest{}
	return &this
}

// GetRequestids returns the Requestids field value
func (o *ToolDataprivacyBulkDenyDataRequestsRequest) GetRequestids() []map[string]interface{} {
	if o == nil {
		var ret []map[string]interface{}
		return ret
	}

	return o.Requestids
}

// GetRequestidsOk returns a tuple with the Requestids field value
// and a boolean to check if the value has been set.
func (o *ToolDataprivacyBulkDenyDataRequestsRequest) GetRequestidsOk() ([]map[string]interface{}, bool) {
	if o == nil {
		return nil, false
	}
	return o.Requestids, true
}

// SetRequestids sets field value
func (o *ToolDataprivacyBulkDenyDataRequestsRequest) SetRequestids(v []map[string]interface{}) {
	o.Requestids = v
}

func (o ToolDataprivacyBulkDenyDataRequestsRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ToolDataprivacyBulkDenyDataRequestsRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["requestids"] = o.Requestids
	return toSerialize, nil
}

func (o *ToolDataprivacyBulkDenyDataRequestsRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"requestids",
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

	varToolDataprivacyBulkDenyDataRequestsRequest := _ToolDataprivacyBulkDenyDataRequestsRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varToolDataprivacyBulkDenyDataRequestsRequest)

	if err != nil {
		return err
	}

	*o = ToolDataprivacyBulkDenyDataRequestsRequest(varToolDataprivacyBulkDenyDataRequestsRequest)

	return err
}

type NullableToolDataprivacyBulkDenyDataRequestsRequest struct {
	value *ToolDataprivacyBulkDenyDataRequestsRequest
	isSet bool
}

func (v NullableToolDataprivacyBulkDenyDataRequestsRequest) Get() *ToolDataprivacyBulkDenyDataRequestsRequest {
	return v.value
}

func (v *NullableToolDataprivacyBulkDenyDataRequestsRequest) Set(val *ToolDataprivacyBulkDenyDataRequestsRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableToolDataprivacyBulkDenyDataRequestsRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableToolDataprivacyBulkDenyDataRequestsRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableToolDataprivacyBulkDenyDataRequestsRequest(val *ToolDataprivacyBulkDenyDataRequestsRequest) *NullableToolDataprivacyBulkDenyDataRequestsRequest {
	return &NullableToolDataprivacyBulkDenyDataRequestsRequest{value: val, isSet: true}
}

func (v NullableToolDataprivacyBulkDenyDataRequestsRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableToolDataprivacyBulkDenyDataRequestsRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


