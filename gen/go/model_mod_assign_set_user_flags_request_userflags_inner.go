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

// checks if the ModAssignSetUserFlagsRequestUserflagsInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModAssignSetUserFlagsRequestUserflagsInner{}

// ModAssignSetUserFlagsRequestUserflagsInner struct for ModAssignSetUserFlagsRequestUserflagsInner
type ModAssignSetUserFlagsRequestUserflagsInner struct {
	// allocated marker
	Allocatedmarker *int32 `json:"allocatedmarker,omitempty"`
	// extension due date
	Extensionduedate *int32 `json:"extensionduedate,omitempty"`
	// locked
	Locked *int32 `json:"locked,omitempty"`
	// mailed
	Mailed *int32 `json:"mailed,omitempty"`
	// student id
	Userid *int32 `json:"userid,omitempty"`
	// marking workflow state
	Workflowstate *string `json:"workflowstate,omitempty"`
}

// NewModAssignSetUserFlagsRequestUserflagsInner instantiates a new ModAssignSetUserFlagsRequestUserflagsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModAssignSetUserFlagsRequestUserflagsInner() *ModAssignSetUserFlagsRequestUserflagsInner {
	this := ModAssignSetUserFlagsRequestUserflagsInner{}
	return &this
}

// NewModAssignSetUserFlagsRequestUserflagsInnerWithDefaults instantiates a new ModAssignSetUserFlagsRequestUserflagsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModAssignSetUserFlagsRequestUserflagsInnerWithDefaults() *ModAssignSetUserFlagsRequestUserflagsInner {
	this := ModAssignSetUserFlagsRequestUserflagsInner{}
	return &this
}

// GetAllocatedmarker returns the Allocatedmarker field value if set, zero value otherwise.
func (o *ModAssignSetUserFlagsRequestUserflagsInner) GetAllocatedmarker() int32 {
	if o == nil || IsNil(o.Allocatedmarker) {
		var ret int32
		return ret
	}
	return *o.Allocatedmarker
}

// GetAllocatedmarkerOk returns a tuple with the Allocatedmarker field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignSetUserFlagsRequestUserflagsInner) GetAllocatedmarkerOk() (*int32, bool) {
	if o == nil || IsNil(o.Allocatedmarker) {
		return nil, false
	}
	return o.Allocatedmarker, true
}

// HasAllocatedmarker returns a boolean if a field has been set.
func (o *ModAssignSetUserFlagsRequestUserflagsInner) HasAllocatedmarker() bool {
	if o != nil && !IsNil(o.Allocatedmarker) {
		return true
	}

	return false
}

// SetAllocatedmarker gets a reference to the given int32 and assigns it to the Allocatedmarker field.
func (o *ModAssignSetUserFlagsRequestUserflagsInner) SetAllocatedmarker(v int32) {
	o.Allocatedmarker = &v
}

// GetExtensionduedate returns the Extensionduedate field value if set, zero value otherwise.
func (o *ModAssignSetUserFlagsRequestUserflagsInner) GetExtensionduedate() int32 {
	if o == nil || IsNil(o.Extensionduedate) {
		var ret int32
		return ret
	}
	return *o.Extensionduedate
}

// GetExtensionduedateOk returns a tuple with the Extensionduedate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignSetUserFlagsRequestUserflagsInner) GetExtensionduedateOk() (*int32, bool) {
	if o == nil || IsNil(o.Extensionduedate) {
		return nil, false
	}
	return o.Extensionduedate, true
}

// HasExtensionduedate returns a boolean if a field has been set.
func (o *ModAssignSetUserFlagsRequestUserflagsInner) HasExtensionduedate() bool {
	if o != nil && !IsNil(o.Extensionduedate) {
		return true
	}

	return false
}

// SetExtensionduedate gets a reference to the given int32 and assigns it to the Extensionduedate field.
func (o *ModAssignSetUserFlagsRequestUserflagsInner) SetExtensionduedate(v int32) {
	o.Extensionduedate = &v
}

// GetLocked returns the Locked field value if set, zero value otherwise.
func (o *ModAssignSetUserFlagsRequestUserflagsInner) GetLocked() int32 {
	if o == nil || IsNil(o.Locked) {
		var ret int32
		return ret
	}
	return *o.Locked
}

// GetLockedOk returns a tuple with the Locked field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignSetUserFlagsRequestUserflagsInner) GetLockedOk() (*int32, bool) {
	if o == nil || IsNil(o.Locked) {
		return nil, false
	}
	return o.Locked, true
}

// HasLocked returns a boolean if a field has been set.
func (o *ModAssignSetUserFlagsRequestUserflagsInner) HasLocked() bool {
	if o != nil && !IsNil(o.Locked) {
		return true
	}

	return false
}

// SetLocked gets a reference to the given int32 and assigns it to the Locked field.
func (o *ModAssignSetUserFlagsRequestUserflagsInner) SetLocked(v int32) {
	o.Locked = &v
}

