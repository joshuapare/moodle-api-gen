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

// checks if the CoreCompetencyUpdateCompetencyRequestCompetency type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreCompetencyUpdateCompetencyRequestCompetency{}

// CoreCompetencyUpdateCompetencyRequestCompetency struct for CoreCompetencyUpdateCompetencyRequestCompetency
type CoreCompetencyUpdateCompetencyRequestCompetency struct {
	// competencyframeworkid
	Competencyframeworkid *int32 `json:"competencyframeworkid,omitempty"`
	// description
	Description *string `json:"description,omitempty"`
	// description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
	Descriptionformat *int32 `json:"descriptionformat,omitempty"`
	// id
	Id int32 `json:"id"`
	// idnumber
	Idnumber *string `json:"idnumber,omitempty"`
	// parentid
	Parentid *int32 `json:"parentid,omitempty"`
	// path
	Path *string `json:"path,omitempty"`
	// ruleconfig
	Ruleconfig *string `json:"ruleconfig,omitempty"`
	// ruleoutcome
	Ruleoutcome *int32 `json:"ruleoutcome,omitempty"`
	// ruletype
	Ruletype *string `json:"ruletype,omitempty"`
	// scaleconfiguration
	Scaleconfiguration *string `json:"scaleconfiguration,omitempty"`
	// scaleid
	Scaleid *int32 `json:"scaleid,omitempty"`
	// shortname
	Shortname *string `json:"shortname,omitempty"`
	// sortorder
	Sortorder *int32 `json:"sortorder,omitempty"`
	// timecreated
	Timecreated *int32 `json:"timecreated,omitempty"`
	// timemodified
	Timemodified *int32 `json:"timemodified,omitempty"`
	// usermodified
	Usermodified *int32 `json:"usermodified,omitempty"`
}

type _CoreCompetencyUpdateCompetencyRequestCompetency CoreCompetencyUpdateCompetencyRequestCompetency

// NewCoreCompetencyUpdateCompetencyRequestCompetency instantiates a new CoreCompetencyUpdateCompetencyRequestCompetency object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreCompetencyUpdateCompetencyRequestCompetency(id int32) *CoreCompetencyUpdateCompetencyRequestCompetency {
	this := CoreCompetencyUpdateCompetencyRequestCompetency{}
	var competencyframeworkid int32 = null
	this.Competencyframeworkid = &competencyframeworkid
	var descriptionformat int32 = 1
	this.Descriptionformat = &descriptionformat
	this.Id = id
	var parentid int32 = null
	this.Parentid = &parentid
	var path string = "null"
	this.Path = &path
	var ruleoutcome int32 = null
	this.Ruleoutcome = &ruleoutcome
	var sortorder int32 = null
	this.Sortorder = &sortorder
	var usermodified int32 = null
	this.Usermodified = &usermodified
	return &this
}

// NewCoreCompetencyUpdateCompetencyRequestCompetencyWithDefaults instantiates a new CoreCompetencyUpdateCompetencyRequestCompetency object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreCompetencyUpdateCompetencyRequestCompetencyWithDefaults() *CoreCompetencyUpdateCompetencyRequestCompetency {
	this := CoreCompetencyUpdateCompetencyRequestCompetency{}
	var competencyframeworkid int32 = null
	this.Competencyframeworkid = &competencyframeworkid
	var descriptionformat int32 = 1
	this.Descriptionformat = &descriptionformat
	var parentid int32 = null
	this.Parentid = &parentid
	var path string = "null"
	this.Path = &path
	var ruleoutcome int32 = null
	this.Ruleoutcome = &ruleoutcome
	var sortorder int32 = null
	this.Sortorder = &sortorder
	var usermodified int32 = null
	this.Usermodified = &usermodified
	return &this
}

// GetCompetencyframeworkid returns the Competencyframeworkid field value if set, zero value otherwise.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetCompetencyframeworkid() int32 {
	if o == nil || IsNil(o.Competencyframeworkid) {
		var ret int32
		return ret
	}
	return *o.Competencyframeworkid
}

