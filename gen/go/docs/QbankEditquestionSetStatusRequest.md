# QbankEditquestionSetStatusRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Questionid** | **int32** | The question id | 
**Status** | **string** | The updated question status | [default to "null"]

## Methods

### NewQbankEditquestionSetStatusRequest

`func NewQbankEditquestionSetStatusRequest(questionid int32, status string, ) *QbankEditquestionSetStatusRequest`

NewQbankEditquestionSetStatusRequest instantiates a new QbankEditquestionSetStatusRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewQbankEditquestionSetStatusRequestWithDefaults

`func NewQbankEditquestionSetStatusRequestWithDefaults() *QbankEditquestionSetStatusRequest`

NewQbankEditquestionSetStatusRequestWithDefaults instantiates a new QbankEditquestionSetStatusRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetQuestionid

`func (o *QbankEditquestionSetStatusRequest) GetQuestionid() int32`

GetQuestionid returns the Questionid field if non-nil, zero value otherwise.

### GetQuestionidOk

`func (o *QbankEditquestionSetStatusRequest) GetQuestionidOk() (*int32, bool)`

GetQuestionidOk returns a tuple with the Questionid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuestionid

`func (o *QbankEditquestionSetStatusRequest) SetQuestionid(v int32)`

SetQuestionid sets Questionid field to given value.


### GetStatus

`func (o *QbankEditquestionSetStatusRequest) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *QbankEditquestionSetStatusRequest) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *QbankEditquestionSetStatusRequest) SetStatus(v string)`

SetStatus sets Status field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


