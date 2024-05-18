# ModFeedbackGetCurrentCompletedTmpRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | Pointer to **int32** | Course where user completes the feedback (for site feedbacks only). | [optional] [default to 0]
**Feedbackid** | **int32** | Feedback instance id | 

## Methods

### NewModFeedbackGetCurrentCompletedTmpRequest

`func NewModFeedbackGetCurrentCompletedTmpRequest(feedbackid int32, ) *ModFeedbackGetCurrentCompletedTmpRequest`

NewModFeedbackGetCurrentCompletedTmpRequest instantiates a new ModFeedbackGetCurrentCompletedTmpRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModFeedbackGetCurrentCompletedTmpRequestWithDefaults

`func NewModFeedbackGetCurrentCompletedTmpRequestWithDefaults() *ModFeedbackGetCurrentCompletedTmpRequest`

NewModFeedbackGetCurrentCompletedTmpRequestWithDefaults instantiates a new ModFeedbackGetCurrentCompletedTmpRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *ModFeedbackGetCurrentCompletedTmpRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *ModFeedbackGetCurrentCompletedTmpRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *ModFeedbackGetCurrentCompletedTmpRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *ModFeedbackGetCurrentCompletedTmpRequest) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetFeedbackid

`func (o *ModFeedbackGetCurrentCompletedTmpRequest) GetFeedbackid() int32`

GetFeedbackid returns the Feedbackid field if non-nil, zero value otherwise.

### GetFeedbackidOk

`func (o *ModFeedbackGetCurrentCompletedTmpRequest) GetFeedbackidOk() (*int32, bool)`

GetFeedbackidOk returns a tuple with the Feedbackid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackid

`func (o *ModFeedbackGetCurrentCompletedTmpRequest) SetFeedbackid(v int32)`

SetFeedbackid sets Feedbackid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


