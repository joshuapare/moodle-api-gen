# CoreMessageGetBlockedUsersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Userid** | **int32** | the user whose blocked users we want to retrieve | [default to null]

## Methods

### NewCoreMessageGetBlockedUsersRequest

`func NewCoreMessageGetBlockedUsersRequest(userid int32, ) *CoreMessageGetBlockedUsersRequest`

NewCoreMessageGetBlockedUsersRequest instantiates a new CoreMessageGetBlockedUsersRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageGetBlockedUsersRequestWithDefaults

`func NewCoreMessageGetBlockedUsersRequestWithDefaults() *CoreMessageGetBlockedUsersRequest`

NewCoreMessageGetBlockedUsersRequestWithDefaults instantiates a new CoreMessageGetBlockedUsersRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUserid

`func (o *CoreMessageGetBlockedUsersRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreMessageGetBlockedUsersRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreMessageGetBlockedUsersRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


