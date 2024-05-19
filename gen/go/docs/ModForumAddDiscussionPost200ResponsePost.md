# ModForumAddDiscussionPost200ResponsePost

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attachments** | [**[]ModForumAddDiscussionPost200ResponsePostAttachmentsInner**](ModForumAddDiscussionPost200ResponsePostAttachmentsInner.md) |  | 
**Author** | [**ModForumAddDiscussionPost200ResponsePostAuthor**](ModForumAddDiscussionPost200ResponsePostAuthor.md) |  | 
**Capabilities** | [**ModForumAddDiscussionPost200ResponsePostCapabilities**](ModForumAddDiscussionPost200ResponsePostCapabilities.md) |  | 
**Charcount** | Pointer to **int32** | charcount | [optional] [default to null]
**Discussionid** | **int32** | discussionid | [default to null]
**Hasparent** | **bool** | hasparent | [default to null]
**Haswordcount** | **bool** | haswordcount | [default to null]
**Html** | Pointer to [**ModForumAddDiscussionPost200ResponsePostHtml**](ModForumAddDiscussionPost200ResponsePostHtml.md) |  | [optional] 
**Id** | **int32** | id | 
**Isdeleted** | **bool** | isdeleted | [default to null]
**Isprivatereply** | **bool** | isprivatereply | [default to null]
**Message** | **string** | message | [default to "null"]
**Messageformat** | **int32** | message format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [default to null]
**Messageinlinefiles** | Pointer to [**[]ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner**](ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner.md) |  | [optional] 
**Parentid** | Pointer to **int32** | parentid | [optional] [default to null]
**Replysubject** | **string** | replysubject | [default to "null"]
**Subject** | **string** | subject | [default to "null"]
**Tags** | Pointer to [**[]ModForumAddDiscussionPost200ResponsePostTagsInner**](ModForumAddDiscussionPost200ResponsePostTagsInner.md) |  | [optional] 
**Timecreated** | **int32** | timecreated | [default to null]
**Timemodified** | **int32** | timemodified | [default to null]
**Unread** | Pointer to **bool** | unread | [optional] [default to null]
**Urls** | Pointer to [**ModForumAddDiscussionPost200ResponsePostUrls**](ModForumAddDiscussionPost200ResponsePostUrls.md) |  | [optional] 
**Wordcount** | Pointer to **int32** | wordcount | [optional] [default to null]

## Methods

### NewModForumAddDiscussionPost200ResponsePost

`func NewModForumAddDiscussionPost200ResponsePost(attachments []ModForumAddDiscussionPost200ResponsePostAttachmentsInner, author ModForumAddDiscussionPost200ResponsePostAuthor, capabilities ModForumAddDiscussionPost200ResponsePostCapabilities, discussionid int32, hasparent bool, haswordcount bool, id int32, isdeleted bool, isprivatereply bool, message string, messageformat int32, replysubject string, subject string, timecreated int32, timemodified int32, ) *ModForumAddDiscussionPost200ResponsePost`

NewModForumAddDiscussionPost200ResponsePost instantiates a new ModForumAddDiscussionPost200ResponsePost object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumAddDiscussionPost200ResponsePostWithDefaults

`func NewModForumAddDiscussionPost200ResponsePostWithDefaults() *ModForumAddDiscussionPost200ResponsePost`

NewModForumAddDiscussionPost200ResponsePostWithDefaults instantiates a new ModForumAddDiscussionPost200ResponsePost object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttachments

`func (o *ModForumAddDiscussionPost200ResponsePost) GetAttachments() []ModForumAddDiscussionPost200ResponsePostAttachmentsInner`

GetAttachments returns the Attachments field if non-nil, zero value otherwise.

### GetAttachmentsOk

`func (o *ModForumAddDiscussionPost200ResponsePost) GetAttachmentsOk() (*[]ModForumAddDiscussionPost200ResponsePostAttachmentsInner, bool)`

GetAttachmentsOk returns a tuple with the Attachments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachments

`func (o *ModForumAddDiscussionPost200ResponsePost) SetAttachments(v []ModForumAddDiscussionPost200ResponsePostAttachmentsInner)`

SetAttachments sets Attachments field to given value.


### GetAuthor

