# ModSurveySubmitAnswersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Answers** | [**[]ModSurveySubmitAnswersRequestAnswersInner**](ModSurveySubmitAnswersRequestAnswersInner.md) |  | 
**Surveyid** | **int32** | Survey id | [default to null]

## Methods

### NewModSurveySubmitAnswersRequest

`func NewModSurveySubmitAnswersRequest(answers []ModSurveySubmitAnswersRequestAnswersInner, surveyid int32, ) *ModSurveySubmitAnswersRequest`

NewModSurveySubmitAnswersRequest instantiates a new ModSurveySubmitAnswersRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModSurveySubmitAnswersRequestWithDefaults

`func NewModSurveySubmitAnswersRequestWithDefaults() *ModSurveySubmitAnswersRequest`

NewModSurveySubmitAnswersRequestWithDefaults instantiates a new ModSurveySubmitAnswersRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAnswers

`func (o *ModSurveySubmitAnswersRequest) GetAnswers() []ModSurveySubmitAnswersRequestAnswersInner`

GetAnswers returns the Answers field if non-nil, zero value otherwise.

### GetAnswersOk

`func (o *ModSurveySubmitAnswersRequest) GetAnswersOk() (*[]ModSurveySubmitAnswersRequestAnswersInner, bool)`

GetAnswersOk returns a tuple with the Answers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAnswers

`func (o *ModSurveySubmitAnswersRequest) SetAnswers(v []ModSurveySubmitAnswersRequestAnswersInner)`

SetAnswers sets Answers field to given value.


### GetSurveyid

`func (o *ModSurveySubmitAnswersRequest) GetSurveyid() int32`

GetSurveyid returns the Surveyid field if non-nil, zero value otherwise.

### GetSurveyidOk

`func (o *ModSurveySubmitAnswersRequest) GetSurveyidOk() (*int32, bool)`

GetSurveyidOk returns a tuple with the Surveyid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSurveyid

`func (o *ModSurveySubmitAnswersRequest) SetSurveyid(v int32)`

SetSurveyid sets Surveyid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


