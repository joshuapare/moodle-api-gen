# CoreMessageDeleteMessageRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Messageid** | **int32** | The message id | [default to null]
**Read** | Pointer to **bool** | If is a message read | [optional] [default to true]
**Userid** | **int32** | The user id of who we want to delete the message for | [default to null]

## Methods

### NewCoreMessageDeleteMessageRequest

`func NewCoreMessageDeleteMessageRequest(messageid int32, userid int32, ) *CoreMessageDeleteMessageRequest`

NewCoreMessageDeleteMessageRequest instantiates a new CoreMessageDeleteMessageRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageDeleteMessageRequestWithDefaults

`func NewCoreMessageDeleteMessageRequestWithDefaults() *CoreMessageDeleteMessageRequest`

NewCoreMessageDeleteMessageRequestWithDefaults instantiates a new CoreMessageDeleteMessageRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessageid

`func (o *CoreMessageDeleteMessageRequest) GetMessageid() int32`

GetMessageid returns the Messageid field if non-nil, zero value otherwise.

### GetMessageidOk

`func (o *CoreMessageDeleteMessageRequest) GetMessageidOk() (*int32, bool)`

GetMessageidOk returns a tuple with the Messageid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageid

`func (o *CoreMessageDeleteMessageRequest) SetMessageid(v int32)`

SetMessageid sets Messageid field to given value.


### GetRead

`func (o *CoreMessageDeleteMessageRequest) GetRead() bool`

GetRead returns the Read field if non-nil, zero value otherwise.

### GetReadOk

`func (o *CoreMessageDeleteMessageRequest) GetReadOk() (*bool, bool)`

GetReadOk returns a tuple with the Read field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRead

`func (o *CoreMessageDeleteMessageRequest) SetRead(v bool)`

SetRead sets Read field to given value.

### HasRead

`func (o *CoreMessageDeleteMessageRequest) HasRead() bool`

HasRead returns a boolean if a field has been set.

### GetUserid

`func (o *CoreMessageDeleteMessageRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreMessageDeleteMessageRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreMessageDeleteMessageRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