`func (o *ModForumAddDiscussionPost200ResponsePost) GetAuthor() ModForumAddDiscussionPost200ResponsePostAuthor`

GetAuthor returns the Author field if non-nil, zero value otherwise.

### GetAuthorOk

`func (o *ModForumAddDiscussionPost200ResponsePost) GetAuthorOk() (*ModForumAddDiscussionPost200ResponsePostAuthor, bool)`

GetAuthorOk returns a tuple with the Author field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthor

`func (o *ModForumAddDiscussionPost200ResponsePost) SetAuthor(v ModForumAddDiscussionPost200ResponsePostAuthor)`

SetAuthor sets Author field to given value.


### GetCapabilities

`func (o *ModForumAddDiscussionPost200ResponsePost) GetCapabilities() ModForumAddDiscussionPost200ResponsePostCapabilities`

GetCapabilities returns the Capabilities field if non-nil, zero value otherwise.

### GetCapabilitiesOk

`func (o *ModForumAddDiscussionPost200ResponsePost) GetCapabilitiesOk() (*ModForumAddDiscussionPost200ResponsePostCapabilities, bool)`

GetCapabilitiesOk returns a tuple with the Capabilities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCapabilities

`func (o *ModForumAddDiscussionPost200ResponsePost) SetCapabilities(v ModForumAddDiscussionPost200ResponsePostCapabilities)`

SetCapabilities sets Capabilities field to given value.


### GetCharcount

`func (o *ModForumAddDiscussionPost200ResponsePost) GetCharcount() int32`

GetCharcount returns the Charcount field if non-nil, zero value otherwise.

### GetCharcountOk

`func (o *ModForumAddDiscussionPost200ResponsePost) GetCharcountOk() (*int32, bool)`

GetCharcountOk returns a tuple with the Charcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCharcount

`func (o *ModForumAddDiscussionPost200ResponsePost) SetCharcount(v int32)`

SetCharcount sets Charcount field to given value.

### HasCharcount

`func (o *ModForumAddDiscussionPost200ResponsePost) HasCharcount() bool`

HasCharcount returns a boolean if a field has been set.

### GetDiscussionid

`func (o *ModForumAddDiscussionPost200ResponsePost) GetDiscussionid() int32`

GetDiscussionid returns the Discussionid field if non-nil, zero value otherwise.

### GetDiscussionidOk

`func (o *ModForumAddDiscussionPost200ResponsePost) GetDiscussionidOk() (*int32, bool)`

GetDiscussionidOk returns a tuple with the Discussionid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscussionid

`func (o *ModForumAddDiscussionPost200ResponsePost) SetDiscussionid(v int32)`

SetDiscussionid sets Discussionid field to given value.


### GetHasparent

`func (o *ModForumAddDiscussionPost200ResponsePost) GetHasparent() bool`

GetHasparent returns the Hasparent field if non-nil, zero value otherwise.

### GetHasparentOk

`func (o *ModForumAddDiscussionPost200ResponsePost) GetHasparentOk() (*bool, bool)`

GetHasparentOk returns a tuple with the Hasparent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasparent

`func (o *ModForumAddDiscussionPost200ResponsePost) SetHasparent(v bool)`

SetHasparent sets Hasparent field to given value.


### GetHaswordcount

`func (o *ModForumAddDiscussionPost200ResponsePost) GetHaswordcount() bool`

GetHaswordcount returns the Haswordcount field if non-nil, zero value otherwise.

### GetHaswordcountOk

`func (o *ModForumAddDiscussionPost200ResponsePost) GetHaswordcountOk() (*bool, bool)`

GetHaswordcountOk returns a tuple with the Haswordcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHaswordcount

`func (o *ModForumAddDiscussionPost200ResponsePost) SetHaswordcount(v bool)`

SetHaswordcount sets Haswordcount field to given value.


### GetHtml

`func (o *ModForumAddDiscussionPost200ResponsePost) GetHtml() ModForumAddDiscussionPost200ResponsePostHtml`

GetHtml returns the Html field if non-nil, zero value otherwise.

### GetHtmlOk

`func (o *ModForumAddDiscussionPost200ResponsePost) GetHtmlOk() (*ModForumAddDiscussionPost200ResponsePostHtml, bool)`

GetHtmlOk returns a tuple with the Html field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHtml

