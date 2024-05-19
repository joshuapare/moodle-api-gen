# ModChatGetChatLatestMessages200ResponseMessagesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int32** | message id | [optional] [default to null]
**Message** | Pointer to **string** | message text | [optional] [default to "null"]
**System** | Pointer to **bool** | true if is a system message (like user joined) | [optional] [default to null]
**Timestamp** | Pointer to **int32** | timestamp for the message | [optional] [default to null]
**Userid** | Pointer to **int32** | user id | [optional] 

## Methods

### NewModChatGetChatLatestMessages200ResponseMessagesInner

`func NewModChatGetChatLatestMessages200ResponseMessagesInner() *ModChatGetChatLatestMessages200ResponseMessagesInner`

NewModChatGetChatLatestMessages200ResponseMessagesInner instantiates a new ModChatGetChatLatestMessages200ResponseMessagesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModChatGetChatLatestMessages200ResponseMessagesInnerWithDefaults

`func NewModChatGetChatLatestMessages200ResponseMessagesInnerWithDefaults() *ModChatGetChatLatestMessages200ResponseMessagesInner`

NewModChatGetChatLatestMessages200ResponseMessagesInnerWithDefaults instantiates a new ModChatGetChatLatestMessages200ResponseMessagesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetMessage

`func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### GetSystem

`func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) GetSystem() bool`

GetSystem returns the System field if non-nil, zero value otherwise.

### GetSystemOk

`func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) GetSystemOk() (*bool, bool)`

GetSystemOk returns a tuple with the System field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSystem

`func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) SetSystem(v bool)`

SetSystem sets System field to given value.

### HasSystem

`func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) HasSystem() bool`

HasSystem returns a boolean if a field has been set.

### GetTimestamp

`func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) GetTimestamp() int32`

GetTimestamp returns the Timestamp field if non-nil, zero value otherwise.

### GetTimestampOk

`func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) GetTimestampOk() (*int32, bool)`

GetTimestampOk returns a tuple with the Timestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestamp

`func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) SetTimestamp(v int32)`

SetTimestamp sets Timestamp field to given value.

### HasTimestamp

`func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) HasTimestamp() bool`

HasTimestamp returns a boolean if a field has been set.

### GetUserid

`func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModChatGetChatLatestMessages200ResponseMessagesInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


