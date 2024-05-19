# ModQuizGetQuizzesByCourses200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Quizzes** | [**[]ModQuizGetQuizzesByCourses200ResponseQuizzesInner**](ModQuizGetQuizzesByCourses200ResponseQuizzesInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModQuizGetQuizzesByCourses200Response

`func NewModQuizGetQuizzesByCourses200Response(quizzes []ModQuizGetQuizzesByCourses200ResponseQuizzesInner, ) *ModQuizGetQuizzesByCourses200Response`

NewModQuizGetQuizzesByCourses200Response instantiates a new ModQuizGetQuizzesByCourses200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModQuizGetQuizzesByCourses200ResponseWithDefaults

`func NewModQuizGetQuizzesByCourses200ResponseWithDefaults() *ModQuizGetQuizzesByCourses200Response`

NewModQuizGetQuizzesByCourses200ResponseWithDefaults instantiates a new ModQuizGetQuizzesByCourses200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetQuizzes

`func (o *ModQuizGetQuizzesByCourses200Response) GetQuizzes() []ModQuizGetQuizzesByCourses200ResponseQuizzesInner`

GetQuizzes returns the Quizzes field if non-nil, zero value otherwise.

### GetQuizzesOk

`func (o *ModQuizGetQuizzesByCourses200Response) GetQuizzesOk() (*[]ModQuizGetQuizzesByCourses200ResponseQuizzesInner, bool)`

GetQuizzesOk returns a tuple with the Quizzes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuizzes

`func (o *ModQuizGetQuizzesByCourses200Response) SetQuizzes(v []ModQuizGetQuizzesByCourses200ResponseQuizzesInner)`

SetQuizzes sets Quizzes field to given value.


### GetWarnings

`func (o *ModQuizGetQuizzesByCourses200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModQuizGetQuizzesByCourses200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModQuizGetQuizzesByCourses200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModQuizGetQuizzesByCourses200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


