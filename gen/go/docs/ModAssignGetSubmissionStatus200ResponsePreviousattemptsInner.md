# ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attemptnumber** | Pointer to **int32** | Attempt number. | [optional] [default to null]
**Feedbackplugins** | Pointer to [**[]ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner**](ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner.md) |  | [optional] 
**Grade** | Pointer to [**ModAssignGetSubmissionStatus200ResponseFeedbackGrade**](ModAssignGetSubmissionStatus200ResponseFeedbackGrade.md) |  | [optional] 
**Submission** | Pointer to [**ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission**](ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.md) |  | [optional] 

## Methods

### NewModAssignGetSubmissionStatus200ResponsePreviousattemptsInner

`func NewModAssignGetSubmissionStatus200ResponsePreviousattemptsInner() *ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner`

NewModAssignGetSubmissionStatus200ResponsePreviousattemptsInner instantiates a new ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignGetSubmissionStatus200ResponsePreviousattemptsInnerWithDefaults

`func NewModAssignGetSubmissionStatus200ResponsePreviousattemptsInnerWithDefaults() *ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner`

NewModAssignGetSubmissionStatus200ResponsePreviousattemptsInnerWithDefaults instantiates a new ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttemptnumber

`func (o *ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner) GetAttemptnumber() int32`

GetAttemptnumber returns the Attemptnumber field if non-nil, zero value otherwise.

### GetAttemptnumberOk

`func (o *ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner) GetAttemptnumberOk() (*int32, bool)`

GetAttemptnumberOk returns a tuple with the Attemptnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttemptnumber

`func (o *ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner) SetAttemptnumber(v int32)`

SetAttemptnumber sets Attemptnumber field to given value.

### HasAttemptnumber

`func (o *ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner) HasAttemptnumber() bool`

HasAttemptnumber returns a boolean if a field has been set.

### GetFeedbackplugins

`func (o *ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner) GetFeedbackplugins() []ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner`

GetFeedbackplugins returns the Feedbackplugins field if non-nil, zero value otherwise.

### GetFeedbackpluginsOk

`func (o *ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner) GetFeedbackpluginsOk() (*[]ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner, bool)`

GetFeedbackpluginsOk returns a tuple with the Feedbackplugins field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackplugins

`func (o *ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner) SetFeedbackplugins(v []ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner)`

SetFeedbackplugins sets Feedbackplugins field to given value.

### HasFeedbackplugins

`func (o *ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner) HasFeedbackplugins() bool`

HasFeedbackplugins returns a boolean if a field has been set.

### GetGrade

`func (o *ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner) GetGrade() ModAssignGetSubmissionStatus200ResponseFeedbackGrade`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner) GetGradeOk() (*ModAssignGetSubmissionStatus200ResponseFeedbackGrade, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner) SetGrade(v ModAssignGetSubmissionStatus200ResponseFeedbackGrade)`

SetGrade sets Grade field to given value.

### HasGrade

`func (o *ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner) HasGrade() bool`

HasGrade returns a boolean if a field has been set.

### GetSubmission

`func (o *ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner) GetSubmission() ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission`

GetSubmission returns the Submission field if non-nil, zero value otherwise.

### GetSubmissionOk

`func (o *ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner) GetSubmissionOk() (*ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission, bool)`

GetSubmissionOk returns a tuple with the Submission field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmission

`func (o *ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner) SetSubmission(v ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission)`

SetSubmission sets Submission field to given value.

### HasSubmission

`func (o *ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner) HasSubmission() bool`

HasSubmission returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


