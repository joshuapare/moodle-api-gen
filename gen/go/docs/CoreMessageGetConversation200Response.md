# CoreMessageGetConversation200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Candeletemessagesforallusers** | Pointer to **bool** | If the user can delete messages in the conversation for all users | [optional] [default to false]
**Id** | **int32** | The conversation id | [default to null]
**Imageurl** | Pointer to **string** | A link to the conversation picture, if set | [optional] [default to "null"]
**Isfavourite** | **bool** | If the user marked this conversation as a favourite | [default to null]
**Ismuted** | **bool** | If the user muted this conversation | [default to null]
**Isread** | **bool** | If the user has read all messages in the conversation | [default to null]
**Membercount** | **int32** | Total number of conversation members | [default to null]
**Members** | [**[]CoreMessageGetConversation200ResponseMembersInner**](CoreMessageGetConversation200ResponseMembersInner.md) |  | 
**Messages** | [**[]CoreMessageGetConversation200ResponseMessagesInner**](CoreMessageGetConversation200ResponseMessagesInner.md) |  | 
**Name** | Pointer to **string** | The conversation name, if set | [optional] [default to "null"]
**Subname** | Pointer to **string** | A subtitle for the conversation name, if set | [optional] [default to "null"]
**Type** | **int32** | The type of the conversation (1&#x3D;individual,2&#x3D;group,3&#x3D;self) | [default to null]
**Unreadcount** | Pointer to **int32** | The number of unread messages in this conversation | [optional] 

## Methods

### NewCoreMessageGetConversation200Response

`func NewCoreMessageGetConversation200Response(id int32, isfavourite bool, ismuted bool, isread bool, membercount int32, members []CoreMessageGetConversation200ResponseMembersInner, messages []CoreMessageGetConversation200ResponseMessagesInner, type_ int32, ) *CoreMessageGetConversation200Response`

NewCoreMessageGetConversation200Response instantiates a new CoreMessageGetConversation200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageGetConversation200ResponseWithDefaults

`func NewCoreMessageGetConversation200ResponseWithDefaults() *CoreMessageGetConversation200Response`

NewCoreMessageGetConversation200ResponseWithDefaults instantiates a new CoreMessageGetConversation200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCandeletemessagesforallusers

`func (o *CoreMessageGetConversation200Response) GetCandeletemessagesforallusers() bool`

GetCandeletemessagesforallusers returns the Candeletemessagesforallusers field if non-nil, zero value otherwise.

### GetCandeletemessagesforallusersOk

`func (o *CoreMessageGetConversation200Response) GetCandeletemessagesforallusersOk() (*bool, bool)`

GetCandeletemessagesforallusersOk returns a tuple with the Candeletemessagesforallusers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCandeletemessagesforallusers

`func (o *CoreMessageGetConversation200Response) SetCandeletemessagesforallusers(v bool)`

SetCandeletemessagesforallusers sets Candeletemessagesforallusers field to given value.

### HasCandeletemessagesforallusers

`func (o *CoreMessageGetConversation200Response) HasCandeletemessagesforallusers() bool`

HasCandeletemessagesforallusers returns a boolean if a field has been set.

### GetId

`func (o *CoreMessageGetConversation200Response) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreMessageGetConversation200Response) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreMessageGetConversation200Response) SetId(v int32)`

SetId sets Id field to given value.


### GetImageurl

`func (o *CoreMessageGetConversation200Response) GetImageurl() string`

GetImageurl returns the Imageurl field if non-nil, zero value otherwise.

### GetImageurlOk

`func (o *CoreMessageGetConversation200Response) GetImageurlOk() (*string, bool)`

GetImageurlOk returns a tuple with the Imageurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageurl

`func (o *CoreMessageGetConversation200Response) SetImageurl(v string)`

SetImageurl sets Imageurl field to given value.

### HasImageurl

`func (o *CoreMessageGetConversation200Response) HasImageurl() bool`

HasImageurl returns a boolean if a field has been set.

### GetIsfavourite

`func (o *CoreMessageGetConversation200Response) GetIsfavourite() bool`

GetIsfavourite returns the Isfavourite field if non-nil, zero value otherwise.

### GetIsfavouriteOk

`func (o *CoreMessageGetConversation200Response) GetIsfavouriteOk() (*bool, bool)`

GetIsfavouriteOk returns a tuple with the Isfavourite field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsfavourite

`func (o *CoreMessageGetConversation200Response) SetIsfavourite(v bool)`

SetIsfavourite sets Isfavourite field to given value.


### GetIsmuted

`func (o *CoreMessageGetConversation200Response) GetIsmuted() bool`

GetIsmuted returns the Ismuted field if non-nil, zero value otherwise.

### GetIsmutedOk

`func (o *CoreMessageGetConversation200Response) GetIsmutedOk() (*bool, bool)`

GetIsmutedOk returns a tuple with the Ismuted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsmuted

`func (o *CoreMessageGetConversation200Response) SetIsmuted(v bool)`

SetIsmuted sets Ismuted field to given value.


### GetIsread

`func (o *CoreMessageGetConversation200Response) GetIsread() bool`

GetIsread returns the Isread field if non-nil, zero value otherwise.

### GetIsreadOk

`func (o *CoreMessageGetConversation200Response) GetIsreadOk() (*bool, bool)`

GetIsreadOk returns a tuple with the Isread field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsread

`func (o *CoreMessageGetConversation200Response) SetIsread(v bool)`

SetIsread sets Isread field to given value.


### GetMembercount

`func (o *CoreMessageGetConversation200Response) GetMembercount() int32`

GetMembercount returns the Membercount field if non-nil, zero value otherwise.

### GetMembercountOk

`func (o *CoreMessageGetConversation200Response) GetMembercountOk() (*int32, bool)`

GetMembercountOk returns a tuple with the Membercount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMembercount

`func (o *CoreMessageGetConversation200Response) SetMembercount(v int32)`

SetMembercount sets Membercount field to given value.


### GetMembers

`func (o *CoreMessageGetConversation200Response) GetMembers() []CoreMessageGetConversation200ResponseMembersInner`

GetMembers returns the Members field if non-nil, zero value otherwise.

### GetMembersOk

`func (o *CoreMessageGetConversation200Response) GetMembersOk() (*[]CoreMessageGetConversation200ResponseMembersInner, bool)`

GetMembersOk returns a tuple with the Members field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMembers

`func (o *CoreMessageGetConversation200Response) SetMembers(v []CoreMessageGetConversation200ResponseMembersInner)`

SetMembers sets Members field to given value.


### GetMessages

`func (o *CoreMessageGetConversation200Response) GetMessages() []CoreMessageGetConversation200ResponseMessagesInner`

GetMessages returns the Messages field if non-nil, zero value otherwise.

### GetMessagesOk

`func (o *CoreMessageGetConversation200Response) GetMessagesOk() (*[]CoreMessageGetConversation200ResponseMessagesInner, bool)`

GetMessagesOk returns a tuple with the Messages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessages

`func (o *CoreMessageGetConversation200Response) SetMessages(v []CoreMessageGetConversation200ResponseMessagesInner)`

SetMessages sets Messages field to given value.


### GetName

`func (o *CoreMessageGetConversation200Response) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreMessageGetConversation200Response) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreMessageGetConversation200Response) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreMessageGetConversation200Response) HasName() bool`

HasName returns a boolean if a field has been set.

### GetSubname

`func (o *CoreMessageGetConversation200Response) GetSubname() string`

GetSubname returns the Subname field if non-nil, zero value otherwise.

### GetSubnameOk

`func (o *CoreMessageGetConversation200Response) GetSubnameOk() (*string, bool)`

GetSubnameOk returns a tuple with the Subname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubname

`func (o *CoreMessageGetConversation200Response) SetSubname(v string)`

SetSubname sets Subname field to given value.

### HasSubname

`func (o *CoreMessageGetConversation200Response) HasSubname() bool`

HasSubname returns a boolean if a field has been set.

### GetType

`func (o *CoreMessageGetConversation200Response) GetType() int32`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CoreMessageGetConversation200Response) GetTypeOk() (*int32, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CoreMessageGetConversation200Response) SetType(v int32)`

SetType sets Type field to given value.


### GetUnreadcount

`func (o *CoreMessageGetConversation200Response) GetUnreadcount() int32`

GetUnreadcount returns the Unreadcount field if non-nil, zero value otherwise.

### GetUnreadcountOk

`func (o *CoreMessageGetConversation200Response) GetUnreadcountOk() (*int32, bool)`

GetUnreadcountOk returns a tuple with the Unreadcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnreadcount

`func (o *CoreMessageGetConversation200Response) SetUnreadcount(v int32)`

SetUnreadcount sets Unreadcount field to given value.

### HasUnreadcount

`func (o *CoreMessageGetConversation200Response) HasUnreadcount() bool`

HasUnreadcount returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


