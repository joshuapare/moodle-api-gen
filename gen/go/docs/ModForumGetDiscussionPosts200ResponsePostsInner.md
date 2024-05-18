# ModForumGetDiscussionPosts200ResponsePostsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attachments** | Pointer to [**[]ModForumGetDiscussionPost200ResponsePostAttachmentsInner**](ModForumGetDiscussionPost200ResponsePostAttachmentsInner.md) |  | [optional] 
**Author** | Pointer to [**ModForumGetDiscussionPost200ResponsePostAuthor**](ModForumGetDiscussionPost200ResponsePostAuthor.md) |  | [optional] 
**Capabilities** | Pointer to [**ModForumGetDiscussionPost200ResponsePostCapabilities**](ModForumGetDiscussionPost200ResponsePostCapabilities.md) |  | [optional] 
**Charcount** | Pointer to **int32** | charcount | [optional] 
**Discussionid** | Pointer to **int32** | discussionid | [optional] 
**Hasparent** | Pointer to **bool** | hasparent | [optional] 
**Haswordcount** | Pointer to **bool** | haswordcount | [optional] 
**Html** | Pointer to [**ModForumGetDiscussionPost200ResponsePostHtml**](ModForumGetDiscussionPost200ResponsePostHtml.md) |  | [optional] 
**Id** | Pointer to **int32** | id | [optional] 
**Isdeleted** | Pointer to **bool** | isdeleted | [optional] 
**Isprivatereply** | Pointer to **bool** | isprivatereply | [optional] 
**Message** | Pointer to **string** | message | [optional] 
**Messageformat** | Pointer to **int32** | message format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Messageinlinefiles** | Pointer to [**[]ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner**](ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner.md) |  | [optional] 
**Parentid** | Pointer to **int32** | parentid | [optional] 
**Replysubject** | Pointer to **string** | replysubject | [optional] 
**Subject** | Pointer to **string** | subject | [optional] 
**Tags** | Pointer to [**[]ModForumGetDiscussionPost200ResponsePostTagsInner**](ModForumGetDiscussionPost200ResponsePostTagsInner.md) |  | [optional] 
**Timecreated** | Pointer to **int32** | timecreated | [optional] 
**Timemodified** | Pointer to **int32** | timemodified | [optional] 
**Unread** | Pointer to **bool** | unread | [optional] 
**Urls** | Pointer to [**ModForumGetDiscussionPost200ResponsePostUrls**](ModForumGetDiscussionPost200ResponsePostUrls.md) |  | [optional] 
**Wordcount** | Pointer to **int32** | wordcount | [optional] 

## Methods

### NewModForumGetDiscussionPosts200ResponsePostsInner

`func NewModForumGetDiscussionPosts200ResponsePostsInner() *ModForumGetDiscussionPosts200ResponsePostsInner`

NewModForumGetDiscussionPosts200ResponsePostsInner instantiates a new ModForumGetDiscussionPosts200ResponsePostsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumGetDiscussionPosts200ResponsePostsInnerWithDefaults

`func NewModForumGetDiscussionPosts200ResponsePostsInnerWithDefaults() *ModForumGetDiscussionPosts200ResponsePostsInner`

NewModForumGetDiscussionPosts200ResponsePostsInnerWithDefaults instantiates a new ModForumGetDiscussionPosts200ResponsePostsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttachments

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetAttachments() []ModForumGetDiscussionPost200ResponsePostAttachmentsInner`

GetAttachments returns the Attachments field if non-nil, zero value otherwise.

### GetAttachmentsOk

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetAttachmentsOk() (*[]ModForumGetDiscussionPost200ResponsePostAttachmentsInner, bool)`

GetAttachmentsOk returns a tuple with the Attachments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachments

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) SetAttachments(v []ModForumGetDiscussionPost200ResponsePostAttachmentsInner)`

SetAttachments sets Attachments field to given value.

### HasAttachments

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) HasAttachments() bool`

HasAttachments returns a boolean if a field has been set.

### GetAuthor

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetAuthor() ModForumGetDiscussionPost200ResponsePostAuthor`

GetAuthor returns the Author field if non-nil, zero value otherwise.

### GetAuthorOk

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetAuthorOk() (*ModForumGetDiscussionPost200ResponsePostAuthor, bool)`

