# ModQuizGetUserAttemptsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Includepreviews** | Pointer to **bool** | whether to include previews or not | [optional] [default to false]
**Quizid** | **int32** | quiz instance id | 
**Status** | Pointer to **string** | quiz status: all, finished or unfinished | [optional] [default to "finished"]
**Userid** | Pointer to **int32** | user id, empty for current user | [optional] [default to 0]

## Methods

### NewModQuizGetUserAttemptsRequest

`func NewModQuizGetUserAttemptsRequest(quizid int32, ) *ModQuizGetUserAttemptsRequest`

NewModQuizGetUserAttemptsRequest instantiates a new ModQuizGetUserAttemptsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModQuizGetUserAttemptsRequestWithDefaults

`func NewModQuizGetUserAttemptsRequestWithDefaults() *ModQuizGetUserAttemptsRequest`

NewModQuizGetUserAttemptsRequestWithDefaults instantiates a new ModQuizGetUserAttemptsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIncludepreviews

`func (o *ModQuizGetUserAttemptsRequest) GetIncludepreviews() bool`

GetIncludepreviews returns the Includepreviews field if non-nil, zero value otherwise.

### GetIncludepreviewsOk

`func (o *ModQuizGetUserAttemptsRequest) GetIncludepreviewsOk() (*bool, bool)`

GetIncludepreviewsOk returns a tuple with the Includepreviews field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludepreviews

`func (o *ModQuizGetUserAttemptsRequest) SetIncludepreviews(v bool)`

SetIncludepreviews sets Includepreviews field to given value.

### HasIncludepreviews

`func (o *ModQuizGetUserAttemptsRequest) HasIncludepreviews() bool`

HasIncludepreviews returns a boolean if a field has been set.

### GetQuizid

`func (o *ModQuizGetUserAttemptsRequest) GetQuizid() int32`

GetQuizid returns the Quizid field if non-nil, zero value otherwise.

### GetQuizidOk

`func (o *ModQuizGetUserAttemptsRequest) GetQuizidOk() (*int32, bool)`

GetQuizidOk returns a tuple with the Quizid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuizid

`func (o *ModQuizGetUserAttemptsRequest) SetQuizid(v int32)`

SetQuizid sets Quizid field to given value.


### GetStatus

`func (o *ModQuizGetUserAttemptsRequest) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ModQuizGetUserAttemptsRequest) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ModQuizGetUserAttemptsRequest) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *ModQuizGetUserAttemptsRequest) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetUserid

`func (o *ModQuizGetUserAttemptsRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModQuizGetUserAttemptsRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModQuizGetUserAttemptsRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModQuizGetUserAttemptsRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


