# CoreMessageGetConversationBetweenUsersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Includecontactrequests** | **bool** | Include contact requests in the members | 
**Includeprivacyinfo** | **bool** | Include privacy info in the members | 
**Memberlimit** | Pointer to **int32** | Limit for number of members | [optional] [default to 0]
**Memberoffset** | Pointer to **int32** | Offset for member list | [optional] [default to 0]
**Messagelimit** | Pointer to **int32** | Limit for number of messages | [optional] [default to 100]
**Messageoffset** | Pointer to **int32** | Offset for messages list | [optional] [default to 0]
**Newestmessagesfirst** | Pointer to **bool** | Order messages by newest first | [optional] [default to true]
**Otheruserid** | **int32** | The other user id | [default to null]
**Userid** | **int32** | The id of the user who we are viewing conversations for | 

## Methods

### NewCoreMessageGetConversationBetweenUsersRequest

`func NewCoreMessageGetConversationBetweenUsersRequest(includecontactrequests bool, includeprivacyinfo bool, otheruserid int32, userid int32, ) *CoreMessageGetConversationBetweenUsersRequest`

NewCoreMessageGetConversationBetweenUsersRequest instantiates a new CoreMessageGetConversationBetweenUsersRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageGetConversationBetweenUsersRequestWithDefaults

`func NewCoreMessageGetConversationBetweenUsersRequestWithDefaults() *CoreMessageGetConversationBetweenUsersRequest`

NewCoreMessageGetConversationBetweenUsersRequestWithDefaults instantiates a new CoreMessageGetConversationBetweenUsersRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIncludecontactrequests

`func (o *CoreMessageGetConversationBetweenUsersRequest) GetIncludecontactrequests() bool`

GetIncludecontactrequests returns the Includecontactrequests field if non-nil, zero value otherwise.

### GetIncludecontactrequestsOk

`func (o *CoreMessageGetConversationBetweenUsersRequest) GetIncludecontactrequestsOk() (*bool, bool)`

GetIncludecontactrequestsOk returns a tuple with the Includecontactrequests field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludecontactrequests

`func (o *CoreMessageGetConversationBetweenUsersRequest) SetIncludecontactrequests(v bool)`

SetIncludecontactrequests sets Includecontactrequests field to given value.


### GetIncludeprivacyinfo

`func (o *CoreMessageGetConversationBetweenUsersRequest) GetIncludeprivacyinfo() bool`

GetIncludeprivacyinfo returns the Includeprivacyinfo field if non-nil, zero value otherwise.

### GetIncludeprivacyinfoOk

`func (o *CoreMessageGetConversationBetweenUsersRequest) GetIncludeprivacyinfoOk() (*bool, bool)`

GetIncludeprivacyinfoOk returns a tuple with the Includeprivacyinfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludeprivacyinfo

`func (o *CoreMessageGetConversationBetweenUsersRequest) SetIncludeprivacyinfo(v bool)`

SetIncludeprivacyinfo sets Includeprivacyinfo field to given value.


### GetMemberlimit

`func (o *CoreMessageGetConversationBetweenUsersRequest) GetMemberlimit() int32`

GetMemberlimit returns the Memberlimit field if non-nil, zero value otherwise.

### GetMemberlimitOk

`func (o *CoreMessageGetConversationBetweenUsersRequest) GetMemberlimitOk() (*int32, bool)`

GetMemberlimitOk returns a tuple with the Memberlimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMemberlimit

`func (o *CoreMessageGetConversationBetweenUsersRequest) SetMemberlimit(v int32)`

SetMemberlimit sets Memberlimit field to given value.

### HasMemberlimit

`func (o *CoreMessageGetConversationBetweenUsersRequest) HasMemberlimit() bool`

HasMemberlimit returns a boolean if a field has been set.

### GetMemberoffset

`func (o *CoreMessageGetConversationBetweenUsersRequest) GetMemberoffset() int32`

