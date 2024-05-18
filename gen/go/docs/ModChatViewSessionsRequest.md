# ModChatViewSessionsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cmid** | **int32** | Course module id | 
**End** | Pointer to **int32** | Session end time | [optional] [default to 0]
**Start** | Pointer to **int32** | Session start time | [optional] [default to 0]

## Methods

### NewModChatViewSessionsRequest

`func NewModChatViewSessionsRequest(cmid int32, ) *ModChatViewSessionsRequest`

NewModChatViewSessionsRequest instantiates a new ModChatViewSessionsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModChatViewSessionsRequestWithDefaults

`func NewModChatViewSessionsRequestWithDefaults() *ModChatViewSessionsRequest`

NewModChatViewSessionsRequestWithDefaults instantiates a new ModChatViewSessionsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCmid

`func (o *ModChatViewSessionsRequest) GetCmid() int32`

GetCmid returns the Cmid field if non-nil, zero value otherwise.

### GetCmidOk

`func (o *ModChatViewSessionsRequest) GetCmidOk() (*int32, bool)`

GetCmidOk returns a tuple with the Cmid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCmid

`func (o *ModChatViewSessionsRequest) SetCmid(v int32)`

SetCmid sets Cmid field to given value.


### GetEnd

`func (o *ModChatViewSessionsRequest) GetEnd() int32`

GetEnd returns the End field if non-nil, zero value otherwise.

### GetEndOk

`func (o *ModChatViewSessionsRequest) GetEndOk() (*int32, bool)`

GetEndOk returns a tuple with the End field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnd

`func (o *ModChatViewSessionsRequest) SetEnd(v int32)`

SetEnd sets End field to given value.

### HasEnd

`func (o *ModChatViewSessionsRequest) HasEnd() bool`

HasEnd returns a boolean if a field has been set.

### GetStart

`func (o *ModChatViewSessionsRequest) GetStart() int32`

GetStart returns the Start field if non-nil, zero value otherwise.

### GetStartOk

`func (o *ModChatViewSessionsRequest) GetStartOk() (*int32, bool)`

GetStartOk returns a tuple with the Start field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStart

`func (o *ModChatViewSessionsRequest) SetStart(v int32)`

SetStart sets Start field to given value.

### HasStart

`func (o *ModChatViewSessionsRequest) HasStart() bool`

HasStart returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


