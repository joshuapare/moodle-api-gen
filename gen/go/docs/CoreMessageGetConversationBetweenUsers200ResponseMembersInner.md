# CoreMessageGetConversationBetweenUsers200ResponseMembersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Canmessage** | Pointer to **bool** | If the user can be messaged | [optional] 
**Canmessageevenifblocked** | Pointer to **bool** | If the user can still message even if they get blocked | [optional] 
**Contactrequests** | Pointer to [**[]CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner**](CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner.md) |  | [optional] 
**Conversations** | Pointer to [**[]CoreMessageGetConversationBetweenUsers200ResponseMembersInnerConversationsInner**](CoreMessageGetConversationBetweenUsers200ResponseMembersInnerConversationsInner.md) |  | [optional] 
**Fullname** | Pointer to **string** | The user&#39;s name | [optional] 
**Id** | Pointer to **int32** | The user id | [optional] 
**Isblocked** | Pointer to **bool** | If the user has been blocked | [optional] 
**Iscontact** | Pointer to **bool** | Is the user a contact? | [optional] 
**Isdeleted** | Pointer to **bool** | Is the user deleted? | [optional] 
**Isonline** | Pointer to **bool** | The user&#39;s online status | [optional] 
**Profileimageurl** | Pointer to **string** | User picture URL | [optional] 
**Profileimageurlsmall** | Pointer to **string** | Small user picture URL | [optional] 
**Profileurl** | Pointer to **string** | The link to the user&#39;s profile page | [optional] 
**Requirescontact** | Pointer to **bool** | If the user requires to be contacts | [optional] 
**Showonlinestatus** | Pointer to **bool** | Show the user&#39;s online status? | [optional] 

## Methods

### NewCoreMessageGetConversationBetweenUsers200ResponseMembersInner

`func NewCoreMessageGetConversationBetweenUsers200ResponseMembersInner() *CoreMessageGetConversationBetweenUsers200ResponseMembersInner`

NewCoreMessageGetConversationBetweenUsers200ResponseMembersInner instantiates a new CoreMessageGetConversationBetweenUsers200ResponseMembersInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageGetConversationBetweenUsers200ResponseMembersInnerWithDefaults

`func NewCoreMessageGetConversationBetweenUsers200ResponseMembersInnerWithDefaults() *CoreMessageGetConversationBetweenUsers200ResponseMembersInner`

NewCoreMessageGetConversationBetweenUsers200ResponseMembersInnerWithDefaults instantiates a new CoreMessageGetConversationBetweenUsers200ResponseMembersInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCanmessage

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetCanmessage() bool`

GetCanmessage returns the Canmessage field if non-nil, zero value otherwise.

### GetCanmessageOk

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetCanmessageOk() (*bool, bool)`

GetCanmessageOk returns a tuple with the Canmessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmessage

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) SetCanmessage(v bool)`

SetCanmessage sets Canmessage field to given value.

### HasCanmessage

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) HasCanmessage() bool`

HasCanmessage returns a boolean if a field has been set.

### GetCanmessageevenifblocked

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetCanmessageevenifblocked() bool`

GetCanmessageevenifblocked returns the Canmessageevenifblocked field if non-nil, zero value otherwise.

### GetCanmessageevenifblockedOk

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetCanmessageevenifblockedOk() (*bool, bool)`

GetCanmessageevenifblockedOk returns a tuple with the Canmessageevenifblocked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmessageevenifblocked

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) SetCanmessageevenifblocked(v bool)`

SetCanmessageevenifblocked sets Canmessageevenifblocked field to given value.

### HasCanmessageevenifblocked

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) HasCanmessageevenifblocked() bool`

HasCanmessageevenifblocked returns a boolean if a field has been set.

### GetContactrequests

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetContactrequests() []CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner`

GetContactrequests returns the Contactrequests field if non-nil, zero value otherwise.

### GetContactrequestsOk

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetContactrequestsOk() (*[]CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner, bool)`

GetContactrequestsOk returns a tuple with the Contactrequests field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContactrequests

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) SetContactrequests(v []CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner)`

SetContactrequests sets Contactrequests field to given value.

### HasContactrequests

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) HasContactrequests() bool`

HasContactrequests returns a boolean if a field has been set.

### GetConversations

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetConversations() []CoreMessageGetConversationBetweenUsers200ResponseMembersInnerConversationsInner`

GetConversations returns the Conversations field if non-nil, zero value otherwise.

### GetConversationsOk

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetConversationsOk() (*[]CoreMessageGetConversationBetweenUsers200ResponseMembersInnerConversationsInner, bool)`

GetConversationsOk returns a tuple with the Conversations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversations

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) SetConversations(v []CoreMessageGetConversationBetweenUsers200ResponseMembersInnerConversationsInner)`

SetConversations sets Conversations field to given value.

### HasConversations

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) HasConversations() bool`

HasConversations returns a boolean if a field has been set.

### GetFullname

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetFullname() string`

GetFullname returns the Fullname field if non-nil, zero value otherwise.

### GetFullnameOk

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetFullnameOk() (*string, bool)`

