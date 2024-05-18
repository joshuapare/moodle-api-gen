# CoreMessageBlockUserRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Blockeduserid** | **int32** | The id of the user being blocked | [default to null]
**Userid** | **int32** | The id of the user who is blocking | [default to null]

## Methods

### NewCoreMessageBlockUserRequest

`func NewCoreMessageBlockUserRequest(blockeduserid int32, userid int32, ) *CoreMessageBlockUserRequest`

NewCoreMessageBlockUserRequest instantiates a new CoreMessageBlockUserRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageBlockUserRequestWithDefaults

`func NewCoreMessageBlockUserRequestWithDefaults() *CoreMessageBlockUserRequest`

NewCoreMessageBlockUserRequestWithDefaults instantiates a new CoreMessageBlockUserRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBlockeduserid

`func (o *CoreMessageBlockUserRequest) GetBlockeduserid() int32`

GetBlockeduserid returns the Blockeduserid field if non-nil, zero value otherwise.

### GetBlockeduseridOk

`func (o *CoreMessageBlockUserRequest) GetBlockeduseridOk() (*int32, bool)`

GetBlockeduseridOk returns a tuple with the Blockeduserid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlockeduserid

`func (o *CoreMessageBlockUserRequest) SetBlockeduserid(v int32)`

SetBlockeduserid sets Blockeduserid field to given value.


### GetUserid

`func (o *CoreMessageBlockUserRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreMessageBlockUserRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreMessageBlockUserRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


