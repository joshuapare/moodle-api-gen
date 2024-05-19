# ModLessonGetQuestionsAttempts200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attempts** | [**[]ModLessonGetQuestionsAttempts200ResponseAttemptsInner**](ModLessonGetQuestionsAttempts200ResponseAttemptsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModLessonGetQuestionsAttempts200Response

`func NewModLessonGetQuestionsAttempts200Response(attempts []ModLessonGetQuestionsAttempts200ResponseAttemptsInner, ) *ModLessonGetQuestionsAttempts200Response`

NewModLessonGetQuestionsAttempts200Response instantiates a new ModLessonGetQuestionsAttempts200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetQuestionsAttempts200ResponseWithDefaults

`func NewModLessonGetQuestionsAttempts200ResponseWithDefaults() *ModLessonGetQuestionsAttempts200Response`

NewModLessonGetQuestionsAttempts200ResponseWithDefaults instantiates a new ModLessonGetQuestionsAttempts200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttempts

`func (o *ModLessonGetQuestionsAttempts200Response) GetAttempts() []ModLessonGetQuestionsAttempts200ResponseAttemptsInner`

GetAttempts returns the Attempts field if non-nil, zero value otherwise.

### GetAttemptsOk

`func (o *ModLessonGetQuestionsAttempts200Response) GetAttemptsOk() (*[]ModLessonGetQuestionsAttempts200ResponseAttemptsInner, bool)`

GetAttemptsOk returns a tuple with the Attempts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttempts

`func (o *ModLessonGetQuestionsAttempts200Response) SetAttempts(v []ModLessonGetQuestionsAttempts200ResponseAttemptsInner)`

SetAttempts sets Attempts field to given value.


### GetWarnings

`func (o *ModLessonGetQuestionsAttempts200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModLessonGetQuestionsAttempts200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModLessonGetQuestionsAttempts200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModLessonGetQuestionsAttempts200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


