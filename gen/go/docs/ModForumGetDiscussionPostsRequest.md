# ModForumGetDiscussionPostsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Discussionid** | **int32** | The ID of the discussion from which to fetch posts. | [default to null]
**Includeinlineattachments** | Pointer to **bool** | Whether inline attachments should be included or not | [optional] [default to false]
**Sortby** | Pointer to **string** | Sort by this element: id, created or modified | [optional] [default to "created"]
**Sortdirection** | Pointer to **string** | Sort direction: ASC or DESC | [optional] [default to "DESC"]

## Methods

### NewModForumGetDiscussionPostsRequest

`func NewModForumGetDiscussionPostsRequest(discussionid int32, ) *ModForumGetDiscussionPostsRequest`

NewModForumGetDiscussionPostsRequest instantiates a new ModForumGetDiscussionPostsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumGetDiscussionPostsRequestWithDefaults

`func NewModForumGetDiscussionPostsRequestWithDefaults() *ModForumGetDiscussionPostsRequest`

NewModForumGetDiscussionPostsRequestWithDefaults instantiates a new ModForumGetDiscussionPostsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDiscussionid

`func (o *ModForumGetDiscussionPostsRequest) GetDiscussionid() int32`

GetDiscussionid returns the Discussionid field if non-nil, zero value otherwise.

### GetDiscussionidOk

`func (o *ModForumGetDiscussionPostsRequest) GetDiscussionidOk() (*int32, bool)`

GetDiscussionidOk returns a tuple with the Discussionid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscussionid

`func (o *ModForumGetDiscussionPostsRequest) SetDiscussionid(v int32)`

SetDiscussionid sets Discussionid field to given value.


### GetIncludeinlineattachments

`func (o *ModForumGetDiscussionPostsRequest) GetIncludeinlineattachments() bool`

GetIncludeinlineattachments returns the Includeinlineattachments field if non-nil, zero value otherwise.

### GetIncludeinlineattachmentsOk

`func (o *ModForumGetDiscussionPostsRequest) GetIncludeinlineattachmentsOk() (*bool, bool)`

GetIncludeinlineattachmentsOk returns a tuple with the Includeinlineattachments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludeinlineattachments

`func (o *ModForumGetDiscussionPostsRequest) SetIncludeinlineattachments(v bool)`

SetIncludeinlineattachments sets Includeinlineattachments field to given value.

### HasIncludeinlineattachments

`func (o *ModForumGetDiscussionPostsRequest) HasIncludeinlineattachments() bool`

HasIncludeinlineattachments returns a boolean if a field has been set.

### GetSortby

`func (o *ModForumGetDiscussionPostsRequest) GetSortby() string`

GetSortby returns the Sortby field if non-nil, zero value otherwise.

### GetSortbyOk

`func (o *ModForumGetDiscussionPostsRequest) GetSortbyOk() (*string, bool)`

GetSortbyOk returns a tuple with the Sortby field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortby

`func (o *ModForumGetDiscussionPostsRequest) SetSortby(v string)`

SetSortby sets Sortby field to given value.

### HasSortby

`func (o *ModForumGetDiscussionPostsRequest) HasSortby() bool`

HasSortby returns a boolean if a field has been set.

### GetSortdirection

`func (o *ModForumGetDiscussionPostsRequest) GetSortdirection() string`

GetSortdirection returns the Sortdirection field if non-nil, zero value otherwise.

### GetSortdirectionOk

`func (o *ModForumGetDiscussionPostsRequest) GetSortdirectionOk() (*string, bool)`

GetSortdirectionOk returns a tuple with the Sortdirection field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortdirection

`func (o *ModForumGetDiscussionPostsRequest) SetSortdirection(v string)`

SetSortdirection sets Sortdirection field to given value.

### HasSortdirection

`func (o *ModForumGetDiscussionPostsRequest) HasSortdirection() bool`

HasSortdirection returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