`func (o *ModForumAddDiscussionPost200ResponsePost) SetHtml(v ModForumAddDiscussionPost200ResponsePostHtml)`

SetHtml sets Html field to given value.

### HasHtml

`func (o *ModForumAddDiscussionPost200ResponsePost) HasHtml() bool`

HasHtml returns a boolean if a field has been set.

### GetId

`func (o *ModForumAddDiscussionPost200ResponsePost) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModForumAddDiscussionPost200ResponsePost) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModForumAddDiscussionPost200ResponsePost) SetId(v int32)`

SetId sets Id field to given value.


### GetIsdeleted

`func (o *ModForumAddDiscussionPost200ResponsePost) GetIsdeleted() bool`

GetIsdeleted returns the Isdeleted field if non-nil, zero value otherwise.

### GetIsdeletedOk

`func (o *ModForumAddDiscussionPost200ResponsePost) GetIsdeletedOk() (*bool, bool)`

GetIsdeletedOk returns a tuple with the Isdeleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsdeleted

`func (o *ModForumAddDiscussionPost200ResponsePost) SetIsdeleted(v bool)`

SetIsdeleted sets Isdeleted field to given value.


### GetIsprivatereply

`func (o *ModForumAddDiscussionPost200ResponsePost) GetIsprivatereply() bool`

GetIsprivatereply returns the Isprivatereply field if non-nil, zero value otherwise.

### GetIsprivatereplyOk

`func (o *ModForumAddDiscussionPost200ResponsePost) GetIsprivatereplyOk() (*bool, bool)`

GetIsprivatereplyOk returns a tuple with the Isprivatereply field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsprivatereply

`func (o *ModForumAddDiscussionPost200ResponsePost) SetIsprivatereply(v bool)`

SetIsprivatereply sets Isprivatereply field to given value.


### GetMessage

`func (o *ModForumAddDiscussionPost200ResponsePost) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *ModForumAddDiscussionPost200ResponsePost) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *ModForumAddDiscussionPost200ResponsePost) SetMessage(v string)`

SetMessage sets Message field to given value.


### GetMessageformat

`func (o *ModForumAddDiscussionPost200ResponsePost) GetMessageformat() int32`

GetMessageformat returns the Messageformat field if non-nil, zero value otherwise.

### GetMessageformatOk

`func (o *ModForumAddDiscussionPost200ResponsePost) GetMessageformatOk() (*int32, bool)`

GetMessageformatOk returns a tuple with the Messageformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageformat

`func (o *ModForumAddDiscussionPost200ResponsePost) SetMessageformat(v int32)`

SetMessageformat sets Messageformat field to given value.


### GetMessageinlinefiles

`func (o *ModForumAddDiscussionPost200ResponsePost) GetMessageinlinefiles() []ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner`

GetMessageinlinefiles returns the Messageinlinefiles field if non-nil, zero value otherwise.

### GetMessageinlinefilesOk

`func (o *ModForumAddDiscussionPost200ResponsePost) GetMessageinlinefilesOk() (*[]ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner, bool)`

GetMessageinlinefilesOk returns a tuple with the Messageinlinefiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageinlinefiles

`func (o *ModForumAddDiscussionPost200ResponsePost) SetMessageinlinefiles(v []ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner)`

SetMessageinlinefiles sets Messageinlinefiles field to given value.

### HasMessageinlinefiles

`func (o *ModForumAddDiscussionPost200ResponsePost) HasMessageinlinefiles() bool`

HasMessageinlinefiles returns a boolean if a field has been set.

### GetParentid

`func (o *ModForumAddDiscussionPost200ResponsePost) GetParentid() int32`

GetParentid returns the Parentid field if non-nil, zero value otherwise.

### GetParentidOk

`func (o *ModForumAddDiscussionPost200ResponsePost) GetParentidOk() (*int32, bool)`

GetParentidOk returns a tuple with the Parentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentid

`func (o *ModForumAddDiscussionPost200ResponsePost) SetParentid(v int32)`

SetParentid sets Parentid field to given value.

### HasParentid

`func (o *ModForumAddDiscussionPost200ResponsePost) HasParentid() bool`

HasParentid returns a boolean if a field has been set.

### GetReplysubject

