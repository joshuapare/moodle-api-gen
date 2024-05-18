# CoreMessageGetConversation200ResponseMembersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Canmessage** | Pointer to **bool** | If the user can be messaged | [optional] [default to null]
**Canmessageevenifblocked** | Pointer to **bool** | If the user can still message even if they get blocked | [optional] [default to null]
**Contactrequests** | Pointer to [**[]CoreMessageGetConversation200ResponseMembersInnerContactrequestsInner**](CoreMessageGetConversation200ResponseMembersInnerContactrequestsInner.md) |  | [optional] 
**Conversations** | Pointer to [**[]CoreMessageGetConversation200ResponseMembersInnerConversationsInner**](CoreMessageGetConversation200ResponseMembersInnerConversationsInner.md) |  | [optional] 
**Fullname** | Pointer to **string** | The user&#39;s name | [optional] 
**Id** | Pointer to **int32** | The user id | [optional] 
**Isblocked** | Pointer to **bool** | If the user has been blocked | [optional] 
**Iscontact** | Pointer to **bool** | Is the user a contact? | [optional] [default to null]
**Isdeleted** | Pointer to **bool** | Is the user deleted? | [optional] [default to null]
**Isonline** | Pointer to **bool** | The user&#39;s online status | [optional] 
**Profileimageurl** | Pointer to **string** | User picture URL | [optional] 
**Profileimageurlsmall** | Pointer to **string** | Small user picture URL | [optional] 
**Profileurl** | Pointer to **string** | The link to the user&#39;s profile page | [optional] [default to "null"]
**Requirescontact** | Pointer to **bool** | If the user requires to be contacts | [optional] [default to null]
**Showonlinestatus** | Pointer to **bool** | Show the user&#39;s online status? | [optional] 

## Methods

### NewCoreMessageGetConversation200ResponseMembersInner

`func NewCoreMessageGetConversation200ResponseMembersInner() *CoreMessageGetConversation200ResponseMembersInner`

NewCoreMessageGetConversation200ResponseMembersInner instantiates a new CoreMessageGetConversation200ResponseMembersInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageGetConversation200ResponseMembersInnerWithDefaults

`func NewCoreMessageGetConversation200ResponseMembersInnerWithDefaults() *CoreMessageGetConversation200ResponseMembersInner`

NewCoreMessageGetConversation200ResponseMembersInnerWithDefaults instantiates a new CoreMessageGetConversation200ResponseMembersInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCanmessage

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetCanmessage() bool`

GetCanmessage returns the Canmessage field if non-nil, zero value otherwise.

### GetCanmessageOk

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetCanmessageOk() (*bool, bool)`

GetCanmessageOk returns a tuple with the Canmessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmessage

`func (o *CoreMessageGetConversation200ResponseMembersInner) SetCanmessage(v bool)`

SetCanmessage sets Canmessage field to given value.

### HasCanmessage

`func (o *CoreMessageGetConversation200ResponseMembersInner) HasCanmessage() bool`

HasCanmessage returns a boolean if a field has been set.

### GetCanmessageevenifblocked

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetCanmessageevenifblocked() bool`

GetCanmessageevenifblocked returns the Canmessageevenifblocked field if non-nil, zero value otherwise.

### GetCanmessageevenifblockedOk

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetCanmessageevenifblockedOk() (*bool, bool)`

GetCanmessageevenifblockedOk returns a tuple with the Canmessageevenifblocked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmessageevenifblocked

`func (o *CoreMessageGetConversation200ResponseMembersInner) SetCanmessageevenifblocked(v bool)`

SetCanmessageevenifblocked sets Canmessageevenifblocked field to given value.

### HasCanmessageevenifblocked

`func (o *CoreMessageGetConversation200ResponseMembersInner) HasCanmessageevenifblocked() bool`

HasCanmessageevenifblocked returns a boolean if a field has been set.

