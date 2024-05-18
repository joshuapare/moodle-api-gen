# ModAssignGetParticipantRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Assignid** | **int32** | assign instance id | [default to null]
**Embeduser** | Pointer to **bool** | user id | [optional] [default to false]
**Userid** | **int32** | user id | 

## Methods

### NewModAssignGetParticipantRequest

`func NewModAssignGetParticipantRequest(assignid int32, userid int32, ) *ModAssignGetParticipantRequest`

NewModAssignGetParticipantRequest instantiates a new ModAssignGetParticipantRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignGetParticipantRequestWithDefaults

`func NewModAssignGetParticipantRequestWithDefaults() *ModAssignGetParticipantRequest`

NewModAssignGetParticipantRequestWithDefaults instantiates a new ModAssignGetParticipantRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssignid

`func (o *ModAssignGetParticipantRequest) GetAssignid() int32`

GetAssignid returns the Assignid field if non-nil, zero value otherwise.

### GetAssignidOk

`func (o *ModAssignGetParticipantRequest) GetAssignidOk() (*int32, bool)`

GetAssignidOk returns a tuple with the Assignid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssignid

`func (o *ModAssignGetParticipantRequest) SetAssignid(v int32)`

SetAssignid sets Assignid field to given value.


### GetEmbeduser

`func (o *ModAssignGetParticipantRequest) GetEmbeduser() bool`

GetEmbeduser returns the Embeduser field if non-nil, zero value otherwise.

### GetEmbeduserOk

`func (o *ModAssignGetParticipantRequest) GetEmbeduserOk() (*bool, bool)`

GetEmbeduserOk returns a tuple with the Embeduser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmbeduser

`func (o *ModAssignGetParticipantRequest) SetEmbeduser(v bool)`

SetEmbeduser sets Embeduser field to given value.

### HasEmbeduser

`func (o *ModAssignGetParticipantRequest) HasEmbeduser() bool`

HasEmbeduser returns a boolean if a field has been set.

### GetUserid

`func (o *ModAssignGetParticipantRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModAssignGetParticipantRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModAssignGetParticipantRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


