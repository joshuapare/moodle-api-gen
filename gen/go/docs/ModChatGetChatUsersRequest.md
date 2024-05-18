# ModChatGetChatUsersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Chatsid** | **string** | chat session id (obtained via mod_chat_login_user) | 

## Methods

### NewModChatGetChatUsersRequest

`func NewModChatGetChatUsersRequest(chatsid string, ) *ModChatGetChatUsersRequest`

NewModChatGetChatUsersRequest instantiates a new ModChatGetChatUsersRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModChatGetChatUsersRequestWithDefaults

`func NewModChatGetChatUsersRequestWithDefaults() *ModChatGetChatUsersRequest`

NewModChatGetChatUsersRequestWithDefaults instantiates a new ModChatGetChatUsersRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChatsid

`func (o *ModChatGetChatUsersRequest) GetChatsid() string`

GetChatsid returns the Chatsid field if non-nil, zero value otherwise.

### GetChatsidOk

`func (o *ModChatGetChatUsersRequest) GetChatsidOk() (*string, bool)`

GetChatsidOk returns a tuple with the Chatsid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChatsid

`func (o *ModChatGetChatUsersRequest) SetChatsid(v string)`

SetChatsid sets Chatsid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