// GetCompetencyframeworkidOk returns a tuple with the Competencyframeworkid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetCompetencyframeworkidOk() (*int32, bool) {
	if o == nil || IsNil(o.Competencyframeworkid) {
		return nil, false
	}
	return o.Competencyframeworkid, true
}

// HasCompetencyframeworkid returns a boolean if a field has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasCompetencyframeworkid() bool {
	if o != nil && !IsNil(o.Competencyframeworkid) {
		return true
	}

	return false
}

// SetCompetencyframeworkid gets a reference to the given int32 and assigns it to the Competencyframeworkid field.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetCompetencyframeworkid(v int32) {
	o.Competencyframeworkid = &v
}

// GetDescription returns the Description field value if set, zero value otherwise.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetDescription() string {
	if o == nil || IsNil(o.Description) {
		var ret string
		return ret
	}
	return *o.Description
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetDescriptionOk() (*string, bool) {
	if o == nil || IsNil(o.Description) {
		return nil, false
	}
	return o.Description, true
}

// HasDescription returns a boolean if a field has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasDescription() bool {
	if o != nil && !IsNil(o.Description) {
		return true
	}

	return false
}

// SetDescription gets a reference to the given string and assigns it to the Description field.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetDescription(v string) {
	o.Description = &v
}

// GetDescriptionformat returns the Descriptionformat field value if set, zero value otherwise.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetDescriptionformat() int32 {
	if o == nil || IsNil(o.Descriptionformat) {
		var ret int32
		return ret
	}
	return *o.Descriptionformat
}

// GetDescriptionformatOk returns a tuple with the Descriptionformat field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetDescriptionformatOk() (*int32, bool) {
	if o == nil || IsNil(o.Descriptionformat) {
		return nil, false
	}
	return o.Descriptionformat, true
}

// HasDescriptionformat returns a boolean if a field has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasDescriptionformat() bool {
	if o != nil && !IsNil(o.Descriptionformat) {
		return true
	}

	return false
}

// SetDescriptionformat gets a reference to the given int32 and assigns it to the Descriptionformat field.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetDescriptionformat(v int32) {
	o.Descriptionformat = &v
}

// GetId returns the Id field value
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetId() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetIdOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetId(v int32) {
	o.Id = v
}

// GetIdnumber returns the Idnumber field value if set, zero value otherwise.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetIdnumber() string {
	if o == nil || IsNil(o.Idnumber) {
		var ret string
		return ret
	}
	return *o.Idnumber
}

// GetIdnumberOk returns a tuple with the Idnumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetIdnumberOk() (*string, bool) {
	if o == nil || IsNil(o.Idnumber) {
		return nil, false
	}
	return o.Idnumber, true
}

// HasIdnumber returns a boolean if a field has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasIdnumber() bool {
	if o != nil && !IsNil(o.Idnumber) {
		return true
	}

	return false
}

// SetIdnumber gets a reference to the given string and assigns it to the Idnumber field.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetIdnumber(v string) {
	o.Idnumber = &v
}

// GetParentid returns the Parentid field value if set, zero value otherwise.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetParentid() int32 {
	if o == nil || IsNil(o.Parentid) {
		var ret int32
		return ret
	}
	return *o.Parentid
}

// GetParentidOk returns a tuple with the Parentid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetParentidOk() (*int32, bool) {
	if o == nil || IsNil(o.Parentid) {
		return nil, false
	}
	return o.Parentid, true
}

// HasParentid returns a boolean if a field has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasParentid() bool {
	if o != nil && !IsNil(o.Parentid) {
		return true
	}

	return false
}

// SetParentid gets a reference to the given int32 and assigns it to the Parentid field.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetParentid(v int32) {
	o.Parentid = &v
}

// GetPath returns the Path field value if set, zero value otherwise.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetPath() string {
	if o == nil || IsNil(o.Path) {
		var ret string
		return ret
	}
	return *o.Path
}

