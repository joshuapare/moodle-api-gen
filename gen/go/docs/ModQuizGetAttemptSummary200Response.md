# ModQuizGetAttemptSummary200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Questions** | [**[]ModQuizGetAttemptReview200ResponseQuestionsInner**](ModQuizGetAttemptReview200ResponseQuestionsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModQuizGetAttemptSummary200Response

`func NewModQuizGetAttemptSummary200Response(questions []ModQuizGetAttemptReview200ResponseQuestionsInner, ) *ModQuizGetAttemptSummary200Response`

NewModQuizGetAttemptSummary200Response instantiates a new ModQuizGetAttemptSummary200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModQuizGetAttemptSummary200ResponseWithDefaults

`func NewModQuizGetAttemptSummary200ResponseWithDefaults() *ModQuizGetAttemptSummary200Response`

NewModQuizGetAttemptSummary200ResponseWithDefaults instantiates a new ModQuizGetAttemptSummary200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetQuestions

`func (o *ModQuizGetAttemptSummary200Response) GetQuestions() []ModQuizGetAttemptReview200ResponseQuestionsInner`

GetQuestions returns the Questions field if non-nil, zero value otherwise.

### GetQuestionsOk

`func (o *ModQuizGetAttemptSummary200Response) GetQuestionsOk() (*[]ModQuizGetAttemptReview200ResponseQuestionsInner, bool)`

GetQuestionsOk returns a tuple with the Questions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuestions

`func (o *ModQuizGetAttemptSummary200Response) SetQuestions(v []ModQuizGetAttemptReview200ResponseQuestionsInner)`

SetQuestions sets Questions field to given value.


### GetWarnings

`func (o *ModQuizGetAttemptSummary200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModQuizGetAttemptSummary200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModQuizGetAttemptSummary200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModQuizGetAttemptSummary200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


