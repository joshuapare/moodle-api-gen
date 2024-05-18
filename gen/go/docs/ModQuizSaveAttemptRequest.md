# ModQuizSaveAttemptRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attemptid** | **int32** | attempt id | 
**Data** | [**[]ModQuizGetAttemptDataRequestPreflightdataInner**](ModQuizGetAttemptDataRequestPreflightdataInner.md) |  | 
**Preflightdata** | Pointer to [**[]ModQuizGetAttemptDataRequestPreflightdataInner**](ModQuizGetAttemptDataRequestPreflightdataInner.md) |  | [optional] 

## Methods

### NewModQuizSaveAttemptRequest

`func NewModQuizSaveAttemptRequest(attemptid int32, data []ModQuizGetAttemptDataRequestPreflightdataInner, ) *ModQuizSaveAttemptRequest`

NewModQuizSaveAttemptRequest instantiates a new ModQuizSaveAttemptRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModQuizSaveAttemptRequestWithDefaults

`func NewModQuizSaveAttemptRequestWithDefaults() *ModQuizSaveAttemptRequest`

NewModQuizSaveAttemptRequestWithDefaults instantiates a new ModQuizSaveAttemptRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttemptid

`func (o *ModQuizSaveAttemptRequest) GetAttemptid() int32`

GetAttemptid returns the Attemptid field if non-nil, zero value otherwise.

### GetAttemptidOk

`func (o *ModQuizSaveAttemptRequest) GetAttemptidOk() (*int32, bool)`

GetAttemptidOk returns a tuple with the Attemptid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttemptid

`func (o *ModQuizSaveAttemptRequest) SetAttemptid(v int32)`

SetAttemptid sets Attemptid field to given value.


### GetData

`func (o *ModQuizSaveAttemptRequest) GetData() []ModQuizGetAttemptDataRequestPreflightdataInner`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ModQuizSaveAttemptRequest) GetDataOk() (*[]ModQuizGetAttemptDataRequestPreflightdataInner, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ModQuizSaveAttemptRequest) SetData(v []ModQuizGetAttemptDataRequestPreflightdataInner)`

SetData sets Data field to given value.


### GetPreflightdata

`func (o *ModQuizSaveAttemptRequest) GetPreflightdata() []ModQuizGetAttemptDataRequestPreflightdataInner`

GetPreflightdata returns the Preflightdata field if non-nil, zero value otherwise.

### GetPreflightdataOk

`func (o *ModQuizSaveAttemptRequest) GetPreflightdataOk() (*[]ModQuizGetAttemptDataRequestPreflightdataInner, bool)`

GetPreflightdataOk returns a tuple with the Preflightdata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreflightdata

`func (o *ModQuizSaveAttemptRequest) SetPreflightdata(v []ModQuizGetAttemptDataRequestPreflightdataInner)`

SetPreflightdata sets Preflightdata field to given value.

### HasPreflightdata

`func (o *ModQuizSaveAttemptRequest) HasPreflightdata() bool`

HasPreflightdata returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


