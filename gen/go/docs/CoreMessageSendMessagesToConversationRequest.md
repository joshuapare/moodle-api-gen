# CoreMessageSendMessagesToConversationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Conversationid** | **int32** | id of the conversation | [default to null]
**Messages** | [**[]CoreMessageSendMessagesToConversationRequestMessagesInner**](CoreMessageSendMessagesToConversationRequestMessagesInner.md) |  | 

## Methods

### NewCoreMessageSendMessagesToConversationRequest

`func NewCoreMessageSendMessagesToConversationRequest(conversationid int32, messages []CoreMessageSendMessagesToConversationRequestMessagesInner, ) *CoreMessageSendMessagesToConversationRequest`

NewCoreMessageSendMessagesToConversationRequest instantiates a new CoreMessageSendMessagesToConversationRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageSendMessagesToConversationRequestWithDefaults

`func NewCoreMessageSendMessagesToConversationRequestWithDefaults() *CoreMessageSendMessagesToConversationRequest`

NewCoreMessageSendMessagesToConversationRequestWithDefaults instantiates a new CoreMessageSendMessagesToConversationRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetConversationid

`func (o *CoreMessageSendMessagesToConversationRequest) GetConversationid() int32`

GetConversationid returns the Conversationid field if non-nil, zero value otherwise.

### GetConversationidOk

`func (o *CoreMessageSendMessagesToConversationRequest) GetConversationidOk() (*int32, bool)`

GetConversationidOk returns a tuple with the Conversationid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversationid

`func (o *CoreMessageSendMessagesToConversationRequest) SetConversationid(v int32)`

SetConversationid sets Conversationid field to given value.


### GetMessages

`func (o *CoreMessageSendMessagesToConversationRequest) GetMessages() []CoreMessageSendMessagesToConversationRequestMessagesInner`

GetMessages returns the Messages field if non-nil, zero value otherwise.

### GetMessagesOk

`func (o *CoreMessageSendMessagesToConversationRequest) GetMessagesOk() (*[]CoreMessageSendMessagesToConversationRequestMessagesInner, bool)`

GetMessagesOk returns a tuple with the Messages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessages

`func (o *CoreMessageSendMessagesToConversationRequest) SetMessages(v []CoreMessageSendMessagesToConversationRequestMessagesInner)`

SetMessages sets Messages field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


