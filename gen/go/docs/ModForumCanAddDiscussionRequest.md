# ModForumCanAddDiscussionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Forumid** | **int32** | Forum instance ID | 
**Groupid** | Pointer to **int32** | The group to check, default to active group.                                                 Use -1 to check if the user can post in all the groups. | [optional] [default to null]

## Methods

### NewModForumCanAddDiscussionRequest

`func NewModForumCanAddDiscussionRequest(forumid int32, ) *ModForumCanAddDiscussionRequest`

NewModForumCanAddDiscussionRequest instantiates a new ModForumCanAddDiscussionRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumCanAddDiscussionRequestWithDefaults

`func NewModForumCanAddDiscussionRequestWithDefaults() *ModForumCanAddDiscussionRequest`

NewModForumCanAddDiscussionRequestWithDefaults instantiates a new ModForumCanAddDiscussionRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetForumid

`func (o *ModForumCanAddDiscussionRequest) GetForumid() int32`

GetForumid returns the Forumid field if non-nil, zero value otherwise.

### GetForumidOk

`func (o *ModForumCanAddDiscussionRequest) GetForumidOk() (*int32, bool)`

GetForumidOk returns a tuple with the Forumid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForumid

`func (o *ModForumCanAddDiscussionRequest) SetForumid(v int32)`

SetForumid sets Forumid field to given value.


### GetGroupid

`func (o *ModForumCanAddDiscussionRequest) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModForumCanAddDiscussionRequest) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModForumCanAddDiscussionRequest) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *ModForumCanAddDiscussionRequest) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


