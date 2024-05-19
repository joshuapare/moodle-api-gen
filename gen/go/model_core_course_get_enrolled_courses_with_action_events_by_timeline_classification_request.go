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

// checks if the CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest{}

// CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest struct for CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest
type CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest struct {
	// future, inprogress, or past
	Classification string `json:"classification"`
	// Used when classification = customfield
	Customfieldname *string `json:"customfieldname,omitempty"`
	// Used when classification = customfield
	Customfieldvalue *string `json:"customfieldvalue,omitempty"`
	// Optional starting timestamp for action events
	Eventsfrom *int32 `json:"eventsfrom,omitempty"`
	// Optional ending timestamp for action events
	Eventsto *int32 `json:"eventsto,omitempty"`
	// Result set limit
	Limit *int32 `json:"limit,omitempty"`
	// Result set offset
	Offset *int32 `json:"offset,omitempty"`
	// The value a user wishes to search against
	Searchvalue *string `json:"searchvalue,omitempty"`
	// Sort string
	Sort *string `json:"sort,omitempty"`
}

type _CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest

// NewCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest instantiates a new CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest(classification string) *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest {
	this := CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest{}
	this.Classification = classification
	var eventsfrom int32 = null
	this.Eventsfrom = &eventsfrom
	var eventsto int32 = null
	this.Eventsto = &eventsto
	var limit int32 = 0
	this.Limit = &limit
	var offset int32 = 0
	this.Offset = &offset
	return &this
}

// NewCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequestWithDefaults instantiates a new CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequestWithDefaults() *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest {
	this := CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest{}
	var eventsfrom int32 = null
	this.Eventsfrom = &eventsfrom
	var eventsto int32 = null
	this.Eventsto = &eventsto
	var limit int32 = 0
	this.Limit = &limit
	var offset int32 = 0
	this.Offset = &offset
	return &this
}

// GetClassification returns the Classification field value
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetClassification() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Classification
}

// GetClassificationOk returns a tuple with the Classification field value
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetClassificationOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Classification, true
}

// SetClassification sets field value
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) SetClassification(v string) {
	o.Classification = v
}

// GetCustomfieldname returns the Customfieldname field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetCustomfieldname() string {
	if o == nil || IsNil(o.Customfieldname) {
		var ret string
		return ret
	}
	return *o.Customfieldname
}

// GetCustomfieldnameOk returns a tuple with the Customfieldname field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetCustomfieldnameOk() (*string, bool) {
	if o == nil || IsNil(o.Customfieldname) {
		return nil, false
	}
	return o.Customfieldname, true
}

// HasCustomfieldname returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) HasCustomfieldname() bool {
	if o != nil && !IsNil(o.Customfieldname) {
		return true
	}

	return false
}

// SetCustomfieldname gets a reference to the given string and assigns it to the Customfieldname field.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) SetCustomfieldname(v string) {
	o.Customfieldname = &v
}

// GetCustomfieldvalue returns the Customfieldvalue field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetCustomfieldvalue() string {
	if o == nil || IsNil(o.Customfieldvalue) {
		var ret string
		return ret
	}
	return *o.Customfieldvalue
}

// GetCustomfieldvalueOk returns a tuple with the Customfieldvalue field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetCustomfieldvalueOk() (*string, bool) {
	if o == nil || IsNil(o.Customfieldvalue) {
		return nil, false
	}
	return o.Customfieldvalue, true
}

// HasCustomfieldvalue returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) HasCustomfieldvalue() bool {
	if o != nil && !IsNil(o.Customfieldvalue) {
		return true
	}

	return false
}

// SetCustomfieldvalue gets a reference to the given string and assigns it to the Customfieldvalue field.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) SetCustomfieldvalue(v string) {
	o.Customfieldvalue = &v
}

// GetEventsfrom returns the Eventsfrom field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetEventsfrom() int32 {
	if o == nil || IsNil(o.Eventsfrom) {
		var ret int32
		return ret
	}
	return *o.Eventsfrom
}

// GetEventsfromOk returns a tuple with the Eventsfrom field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetEventsfromOk() (*int32, bool) {
	if o == nil || IsNil(o.Eventsfrom) {
		return nil, false
	}
	return o.Eventsfrom, true
}

// HasEventsfrom returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) HasEventsfrom() bool {
	if o != nil && !IsNil(o.Eventsfrom) {
		return true
	}

	return false
}

// SetEventsfrom gets a reference to the given int32 and assigns it to the Eventsfrom field.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) SetEventsfrom(v int32) {
	o.Eventsfrom = &v
}

// GetEventsto returns the Eventsto field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetEventsto() int32 {
	if o == nil || IsNil(o.Eventsto) {
		var ret int32
		return ret
	}
	return *o.Eventsto
}