GetAuthorOk returns a tuple with the Author field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthor

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) SetAuthor(v ModForumGetDiscussionPost200ResponsePostAuthor)`

SetAuthor sets Author field to given value.

### HasAuthor

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) HasAuthor() bool`

HasAuthor returns a boolean if a field has been set.

### GetCapabilities

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetCapabilities() ModForumGetDiscussionPost200ResponsePostCapabilities`

GetCapabilities returns the Capabilities field if non-nil, zero value otherwise.

### GetCapabilitiesOk

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetCapabilitiesOk() (*ModForumGetDiscussionPost200ResponsePostCapabilities, bool)`

GetCapabilitiesOk returns a tuple with the Capabilities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCapabilities

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) SetCapabilities(v ModForumGetDiscussionPost200ResponsePostCapabilities)`

SetCapabilities sets Capabilities field to given value.

### HasCapabilities

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) HasCapabilities() bool`

HasCapabilities returns a boolean if a field has been set.

### GetCharcount

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetCharcount() int32`

GetCharcount returns the Charcount field if non-nil, zero value otherwise.

### GetCharcountOk

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetCharcountOk() (*int32, bool)`

GetCharcountOk returns a tuple with the Charcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCharcount

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) SetCharcount(v int32)`

SetCharcount sets Charcount field to given value.

### HasCharcount

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) HasCharcount() bool`

HasCharcount returns a boolean if a field has been set.

### GetDiscussionid

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetDiscussionid() int32`

GetDiscussionid returns the Discussionid field if non-nil, zero value otherwise.

### GetDiscussionidOk

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetDiscussionidOk() (*int32, bool)`

GetDiscussionidOk returns a tuple with the Discussionid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscussionid

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) SetDiscussionid(v int32)`

SetDiscussionid sets Discussionid field to given value.

### HasDiscussionid

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) HasDiscussionid() bool`

HasDiscussionid returns a boolean if a field has been set.

### GetHasparent

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetHasparent() bool`

GetHasparent returns the Hasparent field if non-nil, zero value otherwise.

### GetHasparentOk

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetHasparentOk() (*bool, bool)`

GetHasparentOk returns a tuple with the Hasparent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasparent

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) SetHasparent(v bool)`

SetHasparent sets Hasparent field to given value.

### HasHasparent

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) HasHasparent() bool`

HasHasparent returns a boolean if a field has been set.

### GetHaswordcount

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetHaswordcount() bool`

GetHaswordcount returns the Haswordcount field if non-nil, zero value otherwise.

### GetHaswordcountOk

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetHaswordcountOk() (*bool, bool)`

GetHaswordcountOk returns a tuple with the Haswordcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHaswordcount

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) SetHaswordcount(v bool)`

SetHaswordcount sets Haswordcount field to given value.

### HasHaswordcount

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) HasHaswordcount() bool`

HasHaswordcount returns a boolean if a field has been set.

### GetHtml

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetHtml() ModForumGetDiscussionPost200ResponsePostHtml`

GetHtml returns the Html field if non-nil, zero value otherwise.

### GetHtmlOk

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetHtmlOk() (*ModForumGetDiscussionPost200ResponsePostHtml, bool)`

GetHtmlOk returns a tuple with the Html field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHtml

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) SetHtml(v ModForumGetDiscussionPost200ResponsePostHtml)`

SetHtml sets Html field to given value.

### HasHtml

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) HasHtml() bool`

HasHtml returns a boolean if a field has been set.

### GetId

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIsdeleted

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetIsdeleted() bool`

GetIsdeleted returns the Isdeleted field if non-nil, zero value otherwise.

### GetIsdeletedOk

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetIsdeletedOk() (*bool, bool)`

GetIsdeletedOk returns a tuple with the Isdeleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsdeleted

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) SetIsdeleted(v bool)`

SetIsdeleted sets Isdeleted field to given value.

### HasIsdeleted

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) HasIsdeleted() bool`

HasIsdeleted returns a boolean if a field has been set.

### GetIsprivatereply

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetIsprivatereply() bool`

GetIsprivatereply returns the Isprivatereply field if non-nil, zero value otherwise.

### GetIsprivatereplyOk

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetIsprivatereplyOk() (*bool, bool)`

GetIsprivatereplyOk returns a tuple with the Isprivatereply field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsprivatereply

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) SetIsprivatereply(v bool)`

SetIsprivatereply sets Isprivatereply field to given value.

### HasIsprivatereply

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) HasIsprivatereply() bool`

HasIsprivatereply returns a boolean if a field has been set.

