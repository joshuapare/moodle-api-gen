# CoreCompletionOverrideActivityCompletionStatusRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cmid** | **int32** | course module id | [default to null]
**Newstate** | **int32** | the new activity completion state | [default to null]
**Userid** | **int32** | user id | 

## Methods

### NewCoreCompletionOverrideActivityCompletionStatusRequest

`func NewCoreCompletionOverrideActivityCompletionStatusRequest(cmid int32, newstate int32, userid int32, ) *CoreCompletionOverrideActivityCompletionStatusRequest`

NewCoreCompletionOverrideActivityCompletionStatusRequest instantiates a new CoreCompletionOverrideActivityCompletionStatusRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompletionOverrideActivityCompletionStatusRequestWithDefaults

`func NewCoreCompletionOverrideActivityCompletionStatusRequestWithDefaults() *CoreCompletionOverrideActivityCompletionStatusRequest`

NewCoreCompletionOverrideActivityCompletionStatusRequestWithDefaults instantiates a new CoreCompletionOverrideActivityCompletionStatusRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCmid

`func (o *CoreCompletionOverrideActivityCompletionStatusRequest) GetCmid() int32`

GetCmid returns the Cmid field if non-nil, zero value otherwise.

### GetCmidOk

`func (o *CoreCompletionOverrideActivityCompletionStatusRequest) GetCmidOk() (*int32, bool)`

GetCmidOk returns a tuple with the Cmid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCmid

`func (o *CoreCompletionOverrideActivityCompletionStatusRequest) SetCmid(v int32)`

SetCmid sets Cmid field to given value.


### GetNewstate

`func (o *CoreCompletionOverrideActivityCompletionStatusRequest) GetNewstate() int32`

GetNewstate returns the Newstate field if non-nil, zero value otherwise.

### GetNewstateOk

`func (o *CoreCompletionOverrideActivityCompletionStatusRequest) GetNewstateOk() (*int32, bool)`

GetNewstateOk returns a tuple with the Newstate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNewstate

`func (o *CoreCompletionOverrideActivityCompletionStatusRequest) SetNewstate(v int32)`

SetNewstate sets Newstate field to given value.


### GetUserid

`func (o *CoreCompletionOverrideActivityCompletionStatusRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreCompletionOverrideActivityCompletionStatusRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreCompletionOverrideActivityCompletionStatusRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


