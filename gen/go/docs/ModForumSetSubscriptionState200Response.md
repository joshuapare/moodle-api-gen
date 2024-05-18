# ModForumSetSubscriptionState200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Capabilities** | [**ModForumSetSubscriptionState200ResponseCapabilities**](ModForumSetSubscriptionState200ResponseCapabilities.md) |  | 
**Firstpostid** | **int32** | firstpostid | 
**Forumid** | **int32** | forumid | 
**Group** | Pointer to [**ModForumSetSubscriptionState200ResponseGroup**](ModForumSetSubscriptionState200ResponseGroup.md) |  | [optional] 
**Id** | **int32** | id | 
**Istimelocked** | **bool** | istimelocked | 
**Locked** | **bool** | locked | 
**Name** | **string** | name | 
**Pinned** | **bool** | pinned | 
**Timed** | [**ModForumSetSubscriptionState200ResponseTimed**](ModForumSetSubscriptionState200ResponseTimed.md) |  | 
**Times** | [**ModForumSetSubscriptionState200ResponseTimes**](ModForumSetSubscriptionState200ResponseTimes.md) |  | 
**Urls** | [**ModForumSetSubscriptionState200ResponseUrls**](ModForumSetSubscriptionState200ResponseUrls.md) |  | 
**Userstate** | [**ModForumSetSubscriptionState200ResponseUserstate**](ModForumSetSubscriptionState200ResponseUserstate.md) |  | 

## Methods

### NewModForumSetSubscriptionState200Response

`func NewModForumSetSubscriptionState200Response(capabilities ModForumSetSubscriptionState200ResponseCapabilities, firstpostid int32, forumid int32, id int32, istimelocked bool, locked bool, name string, pinned bool, timed ModForumSetSubscriptionState200ResponseTimed, times ModForumSetSubscriptionState200ResponseTimes, urls ModForumSetSubscriptionState200ResponseUrls, userstate ModForumSetSubscriptionState200ResponseUserstate, ) *ModForumSetSubscriptionState200Response`

NewModForumSetSubscriptionState200Response instantiates a new ModForumSetSubscriptionState200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumSetSubscriptionState200ResponseWithDefaults

`func NewModForumSetSubscriptionState200ResponseWithDefaults() *ModForumSetSubscriptionState200Response`

NewModForumSetSubscriptionState200ResponseWithDefaults instantiates a new ModForumSetSubscriptionState200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCapabilities

`func (o *ModForumSetSubscriptionState200Response) GetCapabilities() ModForumSetSubscriptionState200ResponseCapabilities`

GetCapabilities returns the Capabilities field if non-nil, zero value otherwise.

### GetCapabilitiesOk

`func (o *ModForumSetSubscriptionState200Response) GetCapabilitiesOk() (*ModForumSetSubscriptionState200ResponseCapabilities, bool)`

GetCapabilitiesOk returns a tuple with the Capabilities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCapabilities

`func (o *ModForumSetSubscriptionState200Response) SetCapabilities(v ModForumSetSubscriptionState200ResponseCapabilities)`

SetCapabilities sets Capabilities field to given value.


### GetFirstpostid

`func (o *ModForumSetSubscriptionState200Response) GetFirstpostid() int32`

GetFirstpostid returns the Firstpostid field if non-nil, zero value otherwise.

### GetFirstpostidOk

`func (o *ModForumSetSubscriptionState200Response) GetFirstpostidOk() (*int32, bool)`

GetFirstpostidOk returns a tuple with the Firstpostid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstpostid

`func (o *ModForumSetSubscriptionState200Response) SetFirstpostid(v int32)`

SetFirstpostid sets Firstpostid field to given value.


### GetForumid

`func (o *ModForumSetSubscriptionState200Response) GetForumid() int32`

GetForumid returns the Forumid field if non-nil, zero value otherwise.

### GetForumidOk

`func (o *ModForumSetSubscriptionState200Response) GetForumidOk() (*int32, bool)`

GetForumidOk returns a tuple with the Forumid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForumid

`func (o *ModForumSetSubscriptionState200Response) SetForumid(v int32)`

SetForumid sets Forumid field to given value.


### GetGroup

`func (o *ModForumSetSubscriptionState200Response) GetGroup() ModForumSetSubscriptionState200ResponseGroup`

GetGroup returns the Group field if non-nil, zero value otherwise.

### GetGroupOk

`func (o *ModForumSetSubscriptionState200Response) GetGroupOk() (*ModForumSetSubscriptionState200ResponseGroup, bool)`

GetGroupOk returns a tuple with the Group field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroup

`func (o *ModForumSetSubscriptionState200Response) SetGroup(v ModForumSetSubscriptionState200ResponseGroup)`