GetFullnameOk returns a tuple with the Fullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullname

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) SetFullname(v string)`

SetFullname sets Fullname field to given value.

### HasFullname

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) HasFullname() bool`

HasFullname returns a boolean if a field has been set.

### GetId

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIsblocked

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetIsblocked() bool`

GetIsblocked returns the Isblocked field if non-nil, zero value otherwise.

### GetIsblockedOk

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetIsblockedOk() (*bool, bool)`

GetIsblockedOk returns a tuple with the Isblocked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsblocked

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) SetIsblocked(v bool)`

SetIsblocked sets Isblocked field to given value.

### HasIsblocked

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) HasIsblocked() bool`

HasIsblocked returns a boolean if a field has been set.

### GetIscontact

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetIscontact() bool`

GetIscontact returns the Iscontact field if non-nil, zero value otherwise.

### GetIscontactOk

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetIscontactOk() (*bool, bool)`

GetIscontactOk returns a tuple with the Iscontact field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIscontact

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) SetIscontact(v bool)`

SetIscontact sets Iscontact field to given value.

### HasIscontact

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) HasIscontact() bool`

HasIscontact returns a boolean if a field has been set.

### GetIsdeleted

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetIsdeleted() bool`

GetIsdeleted returns the Isdeleted field if non-nil, zero value otherwise.

### GetIsdeletedOk

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetIsdeletedOk() (*bool, bool)`

GetIsdeletedOk returns a tuple with the Isdeleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsdeleted

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) SetIsdeleted(v bool)`

SetIsdeleted sets Isdeleted field to given value.

### HasIsdeleted

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) HasIsdeleted() bool`

HasIsdeleted returns a boolean if a field has been set.

### GetIsonline

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetIsonline() bool`

GetIsonline returns the Isonline field if non-nil, zero value otherwise.

### GetIsonlineOk

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetIsonlineOk() (*bool, bool)`

GetIsonlineOk returns a tuple with the Isonline field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsonline

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) SetIsonline(v bool)`

SetIsonline sets Isonline field to given value.

### HasIsonline

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) HasIsonline() bool`

HasIsonline returns a boolean if a field has been set.

### GetProfileimageurl

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetProfileimageurl() string`

GetProfileimageurl returns the Profileimageurl field if non-nil, zero value otherwise.

### GetProfileimageurlOk

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetProfileimageurlOk() (*string, bool)`

GetProfileimageurlOk returns a tuple with the Profileimageurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfileimageurl

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) SetProfileimageurl(v string)`

SetProfileimageurl sets Profileimageurl field to given value.

### HasProfileimageurl

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) HasProfileimageurl() bool`

HasProfileimageurl returns a boolean if a field has been set.

### GetProfileimageurlsmall

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetProfileimageurlsmall() string`

GetProfileimageurlsmall returns the Profileimageurlsmall field if non-nil, zero value otherwise.

### GetProfileimageurlsmallOk

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetProfileimageurlsmallOk() (*string, bool)`

GetProfileimageurlsmallOk returns a tuple with the Profileimageurlsmall field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfileimageurlsmall

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) SetProfileimageurlsmall(v string)`

SetProfileimageurlsmall sets Profileimageurlsmall field to given value.

### HasProfileimageurlsmall

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) HasProfileimageurlsmall() bool`

HasProfileimageurlsmall returns a boolean if a field has been set.

### GetProfileurl

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetProfileurl() string`

GetProfileurl returns the Profileurl field if non-nil, zero value otherwise.

### GetProfileurlOk

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetProfileurlOk() (*string, bool)`

GetProfileurlOk returns a tuple with the Profileurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfileurl

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) SetProfileurl(v string)`

SetProfileurl sets Profileurl field to given value.

### HasProfileurl

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) HasProfileurl() bool`

HasProfileurl returns a boolean if a field has been set.

### GetRequirescontact

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetRequirescontact() bool`

GetRequirescontact returns the Requirescontact field if non-nil, zero value otherwise.

### GetRequirescontactOk

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetRequirescontactOk() (*bool, bool)`

GetRequirescontactOk returns a tuple with the Requirescontact field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequirescontact

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) SetRequirescontact(v bool)`

SetRequirescontact sets Requirescontact field to given value.

### HasRequirescontact

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) HasRequirescontact() bool`

HasRequirescontact returns a boolean if a field has been set.

### GetShowonlinestatus

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetShowonlinestatus() bool`

GetShowonlinestatus returns the Showonlinestatus field if non-nil, zero value otherwise.

### GetShowonlinestatusOk

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) GetShowonlinestatusOk() (*bool, bool)`

GetShowonlinestatusOk returns a tuple with the Showonlinestatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowonlinestatus

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) SetShowonlinestatus(v bool)`

SetShowonlinestatus sets Showonlinestatus field to given value.

### HasShowonlinestatus

`func (o *CoreMessageGetConversationBetweenUsers200ResponseMembersInner) HasShowonlinestatus() bool`

HasShowonlinestatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


