# ModQuizGetAttemptDataRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attemptid** | **int32** | attempt id | [default to null]
**Page** | **int32** | page number | [default to null]
**Preflightdata** | Pointer to [**[]ModQuizGetAttemptDataRequestPreflightdataInner**](ModQuizGetAttemptDataRequestPreflightdataInner.md) |  | [optional] 

## Methods

### NewModQuizGetAttemptDataRequest

`func NewModQuizGetAttemptDataRequest(attemptid int32, page int32, ) *ModQuizGetAttemptDataRequest`

NewModQuizGetAttemptDataRequest instantiates a new ModQuizGetAttemptDataRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModQuizGetAttemptDataRequestWithDefaults

`func NewModQuizGetAttemptDataRequestWithDefaults() *ModQuizGetAttemptDataRequest`

NewModQuizGetAttemptDataRequestWithDefaults instantiates a new ModQuizGetAttemptDataRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttemptid

`func (o *ModQuizGetAttemptDataRequest) GetAttemptid() int32`

GetAttemptid returns the Attemptid field if non-nil, zero value otherwise.

### GetAttemptidOk

`func (o *ModQuizGetAttemptDataRequest) GetAttemptidOk() (*int32, bool)`

GetAttemptidOk returns a tuple with the Attemptid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttemptid

`func (o *ModQuizGetAttemptDataRequest) SetAttemptid(v int32)`

SetAttemptid sets Attemptid field to given value.


### GetPage

`func (o *ModQuizGetAttemptDataRequest) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *ModQuizGetAttemptDataRequest) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *ModQuizGetAttemptDataRequest) SetPage(v int32)`

SetPage sets Page field to given value.


### GetPreflightdata

`func (o *ModQuizGetAttemptDataRequest) GetPreflightdata() []ModQuizGetAttemptDataRequestPreflightdataInner`

GetPreflightdata returns the Preflightdata field if non-nil, zero value otherwise.

### GetPreflightdataOk

`func (o *ModQuizGetAttemptDataRequest) GetPreflightdataOk() (*[]ModQuizGetAttemptDataRequestPreflightdataInner, bool)`

GetPreflightdataOk returns a tuple with the Preflightdata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreflightdata

`func (o *ModQuizGetAttemptDataRequest) SetPreflightdata(v []ModQuizGetAttemptDataRequestPreflightdataInner)`

SetPreflightdata sets Preflightdata field to given value.

### HasPreflightdata

`func (o *ModQuizGetAttemptDataRequest) HasPreflightdata() bool`

HasPreflightdata returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


