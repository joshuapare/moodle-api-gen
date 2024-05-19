# ModForumGetForumDiscussions200ResponseDiscussionsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attachment** | Pointer to **string** | Has attachments? | [optional] [default to "null"]
**Attachments** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Canfavourite** | Pointer to **bool** | Can the user star the discussion | [optional] [default to null]
**Canlock** | Pointer to **bool** | Can the user lock the discussion | [optional] [default to null]
**Canreply** | Pointer to **bool** | Can the user reply to the discussion | [optional] [default to null]
**Created** | Pointer to **int32** | Creation time | [optional] [default to null]
**Discussion** | Pointer to **int32** | Discussion id | [optional] [default to null]
**Groupid** | Pointer to **int32** | Group id | [optional] 
**Id** | Pointer to **int32** | Post id | [optional] [default to null]
**Locked** | Pointer to **bool** | Is the discussion locked | [optional] [default to null]
**Mailed** | Pointer to **int32** | Mailed? | [optional] [default to null]
**Mailnow** | Pointer to **int32** | Mail now? | [optional] [default to null]
**Message** | Pointer to **string** | The post message | [optional] [default to "null"]
**Messageformat** | Pointer to **int32** | message format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Messageinlinefiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Messagetrust** | Pointer to **int32** | Can we trust? | [optional] [default to null]
**Modified** | Pointer to **int32** | Time modified | [optional] 
**Name** | Pointer to **string** | Discussion name | [optional] [default to "null"]
**Numreplies** | Pointer to **int32** | The number of replies in the discussion | [optional] [default to null]
**Numunread** | Pointer to **int32** | The number of unread discussions. | [optional] [default to null]
**Parent** | Pointer to **int32** | Parent id | [optional] [default to null]
**Pinned** | Pointer to **bool** | Is the discussion pinned | [optional] [default to null]
**Starred** | Pointer to **bool** | Is the discussion starred | [optional] [default to null]
**Subject** | Pointer to **string** | The post subject | [optional] [default to "null"]
**Timeend** | Pointer to **int32** | Time discussion ends | [optional] [default to null]
**Timemodified** | Pointer to **int32** | Time modified | [optional] 
**Timestart** | Pointer to **int32** | Time discussion can start | [optional] [default to null]
**Totalscore** | Pointer to **int32** | The post message total score | [optional] [default to null]
**Userfullname** | Pointer to **string** | Post author full name | [optional] [default to "null"]
**Userid** | Pointer to **int32** | User who started the discussion id | [optional] [default to null]
**Usermodified** | Pointer to **int32** | The id of the user who last modified | [optional] [default to null]
**Usermodifiedfullname** | Pointer to **string** | Post modifier full name | [optional] [default to "null"]
**Usermodifiedpictureurl** | Pointer to **string** | Post modifier picture. | [optional] [default to "null"]
**Userpictureurl** | Pointer to **string** | Post author picture. | [optional] [default to "null"]

## Methods

### NewModForumGetForumDiscussions200ResponseDiscussionsInner

`func NewModForumGetForumDiscussions200ResponseDiscussionsInner() *ModForumGetForumDiscussions200ResponseDiscussionsInner`

NewModForumGetForumDiscussions200ResponseDiscussionsInner instantiates a new ModForumGetForumDiscussions200ResponseDiscussionsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumGetForumDiscussions200ResponseDiscussionsInnerWithDefaults

`func NewModForumGetForumDiscussions200ResponseDiscussionsInnerWithDefaults() *ModForumGetForumDiscussions200ResponseDiscussionsInner`

NewModForumGetForumDiscussions200ResponseDiscussionsInnerWithDefaults instantiates a new ModForumGetForumDiscussions200ResponseDiscussionsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttachment

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetAttachment() string`

GetAttachment returns the Attachment field if non-nil, zero value otherwise.

### GetAttachmentOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetAttachmentOk() (*string, bool)`

GetAttachmentOk returns a tuple with the Attachment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachment

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetAttachment(v string)`

SetAttachment sets Attachment field to given value.

### HasAttachment

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasAttachment() bool`

HasAttachment returns a boolean if a field has been set.

