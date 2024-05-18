# CoreMessageDeleteMessageForAllUsersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Messageid** | **int32** | The message id | 
**Userid** | **int32** | The user id of who we want to delete the message for all users | [default to null]

## Methods

### NewCoreMessageDeleteMessageForAllUsersRequest

`func NewCoreMessageDeleteMessageForAllUsersRequest(messageid int32, userid int32, ) *CoreMessageDeleteMessageForAllUsersRequest`

NewCoreMessageDeleteMessageForAllUsersRequest instantiates a new CoreMessageDeleteMessageForAllUsersRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageDeleteMessageForAllUsersRequestWithDefaults

`func NewCoreMessageDeleteMessageForAllUsersRequestWithDefaults() *CoreMessageDeleteMessageForAllUsersRequest`

NewCoreMessageDeleteMessageForAllUsersRequestWithDefaults instantiates a new CoreMessageDeleteMessageForAllUsersRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessageid

`func (o *CoreMessageDeleteMessageForAllUsersRequest) GetMessageid() int32`

GetMessageid returns the Messageid field if non-nil, zero value otherwise.

### GetMessageidOk

`func (o *CoreMessageDeleteMessageForAllUsersRequest) GetMessageidOk() (*int32, bool)`

GetMessageidOk returns a tuple with the Messageid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageid

`func (o *CoreMessageDeleteMessageForAllUsersRequest) SetMessageid(v int32)`

SetMessageid sets Messageid field to given value.


### GetUserid

`func (o *CoreMessageDeleteMessageForAllUsersRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreMessageDeleteMessageForAllUsersRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreMessageDeleteMessageForAllUsersRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