GetMemberoffset returns the Memberoffset field if non-nil, zero value otherwise.

### GetMemberoffsetOk

`func (o *CoreMessageGetConversationBetweenUsersRequest) GetMemberoffsetOk() (*int32, bool)`

GetMemberoffsetOk returns a tuple with the Memberoffset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMemberoffset

`func (o *CoreMessageGetConversationBetweenUsersRequest) SetMemberoffset(v int32)`

SetMemberoffset sets Memberoffset field to given value.

### HasMemberoffset

`func (o *CoreMessageGetConversationBetweenUsersRequest) HasMemberoffset() bool`

HasMemberoffset returns a boolean if a field has been set.

### GetMessagelimit

`func (o *CoreMessageGetConversationBetweenUsersRequest) GetMessagelimit() int32`

GetMessagelimit returns the Messagelimit field if non-nil, zero value otherwise.

### GetMessagelimitOk

`func (o *CoreMessageGetConversationBetweenUsersRequest) GetMessagelimitOk() (*int32, bool)`

GetMessagelimitOk returns a tuple with the Messagelimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessagelimit

`func (o *CoreMessageGetConversationBetweenUsersRequest) SetMessagelimit(v int32)`

SetMessagelimit sets Messagelimit field to given value.

### HasMessagelimit

`func (o *CoreMessageGetConversationBetweenUsersRequest) HasMessagelimit() bool`

HasMessagelimit returns a boolean if a field has been set.

### GetMessageoffset

`func (o *CoreMessageGetConversationBetweenUsersRequest) GetMessageoffset() int32`

GetMessageoffset returns the Messageoffset field if non-nil, zero value otherwise.

### GetMessageoffsetOk

`func (o *CoreMessageGetConversationBetweenUsersRequest) GetMessageoffsetOk() (*int32, bool)`

GetMessageoffsetOk returns a tuple with the Messageoffset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageoffset

`func (o *CoreMessageGetConversationBetweenUsersRequest) SetMessageoffset(v int32)`

SetMessageoffset sets Messageoffset field to given value.

### HasMessageoffset

`func (o *CoreMessageGetConversationBetweenUsersRequest) HasMessageoffset() bool`

HasMessageoffset returns a boolean if a field has been set.

### GetNewestmessagesfirst

`func (o *CoreMessageGetConversationBetweenUsersRequest) GetNewestmessagesfirst() bool`

GetNewestmessagesfirst returns the Newestmessagesfirst field if non-nil, zero value otherwise.

### GetNewestmessagesfirstOk

`func (o *CoreMessageGetConversationBetweenUsersRequest) GetNewestmessagesfirstOk() (*bool, bool)`

GetNewestmessagesfirstOk returns a tuple with the Newestmessagesfirst field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNewestmessagesfirst

`func (o *CoreMessageGetConversationBetweenUsersRequest) SetNewestmessagesfirst(v bool)`

SetNewestmessagesfirst sets Newestmessagesfirst field to given value.

### HasNewestmessagesfirst

`func (o *CoreMessageGetConversationBetweenUsersRequest) HasNewestmessagesfirst() bool`

HasNewestmessagesfirst returns a boolean if a field has been set.

### GetOtheruserid

`func (o *CoreMessageGetConversationBetweenUsersRequest) GetOtheruserid() int32`

GetOtheruserid returns the Otheruserid field if non-nil, zero value otherwise.

### GetOtheruseridOk

`func (o *CoreMessageGetConversationBetweenUsersRequest) GetOtheruseridOk() (*int32, bool)`

GetOtheruseridOk returns a tuple with the Otheruserid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtheruserid

`func (o *CoreMessageGetConversationBetweenUsersRequest) SetOtheruserid(v int32)`

SetOtheruserid sets Otheruserid field to given value.


### GetUserid

`func (o *CoreMessageGetConversationBetweenUsersRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreMessageGetConversationBetweenUsersRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreMessageGetConversationBetweenUsersRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


