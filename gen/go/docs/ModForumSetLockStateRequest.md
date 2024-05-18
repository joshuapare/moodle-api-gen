# ModForumSetLockStateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Discussionid** | **int32** | The discussion to lock / unlock | [default to null]
**Forumid** | **int32** | Forum that the discussion is in | [default to null]
**Targetstate** | **int32** | The timestamp for the lock state | [default to null]

## Methods

### NewModForumSetLockStateRequest

`func NewModForumSetLockStateRequest(discussionid int32, forumid int32, targetstate int32, ) *ModForumSetLockStateRequest`

NewModForumSetLockStateRequest instantiates a new ModForumSetLockStateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumSetLockStateRequestWithDefaults

`func NewModForumSetLockStateRequestWithDefaults() *ModForumSetLockStateRequest`

NewModForumSetLockStateRequestWithDefaults instantiates a new ModForumSetLockStateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDiscussionid

`func (o *ModForumSetLockStateRequest) GetDiscussionid() int32`

GetDiscussionid returns the Discussionid field if non-nil, zero value otherwise.

### GetDiscussionidOk

`func (o *ModForumSetLockStateRequest) GetDiscussionidOk() (*int32, bool)`

GetDiscussionidOk returns a tuple with the Discussionid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscussionid

`func (o *ModForumSetLockStateRequest) SetDiscussionid(v int32)`

SetDiscussionid sets Discussionid field to given value.


### GetForumid

`func (o *ModForumSetLockStateRequest) GetForumid() int32`

GetForumid returns the Forumid field if non-nil, zero value otherwise.

### GetForumidOk

`func (o *ModForumSetLockStateRequest) GetForumidOk() (*int32, bool)`

GetForumidOk returns a tuple with the Forumid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForumid

`func (o *ModForumSetLockStateRequest) SetForumid(v int32)`

SetForumid sets Forumid field to given value.


### GetTargetstate

`func (o *ModForumSetLockStateRequest) GetTargetstate() int32`

GetTargetstate returns the Targetstate field if non-nil, zero value otherwise.

### GetTargetstateOk

`func (o *ModForumSetLockStateRequest) GetTargetstateOk() (*int32, bool)`

GetTargetstateOk returns a tuple with the Targetstate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetstate

`func (o *ModForumSetLockStateRequest) SetTargetstate(v int32)`

SetTargetstate sets Targetstate field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


