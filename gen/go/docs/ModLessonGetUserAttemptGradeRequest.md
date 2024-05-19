# ModLessonGetUserAttemptGradeRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Lessonattempt** | **int32** | lesson attempt number | 
**Lessonid** | **int32** | lesson instance id | 
**Userid** | Pointer to **int32** | the user id (empty for current user) | [optional] 

## Methods

### NewModLessonGetUserAttemptGradeRequest

`func NewModLessonGetUserAttemptGradeRequest(lessonattempt int32, lessonid int32, ) *ModLessonGetUserAttemptGradeRequest`

NewModLessonGetUserAttemptGradeRequest instantiates a new ModLessonGetUserAttemptGradeRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetUserAttemptGradeRequestWithDefaults

`func NewModLessonGetUserAttemptGradeRequestWithDefaults() *ModLessonGetUserAttemptGradeRequest`

NewModLessonGetUserAttemptGradeRequestWithDefaults instantiates a new ModLessonGetUserAttemptGradeRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLessonattempt

`func (o *ModLessonGetUserAttemptGradeRequest) GetLessonattempt() int32`

GetLessonattempt returns the Lessonattempt field if non-nil, zero value otherwise.

### GetLessonattemptOk

`func (o *ModLessonGetUserAttemptGradeRequest) GetLessonattemptOk() (*int32, bool)`

GetLessonattemptOk returns a tuple with the Lessonattempt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLessonattempt

`func (o *ModLessonGetUserAttemptGradeRequest) SetLessonattempt(v int32)`

SetLessonattempt sets Lessonattempt field to given value.


### GetLessonid

`func (o *ModLessonGetUserAttemptGradeRequest) GetLessonid() int32`

GetLessonid returns the Lessonid field if non-nil, zero value otherwise.

### GetLessonidOk

`func (o *ModLessonGetUserAttemptGradeRequest) GetLessonidOk() (*int32, bool)`

GetLessonidOk returns a tuple with the Lessonid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLessonid

`func (o *ModLessonGetUserAttemptGradeRequest) SetLessonid(v int32)`

SetLessonid sets Lessonid field to given value.


### GetUserid

`func (o *ModLessonGetUserAttemptGradeRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModLessonGetUserAttemptGradeRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModLessonGetUserAttemptGradeRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModLessonGetUserAttemptGradeRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


