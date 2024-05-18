# ModForumSetPinStateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Discussionid** | **int32** | The discussion to pin or unpin | [default to null]
**Targetstate** | **int32** | The target state | [default to null]

## Methods

### NewModForumSetPinStateRequest

`func NewModForumSetPinStateRequest(discussionid int32, targetstate int32, ) *ModForumSetPinStateRequest`

NewModForumSetPinStateRequest instantiates a new ModForumSetPinStateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumSetPinStateRequestWithDefaults

`func NewModForumSetPinStateRequestWithDefaults() *ModForumSetPinStateRequest`

NewModForumSetPinStateRequestWithDefaults instantiates a new ModForumSetPinStateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDiscussionid

`func (o *ModForumSetPinStateRequest) GetDiscussionid() int32`

GetDiscussionid returns the Discussionid field if non-nil, zero value otherwise.

### GetDiscussionidOk

`func (o *ModForumSetPinStateRequest) GetDiscussionidOk() (*int32, bool)`

GetDiscussionidOk returns a tuple with the Discussionid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscussionid

`func (o *ModForumSetPinStateRequest) SetDiscussionid(v int32)`

SetDiscussionid sets Discussionid field to given value.


### GetTargetstate

`func (o *ModForumSetPinStateRequest) GetTargetstate() int32`

GetTargetstate returns the Targetstate field if non-nil, zero value otherwise.

### GetTargetstateOk

`func (o *ModForumSetPinStateRequest) GetTargetstateOk() (*int32, bool)`

GetTargetstateOk returns a tuple with the Targetstate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetstate

`func (o *ModForumSetPinStateRequest) SetTargetstate(v int32)`

SetTargetstate sets Targetstate field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


