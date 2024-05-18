# ModLessonGetLessonsByCourses200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Lessons** | [**[]ModLessonGetLessonsByCourses200ResponseLessonsInner**](ModLessonGetLessonsByCourses200ResponseLessonsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModLessonGetLessonsByCourses200Response

`func NewModLessonGetLessonsByCourses200Response(lessons []ModLessonGetLessonsByCourses200ResponseLessonsInner, ) *ModLessonGetLessonsByCourses200Response`

NewModLessonGetLessonsByCourses200Response instantiates a new ModLessonGetLessonsByCourses200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetLessonsByCourses200ResponseWithDefaults

`func NewModLessonGetLessonsByCourses200ResponseWithDefaults() *ModLessonGetLessonsByCourses200Response`

NewModLessonGetLessonsByCourses200ResponseWithDefaults instantiates a new ModLessonGetLessonsByCourses200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLessons

`func (o *ModLessonGetLessonsByCourses200Response) GetLessons() []ModLessonGetLessonsByCourses200ResponseLessonsInner`

GetLessons returns the Lessons field if non-nil, zero value otherwise.

### GetLessonsOk

`func (o *ModLessonGetLessonsByCourses200Response) GetLessonsOk() (*[]ModLessonGetLessonsByCourses200ResponseLessonsInner, bool)`

GetLessonsOk returns a tuple with the Lessons field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLessons

`func (o *ModLessonGetLessonsByCourses200Response) SetLessons(v []ModLessonGetLessonsByCourses200ResponseLessonsInner)`

SetLessons sets Lessons field to given value.


### GetWarnings

`func (o *ModLessonGetLessonsByCourses200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModLessonGetLessonsByCourses200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModLessonGetLessonsByCourses200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModLessonGetLessonsByCourses200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


