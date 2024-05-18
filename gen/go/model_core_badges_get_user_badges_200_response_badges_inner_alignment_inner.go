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

// checks if the CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner{}

// CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner struct for CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner
type CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner struct {
	// Badge id
	Badgeid *int32 `json:"badgeid,omitempty"`
	// Alignment id
	Id *int32 `json:"id,omitempty"`
	// Target code
	TargetCode *string `json:"targetCode,omitempty"`
	// Target description
	TargetDescription *string `json:"targetDescription,omitempty"`
	// Target framework
	TargetFramework *string `json:"targetFramework,omitempty"`
	// Target name
	TargetName *string `json:"targetName,omitempty"`
	// Target URL
	TargetUrl *string `json:"targetUrl,omitempty"`
}

// NewCoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner instantiates a new CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner() *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner {
	this := CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner{}
	return &this
}

// NewCoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInnerWithDefaults instantiates a new CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInnerWithDefaults() *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner {
	this := CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner{}
	return &this
}

// GetBadgeid returns the Badgeid field value if set, zero value otherwise.
func (o *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) GetBadgeid() int32 {
	if o == nil || IsNil(o.Badgeid) {
		var ret int32
		return ret
	}
	return *o.Badgeid
}

// GetBadgeidOk returns a tuple with the Badgeid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) GetBadgeidOk() (*int32, bool) {
	if o == nil || IsNil(o.Badgeid) {
		return nil, false
	}
	return o.Badgeid, true
}

// HasBadgeid returns a boolean if a field has been set.
func (o *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) HasBadgeid() bool {
	if o != nil && !IsNil(o.Badgeid) {
		return true
	}

	return false
}

// SetBadgeid gets a reference to the given int32 and assigns it to the Badgeid field.
func (o *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) SetBadgeid(v int32) {
	o.Badgeid = &v
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) GetId() int32 {
	if o == nil || IsNil(o.Id) {
		var ret int32
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) GetIdOk() (*int32, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given int32 and assigns it to the Id field.
func (o *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) SetId(v int32) {
	o.Id = &v
}

// GetTargetCode returns the TargetCode field value if set, zero value otherwise.
func (o *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) GetTargetCode() string {
	if o == nil || IsNil(o.TargetCode) {
		var ret string
		return ret
	}
	return *o.TargetCode
}

// GetTargetCodeOk returns a tuple with the TargetCode field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) GetTargetCodeOk() (*string, bool) {
	if o == nil || IsNil(o.TargetCode) {
		return nil, false
	}
	return o.TargetCode, true
}

// HasTargetCode returns a boolean if a field has been set.
func (o *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) HasTargetCode() bool {
	if o != nil && !IsNil(o.TargetCode) {
		return true
	}

	return false
}

// SetTargetCode gets a reference to the given string and assigns it to the TargetCode field.
func (o *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) SetTargetCode(v string) {
	o.TargetCode = &v
}

// GetTargetDescription returns the TargetDescription field value if set, zero value otherwise.
func (o *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) GetTargetDescription() string {
	if o == nil || IsNil(o.TargetDescription) {
		var ret string
		return ret
	}
	return *o.TargetDescription
}

// GetTargetDescriptionOk returns a tuple with the TargetDescription field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) GetTargetDescriptionOk() (*string, bool) {
	if o == nil || IsNil(o.TargetDescription) {
		return nil, false
	}
	return o.TargetDescription, true
}

// HasTargetDescription returns a boolean if a field has been set.
func (o *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) HasTargetDescription() bool {
	if o != nil && !IsNil(o.TargetDescription) {
		return true
	}

	return false
}

// SetTargetDescription gets a reference to the given string and assigns it to the TargetDescription field.
func (o *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) SetTargetDescription(v string) {
	o.TargetDescription = &v
}

// GetTargetFramework returns the TargetFramework field value if set, zero value otherwise.
func (o *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) GetTargetFramework() string {
	if o == nil || IsNil(o.TargetFramework) {
		var ret string
		return ret
	}
	return *o.TargetFramework
}

// GetTargetFrameworkOk returns a tuple with the TargetFramework field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) GetTargetFrameworkOk() (*string, bool) {
	if o == nil || IsNil(o.TargetFramework) {
		return nil, false
	}
	return o.TargetFramework, true
}

// HasTargetFramework returns a boolean if a field has been set.
func (o *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) HasTargetFramework() bool {
	if o != nil && !IsNil(o.TargetFramework) {
		return true
	}

	return false
}

// SetTargetFramework gets a reference to the given string and assigns it to the TargetFramework field.
func (o *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) SetTargetFramework(v string) {
	o.TargetFramework = &v
}

// GetTargetName returns the TargetName field value if set, zero value otherwise.
func (o *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) GetTargetName() string {
	if o == nil || IsNil(o.TargetName) {
		var ret string
		return ret
	}
	return *o.TargetName
}

// GetTargetNameOk returns a tuple with the TargetName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) GetTargetNameOk() (*string, bool) {
	if o == nil || IsNil(o.TargetName) {
		return nil, false
	}
	return o.TargetName, true
}

// HasTargetName returns a boolean if a field has been set.
func (o *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) HasTargetName() bool {
	if o != nil && !IsNil(o.TargetName) {
		return true
	}

	return false
}

// SetTargetName gets a reference to the given string and assigns it to the TargetName field.
func (o *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) SetTargetName(v string) {
	o.TargetName = &v
}

// GetTargetUrl returns the TargetUrl field value if set, zero value otherwise.
func (o *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) GetTargetUrl() string {
	if o == nil || IsNil(o.TargetUrl) {
		var ret string
		return ret
	}
	return *o.TargetUrl
}

// GetTargetUrlOk returns a tuple with the TargetUrl field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) GetTargetUrlOk() (*string, bool) {
	if o == nil || IsNil(o.TargetUrl) {
		return nil, false
	}
	return o.TargetUrl, true
}

// HasTargetUrl returns a boolean if a field has been set.
func (o *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) HasTargetUrl() bool {
	if o != nil && !IsNil(o.TargetUrl) {
		return true
	}

	return false
}

// SetTargetUrl gets a reference to the given string and assigns it to the TargetUrl field.
func (o *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) SetTargetUrl(v string) {
	o.TargetUrl = &v
}

func (o CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Badgeid) {
		toSerialize["badgeid"] = o.Badgeid
	}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.TargetCode) {
		toSerialize["targetCode"] = o.TargetCode
	}
	if !IsNil(o.TargetDescription) {
		toSerialize["targetDescription"] = o.TargetDescription
	}
	if !IsNil(o.TargetFramework) {
		toSerialize["targetFramework"] = o.TargetFramework
	}
	if !IsNil(o.TargetName) {
		toSerialize["targetName"] = o.TargetName
	}
	if !IsNil(o.TargetUrl) {
		toSerialize["targetUrl"] = o.TargetUrl
	}
	return toSerialize, nil
}

type NullableCoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner struct {
	value *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner
	isSet bool
}

func (v NullableCoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) Get() *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner {
	return v.value
}

func (v *NullableCoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) Set(val *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner(val *CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) *NullableCoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner {
	return &NullableCoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner{value: val, isSet: true}
}

func (v NullableCoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


