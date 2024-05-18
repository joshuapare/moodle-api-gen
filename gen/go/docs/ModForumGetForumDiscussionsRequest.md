# ModForumGetForumDiscussionsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Forumid** | **int32** | forum instance id | [default to null]
**Groupid** | Pointer to **int32** | group id | [optional] [default to 0]
**Page** | Pointer to **int32** | current page | [optional] [default to -1]
**Perpage** | Pointer to **int32** | items per page | [optional] [default to 0]
**Sortorder** | Pointer to **int32** | sort by this element: numreplies, , created or timemodified | [optional] [default to -1]

## Methods

### NewModForumGetForumDiscussionsRequest

`func NewModForumGetForumDiscussionsRequest(forumid int32, ) *ModForumGetForumDiscussionsRequest`

NewModForumGetForumDiscussionsRequest instantiates a new ModForumGetForumDiscussionsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumGetForumDiscussionsRequestWithDefaults

`func NewModForumGetForumDiscussionsRequestWithDefaults() *ModForumGetForumDiscussionsRequest`

NewModForumGetForumDiscussionsRequestWithDefaults instantiates a new ModForumGetForumDiscussionsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetForumid

`func (o *ModForumGetForumDiscussionsRequest) GetForumid() int32`

GetForumid returns the Forumid field if non-nil, zero value otherwise.

### GetForumidOk

`func (o *ModForumGetForumDiscussionsRequest) GetForumidOk() (*int32, bool)`

GetForumidOk returns a tuple with the Forumid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForumid

`func (o *ModForumGetForumDiscussionsRequest) SetForumid(v int32)`

SetForumid sets Forumid field to given value.


### GetGroupid

`func (o *ModForumGetForumDiscussionsRequest) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModForumGetForumDiscussionsRequest) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModForumGetForumDiscussionsRequest) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *ModForumGetForumDiscussionsRequest) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetPage

`func (o *ModForumGetForumDiscussionsRequest) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *ModForumGetForumDiscussionsRequest) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *ModForumGetForumDiscussionsRequest) SetPage(v int32)`

SetPage sets Page field to given value.

### HasPage

`func (o *ModForumGetForumDiscussionsRequest) HasPage() bool`

HasPage returns a boolean if a field has been set.

### GetPerpage

`func (o *ModForumGetForumDiscussionsRequest) GetPerpage() int32`

GetPerpage returns the Perpage field if non-nil, zero value otherwise.

### GetPerpageOk

`func (o *ModForumGetForumDiscussionsRequest) GetPerpageOk() (*int32, bool)`

GetPerpageOk returns a tuple with the Perpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPerpage

`func (o *ModForumGetForumDiscussionsRequest) SetPerpage(v int32)`

SetPerpage sets Perpage field to given value.

### HasPerpage

`func (o *ModForumGetForumDiscussionsRequest) HasPerpage() bool`

HasPerpage returns a boolean if a field has been set.

### GetSortorder

`func (o *ModForumGetForumDiscussionsRequest) GetSortorder() int32`

GetSortorder returns the Sortorder field if non-nil, zero value otherwise.

### GetSortorderOk

`func (o *ModForumGetForumDiscussionsRequest) GetSortorderOk() (*int32, bool)`

GetSortorderOk returns a tuple with the Sortorder field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortorder

`func (o *ModForumGetForumDiscussionsRequest) SetSortorder(v int32)`

SetSortorder sets Sortorder field to given value.

### HasSortorder

`func (o *ModForumGetForumDiscussionsRequest) HasSortorder() bool`

HasSortorder returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


