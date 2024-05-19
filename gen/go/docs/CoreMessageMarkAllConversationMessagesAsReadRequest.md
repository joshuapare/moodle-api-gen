# CoreMessageMarkAllConversationMessagesAsReadRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Conversationid** | **int32** | The conversation id who who we are marking the messages as read for | [default to null]
**Userid** | **int32** | The user id who who we are marking the messages as read for | [default to null]

## Methods

### NewCoreMessageMarkAllConversationMessagesAsReadRequest

`func NewCoreMessageMarkAllConversationMessagesAsReadRequest(conversationid int32, userid int32, ) *CoreMessageMarkAllConversationMessagesAsReadRequest`

NewCoreMessageMarkAllConversationMessagesAsReadRequest instantiates a new CoreMessageMarkAllConversationMessagesAsReadRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageMarkAllConversationMessagesAsReadRequestWithDefaults

`func NewCoreMessageMarkAllConversationMessagesAsReadRequestWithDefaults() *CoreMessageMarkAllConversationMessagesAsReadRequest`

NewCoreMessageMarkAllConversationMessagesAsReadRequestWithDefaults instantiates a new CoreMessageMarkAllConversationMessagesAsReadRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetConversationid

`func (o *CoreMessageMarkAllConversationMessagesAsReadRequest) GetConversationid() int32`

GetConversationid returns the Conversationid field if non-nil, zero value otherwise.

### GetConversationidOk

`func (o *CoreMessageMarkAllConversationMessagesAsReadRequest) GetConversationidOk() (*int32, bool)`

GetConversationidOk returns a tuple with the Conversationid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversationid

`func (o *CoreMessageMarkAllConversationMessagesAsReadRequest) SetConversationid(v int32)`

SetConversationid sets Conversationid field to given value.


### GetUserid

`func (o *CoreMessageMarkAllConversationMessagesAsReadRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreMessageMarkAllConversationMessagesAsReadRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreMessageMarkAllConversationMessagesAsReadRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


