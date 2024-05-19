# ModQuizGetAttemptSummaryRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attemptid** | **int32** | attempt id | 
**Preflightdata** | Pointer to [**[]ModQuizGetAttemptDataRequestPreflightdataInner**](ModQuizGetAttemptDataRequestPreflightdataInner.md) |  | [optional] 

## Methods

### NewModQuizGetAttemptSummaryRequest

`func NewModQuizGetAttemptSummaryRequest(attemptid int32, ) *ModQuizGetAttemptSummaryRequest`

NewModQuizGetAttemptSummaryRequest instantiates a new ModQuizGetAttemptSummaryRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModQuizGetAttemptSummaryRequestWithDefaults

`func NewModQuizGetAttemptSummaryRequestWithDefaults() *ModQuizGetAttemptSummaryRequest`

NewModQuizGetAttemptSummaryRequestWithDefaults instantiates a new ModQuizGetAttemptSummaryRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttemptid

`func (o *ModQuizGetAttemptSummaryRequest) GetAttemptid() int32`

GetAttemptid returns the Attemptid field if non-nil, zero value otherwise.

### GetAttemptidOk

`func (o *ModQuizGetAttemptSummaryRequest) GetAttemptidOk() (*int32, bool)`

GetAttemptidOk returns a tuple with the Attemptid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttemptid

`func (o *ModQuizGetAttemptSummaryRequest) SetAttemptid(v int32)`

SetAttemptid sets Attemptid field to given value.


### GetPreflightdata

`func (o *ModQuizGetAttemptSummaryRequest) GetPreflightdata() []ModQuizGetAttemptDataRequestPreflightdataInner`

GetPreflightdata returns the Preflightdata field if non-nil, zero value otherwise.

### GetPreflightdataOk

`func (o *ModQuizGetAttemptSummaryRequest) GetPreflightdataOk() (*[]ModQuizGetAttemptDataRequestPreflightdataInner, bool)`

GetPreflightdataOk returns a tuple with the Preflightdata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreflightdata

`func (o *ModQuizGetAttemptSummaryRequest) SetPreflightdata(v []ModQuizGetAttemptDataRequestPreflightdataInner)`

SetPreflightdata sets Preflightdata field to given value.

### HasPreflightdata

`func (o *ModQuizGetAttemptSummaryRequest) HasPreflightdata() bool`

HasPreflightdata returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


