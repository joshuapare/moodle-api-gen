# ModWorkshopGetReviewerAssessments200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Assessments** | [**[]ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner**](ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModWorkshopGetReviewerAssessments200Response

`func NewModWorkshopGetReviewerAssessments200Response(assessments []ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner, ) *ModWorkshopGetReviewerAssessments200Response`

NewModWorkshopGetReviewerAssessments200Response instantiates a new ModWorkshopGetReviewerAssessments200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopGetReviewerAssessments200ResponseWithDefaults

`func NewModWorkshopGetReviewerAssessments200ResponseWithDefaults() *ModWorkshopGetReviewerAssessments200Response`

NewModWorkshopGetReviewerAssessments200ResponseWithDefaults instantiates a new ModWorkshopGetReviewerAssessments200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssessments

`func (o *ModWorkshopGetReviewerAssessments200Response) GetAssessments() []ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner`

GetAssessments returns the Assessments field if non-nil, zero value otherwise.

### GetAssessmentsOk

`func (o *ModWorkshopGetReviewerAssessments200Response) GetAssessmentsOk() (*[]ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner, bool)`

GetAssessmentsOk returns a tuple with the Assessments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssessments

`func (o *ModWorkshopGetReviewerAssessments200Response) SetAssessments(v []ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner)`

SetAssessments sets Assessments field to given value.


### GetWarnings

`func (o *ModWorkshopGetReviewerAssessments200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModWorkshopGetReviewerAssessments200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModWorkshopGetReviewerAssessments200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModWorkshopGetReviewerAssessments200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


