# ModFeedbackGetResponsesAnalysisRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | Pointer to **int32** | Course where user completes the feedback (for site feedbacks only). | [optional] [default to 0]
**Feedbackid** | **int32** | Feedback instance id | 
**Groupid** | Pointer to **int32** | Group id, 0 means that the function will determine the user group | [optional] [default to 0]
**Page** | Pointer to **int32** | The page of records to return. | [optional] [default to 0]
**Perpage** | Pointer to **int32** | The number of records to return per page | [optional] [default to 0]

## Methods

### NewModFeedbackGetResponsesAnalysisRequest

`func NewModFeedbackGetResponsesAnalysisRequest(feedbackid int32, ) *ModFeedbackGetResponsesAnalysisRequest`

NewModFeedbackGetResponsesAnalysisRequest instantiates a new ModFeedbackGetResponsesAnalysisRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModFeedbackGetResponsesAnalysisRequestWithDefaults

`func NewModFeedbackGetResponsesAnalysisRequestWithDefaults() *ModFeedbackGetResponsesAnalysisRequest`

NewModFeedbackGetResponsesAnalysisRequestWithDefaults instantiates a new ModFeedbackGetResponsesAnalysisRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *ModFeedbackGetResponsesAnalysisRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *ModFeedbackGetResponsesAnalysisRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *ModFeedbackGetResponsesAnalysisRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *ModFeedbackGetResponsesAnalysisRequest) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetFeedbackid

`func (o *ModFeedbackGetResponsesAnalysisRequest) GetFeedbackid() int32`

GetFeedbackid returns the Feedbackid field if non-nil, zero value otherwise.

### GetFeedbackidOk

`func (o *ModFeedbackGetResponsesAnalysisRequest) GetFeedbackidOk() (*int32, bool)`

GetFeedbackidOk returns a tuple with the Feedbackid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackid

`func (o *ModFeedbackGetResponsesAnalysisRequest) SetFeedbackid(v int32)`

SetFeedbackid sets Feedbackid field to given value.


### GetGroupid

`func (o *ModFeedbackGetResponsesAnalysisRequest) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModFeedbackGetResponsesAnalysisRequest) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModFeedbackGetResponsesAnalysisRequest) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *ModFeedbackGetResponsesAnalysisRequest) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetPage

`func (o *ModFeedbackGetResponsesAnalysisRequest) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *ModFeedbackGetResponsesAnalysisRequest) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *ModFeedbackGetResponsesAnalysisRequest) SetPage(v int32)`

SetPage sets Page field to given value.

### HasPage

`func (o *ModFeedbackGetResponsesAnalysisRequest) HasPage() bool`

HasPage returns a boolean if a field has been set.

### GetPerpage

`func (o *ModFeedbackGetResponsesAnalysisRequest) GetPerpage() int32`

GetPerpage returns the Perpage field if non-nil, zero value otherwise.

### GetPerpageOk

`func (o *ModFeedbackGetResponsesAnalysisRequest) GetPerpageOk() (*int32, bool)`

GetPerpageOk returns a tuple with the Perpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPerpage

`func (o *ModFeedbackGetResponsesAnalysisRequest) SetPerpage(v int32)`

SetPerpage sets Perpage field to given value.

### HasPerpage

`func (o *ModFeedbackGetResponsesAnalysisRequest) HasPerpage() bool`

HasPerpage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


