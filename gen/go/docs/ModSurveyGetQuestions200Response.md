# ModSurveyGetQuestions200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Questions** | [**[]ModSurveyGetQuestions200ResponseQuestionsInner**](ModSurveyGetQuestions200ResponseQuestionsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModSurveyGetQuestions200Response

`func NewModSurveyGetQuestions200Response(questions []ModSurveyGetQuestions200ResponseQuestionsInner, ) *ModSurveyGetQuestions200Response`

NewModSurveyGetQuestions200Response instantiates a new ModSurveyGetQuestions200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModSurveyGetQuestions200ResponseWithDefaults

`func NewModSurveyGetQuestions200ResponseWithDefaults() *ModSurveyGetQuestions200Response`

NewModSurveyGetQuestions200ResponseWithDefaults instantiates a new ModSurveyGetQuestions200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetQuestions

`func (o *ModSurveyGetQuestions200Response) GetQuestions() []ModSurveyGetQuestions200ResponseQuestionsInner`

GetQuestions returns the Questions field if non-nil, zero value otherwise.

### GetQuestionsOk

`func (o *ModSurveyGetQuestions200Response) GetQuestionsOk() (*[]ModSurveyGetQuestions200ResponseQuestionsInner, bool)`

GetQuestionsOk returns a tuple with the Questions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuestions

`func (o *ModSurveyGetQuestions200Response) SetQuestions(v []ModSurveyGetQuestions200ResponseQuestionsInner)`

SetQuestions sets Questions field to given value.


### GetWarnings

`func (o *ModSurveyGetQuestions200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModSurveyGetQuestions200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModSurveyGetQuestions200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModSurveyGetQuestions200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


