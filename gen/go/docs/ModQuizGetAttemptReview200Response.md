# ModQuizGetAttemptReview200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Additionaldata** | [**[]ModQuizGetAttemptReview200ResponseAdditionaldataInner**](ModQuizGetAttemptReview200ResponseAdditionaldataInner.md) |  | 
**Attempt** | [**ModQuizGetAttemptReview200ResponseAttempt**](ModQuizGetAttemptReview200ResponseAttempt.md) |  | 
**Grade** | **string** | grade for the quiz (or empty or \&quot;notyetgraded\&quot;) | [default to "null"]
**Questions** | [**[]ModQuizGetAttemptReview200ResponseQuestionsInner**](ModQuizGetAttemptReview200ResponseQuestionsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModQuizGetAttemptReview200Response

`func NewModQuizGetAttemptReview200Response(additionaldata []ModQuizGetAttemptReview200ResponseAdditionaldataInner, attempt ModQuizGetAttemptReview200ResponseAttempt, grade string, questions []ModQuizGetAttemptReview200ResponseQuestionsInner, ) *ModQuizGetAttemptReview200Response`

NewModQuizGetAttemptReview200Response instantiates a new ModQuizGetAttemptReview200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModQuizGetAttemptReview200ResponseWithDefaults

`func NewModQuizGetAttemptReview200ResponseWithDefaults() *ModQuizGetAttemptReview200Response`

NewModQuizGetAttemptReview200ResponseWithDefaults instantiates a new ModQuizGetAttemptReview200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdditionaldata

`func (o *ModQuizGetAttemptReview200Response) GetAdditionaldata() []ModQuizGetAttemptReview200ResponseAdditionaldataInner`

GetAdditionaldata returns the Additionaldata field if non-nil, zero value otherwise.

### GetAdditionaldataOk

`func (o *ModQuizGetAttemptReview200Response) GetAdditionaldataOk() (*[]ModQuizGetAttemptReview200ResponseAdditionaldataInner, bool)`

GetAdditionaldataOk returns a tuple with the Additionaldata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdditionaldata

`func (o *ModQuizGetAttemptReview200Response) SetAdditionaldata(v []ModQuizGetAttemptReview200ResponseAdditionaldataInner)`

SetAdditionaldata sets Additionaldata field to given value.


### GetAttempt

`func (o *ModQuizGetAttemptReview200Response) GetAttempt() ModQuizGetAttemptReview200ResponseAttempt`

GetAttempt returns the Attempt field if non-nil, zero value otherwise.

### GetAttemptOk

`func (o *ModQuizGetAttemptReview200Response) GetAttemptOk() (*ModQuizGetAttemptReview200ResponseAttempt, bool)`

GetAttemptOk returns a tuple with the Attempt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttempt

`func (o *ModQuizGetAttemptReview200Response) SetAttempt(v ModQuizGetAttemptReview200ResponseAttempt)`

SetAttempt sets Attempt field to given value.


### GetGrade

`func (o *ModQuizGetAttemptReview200Response) GetGrade() string`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *ModQuizGetAttemptReview200Response) GetGradeOk() (*string, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *ModQuizGetAttemptReview200Response) SetGrade(v string)`

SetGrade sets Grade field to given value.


### GetQuestions

`func (o *ModQuizGetAttemptReview200Response) GetQuestions() []ModQuizGetAttemptReview200ResponseQuestionsInner`

GetQuestions returns the Questions field if non-nil, zero value otherwise.

### GetQuestionsOk

`func (o *ModQuizGetAttemptReview200Response) GetQuestionsOk() (*[]ModQuizGetAttemptReview200ResponseQuestionsInner, bool)`

GetQuestionsOk returns a tuple with the Questions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuestions

`func (o *ModQuizGetAttemptReview200Response) SetQuestions(v []ModQuizGetAttemptReview200ResponseQuestionsInner)`

SetQuestions sets Questions field to given value.


### GetWarnings

`func (o *ModQuizGetAttemptReview200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModQuizGetAttemptReview200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModQuizGetAttemptReview200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModQuizGetAttemptReview200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


