# CoreMessageGetConversationMembersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Conversationid** | **int32** | The id of the conversation | 
**Includecontactrequests** | Pointer to **bool** | Do we want to include contact requests? | [optional] [default to false]
**Includeprivacyinfo** | Pointer to **bool** | Do we want to include privacy info? | [optional] [default to false]
**Limitfrom** | Pointer to **int32** | Limit from | [optional] [default to 0]
**Limitnum** | Pointer to **int32** | Limit number | [optional] [default to 0]
**Userid** | **int32** | The id of the user we are performing this action on behalf of | [default to null]

## Methods

### NewCoreMessageGetConversationMembersRequest

`func NewCoreMessageGetConversationMembersRequest(conversationid int32, userid int32, ) *CoreMessageGetConversationMembersRequest`

NewCoreMessageGetConversationMembersRequest instantiates a new CoreMessageGetConversationMembersRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageGetConversationMembersRequestWithDefaults

`func NewCoreMessageGetConversationMembersRequestWithDefaults() *CoreMessageGetConversationMembersRequest`

NewCoreMessageGetConversationMembersRequestWithDefaults instantiates a new CoreMessageGetConversationMembersRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetConversationid

`func (o *CoreMessageGetConversationMembersRequest) GetConversationid() int32`

GetConversationid returns the Conversationid field if non-nil, zero value otherwise.

### GetConversationidOk

`func (o *CoreMessageGetConversationMembersRequest) GetConversationidOk() (*int32, bool)`

GetConversationidOk returns a tuple with the Conversationid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversationid

`func (o *CoreMessageGetConversationMembersRequest) SetConversationid(v int32)`

SetConversationid sets Conversationid field to given value.


### GetIncludecontactrequests

`func (o *CoreMessageGetConversationMembersRequest) GetIncludecontactrequests() bool`

GetIncludecontactrequests returns the Includecontactrequests field if non-nil, zero value otherwise.

### GetIncludecontactrequestsOk

`func (o *CoreMessageGetConversationMembersRequest) GetIncludecontactrequestsOk() (*bool, bool)`

GetIncludecontactrequestsOk returns a tuple with the Includecontactrequests field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludecontactrequests

`func (o *CoreMessageGetConversationMembersRequest) SetIncludecontactrequests(v bool)`

SetIncludecontactrequests sets Includecontactrequests field to given value.

### HasIncludecontactrequests

`func (o *CoreMessageGetConversationMembersRequest) HasIncludecontactrequests() bool`

HasIncludecontactrequests returns a boolean if a field has been set.

### GetIncludeprivacyinfo

`func (o *CoreMessageGetConversationMembersRequest) GetIncludeprivacyinfo() bool`

GetIncludeprivacyinfo returns the Includeprivacyinfo field if non-nil, zero value otherwise.

### GetIncludeprivacyinfoOk

`func (o *CoreMessageGetConversationMembersRequest) GetIncludeprivacyinfoOk() (*bool, bool)`

GetIncludeprivacyinfoOk returns a tuple with the Includeprivacyinfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludeprivacyinfo

`func (o *CoreMessageGetConversationMembersRequest) SetIncludeprivacyinfo(v bool)`

SetIncludeprivacyinfo sets Includeprivacyinfo field to given value.

### HasIncludeprivacyinfo

`func (o *CoreMessageGetConversationMembersRequest) HasIncludeprivacyinfo() bool`

HasIncludeprivacyinfo returns a boolean if a field has been set.

### GetLimitfrom

`func (o *CoreMessageGetConversationMembersRequest) GetLimitfrom() int32`

GetLimitfrom returns the Limitfrom field if non-nil, zero value otherwise.

### GetLimitfromOk

`func (o *CoreMessageGetConversationMembersRequest) GetLimitfromOk() (*int32, bool)`

GetLimitfromOk returns a tuple with the Limitfrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimitfrom

`func (o *CoreMessageGetConversationMembersRequest) SetLimitfrom(v int32)`

SetLimitfrom sets Limitfrom field to given value.

### HasLimitfrom

`func (o *CoreMessageGetConversationMembersRequest) HasLimitfrom() bool`

HasLimitfrom returns a boolean if a field has been set.

### GetLimitnum

`func (o *CoreMessageGetConversationMembersRequest) GetLimitnum() int32`

GetLimitnum returns the Limitnum field if non-nil, zero value otherwise.

### GetLimitnumOk

`func (o *CoreMessageGetConversationMembersRequest) GetLimitnumOk() (*int32, bool)`

GetLimitnumOk returns a tuple with the Limitnum field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimitnum

`func (o *CoreMessageGetConversationMembersRequest) SetLimitnum(v int32)`

SetLimitnum sets Limitnum field to given value.

### HasLimitnum

`func (o *CoreMessageGetConversationMembersRequest) HasLimitnum() bool`

HasLimitnum returns a boolean if a field has been set.

### GetUserid

`func (o *CoreMessageGetConversationMembersRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreMessageGetConversationMembersRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreMessageGetConversationMembersRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


