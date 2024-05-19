# ModAssignGetSubmissionStatus200ResponseFeedbackGrade

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Assignment** | Pointer to **int32** | assignment id | [optional] 
**Attemptnumber** | **int32** | attempt number | 
**Grade** | **string** | grade | 
**Gradefordisplay** | Pointer to **string** | grade rendered into a format suitable for display | [optional] 
**Grader** | **int32** | grader, -1 if grader is hidden | 
**Id** | **int32** | grade id | 
**Timecreated** | **int32** | grade creation time | 
**Timemodified** | **int32** | grade last modified time | 
**Userid** | **int32** | student id | 

## Methods

### NewModAssignGetSubmissionStatus200ResponseFeedbackGrade

`func NewModAssignGetSubmissionStatus200ResponseFeedbackGrade(attemptnumber int32, grade string, grader int32, id int32, timecreated int32, timemodified int32, userid int32, ) *ModAssignGetSubmissionStatus200ResponseFeedbackGrade`

NewModAssignGetSubmissionStatus200ResponseFeedbackGrade instantiates a new ModAssignGetSubmissionStatus200ResponseFeedbackGrade object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignGetSubmissionStatus200ResponseFeedbackGradeWithDefaults

`func NewModAssignGetSubmissionStatus200ResponseFeedbackGradeWithDefaults() *ModAssignGetSubmissionStatus200ResponseFeedbackGrade`

NewModAssignGetSubmissionStatus200ResponseFeedbackGradeWithDefaults instantiates a new ModAssignGetSubmissionStatus200ResponseFeedbackGrade object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssignment

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) GetAssignment() int32`

GetAssignment returns the Assignment field if non-nil, zero value otherwise.

### GetAssignmentOk

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) GetAssignmentOk() (*int32, bool)`

GetAssignmentOk returns a tuple with the Assignment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssignment

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) SetAssignment(v int32)`

SetAssignment sets Assignment field to given value.

### HasAssignment

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) HasAssignment() bool`

HasAssignment returns a boolean if a field has been set.

### GetAttemptnumber

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) GetAttemptnumber() int32`

GetAttemptnumber returns the Attemptnumber field if non-nil, zero value otherwise.

### GetAttemptnumberOk

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) GetAttemptnumberOk() (*int32, bool)`

GetAttemptnumberOk returns a tuple with the Attemptnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttemptnumber

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) SetAttemptnumber(v int32)`

SetAttemptnumber sets Attemptnumber field to given value.


### GetGrade

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) GetGrade() string`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) GetGradeOk() (*string, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) SetGrade(v string)`

SetGrade sets Grade field to given value.


### GetGradefordisplay

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) GetGradefordisplay() string`

GetGradefordisplay returns the Gradefordisplay field if non-nil, zero value otherwise.

### GetGradefordisplayOk

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) GetGradefordisplayOk() (*string, bool)`

GetGradefordisplayOk returns a tuple with the Gradefordisplay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradefordisplay

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) SetGradefordisplay(v string)`

SetGradefordisplay sets Gradefordisplay field to given value.

### HasGradefordisplay

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) HasGradefordisplay() bool`

HasGradefordisplay returns a boolean if a field has been set.

### GetGrader

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) GetGrader() int32`

GetGrader returns the Grader field if non-nil, zero value otherwise.

### GetGraderOk

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) GetGraderOk() (*int32, bool)`

GetGraderOk returns a tuple with the Grader field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrader

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) SetGrader(v int32)`

SetGrader sets Grader field to given value.


### GetId

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) SetId(v int32)`

SetId sets Id field to given value.


### GetTimecreated

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.


### GetTimemodified

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.


### GetUserid

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModAssignGetSubmissionStatus200ResponseFeedbackGrade) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


