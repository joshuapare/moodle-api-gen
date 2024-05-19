# CoreMessageMarkMessageReadRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Messageid** | **int32** | id of the message in the messages table | [default to null]
**Timeread** | Pointer to **int32** | timestamp for when the message should be marked read | [optional] [default to 0]

## Methods

### NewCoreMessageMarkMessageReadRequest

`func NewCoreMessageMarkMessageReadRequest(messageid int32, ) *CoreMessageMarkMessageReadRequest`

NewCoreMessageMarkMessageReadRequest instantiates a new CoreMessageMarkMessageReadRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageMarkMessageReadRequestWithDefaults

`func NewCoreMessageMarkMessageReadRequestWithDefaults() *CoreMessageMarkMessageReadRequest`

NewCoreMessageMarkMessageReadRequestWithDefaults instantiates a new CoreMessageMarkMessageReadRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessageid

`func (o *CoreMessageMarkMessageReadRequest) GetMessageid() int32`

GetMessageid returns the Messageid field if non-nil, zero value otherwise.

### GetMessageidOk

`func (o *CoreMessageMarkMessageReadRequest) GetMessageidOk() (*int32, bool)`

GetMessageidOk returns a tuple with the Messageid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageid

`func (o *CoreMessageMarkMessageReadRequest) SetMessageid(v int32)`

SetMessageid sets Messageid field to given value.


### GetTimeread

`func (o *CoreMessageMarkMessageReadRequest) GetTimeread() int32`

GetTimeread returns the Timeread field if non-nil, zero value otherwise.

### GetTimereadOk

`func (o *CoreMessageMarkMessageReadRequest) GetTimereadOk() (*int32, bool)`

GetTimereadOk returns a tuple with the Timeread field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeread

`func (o *CoreMessageMarkMessageReadRequest) SetTimeread(v int32)`

SetTimeread sets Timeread field to given value.

### HasTimeread

`func (o *CoreMessageMarkMessageReadRequest) HasTimeread() bool`

HasTimeread returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