// GetEventstoOk returns a tuple with the Eventsto field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetEventstoOk() (*int32, bool) {
	if o == nil || IsNil(o.Eventsto) {
		return nil, false
	}
	return o.Eventsto, true
}

// HasEventsto returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) HasEventsto() bool {
	if o != nil && !IsNil(o.Eventsto) {
		return true
	}

	return false
}

// SetEventsto gets a reference to the given int32 and assigns it to the Eventsto field.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) SetEventsto(v int32) {
	o.Eventsto = &v
}

// GetLimit returns the Limit field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetLimit() int32 {
	if o == nil || IsNil(o.Limit) {
		var ret int32
		return ret
	}
	return *o.Limit
}

// GetLimitOk returns a tuple with the Limit field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetLimitOk() (*int32, bool) {
	if o == nil || IsNil(o.Limit) {
		return nil, false
	}
	return o.Limit, true
}

// HasLimit returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) HasLimit() bool {
	if o != nil && !IsNil(o.Limit) {
		return true
	}

	return false
}

// SetLimit gets a reference to the given int32 and assigns it to the Limit field.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) SetLimit(v int32) {
	o.Limit = &v
}

// GetOffset returns the Offset field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetOffset() int32 {
	if o == nil || IsNil(o.Offset) {
		var ret int32
		return ret
	}
	return *o.Offset
}

// GetOffsetOk returns a tuple with the Offset field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetOffsetOk() (*int32, bool) {
	if o == nil || IsNil(o.Offset) {
		return nil, false
	}
	return o.Offset, true
}

// HasOffset returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) HasOffset() bool {
	if o != nil && !IsNil(o.Offset) {
		return true
	}

	return false
}

// SetOffset gets a reference to the given int32 and assigns it to the Offset field.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) SetOffset(v int32) {
	o.Offset = &v
}

// GetSearchvalue returns the Searchvalue field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetSearchvalue() string {
	if o == nil || IsNil(o.Searchvalue) {
		var ret string
		return ret
	}
	return *o.Searchvalue
}

// GetSearchvalueOk returns a tuple with the Searchvalue field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetSearchvalueOk() (*string, bool) {
	if o == nil || IsNil(o.Searchvalue) {
		return nil, false
	}
	return o.Searchvalue, true
}

// HasSearchvalue returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) HasSearchvalue() bool {
	if o != nil && !IsNil(o.Searchvalue) {
		return true
	}

	return false
}

// SetSearchvalue gets a reference to the given string and assigns it to the Searchvalue field.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) SetSearchvalue(v string) {
	o.Searchvalue = &v
}

// GetSort returns the Sort field value if set, zero value otherwise.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetSort() string {
	if o == nil || IsNil(o.Sort) {
		var ret string
		return ret
	}
	return *o.Sort
}

// GetSortOk returns a tuple with the Sort field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) GetSortOk() (*string, bool) {
	if o == nil || IsNil(o.Sort) {
		return nil, false
	}
	return o.Sort, true
}

// HasSort returns a boolean if a field has been set.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) HasSort() bool {
	if o != nil && !IsNil(o.Sort) {
		return true
	}

	return false
}

// SetSort gets a reference to the given string and assigns it to the Sort field.
func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) SetSort(v string) {
	o.Sort = &v
}

func (o CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["classification"] = o.Classification
	if !IsNil(o.Customfieldname) {
		toSerialize["customfieldname"] = o.Customfieldname
	}
	if !IsNil(o.Customfieldvalue) {
		toSerialize["customfieldvalue"] = o.Customfieldvalue
	}
	if !IsNil(o.Eventsfrom) {
		toSerialize["eventsfrom"] = o.Eventsfrom
	}
	if !IsNil(o.Eventsto) {
		toSerialize["eventsto"] = o.Eventsto
	}
	if !IsNil(o.Limit) {
		toSerialize["limit"] = o.Limit
	}
	if !IsNil(o.Offset) {
		toSerialize["offset"] = o.Offset
	}
	if !IsNil(o.Searchvalue) {
		toSerialize["searchvalue"] = o.Searchvalue
	}
	if !IsNil(o.Sort) {
		toSerialize["sort"] = o.Sort
	}
	return toSerialize, nil
}

func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"classification",
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

	varCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest := _CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest)

	if err != nil {
		return err
	}

	*o = CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest(varCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest)

	return err
}

type NullableCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest struct {
	value *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest
	isSet bool
}

func (v NullableCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) Get() *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest {
	return v.value
}

func (v *NullableCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) Set(val *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest(val *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) *NullableCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest {
	return &NullableCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest{value: val, isSet: true}
}

func (v NullableCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