// GetPathOk returns a tuple with the Path field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetPathOk() (*string, bool) {
	if o == nil || IsNil(o.Path) {
		return nil, false
	}
	return o.Path, true
}

// HasPath returns a boolean if a field has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasPath() bool {
	if o != nil && !IsNil(o.Path) {
		return true
	}

	return false
}

// SetPath gets a reference to the given string and assigns it to the Path field.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetPath(v string) {
	o.Path = &v
}

// GetRuleconfig returns the Ruleconfig field value if set, zero value otherwise.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetRuleconfig() string {
	if o == nil || IsNil(o.Ruleconfig) {
		var ret string
		return ret
	}
	return *o.Ruleconfig
}

// GetRuleconfigOk returns a tuple with the Ruleconfig field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetRuleconfigOk() (*string, bool) {
	if o == nil || IsNil(o.Ruleconfig) {
		return nil, false
	}
	return o.Ruleconfig, true
}

// HasRuleconfig returns a boolean if a field has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasRuleconfig() bool {
	if o != nil && !IsNil(o.Ruleconfig) {
		return true
	}

	return false
}

// SetRuleconfig gets a reference to the given string and assigns it to the Ruleconfig field.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetRuleconfig(v string) {
	o.Ruleconfig = &v
}

// GetRuleoutcome returns the Ruleoutcome field value if set, zero value otherwise.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetRuleoutcome() int32 {
	if o == nil || IsNil(o.Ruleoutcome) {
		var ret int32
		return ret
	}
	return *o.Ruleoutcome
}

// GetRuleoutcomeOk returns a tuple with the Ruleoutcome field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetRuleoutcomeOk() (*int32, bool) {
	if o == nil || IsNil(o.Ruleoutcome) {
		return nil, false
	}
	return o.Ruleoutcome, true
}

// HasRuleoutcome returns a boolean if a field has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasRuleoutcome() bool {
	if o != nil && !IsNil(o.Ruleoutcome) {
		return true
	}

	return false
}

// SetRuleoutcome gets a reference to the given int32 and assigns it to the Ruleoutcome field.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetRuleoutcome(v int32) {
	o.Ruleoutcome = &v
}

// GetRuletype returns the Ruletype field value if set, zero value otherwise.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetRuletype() string {
	if o == nil || IsNil(o.Ruletype) {
		var ret string
		return ret
	}
	return *o.Ruletype
}

// GetRuletypeOk returns a tuple with the Ruletype field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetRuletypeOk() (*string, bool) {
	if o == nil || IsNil(o.Ruletype) {
		return nil, false
	}
	return o.Ruletype, true
}

// HasRuletype returns a boolean if a field has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasRuletype() bool {
	if o != nil && !IsNil(o.Ruletype) {
		return true
	}

	return false
}

// SetRuletype gets a reference to the given string and assigns it to the Ruletype field.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetRuletype(v string) {
	o.Ruletype = &v
}

// GetScaleconfiguration returns the Scaleconfiguration field value if set, zero value otherwise.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetScaleconfiguration() string {
	if o == nil || IsNil(o.Scaleconfiguration) {
		var ret string
		return ret
	}
	return *o.Scaleconfiguration
}

// GetScaleconfigurationOk returns a tuple with the Scaleconfiguration field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetScaleconfigurationOk() (*string, bool) {
	if o == nil || IsNil(o.Scaleconfiguration) {
		return nil, false
	}
	return o.Scaleconfiguration, true
}

// HasScaleconfiguration returns a boolean if a field has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasScaleconfiguration() bool {
	if o != nil && !IsNil(o.Scaleconfiguration) {
		return true
	}

	return false
}

// SetScaleconfiguration gets a reference to the given string and assigns it to the Scaleconfiguration field.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetScaleconfiguration(v string) {
	o.Scaleconfiguration = &v
}

// GetScaleid returns the Scaleid field value if set, zero value otherwise.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetScaleid() int32 {
	if o == nil || IsNil(o.Scaleid) {
		var ret int32
		return ret
	}
	return *o.Scaleid
}

