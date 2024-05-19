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

// checks if the CoreBackupGetCopyProgressRequestCopiesInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreBackupGetCopyProgressRequestCopiesInner{}

// CoreBackupGetCopyProgressRequestCopiesInner Copy data
type CoreBackupGetCopyProgressRequestCopiesInner struct {
	// Backup id
	Backupid *string `json:"backupid,omitempty"`
	// Operation type
	Operation *string `json:"operation,omitempty"`
	// Restore id
	Restoreid *string `json:"restoreid,omitempty"`
}

// NewCoreBackupGetCopyProgressRequestCopiesInner instantiates a new CoreBackupGetCopyProgressRequestCopiesInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreBackupGetCopyProgressRequestCopiesInner() *CoreBackupGetCopyProgressRequestCopiesInner {
	this := CoreBackupGetCopyProgressRequestCopiesInner{}
	var backupid string = "null"
	this.Backupid = &backupid
	var operation string = "null"
	this.Operation = &operation
	var restoreid string = "null"
	this.Restoreid = &restoreid
	return &this
}

// NewCoreBackupGetCopyProgressRequestCopiesInnerWithDefaults instantiates a new CoreBackupGetCopyProgressRequestCopiesInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreBackupGetCopyProgressRequestCopiesInnerWithDefaults() *CoreBackupGetCopyProgressRequestCopiesInner {
	this := CoreBackupGetCopyProgressRequestCopiesInner{}
	var backupid string = "null"
	this.Backupid = &backupid
	var operation string = "null"
	this.Operation = &operation
	var restoreid string = "null"
	this.Restoreid = &restoreid
	return &this
}

// GetBackupid returns the Backupid field value if set, zero value otherwise.
func (o *CoreBackupGetCopyProgressRequestCopiesInner) GetBackupid() string {
	if o == nil || IsNil(o.Backupid) {
		var ret string
		return ret
	}
	return *o.Backupid
}

// GetBackupidOk returns a tuple with the Backupid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBackupGetCopyProgressRequestCopiesInner) GetBackupidOk() (*string, bool) {
	if o == nil || IsNil(o.Backupid) {
		return nil, false
	}
	return o.Backupid, true
}

// HasBackupid returns a boolean if a field has been set.
func (o *CoreBackupGetCopyProgressRequestCopiesInner) HasBackupid() bool {
	if o != nil && !IsNil(o.Backupid) {
		return true
	}

	return false
}

// SetBackupid gets a reference to the given string and assigns it to the Backupid field.
func (o *CoreBackupGetCopyProgressRequestCopiesInner) SetBackupid(v string) {
	o.Backupid = &v
}

// GetOperation returns the Operation field value if set, zero value otherwise.
func (o *CoreBackupGetCopyProgressRequestCopiesInner) GetOperation() string {
	if o == nil || IsNil(o.Operation) {
		var ret string
		return ret
	}
	return *o.Operation
}

// GetOperationOk returns a tuple with the Operation field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBackupGetCopyProgressRequestCopiesInner) GetOperationOk() (*string, bool) {
	if o == nil || IsNil(o.Operation) {
		return nil, false
	}
	return o.Operation, true
}

// HasOperation returns a boolean if a field has been set.
func (o *CoreBackupGetCopyProgressRequestCopiesInner) HasOperation() bool {
	if o != nil && !IsNil(o.Operation) {
		return true
	}

	return false
}

// SetOperation gets a reference to the given string and assigns it to the Operation field.
func (o *CoreBackupGetCopyProgressRequestCopiesInner) SetOperation(v string) {
	o.Operation = &v
}

// GetRestoreid returns the Restoreid field value if set, zero value otherwise.
func (o *CoreBackupGetCopyProgressRequestCopiesInner) GetRestoreid() string {
	if o == nil || IsNil(o.Restoreid) {
		var ret string
		return ret
	}
	return *o.Restoreid
}

// GetRestoreidOk returns a tuple with the Restoreid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBackupGetCopyProgressRequestCopiesInner) GetRestoreidOk() (*string, bool) {
	if o == nil || IsNil(o.Restoreid) {
		return nil, false
	}
	return o.Restoreid, true
}

// HasRestoreid returns a boolean if a field has been set.
func (o *CoreBackupGetCopyProgressRequestCopiesInner) HasRestoreid() bool {
	if o != nil && !IsNil(o.Restoreid) {
		return true
	}

	return false
}

// SetRestoreid gets a reference to the given string and assigns it to the Restoreid field.
func (o *CoreBackupGetCopyProgressRequestCopiesInner) SetRestoreid(v string) {
	o.Restoreid = &v
}

func (o CoreBackupGetCopyProgressRequestCopiesInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreBackupGetCopyProgressRequestCopiesInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Backupid) {
		toSerialize["backupid"] = o.Backupid
	}
	if !IsNil(o.Operation) {
		toSerialize["operation"] = o.Operation
	}
	if !IsNil(o.Restoreid) {
		toSerialize["restoreid"] = o.Restoreid
	}
	return toSerialize, nil
}

type NullableCoreBackupGetCopyProgressRequestCopiesInner struct {
	value *CoreBackupGetCopyProgressRequestCopiesInner
	isSet bool
}

func (v NullableCoreBackupGetCopyProgressRequestCopiesInner) Get() *CoreBackupGetCopyProgressRequestCopiesInner {
	return v.value
}

func (v *NullableCoreBackupGetCopyProgressRequestCopiesInner) Set(val *CoreBackupGetCopyProgressRequestCopiesInner) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreBackupGetCopyProgressRequestCopiesInner) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreBackupGetCopyProgressRequestCopiesInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreBackupGetCopyProgressRequestCopiesInner(val *CoreBackupGetCopyProgressRequestCopiesInner) *NullableCoreBackupGetCopyProgressRequestCopiesInner {
	return &NullableCoreBackupGetCopyProgressRequestCopiesInner{value: val, isSet: true}
}

func (v NullableCoreBackupGetCopyProgressRequestCopiesInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreBackupGetCopyProgressRequestCopiesInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


