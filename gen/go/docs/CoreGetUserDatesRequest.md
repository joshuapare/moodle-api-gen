# CoreGetUserDatesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Contextid** | Pointer to **int32** | Context ID. Either use this value, or level and instanceid. | [optional] [default to 0]
**Contextlevel** | Pointer to **string** | Context level. To be used with instanceid. | [optional] [default to ""]
**Instanceid** | Pointer to **int32** | Context instance ID. To be used with level | [optional] [default to 0]
**Timestamps** | [**[]CoreGetUserDatesRequestTimestampsInner**](CoreGetUserDatesRequestTimestampsInner.md) |  | 

## Methods

### NewCoreGetUserDatesRequest

`func NewCoreGetUserDatesRequest(timestamps []CoreGetUserDatesRequestTimestampsInner, ) *CoreGetUserDatesRequest`

NewCoreGetUserDatesRequest instantiates a new CoreGetUserDatesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGetUserDatesRequestWithDefaults

`func NewCoreGetUserDatesRequestWithDefaults() *CoreGetUserDatesRequest`

NewCoreGetUserDatesRequestWithDefaults instantiates a new CoreGetUserDatesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContextid

`func (o *CoreGetUserDatesRequest) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *CoreGetUserDatesRequest) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *CoreGetUserDatesRequest) SetContextid(v int32)`

SetContextid sets Contextid field to given value.

### HasContextid

`func (o *CoreGetUserDatesRequest) HasContextid() bool`

HasContextid returns a boolean if a field has been set.

### GetContextlevel

`func (o *CoreGetUserDatesRequest) GetContextlevel() string`

GetContextlevel returns the Contextlevel field if non-nil, zero value otherwise.

### GetContextlevelOk

`func (o *CoreGetUserDatesRequest) GetContextlevelOk() (*string, bool)`

GetContextlevelOk returns a tuple with the Contextlevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextlevel

`func (o *CoreGetUserDatesRequest) SetContextlevel(v string)`

SetContextlevel sets Contextlevel field to given value.

### HasContextlevel

`func (o *CoreGetUserDatesRequest) HasContextlevel() bool`

HasContextlevel returns a boolean if a field has been set.

### GetInstanceid

`func (o *CoreGetUserDatesRequest) GetInstanceid() int32`

GetInstanceid returns the Instanceid field if non-nil, zero value otherwise.

### GetInstanceidOk

`func (o *CoreGetUserDatesRequest) GetInstanceidOk() (*int32, bool)`

GetInstanceidOk returns a tuple with the Instanceid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstanceid

`func (o *CoreGetUserDatesRequest) SetInstanceid(v int32)`

SetInstanceid sets Instanceid field to given value.

### HasInstanceid

`func (o *CoreGetUserDatesRequest) HasInstanceid() bool`

HasInstanceid returns a boolean if a field has been set.

### GetTimestamps

`func (o *CoreGetUserDatesRequest) GetTimestamps() []CoreGetUserDatesRequestTimestampsInner`

GetTimestamps returns the Timestamps field if non-nil, zero value otherwise.

### GetTimestampsOk

`func (o *CoreGetUserDatesRequest) GetTimestampsOk() (*[]CoreGetUserDatesRequestTimestampsInner, bool)`

GetTimestampsOk returns a tuple with the Timestamps field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestamps

`func (o *CoreGetUserDatesRequest) SetTimestamps(v []CoreGetUserDatesRequestTimestampsInner)`

SetTimestamps sets Timestamps field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


