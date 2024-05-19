# ModWorkshopGetGrades200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Assessmentgradehidden** | Pointer to **bool** | Whether the grade is hidden or not. | [optional] [default to null]
**Assessmentlongstrgrade** | Pointer to **string** | The assessment string grade. | [optional] [default to "null"]
**Assessmentrawgrade** | Pointer to **float32** | The assessment raw (numeric) grade. | [optional] [default to null]
**Submissiongradehidden** | Pointer to **bool** | Whether the grade is hidden or not. | [optional] 
**Submissionlongstrgrade** | Pointer to **string** | The submission string grade. | [optional] [default to "null"]
**Submissionrawgrade** | Pointer to **float32** | The submission raw (numeric) grade. | [optional] [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModWorkshopGetGrades200Response

`func NewModWorkshopGetGrades200Response() *ModWorkshopGetGrades200Response`

NewModWorkshopGetGrades200Response instantiates a new ModWorkshopGetGrades200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopGetGrades200ResponseWithDefaults

`func NewModWorkshopGetGrades200ResponseWithDefaults() *ModWorkshopGetGrades200Response`

NewModWorkshopGetGrades200ResponseWithDefaults instantiates a new ModWorkshopGetGrades200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssessmentgradehidden

`func (o *ModWorkshopGetGrades200Response) GetAssessmentgradehidden() bool`

GetAssessmentgradehidden returns the Assessmentgradehidden field if non-nil, zero value otherwise.

### GetAssessmentgradehiddenOk

`func (o *ModWorkshopGetGrades200Response) GetAssessmentgradehiddenOk() (*bool, bool)`

GetAssessmentgradehiddenOk returns a tuple with the Assessmentgradehidden field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssessmentgradehidden

`func (o *ModWorkshopGetGrades200Response) SetAssessmentgradehidden(v bool)`

SetAssessmentgradehidden sets Assessmentgradehidden field to given value.

### HasAssessmentgradehidden

`func (o *ModWorkshopGetGrades200Response) HasAssessmentgradehidden() bool`

HasAssessmentgradehidden returns a boolean if a field has been set.

### GetAssessmentlongstrgrade

`func (o *ModWorkshopGetGrades200Response) GetAssessmentlongstrgrade() string`

GetAssessmentlongstrgrade returns the Assessmentlongstrgrade field if non-nil, zero value otherwise.

### GetAssessmentlongstrgradeOk

`func (o *ModWorkshopGetGrades200Response) GetAssessmentlongstrgradeOk() (*string, bool)`

GetAssessmentlongstrgradeOk returns a tuple with the Assessmentlongstrgrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssessmentlongstrgrade

`func (o *ModWorkshopGetGrades200Response) SetAssessmentlongstrgrade(v string)`

SetAssessmentlongstrgrade sets Assessmentlongstrgrade field to given value.

### HasAssessmentlongstrgrade

`func (o *ModWorkshopGetGrades200Response) HasAssessmentlongstrgrade() bool`

HasAssessmentlongstrgrade returns a boolean if a field has been set.

### GetAssessmentrawgrade

`func (o *ModWorkshopGetGrades200Response) GetAssessmentrawgrade() float32`

GetAssessmentrawgrade returns the Assessmentrawgrade field if non-nil, zero value otherwise.

### GetAssessmentrawgradeOk

`func (o *ModWorkshopGetGrades200Response) GetAssessmentrawgradeOk() (*float32, bool)`

GetAssessmentrawgradeOk returns a tuple with the Assessmentrawgrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssessmentrawgrade

`func (o *ModWorkshopGetGrades200Response) SetAssessmentrawgrade(v float32)`

SetAssessmentrawgrade sets Assessmentrawgrade field to given value.

### HasAssessmentrawgrade

`func (o *ModWorkshopGetGrades200Response) HasAssessmentrawgrade() bool`

HasAssessmentrawgrade returns a boolean if a field has been set.

### GetSubmissiongradehidden

`func (o *ModWorkshopGetGrades200Response) GetSubmissiongradehidden() bool`

GetSubmissiongradehidden returns the Submissiongradehidden field if non-nil, zero value otherwise.

### GetSubmissiongradehiddenOk

`func (o *ModWorkshopGetGrades200Response) GetSubmissiongradehiddenOk() (*bool, bool)`

GetSubmissiongradehiddenOk returns a tuple with the Submissiongradehidden field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissiongradehidden

`func (o *ModWorkshopGetGrades200Response) SetSubmissiongradehidden(v bool)`

SetSubmissiongradehidden sets Submissiongradehidden field to given value.

### HasSubmissiongradehidden

`func (o *ModWorkshopGetGrades200Response) HasSubmissiongradehidden() bool`

HasSubmissiongradehidden returns a boolean if a field has been set.

### GetSubmissionlongstrgrade

`func (o *ModWorkshopGetGrades200Response) GetSubmissionlongstrgrade() string`

GetSubmissionlongstrgrade returns the Submissionlongstrgrade field if non-nil, zero value otherwise.

### GetSubmissionlongstrgradeOk

`func (o *ModWorkshopGetGrades200Response) GetSubmissionlongstrgradeOk() (*string, bool)`

GetSubmissionlongstrgradeOk returns a tuple with the Submissionlongstrgrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissionlongstrgrade

`func (o *ModWorkshopGetGrades200Response) SetSubmissionlongstrgrade(v string)`

SetSubmissionlongstrgrade sets Submissionlongstrgrade field to given value.

### HasSubmissionlongstrgrade

`func (o *ModWorkshopGetGrades200Response) HasSubmissionlongstrgrade() bool`

HasSubmissionlongstrgrade returns a boolean if a field has been set.

### GetSubmissionrawgrade

`func (o *ModWorkshopGetGrades200Response) GetSubmissionrawgrade() float32`

GetSubmissionrawgrade returns the Submissionrawgrade field if non-nil, zero value otherwise.

### GetSubmissionrawgradeOk

`func (o *ModWorkshopGetGrades200Response) GetSubmissionrawgradeOk() (*float32, bool)`

GetSubmissionrawgradeOk returns a tuple with the Submissionrawgrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissionrawgrade

`func (o *ModWorkshopGetGrades200Response) SetSubmissionrawgrade(v float32)`

SetSubmissionrawgrade sets Submissionrawgrade field to given value.

### HasSubmissionrawgrade

`func (o *ModWorkshopGetGrades200Response) HasSubmissionrawgrade() bool`

HasSubmissionrawgrade returns a boolean if a field has been set.

### GetWarnings

`func (o *ModWorkshopGetGrades200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModWorkshopGetGrades200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModWorkshopGetGrades200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModWorkshopGetGrades200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


