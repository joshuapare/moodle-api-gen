# ModForumSetPinState200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Capabilities** | [**ModForumSetPinState200ResponseCapabilities**](ModForumSetPinState200ResponseCapabilities.md) |  | 
**Firstpostid** | **int32** | firstpostid | [default to null]
**Forumid** | **int32** | forumid | [default to null]
**Group** | Pointer to [**ModForumSetPinState200ResponseGroup**](ModForumSetPinState200ResponseGroup.md) |  | [optional] 
**Id** | **int32** | id | 
**Istimelocked** | **bool** | istimelocked | [default to null]
**Locked** | **bool** | locked | [default to null]
**Name** | **string** | name | 
**Pinned** | **bool** | pinned | [default to null]
**Timed** | [**ModForumSetPinState200ResponseTimed**](ModForumSetPinState200ResponseTimed.md) |  | 
**Times** | [**ModForumSetPinState200ResponseTimes**](ModForumSetPinState200ResponseTimes.md) |  | 
**Urls** | [**ModForumSetPinState200ResponseUrls**](ModForumSetPinState200ResponseUrls.md) |  | 
**Userstate** | [**ModForumSetPinState200ResponseUserstate**](ModForumSetPinState200ResponseUserstate.md) |  | 

## Methods

### NewModForumSetPinState200Response

`func NewModForumSetPinState200Response(capabilities ModForumSetPinState200ResponseCapabilities, firstpostid int32, forumid int32, id int32, istimelocked bool, locked bool, name string, pinned bool, timed ModForumSetPinState200ResponseTimed, times ModForumSetPinState200ResponseTimes, urls ModForumSetPinState200ResponseUrls, userstate ModForumSetPinState200ResponseUserstate, ) *ModForumSetPinState200Response`

NewModForumSetPinState200Response instantiates a new ModForumSetPinState200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumSetPinState200ResponseWithDefaults

`func NewModForumSetPinState200ResponseWithDefaults() *ModForumSetPinState200Response`

NewModForumSetPinState200ResponseWithDefaults instantiates a new ModForumSetPinState200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCapabilities

`func (o *ModForumSetPinState200Response) GetCapabilities() ModForumSetPinState200ResponseCapabilities`

GetCapabilities returns the Capabilities field if non-nil, zero value otherwise.

### GetCapabilitiesOk

`func (o *ModForumSetPinState200Response) GetCapabilitiesOk() (*ModForumSetPinState200ResponseCapabilities, bool)`

GetCapabilitiesOk returns a tuple with the Capabilities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCapabilities

`func (o *ModForumSetPinState200Response) SetCapabilities(v ModForumSetPinState200ResponseCapabilities)`

SetCapabilities sets Capabilities field to given value.


### GetFirstpostid

`func (o *ModForumSetPinState200Response) GetFirstpostid() int32`

GetFirstpostid returns the Firstpostid field if non-nil, zero value otherwise.

### GetFirstpostidOk

`func (o *ModForumSetPinState200Response) GetFirstpostidOk() (*int32, bool)`

GetFirstpostidOk returns a tuple with the Firstpostid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstpostid

`func (o *ModForumSetPinState200Response) SetFirstpostid(v int32)`

SetFirstpostid sets Firstpostid field to given value.


### GetForumid

`func (o *ModForumSetPinState200Response) GetForumid() int32`

GetForumid returns the Forumid field if non-nil, zero value otherwise.

### GetForumidOk

`func (o *ModForumSetPinState200Response) GetForumidOk() (*int32, bool)`

GetForumidOk returns a tuple with the Forumid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForumid

`func (o *ModForumSetPinState200Response) SetForumid(v int32)`

SetForumid sets Forumid field to given value.


### GetGroup

`func (o *ModForumSetPinState200Response) GetGroup() ModForumSetPinState200ResponseGroup`

GetGroup returns the Group field if non-nil, zero value otherwise.

### GetGroupOk

`func (o *ModForumSetPinState200Response) GetGroupOk() (*ModForumSetPinState200ResponseGroup, bool)`

GetGroupOk returns a tuple with the Group field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroup

`func (o *ModForumSetPinState200Response) SetGroup(v ModForumSetPinState200ResponseGroup)`

