# ModChatGetSessionMessagesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Chatid** | **int32** | Chat instance id. | [default to null]
**Groupid** | Pointer to **int32** | Get messages from users in this group.                                                 0 means that the function will determine the user group | [optional] [default to 0]
**Sessionend** | **int32** | The session end time (timestamp). | [default to null]
**Sessionstart** | **int32** | The session start time (timestamp). | [default to null]

## Methods

### NewModChatGetSessionMessagesRequest

`func NewModChatGetSessionMessagesRequest(chatid int32, sessionend int32, sessionstart int32, ) *ModChatGetSessionMessagesRequest`

NewModChatGetSessionMessagesRequest instantiates a new ModChatGetSessionMessagesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModChatGetSessionMessagesRequestWithDefaults

`func NewModChatGetSessionMessagesRequestWithDefaults() *ModChatGetSessionMessagesRequest`

NewModChatGetSessionMessagesRequestWithDefaults instantiates a new ModChatGetSessionMessagesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChatid

`func (o *ModChatGetSessionMessagesRequest) GetChatid() int32`

GetChatid returns the Chatid field if non-nil, zero value otherwise.

### GetChatidOk

`func (o *ModChatGetSessionMessagesRequest) GetChatidOk() (*int32, bool)`

GetChatidOk returns a tuple with the Chatid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChatid

`func (o *ModChatGetSessionMessagesRequest) SetChatid(v int32)`

SetChatid sets Chatid field to given value.


### GetGroupid

`func (o *ModChatGetSessionMessagesRequest) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModChatGetSessionMessagesRequest) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModChatGetSessionMessagesRequest) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *ModChatGetSessionMessagesRequest) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetSessionend

`func (o *ModChatGetSessionMessagesRequest) GetSessionend() int32`

GetSessionend returns the Sessionend field if non-nil, zero value otherwise.

### GetSessionendOk

`func (o *ModChatGetSessionMessagesRequest) GetSessionendOk() (*int32, bool)`

GetSessionendOk returns a tuple with the Sessionend field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSessionend

`func (o *ModChatGetSessionMessagesRequest) SetSessionend(v int32)`

SetSessionend sets Sessionend field to given value.


### GetSessionstart

`func (o *ModChatGetSessionMessagesRequest) GetSessionstart() int32`

GetSessionstart returns the Sessionstart field if non-nil, zero value otherwise.

### GetSessionstartOk

`func (o *ModChatGetSessionMessagesRequest) GetSessionstartOk() (*int32, bool)`

GetSessionstartOk returns a tuple with the Sessionstart field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSessionstart

`func (o *ModChatGetSessionMessagesRequest) SetSessionstart(v int32)`

SetSessionstart sets Sessionstart field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


