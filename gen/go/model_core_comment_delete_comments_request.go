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

// checks if the CoreCommentDeleteCommentsRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreCommentDeleteCommentsRequest{}

// CoreCommentDeleteCommentsRequest struct for CoreCommentDeleteCommentsRequest
type CoreCommentDeleteCommentsRequest struct {
	Comments []map[string]interface{} `json:"comments"`
}

type _CoreCommentDeleteCommentsRequest CoreCommentDeleteCommentsRequest

// NewCoreCommentDeleteCommentsRequest instantiates a new CoreCommentDeleteCommentsRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreCommentDeleteCommentsRequest(comments []map[string]interface{}) *CoreCommentDeleteCommentsRequest {
	this := CoreCommentDeleteCommentsRequest{}
	this.Comments = comments
	return &this
}

// NewCoreCommentDeleteCommentsRequestWithDefaults instantiates a new CoreCommentDeleteCommentsRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreCommentDeleteCommentsRequestWithDefaults() *CoreCommentDeleteCommentsRequest {
	this := CoreCommentDeleteCommentsRequest{}
	return &this
}

// GetComments returns the Comments field value
func (o *CoreCommentDeleteCommentsRequest) GetComments() []map[string]interface{} {
	if o == nil {
		var ret []map[string]interface{}
		return ret
	}

	return o.Comments
}

// GetCommentsOk returns a tuple with the Comments field value
// and a boolean to check if the value has been set.
func (o *CoreCommentDeleteCommentsRequest) GetCommentsOk() ([]map[string]interface{}, bool) {
	if o == nil {
		return nil, false
	}
	return o.Comments, true
}

// SetComments sets field value
func (o *CoreCommentDeleteCommentsRequest) SetComments(v []map[string]interface{}) {
	o.Comments = v
}

func (o CoreCommentDeleteCommentsRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreCommentDeleteCommentsRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["comments"] = o.Comments
	return toSerialize, nil
}

func (o *CoreCommentDeleteCommentsRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"comments",
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

	varCoreCommentDeleteCommentsRequest := _CoreCommentDeleteCommentsRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreCommentDeleteCommentsRequest)

	if err != nil {
		return err
	}

	*o = CoreCommentDeleteCommentsRequest(varCoreCommentDeleteCommentsRequest)

	return err
}

type NullableCoreCommentDeleteCommentsRequest struct {
	value *CoreCommentDeleteCommentsRequest
	isSet bool
}

func (v NullableCoreCommentDeleteCommentsRequest) Get() *CoreCommentDeleteCommentsRequest {
	return v.value
}

func (v *NullableCoreCommentDeleteCommentsRequest) Set(val *CoreCommentDeleteCommentsRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreCommentDeleteCommentsRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreCommentDeleteCommentsRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreCommentDeleteCommentsRequest(val *CoreCommentDeleteCommentsRequest) *NullableCoreCommentDeleteCommentsRequest {
	return &NullableCoreCommentDeleteCommentsRequest{value: val, isSet: true}
}

func (v NullableCoreCommentDeleteCommentsRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreCommentDeleteCommentsRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


