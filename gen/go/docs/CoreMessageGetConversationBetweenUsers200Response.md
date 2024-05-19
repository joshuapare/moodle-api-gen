# CoreMessageGetConversationBetweenUsers200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Candeletemessagesforallusers** | Pointer to **bool** | If the user can delete messages in the conversation for all users | [optional] [default to false]
**Id** | **int32** | The conversation id | 
**Imageurl** | Pointer to **string** | A link to the conversation picture, if set | [optional] 
**Isfavourite** | **bool** | If the user marked this conversation as a favourite | 
**Ismuted** | **bool** | If the user muted this conversation | 
**Isread** | **bool** | If the user has read all messages in the conversation | 
**Membercount** | **int32** | Total number of conversation members | 
**Members** | [**[]CoreMessageGetConversationBetweenUsers200ResponseMembersInner**](CoreMessageGetConversationBetweenUsers200ResponseMembersInner.md) |  | 
**Messages** | [**[]CoreMessageGetConversationBetweenUsers200ResponseMessagesInner**](CoreMessageGetConversationBetweenUsers200ResponseMessagesInner.md) |  | 
**Name** | Pointer to **string** | The conversation name, if set | [optional] 
**Subname** | Pointer to **string** | A subtitle for the conversation name, if set | [optional] 
**Type** | **int32** | The type of the conversation (1&#x3D;individual,2&#x3D;group,3&#x3D;self) | 
**Unreadcount** | Pointer to **int32** | The number of unread messages in this conversation | [optional] 

## Methods

### NewCoreMessageGetConversationBetweenUsers200Response

`func NewCoreMessageGetConversationBetweenUsers200Response(id int32, isfavourite bool, ismuted bool, isread bool, membercount int32, members []CoreMessageGetConversationBetweenUsers200ResponseMembersInner, messages []CoreMessageGetConversationBetweenUsers200ResponseMessagesInner, type_ int32, ) *CoreMessageGetConversationBetweenUsers200Response`

NewCoreMessageGetConversationBetweenUsers200Response instantiates a new CoreMessageGetConversationBetweenUsers200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageGetConversationBetweenUsers200ResponseWithDefaults

`func NewCoreMessageGetConversationBetweenUsers200ResponseWithDefaults() *CoreMessageGetConversationBetweenUsers200Response`

NewCoreMessageGetConversationBetweenUsers200ResponseWithDefaults instantiates a new CoreMessageGetConversationBetweenUsers200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCandeletemessagesforallusers

`func (o *CoreMessageGetConversationBetweenUsers200Response) GetCandeletemessagesforallusers() bool`

GetCandeletemessagesforallusers returns the Candeletemessagesforallusers field if non-nil, zero value otherwise.

### GetCandeletemessagesforallusersOk

`func (o *CoreMessageGetConversationBetweenUsers200Response) GetCandeletemessagesforallusersOk() (*bool, bool)`

GetCandeletemessagesforallusersOk returns a tuple with the Candeletemessagesforallusers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCandeletemessagesforallusers

`func (o *CoreMessageGetConversationBetweenUsers200Response) SetCandeletemessagesforallusers(v bool)`

SetCandeletemessagesforallusers sets Candeletemessagesforallusers field to given value.

### HasCandeletemessagesforallusers

`func (o *CoreMessageGetConversationBetweenUsers200Response) HasCandeletemessagesforallusers() bool`

HasCandeletemessagesforallusers returns a boolean if a field has been set.

### GetId

`func (o *CoreMessageGetConversationBetweenUsers200Response) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreMessageGetConversationBetweenUsers200Response) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreMessageGetConversationBetweenUsers200Response) SetId(v int32)`

SetId sets Id field to given value.


### GetImageurl

`func (o *CoreMessageGetConversationBetweenUsers200Response) GetImageurl() string`

GetImageurl returns the Imageurl field if non-nil, zero value otherwise.

### GetImageurlOk

`func (o *CoreMessageGetConversationBetweenUsers200Response) GetImageurlOk() (*string, bool)`

GetImageurlOk returns a tuple with the Imageurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageurl

`func (o *CoreMessageGetConversationBetweenUsers200Response) SetImageurl(v string)`

SetImageurl sets Imageurl field to given value.

### HasImageurl

`func (o *CoreMessageGetConversationBetweenUsers200Response) HasImageurl() bool`

HasImageurl returns a boolean if a field has been set.

### GetIsfavourite

`func (o *CoreMessageGetConversationBetweenUsers200Response) GetIsfavourite() bool`

GetIsfavourite returns the Isfavourite field if non-nil, zero value otherwise.

### GetIsfavouriteOk

`func (o *CoreMessageGetConversationBetweenUsers200Response) GetIsfavouriteOk() (*bool, bool)`

GetIsfavouriteOk returns a tuple with the Isfavourite field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsfavourite

`func (o *CoreMessageGetConversationBetweenUsers200Response) SetIsfavourite(v bool)`

SetIsfavourite sets Isfavourite field to given value.


### GetIsmuted

`func (o *CoreMessageGetConversationBetweenUsers200Response) GetIsmuted() bool`

GetIsmuted returns the Ismuted field if non-nil, zero value otherwise.

### GetIsmutedOk

`func (o *CoreMessageGetConversationBetweenUsers200Response) GetIsmutedOk() (*bool, bool)`

GetIsmutedOk returns a tuple with the Ismuted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsmuted

`func (o *CoreMessageGetConversationBetweenUsers200Response) SetIsmuted(v bool)`

SetIsmuted sets Ismuted field to given value.


### GetIsread

`func (o *CoreMessageGetConversationBetweenUsers200Response) GetIsread() bool`

GetIsread returns the Isread field if non-nil, zero value otherwise.

### GetIsreadOk

`func (o *CoreMessageGetConversationBetweenUsers200Response) GetIsreadOk() (*bool, bool)`

GetIsreadOk returns a tuple with the Isread field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsread

`func (o *CoreMessageGetConversationBetweenUsers200Response) SetIsread(v bool)`

SetIsread sets Isread field to given value.


### GetMembercount

`func (o *CoreMessageGetConversationBetweenUsers200Response) GetMembercount() int32`

GetMembercount returns the Membercount field if non-nil, zero value otherwise.

### GetMembercountOk

`func (o *CoreMessageGetConversationBetweenUsers200Response) GetMembercountOk() (*int32, bool)`

GetMembercountOk returns a tuple with the Membercount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMembercount

`func (o *CoreMessageGetConversationBetweenUsers200Response) SetMembercount(v int32)`

SetMembercount sets Membercount field to given value.


### GetMembers

`func (o *CoreMessageGetConversationBetweenUsers200Response) GetMembers() []CoreMessageGetConversationBetweenUsers200ResponseMembersInner`

GetMembers returns the Members field if non-nil, zero value otherwise.

### GetMembersOk

`func (o *CoreMessageGetConversationBetweenUsers200Response) GetMembersOk() (*[]CoreMessageGetConversationBetweenUsers200ResponseMembersInner, bool)`

GetMembersOk returns a tuple with the Members field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMembers

`func (o *CoreMessageGetConversationBetweenUsers200Response) SetMembers(v []CoreMessageGetConversationBetweenUsers200ResponseMembersInner)`

SetMembers sets Members field to given value.


### GetMessages

`func (o *CoreMessageGetConversationBetweenUsers200Response) GetMessages() []CoreMessageGetConversationBetweenUsers200ResponseMessagesInner`

GetMessages returns the Messages field if non-nil, zero value otherwise.

### GetMessagesOk

`func (o *CoreMessageGetConversationBetweenUsers200Response) GetMessagesOk() (*[]CoreMessageGetConversationBetweenUsers200ResponseMessagesInner, bool)`

GetMessagesOk returns a tuple with the Messages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessages

`func (o *CoreMessageGetConversationBetweenUsers200Response) SetMessages(v []CoreMessageGetConversationBetweenUsers200ResponseMessagesInner)`

SetMessages sets Messages field to given value.


### GetName

`func (o *CoreMessageGetConversationBetweenUsers200Response) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreMessageGetConversationBetweenUsers200Response) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreMessageGetConversationBetweenUsers200Response) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreMessageGetConversationBetweenUsers200Response) HasName() bool`

HasName returns a boolean if a field has been set.

### GetSubname

`func (o *CoreMessageGetConversationBetweenUsers200Response) GetSubname() string`

GetSubname returns the Subname field if non-nil, zero value otherwise.

### GetSubnameOk

`func (o *CoreMessageGetConversationBetweenUsers200Response) GetSubnameOk() (*string, bool)`

GetSubnameOk returns a tuple with the Subname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubname

`func (o *CoreMessageGetConversationBetweenUsers200Response) SetSubname(v string)`

SetSubname sets Subname field to given value.

### HasSubname

`func (o *CoreMessageGetConversationBetweenUsers200Response) HasSubname() bool`

HasSubname returns a boolean if a field has been set.

### GetType

`func (o *CoreMessageGetConversationBetweenUsers200Response) GetType() int32`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CoreMessageGetConversationBetweenUsers200Response) GetTypeOk() (*int32, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CoreMessageGetConversationBetweenUsers200Response) SetType(v int32)`

SetType sets Type field to given value.


### GetUnreadcount

`func (o *CoreMessageGetConversationBetweenUsers200Response) GetUnreadcount() int32`

GetUnreadcount returns the Unreadcount field if non-nil, zero value otherwise.

### GetUnreadcountOk

`func (o *CoreMessageGetConversationBetweenUsers200Response) GetUnreadcountOk() (*int32, bool)`

GetUnreadcountOk returns a tuple with the Unreadcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnreadcount

`func (o *CoreMessageGetConversationBetweenUsers200Response) SetUnreadcount(v int32)`

SetUnreadcount sets Unreadcount field to given value.

### HasUnreadcount

`func (o *CoreMessageGetConversationBetweenUsers200Response) HasUnreadcount() bool`

HasUnreadcount returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


