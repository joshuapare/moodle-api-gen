# ModChatGetSessionsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Chatid** | **int32** | Chat instance id. | 
**Groupid** | Pointer to **int32** | Get messages from users in this group.                                                 0 means that the function will determine the user group | [optional] [default to 0]
**Showall** | Pointer to **bool** | Whether to show completed sessions or not. | [optional] [default to false]

## Methods

### NewModChatGetSessionsRequest

`func NewModChatGetSessionsRequest(chatid int32, ) *ModChatGetSessionsRequest`

NewModChatGetSessionsRequest instantiates a new ModChatGetSessionsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModChatGetSessionsRequestWithDefaults

`func NewModChatGetSessionsRequestWithDefaults() *ModChatGetSessionsRequest`

NewModChatGetSessionsRequestWithDefaults instantiates a new ModChatGetSessionsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChatid

`func (o *ModChatGetSessionsRequest) GetChatid() int32`

GetChatid returns the Chatid field if non-nil, zero value otherwise.

### GetChatidOk

`func (o *ModChatGetSessionsRequest) GetChatidOk() (*int32, bool)`

GetChatidOk returns a tuple with the Chatid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChatid

`func (o *ModChatGetSessionsRequest) SetChatid(v int32)`

SetChatid sets Chatid field to given value.


### GetGroupid

`func (o *ModChatGetSessionsRequest) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModChatGetSessionsRequest) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModChatGetSessionsRequest) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *ModChatGetSessionsRequest) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetShowall

`func (o *ModChatGetSessionsRequest) GetShowall() bool`

GetShowall returns the Showall field if non-nil, zero value otherwise.

### GetShowallOk

`func (o *ModChatGetSessionsRequest) GetShowallOk() (*bool, bool)`

GetShowallOk returns a tuple with the Showall field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowall

`func (o *ModChatGetSessionsRequest) SetShowall(v bool)`

SetShowall sets Showall field to given value.

### HasShowall

`func (o *ModChatGetSessionsRequest) HasShowall() bool`

HasShowall returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