### GetContactrequests

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetContactrequests() []CoreMessageGetConversation200ResponseMembersInnerContactrequestsInner`

GetContactrequests returns the Contactrequests field if non-nil, zero value otherwise.

### GetContactrequestsOk

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetContactrequestsOk() (*[]CoreMessageGetConversation200ResponseMembersInnerContactrequestsInner, bool)`

GetContactrequestsOk returns a tuple with the Contactrequests field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContactrequests

`func (o *CoreMessageGetConversation200ResponseMembersInner) SetContactrequests(v []CoreMessageGetConversation200ResponseMembersInnerContactrequestsInner)`

SetContactrequests sets Contactrequests field to given value.

### HasContactrequests

`func (o *CoreMessageGetConversation200ResponseMembersInner) HasContactrequests() bool`

HasContactrequests returns a boolean if a field has been set.

### GetConversations

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetConversations() []CoreMessageGetConversation200ResponseMembersInnerConversationsInner`

GetConversations returns the Conversations field if non-nil, zero value otherwise.

### GetConversationsOk

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetConversationsOk() (*[]CoreMessageGetConversation200ResponseMembersInnerConversationsInner, bool)`

GetConversationsOk returns a tuple with the Conversations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversations

`func (o *CoreMessageGetConversation200ResponseMembersInner) SetConversations(v []CoreMessageGetConversation200ResponseMembersInnerConversationsInner)`

SetConversations sets Conversations field to given value.

### HasConversations

`func (o *CoreMessageGetConversation200ResponseMembersInner) HasConversations() bool`

HasConversations returns a boolean if a field has been set.

### GetFullname

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetFullname() string`

GetFullname returns the Fullname field if non-nil, zero value otherwise.

### GetFullnameOk

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetFullnameOk() (*string, bool)`

GetFullnameOk returns a tuple with the Fullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullname

`func (o *CoreMessageGetConversation200ResponseMembersInner) SetFullname(v string)`

SetFullname sets Fullname field to given value.

### HasFullname

`func (o *CoreMessageGetConversation200ResponseMembersInner) HasFullname() bool`

HasFullname returns a boolean if a field has been set.

### GetId

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreMessageGetConversation200ResponseMembersInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreMessageGetConversation200ResponseMembersInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIsblocked

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetIsblocked() bool`

GetIsblocked returns the Isblocked field if non-nil, zero value otherwise.

### GetIsblockedOk

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetIsblockedOk() (*bool, bool)`

GetIsblockedOk returns a tuple with the Isblocked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsblocked

`func (o *CoreMessageGetConversation200ResponseMembersInner) SetIsblocked(v bool)`

SetIsblocked sets Isblocked field to given value.

### HasIsblocked

`func (o *CoreMessageGetConversation200ResponseMembersInner) HasIsblocked() bool`

HasIsblocked returns a boolean if a field has been set.

### GetIscontact

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetIscontact() bool`

GetIscontact returns the Iscontact field if non-nil, zero value otherwise.

### GetIscontactOk

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetIscontactOk() (*bool, bool)`

GetIscontactOk returns a tuple with the Iscontact field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIscontact

`func (o *CoreMessageGetConversation200ResponseMembersInner) SetIscontact(v bool)`

SetIscontact sets Iscontact field to given value.

### HasIscontact

`func (o *CoreMessageGetConversation200ResponseMembersInner) HasIscontact() bool`

HasIscontact returns a boolean if a field has been set.

### GetIsdeleted

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetIsdeleted() bool`

GetIsdeleted returns the Isdeleted field if non-nil, zero value otherwise.

### GetIsdeletedOk

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetIsdeletedOk() (*bool, bool)`

GetIsdeletedOk returns a tuple with the Isdeleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsdeleted

`func (o *CoreMessageGetConversation200ResponseMembersInner) SetIsdeleted(v bool)`

SetIsdeleted sets Isdeleted field to given value.

### HasIsdeleted

`func (o *CoreMessageGetConversation200ResponseMembersInner) HasIsdeleted() bool`

HasIsdeleted returns a boolean if a field has been set.

