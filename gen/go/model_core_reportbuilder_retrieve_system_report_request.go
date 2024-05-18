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

// checks if the CoreReportbuilderRetrieveSystemReportRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreReportbuilderRetrieveSystemReportRequest{}

// CoreReportbuilderRetrieveSystemReportRequest struct for CoreReportbuilderRetrieveSystemReportRequest
type CoreReportbuilderRetrieveSystemReportRequest struct {
	// Report area
	Area *string `json:"area,omitempty"`
	// Report component
	Component *string `json:"component,omitempty"`
	Context CoreCohortSearchCohortsRequestContext `json:"context"`
	// Report item ID
	Itemid *int32 `json:"itemid,omitempty"`
	// Page number
	Page *int32 `json:"page,omitempty"`
	Parameters []CoreReportbuilderCanViewSystemReportRequestParametersInner `json:"parameters,omitempty"`
	// Reports per page
	Perpage *int32 `json:"perpage,omitempty"`
	// Report class path
	Source string `json:"source"`
}

type _CoreReportbuilderRetrieveSystemReportRequest CoreReportbuilderRetrieveSystemReportRequest

// NewCoreReportbuilderRetrieveSystemReportRequest instantiates a new CoreReportbuilderRetrieveSystemReportRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreReportbuilderRetrieveSystemReportRequest(context CoreCohortSearchCohortsRequestContext, source string) *CoreReportbuilderRetrieveSystemReportRequest {
	this := CoreReportbuilderRetrieveSystemReportRequest{}
	var area string = ""
	this.Area = &area
	var component string = ""
	this.Component = &component
	this.Context = context
	var itemid int32 = 0
	this.Itemid = &itemid
	var page int32 = 0
	this.Page = &page
	var perpage int32 = 10
	this.Perpage = &perpage
	this.Source = source
	return &this
}

// NewCoreReportbuilderRetrieveSystemReportRequestWithDefaults instantiates a new CoreReportbuilderRetrieveSystemReportRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreReportbuilderRetrieveSystemReportRequestWithDefaults() *CoreReportbuilderRetrieveSystemReportRequest {
	this := CoreReportbuilderRetrieveSystemReportRequest{}
	var area string = ""
	this.Area = &area
	var component string = ""
	this.Component = &component
	var itemid int32 = 0
	this.Itemid = &itemid
	var page int32 = 0
	this.Page = &page
	var perpage int32 = 10
	this.Perpage = &perpage
	return &this
}

// GetArea returns the Area field value if set, zero value otherwise.
func (o *CoreReportbuilderRetrieveSystemReportRequest) GetArea() string {
	if o == nil || IsNil(o.Area) {
		var ret string
		return ret
	}
	return *o.Area
}

// GetAreaOk returns a tuple with the Area field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreReportbuilderRetrieveSystemReportRequest) GetAreaOk() (*string, bool) {
	if o == nil || IsNil(o.Area) {
		return nil, false
	}
	return o.Area, true
}

// HasArea returns a boolean if a field has been set.
func (o *CoreReportbuilderRetrieveSystemReportRequest) HasArea() bool {
	if o != nil && !IsNil(o.Area) {
		return true
	}

	return false
}

// SetArea gets a reference to the given string and assigns it to the Area field.
func (o *CoreReportbuilderRetrieveSystemReportRequest) SetArea(v string) {
	o.Area = &v
}

// GetComponent returns the Component field value if set, zero value otherwise.
func (o *CoreReportbuilderRetrieveSystemReportRequest) GetComponent() string {
	if o == nil || IsNil(o.Component) {
		var ret string
		return ret
	}
	return *o.Component
}

// GetComponentOk returns a tuple with the Component field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreReportbuilderRetrieveSystemReportRequest) GetComponentOk() (*string, bool) {
	if o == nil || IsNil(o.Component) {
		return nil, false
	}
	return o.Component, true
}

