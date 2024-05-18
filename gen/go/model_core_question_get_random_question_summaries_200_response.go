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

// checks if the CoreQuestionGetRandomQuestionSummaries200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreQuestionGetRandomQuestionSummaries200Response{}

// CoreQuestionGetRandomQuestionSummaries200Response struct for CoreQuestionGetRandomQuestionSummaries200Response
type CoreQuestionGetRandomQuestionSummaries200Response struct {
	Questions []CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner `json:"questions"`
	// total number of questions in result set
	Totalcount int32 `json:"totalcount"`
}

type _CoreQuestionGetRandomQuestionSummaries200Response CoreQuestionGetRandomQuestionSummaries200Response

// NewCoreQuestionGetRandomQuestionSummaries200Response instantiates a new CoreQuestionGetRandomQuestionSummaries200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreQuestionGetRandomQuestionSummaries200Response(questions []CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner, totalcount int32) *CoreQuestionGetRandomQuestionSummaries200Response {
	this := CoreQuestionGetRandomQuestionSummaries200Response{}
	this.Questions = questions
	this.Totalcount = totalcount
	return &this
}

// NewCoreQuestionGetRandomQuestionSummaries200ResponseWithDefaults instantiates a new CoreQuestionGetRandomQuestionSummaries200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreQuestionGetRandomQuestionSummaries200ResponseWithDefaults() *CoreQuestionGetRandomQuestionSummaries200Response {
	this := CoreQuestionGetRandomQuestionSummaries200Response{}
	var totalcount int32 = null
	this.Totalcount = totalcount
	return &this
}

// GetQuestions returns the Questions field value
func (o *CoreQuestionGetRandomQuestionSummaries200Response) GetQuestions() []CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner {
	if o == nil {
		var ret []CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner
		return ret
	}

	return o.Questions
}

// GetQuestionsOk returns a tuple with the Questions field value
// and a boolean to check if the value has been set.
func (o *CoreQuestionGetRandomQuestionSummaries200Response) GetQuestionsOk() ([]CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Questions, true
}

// SetQuestions sets field value
func (o *CoreQuestionGetRandomQuestionSummaries200Response) SetQuestions(v []CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner) {
	o.Questions = v
}

// GetTotalcount returns the Totalcount field value
func (o *CoreQuestionGetRandomQuestionSummaries200Response) GetTotalcount() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Totalcount
}

// GetTotalcountOk returns a tuple with the Totalcount field value
// and a boolean to check if the value has been set.
func (o *CoreQuestionGetRandomQuestionSummaries200Response) GetTotalcountOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Totalcount, true
}

// SetTotalcount sets field value
func (o *CoreQuestionGetRandomQuestionSummaries200Response) SetTotalcount(v int32) {
	o.Totalcount = v
}

func (o CoreQuestionGetRandomQuestionSummaries200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreQuestionGetRandomQuestionSummaries200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["questions"] = o.Questions
	toSerialize["totalcount"] = o.Totalcount
	return toSerialize, nil
}

func (o *CoreQuestionGetRandomQuestionSummaries200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"questions",
		"totalcount",
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

	varCoreQuestionGetRandomQuestionSummaries200Response := _CoreQuestionGetRandomQuestionSummaries200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreQuestionGetRandomQuestionSummaries200Response)

	if err != nil {
		return err
	}

	*o = CoreQuestionGetRandomQuestionSummaries200Response(varCoreQuestionGetRandomQuestionSummaries200Response)

	return err
}

type NullableCoreQuestionGetRandomQuestionSummaries200Response struct {
	value *CoreQuestionGetRandomQuestionSummaries200Response
	isSet bool
}

func (v NullableCoreQuestionGetRandomQuestionSummaries200Response) Get() *CoreQuestionGetRandomQuestionSummaries200Response {
	return v.value
}

func (v *NullableCoreQuestionGetRandomQuestionSummaries200Response) Set(val *CoreQuestionGetRandomQuestionSummaries200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreQuestionGetRandomQuestionSummaries200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreQuestionGetRandomQuestionSummaries200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreQuestionGetRandomQuestionSummaries200Response(val *CoreQuestionGetRandomQuestionSummaries200Response) *NullableCoreQuestionGetRandomQuestionSummaries200Response {
	return &NullableCoreQuestionGetRandomQuestionSummaries200Response{value: val, isSet: true}
}

func (v NullableCoreQuestionGetRandomQuestionSummaries200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreQuestionGetRandomQuestionSummaries200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


