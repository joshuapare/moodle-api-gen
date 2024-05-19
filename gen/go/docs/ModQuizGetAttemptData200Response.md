# ModQuizGetAttemptData200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attempt** | [**ModQuizGetAttemptData200ResponseAttempt**](ModQuizGetAttemptData200ResponseAttempt.md) |  | 
**Messages** | **[]map[string]interface{}** |  | 
**Nextpage** | **int32** | next page number | [default to null]
**Questions** | [**[]ModQuizGetAttemptData200ResponseQuestionsInner**](ModQuizGetAttemptData200ResponseQuestionsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModQuizGetAttemptData200Response

`func NewModQuizGetAttemptData200Response(attempt ModQuizGetAttemptData200ResponseAttempt, messages []map[string]interface{}, nextpage int32, questions []ModQuizGetAttemptData200ResponseQuestionsInner, ) *ModQuizGetAttemptData200Response`

NewModQuizGetAttemptData200Response instantiates a new ModQuizGetAttemptData200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModQuizGetAttemptData200ResponseWithDefaults

`func NewModQuizGetAttemptData200ResponseWithDefaults() *ModQuizGetAttemptData200Response`

NewModQuizGetAttemptData200ResponseWithDefaults instantiates a new ModQuizGetAttemptData200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttempt

`func (o *ModQuizGetAttemptData200Response) GetAttempt() ModQuizGetAttemptData200ResponseAttempt`

GetAttempt returns the Attempt field if non-nil, zero value otherwise.

### GetAttemptOk

`func (o *ModQuizGetAttemptData200Response) GetAttemptOk() (*ModQuizGetAttemptData200ResponseAttempt, bool)`

GetAttemptOk returns a tuple with the Attempt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttempt

`func (o *ModQuizGetAttemptData200Response) SetAttempt(v ModQuizGetAttemptData200ResponseAttempt)`

SetAttempt sets Attempt field to given value.


### GetMessages

`func (o *ModQuizGetAttemptData200Response) GetMessages() []map[string]interface{}`

GetMessages returns the Messages field if non-nil, zero value otherwise.

### GetMessagesOk

`func (o *ModQuizGetAttemptData200Response) GetMessagesOk() (*[]map[string]interface{}, bool)`

GetMessagesOk returns a tuple with the Messages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessages

`func (o *ModQuizGetAttemptData200Response) SetMessages(v []map[string]interface{})`

SetMessages sets Messages field to given value.


### GetNextpage

`func (o *ModQuizGetAttemptData200Response) GetNextpage() int32`

GetNextpage returns the Nextpage field if non-nil, zero value otherwise.

### GetNextpageOk

`func (o *ModQuizGetAttemptData200Response) GetNextpageOk() (*int32, bool)`

GetNextpageOk returns a tuple with the Nextpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextpage

`func (o *ModQuizGetAttemptData200Response) SetNextpage(v int32)`

SetNextpage sets Nextpage field to given value.


### GetQuestions

`func (o *ModQuizGetAttemptData200Response) GetQuestions() []ModQuizGetAttemptData200ResponseQuestionsInner`

GetQuestions returns the Questions field if non-nil, zero value otherwise.

### GetQuestionsOk

`func (o *ModQuizGetAttemptData200Response) GetQuestionsOk() (*[]ModQuizGetAttemptData200ResponseQuestionsInner, bool)`

GetQuestionsOk returns a tuple with the Questions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuestions

`func (o *ModQuizGetAttemptData200Response) SetQuestions(v []ModQuizGetAttemptData200ResponseQuestionsInner)`

SetQuestions sets Questions field to given value.


### GetWarnings

`func (o *ModQuizGetAttemptData200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModQuizGetAttemptData200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModQuizGetAttemptData200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModQuizGetAttemptData200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


