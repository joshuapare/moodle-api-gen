# CoreCompetencyGradeCompetencyInCourseRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Competencyid** | **int32** | Competency id | [default to null]
**Courseid** | **int32** | Course id | 
**Grade** | **int32** | New grade | 
**Note** | Pointer to **string** | A note to attach to the evidence | [optional] 
**Userid** | **int32** | User id | [default to null]

## Methods

### NewCoreCompetencyGradeCompetencyInCourseRequest

`func NewCoreCompetencyGradeCompetencyInCourseRequest(competencyid int32, courseid int32, grade int32, userid int32, ) *CoreCompetencyGradeCompetencyInCourseRequest`

NewCoreCompetencyGradeCompetencyInCourseRequest instantiates a new CoreCompetencyGradeCompetencyInCourseRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompetencyGradeCompetencyInCourseRequestWithDefaults

`func NewCoreCompetencyGradeCompetencyInCourseRequestWithDefaults() *CoreCompetencyGradeCompetencyInCourseRequest`

NewCoreCompetencyGradeCompetencyInCourseRequestWithDefaults instantiates a new CoreCompetencyGradeCompetencyInCourseRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCompetencyid

`func (o *CoreCompetencyGradeCompetencyInCourseRequest) GetCompetencyid() int32`

GetCompetencyid returns the Competencyid field if non-nil, zero value otherwise.

### GetCompetencyidOk

`func (o *CoreCompetencyGradeCompetencyInCourseRequest) GetCompetencyidOk() (*int32, bool)`

GetCompetencyidOk returns a tuple with the Competencyid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompetencyid

`func (o *CoreCompetencyGradeCompetencyInCourseRequest) SetCompetencyid(v int32)`

SetCompetencyid sets Competencyid field to given value.


### GetCourseid

`func (o *CoreCompetencyGradeCompetencyInCourseRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreCompetencyGradeCompetencyInCourseRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreCompetencyGradeCompetencyInCourseRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetGrade

`func (o *CoreCompetencyGradeCompetencyInCourseRequest) GetGrade() int32`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *CoreCompetencyGradeCompetencyInCourseRequest) GetGradeOk() (*int32, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *CoreCompetencyGradeCompetencyInCourseRequest) SetGrade(v int32)`

SetGrade sets Grade field to given value.


### GetNote

`func (o *CoreCompetencyGradeCompetencyInCourseRequest) GetNote() string`

GetNote returns the Note field if non-nil, zero value otherwise.

### GetNoteOk

`func (o *CoreCompetencyGradeCompetencyInCourseRequest) GetNoteOk() (*string, bool)`

GetNoteOk returns a tuple with the Note field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNote

`func (o *CoreCompetencyGradeCompetencyInCourseRequest) SetNote(v string)`

SetNote sets Note field to given value.

### HasNote

`func (o *CoreCompetencyGradeCompetencyInCourseRequest) HasNote() bool`

HasNote returns a boolean if a field has been set.

### GetUserid

`func (o *CoreCompetencyGradeCompetencyInCourseRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreCompetencyGradeCompetencyInCourseRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreCompetencyGradeCompetencyInCourseRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


