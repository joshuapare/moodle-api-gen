# ModChatGetSessions200ResponseSessionsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Iscomplete** | Pointer to **bool** | Whether the session is completed or not. | [optional] [default to null]
**Sessionend** | Pointer to **int32** | Session end time. | [optional] [default to null]
**Sessionstart** | Pointer to **int32** | Session start time. | [optional] [default to null]
**Sessionusers** | Pointer to [**[]ModChatGetSessions200ResponseSessionsInnerSessionusersInner**](ModChatGetSessions200ResponseSessionsInnerSessionusersInner.md) |  | [optional] 

## Methods

### NewModChatGetSessions200ResponseSessionsInner

`func NewModChatGetSessions200ResponseSessionsInner() *ModChatGetSessions200ResponseSessionsInner`

NewModChatGetSessions200ResponseSessionsInner instantiates a new ModChatGetSessions200ResponseSessionsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModChatGetSessions200ResponseSessionsInnerWithDefaults

`func NewModChatGetSessions200ResponseSessionsInnerWithDefaults() *ModChatGetSessions200ResponseSessionsInner`

NewModChatGetSessions200ResponseSessionsInnerWithDefaults instantiates a new ModChatGetSessions200ResponseSessionsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIscomplete

`func (o *ModChatGetSessions200ResponseSessionsInner) GetIscomplete() bool`

GetIscomplete returns the Iscomplete field if non-nil, zero value otherwise.

### GetIscompleteOk

`func (o *ModChatGetSessions200ResponseSessionsInner) GetIscompleteOk() (*bool, bool)`

GetIscompleteOk returns a tuple with the Iscomplete field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIscomplete

`func (o *ModChatGetSessions200ResponseSessionsInner) SetIscomplete(v bool)`

SetIscomplete sets Iscomplete field to given value.

### HasIscomplete

`func (o *ModChatGetSessions200ResponseSessionsInner) HasIscomplete() bool`

HasIscomplete returns a boolean if a field has been set.

### GetSessionend

`func (o *ModChatGetSessions200ResponseSessionsInner) GetSessionend() int32`

GetSessionend returns the Sessionend field if non-nil, zero value otherwise.

### GetSessionendOk

`func (o *ModChatGetSessions200ResponseSessionsInner) GetSessionendOk() (*int32, bool)`

GetSessionendOk returns a tuple with the Sessionend field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSessionend

`func (o *ModChatGetSessions200ResponseSessionsInner) SetSessionend(v int32)`

SetSessionend sets Sessionend field to given value.

### HasSessionend

`func (o *ModChatGetSessions200ResponseSessionsInner) HasSessionend() bool`

HasSessionend returns a boolean if a field has been set.

### GetSessionstart

`func (o *ModChatGetSessions200ResponseSessionsInner) GetSessionstart() int32`

GetSessionstart returns the Sessionstart field if non-nil, zero value otherwise.

### GetSessionstartOk

`func (o *ModChatGetSessions200ResponseSessionsInner) GetSessionstartOk() (*int32, bool)`

GetSessionstartOk returns a tuple with the Sessionstart field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSessionstart

`func (o *ModChatGetSessions200ResponseSessionsInner) SetSessionstart(v int32)`

SetSessionstart sets Sessionstart field to given value.

### HasSessionstart

`func (o *ModChatGetSessions200ResponseSessionsInner) HasSessionstart() bool`

HasSessionstart returns a boolean if a field has been set.

### GetSessionusers

`func (o *ModChatGetSessions200ResponseSessionsInner) GetSessionusers() []ModChatGetSessions200ResponseSessionsInnerSessionusersInner`

GetSessionusers returns the Sessionusers field if non-nil, zero value otherwise.

### GetSessionusersOk

`func (o *ModChatGetSessions200ResponseSessionsInner) GetSessionusersOk() (*[]ModChatGetSessions200ResponseSessionsInnerSessionusersInner, bool)`

GetSessionusersOk returns a tuple with the Sessionusers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSessionusers

`func (o *ModChatGetSessions200ResponseSessionsInner) SetSessionusers(v []ModChatGetSessions200ResponseSessionsInnerSessionusersInner)`

SetSessionusers sets Sessionusers field to given value.

### HasSessionusers

`func (o *ModChatGetSessions200ResponseSessionsInner) HasSessionusers() bool`

HasSessionusers returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


