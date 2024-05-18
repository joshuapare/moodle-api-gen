# ModWorkshopGetAssessmentFormDefinition200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Current** | [**[]ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner**](ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner.md) |  | 
**Descriptionfiles** | [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | 
**Dimensionsinfo** | [**[]ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner**](ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner.md) |  | 
**Dimenssionscount** | **int32** | The number of dimenssions used by the form. | [default to null]
**Fields** | [**[]ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner**](ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner.md) |  | 
**Options** | [**[]ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner**](ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModWorkshopGetAssessmentFormDefinition200Response

`func NewModWorkshopGetAssessmentFormDefinition200Response(current []ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner, descriptionfiles []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, dimensionsinfo []ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner, dimenssionscount int32, fields []ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner, options []ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner, ) *ModWorkshopGetAssessmentFormDefinition200Response`

NewModWorkshopGetAssessmentFormDefinition200Response instantiates a new ModWorkshopGetAssessmentFormDefinition200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopGetAssessmentFormDefinition200ResponseWithDefaults

`func NewModWorkshopGetAssessmentFormDefinition200ResponseWithDefaults() *ModWorkshopGetAssessmentFormDefinition200Response`

NewModWorkshopGetAssessmentFormDefinition200ResponseWithDefaults instantiates a new ModWorkshopGetAssessmentFormDefinition200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCurrent

`func (o *ModWorkshopGetAssessmentFormDefinition200Response) GetCurrent() []ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner`

GetCurrent returns the Current field if non-nil, zero value otherwise.

### GetCurrentOk

`func (o *ModWorkshopGetAssessmentFormDefinition200Response) GetCurrentOk() (*[]ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner, bool)`

GetCurrentOk returns a tuple with the Current field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrent

`func (o *ModWorkshopGetAssessmentFormDefinition200Response) SetCurrent(v []ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner)`

SetCurrent sets Current field to given value.


### GetDescriptionfiles

`func (o *ModWorkshopGetAssessmentFormDefinition200Response) GetDescriptionfiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetDescriptionfiles returns the Descriptionfiles field if non-nil, zero value otherwise.

### GetDescriptionfilesOk

`func (o *ModWorkshopGetAssessmentFormDefinition200Response) GetDescriptionfilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetDescriptionfilesOk returns a tuple with the Descriptionfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionfiles

`func (o *ModWorkshopGetAssessmentFormDefinition200Response) SetDescriptionfiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetDescriptionfiles sets Descriptionfiles field to given value.


### GetDimensionsinfo

`func (o *ModWorkshopGetAssessmentFormDefinition200Response) GetDimensionsinfo() []ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner`

GetDimensionsinfo returns the Dimensionsinfo field if non-nil, zero value otherwise.

### GetDimensionsinfoOk

`func (o *ModWorkshopGetAssessmentFormDefinition200Response) GetDimensionsinfoOk() (*[]ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner, bool)`

GetDimensionsinfoOk returns a tuple with the Dimensionsinfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDimensionsinfo

`func (o *ModWorkshopGetAssessmentFormDefinition200Response) SetDimensionsinfo(v []ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner)`

SetDimensionsinfo sets Dimensionsinfo field to given value.


### GetDimenssionscount

`func (o *ModWorkshopGetAssessmentFormDefinition200Response) GetDimenssionscount() int32`

GetDimenssionscount returns the Dimenssionscount field if non-nil, zero value otherwise.

### GetDimenssionscountOk

`func (o *ModWorkshopGetAssessmentFormDefinition200Response) GetDimenssionscountOk() (*int32, bool)`

GetDimenssionscountOk returns a tuple with the Dimenssionscount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDimenssionscount

`func (o *ModWorkshopGetAssessmentFormDefinition200Response) SetDimenssionscount(v int32)`

SetDimenssionscount sets Dimenssionscount field to given value.


### GetFields

`func (o *ModWorkshopGetAssessmentFormDefinition200Response) GetFields() []ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner`

GetFields returns the Fields field if non-nil, zero value otherwise.

### GetFieldsOk

`func (o *ModWorkshopGetAssessmentFormDefinition200Response) GetFieldsOk() (*[]ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner, bool)`

GetFieldsOk returns a tuple with the Fields field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFields

`func (o *ModWorkshopGetAssessmentFormDefinition200Response) SetFields(v []ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner)`

SetFields sets Fields field to given value.


### GetOptions

`func (o *ModWorkshopGetAssessmentFormDefinition200Response) GetOptions() []ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *ModWorkshopGetAssessmentFormDefinition200Response) GetOptionsOk() (*[]ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *ModWorkshopGetAssessmentFormDefinition200Response) SetOptions(v []ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner)`

SetOptions sets Options field to given value.


### GetWarnings

`func (o *ModWorkshopGetAssessmentFormDefinition200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModWorkshopGetAssessmentFormDefinition200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModWorkshopGetAssessmentFormDefinition200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModWorkshopGetAssessmentFormDefinition200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


