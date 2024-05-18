# ModForumGetForumDiscussionsPaginatedRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Forumid** | **int32** | forum instance id | 
**Page** | Pointer to **int32** | current page | [optional] [default to -1]
**Perpage** | Pointer to **int32** | items per page | [optional] [default to 0]
**Sortby** | Pointer to **string** | sort by this element: id, timemodified, timestart or timeend | [optional] [default to "timemodified"]
**Sortdirection** | Pointer to **string** | sort direction: ASC or DESC | [optional] [default to "DESC"]

## Methods

### NewModForumGetForumDiscussionsPaginatedRequest

`func NewModForumGetForumDiscussionsPaginatedRequest(forumid int32, ) *ModForumGetForumDiscussionsPaginatedRequest`

NewModForumGetForumDiscussionsPaginatedRequest instantiates a new ModForumGetForumDiscussionsPaginatedRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumGetForumDiscussionsPaginatedRequestWithDefaults

`func NewModForumGetForumDiscussionsPaginatedRequestWithDefaults() *ModForumGetForumDiscussionsPaginatedRequest`

NewModForumGetForumDiscussionsPaginatedRequestWithDefaults instantiates a new ModForumGetForumDiscussionsPaginatedRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetForumid

`func (o *ModForumGetForumDiscussionsPaginatedRequest) GetForumid() int32`

GetForumid returns the Forumid field if non-nil, zero value otherwise.

### GetForumidOk

`func (o *ModForumGetForumDiscussionsPaginatedRequest) GetForumidOk() (*int32, bool)`

GetForumidOk returns a tuple with the Forumid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForumid

`func (o *ModForumGetForumDiscussionsPaginatedRequest) SetForumid(v int32)`

SetForumid sets Forumid field to given value.


### GetPage

`func (o *ModForumGetForumDiscussionsPaginatedRequest) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *ModForumGetForumDiscussionsPaginatedRequest) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *ModForumGetForumDiscussionsPaginatedRequest) SetPage(v int32)`

SetPage sets Page field to given value.

### HasPage

`func (o *ModForumGetForumDiscussionsPaginatedRequest) HasPage() bool`

HasPage returns a boolean if a field has been set.

### GetPerpage

`func (o *ModForumGetForumDiscussionsPaginatedRequest) GetPerpage() int32`

GetPerpage returns the Perpage field if non-nil, zero value otherwise.

### GetPerpageOk

`func (o *ModForumGetForumDiscussionsPaginatedRequest) GetPerpageOk() (*int32, bool)`

GetPerpageOk returns a tuple with the Perpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPerpage

`func (o *ModForumGetForumDiscussionsPaginatedRequest) SetPerpage(v int32)`

SetPerpage sets Perpage field to given value.

### HasPerpage

`func (o *ModForumGetForumDiscussionsPaginatedRequest) HasPerpage() bool`

HasPerpage returns a boolean if a field has been set.

### GetSortby

`func (o *ModForumGetForumDiscussionsPaginatedRequest) GetSortby() string`

GetSortby returns the Sortby field if non-nil, zero value otherwise.

### GetSortbyOk

`func (o *ModForumGetForumDiscussionsPaginatedRequest) GetSortbyOk() (*string, bool)`

GetSortbyOk returns a tuple with the Sortby field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortby

`func (o *ModForumGetForumDiscussionsPaginatedRequest) SetSortby(v string)`

SetSortby sets Sortby field to given value.

### HasSortby

`func (o *ModForumGetForumDiscussionsPaginatedRequest) HasSortby() bool`

HasSortby returns a boolean if a field has been set.

### GetSortdirection

`func (o *ModForumGetForumDiscussionsPaginatedRequest) GetSortdirection() string`

GetSortdirection returns the Sortdirection field if non-nil, zero value otherwise.

### GetSortdirectionOk

`func (o *ModForumGetForumDiscussionsPaginatedRequest) GetSortdirectionOk() (*string, bool)`

GetSortdirectionOk returns a tuple with the Sortdirection field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortdirection

`func (o *ModForumGetForumDiscussionsPaginatedRequest) SetSortdirection(v string)`

SetSortdirection sets Sortdirection field to given value.

### HasSortdirection

`func (o *ModForumGetForumDiscussionsPaginatedRequest) HasSortdirection() bool`

HasSortdirection returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


