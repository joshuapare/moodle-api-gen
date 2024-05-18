# ModFeedbackGetPageItemsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | Pointer to **int32** | Course where user completes the feedback (for site feedbacks only). | [optional] [default to 0]
**Feedbackid** | **int32** | Feedback instance id | 
**Page** | **int32** | The page to get starting by 0 | [default to null]

## Methods

### NewModFeedbackGetPageItemsRequest

`func NewModFeedbackGetPageItemsRequest(feedbackid int32, page int32, ) *ModFeedbackGetPageItemsRequest`

NewModFeedbackGetPageItemsRequest instantiates a new ModFeedbackGetPageItemsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModFeedbackGetPageItemsRequestWithDefaults

`func NewModFeedbackGetPageItemsRequestWithDefaults() *ModFeedbackGetPageItemsRequest`

NewModFeedbackGetPageItemsRequestWithDefaults instantiates a new ModFeedbackGetPageItemsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *ModFeedbackGetPageItemsRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *ModFeedbackGetPageItemsRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *ModFeedbackGetPageItemsRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *ModFeedbackGetPageItemsRequest) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetFeedbackid

`func (o *ModFeedbackGetPageItemsRequest) GetFeedbackid() int32`

GetFeedbackid returns the Feedbackid field if non-nil, zero value otherwise.

### GetFeedbackidOk

`func (o *ModFeedbackGetPageItemsRequest) GetFeedbackidOk() (*int32, bool)`

GetFeedbackidOk returns a tuple with the Feedbackid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackid

`func (o *ModFeedbackGetPageItemsRequest) SetFeedbackid(v int32)`

SetFeedbackid sets Feedbackid field to given value.


### GetPage

`func (o *ModFeedbackGetPageItemsRequest) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *ModFeedbackGetPageItemsRequest) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *ModFeedbackGetPageItemsRequest) SetPage(v int32)`

SetPage sets Page field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