// GetScaleidOk returns a tuple with the Scaleid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetScaleidOk() (*int32, bool) {
	if o == nil || IsNil(o.Scaleid) {
		return nil, false
	}
	return o.Scaleid, true
}

// HasScaleid returns a boolean if a field has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasScaleid() bool {
	if o != nil && !IsNil(o.Scaleid) {
		return true
	}

	return false
}

// SetScaleid gets a reference to the given int32 and assigns it to the Scaleid field.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetScaleid(v int32) {
	o.Scaleid = &v
}

// GetShortname returns the Shortname field value if set, zero value otherwise.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetShortname() string {
	if o == nil || IsNil(o.Shortname) {
		var ret string
		return ret
	}
	return *o.Shortname
}

// GetShortnameOk returns a tuple with the Shortname field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetShortnameOk() (*string, bool) {
	if o == nil || IsNil(o.Shortname) {
		return nil, false
	}
	return o.Shortname, true
}

// HasShortname returns a boolean if a field has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasShortname() bool {
	if o != nil && !IsNil(o.Shortname) {
		return true
	}

	return false
}

// SetShortname gets a reference to the given string and assigns it to the Shortname field.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetShortname(v string) {
	o.Shortname = &v
}

// GetSortorder returns the Sortorder field value if set, zero value otherwise.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetSortorder() int32 {
	if o == nil || IsNil(o.Sortorder) {
		var ret int32
		return ret
	}
	return *o.Sortorder
}

// GetSortorderOk returns a tuple with the Sortorder field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetSortorderOk() (*int32, bool) {
	if o == nil || IsNil(o.Sortorder) {
		return nil, false
	}
	return o.Sortorder, true
}

// HasSortorder returns a boolean if a field has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasSortorder() bool {
	if o != nil && !IsNil(o.Sortorder) {
		return true
	}

	return false
}

// SetSortorder gets a reference to the given int32 and assigns it to the Sortorder field.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetSortorder(v int32) {
	o.Sortorder = &v
}

// GetTimecreated returns the Timecreated field value if set, zero value otherwise.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetTimecreated() int32 {
	if o == nil || IsNil(o.Timecreated) {
		var ret int32
		return ret
	}
	return *o.Timecreated
}

// GetTimecreatedOk returns a tuple with the Timecreated field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetTimecreatedOk() (*int32, bool) {
	if o == nil || IsNil(o.Timecreated) {
		return nil, false
	}
	return o.Timecreated, true
}

// HasTimecreated returns a boolean if a field has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasTimecreated() bool {
	if o != nil && !IsNil(o.Timecreated) {
		return true
	}

	return false
}

// SetTimecreated gets a reference to the given int32 and assigns it to the Timecreated field.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetTimecreated(v int32) {
	o.Timecreated = &v
}

// GetTimemodified returns the Timemodified field value if set, zero value otherwise.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetTimemodified() int32 {
	if o == nil || IsNil(o.Timemodified) {
		var ret int32
		return ret
	}
	return *o.Timemodified
}

// GetTimemodifiedOk returns a tuple with the Timemodified field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetTimemodifiedOk() (*int32, bool) {
	if o == nil || IsNil(o.Timemodified) {
		return nil, false
	}
	return o.Timemodified, true
}

// HasTimemodified returns a boolean if a field has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasTimemodified() bool {
	if o != nil && !IsNil(o.Timemodified) {
		return true
	}

	return false
}

// SetTimemodified gets a reference to the given int32 and assigns it to the Timemodified field.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetTimemodified(v int32) {
	o.Timemodified = &v
}

// GetUsermodified returns the Usermodified field value if set, zero value otherwise.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetUsermodified() int32 {
	if o == nil || IsNil(o.Usermodified) {
		var ret int32
		return ret
	}
	return *o.Usermodified
}

// GetUsermodifiedOk returns a tuple with the Usermodified field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetUsermodifiedOk() (*int32, bool) {
	if o == nil || IsNil(o.Usermodified) {
		return nil, false
	}
	return o.Usermodified, true
}

