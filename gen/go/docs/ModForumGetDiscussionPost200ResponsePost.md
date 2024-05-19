# ModForumGetDiscussionPost200ResponsePost

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attachments** | [**[]ModForumGetDiscussionPost200ResponsePostAttachmentsInner**](ModForumGetDiscussionPost200ResponsePostAttachmentsInner.md) |  | 
**Author** | [**ModForumGetDiscussionPost200ResponsePostAuthor**](ModForumGetDiscussionPost200ResponsePostAuthor.md) |  | 
**Capabilities** | [**ModForumGetDiscussionPost200ResponsePostCapabilities**](ModForumGetDiscussionPost200ResponsePostCapabilities.md) |  | 
**Charcount** | Pointer to **int32** | charcount | [optional] 
**Discussionid** | **int32** | discussionid | 
**Hasparent** | **bool** | hasparent | 
**Haswordcount** | **bool** | haswordcount | 
**Html** | Pointer to [**ModForumGetDiscussionPost200ResponsePostHtml**](ModForumGetDiscussionPost200ResponsePostHtml.md) |  | [optional] 
**Id** | **int32** | id | 
**Isdeleted** | **bool** | isdeleted | 
**Isprivatereply** | **bool** | isprivatereply | 
**Message** | **string** | message | 
**Messageformat** | **int32** | message format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | 
**Messageinlinefiles** | Pointer to [**[]ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner**](ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner.md) |  | [optional] 
**Parentid** | Pointer to **int32** | parentid | [optional] 
**Replysubject** | **string** | replysubject | 
**Subject** | **string** | subject | 
**Tags** | Pointer to [**[]ModForumGetDiscussionPost200ResponsePostTagsInner**](ModForumGetDiscussionPost200ResponsePostTagsInner.md) |  | [optional] 
**Timecreated** | **int32** | timecreated | 
**Timemodified** | **int32** | timemodified | 
**Unread** | Pointer to **bool** | unread | [optional] 
**Urls** | Pointer to [**ModForumGetDiscussionPost200ResponsePostUrls**](ModForumGetDiscussionPost200ResponsePostUrls.md) |  | [optional] 
**Wordcount** | Pointer to **int32** | wordcount | [optional] 

## Methods

### NewModForumGetDiscussionPost200ResponsePost

`func NewModForumGetDiscussionPost200ResponsePost(attachments []ModForumGetDiscussionPost200ResponsePostAttachmentsInner, author ModForumGetDiscussionPost200ResponsePostAuthor, capabilities ModForumGetDiscussionPost200ResponsePostCapabilities, discussionid int32, hasparent bool, haswordcount bool, id int32, isdeleted bool, isprivatereply bool, message string, messageformat int32, replysubject string, subject string, timecreated int32, timemodified int32, ) *ModForumGetDiscussionPost200ResponsePost`

NewModForumGetDiscussionPost200ResponsePost instantiates a new ModForumGetDiscussionPost200ResponsePost object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumGetDiscussionPost200ResponsePostWithDefaults

`func NewModForumGetDiscussionPost200ResponsePostWithDefaults() *ModForumGetDiscussionPost200ResponsePost`

NewModForumGetDiscussionPost200ResponsePostWithDefaults instantiates a new ModForumGetDiscussionPost200ResponsePost object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttachments

`func (o *ModForumGetDiscussionPost200ResponsePost) GetAttachments() []ModForumGetDiscussionPost200ResponsePostAttachmentsInner`

GetAttachments returns the Attachments field if non-nil, zero value otherwise.

### GetAttachmentsOk

`func (o *ModForumGetDiscussionPost200ResponsePost) GetAttachmentsOk() (*[]ModForumGetDiscussionPost200ResponsePostAttachmentsInner, bool)`

GetAttachmentsOk returns a tuple with the Attachments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachments

`func (o *ModForumGetDiscussionPost200ResponsePost) SetAttachments(v []ModForumGetDiscussionPost200ResponsePostAttachmentsInner)`

SetAttachments sets Attachments field to given value.


### GetAuthor

`func (o *ModForumGetDiscussionPost200ResponsePost) GetAuthor() ModForumGetDiscussionPost200ResponsePostAuthor`

