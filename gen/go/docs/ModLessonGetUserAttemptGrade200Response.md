# ModLessonGetUserAttemptGrade200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Grade** | [**ModLessonGetUserAttemptGrade200ResponseGrade**](ModLessonGetUserAttemptGrade200ResponseGrade.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModLessonGetUserAttemptGrade200Response

`func NewModLessonGetUserAttemptGrade200Response(grade ModLessonGetUserAttemptGrade200ResponseGrade, ) *ModLessonGetUserAttemptGrade200Response`

NewModLessonGetUserAttemptGrade200Response instantiates a new ModLessonGetUserAttemptGrade200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetUserAttemptGrade200ResponseWithDefaults

`func NewModLessonGetUserAttemptGrade200ResponseWithDefaults() *ModLessonGetUserAttemptGrade200Response`

NewModLessonGetUserAttemptGrade200ResponseWithDefaults instantiates a new ModLessonGetUserAttemptGrade200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGrade

`func (o *ModLessonGetUserAttemptGrade200Response) GetGrade() ModLessonGetUserAttemptGrade200ResponseGrade`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *ModLessonGetUserAttemptGrade200Response) GetGradeOk() (*ModLessonGetUserAttemptGrade200ResponseGrade, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *ModLessonGetUserAttemptGrade200Response) SetGrade(v ModLessonGetUserAttemptGrade200ResponseGrade)`

SetGrade sets Grade field to given value.


### GetWarnings

`func (o *ModLessonGetUserAttemptGrade200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModLessonGetUserAttemptGrade200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModLessonGetUserAttemptGrade200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModLessonGetUserAttemptGrade200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


