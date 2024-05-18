# ModAssignGetGrades200ResponseAssignmentsInnerGradesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Assignment** | Pointer to **int32** | assignment id | [optional] 
**Attemptnumber** | Pointer to **int32** | attempt number | [optional] [default to null]
**Grade** | Pointer to **string** | grade | [optional] [default to "null"]
**Gradefordisplay** | Pointer to **string** | grade rendered into a format suitable for display | [optional] [default to "null"]
**Grader** | Pointer to **int32** | grader, -1 if grader is hidden | [optional] [default to null]
**Id** | Pointer to **int32** | grade id | [optional] [default to null]
**Timecreated** | Pointer to **int32** | grade creation time | [optional] [default to null]
**Timemodified** | Pointer to **int32** | grade last modified time | [optional] [default to null]
**Userid** | Pointer to **int32** | student id | [optional] [default to null]

## Methods

### NewModAssignGetGrades200ResponseAssignmentsInnerGradesInner

`func NewModAssignGetGrades200ResponseAssignmentsInnerGradesInner() *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner`

NewModAssignGetGrades200ResponseAssignmentsInnerGradesInner instantiates a new ModAssignGetGrades200ResponseAssignmentsInnerGradesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignGetGrades200ResponseAssignmentsInnerGradesInnerWithDefaults

`func NewModAssignGetGrades200ResponseAssignmentsInnerGradesInnerWithDefaults() *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner`

NewModAssignGetGrades200ResponseAssignmentsInnerGradesInnerWithDefaults instantiates a new ModAssignGetGrades200ResponseAssignmentsInnerGradesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssignment

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) GetAssignment() int32`

GetAssignment returns the Assignment field if non-nil, zero value otherwise.

### GetAssignmentOk

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) GetAssignmentOk() (*int32, bool)`

GetAssignmentOk returns a tuple with the Assignment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssignment

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) SetAssignment(v int32)`

SetAssignment sets Assignment field to given value.

### HasAssignment

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) HasAssignment() bool`

HasAssignment returns a boolean if a field has been set.

### GetAttemptnumber

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) GetAttemptnumber() int32`

GetAttemptnumber returns the Attemptnumber field if non-nil, zero value otherwise.

### GetAttemptnumberOk

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) GetAttemptnumberOk() (*int32, bool)`

GetAttemptnumberOk returns a tuple with the Attemptnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttemptnumber

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) SetAttemptnumber(v int32)`

SetAttemptnumber sets Attemptnumber field to given value.

### HasAttemptnumber

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) HasAttemptnumber() bool`

HasAttemptnumber returns a boolean if a field has been set.

### GetGrade

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) GetGrade() string`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) GetGradeOk() (*string, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) SetGrade(v string)`

SetGrade sets Grade field to given value.

### HasGrade

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) HasGrade() bool`

HasGrade returns a boolean if a field has been set.

### GetGradefordisplay

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) GetGradefordisplay() string`

GetGradefordisplay returns the Gradefordisplay field if non-nil, zero value otherwise.

### GetGradefordisplayOk

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) GetGradefordisplayOk() (*string, bool)`

GetGradefordisplayOk returns a tuple with the Gradefordisplay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradefordisplay

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) SetGradefordisplay(v string)`

SetGradefordisplay sets Gradefordisplay field to given value.

### HasGradefordisplay

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) HasGradefordisplay() bool`

HasGradefordisplay returns a boolean if a field has been set.

### GetGrader

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) GetGrader() int32`

GetGrader returns the Grader field if non-nil, zero value otherwise.

### GetGraderOk

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) GetGraderOk() (*int32, bool)`

GetGraderOk returns a tuple with the Grader field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrader

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) SetGrader(v int32)`

SetGrader sets Grader field to given value.

### HasGrader

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) HasGrader() bool`

HasGrader returns a boolean if a field has been set.

### GetId

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetTimecreated

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetUserid

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModAssignGetGrades200ResponseAssignmentsInnerGradesInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


