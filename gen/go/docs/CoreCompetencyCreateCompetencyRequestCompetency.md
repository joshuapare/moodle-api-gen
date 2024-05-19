# CoreCompetencyCreateCompetencyRequestCompetency

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Competencyframeworkid** | Pointer to **int32** | competencyframeworkid | [optional] [default to 0]
**Description** | Pointer to **string** | description | [optional] [default to ""]
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Idnumber** | **string** | idnumber | 
**Parentid** | Pointer to **int32** | parentid | [optional] [default to 0]
**Path** | Pointer to **string** | path | [optional] [default to "/0/"]
**Ruleconfig** | Pointer to **string** | ruleconfig | [optional] [default to "null"]
**Ruleoutcome** | Pointer to **int32** | ruleoutcome | [optional] [default to 0]
**Ruletype** | Pointer to **string** | ruletype | [optional] [default to "null"]
**Scaleconfiguration** | Pointer to **string** | scaleconfiguration | [optional] [default to "null"]
**Scaleid** | Pointer to **int32** | scaleid | [optional] [default to null]
**Shortname** | **string** | shortname | 
**Sortorder** | Pointer to **int32** | sortorder | [optional] [default to 0]
**Timecreated** | Pointer to **int32** | timecreated | [optional] [default to 0]
**Timemodified** | Pointer to **int32** | timemodified | [optional] [default to 0]
**Usermodified** | Pointer to **int32** | usermodified | [optional] [default to 0]

## Methods

### NewCoreCompetencyCreateCompetencyRequestCompetency

`func NewCoreCompetencyCreateCompetencyRequestCompetency(idnumber string, shortname string, ) *CoreCompetencyCreateCompetencyRequestCompetency`

NewCoreCompetencyCreateCompetencyRequestCompetency instantiates a new CoreCompetencyCreateCompetencyRequestCompetency object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompetencyCreateCompetencyRequestCompetencyWithDefaults

`func NewCoreCompetencyCreateCompetencyRequestCompetencyWithDefaults() *CoreCompetencyCreateCompetencyRequestCompetency`

NewCoreCompetencyCreateCompetencyRequestCompetencyWithDefaults instantiates a new CoreCompetencyCreateCompetencyRequestCompetency object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCompetencyframeworkid

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetCompetencyframeworkid() int32`

GetCompetencyframeworkid returns the Competencyframeworkid field if non-nil, zero value otherwise.

### GetCompetencyframeworkidOk

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetCompetencyframeworkidOk() (*int32, bool)`

GetCompetencyframeworkidOk returns a tuple with the Competencyframeworkid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompetencyframeworkid

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) SetCompetencyframeworkid(v int32)`

SetCompetencyframeworkid sets Competencyframeworkid field to given value.

### HasCompetencyframeworkid

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) HasCompetencyframeworkid() bool`

HasCompetencyframeworkid returns a boolean if a field has been set.

### GetDescription

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetIdnumber

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetIdnumber() string`

GetIdnumber returns the Idnumber field if non-nil, zero value otherwise.

### GetIdnumberOk

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetIdnumberOk() (*string, bool)`

GetIdnumberOk returns a tuple with the Idnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdnumber

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) SetIdnumber(v string)`

SetIdnumber sets Idnumber field to given value.


### GetParentid

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetParentid() int32`

GetParentid returns the Parentid field if non-nil, zero value otherwise.

### GetParentidOk

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetParentidOk() (*int32, bool)`

GetParentidOk returns a tuple with the Parentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentid

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) SetParentid(v int32)`

SetParentid sets Parentid field to given value.

### HasParentid

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) HasParentid() bool`

HasParentid returns a boolean if a field has been set.

### GetPath

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetPath() string`

GetPath returns the Path field if non-nil, zero value otherwise.

### GetPathOk

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetPathOk() (*string, bool)`

GetPathOk returns a tuple with the Path field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPath

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) SetPath(v string)`

SetPath sets Path field to given value.

