# ModQuizGetCombinedReviewOptionsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Quizid** | **int32** | quiz instance id | 
**Userid** | Pointer to **int32** | user id (empty for current user) | [optional] [default to 0]

## Methods

### NewModQuizGetCombinedReviewOptionsRequest

`func NewModQuizGetCombinedReviewOptionsRequest(quizid int32, ) *ModQuizGetCombinedReviewOptionsRequest`

NewModQuizGetCombinedReviewOptionsRequest instantiates a new ModQuizGetCombinedReviewOptionsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModQuizGetCombinedReviewOptionsRequestWithDefaults

`func NewModQuizGetCombinedReviewOptionsRequestWithDefaults() *ModQuizGetCombinedReviewOptionsRequest`

NewModQuizGetCombinedReviewOptionsRequestWithDefaults instantiates a new ModQuizGetCombinedReviewOptionsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetQuizid

`func (o *ModQuizGetCombinedReviewOptionsRequest) GetQuizid() int32`

GetQuizid returns the Quizid field if non-nil, zero value otherwise.

### GetQuizidOk

`func (o *ModQuizGetCombinedReviewOptionsRequest) GetQuizidOk() (*int32, bool)`

GetQuizidOk returns a tuple with the Quizid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuizid

`func (o *ModQuizGetCombinedReviewOptionsRequest) SetQuizid(v int32)`

SetQuizid sets Quizid field to given value.


### GetUserid

`func (o *ModQuizGetCombinedReviewOptionsRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModQuizGetCombinedReviewOptionsRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModQuizGetCombinedReviewOptionsRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModQuizGetCombinedReviewOptionsRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


