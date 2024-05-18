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

// checks if the ModLtiGetToolProxyRegistrationRequest200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModLtiGetToolProxyRegistrationRequest200Response{}

// ModLtiGetToolProxyRegistrationRequest200Response struct for ModLtiGetToolProxyRegistrationRequest200Response
type ModLtiGetToolProxyRegistrationRequest200Response struct {
	// URL to redirect on registration completion
	LaunchPresentationReturnUrl string `json:"launch_presentation_return_url"`
	// LTI message type
	LtiMessageType string `json:"lti_message_type"`
	// LTI version
	LtiVersion string `json:"lti_version"`
	// Tool proxy registration key
	RegKey string `json:"reg_key"`
	// Tool proxy registration password
	RegPassword string `json:"reg_password"`
	// Tool proxy registration url
	RegUrl string `json:"reg_url"`
	// Tool consumers profile URL
	TcProfileUrl string `json:"tc_profile_url"`
}

type _ModLtiGetToolProxyRegistrationRequest200Response ModLtiGetToolProxyRegistrationRequest200Response

// NewModLtiGetToolProxyRegistrationRequest200Response instantiates a new ModLtiGetToolProxyRegistrationRequest200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModLtiGetToolProxyRegistrationRequest200Response(launchPresentationReturnUrl string, ltiMessageType string, ltiVersion string, regKey string, regPassword string, regUrl string, tcProfileUrl string) *ModLtiGetToolProxyRegistrationRequest200Response {
	this := ModLtiGetToolProxyRegistrationRequest200Response{}
	this.LaunchPresentationReturnUrl = launchPresentationReturnUrl
	this.LtiMessageType = ltiMessageType
	this.LtiVersion = ltiVersion
	this.RegKey = regKey
	this.RegPassword = regPassword
	this.RegUrl = regUrl
	this.TcProfileUrl = tcProfileUrl
	return &this
}

// NewModLtiGetToolProxyRegistrationRequest200ResponseWithDefaults instantiates a new ModLtiGetToolProxyRegistrationRequest200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModLtiGetToolProxyRegistrationRequest200ResponseWithDefaults() *ModLtiGetToolProxyRegistrationRequest200Response {
	this := ModLtiGetToolProxyRegistrationRequest200Response{}
	var launchPresentationReturnUrl string = "null"
	this.LaunchPresentationReturnUrl = launchPresentationReturnUrl
	var ltiMessageType string = "null"
	this.LtiMessageType = ltiMessageType
	var ltiVersion string = "null"
	this.LtiVersion = ltiVersion
	var regKey string = "null"
	this.RegKey = regKey
	var regPassword string = "null"
	this.RegPassword = regPassword
	var regUrl string = "null"
	this.RegUrl = regUrl
	var tcProfileUrl string = "null"
	this.TcProfileUrl = tcProfileUrl
	return &this
}

// GetLaunchPresentationReturnUrl returns the LaunchPresentationReturnUrl field value
func (o *ModLtiGetToolProxyRegistrationRequest200Response) GetLaunchPresentationReturnUrl() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.LaunchPresentationReturnUrl
}

// GetLaunchPresentationReturnUrlOk returns a tuple with the LaunchPresentationReturnUrl field value
// and a boolean to check if the value has been set.
func (o *ModLtiGetToolProxyRegistrationRequest200Response) GetLaunchPresentationReturnUrlOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.LaunchPresentationReturnUrl, true
}

// SetLaunchPresentationReturnUrl sets field value
func (o *ModLtiGetToolProxyRegistrationRequest200Response) SetLaunchPresentationReturnUrl(v string) {
	o.LaunchPresentationReturnUrl = v
}

// GetLtiMessageType returns the LtiMessageType field value
func (o *ModLtiGetToolProxyRegistrationRequest200Response) GetLtiMessageType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.LtiMessageType
}

// GetLtiMessageTypeOk returns a tuple with the LtiMessageType field value
// and a boolean to check if the value has been set.
func (o *ModLtiGetToolProxyRegistrationRequest200Response) GetLtiMessageTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.LtiMessageType, true
}

// SetLtiMessageType sets field value
func (o *ModLtiGetToolProxyRegistrationRequest200Response) SetLtiMessageType(v string) {
	o.LtiMessageType = v
}

// GetLtiVersion returns the LtiVersion field value
func (o *ModLtiGetToolProxyRegistrationRequest200Response) GetLtiVersion() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.LtiVersion
}

// GetLtiVersionOk returns a tuple with the LtiVersion field value
// and a boolean to check if the value has been set.
func (o *ModLtiGetToolProxyRegistrationRequest200Response) GetLtiVersionOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.LtiVersion, true
}