SetGroup sets Group field to given value.

### HasGroup

`func (o *ModForumSetPinState200Response) HasGroup() bool`

HasGroup returns a boolean if a field has been set.

### GetId

`func (o *ModForumSetPinState200Response) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModForumSetPinState200Response) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModForumSetPinState200Response) SetId(v int32)`

SetId sets Id field to given value.


### GetIstimelocked

`func (o *ModForumSetPinState200Response) GetIstimelocked() bool`

GetIstimelocked returns the Istimelocked field if non-nil, zero value otherwise.

### GetIstimelockedOk

`func (o *ModForumSetPinState200Response) GetIstimelockedOk() (*bool, bool)`

GetIstimelockedOk returns a tuple with the Istimelocked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIstimelocked

`func (o *ModForumSetPinState200Response) SetIstimelocked(v bool)`

SetIstimelocked sets Istimelocked field to given value.


### GetLocked

`func (o *ModForumSetPinState200Response) GetLocked() bool`

GetLocked returns the Locked field if non-nil, zero value otherwise.

### GetLockedOk

`func (o *ModForumSetPinState200Response) GetLockedOk() (*bool, bool)`

GetLockedOk returns a tuple with the Locked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocked

`func (o *ModForumSetPinState200Response) SetLocked(v bool)`

SetLocked sets Locked field to given value.


### GetName

`func (o *ModForumSetPinState200Response) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModForumSetPinState200Response) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModForumSetPinState200Response) SetName(v string)`

SetName sets Name field to given value.


### GetPinned

`func (o *ModForumSetPinState200Response) GetPinned() bool`

GetPinned returns the Pinned field if non-nil, zero value otherwise.

### GetPinnedOk

`func (o *ModForumSetPinState200Response) GetPinnedOk() (*bool, bool)`

GetPinnedOk returns a tuple with the Pinned field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinned

`func (o *ModForumSetPinState200Response) SetPinned(v bool)`

SetPinned sets Pinned field to given value.


### GetTimed

`func (o *ModForumSetPinState200Response) GetTimed() ModForumSetPinState200ResponseTimed`

GetTimed returns the Timed field if non-nil, zero value otherwise.

### GetTimedOk

`func (o *ModForumSetPinState200Response) GetTimedOk() (*ModForumSetPinState200ResponseTimed, bool)`

GetTimedOk returns a tuple with the Timed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimed

`func (o *ModForumSetPinState200Response) SetTimed(v ModForumSetPinState200ResponseTimed)`

SetTimed sets Timed field to given value.


### GetTimes

`func (o *ModForumSetPinState200Response) GetTimes() ModForumSetPinState200ResponseTimes`

GetTimes returns the Times field if non-nil, zero value otherwise.

### GetTimesOk

`func (o *ModForumSetPinState200Response) GetTimesOk() (*ModForumSetPinState200ResponseTimes, bool)`

GetTimesOk returns a tuple with the Times field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimes

`func (o *ModForumSetPinState200Response) SetTimes(v ModForumSetPinState200ResponseTimes)`

SetTimes sets Times field to given value.


### GetUrls

`func (o *ModForumSetPinState200Response) GetUrls() ModForumSetPinState200ResponseUrls`

GetUrls returns the Urls field if non-nil, zero value otherwise.

### GetUrlsOk

`func (o *ModForumSetPinState200Response) GetUrlsOk() (*ModForumSetPinState200ResponseUrls, bool)`

GetUrlsOk returns a tuple with the Urls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrls

`func (o *ModForumSetPinState200Response) SetUrls(v ModForumSetPinState200ResponseUrls)`

SetUrls sets Urls field to given value.


### GetUserstate

`func (o *ModForumSetPinState200Response) GetUserstate() ModForumSetPinState200ResponseUserstate`

GetUserstate returns the Userstate field if non-nil, zero value otherwise.

### GetUserstateOk

`func (o *ModForumSetPinState200Response) GetUserstateOk() (*ModForumSetPinState200ResponseUserstate, bool)`

GetUserstateOk returns a tuple with the Userstate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserstate

`func (o *ModForumSetPinState200Response) SetUserstate(v ModForumSetPinState200ResponseUserstate)`

SetUserstate sets Userstate field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


