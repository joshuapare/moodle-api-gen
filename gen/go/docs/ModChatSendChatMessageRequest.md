# ModChatSendChatMessageRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Beepid** | Pointer to **string** | the beep id | [optional] [default to ""]
**Chatsid** | **string** | chat session id (obtained via mod_chat_login_user) | 
**Messagetext** | **string** | the message text | [default to "null"]

## Methods

### NewModChatSendChatMessageRequest

`func NewModChatSendChatMessageRequest(chatsid string, messagetext string, ) *ModChatSendChatMessageRequest`

NewModChatSendChatMessageRequest instantiates a new ModChatSendChatMessageRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModChatSendChatMessageRequestWithDefaults

`func NewModChatSendChatMessageRequestWithDefaults() *ModChatSendChatMessageRequest`

NewModChatSendChatMessageRequestWithDefaults instantiates a new ModChatSendChatMessageRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBeepid

`func (o *ModChatSendChatMessageRequest) GetBeepid() string`

GetBeepid returns the Beepid field if non-nil, zero value otherwise.

### GetBeepidOk

`func (o *ModChatSendChatMessageRequest) GetBeepidOk() (*string, bool)`

GetBeepidOk returns a tuple with the Beepid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBeepid

`func (o *ModChatSendChatMessageRequest) SetBeepid(v string)`

SetBeepid sets Beepid field to given value.

### HasBeepid

`func (o *ModChatSendChatMessageRequest) HasBeepid() bool`

HasBeepid returns a boolean if a field has been set.

### GetChatsid

`func (o *ModChatSendChatMessageRequest) GetChatsid() string`

GetChatsid returns the Chatsid field if non-nil, zero value otherwise.

### GetChatsidOk

`func (o *ModChatSendChatMessageRequest) GetChatsidOk() (*string, bool)`

GetChatsidOk returns a tuple with the Chatsid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChatsid

`func (o *ModChatSendChatMessageRequest) SetChatsid(v string)`

SetChatsid sets Chatsid field to given value.


### GetMessagetext

`func (o *ModChatSendChatMessageRequest) GetMessagetext() string`

GetMessagetext returns the Messagetext field if non-nil, zero value otherwise.

### GetMessagetextOk

`func (o *ModChatSendChatMessageRequest) GetMessagetextOk() (*string, bool)`

GetMessagetextOk returns a tuple with the Messagetext field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessagetext

`func (o *ModChatSendChatMessageRequest) SetMessagetext(v string)`

SetMessagetext sets Messagetext field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


