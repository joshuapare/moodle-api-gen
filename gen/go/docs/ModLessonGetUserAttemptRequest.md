# ModLessonGetUserAttemptRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Lessonattempt** | **int32** | The attempt number. | [default to null]
**Lessonid** | **int32** | Lesson instance id. | 
**Userid** | **int32** | The user id. 0 for current user. | [default to null]

## Methods

### NewModLessonGetUserAttemptRequest

`func NewModLessonGetUserAttemptRequest(lessonattempt int32, lessonid int32, userid int32, ) *ModLessonGetUserAttemptRequest`

NewModLessonGetUserAttemptRequest instantiates a new ModLessonGetUserAttemptRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetUserAttemptRequestWithDefaults

`func NewModLessonGetUserAttemptRequestWithDefaults() *ModLessonGetUserAttemptRequest`

NewModLessonGetUserAttemptRequestWithDefaults instantiates a new ModLessonGetUserAttemptRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLessonattempt

`func (o *ModLessonGetUserAttemptRequest) GetLessonattempt() int32`

GetLessonattempt returns the Lessonattempt field if non-nil, zero value otherwise.

### GetLessonattemptOk

`func (o *ModLessonGetUserAttemptRequest) GetLessonattemptOk() (*int32, bool)`

GetLessonattemptOk returns a tuple with the Lessonattempt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLessonattempt

`func (o *ModLessonGetUserAttemptRequest) SetLessonattempt(v int32)`

SetLessonattempt sets Lessonattempt field to given value.


### GetLessonid

`func (o *ModLessonGetUserAttemptRequest) GetLessonid() int32`

GetLessonid returns the Lessonid field if non-nil, zero value otherwise.

### GetLessonidOk

`func (o *ModLessonGetUserAttemptRequest) GetLessonidOk() (*int32, bool)`

GetLessonidOk returns a tuple with the Lessonid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLessonid

`func (o *ModLessonGetUserAttemptRequest) SetLessonid(v int32)`

SetLessonid sets Lessonid field to given value.


### GetUserid

`func (o *ModLessonGetUserAttemptRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModLessonGetUserAttemptRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModLessonGetUserAttemptRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