### GetAttachments

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetAttachments() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetAttachments returns the Attachments field if non-nil, zero value otherwise.

### GetAttachmentsOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetAttachmentsOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetAttachmentsOk returns a tuple with the Attachments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachments

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetAttachments(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetAttachments sets Attachments field to given value.

### HasAttachments

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasAttachments() bool`

HasAttachments returns a boolean if a field has been set.

### GetCanfavourite

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetCanfavourite() bool`

GetCanfavourite returns the Canfavourite field if non-nil, zero value otherwise.

### GetCanfavouriteOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetCanfavouriteOk() (*bool, bool)`

GetCanfavouriteOk returns a tuple with the Canfavourite field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanfavourite

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetCanfavourite(v bool)`

SetCanfavourite sets Canfavourite field to given value.

### HasCanfavourite

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasCanfavourite() bool`

HasCanfavourite returns a boolean if a field has been set.

### GetCanlock

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetCanlock() bool`

GetCanlock returns the Canlock field if non-nil, zero value otherwise.

### GetCanlockOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetCanlockOk() (*bool, bool)`

GetCanlockOk returns a tuple with the Canlock field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanlock

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetCanlock(v bool)`

SetCanlock sets Canlock field to given value.

### HasCanlock

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasCanlock() bool`

HasCanlock returns a boolean if a field has been set.

### GetCanreply

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetCanreply() bool`

GetCanreply returns the Canreply field if non-nil, zero value otherwise.

### GetCanreplyOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetCanreplyOk() (*bool, bool)`

GetCanreplyOk returns a tuple with the Canreply field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanreply

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetCanreply(v bool)`

SetCanreply sets Canreply field to given value.

### HasCanreply

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasCanreply() bool`

HasCanreply returns a boolean if a field has been set.

### GetCreated

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetCreated() int32`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetCreatedOk() (*int32, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetCreated(v int32)`

SetCreated sets Created field to given value.

### HasCreated

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasCreated() bool`

HasCreated returns a boolean if a field has been set.

### GetDiscussion

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetDiscussion() int32`

GetDiscussion returns the Discussion field if non-nil, zero value otherwise.

### GetDiscussionOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetDiscussionOk() (*int32, bool)`

GetDiscussionOk returns a tuple with the Discussion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscussion

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetDiscussion(v int32)`

SetDiscussion sets Discussion field to given value.

### HasDiscussion

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasDiscussion() bool`

HasDiscussion returns a boolean if a field has been set.

### GetGroupid

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetId

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetLocked

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetLocked() bool`

GetLocked returns the Locked field if non-nil, zero value otherwise.

### GetLockedOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetLockedOk() (*bool, bool)`

GetLockedOk returns a tuple with the Locked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocked

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetLocked(v bool)`

SetLocked sets Locked field to given value.

### HasLocked

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasLocked() bool`

HasLocked returns a boolean if a field has been set.

### GetMailed

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetMailed() int32`

GetMailed returns the Mailed field if non-nil, zero value otherwise.

### GetMailedOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetMailedOk() (*int32, bool)`

GetMailedOk returns a tuple with the Mailed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMailed

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetMailed(v int32)`

SetMailed sets Mailed field to given value.

### HasMailed

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasMailed() bool`

HasMailed returns a boolean if a field has been set.

### GetMailnow

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetMailnow() int32`

GetMailnow returns the Mailnow field if non-nil, zero value otherwise.

### GetMailnowOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetMailnowOk() (*int32, bool)`

GetMailnowOk returns a tuple with the Mailnow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMailnow

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetMailnow(v int32)`

SetMailnow sets Mailnow field to given value.

### HasMailnow

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasMailnow() bool`

HasMailnow returns a boolean if a field has been set.

### GetMessage

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### GetMessageformat

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetMessageformat() int32`

GetMessageformat returns the Messageformat field if non-nil, zero value otherwise.

### GetMessageformatOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetMessageformatOk() (*int32, bool)`

GetMessageformatOk returns a tuple with the Messageformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageformat

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetMessageformat(v int32)`

SetMessageformat sets Messageformat field to given value.

### HasMessageformat

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasMessageformat() bool`

HasMessageformat returns a boolean if a field has been set.

### GetMessageinlinefiles

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetMessageinlinefiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetMessageinlinefiles returns the Messageinlinefiles field if non-nil, zero value otherwise.

### GetMessageinlinefilesOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetMessageinlinefilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetMessageinlinefilesOk returns a tuple with the Messageinlinefiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageinlinefiles

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetMessageinlinefiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetMessageinlinefiles sets Messageinlinefiles field to given value.

### HasMessageinlinefiles

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasMessageinlinefiles() bool`

HasMessageinlinefiles returns a boolean if a field has been set.

### GetMessagetrust

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetMessagetrust() int32`

GetMessagetrust returns the Messagetrust field if non-nil, zero value otherwise.

### GetMessagetrustOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetMessagetrustOk() (*int32, bool)`

GetMessagetrustOk returns a tuple with the Messagetrust field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessagetrust

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetMessagetrust(v int32)`

SetMessagetrust sets Messagetrust field to given value.

### HasMessagetrust

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasMessagetrust() bool`

HasMessagetrust returns a boolean if a field has been set.

### GetModified

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetModified() int32`

GetModified returns the Modified field if non-nil, zero value otherwise.

### GetModifiedOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetModifiedOk() (*int32, bool)`

GetModifiedOk returns a tuple with the Modified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModified

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetModified(v int32)`

SetModified sets Modified field to given value.

### HasModified

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasModified() bool`

HasModified returns a boolean if a field has been set.

### GetName

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetNumreplies

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetNumreplies() int32`

GetNumreplies returns the Numreplies field if non-nil, zero value otherwise.

### GetNumrepliesOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetNumrepliesOk() (*int32, bool)`

GetNumrepliesOk returns a tuple with the Numreplies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumreplies

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetNumreplies(v int32)`

SetNumreplies sets Numreplies field to given value.

### HasNumreplies

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasNumreplies() bool`

HasNumreplies returns a boolean if a field has been set.

### GetNumunread

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetNumunread() int32`

GetNumunread returns the Numunread field if non-nil, zero value otherwise.

### GetNumunreadOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetNumunreadOk() (*int32, bool)`

GetNumunreadOk returns a tuple with the Numunread field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumunread

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetNumunread(v int32)`

SetNumunread sets Numunread field to given value.

### HasNumunread

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasNumunread() bool`

HasNumunread returns a boolean if a field has been set.

### GetParent

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetParent() int32`

GetParent returns the Parent field if non-nil, zero value otherwise.

### GetParentOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetParentOk() (*int32, bool)`

GetParentOk returns a tuple with the Parent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParent

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetParent(v int32)`

SetParent sets Parent field to given value.

### HasParent

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasParent() bool`

HasParent returns a boolean if a field has been set.

### GetPinned

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetPinned() bool`

GetPinned returns the Pinned field if non-nil, zero value otherwise.

### GetPinnedOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetPinnedOk() (*bool, bool)`

GetPinnedOk returns a tuple with the Pinned field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinned

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetPinned(v bool)`

SetPinned sets Pinned field to given value.

### HasPinned

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasPinned() bool`

HasPinned returns a boolean if a field has been set.

### GetStarred

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetStarred() bool`

GetStarred returns the Starred field if non-nil, zero value otherwise.

### GetStarredOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetStarredOk() (*bool, bool)`

GetStarredOk returns a tuple with the Starred field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStarred

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetStarred(v bool)`

SetStarred sets Starred field to given value.

### HasStarred

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasStarred() bool`

HasStarred returns a boolean if a field has been set.

### GetSubject

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetSubject() string`

GetSubject returns the Subject field if non-nil, zero value otherwise.

### GetSubjectOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetSubjectOk() (*string, bool)`

GetSubjectOk returns a tuple with the Subject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubject

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetSubject(v string)`

SetSubject sets Subject field to given value.

### HasSubject

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasSubject() bool`

HasSubject returns a boolean if a field has been set.

### GetTimeend

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetTimeend() int32`

GetTimeend returns the Timeend field if non-nil, zero value otherwise.

### GetTimeendOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetTimeendOk() (*int32, bool)`

GetTimeendOk returns a tuple with the Timeend field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeend

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetTimeend(v int32)`

SetTimeend sets Timeend field to given value.

### HasTimeend

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasTimeend() bool`

HasTimeend returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetTimestart

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetTimestart() int32`

GetTimestart returns the Timestart field if non-nil, zero value otherwise.

### GetTimestartOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetTimestartOk() (*int32, bool)`

GetTimestartOk returns a tuple with the Timestart field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestart

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetTimestart(v int32)`

SetTimestart sets Timestart field to given value.

### HasTimestart

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasTimestart() bool`

HasTimestart returns a boolean if a field has been set.

### GetTotalscore

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetTotalscore() int32`

GetTotalscore returns the Totalscore field if non-nil, zero value otherwise.

### GetTotalscoreOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetTotalscoreOk() (*int32, bool)`

GetTotalscoreOk returns a tuple with the Totalscore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalscore

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetTotalscore(v int32)`

SetTotalscore sets Totalscore field to given value.

### HasTotalscore

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasTotalscore() bool`

HasTotalscore returns a boolean if a field has been set.

### GetUserfullname

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetUserfullname() string`

GetUserfullname returns the Userfullname field if non-nil, zero value otherwise.

### GetUserfullnameOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetUserfullnameOk() (*string, bool)`

GetUserfullnameOk returns a tuple with the Userfullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserfullname

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetUserfullname(v string)`

SetUserfullname sets Userfullname field to given value.

### HasUserfullname

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasUserfullname() bool`

HasUserfullname returns a boolean if a field has been set.

### GetUserid

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetUsermodified

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetUsermodified() int32`

GetUsermodified returns the Usermodified field if non-nil, zero value otherwise.

### GetUsermodifiedOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetUsermodifiedOk() (*int32, bool)`

GetUsermodifiedOk returns a tuple with the Usermodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodified

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetUsermodified(v int32)`

SetUsermodified sets Usermodified field to given value.

### HasUsermodified

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasUsermodified() bool`

HasUsermodified returns a boolean if a field has been set.

### GetUsermodifiedfullname

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetUsermodifiedfullname() string`

GetUsermodifiedfullname returns the Usermodifiedfullname field if non-nil, zero value otherwise.

### GetUsermodifiedfullnameOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetUsermodifiedfullnameOk() (*string, bool)`

GetUsermodifiedfullnameOk returns a tuple with the Usermodifiedfullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodifiedfullname

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetUsermodifiedfullname(v string)`

SetUsermodifiedfullname sets Usermodifiedfullname field to given value.

### HasUsermodifiedfullname

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasUsermodifiedfullname() bool`

HasUsermodifiedfullname returns a boolean if a field has been set.

### GetUsermodifiedpictureurl

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetUsermodifiedpictureurl() string`

GetUsermodifiedpictureurl returns the Usermodifiedpictureurl field if non-nil, zero value otherwise.

### GetUsermodifiedpictureurlOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetUsermodifiedpictureurlOk() (*string, bool)`

GetUsermodifiedpictureurlOk returns a tuple with the Usermodifiedpictureurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodifiedpictureurl

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetUsermodifiedpictureurl(v string)`

SetUsermodifiedpictureurl sets Usermodifiedpictureurl field to given value.

### HasUsermodifiedpictureurl

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasUsermodifiedpictureurl() bool`

HasUsermodifiedpictureurl returns a boolean if a field has been set.

### GetUserpictureurl

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetUserpictureurl() string`

GetUserpictureurl returns the Userpictureurl field if non-nil, zero value otherwise.

### GetUserpictureurlOk

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) GetUserpictureurlOk() (*string, bool)`

GetUserpictureurlOk returns a tuple with the Userpictureurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserpictureurl

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) SetUserpictureurl(v string)`

SetUserpictureurl sets Userpictureurl field to given value.

### HasUserpictureurl

`func (o *ModForumGetForumDiscussions200ResponseDiscussionsInner) HasUserpictureurl() bool`

HasUserpictureurl returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


