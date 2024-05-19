# ModQuizProcessAttemptRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attemptid** | **int32** | attempt id | 
**Data** | Pointer to [**[]ModQuizGetAttemptDataRequestPreflightdataInner**](ModQuizGetAttemptDataRequestPreflightdataInner.md) |  | [optional] 
**Finishattempt** | Pointer to **bool** | whether to finish or not the attempt | [optional] [default to false]
**Preflightdata** | Pointer to [**[]ModQuizGetAttemptDataRequestPreflightdataInner**](ModQuizGetAttemptDataRequestPreflightdataInner.md) |  | [optional] 
**Timeup** | Pointer to **bool** | whether the WS was called by a timer when the time is up | [optional] [default to false]

## Methods

### NewModQuizProcessAttemptRequest

`func NewModQuizProcessAttemptRequest(attemptid int32, ) *ModQuizProcessAttemptRequest`

NewModQuizProcessAttemptRequest instantiates a new ModQuizProcessAttemptRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModQuizProcessAttemptRequestWithDefaults

`func NewModQuizProcessAttemptRequestWithDefaults() *ModQuizProcessAttemptRequest`

NewModQuizProcessAttemptRequestWithDefaults instantiates a new ModQuizProcessAttemptRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttemptid

`func (o *ModQuizProcessAttemptRequest) GetAttemptid() int32`

GetAttemptid returns the Attemptid field if non-nil, zero value otherwise.

### GetAttemptidOk

`func (o *ModQuizProcessAttemptRequest) GetAttemptidOk() (*int32, bool)`

GetAttemptidOk returns a tuple with the Attemptid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttemptid

`func (o *ModQuizProcessAttemptRequest) SetAttemptid(v int32)`

SetAttemptid sets Attemptid field to given value.


### GetData

`func (o *ModQuizProcessAttemptRequest) GetData() []ModQuizGetAttemptDataRequestPreflightdataInner`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ModQuizProcessAttemptRequest) GetDataOk() (*[]ModQuizGetAttemptDataRequestPreflightdataInner, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ModQuizProcessAttemptRequest) SetData(v []ModQuizGetAttemptDataRequestPreflightdataInner)`

SetData sets Data field to given value.

### HasData

`func (o *ModQuizProcessAttemptRequest) HasData() bool`

HasData returns a boolean if a field has been set.

### GetFinishattempt

`func (o *ModQuizProcessAttemptRequest) GetFinishattempt() bool`

GetFinishattempt returns the Finishattempt field if non-nil, zero value otherwise.

### GetFinishattemptOk

`func (o *ModQuizProcessAttemptRequest) GetFinishattemptOk() (*bool, bool)`

GetFinishattemptOk returns a tuple with the Finishattempt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFinishattempt

`func (o *ModQuizProcessAttemptRequest) SetFinishattempt(v bool)`

SetFinishattempt sets Finishattempt field to given value.

### HasFinishattempt

`func (o *ModQuizProcessAttemptRequest) HasFinishattempt() bool`

HasFinishattempt returns a boolean if a field has been set.

### GetPreflightdata

`func (o *ModQuizProcessAttemptRequest) GetPreflightdata() []ModQuizGetAttemptDataRequestPreflightdataInner`

GetPreflightdata returns the Preflightdata field if non-nil, zero value otherwise.

### GetPreflightdataOk

`func (o *ModQuizProcessAttemptRequest) GetPreflightdataOk() (*[]ModQuizGetAttemptDataRequestPreflightdataInner, bool)`

GetPreflightdataOk returns a tuple with the Preflightdata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreflightdata

`func (o *ModQuizProcessAttemptRequest) SetPreflightdata(v []ModQuizGetAttemptDataRequestPreflightdataInner)`

SetPreflightdata sets Preflightdata field to given value.

### HasPreflightdata

`func (o *ModQuizProcessAttemptRequest) HasPreflightdata() bool`

HasPreflightdata returns a boolean if a field has been set.

### GetTimeup

`func (o *ModQuizProcessAttemptRequest) GetTimeup() bool`

GetTimeup returns the Timeup field if non-nil, zero value otherwise.

### GetTimeupOk

`func (o *ModQuizProcessAttemptRequest) GetTimeupOk() (*bool, bool)`

GetTimeupOk returns a tuple with the Timeup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeup

`func (o *ModQuizProcessAttemptRequest) SetTimeup(v bool)`

SetTimeup sets Timeup field to given value.

### HasTimeup

`func (o *ModQuizProcessAttemptRequest) HasTimeup() bool`

HasTimeup returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


