# CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Conversationid** | Pointer to **int32** | The id of the conversation | [optional] [default to null]
**Fullname** | Pointer to **string** | The user&#39;s name | [optional] [default to "null"]
**Isblocked** | Pointer to **bool** | If the user has been blocked | [optional] [default to null]
**Ismessaging** | Pointer to **bool** | If we are messaging the user | [optional] [default to null]
**Isonline** | Pointer to **bool** | The user&#39;s online status | [optional] [default to null]
**Isread** | Pointer to **bool** | If the user has read the message | [optional] [default to null]
**Lastmessage** | Pointer to **string** | The user&#39;s last message | [optional] [default to "null"]
**Lastmessagedate** | Pointer to **int32** | Timestamp for last message | [optional] [default to null]
**Messageid** | Pointer to **int32** | The unique search message id | [optional] [default to null]
**Profileimageurl** | Pointer to **string** | User picture URL | [optional] [default to "null"]
**Profileimageurlsmall** | Pointer to **string** | Small user picture URL | [optional] [default to "null"]
**Sentfromcurrentuser** | Pointer to **bool** | Was the last message sent from the current user? | [optional] [default to null]
**Showonlinestatus** | Pointer to **bool** | Show the user&#39;s online status? | [optional] [default to null]
**Unreadcount** | Pointer to **int32** | The number of unread messages in this conversation | [optional] [default to null]
**Userid** | Pointer to **int32** | The user&#39;s id | [optional] [default to null]

## Methods

### NewCoreMessageDataForMessageareaSearchMessages200ResponseContactsInner

`func NewCoreMessageDataForMessageareaSearchMessages200ResponseContactsInner() *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner`

NewCoreMessageDataForMessageareaSearchMessages200ResponseContactsInner instantiates a new CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageDataForMessageareaSearchMessages200ResponseContactsInnerWithDefaults

`func NewCoreMessageDataForMessageareaSearchMessages200ResponseContactsInnerWithDefaults() *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner`

NewCoreMessageDataForMessageareaSearchMessages200ResponseContactsInnerWithDefaults instantiates a new CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetConversationid

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetConversationid() int32`

GetConversationid returns the Conversationid field if non-nil, zero value otherwise.

### GetConversationidOk

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetConversationidOk() (*int32, bool)`

GetConversationidOk returns a tuple with the Conversationid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversationid

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) SetConversationid(v int32)`

SetConversationid sets Conversationid field to given value.

### HasConversationid

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) HasConversationid() bool`

HasConversationid returns a boolean if a field has been set.

### GetFullname

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetFullname() string`

GetFullname returns the Fullname field if non-nil, zero value otherwise.

### GetFullnameOk

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetFullnameOk() (*string, bool)`

GetFullnameOk returns a tuple with the Fullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullname

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) SetFullname(v string)`

SetFullname sets Fullname field to given value.

### HasFullname

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) HasFullname() bool`

HasFullname returns a boolean if a field has been set.

### GetIsblocked

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetIsblocked() bool`

GetIsblocked returns the Isblocked field if non-nil, zero value otherwise.

### GetIsblockedOk

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetIsblockedOk() (*bool, bool)`

GetIsblockedOk returns a tuple with the Isblocked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsblocked

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) SetIsblocked(v bool)`

SetIsblocked sets Isblocked field to given value.

### HasIsblocked

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) HasIsblocked() bool`

HasIsblocked returns a boolean if a field has been set.

### GetIsmessaging

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetIsmessaging() bool`

GetIsmessaging returns the Ismessaging field if non-nil, zero value otherwise.

### GetIsmessagingOk

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetIsmessagingOk() (*bool, bool)`

GetIsmessagingOk returns a tuple with the Ismessaging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsmessaging

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) SetIsmessaging(v bool)`

SetIsmessaging sets Ismessaging field to given value.

### HasIsmessaging

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) HasIsmessaging() bool`

HasIsmessaging returns a boolean if a field has been set.

### GetIsonline

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetIsonline() bool`

GetIsonline returns the Isonline field if non-nil, zero value otherwise.

### GetIsonlineOk

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetIsonlineOk() (*bool, bool)`

GetIsonlineOk returns a tuple with the Isonline field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsonline

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) SetIsonline(v bool)`

SetIsonline sets Isonline field to given value.

### HasIsonline

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) HasIsonline() bool`

HasIsonline returns a boolean if a field has been set.

### GetIsread

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetIsread() bool`

GetIsread returns the Isread field if non-nil, zero value otherwise.

### GetIsreadOk

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetIsreadOk() (*bool, bool)`

