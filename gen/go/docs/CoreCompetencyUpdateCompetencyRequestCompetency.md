# CoreCompetencyUpdateCompetencyRequestCompetency

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Competencyframeworkid** | Pointer to **int32** | competencyframeworkid | [optional] [default to null]
**Description** | Pointer to **string** | description | [optional] 
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Id** | **int32** | id | 
**Idnumber** | Pointer to **string** | idnumber | [optional] 
**Parentid** | Pointer to **int32** | parentid | [optional] [default to null]
**Path** | Pointer to **string** | path | [optional] [default to "null"]
**Ruleconfig** | Pointer to **string** | ruleconfig | [optional] 
**Ruleoutcome** | Pointer to **int32** | ruleoutcome | [optional] [default to null]
**Ruletype** | Pointer to **string** | ruletype | [optional] 
**Scaleconfiguration** | Pointer to **string** | scaleconfiguration | [optional] 
**Scaleid** | Pointer to **int32** | scaleid | [optional] 
**Shortname** | Pointer to **string** | shortname | [optional] 
**Sortorder** | Pointer to **int32** | sortorder | [optional] [default to null]
**Timecreated** | Pointer to **int32** | timecreated | [optional] 
**Timemodified** | Pointer to **int32** | timemodified | [optional] 
**Usermodified** | Pointer to **int32** | usermodified | [optional] [default to null]

## Methods

### NewCoreCompetencyUpdateCompetencyRequestCompetency

`func NewCoreCompetencyUpdateCompetencyRequestCompetency(id int32, ) *CoreCompetencyUpdateCompetencyRequestCompetency`

NewCoreCompetencyUpdateCompetencyRequestCompetency instantiates a new CoreCompetencyUpdateCompetencyRequestCompetency object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompetencyUpdateCompetencyRequestCompetencyWithDefaults

`func NewCoreCompetencyUpdateCompetencyRequestCompetencyWithDefaults() *CoreCompetencyUpdateCompetencyRequestCompetency`

NewCoreCompetencyUpdateCompetencyRequestCompetencyWithDefaults instantiates a new CoreCompetencyUpdateCompetencyRequestCompetency object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCompetencyframeworkid

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetCompetencyframeworkid() int32`

GetCompetencyframeworkid returns the Competencyframeworkid field if non-nil, zero value otherwise.

### GetCompetencyframeworkidOk

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetCompetencyframeworkidOk() (*int32, bool)`

GetCompetencyframeworkidOk returns a tuple with the Competencyframeworkid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompetencyframeworkid

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetCompetencyframeworkid(v int32)`

SetCompetencyframeworkid sets Competencyframeworkid field to given value.

### HasCompetencyframeworkid

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasCompetencyframeworkid() bool`

HasCompetencyframeworkid returns a boolean if a field has been set.

### GetDescription

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetId

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetId(v int32)`

SetId sets Id field to given value.


### GetIdnumber

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetIdnumber() string`

GetIdnumber returns the Idnumber field if non-nil, zero value otherwise.

### GetIdnumberOk

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetIdnumberOk() (*string, bool)`

GetIdnumberOk returns a tuple with the Idnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdnumber

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetIdnumber(v string)`

SetIdnumber sets Idnumber field to given value.

### HasIdnumber

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasIdnumber() bool`

HasIdnumber returns a boolean if a field has been set.

### GetParentid

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetParentid() int32`

GetParentid returns the Parentid field if non-nil, zero value otherwise.

### GetParentidOk

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetParentidOk() (*int32, bool)`

GetParentidOk returns a tuple with the Parentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentid

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetParentid(v int32)`

SetParentid sets Parentid field to given value.

### HasParentid

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasParentid() bool`

HasParentid returns a boolean if a field has been set.

### GetPath

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetPath() string`

GetPath returns the Path field if non-nil, zero value otherwise.

### GetPathOk

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetPathOk() (*string, bool)`

GetPathOk returns a tuple with the Path field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPath

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetPath(v string)`

SetPath sets Path field to given value.

