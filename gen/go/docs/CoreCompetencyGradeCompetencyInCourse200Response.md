# CoreCompetencyGradeCompetencyInCourse200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Action** | **int32** | action | 
**Actionuser** | Pointer to [**CoreCompetencyGradeCompetency200ResponseActionuser**](CoreCompetencyGradeCompetency200ResponseActionuser.md) |  | [optional] 
**Actionuserid** | **int32** | actionuserid | 
**Candelete** | **bool** | candelete | 
**Contextid** | **int32** | contextid | 
**Desca** | **string** | desca | 
**Desccomponent** | **string** | desccomponent | 
**Descidentifier** | **string** | descidentifier | 
**Description** | **string** | description | 
**Grade** | **int32** | grade | 
**Gradename** | **string** | gradename | 
**Id** | **int32** | id | [default to 0]
**Note** | **string** | note | 
**Timecreated** | **int32** | timecreated | [default to 0]
**Timemodified** | **int32** | timemodified | [default to 0]
**Url** | **string** | url | 
**Usercompetencyid** | **int32** | usercompetencyid | 
**Userdate** | **string** | userdate | 
**Usermodified** | **int32** | usermodified | [default to 0]

## Methods

### NewCoreCompetencyGradeCompetencyInCourse200Response

`func NewCoreCompetencyGradeCompetencyInCourse200Response(action int32, actionuserid int32, candelete bool, contextid int32, desca string, desccomponent string, descidentifier string, description string, grade int32, gradename string, id int32, note string, timecreated int32, timemodified int32, url string, usercompetencyid int32, userdate string, usermodified int32, ) *CoreCompetencyGradeCompetencyInCourse200Response`

NewCoreCompetencyGradeCompetencyInCourse200Response instantiates a new CoreCompetencyGradeCompetencyInCourse200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompetencyGradeCompetencyInCourse200ResponseWithDefaults

`func NewCoreCompetencyGradeCompetencyInCourse200ResponseWithDefaults() *CoreCompetencyGradeCompetencyInCourse200Response`

NewCoreCompetencyGradeCompetencyInCourse200ResponseWithDefaults instantiates a new CoreCompetencyGradeCompetencyInCourse200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAction

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetAction() int32`

GetAction returns the Action field if non-nil, zero value otherwise.

### GetActionOk

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetActionOk() (*int32, bool)`

GetActionOk returns a tuple with the Action field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAction

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) SetAction(v int32)`

SetAction sets Action field to given value.


### GetActionuser

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetActionuser() CoreCompetencyGradeCompetency200ResponseActionuser`

GetActionuser returns the Actionuser field if non-nil, zero value otherwise.

### GetActionuserOk

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetActionuserOk() (*CoreCompetencyGradeCompetency200ResponseActionuser, bool)`

GetActionuserOk returns a tuple with the Actionuser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActionuser

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) SetActionuser(v CoreCompetencyGradeCompetency200ResponseActionuser)`

SetActionuser sets Actionuser field to given value.

### HasActionuser

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) HasActionuser() bool`

HasActionuser returns a boolean if a field has been set.

### GetActionuserid

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetActionuserid() int32`

GetActionuserid returns the Actionuserid field if non-nil, zero value otherwise.

### GetActionuseridOk

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetActionuseridOk() (*int32, bool)`

GetActionuseridOk returns a tuple with the Actionuserid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActionuserid

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) SetActionuserid(v int32)`

SetActionuserid sets Actionuserid field to given value.


### GetCandelete

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetCandelete() bool`

GetCandelete returns the Candelete field if non-nil, zero value otherwise.

### GetCandeleteOk

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetCandeleteOk() (*bool, bool)`

GetCandeleteOk returns a tuple with the Candelete field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCandelete

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) SetCandelete(v bool)`

SetCandelete sets Candelete field to given value.


### GetContextid

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) SetContextid(v int32)`

SetContextid sets Contextid field to given value.


### GetDesca

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetDesca() string`

GetDesca returns the Desca field if non-nil, zero value otherwise.

### GetDescaOk

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetDescaOk() (*string, bool)`

GetDescaOk returns a tuple with the Desca field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDesca

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) SetDesca(v string)`

SetDesca sets Desca field to given value.


### GetDesccomponent

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetDesccomponent() string`

GetDesccomponent returns the Desccomponent field if non-nil, zero value otherwise.

### GetDesccomponentOk

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetDesccomponentOk() (*string, bool)`

GetDesccomponentOk returns a tuple with the Desccomponent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDesccomponent

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) SetDesccomponent(v string)`

SetDesccomponent sets Desccomponent field to given value.


### GetDescidentifier

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetDescidentifier() string`

GetDescidentifier returns the Descidentifier field if non-nil, zero value otherwise.

### GetDescidentifierOk

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetDescidentifierOk() (*string, bool)`

GetDescidentifierOk returns a tuple with the Descidentifier field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescidentifier

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) SetDescidentifier(v string)`

SetDescidentifier sets Descidentifier field to given value.


### GetDescription

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) SetDescription(v string)`

SetDescription sets Description field to given value.


### GetGrade

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetGrade() int32`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetGradeOk() (*int32, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) SetGrade(v int32)`

SetGrade sets Grade field to given value.


### GetGradename

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetGradename() string`

GetGradename returns the Gradename field if non-nil, zero value otherwise.

### GetGradenameOk

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetGradenameOk() (*string, bool)`

GetGradenameOk returns a tuple with the Gradename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradename

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) SetGradename(v string)`

SetGradename sets Gradename field to given value.


### GetId

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) SetId(v int32)`

SetId sets Id field to given value.


### GetNote

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetNote() string`

GetNote returns the Note field if non-nil, zero value otherwise.

### GetNoteOk

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetNoteOk() (*string, bool)`

GetNoteOk returns a tuple with the Note field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNote

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) SetNote(v string)`

SetNote sets Note field to given value.


### GetTimecreated

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.


### GetTimemodified

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.


### GetUrl

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) SetUrl(v string)`

SetUrl sets Url field to given value.


### GetUsercompetencyid

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetUsercompetencyid() int32`

GetUsercompetencyid returns the Usercompetencyid field if non-nil, zero value otherwise.

### GetUsercompetencyidOk

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetUsercompetencyidOk() (*int32, bool)`

GetUsercompetencyidOk returns a tuple with the Usercompetencyid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsercompetencyid

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) SetUsercompetencyid(v int32)`

SetUsercompetencyid sets Usercompetencyid field to given value.


### GetUserdate

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetUserdate() string`

GetUserdate returns the Userdate field if non-nil, zero value otherwise.

### GetUserdateOk

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetUserdateOk() (*string, bool)`

GetUserdateOk returns a tuple with the Userdate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserdate

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) SetUserdate(v string)`

SetUserdate sets Userdate field to given value.


### GetUsermodified

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetUsermodified() int32`

GetUsermodified returns the Usermodified field if non-nil, zero value otherwise.

### GetUsermodifiedOk

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) GetUsermodifiedOk() (*int32, bool)`

GetUsermodifiedOk returns a tuple with the Usermodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodified

`func (o *CoreCompetencyGradeCompetencyInCourse200Response) SetUsermodified(v int32)`

SetUsermodified sets Usermodified field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


