# CoreCompetencyCreateCompetency200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Competencyframeworkid** | **int32** | competencyframeworkid | [default to 0]
**Description** | **string** | description | [default to ""]
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Id** | **int32** | id | [default to 0]
**Idnumber** | **string** | idnumber | 
**Parentid** | **int32** | parentid | [default to 0]
**Path** | **string** | path | [default to "/0/"]
**Ruleconfig** | **string** | ruleconfig | 
**Ruleoutcome** | **int32** | ruleoutcome | [default to 0]
**Ruletype** | **string** | ruletype | 
**Scaleconfiguration** | **string** | scaleconfiguration | 
**Scaleid** | **int32** | scaleid | 
**Shortname** | **string** | shortname | 
**Sortorder** | **int32** | sortorder | [default to 0]
**Timecreated** | **int32** | timecreated | [default to 0]
**Timemodified** | **int32** | timemodified | [default to 0]
**Usermodified** | **int32** | usermodified | [default to 0]

## Methods

### NewCoreCompetencyCreateCompetency200Response

`func NewCoreCompetencyCreateCompetency200Response(competencyframeworkid int32, description string, id int32, idnumber string, parentid int32, path string, ruleconfig string, ruleoutcome int32, ruletype string, scaleconfiguration string, scaleid int32, shortname string, sortorder int32, timecreated int32, timemodified int32, usermodified int32, ) *CoreCompetencyCreateCompetency200Response`

NewCoreCompetencyCreateCompetency200Response instantiates a new CoreCompetencyCreateCompetency200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompetencyCreateCompetency200ResponseWithDefaults

`func NewCoreCompetencyCreateCompetency200ResponseWithDefaults() *CoreCompetencyCreateCompetency200Response`

NewCoreCompetencyCreateCompetency200ResponseWithDefaults instantiates a new CoreCompetencyCreateCompetency200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCompetencyframeworkid

`func (o *CoreCompetencyCreateCompetency200Response) GetCompetencyframeworkid() int32`

GetCompetencyframeworkid returns the Competencyframeworkid field if non-nil, zero value otherwise.

### GetCompetencyframeworkidOk

`func (o *CoreCompetencyCreateCompetency200Response) GetCompetencyframeworkidOk() (*int32, bool)`

GetCompetencyframeworkidOk returns a tuple with the Competencyframeworkid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompetencyframeworkid

`func (o *CoreCompetencyCreateCompetency200Response) SetCompetencyframeworkid(v int32)`

SetCompetencyframeworkid sets Competencyframeworkid field to given value.


### GetDescription

`func (o *CoreCompetencyCreateCompetency200Response) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreCompetencyCreateCompetency200Response) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreCompetencyCreateCompetency200Response) SetDescription(v string)`

SetDescription sets Description field to given value.


### GetDescriptionformat

