# CoreMessageGetSelfConversationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Messagelimit** | Pointer to **int32** | Limit for number of messages | [optional] [default to 100]
**Messageoffset** | Pointer to **int32** | Offset for messages list | [optional] [default to 0]
**Newestmessagesfirst** | Pointer to **bool** | Order messages by newest first | [optional] [default to true]
**Userid** | **int32** | The id of the user who we are viewing self-conversations for | [default to null]

## Methods

### NewCoreMessageGetSelfConversationRequest

`func NewCoreMessageGetSelfConversationRequest(userid int32, ) *CoreMessageGetSelfConversationRequest`

NewCoreMessageGetSelfConversationRequest instantiates a new CoreMessageGetSelfConversationRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageGetSelfConversationRequestWithDefaults

`func NewCoreMessageGetSelfConversationRequestWithDefaults() *CoreMessageGetSelfConversationRequest`

NewCoreMessageGetSelfConversationRequestWithDefaults instantiates a new CoreMessageGetSelfConversationRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessagelimit

`func (o *CoreMessageGetSelfConversationRequest) GetMessagelimit() int32`

GetMessagelimit returns the Messagelimit field if non-nil, zero value otherwise.

### GetMessagelimitOk

`func (o *CoreMessageGetSelfConversationRequest) GetMessagelimitOk() (*int32, bool)`

GetMessagelimitOk returns a tuple with the Messagelimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessagelimit

`func (o *CoreMessageGetSelfConversationRequest) SetMessagelimit(v int32)`

SetMessagelimit sets Messagelimit field to given value.

### HasMessagelimit

`func (o *CoreMessageGetSelfConversationRequest) HasMessagelimit() bool`

HasMessagelimit returns a boolean if a field has been set.

### GetMessageoffset

`func (o *CoreMessageGetSelfConversationRequest) GetMessageoffset() int32`

GetMessageoffset returns the Messageoffset field if non-nil, zero value otherwise.

### GetMessageoffsetOk

`func (o *CoreMessageGetSelfConversationRequest) GetMessageoffsetOk() (*int32, bool)`

GetMessageoffsetOk returns a tuple with the Messageoffset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageoffset

`func (o *CoreMessageGetSelfConversationRequest) SetMessageoffset(v int32)`

SetMessageoffset sets Messageoffset field to given value.

### HasMessageoffset

`func (o *CoreMessageGetSelfConversationRequest) HasMessageoffset() bool`

HasMessageoffset returns a boolean if a field has been set.

### GetNewestmessagesfirst

`func (o *CoreMessageGetSelfConversationRequest) GetNewestmessagesfirst() bool`

GetNewestmessagesfirst returns the Newestmessagesfirst field if non-nil, zero value otherwise.

### GetNewestmessagesfirstOk

`func (o *CoreMessageGetSelfConversationRequest) GetNewestmessagesfirstOk() (*bool, bool)`

GetNewestmessagesfirstOk returns a tuple with the Newestmessagesfirst field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNewestmessagesfirst

`func (o *CoreMessageGetSelfConversationRequest) SetNewestmessagesfirst(v bool)`

SetNewestmessagesfirst sets Newestmessagesfirst field to given value.

### HasNewestmessagesfirst

`func (o *CoreMessageGetSelfConversationRequest) HasNewestmessagesfirst() bool`

HasNewestmessagesfirst returns a boolean if a field has been set.

### GetUserid

`func (o *CoreMessageGetSelfConversationRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreMessageGetSelfConversationRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreMessageGetSelfConversationRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


