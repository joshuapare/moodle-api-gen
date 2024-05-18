# ModFeedbackViewFeedbackRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | Pointer to **int32** | Course where user completes the feedback (for site feedbacks only). | [optional] [default to 0]
**Feedbackid** | **int32** | Feedback instance id | 
**Moduleviewed** | Pointer to **bool** | If we need to mark the module as viewed for completion | [optional] [default to false]

## Methods

### NewModFeedbackViewFeedbackRequest

`func NewModFeedbackViewFeedbackRequest(feedbackid int32, ) *ModFeedbackViewFeedbackRequest`

NewModFeedbackViewFeedbackRequest instantiates a new ModFeedbackViewFeedbackRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModFeedbackViewFeedbackRequestWithDefaults

`func NewModFeedbackViewFeedbackRequestWithDefaults() *ModFeedbackViewFeedbackRequest`

NewModFeedbackViewFeedbackRequestWithDefaults instantiates a new ModFeedbackViewFeedbackRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *ModFeedbackViewFeedbackRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *ModFeedbackViewFeedbackRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *ModFeedbackViewFeedbackRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *ModFeedbackViewFeedbackRequest) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetFeedbackid

`func (o *ModFeedbackViewFeedbackRequest) GetFeedbackid() int32`

GetFeedbackid returns the Feedbackid field if non-nil, zero value otherwise.

### GetFeedbackidOk

`func (o *ModFeedbackViewFeedbackRequest) GetFeedbackidOk() (*int32, bool)`

GetFeedbackidOk returns a tuple with the Feedbackid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackid

`func (o *ModFeedbackViewFeedbackRequest) SetFeedbackid(v int32)`

SetFeedbackid sets Feedbackid field to given value.


### GetModuleviewed

`func (o *ModFeedbackViewFeedbackRequest) GetModuleviewed() bool`

GetModuleviewed returns the Moduleviewed field if non-nil, zero value otherwise.

### GetModuleviewedOk

`func (o *ModFeedbackViewFeedbackRequest) GetModuleviewedOk() (*bool, bool)`

GetModuleviewedOk returns a tuple with the Moduleviewed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModuleviewed

`func (o *ModFeedbackViewFeedbackRequest) SetModuleviewed(v bool)`

SetModuleviewed sets Moduleviewed field to given value.

### HasModuleviewed

`func (o *ModFeedbackViewFeedbackRequest) HasModuleviewed() bool`

HasModuleviewed returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


