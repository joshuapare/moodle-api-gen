# ModFeedbackGetAnalysisRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | Pointer to **int32** | Course where user completes the feedback (for site feedbacks only). | [optional] [default to 0]
**Feedbackid** | **int32** | Feedback instance id | [default to null]
**Groupid** | Pointer to **int32** | Group id, 0 means that the function will determine the user group | [optional] [default to 0]

## Methods

### NewModFeedbackGetAnalysisRequest

`func NewModFeedbackGetAnalysisRequest(feedbackid int32, ) *ModFeedbackGetAnalysisRequest`

NewModFeedbackGetAnalysisRequest instantiates a new ModFeedbackGetAnalysisRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModFeedbackGetAnalysisRequestWithDefaults

`func NewModFeedbackGetAnalysisRequestWithDefaults() *ModFeedbackGetAnalysisRequest`

NewModFeedbackGetAnalysisRequestWithDefaults instantiates a new ModFeedbackGetAnalysisRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *ModFeedbackGetAnalysisRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *ModFeedbackGetAnalysisRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *ModFeedbackGetAnalysisRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *ModFeedbackGetAnalysisRequest) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetFeedbackid

`func (o *ModFeedbackGetAnalysisRequest) GetFeedbackid() int32`

GetFeedbackid returns the Feedbackid field if non-nil, zero value otherwise.

### GetFeedbackidOk

`func (o *ModFeedbackGetAnalysisRequest) GetFeedbackidOk() (*int32, bool)`

GetFeedbackidOk returns a tuple with the Feedbackid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackid

`func (o *ModFeedbackGetAnalysisRequest) SetFeedbackid(v int32)`

SetFeedbackid sets Feedbackid field to given value.


### GetGroupid

`func (o *ModFeedbackGetAnalysisRequest) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModFeedbackGetAnalysisRequest) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModFeedbackGetAnalysisRequest) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *ModFeedbackGetAnalysisRequest) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


