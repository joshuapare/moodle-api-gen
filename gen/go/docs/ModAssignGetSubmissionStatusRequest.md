# ModAssignGetSubmissionStatusRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Assignid** | **int32** | assignment instance id | [default to null]
**Groupid** | Pointer to **int32** | filter by users in group (used for generating the grading summary).                     0 for all groups information, any other empty value will calculate currrent group. | [optional] [default to 0]
**Userid** | Pointer to **int32** | user id (empty for current user) | [optional] [default to 0]

## Methods

### NewModAssignGetSubmissionStatusRequest

`func NewModAssignGetSubmissionStatusRequest(assignid int32, ) *ModAssignGetSubmissionStatusRequest`

NewModAssignGetSubmissionStatusRequest instantiates a new ModAssignGetSubmissionStatusRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignGetSubmissionStatusRequestWithDefaults

`func NewModAssignGetSubmissionStatusRequestWithDefaults() *ModAssignGetSubmissionStatusRequest`

NewModAssignGetSubmissionStatusRequestWithDefaults instantiates a new ModAssignGetSubmissionStatusRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssignid

`func (o *ModAssignGetSubmissionStatusRequest) GetAssignid() int32`

GetAssignid returns the Assignid field if non-nil, zero value otherwise.

### GetAssignidOk

`func (o *ModAssignGetSubmissionStatusRequest) GetAssignidOk() (*int32, bool)`

GetAssignidOk returns a tuple with the Assignid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssignid

`func (o *ModAssignGetSubmissionStatusRequest) SetAssignid(v int32)`

SetAssignid sets Assignid field to given value.


### GetGroupid

`func (o *ModAssignGetSubmissionStatusRequest) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModAssignGetSubmissionStatusRequest) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModAssignGetSubmissionStatusRequest) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *ModAssignGetSubmissionStatusRequest) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetUserid

`func (o *ModAssignGetSubmissionStatusRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModAssignGetSubmissionStatusRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModAssignGetSubmissionStatusRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModAssignGetSubmissionStatusRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