// HasComponent returns a boolean if a field has been set.
func (o *CoreReportbuilderRetrieveSystemReportRequest) HasComponent() bool {
	if o != nil && !IsNil(o.Component) {
		return true
	}

	return false
}

// SetComponent gets a reference to the given string and assigns it to the Component field.
func (o *CoreReportbuilderRetrieveSystemReportRequest) SetComponent(v string) {
	o.Component = &v
}

// GetContext returns the Context field value
func (o *CoreReportbuilderRetrieveSystemReportRequest) GetContext() CoreCohortSearchCohortsRequestContext {
	if o == nil {
		var ret CoreCohortSearchCohortsRequestContext
		return ret
	}

	return o.Context
}

// GetContextOk returns a tuple with the Context field value
// and a boolean to check if the value has been set.
func (o *CoreReportbuilderRetrieveSystemReportRequest) GetContextOk() (*CoreCohortSearchCohortsRequestContext, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Context, true
}

// SetContext sets field value
func (o *CoreReportbuilderRetrieveSystemReportRequest) SetContext(v CoreCohortSearchCohortsRequestContext) {
	o.Context = v
}

// GetItemid returns the Itemid field value if set, zero value otherwise.
func (o *CoreReportbuilderRetrieveSystemReportRequest) GetItemid() int32 {
	if o == nil || IsNil(o.Itemid) {
		var ret int32
		return ret
	}
	return *o.Itemid
}

// GetItemidOk returns a tuple with the Itemid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreReportbuilderRetrieveSystemReportRequest) GetItemidOk() (*int32, bool) {
	if o == nil || IsNil(o.Itemid) {
		return nil, false
	}
	return o.Itemid, true
}

// HasItemid returns a boolean if a field has been set.
func (o *CoreReportbuilderRetrieveSystemReportRequest) HasItemid() bool {
	if o != nil && !IsNil(o.Itemid) {
		return true
	}

	return false
}

// SetItemid gets a reference to the given int32 and assigns it to the Itemid field.
func (o *CoreReportbuilderRetrieveSystemReportRequest) SetItemid(v int32) {
	o.Itemid = &v
}

// GetPage returns the Page field value if set, zero value otherwise.
func (o *CoreReportbuilderRetrieveSystemReportRequest) GetPage() int32 {
	if o == nil || IsNil(o.Page) {
		var ret int32
		return ret
	}
	return *o.Page
}

// GetPageOk returns a tuple with the Page field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreReportbuilderRetrieveSystemReportRequest) GetPageOk() (*int32, bool) {
	if o == nil || IsNil(o.Page) {
		return nil, false
	}
	return o.Page, true
}

// HasPage returns a boolean if a field has been set.
func (o *CoreReportbuilderRetrieveSystemReportRequest) HasPage() bool {
	if o != nil && !IsNil(o.Page) {
		return true
	}

	return false
}

// SetPage gets a reference to the given int32 and assigns it to the Page field.
func (o *CoreReportbuilderRetrieveSystemReportRequest) SetPage(v int32) {
	o.Page = &v
}

// GetParameters returns the Parameters field value if set, zero value otherwise.
func (o *CoreReportbuilderRetrieveSystemReportRequest) GetParameters() []CoreReportbuilderCanViewSystemReportRequestParametersInner {
	if o == nil || IsNil(o.Parameters) {
		var ret []CoreReportbuilderCanViewSystemReportRequestParametersInner
		return ret
	}
	return o.Parameters
}

// GetParametersOk returns a tuple with the Parameters field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreReportbuilderRetrieveSystemReportRequest) GetParametersOk() ([]CoreReportbuilderCanViewSystemReportRequestParametersInner, bool) {
	if o == nil || IsNil(o.Parameters) {
		return nil, false
	}
	return o.Parameters, true
}

// HasParameters returns a boolean if a field has been set.
func (o *CoreReportbuilderRetrieveSystemReportRequest) HasParameters() bool {
	if o != nil && !IsNil(o.Parameters) {
		return true
	}

	return false
}

