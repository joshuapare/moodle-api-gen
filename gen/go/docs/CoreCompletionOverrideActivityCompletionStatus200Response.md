# CoreCompletionOverrideActivityCompletionStatus200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cmid** | **int32** | The course module id | 
**Overrideby** | **int32** | The user id who has overriden the status, or null | 
**State** | **int32** | The current completion state. | [default to null]
**Timecompleted** | **int32** | time of completion | [default to null]
**Tracking** | **int32** | type of tracking:                                                                     0 means none, 1 manual, 2 automatic | [default to null]
**Userid** | **int32** | The user id to which the completion info belongs | [default to null]

## Methods

### NewCoreCompletionOverrideActivityCompletionStatus200Response

`func NewCoreCompletionOverrideActivityCompletionStatus200Response(cmid int32, overrideby int32, state int32, timecompleted int32, tracking int32, userid int32, ) *CoreCompletionOverrideActivityCompletionStatus200Response`

NewCoreCompletionOverrideActivityCompletionStatus200Response instantiates a new CoreCompletionOverrideActivityCompletionStatus200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompletionOverrideActivityCompletionStatus200ResponseWithDefaults

`func NewCoreCompletionOverrideActivityCompletionStatus200ResponseWithDefaults() *CoreCompletionOverrideActivityCompletionStatus200Response`

NewCoreCompletionOverrideActivityCompletionStatus200ResponseWithDefaults instantiates a new CoreCompletionOverrideActivityCompletionStatus200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCmid

`func (o *CoreCompletionOverrideActivityCompletionStatus200Response) GetCmid() int32`

GetCmid returns the Cmid field if non-nil, zero value otherwise.

### GetCmidOk

`func (o *CoreCompletionOverrideActivityCompletionStatus200Response) GetCmidOk() (*int32, bool)`

GetCmidOk returns a tuple with the Cmid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCmid

`func (o *CoreCompletionOverrideActivityCompletionStatus200Response) SetCmid(v int32)`

SetCmid sets Cmid field to given value.


### GetOverrideby

`func (o *CoreCompletionOverrideActivityCompletionStatus200Response) GetOverrideby() int32`

GetOverrideby returns the Overrideby field if non-nil, zero value otherwise.

### GetOverridebyOk

`func (o *CoreCompletionOverrideActivityCompletionStatus200Response) GetOverridebyOk() (*int32, bool)`

GetOverridebyOk returns a tuple with the Overrideby field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOverrideby

`func (o *CoreCompletionOverrideActivityCompletionStatus200Response) SetOverrideby(v int32)`

SetOverrideby sets Overrideby field to given value.


### GetState

`func (o *CoreCompletionOverrideActivityCompletionStatus200Response) GetState() int32`

GetState returns the State field if non-nil, zero value otherwise.

### GetStateOk

`func (o *CoreCompletionOverrideActivityCompletionStatus200Response) GetStateOk() (*int32, bool)`

GetStateOk returns a tuple with the State field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetState

`func (o *CoreCompletionOverrideActivityCompletionStatus200Response) SetState(v int32)`

SetState sets State field to given value.


### GetTimecompleted

`func (o *CoreCompletionOverrideActivityCompletionStatus200Response) GetTimecompleted() int32`

GetTimecompleted returns the Timecompleted field if non-nil, zero value otherwise.

### GetTimecompletedOk

`func (o *CoreCompletionOverrideActivityCompletionStatus200Response) GetTimecompletedOk() (*int32, bool)`

GetTimecompletedOk returns a tuple with the Timecompleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecompleted

`func (o *CoreCompletionOverrideActivityCompletionStatus200Response) SetTimecompleted(v int32)`

SetTimecompleted sets Timecompleted field to given value.


### GetTracking

`func (o *CoreCompletionOverrideActivityCompletionStatus200Response) GetTracking() int32`

GetTracking returns the Tracking field if non-nil, zero value otherwise.

### GetTrackingOk

`func (o *CoreCompletionOverrideActivityCompletionStatus200Response) GetTrackingOk() (*int32, bool)`

GetTrackingOk returns a tuple with the Tracking field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTracking

`func (o *CoreCompletionOverrideActivityCompletionStatus200Response) SetTracking(v int32)`

SetTracking sets Tracking field to given value.


### GetUserid

`func (o *CoreCompletionOverrideActivityCompletionStatus200Response) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreCompletionOverrideActivityCompletionStatus200Response) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreCompletionOverrideActivityCompletionStatus200Response) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


