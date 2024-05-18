# ModAssignGetSubmissionStatus200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Assignmentdata** | Pointer to [**ModAssignGetSubmissionStatus200ResponseAssignmentdata**](ModAssignGetSubmissionStatus200ResponseAssignmentdata.md) |  | [optional] 
**Feedback** | Pointer to [**ModAssignGetSubmissionStatus200ResponseFeedback**](ModAssignGetSubmissionStatus200ResponseFeedback.md) |  | [optional] 
**Gradingsummary** | Pointer to [**ModAssignGetSubmissionStatus200ResponseGradingsummary**](ModAssignGetSubmissionStatus200ResponseGradingsummary.md) |  | [optional] 
**Lastattempt** | Pointer to [**ModAssignGetSubmissionStatus200ResponseLastattempt**](ModAssignGetSubmissionStatus200ResponseLastattempt.md) |  | [optional] 
**Previousattempts** | Pointer to [**[]ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner**](ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner.md) |  | [optional] 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModAssignGetSubmissionStatus200Response

`func NewModAssignGetSubmissionStatus200Response() *ModAssignGetSubmissionStatus200Response`

NewModAssignGetSubmissionStatus200Response instantiates a new ModAssignGetSubmissionStatus200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignGetSubmissionStatus200ResponseWithDefaults

`func NewModAssignGetSubmissionStatus200ResponseWithDefaults() *ModAssignGetSubmissionStatus200Response`

NewModAssignGetSubmissionStatus200ResponseWithDefaults instantiates a new ModAssignGetSubmissionStatus200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssignmentdata

`func (o *ModAssignGetSubmissionStatus200Response) GetAssignmentdata() ModAssignGetSubmissionStatus200ResponseAssignmentdata`

GetAssignmentdata returns the Assignmentdata field if non-nil, zero value otherwise.

### GetAssignmentdataOk

`func (o *ModAssignGetSubmissionStatus200Response) GetAssignmentdataOk() (*ModAssignGetSubmissionStatus200ResponseAssignmentdata, bool)`

GetAssignmentdataOk returns a tuple with the Assignmentdata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssignmentdata

`func (o *ModAssignGetSubmissionStatus200Response) SetAssignmentdata(v ModAssignGetSubmissionStatus200ResponseAssignmentdata)`

SetAssignmentdata sets Assignmentdata field to given value.

### HasAssignmentdata

`func (o *ModAssignGetSubmissionStatus200Response) HasAssignmentdata() bool`

HasAssignmentdata returns a boolean if a field has been set.

### GetFeedback

`func (o *ModAssignGetSubmissionStatus200Response) GetFeedback() ModAssignGetSubmissionStatus200ResponseFeedback`

GetFeedback returns the Feedback field if non-nil, zero value otherwise.

### GetFeedbackOk

`func (o *ModAssignGetSubmissionStatus200Response) GetFeedbackOk() (*ModAssignGetSubmissionStatus200ResponseFeedback, bool)`

GetFeedbackOk returns a tuple with the Feedback field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedback

`func (o *ModAssignGetSubmissionStatus200Response) SetFeedback(v ModAssignGetSubmissionStatus200ResponseFeedback)`

SetFeedback sets Feedback field to given value.

### HasFeedback

`func (o *ModAssignGetSubmissionStatus200Response) HasFeedback() bool`

HasFeedback returns a boolean if a field has been set.

### GetGradingsummary

`func (o *ModAssignGetSubmissionStatus200Response) GetGradingsummary() ModAssignGetSubmissionStatus200ResponseGradingsummary`

GetGradingsummary returns the Gradingsummary field if non-nil, zero value otherwise.

### GetGradingsummaryOk

`func (o *ModAssignGetSubmissionStatus200Response) GetGradingsummaryOk() (*ModAssignGetSubmissionStatus200ResponseGradingsummary, bool)`

GetGradingsummaryOk returns a tuple with the Gradingsummary field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradingsummary

`func (o *ModAssignGetSubmissionStatus200Response) SetGradingsummary(v ModAssignGetSubmissionStatus200ResponseGradingsummary)`

SetGradingsummary sets Gradingsummary field to given value.

### HasGradingsummary

`func (o *ModAssignGetSubmissionStatus200Response) HasGradingsummary() bool`

HasGradingsummary returns a boolean if a field has been set.

### GetLastattempt

`func (o *ModAssignGetSubmissionStatus200Response) GetLastattempt() ModAssignGetSubmissionStatus200ResponseLastattempt`

GetLastattempt returns the Lastattempt field if non-nil, zero value otherwise.

### GetLastattemptOk

`func (o *ModAssignGetSubmissionStatus200Response) GetLastattemptOk() (*ModAssignGetSubmissionStatus200ResponseLastattempt, bool)`

GetLastattemptOk returns a tuple with the Lastattempt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastattempt

`func (o *ModAssignGetSubmissionStatus200Response) SetLastattempt(v ModAssignGetSubmissionStatus200ResponseLastattempt)`

SetLastattempt sets Lastattempt field to given value.

### HasLastattempt

`func (o *ModAssignGetSubmissionStatus200Response) HasLastattempt() bool`

HasLastattempt returns a boolean if a field has been set.

### GetPreviousattempts

`func (o *ModAssignGetSubmissionStatus200Response) GetPreviousattempts() []ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner`

GetPreviousattempts returns the Previousattempts field if non-nil, zero value otherwise.

### GetPreviousattemptsOk

`func (o *ModAssignGetSubmissionStatus200Response) GetPreviousattemptsOk() (*[]ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner, bool)`

GetPreviousattemptsOk returns a tuple with the Previousattempts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreviousattempts

`func (o *ModAssignGetSubmissionStatus200Response) SetPreviousattempts(v []ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner)`

SetPreviousattempts sets Previousattempts field to given value.

### HasPreviousattempts

`func (o *ModAssignGetSubmissionStatus200Response) HasPreviousattempts() bool`

HasPreviousattempts returns a boolean if a field has been set.

### GetWarnings

`func (o *ModAssignGetSubmissionStatus200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModAssignGetSubmissionStatus200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModAssignGetSubmissionStatus200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModAssignGetSubmissionStatus200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


