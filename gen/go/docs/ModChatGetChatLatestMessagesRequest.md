# ModChatGetChatLatestMessagesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Chatlasttime** | Pointer to **int32** | last time messages were retrieved (epoch time) | [optional] [default to 0]
**Chatsid** | **string** | chat session id (obtained via mod_chat_login_user) | [default to "null"]

## Methods

### NewModChatGetChatLatestMessagesRequest

`func NewModChatGetChatLatestMessagesRequest(chatsid string, ) *ModChatGetChatLatestMessagesRequest`

NewModChatGetChatLatestMessagesRequest instantiates a new ModChatGetChatLatestMessagesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModChatGetChatLatestMessagesRequestWithDefaults

`func NewModChatGetChatLatestMessagesRequestWithDefaults() *ModChatGetChatLatestMessagesRequest`

NewModChatGetChatLatestMessagesRequestWithDefaults instantiates a new ModChatGetChatLatestMessagesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChatlasttime

`func (o *ModChatGetChatLatestMessagesRequest) GetChatlasttime() int32`

GetChatlasttime returns the Chatlasttime field if non-nil, zero value otherwise.

### GetChatlasttimeOk

`func (o *ModChatGetChatLatestMessagesRequest) GetChatlasttimeOk() (*int32, bool)`

GetChatlasttimeOk returns a tuple with the Chatlasttime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChatlasttime

`func (o *ModChatGetChatLatestMessagesRequest) SetChatlasttime(v int32)`

SetChatlasttime sets Chatlasttime field to given value.

### HasChatlasttime

`func (o *ModChatGetChatLatestMessagesRequest) HasChatlasttime() bool`

HasChatlasttime returns a boolean if a field has been set.

### GetChatsid

`func (o *ModChatGetChatLatestMessagesRequest) GetChatsid() string`

GetChatsid returns the Chatsid field if non-nil, zero value otherwise.

### GetChatsidOk

`func (o *ModChatGetChatLatestMessagesRequest) GetChatsidOk() (*string, bool)`

GetChatsidOk returns a tuple with the Chatsid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChatsid

`func (o *ModChatGetChatLatestMessagesRequest) SetChatsid(v string)`

SetChatsid sets Chatsid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