// GetMailed returns the Mailed field value if set, zero value otherwise.
func (o *ModAssignSetUserFlagsRequestUserflagsInner) GetMailed() int32 {
	if o == nil || IsNil(o.Mailed) {
		var ret int32
		return ret
	}
	return *o.Mailed
}

// GetMailedOk returns a tuple with the Mailed field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignSetUserFlagsRequestUserflagsInner) GetMailedOk() (*int32, bool) {
	if o == nil || IsNil(o.Mailed) {
		return nil, false
	}
	return o.Mailed, true
}

// HasMailed returns a boolean if a field has been set.
func (o *ModAssignSetUserFlagsRequestUserflagsInner) HasMailed() bool {
	if o != nil && !IsNil(o.Mailed) {
		return true
	}

	return false
}

// SetMailed gets a reference to the given int32 and assigns it to the Mailed field.
func (o *ModAssignSetUserFlagsRequestUserflagsInner) SetMailed(v int32) {
	o.Mailed = &v
}

// GetUserid returns the Userid field value if set, zero value otherwise.
func (o *ModAssignSetUserFlagsRequestUserflagsInner) GetUserid() int32 {
	if o == nil || IsNil(o.Userid) {
		var ret int32
		return ret
	}
	return *o.Userid
}

// GetUseridOk returns a tuple with the Userid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignSetUserFlagsRequestUserflagsInner) GetUseridOk() (*int32, bool) {
	if o == nil || IsNil(o.Userid) {
		return nil, false
	}
	return o.Userid, true
}

// HasUserid returns a boolean if a field has been set.
func (o *ModAssignSetUserFlagsRequestUserflagsInner) HasUserid() bool {
	if o != nil && !IsNil(o.Userid) {
		return true
	}

	return false
}

// SetUserid gets a reference to the given int32 and assigns it to the Userid field.
func (o *ModAssignSetUserFlagsRequestUserflagsInner) SetUserid(v int32) {
	o.Userid = &v
}

// GetWorkflowstate returns the Workflowstate field value if set, zero value otherwise.
func (o *ModAssignSetUserFlagsRequestUserflagsInner) GetWorkflowstate() string {
	if o == nil || IsNil(o.Workflowstate) {
		var ret string
		return ret
	}
	return *o.Workflowstate
}

// GetWorkflowstateOk returns a tuple with the Workflowstate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModAssignSetUserFlagsRequestUserflagsInner) GetWorkflowstateOk() (*string, bool) {
	if o == nil || IsNil(o.Workflowstate) {
		return nil, false
	}
	return o.Workflowstate, true
}

// HasWorkflowstate returns a boolean if a field has been set.
func (o *ModAssignSetUserFlagsRequestUserflagsInner) HasWorkflowstate() bool {
	if o != nil && !IsNil(o.Workflowstate) {
		return true
	}

	return false
}

// SetWorkflowstate gets a reference to the given string and assigns it to the Workflowstate field.
func (o *ModAssignSetUserFlagsRequestUserflagsInner) SetWorkflowstate(v string) {
	o.Workflowstate = &v
}

func (o ModAssignSetUserFlagsRequestUserflagsInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModAssignSetUserFlagsRequestUserflagsInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Allocatedmarker) {
		toSerialize["allocatedmarker"] = o.Allocatedmarker
	}
	if !IsNil(o.Extensionduedate) {
		toSerialize["extensionduedate"] = o.Extensionduedate
	}
	if !IsNil(o.Locked) {
		toSerialize["locked"] = o.Locked
	}
	if !IsNil(o.Mailed) {
		toSerialize["mailed"] = o.Mailed
	}
	if !IsNil(o.Userid) {
		toSerialize["userid"] = o.Userid
	}
	if !IsNil(o.Workflowstate) {
		toSerialize["workflowstate"] = o.Workflowstate
	}
	return toSerialize, nil
}

type NullableModAssignSetUserFlagsRequestUserflagsInner struct {
	value *ModAssignSetUserFlagsRequestUserflagsInner
	isSet bool
}

func (v NullableModAssignSetUserFlagsRequestUserflagsInner) Get() *ModAssignSetUserFlagsRequestUserflagsInner {
	return v.value
}

func (v *NullableModAssignSetUserFlagsRequestUserflagsInner) Set(val *ModAssignSetUserFlagsRequestUserflagsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableModAssignSetUserFlagsRequestUserflagsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableModAssignSetUserFlagsRequestUserflagsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModAssignSetUserFlagsRequestUserflagsInner(val *ModAssignSetUserFlagsRequestUserflagsInner) *NullableModAssignSetUserFlagsRequestUserflagsInner {
	return &NullableModAssignSetUserFlagsRequestUserflagsInner{value: val, isSet: true}
}

func (v NullableModAssignSetUserFlagsRequestUserflagsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModAssignSetUserFlagsRequestUserflagsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