GetAuthor returns the Author field if non-nil, zero value otherwise.

### GetAuthorOk

`func (o *ModForumGetDiscussionPost200ResponsePost) GetAuthorOk() (*ModForumGetDiscussionPost200ResponsePostAuthor, bool)`

GetAuthorOk returns a tuple with the Author field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthor

`func (o *ModForumGetDiscussionPost200ResponsePost) SetAuthor(v ModForumGetDiscussionPost200ResponsePostAuthor)`

SetAuthor sets Author field to given value.


### GetCapabilities

`func (o *ModForumGetDiscussionPost200ResponsePost) GetCapabilities() ModForumGetDiscussionPost200ResponsePostCapabilities`

GetCapabilities returns the Capabilities field if non-nil, zero value otherwise.

### GetCapabilitiesOk

`func (o *ModForumGetDiscussionPost200ResponsePost) GetCapabilitiesOk() (*ModForumGetDiscussionPost200ResponsePostCapabilities, bool)`

GetCapabilitiesOk returns a tuple with the Capabilities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCapabilities

`func (o *ModForumGetDiscussionPost200ResponsePost) SetCapabilities(v ModForumGetDiscussionPost200ResponsePostCapabilities)`

SetCapabilities sets Capabilities field to given value.


### GetCharcount

`func (o *ModForumGetDiscussionPost200ResponsePost) GetCharcount() int32`

GetCharcount returns the Charcount field if non-nil, zero value otherwise.

### GetCharcountOk

`func (o *ModForumGetDiscussionPost200ResponsePost) GetCharcountOk() (*int32, bool)`

GetCharcountOk returns a tuple with the Charcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCharcount

`func (o *ModForumGetDiscussionPost200ResponsePost) SetCharcount(v int32)`

SetCharcount sets Charcount field to given value.

### HasCharcount

`func (o *ModForumGetDiscussionPost200ResponsePost) HasCharcount() bool`

HasCharcount returns a boolean if a field has been set.

### GetDiscussionid

`func (o *ModForumGetDiscussionPost200ResponsePost) GetDiscussionid() int32`

GetDiscussionid returns the Discussionid field if non-nil, zero value otherwise.

### GetDiscussionidOk

`func (o *ModForumGetDiscussionPost200ResponsePost) GetDiscussionidOk() (*int32, bool)`

GetDiscussionidOk returns a tuple with the Discussionid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscussionid

`func (o *ModForumGetDiscussionPost200ResponsePost) SetDiscussionid(v int32)`

SetDiscussionid sets Discussionid field to given value.


### GetHasparent

`func (o *ModForumGetDiscussionPost200ResponsePost) GetHasparent() bool`

GetHasparent returns the Hasparent field if non-nil, zero value otherwise.

### GetHasparentOk

`func (o *ModForumGetDiscussionPost200ResponsePost) GetHasparentOk() (*bool, bool)`

GetHasparentOk returns a tuple with the Hasparent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasparent

`func (o *ModForumGetDiscussionPost200ResponsePost) SetHasparent(v bool)`

SetHasparent sets Hasparent field to given value.


### GetHaswordcount

`func (o *ModForumGetDiscussionPost200ResponsePost) GetHaswordcount() bool`

GetHaswordcount returns the Haswordcount field if non-nil, zero value otherwise.

### GetHaswordcountOk

`func (o *ModForumGetDiscussionPost200ResponsePost) GetHaswordcountOk() (*bool, bool)`

GetHaswordcountOk returns a tuple with the Haswordcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHaswordcount

`func (o *ModForumGetDiscussionPost200ResponsePost) SetHaswordcount(v bool)`

SetHaswordcount sets Haswordcount field to given value.


### GetHtml

`func (o *ModForumGetDiscussionPost200ResponsePost) GetHtml() ModForumGetDiscussionPost200ResponsePostHtml`

GetHtml returns the Html field if non-nil, zero value otherwise.

### GetHtmlOk

`func (o *ModForumGetDiscussionPost200ResponsePost) GetHtmlOk() (*ModForumGetDiscussionPost200ResponsePostHtml, bool)`

GetHtmlOk returns a tuple with the Html field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHtml

`func (o *ModForumGetDiscussionPost200ResponsePost) SetHtml(v ModForumGetDiscussionPost200ResponsePostHtml)`