### HasPath

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasPath() bool`

HasPath returns a boolean if a field has been set.

### GetRuleconfig

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetRuleconfig() string`

GetRuleconfig returns the Ruleconfig field if non-nil, zero value otherwise.

### GetRuleconfigOk

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetRuleconfigOk() (*string, bool)`

GetRuleconfigOk returns a tuple with the Ruleconfig field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRuleconfig

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetRuleconfig(v string)`

SetRuleconfig sets Ruleconfig field to given value.

### HasRuleconfig

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasRuleconfig() bool`

HasRuleconfig returns a boolean if a field has been set.

### GetRuleoutcome

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetRuleoutcome() int32`

GetRuleoutcome returns the Ruleoutcome field if non-nil, zero value otherwise.

### GetRuleoutcomeOk

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetRuleoutcomeOk() (*int32, bool)`

GetRuleoutcomeOk returns a tuple with the Ruleoutcome field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRuleoutcome

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetRuleoutcome(v int32)`

SetRuleoutcome sets Ruleoutcome field to given value.

### HasRuleoutcome

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasRuleoutcome() bool`

HasRuleoutcome returns a boolean if a field has been set.

### GetRuletype

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetRuletype() string`

GetRuletype returns the Ruletype field if non-nil, zero value otherwise.

### GetRuletypeOk

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetRuletypeOk() (*string, bool)`

GetRuletypeOk returns a tuple with the Ruletype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRuletype

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetRuletype(v string)`

SetRuletype sets Ruletype field to given value.

### HasRuletype

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasRuletype() bool`

HasRuletype returns a boolean if a field has been set.

### GetScaleconfiguration

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetScaleconfiguration() string`

GetScaleconfiguration returns the Scaleconfiguration field if non-nil, zero value otherwise.

### GetScaleconfigurationOk

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetScaleconfigurationOk() (*string, bool)`

GetScaleconfigurationOk returns a tuple with the Scaleconfiguration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScaleconfiguration

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetScaleconfiguration(v string)`

SetScaleconfiguration sets Scaleconfiguration field to given value.

### HasScaleconfiguration

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasScaleconfiguration() bool`

HasScaleconfiguration returns a boolean if a field has been set.

### GetScaleid

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetScaleid() int32`

GetScaleid returns the Scaleid field if non-nil, zero value otherwise.

### GetScaleidOk

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetScaleidOk() (*int32, bool)`

GetScaleidOk returns a tuple with the Scaleid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScaleid

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetScaleid(v int32)`

SetScaleid sets Scaleid field to given value.

### HasScaleid

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasScaleid() bool`

HasScaleid returns a boolean if a field has been set.

### GetShortname

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetShortname() string`

GetShortname returns the Shortname field if non-nil, zero value otherwise.

### GetShortnameOk

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetShortnameOk() (*string, bool)`

GetShortnameOk returns a tuple with the Shortname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShortname

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetShortname(v string)`

SetShortname sets Shortname field to given value.

### HasShortname

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasShortname() bool`

HasShortname returns a boolean if a field has been set.

### GetSortorder

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetSortorder() int32`

GetSortorder returns the Sortorder field if non-nil, zero value otherwise.

### GetSortorderOk

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetSortorderOk() (*int32, bool)`

GetSortorderOk returns a tuple with the Sortorder field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortorder

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetSortorder(v int32)`

SetSortorder sets Sortorder field to given value.

### HasSortorder

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasSortorder() bool`

HasSortorder returns a boolean if a field has been set.

### GetTimecreated

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetUsermodified

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetUsermodified() int32`

GetUsermodified returns the Usermodified field if non-nil, zero value otherwise.

### GetUsermodifiedOk

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) GetUsermodifiedOk() (*int32, bool)`

GetUsermodifiedOk returns a tuple with the Usermodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodified

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) SetUsermodified(v int32)`

SetUsermodified sets Usermodified field to given value.

### HasUsermodified

`func (o *CoreCompetencyUpdateCompetencyRequestCompetency) HasUsermodified() bool`

HasUsermodified returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


