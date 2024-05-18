# ModQuizGetAttemptAccessInformationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attemptid** | Pointer to **int32** | attempt id, 0 for the user last attempt if exists | [optional] [default to 0]
**Quizid** | **int32** | quiz instance id | [default to null]

## Methods

### NewModQuizGetAttemptAccessInformationRequest

`func NewModQuizGetAttemptAccessInformationRequest(quizid int32, ) *ModQuizGetAttemptAccessInformationRequest`

NewModQuizGetAttemptAccessInformationRequest instantiates a new ModQuizGetAttemptAccessInformationRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModQuizGetAttemptAccessInformationRequestWithDefaults

`func NewModQuizGetAttemptAccessInformationRequestWithDefaults() *ModQuizGetAttemptAccessInformationRequest`

NewModQuizGetAttemptAccessInformationRequestWithDefaults instantiates a new ModQuizGetAttemptAccessInformationRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttemptid

`func (o *ModQuizGetAttemptAccessInformationRequest) GetAttemptid() int32`

GetAttemptid returns the Attemptid field if non-nil, zero value otherwise.

### GetAttemptidOk

`func (o *ModQuizGetAttemptAccessInformationRequest) GetAttemptidOk() (*int32, bool)`

GetAttemptidOk returns a tuple with the Attemptid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttemptid

`func (o *ModQuizGetAttemptAccessInformationRequest) SetAttemptid(v int32)`

SetAttemptid sets Attemptid field to given value.

### HasAttemptid

`func (o *ModQuizGetAttemptAccessInformationRequest) HasAttemptid() bool`

HasAttemptid returns a boolean if a field has been set.

### GetQuizid

`func (o *ModQuizGetAttemptAccessInformationRequest) GetQuizid() int32`

GetQuizid returns the Quizid field if non-nil, zero value otherwise.

### GetQuizidOk

`func (o *ModQuizGetAttemptAccessInformationRequest) GetQuizidOk() (*int32, bool)`

GetQuizidOk returns a tuple with the Quizid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuizid

`func (o *ModQuizGetAttemptAccessInformationRequest) SetQuizid(v int32)`

SetQuizid sets Quizid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