SetHtml sets Html field to given value.

### HasHtml

`func (o *ModForumGetDiscussionPost200ResponsePost) HasHtml() bool`

HasHtml returns a boolean if a field has been set.

### GetId

`func (o *ModForumGetDiscussionPost200ResponsePost) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModForumGetDiscussionPost200ResponsePost) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModForumGetDiscussionPost200ResponsePost) SetId(v int32)`

SetId sets Id field to given value.


### GetIsdeleted

`func (o *ModForumGetDiscussionPost200ResponsePost) GetIsdeleted() bool`

GetIsdeleted returns the Isdeleted field if non-nil, zero value otherwise.

### GetIsdeletedOk

`func (o *ModForumGetDiscussionPost200ResponsePost) GetIsdeletedOk() (*bool, bool)`

GetIsdeletedOk returns a tuple with the Isdeleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsdeleted

`func (o *ModForumGetDiscussionPost200ResponsePost) SetIsdeleted(v bool)`

SetIsdeleted sets Isdeleted field to given value.


### GetIsprivatereply

`func (o *ModForumGetDiscussionPost200ResponsePost) GetIsprivatereply() bool`

GetIsprivatereply returns the Isprivatereply field if non-nil, zero value otherwise.

### GetIsprivatereplyOk

`func (o *ModForumGetDiscussionPost200ResponsePost) GetIsprivatereplyOk() (*bool, bool)`

GetIsprivatereplyOk returns a tuple with the Isprivatereply field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsprivatereply

`func (o *ModForumGetDiscussionPost200ResponsePost) SetIsprivatereply(v bool)`

SetIsprivatereply sets Isprivatereply field to given value.


### GetMessage

`func (o *ModForumGetDiscussionPost200ResponsePost) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *ModForumGetDiscussionPost200ResponsePost) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *ModForumGetDiscussionPost200ResponsePost) SetMessage(v string)`

SetMessage sets Message field to given value.


### GetMessageformat

`func (o *ModForumGetDiscussionPost200ResponsePost) GetMessageformat() int32`

GetMessageformat returns the Messageformat field if non-nil, zero value otherwise.

### GetMessageformatOk

`func (o *ModForumGetDiscussionPost200ResponsePost) GetMessageformatOk() (*int32, bool)`

GetMessageformatOk returns a tuple with the Messageformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageformat

`func (o *ModForumGetDiscussionPost200ResponsePost) SetMessageformat(v int32)`

SetMessageformat sets Messageformat field to given value.


### GetMessageinlinefiles

`func (o *ModForumGetDiscussionPost200ResponsePost) GetMessageinlinefiles() []ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner`

GetMessageinlinefiles returns the Messageinlinefiles field if non-nil, zero value otherwise.

### GetMessageinlinefilesOk

`func (o *ModForumGetDiscussionPost200ResponsePost) GetMessageinlinefilesOk() (*[]ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner, bool)`

GetMessageinlinefilesOk returns a tuple with the Messageinlinefiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageinlinefiles

`func (o *ModForumGetDiscussionPost200ResponsePost) SetMessageinlinefiles(v []ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner)`

SetMessageinlinefiles sets Messageinlinefiles field to given value.

### HasMessageinlinefiles

`func (o *ModForumGetDiscussionPost200ResponsePost) HasMessageinlinefiles() bool`

HasMessageinlinefiles returns a boolean if a field has been set.

### GetParentid

`func (o *ModForumGetDiscussionPost200ResponsePost) GetParentid() int32`

GetParentid returns the Parentid field if non-nil, zero value otherwise.

### GetParentidOk

`func (o *ModForumGetDiscussionPost200ResponsePost) GetParentidOk() (*int32, bool)`

GetParentidOk returns a tuple with the Parentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentid

`func (o *ModForumGetDiscussionPost200ResponsePost) SetParentid(v int32)`

SetParentid sets Parentid field to given value.

### HasParentid

`func (o *ModForumGetDiscussionPost200ResponsePost) HasParentid() bool`

HasParentid returns a boolean if a field has been set.

### GetReplysubject

`func (o *ModForumGetDiscussionPost200ResponsePost) GetReplysubject() string`

