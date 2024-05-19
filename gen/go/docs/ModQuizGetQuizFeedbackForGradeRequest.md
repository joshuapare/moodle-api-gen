# ModQuizGetQuizFeedbackForGradeRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Grade** | **float32** | the grade to check | [default to null]
**Quizid** | **int32** | quiz instance id | 

## Methods

### NewModQuizGetQuizFeedbackForGradeRequest

`func NewModQuizGetQuizFeedbackForGradeRequest(grade float32, quizid int32, ) *ModQuizGetQuizFeedbackForGradeRequest`

NewModQuizGetQuizFeedbackForGradeRequest instantiates a new ModQuizGetQuizFeedbackForGradeRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModQuizGetQuizFeedbackForGradeRequestWithDefaults

`func NewModQuizGetQuizFeedbackForGradeRequestWithDefaults() *ModQuizGetQuizFeedbackForGradeRequest`

NewModQuizGetQuizFeedbackForGradeRequestWithDefaults instantiates a new ModQuizGetQuizFeedbackForGradeRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGrade

`func (o *ModQuizGetQuizFeedbackForGradeRequest) GetGrade() float32`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *ModQuizGetQuizFeedbackForGradeRequest) GetGradeOk() (*float32, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *ModQuizGetQuizFeedbackForGradeRequest) SetGrade(v float32)`

SetGrade sets Grade field to given value.


### GetQuizid

`func (o *ModQuizGetQuizFeedbackForGradeRequest) GetQuizid() int32`

GetQuizid returns the Quizid field if non-nil, zero value otherwise.

### GetQuizidOk

`func (o *ModQuizGetQuizFeedbackForGradeRequest) GetQuizidOk() (*int32, bool)`

GetQuizidOk returns a tuple with the Quizid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuizid

`func (o *ModQuizGetQuizFeedbackForGradeRequest) SetQuizid(v int32)`

SetQuizid sets Quizid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


