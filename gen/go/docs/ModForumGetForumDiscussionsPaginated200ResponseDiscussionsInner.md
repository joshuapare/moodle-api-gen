# ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attachment** | Pointer to **string** | Has attachments? | [optional] 
**Attachments** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Canlock** | Pointer to **bool** | Can the user lock the discussion | [optional] 
**Canreply** | Pointer to **bool** | Can the user reply to the discussion | [optional] 
**Created** | Pointer to **int32** | Creation time | [optional] 
**Discussion** | Pointer to **int32** | Discussion id | [optional] 
**Groupid** | Pointer to **int32** | Group id | [optional] 
**Id** | Pointer to **int32** | Post id | [optional] 
**Locked** | Pointer to **bool** | Is the discussion locked | [optional] 
**Mailed** | Pointer to **int32** | Mailed? | [optional] 
**Mailnow** | Pointer to **int32** | Mail now? | [optional] 
**Message** | Pointer to **string** | The post message | [optional] 
**Messageformat** | Pointer to **int32** | message format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Messageinlinefiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Messagetrust** | Pointer to **int32** | Can we trust? | [optional] 
**Modified** | Pointer to **int32** | Time modified | [optional] 
**Name** | Pointer to **string** | Discussion name | [optional] 
**Numreplies** | Pointer to **int32** | The number of replies in the discussion | [optional] 
**Numunread** | Pointer to **int32** | The number of unread discussions. | [optional] 
**Parent** | Pointer to **int32** | Parent id | [optional] 
**Pinned** | Pointer to **bool** | Is the discussion pinned | [optional] 
**Subject** | Pointer to **string** | The post subject | [optional] 
**Timeend** | Pointer to **int32** | Time discussion ends | [optional] 
**Timemodified** | Pointer to **int32** | Time modified | [optional] 
**Timestart** | Pointer to **int32** | Time discussion can start | [optional] 
**Totalscore** | Pointer to **int32** | The post message total score | [optional] 
**Userfullname** | Pointer to **string** | Post author full name | [optional] 
**Userid** | Pointer to **int32** | User who started the discussion id | [optional] 
**Usermodified** | Pointer to **int32** | The id of the user who last modified | [optional] 
**Usermodifiedfullname** | Pointer to **string** | Post modifier full name | [optional] 
**Usermodifiedpictureurl** | Pointer to **string** | Post modifier picture. | [optional] 
**Userpictureurl** | Pointer to **string** | Post author picture. | [optional] 

## Methods

### NewModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner

`func NewModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner() *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner`

NewModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner instantiates a new ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumGetForumDiscussionsPaginated200ResponseDiscussionsInnerWithDefaults

`func NewModForumGetForumDiscussionsPaginated200ResponseDiscussionsInnerWithDefaults() *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner`

NewModForumGetForumDiscussionsPaginated200ResponseDiscussionsInnerWithDefaults instantiates a new ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttachment

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetAttachment() string`

GetAttachment returns the Attachment field if non-nil, zero value otherwise.

### GetAttachmentOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetAttachmentOk() (*string, bool)`

GetAttachmentOk returns a tuple with the Attachment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachment

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetAttachment(v string)`

SetAttachment sets Attachment field to given value.

### HasAttachment

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasAttachment() bool`

HasAttachment returns a boolean if a field has been set.

### GetAttachments

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetAttachments() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetAttachments returns the Attachments field if non-nil, zero value otherwise.

### GetAttachmentsOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetAttachmentsOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetAttachmentsOk returns a tuple with the Attachments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachments

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetAttachments(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetAttachments sets Attachments field to given value.

### HasAttachments

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasAttachments() bool`

HasAttachments returns a boolean if a field has been set.

### GetCanlock

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetCanlock() bool`

GetCanlock returns the Canlock field if non-nil, zero value otherwise.

### GetCanlockOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetCanlockOk() (*bool, bool)`

GetCanlockOk returns a tuple with the Canlock field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanlock

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetCanlock(v bool)`

SetCanlock sets Canlock field to given value.

### HasCanlock

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasCanlock() bool`

HasCanlock returns a boolean if a field has been set.

### GetCanreply

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetCanreply() bool`

GetCanreply returns the Canreply field if non-nil, zero value otherwise.

### GetCanreplyOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetCanreplyOk() (*bool, bool)`

GetCanreplyOk returns a tuple with the Canreply field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanreply

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetCanreply(v bool)`

SetCanreply sets Canreply field to given value.

### HasCanreply

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasCanreply() bool`

HasCanreply returns a boolean if a field has been set.

### GetCreated

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetCreated() int32`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetCreatedOk() (*int32, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetCreated(v int32)`

SetCreated sets Created field to given value.

### HasCreated

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasCreated() bool`

HasCreated returns a boolean if a field has been set.

### GetDiscussion

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetDiscussion() int32`

GetDiscussion returns the Discussion field if non-nil, zero value otherwise.

### GetDiscussionOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetDiscussionOk() (*int32, bool)`

GetDiscussionOk returns a tuple with the Discussion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscussion

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetDiscussion(v int32)`

SetDiscussion sets Discussion field to given value.

### HasDiscussion

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasDiscussion() bool`

HasDiscussion returns a boolean if a field has been set.

### GetGroupid

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetId

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetLocked

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetLocked() bool`

GetLocked returns the Locked field if non-nil, zero value otherwise.

### GetLockedOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetLockedOk() (*bool, bool)`

GetLockedOk returns a tuple with the Locked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocked

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetLocked(v bool)`

SetLocked sets Locked field to given value.

### HasLocked

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasLocked() bool`

HasLocked returns a boolean if a field has been set.

### GetMailed

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetMailed() int32`

GetMailed returns the Mailed field if non-nil, zero value otherwise.

### GetMailedOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetMailedOk() (*int32, bool)`

GetMailedOk returns a tuple with the Mailed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMailed

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetMailed(v int32)`

SetMailed sets Mailed field to given value.

### HasMailed

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasMailed() bool`

HasMailed returns a boolean if a field has been set.

### GetMailnow

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetMailnow() int32`

GetMailnow returns the Mailnow field if non-nil, zero value otherwise.

### GetMailnowOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetMailnowOk() (*int32, bool)`

GetMailnowOk returns a tuple with the Mailnow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMailnow

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetMailnow(v int32)`

SetMailnow sets Mailnow field to given value.

### HasMailnow

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasMailnow() bool`

HasMailnow returns a boolean if a field has been set.

### GetMessage

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### GetMessageformat

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetMessageformat() int32`

GetMessageformat returns the Messageformat field if non-nil, zero value otherwise.

### GetMessageformatOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetMessageformatOk() (*int32, bool)`

GetMessageformatOk returns a tuple with the Messageformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageformat

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetMessageformat(v int32)`

SetMessageformat sets Messageformat field to given value.

### HasMessageformat

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasMessageformat() bool`

HasMessageformat returns a boolean if a field has been set.

### GetMessageinlinefiles

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetMessageinlinefiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetMessageinlinefiles returns the Messageinlinefiles field if non-nil, zero value otherwise.

### GetMessageinlinefilesOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetMessageinlinefilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetMessageinlinefilesOk returns a tuple with the Messageinlinefiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageinlinefiles

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetMessageinlinefiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetMessageinlinefiles sets Messageinlinefiles field to given value.

### HasMessageinlinefiles

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasMessageinlinefiles() bool`

HasMessageinlinefiles returns a boolean if a field has been set.

### GetMessagetrust

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetMessagetrust() int32`

GetMessagetrust returns the Messagetrust field if non-nil, zero value otherwise.

### GetMessagetrustOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetMessagetrustOk() (*int32, bool)`

GetMessagetrustOk returns a tuple with the Messagetrust field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessagetrust

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetMessagetrust(v int32)`

SetMessagetrust sets Messagetrust field to given value.

### HasMessagetrust

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasMessagetrust() bool`

HasMessagetrust returns a boolean if a field has been set.

### GetModified

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetModified() int32`

GetModified returns the Modified field if non-nil, zero value otherwise.

### GetModifiedOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetModifiedOk() (*int32, bool)`

GetModifiedOk returns a tuple with the Modified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModified

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetModified(v int32)`

SetModified sets Modified field to given value.

### HasModified

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasModified() bool`

HasModified returns a boolean if a field has been set.

### GetName

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetNumreplies

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetNumreplies() int32`

GetNumreplies returns the Numreplies field if non-nil, zero value otherwise.

### GetNumrepliesOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetNumrepliesOk() (*int32, bool)`

GetNumrepliesOk returns a tuple with the Numreplies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumreplies

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetNumreplies(v int32)`

SetNumreplies sets Numreplies field to given value.

### HasNumreplies

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasNumreplies() bool`

HasNumreplies returns a boolean if a field has been set.

### GetNumunread

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetNumunread() int32`

GetNumunread returns the Numunread field if non-nil, zero value otherwise.

### GetNumunreadOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetNumunreadOk() (*int32, bool)`

GetNumunreadOk returns a tuple with the Numunread field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumunread

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetNumunread(v int32)`

SetNumunread sets Numunread field to given value.

### HasNumunread

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasNumunread() bool`

HasNumunread returns a boolean if a field has been set.

### GetParent

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetParent() int32`

GetParent returns the Parent field if non-nil, zero value otherwise.

### GetParentOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetParentOk() (*int32, bool)`

GetParentOk returns a tuple with the Parent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParent

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetParent(v int32)`

SetParent sets Parent field to given value.

### HasParent

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasParent() bool`

HasParent returns a boolean if a field has been set.

### GetPinned

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetPinned() bool`

GetPinned returns the Pinned field if non-nil, zero value otherwise.

### GetPinnedOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetPinnedOk() (*bool, bool)`

GetPinnedOk returns a tuple with the Pinned field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinned

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetPinned(v bool)`

SetPinned sets Pinned field to given value.

### HasPinned

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasPinned() bool`

HasPinned returns a boolean if a field has been set.

### GetSubject

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetSubject() string`

GetSubject returns the Subject field if non-nil, zero value otherwise.

### GetSubjectOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetSubjectOk() (*string, bool)`

GetSubjectOk returns a tuple with the Subject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubject

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetSubject(v string)`

SetSubject sets Subject field to given value.

### HasSubject

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasSubject() bool`

HasSubject returns a boolean if a field has been set.

### GetTimeend

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetTimeend() int32`

GetTimeend returns the Timeend field if non-nil, zero value otherwise.

### GetTimeendOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetTimeendOk() (*int32, bool)`

GetTimeendOk returns a tuple with the Timeend field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeend

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetTimeend(v int32)`

SetTimeend sets Timeend field to given value.

### HasTimeend

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasTimeend() bool`

HasTimeend returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetTimestart

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetTimestart() int32`

GetTimestart returns the Timestart field if non-nil, zero value otherwise.

### GetTimestartOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetTimestartOk() (*int32, bool)`

GetTimestartOk returns a tuple with the Timestart field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestart

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetTimestart(v int32)`

SetTimestart sets Timestart field to given value.

### HasTimestart

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasTimestart() bool`

HasTimestart returns a boolean if a field has been set.

### GetTotalscore

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetTotalscore() int32`

GetTotalscore returns the Totalscore field if non-nil, zero value otherwise.

### GetTotalscoreOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetTotalscoreOk() (*int32, bool)`

GetTotalscoreOk returns a tuple with the Totalscore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalscore

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetTotalscore(v int32)`

SetTotalscore sets Totalscore field to given value.

### HasTotalscore

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasTotalscore() bool`

HasTotalscore returns a boolean if a field has been set.

### GetUserfullname

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetUserfullname() string`

GetUserfullname returns the Userfullname field if non-nil, zero value otherwise.

### GetUserfullnameOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetUserfullnameOk() (*string, bool)`

GetUserfullnameOk returns a tuple with the Userfullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserfullname

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetUserfullname(v string)`

SetUserfullname sets Userfullname field to given value.

### HasUserfullname

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasUserfullname() bool`

HasUserfullname returns a boolean if a field has been set.

### GetUserid

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetUsermodified

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetUsermodified() int32`

GetUsermodified returns the Usermodified field if non-nil, zero value otherwise.

### GetUsermodifiedOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetUsermodifiedOk() (*int32, bool)`

GetUsermodifiedOk returns a tuple with the Usermodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodified

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetUsermodified(v int32)`

SetUsermodified sets Usermodified field to given value.

### HasUsermodified

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasUsermodified() bool`

HasUsermodified returns a boolean if a field has been set.

### GetUsermodifiedfullname

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetUsermodifiedfullname() string`

GetUsermodifiedfullname returns the Usermodifiedfullname field if non-nil, zero value otherwise.

### GetUsermodifiedfullnameOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetUsermodifiedfullnameOk() (*string, bool)`

GetUsermodifiedfullnameOk returns a tuple with the Usermodifiedfullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodifiedfullname

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetUsermodifiedfullname(v string)`

SetUsermodifiedfullname sets Usermodifiedfullname field to given value.

### HasUsermodifiedfullname

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasUsermodifiedfullname() bool`

HasUsermodifiedfullname returns a boolean if a field has been set.

### GetUsermodifiedpictureurl

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetUsermodifiedpictureurl() string`

GetUsermodifiedpictureurl returns the Usermodifiedpictureurl field if non-nil, zero value otherwise.

### GetUsermodifiedpictureurlOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetUsermodifiedpictureurlOk() (*string, bool)`

GetUsermodifiedpictureurlOk returns a tuple with the Usermodifiedpictureurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodifiedpictureurl

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetUsermodifiedpictureurl(v string)`

SetUsermodifiedpictureurl sets Usermodifiedpictureurl field to given value.

### HasUsermodifiedpictureurl

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasUsermodifiedpictureurl() bool`

HasUsermodifiedpictureurl returns a boolean if a field has been set.

### GetUserpictureurl

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetUserpictureurl() string`

GetUserpictureurl returns the Userpictureurl field if non-nil, zero value otherwise.

### GetUserpictureurlOk

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) GetUserpictureurlOk() (*string, bool)`

GetUserpictureurlOk returns a tuple with the Userpictureurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserpictureurl

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) SetUserpictureurl(v string)`

SetUserpictureurl sets Userpictureurl field to given value.

### HasUserpictureurl

`func (o *ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner) HasUserpictureurl() bool`

HasUserpictureurl returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


