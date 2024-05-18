# CoreCompetencyGradeCompetencyRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Competencyid** | **int32** | Competency ID | [default to null]
**Grade** | **int32** | New grade | [default to null]
**Note** | Pointer to **string** | A note to attach to the evidence | [optional] [default to "null"]
**Userid** | **int32** | User ID | 

## Methods

### NewCoreCompetencyGradeCompetencyRequest

`func NewCoreCompetencyGradeCompetencyRequest(competencyid int32, grade int32, userid int32, ) *CoreCompetencyGradeCompetencyRequest`

NewCoreCompetencyGradeCompetencyRequest instantiates a new CoreCompetencyGradeCompetencyRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompetencyGradeCompetencyRequestWithDefaults

`func NewCoreCompetencyGradeCompetencyRequestWithDefaults() *CoreCompetencyGradeCompetencyRequest`

NewCoreCompetencyGradeCompetencyRequestWithDefaults instantiates a new CoreCompetencyGradeCompetencyRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCompetencyid

`func (o *CoreCompetencyGradeCompetencyRequest) GetCompetencyid() int32`

GetCompetencyid returns the Competencyid field if non-nil, zero value otherwise.

### GetCompetencyidOk

`func (o *CoreCompetencyGradeCompetencyRequest) GetCompetencyidOk() (*int32, bool)`

GetCompetencyidOk returns a tuple with the Competencyid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompetencyid

`func (o *CoreCompetencyGradeCompetencyRequest) SetCompetencyid(v int32)`

SetCompetencyid sets Competencyid field to given value.


### GetGrade

`func (o *CoreCompetencyGradeCompetencyRequest) GetGrade() int32`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *CoreCompetencyGradeCompetencyRequest) GetGradeOk() (*int32, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *CoreCompetencyGradeCompetencyRequest) SetGrade(v int32)`

SetGrade sets Grade field to given value.


### GetNote

`func (o *CoreCompetencyGradeCompetencyRequest) GetNote() string`

GetNote returns the Note field if non-nil, zero value otherwise.

### GetNoteOk

`func (o *CoreCompetencyGradeCompetencyRequest) GetNoteOk() (*string, bool)`

GetNoteOk returns a tuple with the Note field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNote

`func (o *CoreCompetencyGradeCompetencyRequest) SetNote(v string)`

SetNote sets Note field to given value.

### HasNote

`func (o *CoreCompetencyGradeCompetencyRequest) HasNote() bool`

HasNote returns a boolean if a field has been set.

### GetUserid

`func (o *CoreCompetencyGradeCompetencyRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreCompetencyGradeCompetencyRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreCompetencyGradeCompetencyRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


