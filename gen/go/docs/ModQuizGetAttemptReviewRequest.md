# ModQuizGetAttemptReviewRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attemptid** | **int32** | attempt id | 
**Page** | Pointer to **int32** | page number, empty for all the questions in all the pages | [optional] [default to -1]

## Methods

### NewModQuizGetAttemptReviewRequest

`func NewModQuizGetAttemptReviewRequest(attemptid int32, ) *ModQuizGetAttemptReviewRequest`

NewModQuizGetAttemptReviewRequest instantiates a new ModQuizGetAttemptReviewRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModQuizGetAttemptReviewRequestWithDefaults

`func NewModQuizGetAttemptReviewRequestWithDefaults() *ModQuizGetAttemptReviewRequest`

NewModQuizGetAttemptReviewRequestWithDefaults instantiates a new ModQuizGetAttemptReviewRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttemptid

`func (o *ModQuizGetAttemptReviewRequest) GetAttemptid() int32`

GetAttemptid returns the Attemptid field if non-nil, zero value otherwise.

### GetAttemptidOk

`func (o *ModQuizGetAttemptReviewRequest) GetAttemptidOk() (*int32, bool)`

GetAttemptidOk returns a tuple with the Attemptid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttemptid

`func (o *ModQuizGetAttemptReviewRequest) SetAttemptid(v int32)`

SetAttemptid sets Attemptid field to given value.


### GetPage

`func (o *ModQuizGetAttemptReviewRequest) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *ModQuizGetAttemptReviewRequest) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *ModQuizGetAttemptReviewRequest) SetPage(v int32)`

SetPage sets Page field to given value.

### HasPage

`func (o *ModQuizGetAttemptReviewRequest) HasPage() bool`

HasPage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