`func (o *CoreCompetencyCreateCompetency200Response) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreCompetencyCreateCompetency200Response) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreCompetencyCreateCompetency200Response) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreCompetencyCreateCompetency200Response) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetId

`func (o *CoreCompetencyCreateCompetency200Response) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCompetencyCreateCompetency200Response) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCompetencyCreateCompetency200Response) SetId(v int32)`

SetId sets Id field to given value.


### GetIdnumber

`func (o *CoreCompetencyCreateCompetency200Response) GetIdnumber() string`

GetIdnumber returns the Idnumber field if non-nil, zero value otherwise.

### GetIdnumberOk

`func (o *CoreCompetencyCreateCompetency200Response) GetIdnumberOk() (*string, bool)`

GetIdnumberOk returns a tuple with the Idnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdnumber

`func (o *CoreCompetencyCreateCompetency200Response) SetIdnumber(v string)`

SetIdnumber sets Idnumber field to given value.


### GetParentid

`func (o *CoreCompetencyCreateCompetency200Response) GetParentid() int32`

GetParentid returns the Parentid field if non-nil, zero value otherwise.

### GetParentidOk

`func (o *CoreCompetencyCreateCompetency200Response) GetParentidOk() (*int32, bool)`

GetParentidOk returns a tuple with the Parentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentid

`func (o *CoreCompetencyCreateCompetency200Response) SetParentid(v int32)`

SetParentid sets Parentid field to given value.


### GetPath

`func (o *CoreCompetencyCreateCompetency200Response) GetPath() string`

GetPath returns the Path field if non-nil, zero value otherwise.

### GetPathOk

`func (o *CoreCompetencyCreateCompetency200Response) GetPathOk() (*string, bool)`

GetPathOk returns a tuple with the Path field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPath

`func (o *CoreCompetencyCreateCompetency200Response) SetPath(v string)`

SetPath sets Path field to given value.


### GetRuleconfig

`func (o *CoreCompetencyCreateCompetency200Response) GetRuleconfig() string`

GetRuleconfig returns the Ruleconfig field if non-nil, zero value otherwise.

### GetRuleconfigOk

`func (o *CoreCompetencyCreateCompetency200Response) GetRuleconfigOk() (*string, bool)`

GetRuleconfigOk returns a tuple with the Ruleconfig field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRuleconfig

`func (o *CoreCompetencyCreateCompetency200Response) SetRuleconfig(v string)`

SetRuleconfig sets Ruleconfig field to given value.


### GetRuleoutcome

`func (o *CoreCompetencyCreateCompetency200Response) GetRuleoutcome() int32`

GetRuleoutcome returns the Ruleoutcome field if non-nil, zero value otherwise.

### GetRuleoutcomeOk

`func (o *CoreCompetencyCreateCompetency200Response) GetRuleoutcomeOk() (*int32, bool)`

GetRuleoutcomeOk returns a tuple with the Ruleoutcome field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRuleoutcome

`func (o *CoreCompetencyCreateCompetency200Response) SetRuleoutcome(v int32)`

SetRuleoutcome sets Ruleoutcome field to given value.


### GetRuletype

`func (o *CoreCompetencyCreateCompetency200Response) GetRuletype() string`

GetRuletype returns the Ruletype field if non-nil, zero value otherwise.

### GetRuletypeOk

`func (o *CoreCompetencyCreateCompetency200Response) GetRuletypeOk() (*string, bool)`

GetRuletypeOk returns a tuple with the Ruletype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRuletype

`func (o *CoreCompetencyCreateCompetency200Response) SetRuletype(v string)`

SetRuletype sets Ruletype field to given value.


### GetScaleconfiguration

`func (o *CoreCompetencyCreateCompetency200Response) GetScaleconfiguration() string`

GetScaleconfiguration returns the Scaleconfiguration field if non-nil, zero value otherwise.

### GetScaleconfigurationOk

`func (o *CoreCompetencyCreateCompetency200Response) GetScaleconfigurationOk() (*string, bool)`

GetScaleconfigurationOk returns a tuple with the Scaleconfiguration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScaleconfiguration

`func (o *CoreCompetencyCreateCompetency200Response) SetScaleconfiguration(v string)`

SetScaleconfiguration sets Scaleconfiguration field to given value.


### GetScaleid

`func (o *CoreCompetencyCreateCompetency200Response) GetScaleid() int32`

GetScaleid returns the Scaleid field if non-nil, zero value otherwise.

### GetScaleidOk

`func (o *CoreCompetencyCreateCompetency200Response) GetScaleidOk() (*int32, bool)`

GetScaleidOk returns a tuple with the Scaleid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScaleid

`func (o *CoreCompetencyCreateCompetency200Response) SetScaleid(v int32)`

SetScaleid sets Scaleid field to given value.


### GetShortname

`func (o *CoreCompetencyCreateCompetency200Response) GetShortname() string`

GetShortname returns the Shortname field if non-nil, zero value otherwise.

### GetShortnameOk

`func (o *CoreCompetencyCreateCompetency200Response) GetShortnameOk() (*string, bool)`

GetShortnameOk returns a tuple with the Shortname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShortname

`func (o *CoreCompetencyCreateCompetency200Response) SetShortname(v string)`

SetShortname sets Shortname field to given value.


### GetSortorder

`func (o *CoreCompetencyCreateCompetency200Response) GetSortorder() int32`

GetSortorder returns the Sortorder field if non-nil, zero value otherwise.

### GetSortorderOk

`func (o *CoreCompetencyCreateCompetency200Response) GetSortorderOk() (*int32, bool)`

GetSortorderOk returns a tuple with the Sortorder field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortorder

`func (o *CoreCompetencyCreateCompetency200Response) SetSortorder(v int32)`

SetSortorder sets Sortorder field to given value.


### GetTimecreated

`func (o *CoreCompetencyCreateCompetency200Response) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *CoreCompetencyCreateCompetency200Response) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *CoreCompetencyCreateCompetency200Response) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.


### GetTimemodified

`func (o *CoreCompetencyCreateCompetency200Response) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreCompetencyCreateCompetency200Response) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreCompetencyCreateCompetency200Response) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.


### GetUsermodified

`func (o *CoreCompetencyCreateCompetency200Response) GetUsermodified() int32`

GetUsermodified returns the Usermodified field if non-nil, zero value otherwise.

### GetUsermodifiedOk

`func (o *CoreCompetencyCreateCompetency200Response) GetUsermodifiedOk() (*int32, bool)`

GetUsermodifiedOk returns a tuple with the Usermodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodified

`func (o *CoreCompetencyCreateCompetency200Response) SetUsermodified(v int32)`

SetUsermodified sets Usermodified field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


