# ModWorkshopGetAssessmentFormDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Assessmentid** | **int32** | Assessment id | 
**Mode** | Pointer to **string** | The form mode (assessment or preview) | [optional] [default to "assessment"]

## Methods

### NewModWorkshopGetAssessmentFormDefinitionRequest

`func NewModWorkshopGetAssessmentFormDefinitionRequest(assessmentid int32, ) *ModWorkshopGetAssessmentFormDefinitionRequest`

NewModWorkshopGetAssessmentFormDefinitionRequest instantiates a new ModWorkshopGetAssessmentFormDefinitionRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopGetAssessmentFormDefinitionRequestWithDefaults

`func NewModWorkshopGetAssessmentFormDefinitionRequestWithDefaults() *ModWorkshopGetAssessmentFormDefinitionRequest`

NewModWorkshopGetAssessmentFormDefinitionRequestWithDefaults instantiates a new ModWorkshopGetAssessmentFormDefinitionRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssessmentid

`func (o *ModWorkshopGetAssessmentFormDefinitionRequest) GetAssessmentid() int32`

GetAssessmentid returns the Assessmentid field if non-nil, zero value otherwise.

### GetAssessmentidOk

`func (o *ModWorkshopGetAssessmentFormDefinitionRequest) GetAssessmentidOk() (*int32, bool)`

GetAssessmentidOk returns a tuple with the Assessmentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssessmentid

`func (o *ModWorkshopGetAssessmentFormDefinitionRequest) SetAssessmentid(v int32)`

SetAssessmentid sets Assessmentid field to given value.


### GetMode

`func (o *ModWorkshopGetAssessmentFormDefinitionRequest) GetMode() string`

GetMode returns the Mode field if non-nil, zero value otherwise.

### GetModeOk

`func (o *ModWorkshopGetAssessmentFormDefinitionRequest) GetModeOk() (*string, bool)`

GetModeOk returns a tuple with the Mode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMode

`func (o *ModWorkshopGetAssessmentFormDefinitionRequest) SetMode(v string)`

SetMode sets Mode field to given value.

### HasMode

`func (o *ModWorkshopGetAssessmentFormDefinitionRequest) HasMode() bool`

HasMode returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


