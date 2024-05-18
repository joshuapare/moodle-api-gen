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

// checks if the CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner{}

// CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner struct for CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner
type CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner struct {
	// The id of the contact request
	Id *int32 `json:"id,omitempty"`
	// The id of the user confirming the request
	Requesteduserid *int32 `json:"requesteduserid,omitempty"`
	// The timecreated timestamp for the contact request
	Timecreated *int32 `json:"timecreated,omitempty"`
	// The id of the user who created the contact request
	Userid *int32 `json:"userid,omitempty"`
}

// NewCoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner instantiates a new CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner() *CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner {
	this := CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner{}
	return &this
}

// NewCoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInnerWithDefaults instantiates a new CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInnerWithDefaults() *CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner {
	this := CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner{}
	return &this
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner) GetId() int32 {
	if o == nil || IsNil(o.Id) {
		var ret int32
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner) GetIdOk() (*int32, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given int32 and assigns it to the Id field.
func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner) SetId(v int32) {
	o.Id = &v
}

// GetRequesteduserid returns the Requesteduserid field value if set, zero value otherwise.
func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner) GetRequesteduserid() int32 {
	if o == nil || IsNil(o.Requesteduserid) {
		var ret int32
		return ret
	}
	return *o.Requesteduserid
}

// GetRequesteduseridOk returns a tuple with the Requesteduserid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner) GetRequesteduseridOk() (*int32, bool) {
	if o == nil || IsNil(o.Requesteduserid) {
		return nil, false
	}
	return o.Requesteduserid, true
}

// HasRequesteduserid returns a boolean if a field has been set.
func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner) HasRequesteduserid() bool {
	if o != nil && !IsNil(o.Requesteduserid) {
		return true
	}

	return false
}

// SetRequesteduserid gets a reference to the given int32 and assigns it to the Requesteduserid field.
func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner) SetRequesteduserid(v int32) {
	o.Requesteduserid = &v
}

// GetTimecreated returns the Timecreated field value if set, zero value otherwise.
func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner) GetTimecreated() int32 {
	if o == nil || IsNil(o.Timecreated) {
		var ret int32
		return ret
	}
	return *o.Timecreated
}

// GetTimecreatedOk returns a tuple with the Timecreated field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner) GetTimecreatedOk() (*int32, bool) {
	if o == nil || IsNil(o.Timecreated) {
		return nil, false
	}
	return o.Timecreated, true
}

// HasTimecreated returns a boolean if a field has been set.
func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner) HasTimecreated() bool {
	if o != nil && !IsNil(o.Timecreated) {
		return true
	}

	return false
}

// SetTimecreated gets a reference to the given int32 and assigns it to the Timecreated field.
func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner) SetTimecreated(v int32) {
	o.Timecreated = &v
}

// GetUserid returns the Userid field value if set, zero value otherwise.
func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner) GetUserid() int32 {
	if o == nil || IsNil(o.Userid) {
		var ret int32
		return ret
	}
	return *o.Userid
}

// GetUseridOk returns a tuple with the Userid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner) GetUseridOk() (*int32, bool) {
	if o == nil || IsNil(o.Userid) {
		return nil, false
	}
	return o.Userid, true
}

// HasUserid returns a boolean if a field has been set.
func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner) HasUserid() bool {
	if o != nil && !IsNil(o.Userid) {
		return true
	}

	return false
}

// SetUserid gets a reference to the given int32 and assigns it to the Userid field.
func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner) SetUserid(v int32) {
	o.Userid = &v
}

func (o CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.Requesteduserid) {
		toSerialize["requesteduserid"] = o.Requesteduserid
	}
	if !IsNil(o.Timecreated) {
		toSerialize["timecreated"] = o.Timecreated
	}
	if !IsNil(o.Userid) {
		toSerialize["userid"] = o.Userid
	}
	return toSerialize, nil
}

type NullableCoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner struct {
	value *CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner
	isSet bool
}

func (v NullableCoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner) Get() *CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner {
	return v.value
}

func (v *NullableCoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner) Set(val *CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner(val *CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner) *NullableCoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner {
	return &NullableCoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner{value: val, isSet: true}
}

func (v NullableCoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


