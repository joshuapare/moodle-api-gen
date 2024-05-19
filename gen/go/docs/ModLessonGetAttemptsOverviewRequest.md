# ModLessonGetAttemptsOverviewRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Groupid** | Pointer to **int32** | group id, 0 means that the function will determine the user group | [optional] [default to 0]
**Lessonid** | **int32** | lesson instance id | [default to null]

## Methods

### NewModLessonGetAttemptsOverviewRequest

`func NewModLessonGetAttemptsOverviewRequest(lessonid int32, ) *ModLessonGetAttemptsOverviewRequest`

NewModLessonGetAttemptsOverviewRequest instantiates a new ModLessonGetAttemptsOverviewRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetAttemptsOverviewRequestWithDefaults

`func NewModLessonGetAttemptsOverviewRequestWithDefaults() *ModLessonGetAttemptsOverviewRequest`

NewModLessonGetAttemptsOverviewRequestWithDefaults instantiates a new ModLessonGetAttemptsOverviewRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGroupid

`func (o *ModLessonGetAttemptsOverviewRequest) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModLessonGetAttemptsOverviewRequest) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModLessonGetAttemptsOverviewRequest) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *ModLessonGetAttemptsOverviewRequest) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetLessonid

`func (o *ModLessonGetAttemptsOverviewRequest) GetLessonid() int32`

GetLessonid returns the Lessonid field if non-nil, zero value otherwise.

### GetLessonidOk

`func (o *ModLessonGetAttemptsOverviewRequest) GetLessonidOk() (*int32, bool)`

GetLessonidOk returns a tuple with the Lessonid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLessonid

`func (o *ModLessonGetAttemptsOverviewRequest) SetLessonid(v int32)`

SetLessonid sets Lessonid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


