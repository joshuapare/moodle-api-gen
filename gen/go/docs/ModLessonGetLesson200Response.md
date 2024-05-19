# ModLessonGetLesson200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Lesson** | [**ModLessonGetLesson200ResponseLesson**](ModLessonGetLesson200ResponseLesson.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModLessonGetLesson200Response

`func NewModLessonGetLesson200Response(lesson ModLessonGetLesson200ResponseLesson, ) *ModLessonGetLesson200Response`

NewModLessonGetLesson200Response instantiates a new ModLessonGetLesson200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetLesson200ResponseWithDefaults

`func NewModLessonGetLesson200ResponseWithDefaults() *ModLessonGetLesson200Response`

NewModLessonGetLesson200ResponseWithDefaults instantiates a new ModLessonGetLesson200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLesson

`func (o *ModLessonGetLesson200Response) GetLesson() ModLessonGetLesson200ResponseLesson`

GetLesson returns the Lesson field if non-nil, zero value otherwise.

### GetLessonOk

`func (o *ModLessonGetLesson200Response) GetLessonOk() (*ModLessonGetLesson200ResponseLesson, bool)`

GetLessonOk returns a tuple with the Lesson field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLesson

`func (o *ModLessonGetLesson200Response) SetLesson(v ModLessonGetLesson200ResponseLesson)`

SetLesson sets Lesson field to given value.


### GetWarnings

`func (o *ModLessonGetLesson200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModLessonGetLesson200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModLessonGetLesson200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModLessonGetLesson200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


