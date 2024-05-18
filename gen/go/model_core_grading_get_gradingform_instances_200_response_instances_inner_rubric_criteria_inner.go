/*
Moodle Webservice API

Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

API version: 4.3.4
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package moodleclient

import (
	"encoding/json"
)

// checks if the CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner{}

// CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner struct for CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner
type CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner struct {
	// criterion id
	Criterionid *int32 `json:"criterionid,omitempty"`
	// filling id
	Id *int32 `json:"id,omitempty"`
	// level id
	Levelid *int32 `json:"levelid,omitempty"`
	// remark
	Remark *string `json:"remark,omitempty"`
	// remark format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
	Remarkformat *int32 `json:"remarkformat,omitempty"`
}

// NewCoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner instantiates a new CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner() *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner {
	this := CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner{}
	return &this
}

// NewCoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInnerWithDefaults instantiates a new CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInnerWithDefaults() *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner {
	this := CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner{}
	return &this
}

// GetCriterionid returns the Criterionid field value if set, zero value otherwise.
func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) GetCriterionid() int32 {
	if o == nil || IsNil(o.Criterionid) {
		var ret int32
		return ret
	}
	return *o.Criterionid
}

// GetCriterionidOk returns a tuple with the Criterionid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) GetCriterionidOk() (*int32, bool) {
	if o == nil || IsNil(o.Criterionid) {
		return nil, false
	}
	return o.Criterionid, true
}

// HasCriterionid returns a boolean if a field has been set.
func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) HasCriterionid() bool {
	if o != nil && !IsNil(o.Criterionid) {
		return true
	}

	return false
}

// SetCriterionid gets a reference to the given int32 and assigns it to the Criterionid field.
func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) SetCriterionid(v int32) {
	o.Criterionid = &v
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) GetId() int32 {
	if o == nil || IsNil(o.Id) {
		var ret int32
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) GetIdOk() (*int32, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given int32 and assigns it to the Id field.
func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) SetId(v int32) {
	o.Id = &v
}

// GetLevelid returns the Levelid field value if set, zero value otherwise.
func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) GetLevelid() int32 {
	if o == nil || IsNil(o.Levelid) {
		var ret int32
		return ret
	}
	return *o.Levelid
}

// GetLevelidOk returns a tuple with the Levelid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) GetLevelidOk() (*int32, bool) {
	if o == nil || IsNil(o.Levelid) {
		return nil, false
	}
	return o.Levelid, true
}

// HasLevelid returns a boolean if a field has been set.
func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) HasLevelid() bool {
	if o != nil && !IsNil(o.Levelid) {
		return true
	}

	return false
}

// SetLevelid gets a reference to the given int32 and assigns it to the Levelid field.
func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) SetLevelid(v int32) {
	o.Levelid = &v
}

// GetRemark returns the Remark field value if set, zero value otherwise.
func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) GetRemark() string {
	if o == nil || IsNil(o.Remark) {
		var ret string
		return ret
	}
	return *o.Remark
}

// GetRemarkOk returns a tuple with the Remark field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) GetRemarkOk() (*string, bool) {
	if o == nil || IsNil(o.Remark) {
		return nil, false
	}
	return o.Remark, true
}

// HasRemark returns a boolean if a field has been set.
func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) HasRemark() bool {
	if o != nil && !IsNil(o.Remark) {
		return true
	}

	return false
}

// SetRemark gets a reference to the given string and assigns it to the Remark field.
func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) SetRemark(v string) {
	o.Remark = &v
}

// GetRemarkformat returns the Remarkformat field value if set, zero value otherwise.
func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) GetRemarkformat() int32 {
	if o == nil || IsNil(o.Remarkformat) {
		var ret int32
		return ret
	}
	return *o.Remarkformat
}

// GetRemarkformatOk returns a tuple with the Remarkformat field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) GetRemarkformatOk() (*int32, bool) {
	if o == nil || IsNil(o.Remarkformat) {
		return nil, false
	}
	return o.Remarkformat, true
}

// HasRemarkformat returns a boolean if a field has been set.
func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) HasRemarkformat() bool {
	if o != nil && !IsNil(o.Remarkformat) {
		return true
	}

	return false
}

// SetRemarkformat gets a reference to the given int32 and assigns it to the Remarkformat field.
func (o *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) SetRemarkformat(v int32) {
	o.Remarkformat = &v
}

func (o CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Criterionid) {
		toSerialize["criterionid"] = o.Criterionid
	}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.Levelid) {
		toSerialize["levelid"] = o.Levelid
	}
	if !IsNil(o.Remark) {
		toSerialize["remark"] = o.Remark
	}
	if !IsNil(o.Remarkformat) {
		toSerialize["remarkformat"] = o.Remarkformat
	}
	return toSerialize, nil
}

type NullableCoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner struct {
	value *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner
	isSet bool
}

func (v NullableCoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) Get() *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner {
	return v.value
}

func (v *NullableCoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) Set(val *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner(val *CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) *NullableCoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner {
	return &NullableCoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner{value: val, isSet: true}
}

func (v NullableCoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


