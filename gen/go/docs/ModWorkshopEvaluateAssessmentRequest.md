# ModWorkshopEvaluateAssessmentRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Assessmentid** | **int32** | Assessment id. | [default to null]
**Feedbackformat** | Pointer to **int32** | The feedback format for text. | [optional] [default to 0]
**Feedbacktext** | Pointer to **string** | The feedback for the reviewer. | [optional] [default to ""]
**Gradinggradeover** | Pointer to **string** | The new grading grade. | [optional] [default to ""]
**Weight** | Pointer to **int32** | The new weight for the assessment. | [optional] [default to 1]

## Methods

### NewModWorkshopEvaluateAssessmentRequest

`func NewModWorkshopEvaluateAssessmentRequest(assessmentid int32, ) *ModWorkshopEvaluateAssessmentRequest`

NewModWorkshopEvaluateAssessmentRequest instantiates a new ModWorkshopEvaluateAssessmentRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopEvaluateAssessmentRequestWithDefaults

`func NewModWorkshopEvaluateAssessmentRequestWithDefaults() *ModWorkshopEvaluateAssessmentRequest`

NewModWorkshopEvaluateAssessmentRequestWithDefaults instantiates a new ModWorkshopEvaluateAssessmentRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssessmentid

`func (o *ModWorkshopEvaluateAssessmentRequest) GetAssessmentid() int32`

GetAssessmentid returns the Assessmentid field if non-nil, zero value otherwise.

### GetAssessmentidOk

`func (o *ModWorkshopEvaluateAssessmentRequest) GetAssessmentidOk() (*int32, bool)`

GetAssessmentidOk returns a tuple with the Assessmentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssessmentid

`func (o *ModWorkshopEvaluateAssessmentRequest) SetAssessmentid(v int32)`

SetAssessmentid sets Assessmentid field to given value.


### GetFeedbackformat

`func (o *ModWorkshopEvaluateAssessmentRequest) GetFeedbackformat() int32`

GetFeedbackformat returns the Feedbackformat field if non-nil, zero value otherwise.

### GetFeedbackformatOk

`func (o *ModWorkshopEvaluateAssessmentRequest) GetFeedbackformatOk() (*int32, bool)`

GetFeedbackformatOk returns a tuple with the Feedbackformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackformat

`func (o *ModWorkshopEvaluateAssessmentRequest) SetFeedbackformat(v int32)`

SetFeedbackformat sets Feedbackformat field to given value.

### HasFeedbackformat

`func (o *ModWorkshopEvaluateAssessmentRequest) HasFeedbackformat() bool`

HasFeedbackformat returns a boolean if a field has been set.

### GetFeedbacktext

`func (o *ModWorkshopEvaluateAssessmentRequest) GetFeedbacktext() string`

GetFeedbacktext returns the Feedbacktext field if non-nil, zero value otherwise.

### GetFeedbacktextOk

`func (o *ModWorkshopEvaluateAssessmentRequest) GetFeedbacktextOk() (*string, bool)`

GetFeedbacktextOk returns a tuple with the Feedbacktext field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbacktext

`func (o *ModWorkshopEvaluateAssessmentRequest) SetFeedbacktext(v string)`

SetFeedbacktext sets Feedbacktext field to given value.

### HasFeedbacktext

`func (o *ModWorkshopEvaluateAssessmentRequest) HasFeedbacktext() bool`

HasFeedbacktext returns a boolean if a field has been set.

### GetGradinggradeover

`func (o *ModWorkshopEvaluateAssessmentRequest) GetGradinggradeover() string`

GetGradinggradeover returns the Gradinggradeover field if non-nil, zero value otherwise.

### GetGradinggradeoverOk

`func (o *ModWorkshopEvaluateAssessmentRequest) GetGradinggradeoverOk() (*string, bool)`

GetGradinggradeoverOk returns a tuple with the Gradinggradeover field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradinggradeover

`func (o *ModWorkshopEvaluateAssessmentRequest) SetGradinggradeover(v string)`

SetGradinggradeover sets Gradinggradeover field to given value.

### HasGradinggradeover

`func (o *ModWorkshopEvaluateAssessmentRequest) HasGradinggradeover() bool`

HasGradinggradeover returns a boolean if a field has been set.

### GetWeight

`func (o *ModWorkshopEvaluateAssessmentRequest) GetWeight() int32`

GetWeight returns the Weight field if non-nil, zero value otherwise.

### GetWeightOk

`func (o *ModWorkshopEvaluateAssessmentRequest) GetWeightOk() (*int32, bool)`

GetWeightOk returns a tuple with the Weight field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWeight

`func (o *ModWorkshopEvaluateAssessmentRequest) SetWeight(v int32)`

SetWeight sets Weight field to given value.

### HasWeight

`func (o *ModWorkshopEvaluateAssessmentRequest) HasWeight() bool`

HasWeight returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


