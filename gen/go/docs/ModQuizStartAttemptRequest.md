# ModQuizStartAttemptRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Forcenew** | Pointer to **bool** | Whether to force a new attempt or not. | [optional] [default to false]
**Preflightdata** | Pointer to [**[]ModQuizGetAttemptDataRequestPreflightdataInner**](ModQuizGetAttemptDataRequestPreflightdataInner.md) |  | [optional] 
**Quizid** | **int32** | quiz instance id | 

## Methods

### NewModQuizStartAttemptRequest

`func NewModQuizStartAttemptRequest(quizid int32, ) *ModQuizStartAttemptRequest`

NewModQuizStartAttemptRequest instantiates a new ModQuizStartAttemptRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModQuizStartAttemptRequestWithDefaults

`func NewModQuizStartAttemptRequestWithDefaults() *ModQuizStartAttemptRequest`

NewModQuizStartAttemptRequestWithDefaults instantiates a new ModQuizStartAttemptRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetForcenew

`func (o *ModQuizStartAttemptRequest) GetForcenew() bool`

GetForcenew returns the Forcenew field if non-nil, zero value otherwise.

### GetForcenewOk

`func (o *ModQuizStartAttemptRequest) GetForcenewOk() (*bool, bool)`

GetForcenewOk returns a tuple with the Forcenew field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForcenew

`func (o *ModQuizStartAttemptRequest) SetForcenew(v bool)`

SetForcenew sets Forcenew field to given value.

### HasForcenew

`func (o *ModQuizStartAttemptRequest) HasForcenew() bool`

HasForcenew returns a boolean if a field has been set.

### GetPreflightdata

`func (o *ModQuizStartAttemptRequest) GetPreflightdata() []ModQuizGetAttemptDataRequestPreflightdataInner`

GetPreflightdata returns the Preflightdata field if non-nil, zero value otherwise.

### GetPreflightdataOk

`func (o *ModQuizStartAttemptRequest) GetPreflightdataOk() (*[]ModQuizGetAttemptDataRequestPreflightdataInner, bool)`

GetPreflightdataOk returns a tuple with the Preflightdata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreflightdata

`func (o *ModQuizStartAttemptRequest) SetPreflightdata(v []ModQuizGetAttemptDataRequestPreflightdataInner)`

SetPreflightdata sets Preflightdata field to given value.

### HasPreflightdata

`func (o *ModQuizStartAttemptRequest) HasPreflightdata() bool`

HasPreflightdata returns a boolean if a field has been set.

### GetQuizid

`func (o *ModQuizStartAttemptRequest) GetQuizid() int32`

GetQuizid returns the Quizid field if non-nil, zero value otherwise.

### GetQuizidOk

`func (o *ModQuizStartAttemptRequest) GetQuizidOk() (*int32, bool)`

GetQuizidOk returns a tuple with the Quizid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuizid

`func (o *ModQuizStartAttemptRequest) SetQuizid(v int32)`

SetQuizid sets Quizid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