### HasPath

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) HasPath() bool`

HasPath returns a boolean if a field has been set.

### GetRuleconfig

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetRuleconfig() string`

GetRuleconfig returns the Ruleconfig field if non-nil, zero value otherwise.

### GetRuleconfigOk

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetRuleconfigOk() (*string, bool)`

GetRuleconfigOk returns a tuple with the Ruleconfig field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRuleconfig

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) SetRuleconfig(v string)`

SetRuleconfig sets Ruleconfig field to given value.

### HasRuleconfig

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) HasRuleconfig() bool`

HasRuleconfig returns a boolean if a field has been set.

### GetRuleoutcome

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetRuleoutcome() int32`

GetRuleoutcome returns the Ruleoutcome field if non-nil, zero value otherwise.

### GetRuleoutcomeOk

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetRuleoutcomeOk() (*int32, bool)`

GetRuleoutcomeOk returns a tuple with the Ruleoutcome field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRuleoutcome

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) SetRuleoutcome(v int32)`

SetRuleoutcome sets Ruleoutcome field to given value.

### HasRuleoutcome

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) HasRuleoutcome() bool`

HasRuleoutcome returns a boolean if a field has been set.

### GetRuletype

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetRuletype() string`

GetRuletype returns the Ruletype field if non-nil, zero value otherwise.

### GetRuletypeOk

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetRuletypeOk() (*string, bool)`

GetRuletypeOk returns a tuple with the Ruletype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRuletype

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) SetRuletype(v string)`

SetRuletype sets Ruletype field to given value.

### HasRuletype

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) HasRuletype() bool`

HasRuletype returns a boolean if a field has been set.

### GetScaleconfiguration

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetScaleconfiguration() string`

GetScaleconfiguration returns the Scaleconfiguration field if non-nil, zero value otherwise.

### GetScaleconfigurationOk

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetScaleconfigurationOk() (*string, bool)`

GetScaleconfigurationOk returns a tuple with the Scaleconfiguration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScaleconfiguration

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) SetScaleconfiguration(v string)`

SetScaleconfiguration sets Scaleconfiguration field to given value.

### HasScaleconfiguration

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) HasScaleconfiguration() bool`

HasScaleconfiguration returns a boolean if a field has been set.

### GetScaleid

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetScaleid() int32`

GetScaleid returns the Scaleid field if non-nil, zero value otherwise.

### GetScaleidOk

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetScaleidOk() (*int32, bool)`

GetScaleidOk returns a tuple with the Scaleid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScaleid

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) SetScaleid(v int32)`

SetScaleid sets Scaleid field to given value.

### HasScaleid

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) HasScaleid() bool`

HasScaleid returns a boolean if a field has been set.

### GetShortname

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetShortname() string`

GetShortname returns the Shortname field if non-nil, zero value otherwise.

### GetShortnameOk

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetShortnameOk() (*string, bool)`

GetShortnameOk returns a tuple with the Shortname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShortname

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) SetShortname(v string)`

SetShortname sets Shortname field to given value.


### GetSortorder

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetSortorder() int32`

GetSortorder returns the Sortorder field if non-nil, zero value otherwise.

### GetSortorderOk

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetSortorderOk() (*int32, bool)`

GetSortorderOk returns a tuple with the Sortorder field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortorder

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) SetSortorder(v int32)`

SetSortorder sets Sortorder field to given value.

### HasSortorder

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) HasSortorder() bool`

HasSortorder returns a boolean if a field has been set.

### GetTimecreated

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetUsermodified

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetUsermodified() int32`

GetUsermodified returns the Usermodified field if non-nil, zero value otherwise.

### GetUsermodifiedOk

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) GetUsermodifiedOk() (*int32, bool)`

GetUsermodifiedOk returns a tuple with the Usermodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodified

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) SetUsermodified(v int32)`

SetUsermodified sets Usermodified field to given value.

### HasUsermodified

`func (o *CoreCompetencyCreateCompetencyRequestCompetency) HasUsermodified() bool`

HasUsermodified returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