// HasUsermodified returns a boolean if a field has been set.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasUsermodified() bool {
	if o != nil && !IsNil(o.Usermodified) {
		return true
	}

	return false
}

// SetUsermodified gets a reference to the given int32 and assigns it to the Usermodified field.
func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetUsermodified(v int32) {
	o.Usermodified = &v
}

func (o CoreCompetencyUpdateCompetencyRequestCompetency) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreCompetencyUpdateCompetencyRequestCompetency) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Competencyframeworkid) {
		toSerialize["competencyframeworkid"] = o.Competencyframeworkid
	}
	if !IsNil(o.Description) {
		toSerialize["description"] = o.Description
	}
	if !IsNil(o.Descriptionformat) {
		toSerialize["descriptionformat"] = o.Descriptionformat
	}
	toSerialize["id"] = o.Id
	if !IsNil(o.Idnumber) {
		toSerialize["idnumber"] = o.Idnumber
	}
	if !IsNil(o.Parentid) {
		toSerialize["parentid"] = o.Parentid
	}
	if !IsNil(o.Path) {
		toSerialize["path"] = o.Path
	}
	if !IsNil(o.Ruleconfig) {
		toSerialize["ruleconfig"] = o.Ruleconfig
	}
	if !IsNil(o.Ruleoutcome) {
		toSerialize["ruleoutcome"] = o.Ruleoutcome
	}
	if !IsNil(o.Ruletype) {
		toSerialize["ruletype"] = o.Ruletype
	}
	if !IsNil(o.Scaleconfiguration) {
		toSerialize["scaleconfiguration"] = o.Scaleconfiguration
	}
	if !IsNil(o.Scaleid) {
		toSerialize["scaleid"] = o.Scaleid
	}
	if !IsNil(o.Shortname) {
		toSerialize["shortname"] = o.Shortname
	}
	if !IsNil(o.Sortorder) {
		toSerialize["sortorder"] = o.Sortorder
	}
	if !IsNil(o.Timecreated) {
		toSerialize["timecreated"] = o.Timecreated
	}
	if !IsNil(o.Timemodified) {
		toSerialize["timemodified"] = o.Timemodified
	}
	if !IsNil(o.Usermodified) {
		toSerialize["usermodified"] = o.Usermodified
	}
	return toSerialize, nil
}

func (o *CoreCompetencyUpdateCompetencyRequestCompetency) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"id",
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

	varCoreCompetencyUpdateCompetencyRequestCompetency := _CoreCompetencyUpdateCompetencyRequestCompetency{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreCompetencyUpdateCompetencyRequestCompetency)

	if err != nil {
		return err
	}

	*o = CoreCompetencyUpdateCompetencyRequestCompetency(varCoreCompetencyUpdateCompetencyRequestCompetency)

	return err
}

type NullableCoreCompetencyUpdateCompetencyRequestCompetency struct {
	value *CoreCompetencyUpdateCompetencyRequestCompetency
	isSet bool
}

func (v NullableCoreCompetencyUpdateCompetencyRequestCompetency) Get() *CoreCompetencyUpdateCompetencyRequestCompetency {
	return v.value
}

func (v *NullableCoreCompetencyUpdateCompetencyRequestCompetency) Set(val *CoreCompetencyUpdateCompetencyRequestCompetency) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreCompetencyUpdateCompetencyRequestCompetency) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreCompetencyUpdateCompetencyRequestCompetency) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreCompetencyUpdateCompetencyRequestCompetency(val *CoreCompetencyUpdateCompetencyRequestCompetency) *NullableCoreCompetencyUpdateCompetencyRequestCompetency {
	return &NullableCoreCompetencyUpdateCompetencyRequestCompetency{value: val, isSet: true}
}

func (v NullableCoreCompetencyUpdateCompetencyRequestCompetency) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreCompetencyUpdateCompetencyRequestCompetency) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


