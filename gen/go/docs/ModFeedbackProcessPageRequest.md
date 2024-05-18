# ModFeedbackProcessPageRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | Pointer to **int32** | Course where user completes the feedback (for site feedbacks only). | [optional] [default to 0]
**Feedbackid** | **int32** | Feedback instance id. | 
**Goprevious** | Pointer to **bool** | Whether we want to jump to previous page. | [optional] [default to false]
**Page** | **int32** | The page being processed. | [default to null]
**Responses** | Pointer to [**[]ModFeedbackProcessPageRequestResponsesInner**](ModFeedbackProcessPageRequestResponsesInner.md) |  | [optional] 

## Methods

### NewModFeedbackProcessPageRequest

`func NewModFeedbackProcessPageRequest(feedbackid int32, page int32, ) *ModFeedbackProcessPageRequest`

NewModFeedbackProcessPageRequest instantiates a new ModFeedbackProcessPageRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModFeedbackProcessPageRequestWithDefaults

`func NewModFeedbackProcessPageRequestWithDefaults() *ModFeedbackProcessPageRequest`

NewModFeedbackProcessPageRequestWithDefaults instantiates a new ModFeedbackProcessPageRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *ModFeedbackProcessPageRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *ModFeedbackProcessPageRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *ModFeedbackProcessPageRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *ModFeedbackProcessPageRequest) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetFeedbackid

`func (o *ModFeedbackProcessPageRequest) GetFeedbackid() int32`

GetFeedbackid returns the Feedbackid field if non-nil, zero value otherwise.

### GetFeedbackidOk

`func (o *ModFeedbackProcessPageRequest) GetFeedbackidOk() (*int32, bool)`

GetFeedbackidOk returns a tuple with the Feedbackid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackid

`func (o *ModFeedbackProcessPageRequest) SetFeedbackid(v int32)`

SetFeedbackid sets Feedbackid field to given value.


### GetGoprevious

`func (o *ModFeedbackProcessPageRequest) GetGoprevious() bool`

GetGoprevious returns the Goprevious field if non-nil, zero value otherwise.

### GetGopreviousOk

`func (o *ModFeedbackProcessPageRequest) GetGopreviousOk() (*bool, bool)`

GetGopreviousOk returns a tuple with the Goprevious field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGoprevious

`func (o *ModFeedbackProcessPageRequest) SetGoprevious(v bool)`

SetGoprevious sets Goprevious field to given value.

### HasGoprevious

`func (o *ModFeedbackProcessPageRequest) HasGoprevious() bool`

HasGoprevious returns a boolean if a field has been set.

### GetPage

`func (o *ModFeedbackProcessPageRequest) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *ModFeedbackProcessPageRequest) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *ModFeedbackProcessPageRequest) SetPage(v int32)`

SetPage sets Page field to given value.


### GetResponses

`func (o *ModFeedbackProcessPageRequest) GetResponses() []ModFeedbackProcessPageRequestResponsesInner`

GetResponses returns the Responses field if non-nil, zero value otherwise.

### GetResponsesOk

`func (o *ModFeedbackProcessPageRequest) GetResponsesOk() (*[]ModFeedbackProcessPageRequestResponsesInner, bool)`

GetResponsesOk returns a tuple with the Responses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponses

`func (o *ModFeedbackProcessPageRequest) SetResponses(v []ModFeedbackProcessPageRequestResponsesInner)`

SetResponses sets Responses field to given value.

### HasResponses

`func (o *ModFeedbackProcessPageRequest) HasResponses() bool`

HasResponses returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


