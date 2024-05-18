# ModScormLaunchScoRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Scoid** | Pointer to **int32** | SCO id (empty for launching the first SCO) | [optional] [default to 0]
**Scormid** | **int32** | SCORM instance id | 

## Methods

### NewModScormLaunchScoRequest

`func NewModScormLaunchScoRequest(scormid int32, ) *ModScormLaunchScoRequest`

NewModScormLaunchScoRequest instantiates a new ModScormLaunchScoRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModScormLaunchScoRequestWithDefaults

`func NewModScormLaunchScoRequestWithDefaults() *ModScormLaunchScoRequest`

NewModScormLaunchScoRequestWithDefaults instantiates a new ModScormLaunchScoRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetScoid

`func (o *ModScormLaunchScoRequest) GetScoid() int32`

GetScoid returns the Scoid field if non-nil, zero value otherwise.

### GetScoidOk

`func (o *ModScormLaunchScoRequest) GetScoidOk() (*int32, bool)`

GetScoidOk returns a tuple with the Scoid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScoid

`func (o *ModScormLaunchScoRequest) SetScoid(v int32)`

SetScoid sets Scoid field to given value.

### HasScoid

`func (o *ModScormLaunchScoRequest) HasScoid() bool`

HasScoid returns a boolean if a field has been set.

### GetScormid

`func (o *ModScormLaunchScoRequest) GetScormid() int32`

GetScormid returns the Scormid field if non-nil, zero value otherwise.

### GetScormidOk

`func (o *ModScormLaunchScoRequest) GetScormidOk() (*int32, bool)`

GetScormidOk returns a tuple with the Scormid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScormid

`func (o *ModScormLaunchScoRequest) SetScormid(v int32)`

SetScormid sets Scormid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


