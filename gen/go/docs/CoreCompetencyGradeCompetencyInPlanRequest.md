# CoreCompetencyGradeCompetencyInPlanRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Competencyid** | **int32** | Competency id | 
**Grade** | **int32** | New grade | 
**Note** | Pointer to **string** | A note to attach to the evidence | [optional] 
**Planid** | **int32** | Plan id | [default to null]

## Methods

### NewCoreCompetencyGradeCompetencyInPlanRequest

`func NewCoreCompetencyGradeCompetencyInPlanRequest(competencyid int32, grade int32, planid int32, ) *CoreCompetencyGradeCompetencyInPlanRequest`

NewCoreCompetencyGradeCompetencyInPlanRequest instantiates a new CoreCompetencyGradeCompetencyInPlanRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompetencyGradeCompetencyInPlanRequestWithDefaults

`func NewCoreCompetencyGradeCompetencyInPlanRequestWithDefaults() *CoreCompetencyGradeCompetencyInPlanRequest`

NewCoreCompetencyGradeCompetencyInPlanRequestWithDefaults instantiates a new CoreCompetencyGradeCompetencyInPlanRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCompetencyid

`func (o *CoreCompetencyGradeCompetencyInPlanRequest) GetCompetencyid() int32`

GetCompetencyid returns the Competencyid field if non-nil, zero value otherwise.

### GetCompetencyidOk

`func (o *CoreCompetencyGradeCompetencyInPlanRequest) GetCompetencyidOk() (*int32, bool)`

GetCompetencyidOk returns a tuple with the Competencyid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompetencyid

`func (o *CoreCompetencyGradeCompetencyInPlanRequest) SetCompetencyid(v int32)`

SetCompetencyid sets Competencyid field to given value.


### GetGrade

`func (o *CoreCompetencyGradeCompetencyInPlanRequest) GetGrade() int32`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *CoreCompetencyGradeCompetencyInPlanRequest) GetGradeOk() (*int32, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *CoreCompetencyGradeCompetencyInPlanRequest) SetGrade(v int32)`

SetGrade sets Grade field to given value.


### GetNote

`func (o *CoreCompetencyGradeCompetencyInPlanRequest) GetNote() string`

GetNote returns the Note field if non-nil, zero value otherwise.

### GetNoteOk

`func (o *CoreCompetencyGradeCompetencyInPlanRequest) GetNoteOk() (*string, bool)`

GetNoteOk returns a tuple with the Note field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNote

`func (o *CoreCompetencyGradeCompetencyInPlanRequest) SetNote(v string)`

SetNote sets Note field to given value.

### HasNote

`func (o *CoreCompetencyGradeCompetencyInPlanRequest) HasNote() bool`

HasNote returns a boolean if a field has been set.

### GetPlanid

`func (o *CoreCompetencyGradeCompetencyInPlanRequest) GetPlanid() int32`

GetPlanid returns the Planid field if non-nil, zero value otherwise.

### GetPlanidOk

`func (o *CoreCompetencyGradeCompetencyInPlanRequest) GetPlanidOk() (*int32, bool)`

GetPlanidOk returns a tuple with the Planid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlanid

`func (o *CoreCompetencyGradeCompetencyInPlanRequest) SetPlanid(v int32)`

SetPlanid sets Planid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


