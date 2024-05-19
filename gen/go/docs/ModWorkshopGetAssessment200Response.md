# ModWorkshopGetAssessment200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Assessment** | [**ModWorkshopGetAssessment200ResponseAssessment**](ModWorkshopGetAssessment200ResponseAssessment.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModWorkshopGetAssessment200Response

`func NewModWorkshopGetAssessment200Response(assessment ModWorkshopGetAssessment200ResponseAssessment, ) *ModWorkshopGetAssessment200Response`

NewModWorkshopGetAssessment200Response instantiates a new ModWorkshopGetAssessment200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopGetAssessment200ResponseWithDefaults

`func NewModWorkshopGetAssessment200ResponseWithDefaults() *ModWorkshopGetAssessment200Response`

NewModWorkshopGetAssessment200ResponseWithDefaults instantiates a new ModWorkshopGetAssessment200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssessment

`func (o *ModWorkshopGetAssessment200Response) GetAssessment() ModWorkshopGetAssessment200ResponseAssessment`

GetAssessment returns the Assessment field if non-nil, zero value otherwise.

### GetAssessmentOk

`func (o *ModWorkshopGetAssessment200Response) GetAssessmentOk() (*ModWorkshopGetAssessment200ResponseAssessment, bool)`

GetAssessmentOk returns a tuple with the Assessment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssessment

`func (o *ModWorkshopGetAssessment200Response) SetAssessment(v ModWorkshopGetAssessment200ResponseAssessment)`

SetAssessment sets Assessment field to given value.


### GetWarnings

`func (o *ModWorkshopGetAssessment200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModWorkshopGetAssessment200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModWorkshopGetAssessment200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModWorkshopGetAssessment200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


