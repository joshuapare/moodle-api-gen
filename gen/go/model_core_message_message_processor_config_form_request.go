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

// checks if the CoreMessageMessageProcessorConfigFormRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreMessageMessageProcessorConfigFormRequest{}

// CoreMessageMessageProcessorConfigFormRequest struct for CoreMessageMessageProcessorConfigFormRequest
type CoreMessageMessageProcessorConfigFormRequest struct {
	Formvalues []CoreMessageMessageProcessorConfigFormRequestFormvaluesInner `json:"formvalues"`
	// The name of the message processor
	Name string `json:"name"`
	// id of the user, 0 for current user
	Userid int32 `json:"userid"`
}

type _CoreMessageMessageProcessorConfigFormRequest CoreMessageMessageProcessorConfigFormRequest

// NewCoreMessageMessageProcessorConfigFormRequest instantiates a new CoreMessageMessageProcessorConfigFormRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreMessageMessageProcessorConfigFormRequest(formvalues []CoreMessageMessageProcessorConfigFormRequestFormvaluesInner, name string, userid int32) *CoreMessageMessageProcessorConfigFormRequest {
	this := CoreMessageMessageProcessorConfigFormRequest{}
	this.Formvalues = formvalues
	this.Name = name
	this.Userid = userid
	return &this
}

// NewCoreMessageMessageProcessorConfigFormRequestWithDefaults instantiates a new CoreMessageMessageProcessorConfigFormRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreMessageMessageProcessorConfigFormRequestWithDefaults() *CoreMessageMessageProcessorConfigFormRequest {
	this := CoreMessageMessageProcessorConfigFormRequest{}
	return &this
}

// GetFormvalues returns the Formvalues field value
func (o *CoreMessageMessageProcessorConfigFormRequest) GetFormvalues() []CoreMessageMessageProcessorConfigFormRequestFormvaluesInner {
	if o == nil {
		var ret []CoreMessageMessageProcessorConfigFormRequestFormvaluesInner
		return ret
	}

	return o.Formvalues
}

// GetFormvaluesOk returns a tuple with the Formvalues field value
// and a boolean to check if the value has been set.
func (o *CoreMessageMessageProcessorConfigFormRequest) GetFormvaluesOk() ([]CoreMessageMessageProcessorConfigFormRequestFormvaluesInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Formvalues, true
}

// SetFormvalues sets field value
func (o *CoreMessageMessageProcessorConfigFormRequest) SetFormvalues(v []CoreMessageMessageProcessorConfigFormRequestFormvaluesInner) {
	o.Formvalues = v
}

// GetName returns the Name field value
func (o *CoreMessageMessageProcessorConfigFormRequest) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *CoreMessageMessageProcessorConfigFormRequest) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *CoreMessageMessageProcessorConfigFormRequest) SetName(v string) {
	o.Name = v
}

// GetUserid returns the Userid field value
func (o *CoreMessageMessageProcessorConfigFormRequest) GetUserid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Userid
}

// GetUseridOk returns a tuple with the Userid field value
// and a boolean to check if the value has been set.
func (o *CoreMessageMessageProcessorConfigFormRequest) GetUseridOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Userid, true
}

// SetUserid sets field value
func (o *CoreMessageMessageProcessorConfigFormRequest) SetUserid(v int32) {
	o.Userid = v
}

func (o CoreMessageMessageProcessorConfigFormRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreMessageMessageProcessorConfigFormRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["formvalues"] = o.Formvalues
	toSerialize["name"] = o.Name
	toSerialize["userid"] = o.Userid
	return toSerialize, nil
}

func (o *CoreMessageMessageProcessorConfigFormRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"formvalues",
		"name",
		"userid",
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

	varCoreMessageMessageProcessorConfigFormRequest := _CoreMessageMessageProcessorConfigFormRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreMessageMessageProcessorConfigFormRequest)

	if err != nil {
		return err
	}

	*o = CoreMessageMessageProcessorConfigFormRequest(varCoreMessageMessageProcessorConfigFormRequest)

	return err
}

type NullableCoreMessageMessageProcessorConfigFormRequest struct {
	value *CoreMessageMessageProcessorConfigFormRequest
	isSet bool
}

func (v NullableCoreMessageMessageProcessorConfigFormRequest) Get() *CoreMessageMessageProcessorConfigFormRequest {
	return v.value
}

func (v *NullableCoreMessageMessageProcessorConfigFormRequest) Set(val *CoreMessageMessageProcessorConfigFormRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreMessageMessageProcessorConfigFormRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreMessageMessageProcessorConfigFormRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreMessageMessageProcessorConfigFormRequest(val *CoreMessageMessageProcessorConfigFormRequest) *NullableCoreMessageMessageProcessorConfigFormRequest {
	return &NullableCoreMessageMessageProcessorConfigFormRequest{value: val, isSet: true}
}

func (v NullableCoreMessageMessageProcessorConfigFormRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreMessageMessageProcessorConfigFormRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


