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

// checks if the CoreCompetencyCreateTemplate200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CoreCompetencyCreateTemplate200Response{}

// CoreCompetencyCreateTemplate200Response struct for CoreCompetencyCreateTemplate200Response
type CoreCompetencyCreateTemplate200Response struct {
	// canmanage
	Canmanage bool `json:"canmanage"`
	// canread
	Canread bool `json:"canread"`
	// cohortscount
	Cohortscount int32 `json:"cohortscount"`
	// contextid
	Contextid int32 `json:"contextid"`
	// contextname
	Contextname string `json:"contextname"`
	// contextnamenoprefix
	Contextnamenoprefix string `json:"contextnamenoprefix"`
	// description
	Description string `json:"description"`
	// description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
	Descriptionformat *int32 `json:"descriptionformat,omitempty"`
	// duedate
	Duedate int32 `json:"duedate"`
	// duedateformatted
	Duedateformatted string `json:"duedateformatted"`
	// id
	Id int32 `json:"id"`
	// planscount
	Planscount int32 `json:"planscount"`
	// shortname
	Shortname string `json:"shortname"`
	// timecreated
	Timecreated int32 `json:"timecreated"`
	// timemodified
	Timemodified int32 `json:"timemodified"`
	// usermodified
	Usermodified int32 `json:"usermodified"`
	// visible
	Visible bool `json:"visible"`
}

type _CoreCompetencyCreateTemplate200Response CoreCompetencyCreateTemplate200Response

// NewCoreCompetencyCreateTemplate200Response instantiates a new CoreCompetencyCreateTemplate200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCoreCompetencyCreateTemplate200Response(canmanage bool, canread bool, cohortscount int32, contextid int32, contextname string, contextnamenoprefix string, description string, duedate int32, duedateformatted string, id int32, planscount int32, shortname string, timecreated int32, timemodified int32, usermodified int32, visible bool) *CoreCompetencyCreateTemplate200Response {
	this := CoreCompetencyCreateTemplate200Response{}
	this.Canmanage = canmanage
	this.Canread = canread
	this.Cohortscount = cohortscount
	this.Contextid = contextid
	this.Contextname = contextname
	this.Contextnamenoprefix = contextnamenoprefix
	this.Description = description
	var descriptionformat int32 = 1
	this.Descriptionformat = &descriptionformat
	this.Duedate = duedate
	this.Duedateformatted = duedateformatted
	this.Id = id
	this.Planscount = planscount
	this.Shortname = shortname
	this.Timecreated = timecreated
	this.Timemodified = timemodified
	this.Usermodified = usermodified
	this.Visible = visible
	return &this
}

// NewCoreCompetencyCreateTemplate200ResponseWithDefaults instantiates a new CoreCompetencyCreateTemplate200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCoreCompetencyCreateTemplate200ResponseWithDefaults() *CoreCompetencyCreateTemplate200Response {
	this := CoreCompetencyCreateTemplate200Response{}
	var description string = ""
	this.Description = description
	var descriptionformat int32 = 1
	this.Descriptionformat = &descriptionformat
	var duedate int32 = 0
	this.Duedate = duedate
	var id int32 = 0
	this.Id = id
	var timecreated int32 = 0
	this.Timecreated = timecreated
	var timemodified int32 = 0
	this.Timemodified = timemodified
	var usermodified int32 = 0
	this.Usermodified = usermodified
	var visible bool = 1
	this.Visible = visible
	return &this
}

// GetCanmanage returns the Canmanage field value
func (o *CoreCompetencyCreateTemplate200Response) GetCanmanage() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Canmanage
}

// GetCanmanageOk returns a tuple with the Canmanage field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyCreateTemplate200Response) GetCanmanageOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Canmanage, true
}

// SetCanmanage sets field value
func (o *CoreCompetencyCreateTemplate200Response) SetCanmanage(v bool) {
	o.Canmanage = v
}

// GetCanread returns the Canread field value
func (o *CoreCompetencyCreateTemplate200Response) GetCanread() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Canread
}

// GetCanreadOk returns a tuple with the Canread field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyCreateTemplate200Response) GetCanreadOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Canread, true
}

// SetCanread sets field value
func (o *CoreCompetencyCreateTemplate200Response) SetCanread(v bool) {
	o.Canread = v
}

// GetCohortscount returns the Cohortscount field value
func (o *CoreCompetencyCreateTemplate200Response) GetCohortscount() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Cohortscount
}

// GetCohortscountOk returns a tuple with the Cohortscount field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyCreateTemplate200Response) GetCohortscountOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Cohortscount, true
}

// SetCohortscount sets field value
func (o *CoreCompetencyCreateTemplate200Response) SetCohortscount(v int32) {
	o.Cohortscount = v
}

