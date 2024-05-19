# CoreQuestionGetRandomQuestionSummaries200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Questions** | [**[]CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner**](CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner.md) |  | 
**Totalcount** | **int32** | total number of questions in result set | [default to null]

## Methods

### NewCoreQuestionGetRandomQuestionSummaries200Response

`func NewCoreQuestionGetRandomQuestionSummaries200Response(questions []CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner, totalcount int32, ) *CoreQuestionGetRandomQuestionSummaries200Response`

NewCoreQuestionGetRandomQuestionSummaries200Response instantiates a new CoreQuestionGetRandomQuestionSummaries200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreQuestionGetRandomQuestionSummaries200ResponseWithDefaults

`func NewCoreQuestionGetRandomQuestionSummaries200ResponseWithDefaults() *CoreQuestionGetRandomQuestionSummaries200Response`

NewCoreQuestionGetRandomQuestionSummaries200ResponseWithDefaults instantiates a new CoreQuestionGetRandomQuestionSummaries200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetQuestions

`func (o *CoreQuestionGetRandomQuestionSummaries200Response) GetQuestions() []CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner`

GetQuestions returns the Questions field if non-nil, zero value otherwise.

### GetQuestionsOk

`func (o *CoreQuestionGetRandomQuestionSummaries200Response) GetQuestionsOk() (*[]CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner, bool)`

GetQuestionsOk returns a tuple with the Questions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuestions

`func (o *CoreQuestionGetRandomQuestionSummaries200Response) SetQuestions(v []CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner)`

SetQuestions sets Questions field to given value.


### GetTotalcount

`func (o *CoreQuestionGetRandomQuestionSummaries200Response) GetTotalcount() int32`

GetTotalcount returns the Totalcount field if non-nil, zero value otherwise.

### GetTotalcountOk

`func (o *CoreQuestionGetRandomQuestionSummaries200Response) GetTotalcountOk() (*int32, bool)`

GetTotalcountOk returns a tuple with the Totalcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalcount

`func (o *CoreQuestionGetRandomQuestionSummaries200Response) SetTotalcount(v int32)`

SetTotalcount sets Totalcount field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


