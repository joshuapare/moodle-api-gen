# ModLessonGetUserGradeRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Lessonid** | **int32** | lesson instance id | 
**Userid** | Pointer to **int32** | the user id (empty for current user) | [optional] 

## Methods

### NewModLessonGetUserGradeRequest

`func NewModLessonGetUserGradeRequest(lessonid int32, ) *ModLessonGetUserGradeRequest`

NewModLessonGetUserGradeRequest instantiates a new ModLessonGetUserGradeRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetUserGradeRequestWithDefaults

`func NewModLessonGetUserGradeRequestWithDefaults() *ModLessonGetUserGradeRequest`

NewModLessonGetUserGradeRequestWithDefaults instantiates a new ModLessonGetUserGradeRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLessonid

`func (o *ModLessonGetUserGradeRequest) GetLessonid() int32`

GetLessonid returns the Lessonid field if non-nil, zero value otherwise.

### GetLessonidOk

`func (o *ModLessonGetUserGradeRequest) GetLessonidOk() (*int32, bool)`

GetLessonidOk returns a tuple with the Lessonid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLessonid

`func (o *ModLessonGetUserGradeRequest) SetLessonid(v int32)`

SetLessonid sets Lessonid field to given value.


### GetUserid

`func (o *ModLessonGetUserGradeRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModLessonGetUserGradeRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModLessonGetUserGradeRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModLessonGetUserGradeRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