// GetContextid returns the Contextid field value
func (o *CoreCompetencyCreateTemplate200Response) GetContextid() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Contextid
}

// GetContextidOk returns a tuple with the Contextid field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyCreateTemplate200Response) GetContextidOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Contextid, true
}

// SetContextid sets field value
func (o *CoreCompetencyCreateTemplate200Response) SetContextid(v int32) {
	o.Contextid = v
}

// GetContextname returns the Contextname field value
func (o *CoreCompetencyCreateTemplate200Response) GetContextname() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Contextname
}

// GetContextnameOk returns a tuple with the Contextname field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyCreateTemplate200Response) GetContextnameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Contextname, true
}

// SetContextname sets field value
func (o *CoreCompetencyCreateTemplate200Response) SetContextname(v string) {
	o.Contextname = v
}

// GetContextnamenoprefix returns the Contextnamenoprefix field value
func (o *CoreCompetencyCreateTemplate200Response) GetContextnamenoprefix() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Contextnamenoprefix
}

// GetContextnamenoprefixOk returns a tuple with the Contextnamenoprefix field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyCreateTemplate200Response) GetContextnamenoprefixOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Contextnamenoprefix, true
}

// SetContextnamenoprefix sets field value
func (o *CoreCompetencyCreateTemplate200Response) SetContextnamenoprefix(v string) {
	o.Contextnamenoprefix = v
}

// GetDescription returns the Description field value
func (o *CoreCompetencyCreateTemplate200Response) GetDescription() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Description
}

// GetDescriptionOk returns a tuple with the Description field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyCreateTemplate200Response) GetDescriptionOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Description, true
}

// SetDescription sets field value
func (o *CoreCompetencyCreateTemplate200Response) SetDescription(v string) {
	o.Description = v
}

// GetDescriptionformat returns the Descriptionformat field value if set, zero value otherwise.
func (o *CoreCompetencyCreateTemplate200Response) GetDescriptionformat() int32 {
	if o == nil || IsNil(o.Descriptionformat) {
		var ret int32
		return ret
	}
	return *o.Descriptionformat
}

// GetDescriptionformatOk returns a tuple with the Descriptionformat field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CoreCompetencyCreateTemplate200Response) GetDescriptionformatOk() (*int32, bool) {
	if o == nil || IsNil(o.Descriptionformat) {
		return nil, false
	}
	return o.Descriptionformat, true
}

// HasDescriptionformat returns a boolean if a field has been set.
func (o *CoreCompetencyCreateTemplate200Response) HasDescriptionformat() bool {
	if o != nil && !IsNil(o.Descriptionformat) {
		return true
	}

	return false
}

// SetDescriptionformat gets a reference to the given int32 and assigns it to the Descriptionformat field.
func (o *CoreCompetencyCreateTemplate200Response) SetDescriptionformat(v int32) {
	o.Descriptionformat = &v
}

// GetDuedate returns the Duedate field value
func (o *CoreCompetencyCreateTemplate200Response) GetDuedate() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Duedate
}

// GetDuedateOk returns a tuple with the Duedate field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyCreateTemplate200Response) GetDuedateOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Duedate, true
}

// SetDuedate sets field value
func (o *CoreCompetencyCreateTemplate200Response) SetDuedate(v int32) {
	o.Duedate = v
}

// GetDuedateformatted returns the Duedateformatted field value
func (o *CoreCompetencyCreateTemplate200Response) GetDuedateformatted() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Duedateformatted
}

// GetDuedateformattedOk returns a tuple with the Duedateformatted field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyCreateTemplate200Response) GetDuedateformattedOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Duedateformatted, true
}

// SetDuedateformatted sets field value
func (o *CoreCompetencyCreateTemplate200Response) SetDuedateformatted(v string) {
	o.Duedateformatted = v
}

// GetId returns the Id field value
func (o *CoreCompetencyCreateTemplate200Response) GetId() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyCreateTemplate200Response) GetIdOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *CoreCompetencyCreateTemplate200Response) SetId(v int32) {
	o.Id = v
}

// GetPlanscount returns the Planscount field value
func (o *CoreCompetencyCreateTemplate200Response) GetPlanscount() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Planscount
}

// GetPlanscountOk returns a tuple with the Planscount field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyCreateTemplate200Response) GetPlanscountOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Planscount, true
}

// SetPlanscount sets field value
func (o *CoreCompetencyCreateTemplate200Response) SetPlanscount(v int32) {
	o.Planscount = v
}

// GetShortname returns the Shortname field value
func (o *CoreCompetencyCreateTemplate200Response) GetShortname() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Shortname
}

