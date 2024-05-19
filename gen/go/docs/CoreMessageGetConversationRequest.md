# CoreMessageGetConversationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Conversationid** | **int32** | The id of the conversation to fetch | [default to null]
**Includecontactrequests** | **bool** | Include contact requests in the members | [default to null]
**Includeprivacyinfo** | **bool** | Include privacy info in the members | [default to null]
**Memberlimit** | Pointer to **int32** | Limit for number of members | [optional] [default to 0]
**Memberoffset** | Pointer to **int32** | Offset for member list | [optional] [default to 0]
**Messagelimit** | Pointer to **int32** | Limit for number of messages | [optional] [default to 100]
**Messageoffset** | Pointer to **int32** | Offset for messages list | [optional] [default to 0]
**Newestmessagesfirst** | Pointer to **bool** | Order messages by newest first | [optional] [default to true]
**Userid** | **int32** | The id of the user who we are viewing conversations for | [default to null]

## Methods

### NewCoreMessageGetConversationRequest

`func NewCoreMessageGetConversationRequest(conversationid int32, includecontactrequests bool, includeprivacyinfo bool, userid int32, ) *CoreMessageGetConversationRequest`

NewCoreMessageGetConversationRequest instantiates a new CoreMessageGetConversationRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageGetConversationRequestWithDefaults

`func NewCoreMessageGetConversationRequestWithDefaults() *CoreMessageGetConversationRequest`

NewCoreMessageGetConversationRequestWithDefaults instantiates a new CoreMessageGetConversationRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetConversationid

`func (o *CoreMessageGetConversationRequest) GetConversationid() int32`

GetConversationid returns the Conversationid field if non-nil, zero value otherwise.

### GetConversationidOk

`func (o *CoreMessageGetConversationRequest) GetConversationidOk() (*int32, bool)`

GetConversationidOk returns a tuple with the Conversationid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversationid

`func (o *CoreMessageGetConversationRequest) SetConversationid(v int32)`

SetConversationid sets Conversationid field to given value.


### GetIncludecontactrequests

`func (o *CoreMessageGetConversationRequest) GetIncludecontactrequests() bool`

GetIncludecontactrequests returns the Includecontactrequests field if non-nil, zero value otherwise.

### GetIncludecontactrequestsOk

`func (o *CoreMessageGetConversationRequest) GetIncludecontactrequestsOk() (*bool, bool)`

GetIncludecontactrequestsOk returns a tuple with the Includecontactrequests field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludecontactrequests

`func (o *CoreMessageGetConversationRequest) SetIncludecontactrequests(v bool)`

SetIncludecontactrequests sets Includecontactrequests field to given value.


### GetIncludeprivacyinfo

`func (o *CoreMessageGetConversationRequest) GetIncludeprivacyinfo() bool`

GetIncludeprivacyinfo returns the Includeprivacyinfo field if non-nil, zero value otherwise.

### GetIncludeprivacyinfoOk

`func (o *CoreMessageGetConversationRequest) GetIncludeprivacyinfoOk() (*bool, bool)`

GetIncludeprivacyinfoOk returns a tuple with the Includeprivacyinfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludeprivacyinfo

`func (o *CoreMessageGetConversationRequest) SetIncludeprivacyinfo(v bool)`

SetIncludeprivacyinfo sets Includeprivacyinfo field to given value.


### GetMemberlimit

`func (o *CoreMessageGetConversationRequest) GetMemberlimit() int32`

GetMemberlimit returns the Memberlimit field if non-nil, zero value otherwise.

### GetMemberlimitOk

`func (o *CoreMessageGetConversationRequest) GetMemberlimitOk() (*int32, bool)`

GetMemberlimitOk returns a tuple with the Memberlimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMemberlimit

`func (o *CoreMessageGetConversationRequest) SetMemberlimit(v int32)`

SetMemberlimit sets Memberlimit field to given value.

### HasMemberlimit

`func (o *CoreMessageGetConversationRequest) HasMemberlimit() bool`

HasMemberlimit returns a boolean if a field has been set.

### GetMemberoffset

`func (o *CoreMessageGetConversationRequest) GetMemberoffset() int32`

GetMemberoffset returns the Memberoffset field if non-nil, zero value otherwise.

### GetMemberoffsetOk

`func (o *CoreMessageGetConversationRequest) GetMemberoffsetOk() (*int32, bool)`

GetMemberoffsetOk returns a tuple with the Memberoffset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMemberoffset

`func (o *CoreMessageGetConversationRequest) SetMemberoffset(v int32)`

SetMemberoffset sets Memberoffset field to given value.

### HasMemberoffset

`func (o *CoreMessageGetConversationRequest) HasMemberoffset() bool`

HasMemberoffset returns a boolean if a field has been set.

### GetMessagelimit

`func (o *CoreMessageGetConversationRequest) GetMessagelimit() int32`

GetMessagelimit returns the Messagelimit field if non-nil, zero value otherwise.

### GetMessagelimitOk

`func (o *CoreMessageGetConversationRequest) GetMessagelimitOk() (*int32, bool)`

GetMessagelimitOk returns a tuple with the Messagelimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessagelimit

`func (o *CoreMessageGetConversationRequest) SetMessagelimit(v int32)`

SetMessagelimit sets Messagelimit field to given value.

### HasMessagelimit

`func (o *CoreMessageGetConversationRequest) HasMessagelimit() bool`

HasMessagelimit returns a boolean if a field has been set.

### GetMessageoffset

`func (o *CoreMessageGetConversationRequest) GetMessageoffset() int32`

GetMessageoffset returns the Messageoffset field if non-nil, zero value otherwise.

### GetMessageoffsetOk

`func (o *CoreMessageGetConversationRequest) GetMessageoffsetOk() (*int32, bool)`

GetMessageoffsetOk returns a tuple with the Messageoffset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageoffset

`func (o *CoreMessageGetConversationRequest) SetMessageoffset(v int32)`

SetMessageoffset sets Messageoffset field to given value.

### HasMessageoffset

`func (o *CoreMessageGetConversationRequest) HasMessageoffset() bool`

HasMessageoffset returns a boolean if a field has been set.

### GetNewestmessagesfirst

`func (o *CoreMessageGetConversationRequest) GetNewestmessagesfirst() bool`

GetNewestmessagesfirst returns the Newestmessagesfirst field if non-nil, zero value otherwise.

### GetNewestmessagesfirstOk

`func (o *CoreMessageGetConversationRequest) GetNewestmessagesfirstOk() (*bool, bool)`

GetNewestmessagesfirstOk returns a tuple with the Newestmessagesfirst field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNewestmessagesfirst

`func (o *CoreMessageGetConversationRequest) SetNewestmessagesfirst(v bool)`

SetNewestmessagesfirst sets Newestmessagesfirst field to given value.

### HasNewestmessagesfirst

`func (o *CoreMessageGetConversationRequest) HasNewestmessagesfirst() bool`

HasNewestmessagesfirst returns a boolean if a field has been set.

### GetUserid

`func (o *CoreMessageGetConversationRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreMessageGetConversationRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreMessageGetConversationRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


