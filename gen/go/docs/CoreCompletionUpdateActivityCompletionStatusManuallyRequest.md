# CoreCompletionUpdateActivityCompletionStatusManuallyRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cmid** | **int32** | course module id | 
**Completed** | **bool** | activity completed or not | [default to null]

## Methods

### NewCoreCompletionUpdateActivityCompletionStatusManuallyRequest

`func NewCoreCompletionUpdateActivityCompletionStatusManuallyRequest(cmid int32, completed bool, ) *CoreCompletionUpdateActivityCompletionStatusManuallyRequest`

NewCoreCompletionUpdateActivityCompletionStatusManuallyRequest instantiates a new CoreCompletionUpdateActivityCompletionStatusManuallyRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompletionUpdateActivityCompletionStatusManuallyRequestWithDefaults

`func NewCoreCompletionUpdateActivityCompletionStatusManuallyRequestWithDefaults() *CoreCompletionUpdateActivityCompletionStatusManuallyRequest`

NewCoreCompletionUpdateActivityCompletionStatusManuallyRequestWithDefaults instantiates a new CoreCompletionUpdateActivityCompletionStatusManuallyRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCmid

`func (o *CoreCompletionUpdateActivityCompletionStatusManuallyRequest) GetCmid() int32`

GetCmid returns the Cmid field if non-nil, zero value otherwise.

### GetCmidOk

`func (o *CoreCompletionUpdateActivityCompletionStatusManuallyRequest) GetCmidOk() (*int32, bool)`

GetCmidOk returns a tuple with the Cmid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCmid

`func (o *CoreCompletionUpdateActivityCompletionStatusManuallyRequest) SetCmid(v int32)`

SetCmid sets Cmid field to given value.


### GetCompleted

`func (o *CoreCompletionUpdateActivityCompletionStatusManuallyRequest) GetCompleted() bool`

GetCompleted returns the Completed field if non-nil, zero value otherwise.

### GetCompletedOk

`func (o *CoreCompletionUpdateActivityCompletionStatusManuallyRequest) GetCompletedOk() (*bool, bool)`

GetCompletedOk returns a tuple with the Completed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompleted

`func (o *CoreCompletionUpdateActivityCompletionStatusManuallyRequest) SetCompleted(v bool)`

SetCompleted sets Completed field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


