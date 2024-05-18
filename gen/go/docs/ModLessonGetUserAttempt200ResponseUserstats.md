# ModLessonGetUserAttempt200ResponseUserstats

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Completed** | **int32** | Time completed. | [default to null]
**Grade** | **float32** | Attempt final grade. | [default to null]
**Gradeinfo** | Pointer to [**ModLessonGetUserAttempt200ResponseUserstatsGradeinfo**](ModLessonGetUserAttempt200ResponseUserstatsGradeinfo.md) |  | [optional] 
**Timetotake** | **int32** | Time taken. | [default to null]

## Methods

### NewModLessonGetUserAttempt200ResponseUserstats

`func NewModLessonGetUserAttempt200ResponseUserstats(completed int32, grade float32, timetotake int32, ) *ModLessonGetUserAttempt200ResponseUserstats`

NewModLessonGetUserAttempt200ResponseUserstats instantiates a new ModLessonGetUserAttempt200ResponseUserstats object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetUserAttempt200ResponseUserstatsWithDefaults

`func NewModLessonGetUserAttempt200ResponseUserstatsWithDefaults() *ModLessonGetUserAttempt200ResponseUserstats`

NewModLessonGetUserAttempt200ResponseUserstatsWithDefaults instantiates a new ModLessonGetUserAttempt200ResponseUserstats object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCompleted

`func (o *ModLessonGetUserAttempt200ResponseUserstats) GetCompleted() int32`

GetCompleted returns the Completed field if non-nil, zero value otherwise.

### GetCompletedOk

`func (o *ModLessonGetUserAttempt200ResponseUserstats) GetCompletedOk() (*int32, bool)`

GetCompletedOk returns a tuple with the Completed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompleted

`func (o *ModLessonGetUserAttempt200ResponseUserstats) SetCompleted(v int32)`

SetCompleted sets Completed field to given value.


### GetGrade

`func (o *ModLessonGetUserAttempt200ResponseUserstats) GetGrade() float32`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *ModLessonGetUserAttempt200ResponseUserstats) GetGradeOk() (*float32, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *ModLessonGetUserAttempt200ResponseUserstats) SetGrade(v float32)`

SetGrade sets Grade field to given value.


### GetGradeinfo

`func (o *ModLessonGetUserAttempt200ResponseUserstats) GetGradeinfo() ModLessonGetUserAttempt200ResponseUserstatsGradeinfo`

GetGradeinfo returns the Gradeinfo field if non-nil, zero value otherwise.

### GetGradeinfoOk

`func (o *ModLessonGetUserAttempt200ResponseUserstats) GetGradeinfoOk() (*ModLessonGetUserAttempt200ResponseUserstatsGradeinfo, bool)`

GetGradeinfoOk returns a tuple with the Gradeinfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradeinfo

`func (o *ModLessonGetUserAttempt200ResponseUserstats) SetGradeinfo(v ModLessonGetUserAttempt200ResponseUserstatsGradeinfo)`

SetGradeinfo sets Gradeinfo field to given value.

### HasGradeinfo

`func (o *ModLessonGetUserAttempt200ResponseUserstats) HasGradeinfo() bool`

HasGradeinfo returns a boolean if a field has been set.

### GetTimetotake

`func (o *ModLessonGetUserAttempt200ResponseUserstats) GetTimetotake() int32`

GetTimetotake returns the Timetotake field if non-nil, zero value otherwise.

### GetTimetotakeOk

`func (o *ModLessonGetUserAttempt200ResponseUserstats) GetTimetotakeOk() (*int32, bool)`

GetTimetotakeOk returns a tuple with the Timetotake field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimetotake

`func (o *ModLessonGetUserAttempt200ResponseUserstats) SetTimetotake(v int32)`

SetTimetotake sets Timetotake field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


