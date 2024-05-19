# ModForumGetDiscussionPostsByUseridRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cmid** | **int32** | The ID of the module of which to fetch items. | [default to null]
**Sortby** | Pointer to **string** | Sort by this element: id, created or modified | [optional] [default to "created"]
**Sortdirection** | Pointer to **string** | Sort direction: ASC or DESC | [optional] [default to "DESC"]
**Userid** | **int32** | The ID of the user of whom to fetch posts. | [default to null]

## Methods

### NewModForumGetDiscussionPostsByUseridRequest

`func NewModForumGetDiscussionPostsByUseridRequest(cmid int32, userid int32, ) *ModForumGetDiscussionPostsByUseridRequest`

NewModForumGetDiscussionPostsByUseridRequest instantiates a new ModForumGetDiscussionPostsByUseridRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumGetDiscussionPostsByUseridRequestWithDefaults

`func NewModForumGetDiscussionPostsByUseridRequestWithDefaults() *ModForumGetDiscussionPostsByUseridRequest`

NewModForumGetDiscussionPostsByUseridRequestWithDefaults instantiates a new ModForumGetDiscussionPostsByUseridRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCmid

`func (o *ModForumGetDiscussionPostsByUseridRequest) GetCmid() int32`

GetCmid returns the Cmid field if non-nil, zero value otherwise.

### GetCmidOk

`func (o *ModForumGetDiscussionPostsByUseridRequest) GetCmidOk() (*int32, bool)`

GetCmidOk returns a tuple with the Cmid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCmid

`func (o *ModForumGetDiscussionPostsByUseridRequest) SetCmid(v int32)`

SetCmid sets Cmid field to given value.


### GetSortby

`func (o *ModForumGetDiscussionPostsByUseridRequest) GetSortby() string`

GetSortby returns the Sortby field if non-nil, zero value otherwise.

### GetSortbyOk

`func (o *ModForumGetDiscussionPostsByUseridRequest) GetSortbyOk() (*string, bool)`

GetSortbyOk returns a tuple with the Sortby field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortby

`func (o *ModForumGetDiscussionPostsByUseridRequest) SetSortby(v string)`

SetSortby sets Sortby field to given value.

### HasSortby

`func (o *ModForumGetDiscussionPostsByUseridRequest) HasSortby() bool`

HasSortby returns a boolean if a field has been set.

### GetSortdirection

`func (o *ModForumGetDiscussionPostsByUseridRequest) GetSortdirection() string`

GetSortdirection returns the Sortdirection field if non-nil, zero value otherwise.

### GetSortdirectionOk

`func (o *ModForumGetDiscussionPostsByUseridRequest) GetSortdirectionOk() (*string, bool)`

GetSortdirectionOk returns a tuple with the Sortdirection field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortdirection

`func (o *ModForumGetDiscussionPostsByUseridRequest) SetSortdirection(v string)`

SetSortdirection sets Sortdirection field to given value.

### HasSortdirection

`func (o *ModForumGetDiscussionPostsByUseridRequest) HasSortdirection() bool`

HasSortdirection returns a boolean if a field has been set.

### GetUserid

`func (o *ModForumGetDiscussionPostsByUseridRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModForumGetDiscussionPostsByUseridRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModForumGetDiscussionPostsByUseridRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