GetReplysubject returns the Replysubject field if non-nil, zero value otherwise.

### GetReplysubjectOk

`func (o *ModForumGetDiscussionPost200ResponsePost) GetReplysubjectOk() (*string, bool)`

GetReplysubjectOk returns a tuple with the Replysubject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReplysubject

`func (o *ModForumGetDiscussionPost200ResponsePost) SetReplysubject(v string)`

SetReplysubject sets Replysubject field to given value.


### GetSubject

`func (o *ModForumGetDiscussionPost200ResponsePost) GetSubject() string`

GetSubject returns the Subject field if non-nil, zero value otherwise.

### GetSubjectOk

`func (o *ModForumGetDiscussionPost200ResponsePost) GetSubjectOk() (*string, bool)`

GetSubjectOk returns a tuple with the Subject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubject

`func (o *ModForumGetDiscussionPost200ResponsePost) SetSubject(v string)`

SetSubject sets Subject field to given value.


### GetTags

`func (o *ModForumGetDiscussionPost200ResponsePost) GetTags() []ModForumGetDiscussionPost200ResponsePostTagsInner`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *ModForumGetDiscussionPost200ResponsePost) GetTagsOk() (*[]ModForumGetDiscussionPost200ResponsePostTagsInner, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *ModForumGetDiscussionPost200ResponsePost) SetTags(v []ModForumGetDiscussionPost200ResponsePostTagsInner)`

SetTags sets Tags field to given value.

### HasTags

`func (o *ModForumGetDiscussionPost200ResponsePost) HasTags() bool`

HasTags returns a boolean if a field has been set.

### GetTimecreated

`func (o *ModForumGetDiscussionPost200ResponsePost) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModForumGetDiscussionPost200ResponsePost) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModForumGetDiscussionPost200ResponsePost) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.


### GetTimemodified

`func (o *ModForumGetDiscussionPost200ResponsePost) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModForumGetDiscussionPost200ResponsePost) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModForumGetDiscussionPost200ResponsePost) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.


### GetUnread

`func (o *ModForumGetDiscussionPost200ResponsePost) GetUnread() bool`

GetUnread returns the Unread field if non-nil, zero value otherwise.

### GetUnreadOk

`func (o *ModForumGetDiscussionPost200ResponsePost) GetUnreadOk() (*bool, bool)`

GetUnreadOk returns a tuple with the Unread field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnread

`func (o *ModForumGetDiscussionPost200ResponsePost) SetUnread(v bool)`

SetUnread sets Unread field to given value.

### HasUnread

`func (o *ModForumGetDiscussionPost200ResponsePost) HasUnread() bool`

HasUnread returns a boolean if a field has been set.

### GetUrls

`func (o *ModForumGetDiscussionPost200ResponsePost) GetUrls() ModForumGetDiscussionPost200ResponsePostUrls`

GetUrls returns the Urls field if non-nil, zero value otherwise.

### GetUrlsOk

`func (o *ModForumGetDiscussionPost200ResponsePost) GetUrlsOk() (*ModForumGetDiscussionPost200ResponsePostUrls, bool)`

GetUrlsOk returns a tuple with the Urls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrls

`func (o *ModForumGetDiscussionPost200ResponsePost) SetUrls(v ModForumGetDiscussionPost200ResponsePostUrls)`

SetUrls sets Urls field to given value.

### HasUrls

`func (o *ModForumGetDiscussionPost200ResponsePost) HasUrls() bool`

HasUrls returns a boolean if a field has been set.

### GetWordcount

`func (o *ModForumGetDiscussionPost200ResponsePost) GetWordcount() int32`

GetWordcount returns the Wordcount field if non-nil, zero value otherwise.

### GetWordcountOk

`func (o *ModForumGetDiscussionPost200ResponsePost) GetWordcountOk() (*int32, bool)`

GetWordcountOk returns a tuple with the Wordcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWordcount

`func (o *ModForumGetDiscussionPost200ResponsePost) SetWordcount(v int32)`

SetWordcount sets Wordcount field to given value.

### HasWordcount

`func (o *ModForumGetDiscussionPost200ResponsePost) HasWordcount() bool`

HasWordcount returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


