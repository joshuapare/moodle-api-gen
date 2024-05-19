# ModLessonGetQuestionsAttemptsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attempt** | **int32** | lesson attempt number | 
**Correct** | Pointer to **bool** | only fetch correct attempts | [optional] [default to false]
**Lessonid** | **int32** | lesson instance id | 
**Pageid** | Pointer to **int32** | only fetch attempts at the given page | [optional] [default to null]
**Userid** | Pointer to **int32** | only fetch attempts of the given user | [optional] [default to null]

## Methods

### NewModLessonGetQuestionsAttemptsRequest

`func NewModLessonGetQuestionsAttemptsRequest(attempt int32, lessonid int32, ) *ModLessonGetQuestionsAttemptsRequest`

NewModLessonGetQuestionsAttemptsRequest instantiates a new ModLessonGetQuestionsAttemptsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetQuestionsAttemptsRequestWithDefaults

`func NewModLessonGetQuestionsAttemptsRequestWithDefaults() *ModLessonGetQuestionsAttemptsRequest`

NewModLessonGetQuestionsAttemptsRequestWithDefaults instantiates a new ModLessonGetQuestionsAttemptsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttempt

`func (o *ModLessonGetQuestionsAttemptsRequest) GetAttempt() int32`

GetAttempt returns the Attempt field if non-nil, zero value otherwise.

### GetAttemptOk

`func (o *ModLessonGetQuestionsAttemptsRequest) GetAttemptOk() (*int32, bool)`

GetAttemptOk returns a tuple with the Attempt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttempt

`func (o *ModLessonGetQuestionsAttemptsRequest) SetAttempt(v int32)`

SetAttempt sets Attempt field to given value.


### GetCorrect

`func (o *ModLessonGetQuestionsAttemptsRequest) GetCorrect() bool`

GetCorrect returns the Correct field if non-nil, zero value otherwise.

### GetCorrectOk

`func (o *ModLessonGetQuestionsAttemptsRequest) GetCorrectOk() (*bool, bool)`

GetCorrectOk returns a tuple with the Correct field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCorrect

`func (o *ModLessonGetQuestionsAttemptsRequest) SetCorrect(v bool)`

SetCorrect sets Correct field to given value.

### HasCorrect

`func (o *ModLessonGetQuestionsAttemptsRequest) HasCorrect() bool`

HasCorrect returns a boolean if a field has been set.

### GetLessonid

`func (o *ModLessonGetQuestionsAttemptsRequest) GetLessonid() int32`

GetLessonid returns the Lessonid field if non-nil, zero value otherwise.

### GetLessonidOk

`func (o *ModLessonGetQuestionsAttemptsRequest) GetLessonidOk() (*int32, bool)`

GetLessonidOk returns a tuple with the Lessonid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLessonid

`func (o *ModLessonGetQuestionsAttemptsRequest) SetLessonid(v int32)`

SetLessonid sets Lessonid field to given value.


### GetPageid

`func (o *ModLessonGetQuestionsAttemptsRequest) GetPageid() int32`

GetPageid returns the Pageid field if non-nil, zero value otherwise.

### GetPageidOk

`func (o *ModLessonGetQuestionsAttemptsRequest) GetPageidOk() (*int32, bool)`

GetPageidOk returns a tuple with the Pageid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPageid

`func (o *ModLessonGetQuestionsAttemptsRequest) SetPageid(v int32)`

SetPageid sets Pageid field to given value.

### HasPageid

`func (o *ModLessonGetQuestionsAttemptsRequest) HasPageid() bool`

HasPageid returns a boolean if a field has been set.

### GetUserid

`func (o *ModLessonGetQuestionsAttemptsRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModLessonGetQuestionsAttemptsRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModLessonGetQuestionsAttemptsRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModLessonGetQuestionsAttemptsRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


