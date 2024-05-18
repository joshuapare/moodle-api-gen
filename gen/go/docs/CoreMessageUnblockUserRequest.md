# CoreMessageUnblockUserRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Unblockeduserid** | **int32** | The id of the user being unblocked | [default to null]
**Userid** | **int32** | The id of the user who is unblocking | [default to null]

## Methods

### NewCoreMessageUnblockUserRequest

`func NewCoreMessageUnblockUserRequest(unblockeduserid int32, userid int32, ) *CoreMessageUnblockUserRequest`

NewCoreMessageUnblockUserRequest instantiates a new CoreMessageUnblockUserRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageUnblockUserRequestWithDefaults

`func NewCoreMessageUnblockUserRequestWithDefaults() *CoreMessageUnblockUserRequest`

NewCoreMessageUnblockUserRequestWithDefaults instantiates a new CoreMessageUnblockUserRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUnblockeduserid

`func (o *CoreMessageUnblockUserRequest) GetUnblockeduserid() int32`

GetUnblockeduserid returns the Unblockeduserid field if non-nil, zero value otherwise.

### GetUnblockeduseridOk

`func (o *CoreMessageUnblockUserRequest) GetUnblockeduseridOk() (*int32, bool)`

GetUnblockeduseridOk returns a tuple with the Unblockeduserid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnblockeduserid

`func (o *CoreMessageUnblockUserRequest) SetUnblockeduserid(v int32)`

SetUnblockeduserid sets Unblockeduserid field to given value.


### GetUserid

`func (o *CoreMessageUnblockUserRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreMessageUnblockUserRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreMessageUnblockUserRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


