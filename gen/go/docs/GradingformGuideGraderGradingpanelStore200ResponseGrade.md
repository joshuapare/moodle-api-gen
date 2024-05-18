# GradingformGuideGraderGradingpanelStore200ResponseGrade

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Comments** | [**[]GradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner**](GradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner.md) |  | 
**Criterion** | [**[]GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner**](GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner.md) |  | 
**Gradedby** | **string** | The assumed grader of this grading instance | 
**Hascomments** | **bool** | Whether there are any frequently-used comments | 
**Instanceid** | **int32** | The id of the current grading instance | 
**Maxgrade** | **string** | Max possible grade | 
**Timecreated** | **int32** | The time that the grade was created | 
**Timemodified** | **int32** | The time that the grade was last updated | 
**Usergrade** | **string** | Current user grade | 

## Methods

### NewGradingformGuideGraderGradingpanelStore200ResponseGrade

`func NewGradingformGuideGraderGradingpanelStore200ResponseGrade(comments []GradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner, criterion []GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner, gradedby string, hascomments bool, instanceid int32, maxgrade string, timecreated int32, timemodified int32, usergrade string, ) *GradingformGuideGraderGradingpanelStore200ResponseGrade`

NewGradingformGuideGraderGradingpanelStore200ResponseGrade instantiates a new GradingformGuideGraderGradingpanelStore200ResponseGrade object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGradingformGuideGraderGradingpanelStore200ResponseGradeWithDefaults

`func NewGradingformGuideGraderGradingpanelStore200ResponseGradeWithDefaults() *GradingformGuideGraderGradingpanelStore200ResponseGrade`

NewGradingformGuideGraderGradingpanelStore200ResponseGradeWithDefaults instantiates a new GradingformGuideGraderGradingpanelStore200ResponseGrade object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetComments

`func (o *GradingformGuideGraderGradingpanelStore200ResponseGrade) GetComments() []GradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner`

GetComments returns the Comments field if non-nil, zero value otherwise.

### GetCommentsOk

`func (o *GradingformGuideGraderGradingpanelStore200ResponseGrade) GetCommentsOk() (*[]GradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner, bool)`

GetCommentsOk returns a tuple with the Comments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComments

`func (o *GradingformGuideGraderGradingpanelStore200ResponseGrade) SetComments(v []GradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner)`

SetComments sets Comments field to given value.


### GetCriterion

`func (o *GradingformGuideGraderGradingpanelStore200ResponseGrade) GetCriterion() []GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner`

GetCriterion returns the Criterion field if non-nil, zero value otherwise.

### GetCriterionOk

`func (o *GradingformGuideGraderGradingpanelStore200ResponseGrade) GetCriterionOk() (*[]GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner, bool)`

GetCriterionOk returns a tuple with the Criterion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCriterion

`func (o *GradingformGuideGraderGradingpanelStore200ResponseGrade) SetCriterion(v []GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner)`

SetCriterion sets Criterion field to given value.


### GetGradedby

`func (o *GradingformGuideGraderGradingpanelStore200ResponseGrade) GetGradedby() string`

GetGradedby returns the Gradedby field if non-nil, zero value otherwise.

### GetGradedbyOk

`func (o *GradingformGuideGraderGradingpanelStore200ResponseGrade) GetGradedbyOk() (*string, bool)`

GetGradedbyOk returns a tuple with the Gradedby field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradedby

`func (o *GradingformGuideGraderGradingpanelStore200ResponseGrade) SetGradedby(v string)`

SetGradedby sets Gradedby field to given value.


### GetHascomments

`func (o *GradingformGuideGraderGradingpanelStore200ResponseGrade) GetHascomments() bool`

GetHascomments returns the Hascomments field if non-nil, zero value otherwise.

### GetHascommentsOk

`func (o *GradingformGuideGraderGradingpanelStore200ResponseGrade) GetHascommentsOk() (*bool, bool)`

GetHascommentsOk returns a tuple with the Hascomments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHascomments

`func (o *GradingformGuideGraderGradingpanelStore200ResponseGrade) SetHascomments(v bool)`

SetHascomments sets Hascomments field to given value.


### GetInstanceid

`func (o *GradingformGuideGraderGradingpanelStore200ResponseGrade) GetInstanceid() int32`

GetInstanceid returns the Instanceid field if non-nil, zero value otherwise.

### GetInstanceidOk

`func (o *GradingformGuideGraderGradingpanelStore200ResponseGrade) GetInstanceidOk() (*int32, bool)`

GetInstanceidOk returns a tuple with the Instanceid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstanceid

`func (o *GradingformGuideGraderGradingpanelStore200ResponseGrade) SetInstanceid(v int32)`

SetInstanceid sets Instanceid field to given value.


### GetMaxgrade

`func (o *GradingformGuideGraderGradingpanelStore200ResponseGrade) GetMaxgrade() string`

GetMaxgrade returns the Maxgrade field if non-nil, zero value otherwise.

### GetMaxgradeOk

`func (o *GradingformGuideGraderGradingpanelStore200ResponseGrade) GetMaxgradeOk() (*string, bool)`

GetMaxgradeOk returns a tuple with the Maxgrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxgrade

`func (o *GradingformGuideGraderGradingpanelStore200ResponseGrade) SetMaxgrade(v string)`

SetMaxgrade sets Maxgrade field to given value.


### GetTimecreated

`func (o *GradingformGuideGraderGradingpanelStore200ResponseGrade) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *GradingformGuideGraderGradingpanelStore200ResponseGrade) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *GradingformGuideGraderGradingpanelStore200ResponseGrade) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.


### GetTimemodified

`func (o *GradingformGuideGraderGradingpanelStore200ResponseGrade) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *GradingformGuideGraderGradingpanelStore200ResponseGrade) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *GradingformGuideGraderGradingpanelStore200ResponseGrade) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.


### GetUsergrade

`func (o *GradingformGuideGraderGradingpanelStore200ResponseGrade) GetUsergrade() string`

GetUsergrade returns the Usergrade field if non-nil, zero value otherwise.

### GetUsergradeOk

`func (o *GradingformGuideGraderGradingpanelStore200ResponseGrade) GetUsergradeOk() (*string, bool)`

GetUsergradeOk returns a tuple with the Usergrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsergrade

`func (o *GradingformGuideGraderGradingpanelStore200ResponseGrade) SetUsergrade(v string)`

SetUsergrade sets Usergrade field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


