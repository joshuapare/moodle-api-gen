# ModAssignGetSubmissionStatus200ResponseFeedback

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Grade** | Pointer to [**ModAssignGetSubmissionStatus200ResponseFeedbackGrade**](ModAssignGetSubmissionStatus200ResponseFeedbackGrade.md) |  | [optional] 
**Gradeddate** | **int32** | The date the user was graded. | [default to null]
**Gradefordisplay** | **string** | Grade rendered into a format suitable for display. | [default to "null"]
**Plugins** | Pointer to [**[]ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner**](ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner.md) |  | [optional] 

## Methods

### NewModAssignGetSubmissionStatus200ResponseFeedback

`func NewModAssignGetSubmissionStatus200ResponseFeedback(gradeddate int32, gradefordisplay string, ) *ModAssignGetSubmissionStatus200ResponseFeedback`

NewModAssignGetSubmissionStatus200ResponseFeedback instantiates a new ModAssignGetSubmissionStatus200ResponseFeedback object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignGetSubmissionStatus200ResponseFeedbackWithDefaults

`func NewModAssignGetSubmissionStatus200ResponseFeedbackWithDefaults() *ModAssignGetSubmissionStatus200ResponseFeedback`

NewModAssignGetSubmissionStatus200ResponseFeedbackWithDefaults instantiates a new ModAssignGetSubmissionStatus200ResponseFeedback object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGrade

`func (o *ModAssignGetSubmissionStatus200ResponseFeedback) GetGrade() ModAssignGetSubmissionStatus200ResponseFeedbackGrade`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *ModAssignGetSubmissionStatus200ResponseFeedback) GetGradeOk() (*ModAssignGetSubmissionStatus200ResponseFeedbackGrade, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *ModAssignGetSubmissionStatus200ResponseFeedback) SetGrade(v ModAssignGetSubmissionStatus200ResponseFeedbackGrade)`

SetGrade sets Grade field to given value.

### HasGrade

`func (o *ModAssignGetSubmissionStatus200ResponseFeedback) HasGrade() bool`

HasGrade returns a boolean if a field has been set.

### GetGradeddate

`func (o *ModAssignGetSubmissionStatus200ResponseFeedback) GetGradeddate() int32`

GetGradeddate returns the Gradeddate field if non-nil, zero value otherwise.

### GetGradeddateOk

`func (o *ModAssignGetSubmissionStatus200ResponseFeedback) GetGradeddateOk() (*int32, bool)`

GetGradeddateOk returns a tuple with the Gradeddate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradeddate

`func (o *ModAssignGetSubmissionStatus200ResponseFeedback) SetGradeddate(v int32)`

SetGradeddate sets Gradeddate field to given value.


### GetGradefordisplay

`func (o *ModAssignGetSubmissionStatus200ResponseFeedback) GetGradefordisplay() string`

GetGradefordisplay returns the Gradefordisplay field if non-nil, zero value otherwise.

### GetGradefordisplayOk

`func (o *ModAssignGetSubmissionStatus200ResponseFeedback) GetGradefordisplayOk() (*string, bool)`

GetGradefordisplayOk returns a tuple with the Gradefordisplay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradefordisplay

`func (o *ModAssignGetSubmissionStatus200ResponseFeedback) SetGradefordisplay(v string)`

SetGradefordisplay sets Gradefordisplay field to given value.


### GetPlugins

`func (o *ModAssignGetSubmissionStatus200ResponseFeedback) GetPlugins() []ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner`

GetPlugins returns the Plugins field if non-nil, zero value otherwise.

### GetPluginsOk

`func (o *ModAssignGetSubmissionStatus200ResponseFeedback) GetPluginsOk() (*[]ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner, bool)`

GetPluginsOk returns a tuple with the Plugins field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlugins

`func (o *ModAssignGetSubmissionStatus200ResponseFeedback) SetPlugins(v []ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner)`

SetPlugins sets Plugins field to given value.

### HasPlugins

`func (o *ModAssignGetSubmissionStatus200ResponseFeedback) HasPlugins() bool`

HasPlugins returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


