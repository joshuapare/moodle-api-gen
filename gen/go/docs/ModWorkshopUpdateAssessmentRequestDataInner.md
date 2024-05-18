# ModWorkshopUpdateAssessmentRequestDataInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | The assessment data (use WS get_assessment_form_definition for obtaining the data to sent).                                 Apart from that data, you can optionally send:                                 feedbackauthor (str); the feedback for the submission author                                 feedbackauthorformat (int); the format of the feedbackauthor                                 feedbackauthorinlineattachmentsid (int); the draft file area for the editor attachments                                 feedbackauthorattachmentsid (int); the draft file area id for the feedback attachments | [optional] [default to "null"]
**Value** | Pointer to **string** | The value of the option. | [optional] 

## Methods

### NewModWorkshopUpdateAssessmentRequestDataInner

`func NewModWorkshopUpdateAssessmentRequestDataInner() *ModWorkshopUpdateAssessmentRequestDataInner`

NewModWorkshopUpdateAssessmentRequestDataInner instantiates a new ModWorkshopUpdateAssessmentRequestDataInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopUpdateAssessmentRequestDataInnerWithDefaults

`func NewModWorkshopUpdateAssessmentRequestDataInnerWithDefaults() *ModWorkshopUpdateAssessmentRequestDataInner`

NewModWorkshopUpdateAssessmentRequestDataInnerWithDefaults instantiates a new ModWorkshopUpdateAssessmentRequestDataInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *ModWorkshopUpdateAssessmentRequestDataInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModWorkshopUpdateAssessmentRequestDataInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModWorkshopUpdateAssessmentRequestDataInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModWorkshopUpdateAssessmentRequestDataInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetValue

`func (o *ModWorkshopUpdateAssessmentRequestDataInner) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *ModWorkshopUpdateAssessmentRequestDataInner) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *ModWorkshopUpdateAssessmentRequestDataInner) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *ModWorkshopUpdateAssessmentRequestDataInner) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


