# GradingformRubricGraderGradingpanelStore200ResponseGrade

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Canedit** | **bool** | Can the user edit this | 
**Criteria** | [**[]GradingformRubricGraderGradingpanelStore200ResponseGradeCriteriaInner**](GradingformRubricGraderGradingpanelStore200ResponseGradeCriteriaInner.md) |  | 
**Gradedby** | **string** | The assumed grader of this grading instance | 
**Instanceid** | **int32** | The id of the current grading instance | 
**Maxgrade** | **string** | Max possible grade | 
**Rubricmode** | **string** | The mode i.e. evaluate editable | 
**Timecreated** | **int32** | The time that the grade was created | 
**Timemodified** | **int32** | The time that the grade was last updated | 
**Usergrade** | **string** | Current user grade | 

## Methods

### NewGradingformRubricGraderGradingpanelStore200ResponseGrade

`func NewGradingformRubricGraderGradingpanelStore200ResponseGrade(canedit bool, criteria []GradingformRubricGraderGradingpanelStore200ResponseGradeCriteriaInner, gradedby string, instanceid int32, maxgrade string, rubricmode string, timecreated int32, timemodified int32, usergrade string, ) *GradingformRubricGraderGradingpanelStore200ResponseGrade`

NewGradingformRubricGraderGradingpanelStore200ResponseGrade instantiates a new GradingformRubricGraderGradingpanelStore200ResponseGrade object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGradingformRubricGraderGradingpanelStore200ResponseGradeWithDefaults

`func NewGradingformRubricGraderGradingpanelStore200ResponseGradeWithDefaults() *GradingformRubricGraderGradingpanelStore200ResponseGrade`

NewGradingformRubricGraderGradingpanelStore200ResponseGradeWithDefaults instantiates a new GradingformRubricGraderGradingpanelStore200ResponseGrade object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCanedit

`func (o *GradingformRubricGraderGradingpanelStore200ResponseGrade) GetCanedit() bool`

GetCanedit returns the Canedit field if non-nil, zero value otherwise.

### GetCaneditOk

`func (o *GradingformRubricGraderGradingpanelStore200ResponseGrade) GetCaneditOk() (*bool, bool)`

GetCaneditOk returns a tuple with the Canedit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanedit

`func (o *GradingformRubricGraderGradingpanelStore200ResponseGrade) SetCanedit(v bool)`

SetCanedit sets Canedit field to given value.


### GetCriteria

`func (o *GradingformRubricGraderGradingpanelStore200ResponseGrade) GetCriteria() []GradingformRubricGraderGradingpanelStore200ResponseGradeCriteriaInner`

GetCriteria returns the Criteria field if non-nil, zero value otherwise.

### GetCriteriaOk

`func (o *GradingformRubricGraderGradingpanelStore200ResponseGrade) GetCriteriaOk() (*[]GradingformRubricGraderGradingpanelStore200ResponseGradeCriteriaInner, bool)`

GetCriteriaOk returns a tuple with the Criteria field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCriteria

`func (o *GradingformRubricGraderGradingpanelStore200ResponseGrade) SetCriteria(v []GradingformRubricGraderGradingpanelStore200ResponseGradeCriteriaInner)`

SetCriteria sets Criteria field to given value.


### GetGradedby

`func (o *GradingformRubricGraderGradingpanelStore200ResponseGrade) GetGradedby() string`

GetGradedby returns the Gradedby field if non-nil, zero value otherwise.

### GetGradedbyOk

`func (o *GradingformRubricGraderGradingpanelStore200ResponseGrade) GetGradedbyOk() (*string, bool)`

GetGradedbyOk returns a tuple with the Gradedby field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradedby

`func (o *GradingformRubricGraderGradingpanelStore200ResponseGrade) SetGradedby(v string)`

SetGradedby sets Gradedby field to given value.


### GetInstanceid

`func (o *GradingformRubricGraderGradingpanelStore200ResponseGrade) GetInstanceid() int32`

GetInstanceid returns the Instanceid field if non-nil, zero value otherwise.

### GetInstanceidOk

`func (o *GradingformRubricGraderGradingpanelStore200ResponseGrade) GetInstanceidOk() (*int32, bool)`

GetInstanceidOk returns a tuple with the Instanceid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstanceid

`func (o *GradingformRubricGraderGradingpanelStore200ResponseGrade) SetInstanceid(v int32)`

SetInstanceid sets Instanceid field to given value.


### GetMaxgrade

`func (o *GradingformRubricGraderGradingpanelStore200ResponseGrade) GetMaxgrade() string`

GetMaxgrade returns the Maxgrade field if non-nil, zero value otherwise.

### GetMaxgradeOk

`func (o *GradingformRubricGraderGradingpanelStore200ResponseGrade) GetMaxgradeOk() (*string, bool)`

GetMaxgradeOk returns a tuple with the Maxgrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxgrade

`func (o *GradingformRubricGraderGradingpanelStore200ResponseGrade) SetMaxgrade(v string)`

SetMaxgrade sets Maxgrade field to given value.


### GetRubricmode

`func (o *GradingformRubricGraderGradingpanelStore200ResponseGrade) GetRubricmode() string`

GetRubricmode returns the Rubricmode field if non-nil, zero value otherwise.

### GetRubricmodeOk

`func (o *GradingformRubricGraderGradingpanelStore200ResponseGrade) GetRubricmodeOk() (*string, bool)`

GetRubricmodeOk returns a tuple with the Rubricmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRubricmode

`func (o *GradingformRubricGraderGradingpanelStore200ResponseGrade) SetRubricmode(v string)`

SetRubricmode sets Rubricmode field to given value.


### GetTimecreated

`func (o *GradingformRubricGraderGradingpanelStore200ResponseGrade) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *GradingformRubricGraderGradingpanelStore200ResponseGrade) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *GradingformRubricGraderGradingpanelStore200ResponseGrade) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.


### GetTimemodified

`func (o *GradingformRubricGraderGradingpanelStore200ResponseGrade) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *GradingformRubricGraderGradingpanelStore200ResponseGrade) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *GradingformRubricGraderGradingpanelStore200ResponseGrade) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.


### GetUsergrade

`func (o *GradingformRubricGraderGradingpanelStore200ResponseGrade) GetUsergrade() string`

GetUsergrade returns the Usergrade field if non-nil, zero value otherwise.

### GetUsergradeOk

`func (o *GradingformRubricGraderGradingpanelStore200ResponseGrade) GetUsergradeOk() (*string, bool)`

GetUsergradeOk returns a tuple with the Usergrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsergrade

`func (o *GradingformRubricGraderGradingpanelStore200ResponseGrade) SetUsergrade(v string)`

SetUsergrade sets Usergrade field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