GetIsreadOk returns a tuple with the Isread field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsread

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) SetIsread(v bool)`

SetIsread sets Isread field to given value.

### HasIsread

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) HasIsread() bool`

HasIsread returns a boolean if a field has been set.

### GetLastmessage

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetLastmessage() string`

GetLastmessage returns the Lastmessage field if non-nil, zero value otherwise.

### GetLastmessageOk

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetLastmessageOk() (*string, bool)`

GetLastmessageOk returns a tuple with the Lastmessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastmessage

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) SetLastmessage(v string)`

SetLastmessage sets Lastmessage field to given value.

### HasLastmessage

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) HasLastmessage() bool`

HasLastmessage returns a boolean if a field has been set.

### GetLastmessagedate

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetLastmessagedate() int32`

GetLastmessagedate returns the Lastmessagedate field if non-nil, zero value otherwise.

### GetLastmessagedateOk

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetLastmessagedateOk() (*int32, bool)`

GetLastmessagedateOk returns a tuple with the Lastmessagedate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastmessagedate

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) SetLastmessagedate(v int32)`

SetLastmessagedate sets Lastmessagedate field to given value.

### HasLastmessagedate

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) HasLastmessagedate() bool`

HasLastmessagedate returns a boolean if a field has been set.

### GetMessageid

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetMessageid() int32`

GetMessageid returns the Messageid field if non-nil, zero value otherwise.

### GetMessageidOk

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetMessageidOk() (*int32, bool)`

GetMessageidOk returns a tuple with the Messageid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageid

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) SetMessageid(v int32)`

SetMessageid sets Messageid field to given value.

### HasMessageid

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) HasMessageid() bool`

HasMessageid returns a boolean if a field has been set.

### GetProfileimageurl

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetProfileimageurl() string`

GetProfileimageurl returns the Profileimageurl field if non-nil, zero value otherwise.

### GetProfileimageurlOk

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetProfileimageurlOk() (*string, bool)`

GetProfileimageurlOk returns a tuple with the Profileimageurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfileimageurl

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) SetProfileimageurl(v string)`

SetProfileimageurl sets Profileimageurl field to given value.

### HasProfileimageurl

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) HasProfileimageurl() bool`

HasProfileimageurl returns a boolean if a field has been set.

### GetProfileimageurlsmall

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetProfileimageurlsmall() string`

GetProfileimageurlsmall returns the Profileimageurlsmall field if non-nil, zero value otherwise.

### GetProfileimageurlsmallOk

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetProfileimageurlsmallOk() (*string, bool)`

GetProfileimageurlsmallOk returns a tuple with the Profileimageurlsmall field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfileimageurlsmall

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) SetProfileimageurlsmall(v string)`

SetProfileimageurlsmall sets Profileimageurlsmall field to given value.

### HasProfileimageurlsmall

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) HasProfileimageurlsmall() bool`

HasProfileimageurlsmall returns a boolean if a field has been set.

### GetSentfromcurrentuser

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetSentfromcurrentuser() bool`

GetSentfromcurrentuser returns the Sentfromcurrentuser field if non-nil, zero value otherwise.

### GetSentfromcurrentuserOk

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetSentfromcurrentuserOk() (*bool, bool)`

GetSentfromcurrentuserOk returns a tuple with the Sentfromcurrentuser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSentfromcurrentuser

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) SetSentfromcurrentuser(v bool)`

SetSentfromcurrentuser sets Sentfromcurrentuser field to given value.

### HasSentfromcurrentuser

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) HasSentfromcurrentuser() bool`

HasSentfromcurrentuser returns a boolean if a field has been set.

### GetShowonlinestatus

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetShowonlinestatus() bool`

GetShowonlinestatus returns the Showonlinestatus field if non-nil, zero value otherwise.

### GetShowonlinestatusOk

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetShowonlinestatusOk() (*bool, bool)`

GetShowonlinestatusOk returns a tuple with the Showonlinestatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowonlinestatus

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) SetShowonlinestatus(v bool)`

SetShowonlinestatus sets Showonlinestatus field to given value.

### HasShowonlinestatus

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) HasShowonlinestatus() bool`

HasShowonlinestatus returns a boolean if a field has been set.

### GetUnreadcount

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetUnreadcount() int32`

GetUnreadcount returns the Unreadcount field if non-nil, zero value otherwise.

### GetUnreadcountOk

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetUnreadcountOk() (*int32, bool)`

GetUnreadcountOk returns a tuple with the Unreadcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnreadcount

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) SetUnreadcount(v int32)`

SetUnreadcount sets Unreadcount field to given value.

### HasUnreadcount

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) HasUnreadcount() bool`

HasUnreadcount returns a boolean if a field has been set.

### GetUserid

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


