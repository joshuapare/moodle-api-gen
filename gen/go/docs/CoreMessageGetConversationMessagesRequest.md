# CoreMessageGetConversationMessagesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Convid** | **int32** | The conversation id | 
**Currentuserid** | **int32** | The current user&#39;s id | [default to null]
**Limitfrom** | Pointer to **int32** | Limit from | [optional] [default to 0]
**Limitnum** | Pointer to **int32** | Limit number | [optional] [default to 0]
**Newest** | Pointer to **bool** | Newest first? | [optional] [default to false]
**Timefrom** | Pointer to **int32** | The timestamp from which the messages were created | [optional] [default to 0]

## Methods

### NewCoreMessageGetConversationMessagesRequest

`func NewCoreMessageGetConversationMessagesRequest(convid int32, currentuserid int32, ) *CoreMessageGetConversationMessagesRequest`

NewCoreMessageGetConversationMessagesRequest instantiates a new CoreMessageGetConversationMessagesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageGetConversationMessagesRequestWithDefaults

`func NewCoreMessageGetConversationMessagesRequestWithDefaults() *CoreMessageGetConversationMessagesRequest`

NewCoreMessageGetConversationMessagesRequestWithDefaults instantiates a new CoreMessageGetConversationMessagesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetConvid

`func (o *CoreMessageGetConversationMessagesRequest) GetConvid() int32`

GetConvid returns the Convid field if non-nil, zero value otherwise.

### GetConvidOk

`func (o *CoreMessageGetConversationMessagesRequest) GetConvidOk() (*int32, bool)`

GetConvidOk returns a tuple with the Convid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConvid

`func (o *CoreMessageGetConversationMessagesRequest) SetConvid(v int32)`

SetConvid sets Convid field to given value.


### GetCurrentuserid

`func (o *CoreMessageGetConversationMessagesRequest) GetCurrentuserid() int32`

GetCurrentuserid returns the Currentuserid field if non-nil, zero value otherwise.

### GetCurrentuseridOk

`func (o *CoreMessageGetConversationMessagesRequest) GetCurrentuseridOk() (*int32, bool)`

GetCurrentuseridOk returns a tuple with the Currentuserid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrentuserid

`func (o *CoreMessageGetConversationMessagesRequest) SetCurrentuserid(v int32)`

SetCurrentuserid sets Currentuserid field to given value.


### GetLimitfrom

`func (o *CoreMessageGetConversationMessagesRequest) GetLimitfrom() int32`

GetLimitfrom returns the Limitfrom field if non-nil, zero value otherwise.

### GetLimitfromOk

`func (o *CoreMessageGetConversationMessagesRequest) GetLimitfromOk() (*int32, bool)`

GetLimitfromOk returns a tuple with the Limitfrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimitfrom

`func (o *CoreMessageGetConversationMessagesRequest) SetLimitfrom(v int32)`

SetLimitfrom sets Limitfrom field to given value.

### HasLimitfrom

`func (o *CoreMessageGetConversationMessagesRequest) HasLimitfrom() bool`

HasLimitfrom returns a boolean if a field has been set.

### GetLimitnum

`func (o *CoreMessageGetConversationMessagesRequest) GetLimitnum() int32`

GetLimitnum returns the Limitnum field if non-nil, zero value otherwise.

### GetLimitnumOk

`func (o *CoreMessageGetConversationMessagesRequest) GetLimitnumOk() (*int32, bool)`

GetLimitnumOk returns a tuple with the Limitnum field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimitnum

`func (o *CoreMessageGetConversationMessagesRequest) SetLimitnum(v int32)`

SetLimitnum sets Limitnum field to given value.

### HasLimitnum

`func (o *CoreMessageGetConversationMessagesRequest) HasLimitnum() bool`

HasLimitnum returns a boolean if a field has been set.

### GetNewest

`func (o *CoreMessageGetConversationMessagesRequest) GetNewest() bool`

GetNewest returns the Newest field if non-nil, zero value otherwise.

### GetNewestOk

`func (o *CoreMessageGetConversationMessagesRequest) GetNewestOk() (*bool, bool)`

GetNewestOk returns a tuple with the Newest field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNewest

`func (o *CoreMessageGetConversationMessagesRequest) SetNewest(v bool)`

SetNewest sets Newest field to given value.

### HasNewest

`func (o *CoreMessageGetConversationMessagesRequest) HasNewest() bool`

HasNewest returns a boolean if a field has been set.

### GetTimefrom

`func (o *CoreMessageGetConversationMessagesRequest) GetTimefrom() int32`

GetTimefrom returns the Timefrom field if non-nil, zero value otherwise.

### GetTimefromOk

`func (o *CoreMessageGetConversationMessagesRequest) GetTimefromOk() (*int32, bool)`

GetTimefromOk returns a tuple with the Timefrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimefrom

`func (o *CoreMessageGetConversationMessagesRequest) SetTimefrom(v int32)`

SetTimefrom sets Timefrom field to given value.

### HasTimefrom

`func (o *CoreMessageGetConversationMessagesRequest) HasTimefrom() bool`

HasTimefrom returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