### GetIsonline

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetIsonline() bool`

GetIsonline returns the Isonline field if non-nil, zero value otherwise.

### GetIsonlineOk

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetIsonlineOk() (*bool, bool)`

GetIsonlineOk returns a tuple with the Isonline field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsonline

`func (o *CoreMessageGetConversation200ResponseMembersInner) SetIsonline(v bool)`

SetIsonline sets Isonline field to given value.

### HasIsonline

`func (o *CoreMessageGetConversation200ResponseMembersInner) HasIsonline() bool`

HasIsonline returns a boolean if a field has been set.

### GetProfileimageurl

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetProfileimageurl() string`

GetProfileimageurl returns the Profileimageurl field if non-nil, zero value otherwise.

### GetProfileimageurlOk

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetProfileimageurlOk() (*string, bool)`

GetProfileimageurlOk returns a tuple with the Profileimageurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfileimageurl

`func (o *CoreMessageGetConversation200ResponseMembersInner) SetProfileimageurl(v string)`

SetProfileimageurl sets Profileimageurl field to given value.

### HasProfileimageurl

`func (o *CoreMessageGetConversation200ResponseMembersInner) HasProfileimageurl() bool`

HasProfileimageurl returns a boolean if a field has been set.

### GetProfileimageurlsmall

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetProfileimageurlsmall() string`

GetProfileimageurlsmall returns the Profileimageurlsmall field if non-nil, zero value otherwise.

### GetProfileimageurlsmallOk

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetProfileimageurlsmallOk() (*string, bool)`

GetProfileimageurlsmallOk returns a tuple with the Profileimageurlsmall field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfileimageurlsmall

`func (o *CoreMessageGetConversation200ResponseMembersInner) SetProfileimageurlsmall(v string)`

SetProfileimageurlsmall sets Profileimageurlsmall field to given value.

### HasProfileimageurlsmall

`func (o *CoreMessageGetConversation200ResponseMembersInner) HasProfileimageurlsmall() bool`

HasProfileimageurlsmall returns a boolean if a field has been set.

### GetProfileurl

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetProfileurl() string`

GetProfileurl returns the Profileurl field if non-nil, zero value otherwise.

### GetProfileurlOk

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetProfileurlOk() (*string, bool)`

GetProfileurlOk returns a tuple with the Profileurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfileurl

`func (o *CoreMessageGetConversation200ResponseMembersInner) SetProfileurl(v string)`

SetProfileurl sets Profileurl field to given value.

### HasProfileurl

`func (o *CoreMessageGetConversation200ResponseMembersInner) HasProfileurl() bool`

HasProfileurl returns a boolean if a field has been set.

### GetRequirescontact

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetRequirescontact() bool`

GetRequirescontact returns the Requirescontact field if non-nil, zero value otherwise.

### GetRequirescontactOk

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetRequirescontactOk() (*bool, bool)`

GetRequirescontactOk returns a tuple with the Requirescontact field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequirescontact

`func (o *CoreMessageGetConversation200ResponseMembersInner) SetRequirescontact(v bool)`

SetRequirescontact sets Requirescontact field to given value.

### HasRequirescontact

`func (o *CoreMessageGetConversation200ResponseMembersInner) HasRequirescontact() bool`

HasRequirescontact returns a boolean if a field has been set.

### GetShowonlinestatus

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetShowonlinestatus() bool`

GetShowonlinestatus returns the Showonlinestatus field if non-nil, zero value otherwise.

### GetShowonlinestatusOk

`func (o *CoreMessageGetConversation200ResponseMembersInner) GetShowonlinestatusOk() (*bool, bool)`

GetShowonlinestatusOk returns a tuple with the Showonlinestatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowonlinestatus

`func (o *CoreMessageGetConversation200ResponseMembersInner) SetShowonlinestatus(v bool)`

SetShowonlinestatus sets Showonlinestatus field to given value.

### HasShowonlinestatus

`func (o *CoreMessageGetConversation200ResponseMembersInner) HasShowonlinestatus() bool`

HasShowonlinestatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


