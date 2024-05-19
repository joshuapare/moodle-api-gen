# ModForumSetLockState200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | The discussion we are locking. | [default to null]
**Locked** | **bool** | The locked state of the discussion. | [default to null]
**Times** | [**ModForumSetLockState200ResponseTimes**](ModForumSetLockState200ResponseTimes.md) |  | 

## Methods

### NewModForumSetLockState200Response

`func NewModForumSetLockState200Response(id int32, locked bool, times ModForumSetLockState200ResponseTimes, ) *ModForumSetLockState200Response`

NewModForumSetLockState200Response instantiates a new ModForumSetLockState200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumSetLockState200ResponseWithDefaults

`func NewModForumSetLockState200ResponseWithDefaults() *ModForumSetLockState200Response`

NewModForumSetLockState200ResponseWithDefaults instantiates a new ModForumSetLockState200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ModForumSetLockState200Response) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModForumSetLockState200Response) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModForumSetLockState200Response) SetId(v int32)`

SetId sets Id field to given value.


### GetLocked

`func (o *ModForumSetLockState200Response) GetLocked() bool`

GetLocked returns the Locked field if non-nil, zero value otherwise.

### GetLockedOk

`func (o *ModForumSetLockState200Response) GetLockedOk() (*bool, bool)`

GetLockedOk returns a tuple with the Locked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocked

`func (o *ModForumSetLockState200Response) SetLocked(v bool)`

SetLocked sets Locked field to given value.


### GetTimes

`func (o *ModForumSetLockState200Response) GetTimes() ModForumSetLockState200ResponseTimes`

GetTimes returns the Times field if non-nil, zero value otherwise.

### GetTimesOk

`func (o *ModForumSetLockState200Response) GetTimesOk() (*ModForumSetLockState200ResponseTimes, bool)`

GetTimesOk returns a tuple with the Times field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimes

`func (o *ModForumSetLockState200Response) SetTimes(v ModForumSetLockState200ResponseTimes)`

SetTimes sets Times field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


