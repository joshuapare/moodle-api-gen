# ModChatGetSessionMessages200ResponseMessagesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Chatid** | Pointer to **int32** | The chat id. | [optional] [default to 0]
**Groupid** | Pointer to **int32** | The group this message belongs to. | [optional] [default to 0]
**Id** | Pointer to **int32** | The message record id. | [optional] [default to null]
**Issystem** | Pointer to **bool** | Whether is a system message or not. | [optional] [default to false]
**Message** | Pointer to **string** | The message text. | [optional] [default to "null"]
**Timestamp** | Pointer to **int32** | The message timestamp (indicates when the message was sent). | [optional] [default to 0]
**Userid** | Pointer to **int32** | The user who wrote the message. | [optional] [default to 0]

## Methods

### NewModChatGetSessionMessages200ResponseMessagesInner

`func NewModChatGetSessionMessages200ResponseMessagesInner() *ModChatGetSessionMessages200ResponseMessagesInner`

NewModChatGetSessionMessages200ResponseMessagesInner instantiates a new ModChatGetSessionMessages200ResponseMessagesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModChatGetSessionMessages200ResponseMessagesInnerWithDefaults

`func NewModChatGetSessionMessages200ResponseMessagesInnerWithDefaults() *ModChatGetSessionMessages200ResponseMessagesInner`

NewModChatGetSessionMessages200ResponseMessagesInnerWithDefaults instantiates a new ModChatGetSessionMessages200ResponseMessagesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChatid

`func (o *ModChatGetSessionMessages200ResponseMessagesInner) GetChatid() int32`

GetChatid returns the Chatid field if non-nil, zero value otherwise.

### GetChatidOk

`func (o *ModChatGetSessionMessages200ResponseMessagesInner) GetChatidOk() (*int32, bool)`

GetChatidOk returns a tuple with the Chatid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChatid

`func (o *ModChatGetSessionMessages200ResponseMessagesInner) SetChatid(v int32)`

SetChatid sets Chatid field to given value.

### HasChatid

`func (o *ModChatGetSessionMessages200ResponseMessagesInner) HasChatid() bool`

HasChatid returns a boolean if a field has been set.

### GetGroupid

`func (o *ModChatGetSessionMessages200ResponseMessagesInner) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModChatGetSessionMessages200ResponseMessagesInner) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModChatGetSessionMessages200ResponseMessagesInner) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *ModChatGetSessionMessages200ResponseMessagesInner) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetId

`func (o *ModChatGetSessionMessages200ResponseMessagesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModChatGetSessionMessages200ResponseMessagesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModChatGetSessionMessages200ResponseMessagesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModChatGetSessionMessages200ResponseMessagesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIssystem

`func (o *ModChatGetSessionMessages200ResponseMessagesInner) GetIssystem() bool`

GetIssystem returns the Issystem field if non-nil, zero value otherwise.

### GetIssystemOk

`func (o *ModChatGetSessionMessages200ResponseMessagesInner) GetIssystemOk() (*bool, bool)`

GetIssystemOk returns a tuple with the Issystem field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIssystem

`func (o *ModChatGetSessionMessages200ResponseMessagesInner) SetIssystem(v bool)`

SetIssystem sets Issystem field to given value.

### HasIssystem

`func (o *ModChatGetSessionMessages200ResponseMessagesInner) HasIssystem() bool`

HasIssystem returns a boolean if a field has been set.

### GetMessage

`func (o *ModChatGetSessionMessages200ResponseMessagesInner) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *ModChatGetSessionMessages200ResponseMessagesInner) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *ModChatGetSessionMessages200ResponseMessagesInner) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *ModChatGetSessionMessages200ResponseMessagesInner) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### GetTimestamp

`func (o *ModChatGetSessionMessages200ResponseMessagesInner) GetTimestamp() int32`

GetTimestamp returns the Timestamp field if non-nil, zero value otherwise.

### GetTimestampOk

`func (o *ModChatGetSessionMessages200ResponseMessagesInner) GetTimestampOk() (*int32, bool)`

GetTimestampOk returns a tuple with the Timestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestamp

`func (o *ModChatGetSessionMessages200ResponseMessagesInner) SetTimestamp(v int32)`

SetTimestamp sets Timestamp field to given value.

### HasTimestamp

`func (o *ModChatGetSessionMessages200ResponseMessagesInner) HasTimestamp() bool`

HasTimestamp returns a boolean if a field has been set.

### GetUserid

`func (o *ModChatGetSessionMessages200ResponseMessagesInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModChatGetSessionMessages200ResponseMessagesInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModChatGetSessionMessages200ResponseMessagesInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModChatGetSessionMessages200ResponseMessagesInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


