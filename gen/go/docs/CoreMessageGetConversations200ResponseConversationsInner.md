# CoreMessageGetConversations200ResponseConversationsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Candeletemessagesforallusers** | Pointer to **bool** | If the user can delete messages in the conversation for all users | [optional] [default to false]
**Id** | Pointer to **int32** | The conversation id | [optional] 
**Imageurl** | Pointer to **string** | A link to the conversation picture, if set | [optional] 
**Isfavourite** | Pointer to **bool** | If the user marked this conversation as a favourite | [optional] 
**Ismuted** | Pointer to **bool** | If the user muted this conversation | [optional] 
**Isread** | Pointer to **bool** | If the user has read all messages in the conversation | [optional] 
**Membercount** | Pointer to **int32** | Total number of conversation members | [optional] 
**Members** | Pointer to [**[]CoreMessageGetConversationBetweenUsers200ResponseMembersInner**](CoreMessageGetConversationBetweenUsers200ResponseMembersInner.md) |  | [optional] 
**Messages** | Pointer to [**[]CoreMessageGetConversationBetweenUsers200ResponseMessagesInner**](CoreMessageGetConversationBetweenUsers200ResponseMessagesInner.md) |  | [optional] 
**Name** | Pointer to **string** | The conversation name, if set | [optional] 
**Subname** | Pointer to **string** | A subtitle for the conversation name, if set | [optional] 
**Type** | Pointer to **int32** | The type of the conversation (1&#x3D;individual,2&#x3D;group,3&#x3D;self) | [optional] 
**Unreadcount** | Pointer to **int32** | The number of unread messages in this conversation | [optional] 

## Methods

### NewCoreMessageGetConversations200ResponseConversationsInner

`func NewCoreMessageGetConversations200ResponseConversationsInner() *CoreMessageGetConversations200ResponseConversationsInner`

NewCoreMessageGetConversations200ResponseConversationsInner instantiates a new CoreMessageGetConversations200ResponseConversationsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageGetConversations200ResponseConversationsInnerWithDefaults

`func NewCoreMessageGetConversations200ResponseConversationsInnerWithDefaults() *CoreMessageGetConversations200ResponseConversationsInner`

NewCoreMessageGetConversations200ResponseConversationsInnerWithDefaults instantiates a new CoreMessageGetConversations200ResponseConversationsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCandeletemessagesforallusers

`func (o *CoreMessageGetConversations200ResponseConversationsInner) GetCandeletemessagesforallusers() bool`

GetCandeletemessagesforallusers returns the Candeletemessagesforallusers field if non-nil, zero value otherwise.

### GetCandeletemessagesforallusersOk

`func (o *CoreMessageGetConversations200ResponseConversationsInner) GetCandeletemessagesforallusersOk() (*bool, bool)`

GetCandeletemessagesforallusersOk returns a tuple with the Candeletemessagesforallusers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCandeletemessagesforallusers

`func (o *CoreMessageGetConversations200ResponseConversationsInner) SetCandeletemessagesforallusers(v bool)`

SetCandeletemessagesforallusers sets Candeletemessagesforallusers field to given value.

### HasCandeletemessagesforallusers

`func (o *CoreMessageGetConversations200ResponseConversationsInner) HasCandeletemessagesforallusers() bool`

HasCandeletemessagesforallusers returns a boolean if a field has been set.

### GetId

`func (o *CoreMessageGetConversations200ResponseConversationsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreMessageGetConversations200ResponseConversationsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreMessageGetConversations200ResponseConversationsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreMessageGetConversations200ResponseConversationsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetImageurl

`func (o *CoreMessageGetConversations200ResponseConversationsInner) GetImageurl() string`

GetImageurl returns the Imageurl field if non-nil, zero value otherwise.

### GetImageurlOk

`func (o *CoreMessageGetConversations200ResponseConversationsInner) GetImageurlOk() (*string, bool)`

GetImageurlOk returns a tuple with the Imageurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageurl

`func (o *CoreMessageGetConversations200ResponseConversationsInner) SetImageurl(v string)`

SetImageurl sets Imageurl field to given value.

### HasImageurl

`func (o *CoreMessageGetConversations200ResponseConversationsInner) HasImageurl() bool`

HasImageurl returns a boolean if a field has been set.

### GetIsfavourite

`func (o *CoreMessageGetConversations200ResponseConversationsInner) GetIsfavourite() bool`

GetIsfavourite returns the Isfavourite field if non-nil, zero value otherwise.

### GetIsfavouriteOk

`func (o *CoreMessageGetConversations200ResponseConversationsInner) GetIsfavouriteOk() (*bool, bool)`

GetIsfavouriteOk returns a tuple with the Isfavourite field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsfavourite

`func (o *CoreMessageGetConversations200ResponseConversationsInner) SetIsfavourite(v bool)`

SetIsfavourite sets Isfavourite field to given value.

### HasIsfavourite

`func (o *CoreMessageGetConversations200ResponseConversationsInner) HasIsfavourite() bool`

HasIsfavourite returns a boolean if a field has been set.

### GetIsmuted

`func (o *CoreMessageGetConversations200ResponseConversationsInner) GetIsmuted() bool`

GetIsmuted returns the Ismuted field if non-nil, zero value otherwise.

### GetIsmutedOk

`func (o *CoreMessageGetConversations200ResponseConversationsInner) GetIsmutedOk() (*bool, bool)`

GetIsmutedOk returns a tuple with the Ismuted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsmuted

`func (o *CoreMessageGetConversations200ResponseConversationsInner) SetIsmuted(v bool)`

SetIsmuted sets Ismuted field to given value.

### HasIsmuted

`func (o *CoreMessageGetConversations200ResponseConversationsInner) HasIsmuted() bool`

HasIsmuted returns a boolean if a field has been set.

### GetIsread

`func (o *CoreMessageGetConversations200ResponseConversationsInner) GetIsread() bool`

GetIsread returns the Isread field if non-nil, zero value otherwise.

### GetIsreadOk

`func (o *CoreMessageGetConversations200ResponseConversationsInner) GetIsreadOk() (*bool, bool)`

GetIsreadOk returns a tuple with the Isread field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsread

`func (o *CoreMessageGetConversations200ResponseConversationsInner) SetIsread(v bool)`

SetIsread sets Isread field to given value.

### HasIsread

`func (o *CoreMessageGetConversations200ResponseConversationsInner) HasIsread() bool`

HasIsread returns a boolean if a field has been set.

### GetMembercount

`func (o *CoreMessageGetConversations200ResponseConversationsInner) GetMembercount() int32`

GetMembercount returns the Membercount field if non-nil, zero value otherwise.

### GetMembercountOk

`func (o *CoreMessageGetConversations200ResponseConversationsInner) GetMembercountOk() (*int32, bool)`

GetMembercountOk returns a tuple with the Membercount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMembercount

`func (o *CoreMessageGetConversations200ResponseConversationsInner) SetMembercount(v int32)`

SetMembercount sets Membercount field to given value.

### HasMembercount

`func (o *CoreMessageGetConversations200ResponseConversationsInner) HasMembercount() bool`

HasMembercount returns a boolean if a field has been set.

### GetMembers

`func (o *CoreMessageGetConversations200ResponseConversationsInner) GetMembers() []CoreMessageGetConversationBetweenUsers200ResponseMembersInner`

GetMembers returns the Members field if non-nil, zero value otherwise.

### GetMembersOk

`func (o *CoreMessageGetConversations200ResponseConversationsInner) GetMembersOk() (*[]CoreMessageGetConversationBetweenUsers200ResponseMembersInner, bool)`

GetMembersOk returns a tuple with the Members field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMembers

`func (o *CoreMessageGetConversations200ResponseConversationsInner) SetMembers(v []CoreMessageGetConversationBetweenUsers200ResponseMembersInner)`

SetMembers sets Members field to given value.

### HasMembers

`func (o *CoreMessageGetConversations200ResponseConversationsInner) HasMembers() bool`

HasMembers returns a boolean if a field has been set.

### GetMessages

`func (o *CoreMessageGetConversations200ResponseConversationsInner) GetMessages() []CoreMessageGetConversationBetweenUsers200ResponseMessagesInner`

GetMessages returns the Messages field if non-nil, zero value otherwise.

### GetMessagesOk

`func (o *CoreMessageGetConversations200ResponseConversationsInner) GetMessagesOk() (*[]CoreMessageGetConversationBetweenUsers200ResponseMessagesInner, bool)`

GetMessagesOk returns a tuple with the Messages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessages

`func (o *CoreMessageGetConversations200ResponseConversationsInner) SetMessages(v []CoreMessageGetConversationBetweenUsers200ResponseMessagesInner)`

SetMessages sets Messages field to given value.

### HasMessages

`func (o *CoreMessageGetConversations200ResponseConversationsInner) HasMessages() bool`

HasMessages returns a boolean if a field has been set.

### GetName

`func (o *CoreMessageGetConversations200ResponseConversationsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreMessageGetConversations200ResponseConversationsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreMessageGetConversations200ResponseConversationsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreMessageGetConversations200ResponseConversationsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetSubname

`func (o *CoreMessageGetConversations200ResponseConversationsInner) GetSubname() string`

GetSubname returns the Subname field if non-nil, zero value otherwise.

### GetSubnameOk

`func (o *CoreMessageGetConversations200ResponseConversationsInner) GetSubnameOk() (*string, bool)`

GetSubnameOk returns a tuple with the Subname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubname

`func (o *CoreMessageGetConversations200ResponseConversationsInner) SetSubname(v string)`

SetSubname sets Subname field to given value.

### HasSubname

`func (o *CoreMessageGetConversations200ResponseConversationsInner) HasSubname() bool`

HasSubname returns a boolean if a field has been set.

### GetType

`func (o *CoreMessageGetConversations200ResponseConversationsInner) GetType() int32`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CoreMessageGetConversations200ResponseConversationsInner) GetTypeOk() (*int32, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CoreMessageGetConversations200ResponseConversationsInner) SetType(v int32)`

SetType sets Type field to given value.

### HasType

`func (o *CoreMessageGetConversations200ResponseConversationsInner) HasType() bool`

HasType returns a boolean if a field has been set.

### GetUnreadcount

`func (o *CoreMessageGetConversations200ResponseConversationsInner) GetUnreadcount() int32`

GetUnreadcount returns the Unreadcount field if non-nil, zero value otherwise.

### GetUnreadcountOk

`func (o *CoreMessageGetConversations200ResponseConversationsInner) GetUnreadcountOk() (*int32, bool)`

GetUnreadcountOk returns a tuple with the Unreadcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnreadcount

`func (o *CoreMessageGetConversations200ResponseConversationsInner) SetUnreadcount(v int32)`

SetUnreadcount sets Unreadcount field to given value.

### HasUnreadcount

`func (o *CoreMessageGetConversations200ResponseConversationsInner) HasUnreadcount() bool`

HasUnreadcount returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