// GetShortnameOk returns a tuple with the Shortname field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyCreateTemplate200Response) GetShortnameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Shortname, true
}

// SetShortname sets field value
func (o *CoreCompetencyCreateTemplate200Response) SetShortname(v string) {
	o.Shortname = v
}

// GetTimecreated returns the Timecreated field value
func (o *CoreCompetencyCreateTemplate200Response) GetTimecreated() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Timecreated
}

// GetTimecreatedOk returns a tuple with the Timecreated field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyCreateTemplate200Response) GetTimecreatedOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Timecreated, true
}

// SetTimecreated sets field value
func (o *CoreCompetencyCreateTemplate200Response) SetTimecreated(v int32) {
	o.Timecreated = v
}

// GetTimemodified returns the Timemodified field value
func (o *CoreCompetencyCreateTemplate200Response) GetTimemodified() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Timemodified
}

// GetTimemodifiedOk returns a tuple with the Timemodified field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyCreateTemplate200Response) GetTimemodifiedOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Timemodified, true
}

// SetTimemodified sets field value
func (o *CoreCompetencyCreateTemplate200Response) SetTimemodified(v int32) {
	o.Timemodified = v
}

// GetUsermodified returns the Usermodified field value
func (o *CoreCompetencyCreateTemplate200Response) GetUsermodified() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Usermodified
}

// GetUsermodifiedOk returns a tuple with the Usermodified field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyCreateTemplate200Response) GetUsermodifiedOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Usermodified, true
}

// SetUsermodified sets field value
func (o *CoreCompetencyCreateTemplate200Response) SetUsermodified(v int32) {
	o.Usermodified = v
}

// GetVisible returns the Visible field value
func (o *CoreCompetencyCreateTemplate200Response) GetVisible() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Visible
}

// GetVisibleOk returns a tuple with the Visible field value
// and a boolean to check if the value has been set.
func (o *CoreCompetencyCreateTemplate200Response) GetVisibleOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Visible, true
}

// SetVisible sets field value
func (o *CoreCompetencyCreateTemplate200Response) SetVisible(v bool) {
	o.Visible = v
}

func (o CoreCompetencyCreateTemplate200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CoreCompetencyCreateTemplate200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["canmanage"] = o.Canmanage
	toSerialize["canread"] = o.Canread
	toSerialize["cohortscount"] = o.Cohortscount
	toSerialize["contextid"] = o.Contextid
	toSerialize["contextname"] = o.Contextname
	toSerialize["contextnamenoprefix"] = o.Contextnamenoprefix
	toSerialize["description"] = o.Description
	if !IsNil(o.Descriptionformat) {
		toSerialize["descriptionformat"] = o.Descriptionformat
	}
	toSerialize["duedate"] = o.Duedate
	toSerialize["duedateformatted"] = o.Duedateformatted
	toSerialize["id"] = o.Id
	toSerialize["planscount"] = o.Planscount
	toSerialize["shortname"] = o.Shortname
	toSerialize["timecreated"] = o.Timecreated
	toSerialize["timemodified"] = o.Timemodified
	toSerialize["usermodified"] = o.Usermodified
	toSerialize["visible"] = o.Visible
	return toSerialize, nil
}

func (o *CoreCompetencyCreateTemplate200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"canmanage",
		"canread",
		"cohortscount",
		"contextid",
		"contextname",
		"contextnamenoprefix",
		"description",
		"duedate",
		"duedateformatted",
		"id",
		"planscount",
		"shortname",
		"timecreated",
		"timemodified",
		"usermodified",
		"visible",
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

	varCoreCompetencyCreateTemplate200Response := _CoreCompetencyCreateTemplate200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCoreCompetencyCreateTemplate200Response)

	if err != nil {
		return err
	}

	*o = CoreCompetencyCreateTemplate200Response(varCoreCompetencyCreateTemplate200Response)

	return err
}

type NullableCoreCompetencyCreateTemplate200Response struct {
	value *CoreCompetencyCreateTemplate200Response
	isSet bool
}

func (v NullableCoreCompetencyCreateTemplate200Response) Get() *CoreCompetencyCreateTemplate200Response {
	return v.value
}

func (v *NullableCoreCompetencyCreateTemplate200Response) Set(val *CoreCompetencyCreateTemplate200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableCoreCompetencyCreateTemplate200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableCoreCompetencyCreateTemplate200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCoreCompetencyCreateTemplate200Response(val *CoreCompetencyCreateTemplate200Response) *NullableCoreCompetencyCreateTemplate200Response {
	return &NullableCoreCompetencyCreateTemplate200Response{value: val, isSet: true}
}

func (v NullableCoreCompetencyCreateTemplate200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCoreCompetencyCreateTemplate200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


