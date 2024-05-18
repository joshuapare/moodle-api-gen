# ModForumSetSubscriptionStateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Discussionid** | **int32** | The discussion to subscribe or unsubscribe | [default to null]
**Forumid** | **int32** | Forum that the discussion is in | 
**Targetstate** | **bool** | The target state | [default to null]

## Methods

### NewModForumSetSubscriptionStateRequest

`func NewModForumSetSubscriptionStateRequest(discussionid int32, forumid int32, targetstate bool, ) *ModForumSetSubscriptionStateRequest`

NewModForumSetSubscriptionStateRequest instantiates a new ModForumSetSubscriptionStateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumSetSubscriptionStateRequestWithDefaults

`func NewModForumSetSubscriptionStateRequestWithDefaults() *ModForumSetSubscriptionStateRequest`

NewModForumSetSubscriptionStateRequestWithDefaults instantiates a new ModForumSetSubscriptionStateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDiscussionid

`func (o *ModForumSetSubscriptionStateRequest) GetDiscussionid() int32`

GetDiscussionid returns the Discussionid field if non-nil, zero value otherwise.

### GetDiscussionidOk

`func (o *ModForumSetSubscriptionStateRequest) GetDiscussionidOk() (*int32, bool)`

GetDiscussionidOk returns a tuple with the Discussionid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscussionid

`func (o *ModForumSetSubscriptionStateRequest) SetDiscussionid(v int32)`

SetDiscussionid sets Discussionid field to given value.


### GetForumid

`func (o *ModForumSetSubscriptionStateRequest) GetForumid() int32`

GetForumid returns the Forumid field if non-nil, zero value otherwise.

### GetForumidOk

`func (o *ModForumSetSubscriptionStateRequest) GetForumidOk() (*int32, bool)`

GetForumidOk returns a tuple with the Forumid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForumid

`func (o *ModForumSetSubscriptionStateRequest) SetForumid(v int32)`

SetForumid sets Forumid field to given value.


### GetTargetstate

`func (o *ModForumSetSubscriptionStateRequest) GetTargetstate() bool`

GetTargetstate returns the Targetstate field if non-nil, zero value otherwise.

### GetTargetstateOk

`func (o *ModForumSetSubscriptionStateRequest) GetTargetstateOk() (*bool, bool)`

GetTargetstateOk returns a tuple with the Targetstate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetstate

`func (o *ModForumSetSubscriptionStateRequest) SetTargetstate(v bool)`

SetTargetstate sets Targetstate field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