### GetMessage

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### GetMessageformat

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetMessageformat() int32`

GetMessageformat returns the Messageformat field if non-nil, zero value otherwise.

### GetMessageformatOk

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetMessageformatOk() (*int32, bool)`

GetMessageformatOk returns a tuple with the Messageformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageformat

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) SetMessageformat(v int32)`

SetMessageformat sets Messageformat field to given value.

### HasMessageformat

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) HasMessageformat() bool`

HasMessageformat returns a boolean if a field has been set.

### GetMessageinlinefiles

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetMessageinlinefiles() []ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner`

GetMessageinlinefiles returns the Messageinlinefiles field if non-nil, zero value otherwise.

### GetMessageinlinefilesOk

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetMessageinlinefilesOk() (*[]ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner, bool)`

GetMessageinlinefilesOk returns a tuple with the Messageinlinefiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageinlinefiles

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) SetMessageinlinefiles(v []ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner)`

SetMessageinlinefiles sets Messageinlinefiles field to given value.

### HasMessageinlinefiles

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) HasMessageinlinefiles() bool`

HasMessageinlinefiles returns a boolean if a field has been set.

### GetParentid

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetParentid() int32`

GetParentid returns the Parentid field if non-nil, zero value otherwise.

### GetParentidOk

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetParentidOk() (*int32, bool)`

GetParentidOk returns a tuple with the Parentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentid

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) SetParentid(v int32)`

SetParentid sets Parentid field to given value.

### HasParentid

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) HasParentid() bool`

HasParentid returns a boolean if a field has been set.

### GetReplysubject

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetReplysubject() string`

GetReplysubject returns the Replysubject field if non-nil, zero value otherwise.

### GetReplysubjectOk

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetReplysubjectOk() (*string, bool)`

GetReplysubjectOk returns a tuple with the Replysubject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReplysubject

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) SetReplysubject(v string)`

SetReplysubject sets Replysubject field to given value.

### HasReplysubject

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) HasReplysubject() bool`

HasReplysubject returns a boolean if a field has been set.

### GetSubject

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetSubject() string`

GetSubject returns the Subject field if non-nil, zero value otherwise.

### GetSubjectOk

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetSubjectOk() (*string, bool)`

GetSubjectOk returns a tuple with the Subject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubject

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) SetSubject(v string)`

SetSubject sets Subject field to given value.

### HasSubject

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) HasSubject() bool`

HasSubject returns a boolean if a field has been set.

### GetTags

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetTags() []ModForumGetDiscussionPost200ResponsePostTagsInner`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetTagsOk() (*[]ModForumGetDiscussionPost200ResponsePostTagsInner, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) SetTags(v []ModForumGetDiscussionPost200ResponsePostTagsInner)`

SetTags sets Tags field to given value.

### HasTags

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) HasTags() bool`

HasTags returns a boolean if a field has been set.

### GetTimecreated

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetUnread

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetUnread() bool`

GetUnread returns the Unread field if non-nil, zero value otherwise.

### GetUnreadOk

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetUnreadOk() (*bool, bool)`

GetUnreadOk returns a tuple with the Unread field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnread

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) SetUnread(v bool)`

SetUnread sets Unread field to given value.

### HasUnread

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) HasUnread() bool`

HasUnread returns a boolean if a field has been set.

### GetUrls

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetUrls() ModForumGetDiscussionPost200ResponsePostUrls`

GetUrls returns the Urls field if non-nil, zero value otherwise.

### GetUrlsOk

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetUrlsOk() (*ModForumGetDiscussionPost200ResponsePostUrls, bool)`

GetUrlsOk returns a tuple with the Urls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrls

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) SetUrls(v ModForumGetDiscussionPost200ResponsePostUrls)`

SetUrls sets Urls field to given value.

### HasUrls

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) HasUrls() bool`

HasUrls returns a boolean if a field has been set.

### GetWordcount

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetWordcount() int32`

GetWordcount returns the Wordcount field if non-nil, zero value otherwise.

### GetWordcountOk

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) GetWordcountOk() (*int32, bool)`

GetWordcountOk returns a tuple with the Wordcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWordcount

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) SetWordcount(v int32)`

SetWordcount sets Wordcount field to given value.

### HasWordcount

`func (o *ModForumGetDiscussionPosts200ResponsePostsInner) HasWordcount() bool`

HasWordcount returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