// SetParameters gets a reference to the given []CoreReportbuilderCanViewSystemReportRequestParametersInner and assigns it to the Parameters field.
func (o *CoreReportbuilderRetrieveSystemReportRequest) SetParameters(v []CoreReportbuilderCanViewSystemReportRequestParametersInner) {
	o.Parameters = v
}

// GetPerpage returns the Perpage field value if set, zero value otherwise.
func (o *CoreReportbuilderRetrieveSystemReportRequest) GetPerpage() int32 {
	if o == nil || IsNil(o.Perpage) {
		var ret int32
		return ret
	}
	return *o.Perpage
}

// GetPerpageOk returns a tuple with the Perpage field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreReportbuilderRetrieveSystemReportRequest) GetPerpageOk() (*int32, bool) {
	if o == nil || IsNil(o.Perpage) {
		return nil, false
	}
	return o.Perpage, true
}

// HasPerpage returns a boolean if a field has been set.
func (o *CoreReportbuilderRetrieveSystemReportRequest) HasPerpage() bool {
	if o != nil && !IsNil(o.Perpage) {
		return true
	}

	return false
}

// SetPerpage gets a reference to the given int32 and assigns it to the Perpage field.
func (o *CoreReportbuilderRetrieveSystemReportRequest) SetPerpage(v int32) {
	o.Perpage = &v
}

// GetSource returns the Source field value
func (o *CoreReportbuilderRetrieveSystemReportRequest) GetSource() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Source
}

// GetSourceOk returns a tuple with the Source field value
// and a boolean to check if the value has been set.
func (o *CoreReportbuilderRetrieveSystemReportRequest) GetSourceOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Source, true
}

// SetSource sets field value
func (o *CoreReportbuilderRetrieveSystemReportRequest) SetSource(v string) {
	o.Source = v
}

func (o CoreReportbuilderRetrieveSystemReportRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreReportbuilderRetrieveSystemReportRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Area) {
		toSerialize["area"] = o.Area
	}
	if !IsNil(o.Component) {
		toSerialize["component"] = o.Component
	}
	toSerialize["context"] = o.Context
	if !IsNil(o.Itemid) {
		toSerialize["itemid"] = o.Itemid
	}
	if !IsNil(o.Page) {
		toSerialize["page"] = o.Page
	}
	if !IsNil(o.Parameters) {
		toSerialize["parameters"] = o.Parameters
	}
	if !IsNil(o.Perpage) {
		toSerialize["perpage"] = o.Perpage
	}
	toSerialize["source"] = o.Source
	return toSerialize, nil
}

func (o *CoreReportbuilderRetrieveSystemReportRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"context",
		"source",
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

	varCoreReportbuilderRetrieveSystemReportRequest := _CoreReportbuilderRetrieveSystemReportRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreReportbuilderRetrieveSystemReportRequest)

	if err != nil {
		return err
	}

	*o = CoreReportbuilderRetrieveSystemReportRequest(varCoreReportbuilderRetrieveSystemReportRequest)

	return err
}

type NullableCoreReportbuilderRetrieveSystemReportRequest struct {
	value *CoreReportbuilderRetrieveSystemReportRequest
	isSet bool
}

func (v NullableCoreReportbuilderRetrieveSystemReportRequest) Get() *CoreReportbuilderRetrieveSystemReportRequest {
	return v.value
}

func (v *NullableCoreReportbuilderRetrieveSystemReportRequest) Set(val *CoreReportbuilderRetrieveSystemReportRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreReportbuilderRetrieveSystemReportRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreReportbuilderRetrieveSystemReportRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreReportbuilderRetrieveSystemReportRequest(val *CoreReportbuilderRetrieveSystemReportRequest) *NullableCoreReportbuilderRetrieveSystemReportRequest {
	return &NullableCoreReportbuilderRetrieveSystemReportRequest{value: val, isSet: true}
}

func (v NullableCoreReportbuilderRetrieveSystemReportRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreReportbuilderRetrieveSystemReportRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

