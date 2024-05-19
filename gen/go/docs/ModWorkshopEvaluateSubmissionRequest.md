# ModWorkshopEvaluateSubmissionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Feedbackformat** | Pointer to **int32** | The feedback format for text. | [optional] [default to 0]
**Feedbacktext** | Pointer to **string** | The feedback for the author. | [optional] [default to ""]
**Gradeover** | Pointer to **string** | The new submission grade. | [optional] [default to ""]
**Published** | Pointer to **bool** | Publish the submission for others?. | [optional] [default to false]
**Submissionid** | **int32** | submission id. | [default to null]

## Methods

### NewModWorkshopEvaluateSubmissionRequest

`func NewModWorkshopEvaluateSubmissionRequest(submissionid int32, ) *ModWorkshopEvaluateSubmissionRequest`

NewModWorkshopEvaluateSubmissionRequest instantiates a new ModWorkshopEvaluateSubmissionRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopEvaluateSubmissionRequestWithDefaults

`func NewModWorkshopEvaluateSubmissionRequestWithDefaults() *ModWorkshopEvaluateSubmissionRequest`

NewModWorkshopEvaluateSubmissionRequestWithDefaults instantiates a new ModWorkshopEvaluateSubmissionRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFeedbackformat

`func (o *ModWorkshopEvaluateSubmissionRequest) GetFeedbackformat() int32`

GetFeedbackformat returns the Feedbackformat field if non-nil, zero value otherwise.

### GetFeedbackformatOk

`func (o *ModWorkshopEvaluateSubmissionRequest) GetFeedbackformatOk() (*int32, bool)`

GetFeedbackformatOk returns a tuple with the Feedbackformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackformat

`func (o *ModWorkshopEvaluateSubmissionRequest) SetFeedbackformat(v int32)`

SetFeedbackformat sets Feedbackformat field to given value.

### HasFeedbackformat

`func (o *ModWorkshopEvaluateSubmissionRequest) HasFeedbackformat() bool`

HasFeedbackformat returns a boolean if a field has been set.

### GetFeedbacktext

`func (o *ModWorkshopEvaluateSubmissionRequest) GetFeedbacktext() string`

GetFeedbacktext returns the Feedbacktext field if non-nil, zero value otherwise.

### GetFeedbacktextOk

`func (o *ModWorkshopEvaluateSubmissionRequest) GetFeedbacktextOk() (*string, bool)`

GetFeedbacktextOk returns a tuple with the Feedbacktext field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbacktext

`func (o *ModWorkshopEvaluateSubmissionRequest) SetFeedbacktext(v string)`

SetFeedbacktext sets Feedbacktext field to given value.

### HasFeedbacktext

`func (o *ModWorkshopEvaluateSubmissionRequest) HasFeedbacktext() bool`

HasFeedbacktext returns a boolean if a field has been set.

### GetGradeover

`func (o *ModWorkshopEvaluateSubmissionRequest) GetGradeover() string`

GetGradeover returns the Gradeover field if non-nil, zero value otherwise.

### GetGradeoverOk

`func (o *ModWorkshopEvaluateSubmissionRequest) GetGradeoverOk() (*string, bool)`

GetGradeoverOk returns a tuple with the Gradeover field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradeover

`func (o *ModWorkshopEvaluateSubmissionRequest) SetGradeover(v string)`

SetGradeover sets Gradeover field to given value.

### HasGradeover

`func (o *ModWorkshopEvaluateSubmissionRequest) HasGradeover() bool`

HasGradeover returns a boolean if a field has been set.

### GetPublished

`func (o *ModWorkshopEvaluateSubmissionRequest) GetPublished() bool`

GetPublished returns the Published field if non-nil, zero value otherwise.

### GetPublishedOk

`func (o *ModWorkshopEvaluateSubmissionRequest) GetPublishedOk() (*bool, bool)`

GetPublishedOk returns a tuple with the Published field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPublished

`func (o *ModWorkshopEvaluateSubmissionRequest) SetPublished(v bool)`

SetPublished sets Published field to given value.

### HasPublished

`func (o *ModWorkshopEvaluateSubmissionRequest) HasPublished() bool`

HasPublished returns a boolean if a field has been set.

### GetSubmissionid

`func (o *ModWorkshopEvaluateSubmissionRequest) GetSubmissionid() int32`

GetSubmissionid returns the Submissionid field if non-nil, zero value otherwise.

### GetSubmissionidOk

`func (o *ModWorkshopEvaluateSubmissionRequest) GetSubmissionidOk() (*int32, bool)`

GetSubmissionidOk returns a tuple with the Submissionid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissionid

`func (o *ModWorkshopEvaluateSubmissionRequest) SetSubmissionid(v int32)`

SetSubmissionid sets Submissionid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


