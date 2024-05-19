# CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cmid** | Pointer to **int32** | course module ID | [optional] [default to null]
**Details** | Pointer to [**[]CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner**](CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner.md) |  | [optional] 
**Hascompletion** | Pointer to **bool** | Whether this activity module has completion enabled | [optional] [default to null]
**Instance** | Pointer to **int32** | instance ID | [optional] [default to null]
**Isautomatic** | Pointer to **bool** | Whether this activity module instance tracks completion automatically. | [optional] [default to null]
**Istrackeduser** | Pointer to **bool** | Whether completion is being tracked for this user. | [optional] [default to null]
**Modname** | Pointer to **string** | activity module name | [optional] [default to "null"]
**Overrideby** | Pointer to **int32** | The user id who has overriden the status, or null | [optional] [default to null]
**State** | Pointer to **int32** | Completion state value:                                     0 means incomplete,                                     1 complete,                                     2 complete pass,                                     3 complete fail | [optional] [default to null]
**Timecompleted** | Pointer to **int32** | timestamp for completed activity | [optional] [default to null]
**Tracking** | Pointer to **int32** | type of tracking:                                     0 means none,                                     1 manual,                                     2 automatic | [optional] [default to null]
**Uservisible** | Pointer to **bool** | Whether this activity is visible to the user. | [optional] [default to null]
**Valueused** | Pointer to **bool** | Whether the completion status affects the availability of another activity. | [optional] [default to null]

## Methods

### NewCoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner

`func NewCoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner() *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner`

NewCoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner instantiates a new CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerWithDefaults

`func NewCoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerWithDefaults() *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner`

NewCoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerWithDefaults instantiates a new CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCmid

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) GetCmid() int32`

GetCmid returns the Cmid field if non-nil, zero value otherwise.

### GetCmidOk

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) GetCmidOk() (*int32, bool)`

GetCmidOk returns a tuple with the Cmid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCmid

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) SetCmid(v int32)`

SetCmid sets Cmid field to given value.

### HasCmid

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) HasCmid() bool`

HasCmid returns a boolean if a field has been set.

### GetDetails

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) GetDetails() []CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner`

GetDetails returns the Details field if non-nil, zero value otherwise.

### GetDetailsOk

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) GetDetailsOk() (*[]CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner, bool)`

GetDetailsOk returns a tuple with the Details field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDetails

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) SetDetails(v []CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner)`

SetDetails sets Details field to given value.

### HasDetails

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) HasDetails() bool`

HasDetails returns a boolean if a field has been set.

### GetHascompletion

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) GetHascompletion() bool`

GetHascompletion returns the Hascompletion field if non-nil, zero value otherwise.

### GetHascompletionOk

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) GetHascompletionOk() (*bool, bool)`

GetHascompletionOk returns a tuple with the Hascompletion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHascompletion

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) SetHascompletion(v bool)`

SetHascompletion sets Hascompletion field to given value.

### HasHascompletion

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) HasHascompletion() bool`

HasHascompletion returns a boolean if a field has been set.

### GetInstance

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) GetInstance() int32`

GetInstance returns the Instance field if non-nil, zero value otherwise.

### GetInstanceOk

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) GetInstanceOk() (*int32, bool)`

GetInstanceOk returns a tuple with the Instance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstance

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) SetInstance(v int32)`

SetInstance sets Instance field to given value.

### HasInstance

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) HasInstance() bool`

HasInstance returns a boolean if a field has been set.

### GetIsautomatic

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) GetIsautomatic() bool`

GetIsautomatic returns the Isautomatic field if non-nil, zero value otherwise.

### GetIsautomaticOk

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) GetIsautomaticOk() (*bool, bool)`

GetIsautomaticOk returns a tuple with the Isautomatic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsautomatic

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) SetIsautomatic(v bool)`

SetIsautomatic sets Isautomatic field to given value.

### HasIsautomatic

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) HasIsautomatic() bool`

HasIsautomatic returns a boolean if a field has been set.

### GetIstrackeduser

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) GetIstrackeduser() bool`

GetIstrackeduser returns the Istrackeduser field if non-nil, zero value otherwise.

### GetIstrackeduserOk

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) GetIstrackeduserOk() (*bool, bool)`

GetIstrackeduserOk returns a tuple with the Istrackeduser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIstrackeduser

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) SetIstrackeduser(v bool)`

SetIstrackeduser sets Istrackeduser field to given value.

### HasIstrackeduser

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) HasIstrackeduser() bool`

HasIstrackeduser returns a boolean if a field has been set.

### GetModname

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) GetModname() string`

GetModname returns the Modname field if non-nil, zero value otherwise.

### GetModnameOk

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) GetModnameOk() (*string, bool)`

GetModnameOk returns a tuple with the Modname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModname

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) SetModname(v string)`

SetModname sets Modname field to given value.

### HasModname

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) HasModname() bool`

HasModname returns a boolean if a field has been set.

### GetOverrideby

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) GetOverrideby() int32`

GetOverrideby returns the Overrideby field if non-nil, zero value otherwise.

### GetOverridebyOk

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) GetOverridebyOk() (*int32, bool)`

GetOverridebyOk returns a tuple with the Overrideby field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOverrideby

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) SetOverrideby(v int32)`

SetOverrideby sets Overrideby field to given value.

### HasOverrideby

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) HasOverrideby() bool`

HasOverrideby returns a boolean if a field has been set.

### GetState

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) GetState() int32`

GetState returns the State field if non-nil, zero value otherwise.

### GetStateOk

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) GetStateOk() (*int32, bool)`

GetStateOk returns a tuple with the State field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetState

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) SetState(v int32)`

SetState sets State field to given value.

### HasState

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) HasState() bool`

HasState returns a boolean if a field has been set.

### GetTimecompleted

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) GetTimecompleted() int32`

GetTimecompleted returns the Timecompleted field if non-nil, zero value otherwise.

### GetTimecompletedOk

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) GetTimecompletedOk() (*int32, bool)`

GetTimecompletedOk returns a tuple with the Timecompleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecompleted

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) SetTimecompleted(v int32)`

SetTimecompleted sets Timecompleted field to given value.

### HasTimecompleted

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) HasTimecompleted() bool`

HasTimecompleted returns a boolean if a field has been set.

### GetTracking

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) GetTracking() int32`

GetTracking returns the Tracking field if non-nil, zero value otherwise.

### GetTrackingOk

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) GetTrackingOk() (*int32, bool)`

GetTrackingOk returns a tuple with the Tracking field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTracking

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) SetTracking(v int32)`

SetTracking sets Tracking field to given value.

### HasTracking

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) HasTracking() bool`

HasTracking returns a boolean if a field has been set.

### GetUservisible

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) GetUservisible() bool`

GetUservisible returns the Uservisible field if non-nil, zero value otherwise.

### GetUservisibleOk

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) GetUservisibleOk() (*bool, bool)`

GetUservisibleOk returns a tuple with the Uservisible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUservisible

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) SetUservisible(v bool)`

SetUservisible sets Uservisible field to given value.

### HasUservisible

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) HasUservisible() bool`

HasUservisible returns a boolean if a field has been set.

### GetValueused

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) GetValueused() bool`

GetValueused returns the Valueused field if non-nil, zero value otherwise.

### GetValueusedOk

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) GetValueusedOk() (*bool, bool)`

GetValueusedOk returns a tuple with the Valueused field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValueused

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) SetValueused(v bool)`

SetValueused sets Valueused field to given value.

### HasValueused

`func (o *CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner) HasValueused() bool`

HasValueused returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