`func (o *ModForumAddDiscussionPost200ResponsePost) GetReplysubject() string`

GetReplysubject returns the Replysubject field if non-nil, zero value otherwise.

### GetReplysubjectOk

`func (o *ModForumAddDiscussionPost200ResponsePost) GetReplysubjectOk() (*string, bool)`

GetReplysubjectOk returns a tuple with the Replysubject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReplysubject

`func (o *ModForumAddDiscussionPost200ResponsePost) SetReplysubject(v string)`

SetReplysubject sets Replysubject field to given value.


### GetSubject

`func (o *ModForumAddDiscussionPost200ResponsePost) GetSubject() string`

GetSubject returns the Subject field if non-nil, zero value otherwise.

### GetSubjectOk

`func (o *ModForumAddDiscussionPost200ResponsePost) GetSubjectOk() (*string, bool)`

GetSubjectOk returns a tuple with the Subject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubject

`func (o *ModForumAddDiscussionPost200ResponsePost) SetSubject(v string)`

SetSubject sets Subject field to given value.


### GetTags

`func (o *ModForumAddDiscussionPost200ResponsePost) GetTags() []ModForumAddDiscussionPost200ResponsePostTagsInner`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *ModForumAddDiscussionPost200ResponsePost) GetTagsOk() (*[]ModForumAddDiscussionPost200ResponsePostTagsInner, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *ModForumAddDiscussionPost200ResponsePost) SetTags(v []ModForumAddDiscussionPost200ResponsePostTagsInner)`

SetTags sets Tags field to given value.

### HasTags

`func (o *ModForumAddDiscussionPost200ResponsePost) HasTags() bool`

HasTags returns a boolean if a field has been set.

### GetTimecreated

`func (o *ModForumAddDiscussionPost200ResponsePost) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModForumAddDiscussionPost200ResponsePost) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModForumAddDiscussionPost200ResponsePost) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.


### GetTimemodified

`func (o *ModForumAddDiscussionPost200ResponsePost) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModForumAddDiscussionPost200ResponsePost) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModForumAddDiscussionPost200ResponsePost) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.


### GetUnread

`func (o *ModForumAddDiscussionPost200ResponsePost) GetUnread() bool`

GetUnread returns the Unread field if non-nil, zero value otherwise.

### GetUnreadOk

`func (o *ModForumAddDiscussionPost200ResponsePost) GetUnreadOk() (*bool, bool)`

GetUnreadOk returns a tuple with the Unread field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnread

`func (o *ModForumAddDiscussionPost200ResponsePost) SetUnread(v bool)`

SetUnread sets Unread field to given value.

### HasUnread

`func (o *ModForumAddDiscussionPost200ResponsePost) HasUnread() bool`

HasUnread returns a boolean if a field has been set.

### GetUrls

`func (o *ModForumAddDiscussionPost200ResponsePost) GetUrls() ModForumAddDiscussionPost200ResponsePostUrls`

GetUrls returns the Urls field if non-nil, zero value otherwise.

### GetUrlsOk

`func (o *ModForumAddDiscussionPost200ResponsePost) GetUrlsOk() (*ModForumAddDiscussionPost200ResponsePostUrls, bool)`

GetUrlsOk returns a tuple with the Urls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrls

`func (o *ModForumAddDiscussionPost200ResponsePost) SetUrls(v ModForumAddDiscussionPost200ResponsePostUrls)`

SetUrls sets Urls field to given value.

### HasUrls

`func (o *ModForumAddDiscussionPost200ResponsePost) HasUrls() bool`

HasUrls returns a boolean if a field has been set.

### GetWordcount

`func (o *ModForumAddDiscussionPost200ResponsePost) GetWordcount() int32`

GetWordcount returns the Wordcount field if non-nil, zero value otherwise.

### GetWordcountOk

`func (o *ModForumAddDiscussionPost200ResponsePost) GetWordcountOk() (*int32, bool)`

GetWordcountOk returns a tuple with the Wordcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWordcount

`func (o *ModForumAddDiscussionPost200ResponsePost) SetWordcount(v int32)`

SetWordcount sets Wordcount field to given value.

### HasWordcount

`func (o *ModForumAddDiscussionPost200ResponsePost) HasWordcount() bool`

HasWordcount returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