SetGroup sets Group field to given value.

### HasGroup

`func (o *ModForumSetSubscriptionState200Response) HasGroup() bool`

HasGroup returns a boolean if a field has been set.

### GetId

`func (o *ModForumSetSubscriptionState200Response) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModForumSetSubscriptionState200Response) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModForumSetSubscriptionState200Response) SetId(v int32)`

SetId sets Id field to given value.


### GetIstimelocked

`func (o *ModForumSetSubscriptionState200Response) GetIstimelocked() bool`

GetIstimelocked returns the Istimelocked field if non-nil, zero value otherwise.

### GetIstimelockedOk

`func (o *ModForumSetSubscriptionState200Response) GetIstimelockedOk() (*bool, bool)`

GetIstimelockedOk returns a tuple with the Istimelocked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIstimelocked

`func (o *ModForumSetSubscriptionState200Response) SetIstimelocked(v bool)`

SetIstimelocked sets Istimelocked field to given value.


### GetLocked

`func (o *ModForumSetSubscriptionState200Response) GetLocked() bool`

GetLocked returns the Locked field if non-nil, zero value otherwise.

### GetLockedOk

`func (o *ModForumSetSubscriptionState200Response) GetLockedOk() (*bool, bool)`

GetLockedOk returns a tuple with the Locked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocked

`func (o *ModForumSetSubscriptionState200Response) SetLocked(v bool)`

SetLocked sets Locked field to given value.


### GetName

`func (o *ModForumSetSubscriptionState200Response) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModForumSetSubscriptionState200Response) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModForumSetSubscriptionState200Response) SetName(v string)`

SetName sets Name field to given value.


### GetPinned

`func (o *ModForumSetSubscriptionState200Response) GetPinned() bool`

GetPinned returns the Pinned field if non-nil, zero value otherwise.

### GetPinnedOk

`func (o *ModForumSetSubscriptionState200Response) GetPinnedOk() (*bool, bool)`

GetPinnedOk returns a tuple with the Pinned field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinned

`func (o *ModForumSetSubscriptionState200Response) SetPinned(v bool)`

SetPinned sets Pinned field to given value.


### GetTimed

`func (o *ModForumSetSubscriptionState200Response) GetTimed() ModForumSetSubscriptionState200ResponseTimed`

GetTimed returns the Timed field if non-nil, zero value otherwise.

### GetTimedOk

`func (o *ModForumSetSubscriptionState200Response) GetTimedOk() (*ModForumSetSubscriptionState200ResponseTimed, bool)`

GetTimedOk returns a tuple with the Timed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimed

`func (o *ModForumSetSubscriptionState200Response) SetTimed(v ModForumSetSubscriptionState200ResponseTimed)`

SetTimed sets Timed field to given value.


### GetTimes

`func (o *ModForumSetSubscriptionState200Response) GetTimes() ModForumSetSubscriptionState200ResponseTimes`

GetTimes returns the Times field if non-nil, zero value otherwise.

### GetTimesOk

`func (o *ModForumSetSubscriptionState200Response) GetTimesOk() (*ModForumSetSubscriptionState200ResponseTimes, bool)`

GetTimesOk returns a tuple with the Times field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimes

`func (o *ModForumSetSubscriptionState200Response) SetTimes(v ModForumSetSubscriptionState200ResponseTimes)`

SetTimes sets Times field to given value.


### GetUrls

`func (o *ModForumSetSubscriptionState200Response) GetUrls() ModForumSetSubscriptionState200ResponseUrls`

GetUrls returns the Urls field if non-nil, zero value otherwise.

### GetUrlsOk

`func (o *ModForumSetSubscriptionState200Response) GetUrlsOk() (*ModForumSetSubscriptionState200ResponseUrls, bool)`

GetUrlsOk returns a tuple with the Urls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrls

`func (o *ModForumSetSubscriptionState200Response) SetUrls(v ModForumSetSubscriptionState200ResponseUrls)`

SetUrls sets Urls field to given value.


### GetUserstate

`func (o *ModForumSetSubscriptionState200Response) GetUserstate() ModForumSetSubscriptionState200ResponseUserstate`

GetUserstate returns the Userstate field if non-nil, zero value otherwise.

### GetUserstateOk

`func (o *ModForumSetSubscriptionState200Response) GetUserstateOk() (*ModForumSetSubscriptionState200ResponseUserstate, bool)`

GetUserstateOk returns a tuple with the Userstate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserstate

`func (o *ModForumSetSubscriptionState200Response) SetUserstate(v ModForumSetSubscriptionState200ResponseUserstate)`

SetUserstate sets Userstate field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


