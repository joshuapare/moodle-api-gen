# ModForumToggleFavouriteStateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Discussionid** | **int32** | The discussion to subscribe or unsubscribe | 
**Targetstate** | **bool** | The target state | 

## Methods

### NewModForumToggleFavouriteStateRequest

`func NewModForumToggleFavouriteStateRequest(discussionid int32, targetstate bool, ) *ModForumToggleFavouriteStateRequest`

NewModForumToggleFavouriteStateRequest instantiates a new ModForumToggleFavouriteStateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumToggleFavouriteStateRequestWithDefaults

`func NewModForumToggleFavouriteStateRequestWithDefaults() *ModForumToggleFavouriteStateRequest`

NewModForumToggleFavouriteStateRequestWithDefaults instantiates a new ModForumToggleFavouriteStateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDiscussionid

`func (o *ModForumToggleFavouriteStateRequest) GetDiscussionid() int32`

GetDiscussionid returns the Discussionid field if non-nil, zero value otherwise.

### GetDiscussionidOk

`func (o *ModForumToggleFavouriteStateRequest) GetDiscussionidOk() (*int32, bool)`

GetDiscussionidOk returns a tuple with the Discussionid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscussionid

`func (o *ModForumToggleFavouriteStateRequest) SetDiscussionid(v int32)`

SetDiscussionid sets Discussionid field to given value.


### GetTargetstate

`func (o *ModForumToggleFavouriteStateRequest) GetTargetstate() bool`

GetTargetstate returns the Targetstate field if non-nil, zero value otherwise.

### GetTargetstateOk

`func (o *ModForumToggleFavouriteStateRequest) GetTargetstateOk() (*bool, bool)`

GetTargetstateOk returns a tuple with the Targetstate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetstate

`func (o *ModForumToggleFavouriteStateRequest) SetTargetstate(v bool)`

SetTargetstate sets Targetstate field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


