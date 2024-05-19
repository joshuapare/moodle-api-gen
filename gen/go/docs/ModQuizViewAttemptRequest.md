# ModQuizViewAttemptRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attemptid** | **int32** | attempt id | 
**Page** | **int32** | page number | 
**Preflightdata** | Pointer to [**[]ModQuizGetAttemptDataRequestPreflightdataInner**](ModQuizGetAttemptDataRequestPreflightdataInner.md) |  | [optional] 

## Methods

### NewModQuizViewAttemptRequest

`func NewModQuizViewAttemptRequest(attemptid int32, page int32, ) *ModQuizViewAttemptRequest`

NewModQuizViewAttemptRequest instantiates a new ModQuizViewAttemptRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModQuizViewAttemptRequestWithDefaults

`func NewModQuizViewAttemptRequestWithDefaults() *ModQuizViewAttemptRequest`

NewModQuizViewAttemptRequestWithDefaults instantiates a new ModQuizViewAttemptRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttemptid

`func (o *ModQuizViewAttemptRequest) GetAttemptid() int32`

GetAttemptid returns the Attemptid field if non-nil, zero value otherwise.

### GetAttemptidOk

`func (o *ModQuizViewAttemptRequest) GetAttemptidOk() (*int32, bool)`

GetAttemptidOk returns a tuple with the Attemptid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttemptid

`func (o *ModQuizViewAttemptRequest) SetAttemptid(v int32)`

SetAttemptid sets Attemptid field to given value.


### GetPage

`func (o *ModQuizViewAttemptRequest) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *ModQuizViewAttemptRequest) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *ModQuizViewAttemptRequest) SetPage(v int32)`

SetPage sets Page field to given value.


### GetPreflightdata

`func (o *ModQuizViewAttemptRequest) GetPreflightdata() []ModQuizGetAttemptDataRequestPreflightdataInner`

GetPreflightdata returns the Preflightdata field if non-nil, zero value otherwise.

### GetPreflightdataOk

`func (o *ModQuizViewAttemptRequest) GetPreflightdataOk() (*[]ModQuizGetAttemptDataRequestPreflightdataInner, bool)`

GetPreflightdataOk returns a tuple with the Preflightdata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreflightdata

`func (o *ModQuizViewAttemptRequest) SetPreflightdata(v []ModQuizGetAttemptDataRequestPreflightdataInner)`

SetPreflightdata sets Preflightdata field to given value.

### HasPreflightdata

`func (o *ModQuizViewAttemptRequest) HasPreflightdata() bool`

HasPreflightdata returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