// SetLtiVersion sets field value
func (o *ModLtiGetToolProxyRegistrationRequest200Response) SetLtiVersion(v string) {
	o.LtiVersion = v
}

// GetRegKey returns the RegKey field value
func (o *ModLtiGetToolProxyRegistrationRequest200Response) GetRegKey() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.RegKey
}

// GetRegKeyOk returns a tuple with the RegKey field value
// and a boolean to check if the value has been set.
func (o *ModLtiGetToolProxyRegistrationRequest200Response) GetRegKeyOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.RegKey, true
}

// SetRegKey sets field value
func (o *ModLtiGetToolProxyRegistrationRequest200Response) SetRegKey(v string) {
	o.RegKey = v
}

// GetRegPassword returns the RegPassword field value
func (o *ModLtiGetToolProxyRegistrationRequest200Response) GetRegPassword() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.RegPassword
}

// GetRegPasswordOk returns a tuple with the RegPassword field value
// and a boolean to check if the value has been set.
func (o *ModLtiGetToolProxyRegistrationRequest200Response) GetRegPasswordOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.RegPassword, true
}

// SetRegPassword sets field value
func (o *ModLtiGetToolProxyRegistrationRequest200Response) SetRegPassword(v string) {
	o.RegPassword = v
}

// GetRegUrl returns the RegUrl field value
func (o *ModLtiGetToolProxyRegistrationRequest200Response) GetRegUrl() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.RegUrl
}

// GetRegUrlOk returns a tuple with the RegUrl field value
// and a boolean to check if the value has been set.
func (o *ModLtiGetToolProxyRegistrationRequest200Response) GetRegUrlOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.RegUrl, true
}

// SetRegUrl sets field value
func (o *ModLtiGetToolProxyRegistrationRequest200Response) SetRegUrl(v string) {
	o.RegUrl = v
}

// GetTcProfileUrl returns the TcProfileUrl field value
func (o *ModLtiGetToolProxyRegistrationRequest200Response) GetTcProfileUrl() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.TcProfileUrl
}

// GetTcProfileUrlOk returns a tuple with the TcProfileUrl field value
// and a boolean to check if the value has been set.
func (o *ModLtiGetToolProxyRegistrationRequest200Response) GetTcProfileUrlOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.TcProfileUrl, true
}

// SetTcProfileUrl sets field value
func (o *ModLtiGetToolProxyRegistrationRequest200Response) SetTcProfileUrl(v string) {
	o.TcProfileUrl = v
}

func (o ModLtiGetToolProxyRegistrationRequest200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModLtiGetToolProxyRegistrationRequest200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["launch_presentation_return_url"] = o.LaunchPresentationReturnUrl
	toSerialize["lti_message_type"] = o.LtiMessageType
	toSerialize["lti_version"] = o.LtiVersion
	toSerialize["reg_key"] = o.RegKey
	toSerialize["reg_password"] = o.RegPassword
	toSerialize["reg_url"] = o.RegUrl
	toSerialize["tc_profile_url"] = o.TcProfileUrl
	return toSerialize, nil
}

func (o *ModLtiGetToolProxyRegistrationRequest200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"launch_presentation_return_url",
		"lti_message_type",
		"lti_version",
		"reg_key",
		"reg_password",
		"reg_url",
		"tc_profile_url",
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

	varModLtiGetToolProxyRegistrationRequest200Response := _ModLtiGetToolProxyRegistrationRequest200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varModLtiGetToolProxyRegistrationRequest200Response)

	if err != nil {
		return err
	}

	*o = ModLtiGetToolProxyRegistrationRequest200Response(varModLtiGetToolProxyRegistrationRequest200Response)

	return err
}

type NullableModLtiGetToolProxyRegistrationRequest200Response struct {
	value *ModLtiGetToolProxyRegistrationRequest200Response
	isSet bool
}

func (v NullableModLtiGetToolProxyRegistrationRequest200Response) Get() *ModLtiGetToolProxyRegistrationRequest200Response {
	return v.value
}

func (v *NullableModLtiGetToolProxyRegistrationRequest200Response) Set(val *ModLtiGetToolProxyRegistrationRequest200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableModLtiGetToolProxyRegistrationRequest200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableModLtiGetToolProxyRegistrationRequest200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModLtiGetToolProxyRegistrationRequest200Response(val *ModLtiGetToolProxyRegistrationRequest200Response) *NullableModLtiGetToolProxyRegistrationRequest200Response {
	return &NullableModLtiGetToolProxyRegistrationRequest200Response{value: val, isSet: true}
}

func (v NullableModLtiGetToolProxyRegistrationRequest200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModLtiGetToolProxyRegistrationRequest200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


