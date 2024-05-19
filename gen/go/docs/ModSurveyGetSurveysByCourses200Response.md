# ModSurveyGetSurveysByCourses200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Surveys** | [**[]ModSurveyGetSurveysByCourses200ResponseSurveysInner**](ModSurveyGetSurveysByCourses200ResponseSurveysInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModSurveyGetSurveysByCourses200Response

`func NewModSurveyGetSurveysByCourses200Response(surveys []ModSurveyGetSurveysByCourses200ResponseSurveysInner, ) *ModSurveyGetSurveysByCourses200Response`

NewModSurveyGetSurveysByCourses200Response instantiates a new ModSurveyGetSurveysByCourses200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModSurveyGetSurveysByCourses200ResponseWithDefaults

`func NewModSurveyGetSurveysByCourses200ResponseWithDefaults() *ModSurveyGetSurveysByCourses200Response`

NewModSurveyGetSurveysByCourses200ResponseWithDefaults instantiates a new ModSurveyGetSurveysByCourses200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSurveys

`func (o *ModSurveyGetSurveysByCourses200Response) GetSurveys() []ModSurveyGetSurveysByCourses200ResponseSurveysInner`

GetSurveys returns the Surveys field if non-nil, zero value otherwise.

### GetSurveysOk

`func (o *ModSurveyGetSurveysByCourses200Response) GetSurveysOk() (*[]ModSurveyGetSurveysByCourses200ResponseSurveysInner, bool)`

GetSurveysOk returns a tuple with the Surveys field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSurveys

`func (o *ModSurveyGetSurveysByCourses200Response) SetSurveys(v []ModSurveyGetSurveysByCourses200ResponseSurveysInner)`

SetSurveys sets Surveys field to given value.


### GetWarnings

`func (o *ModSurveyGetSurveysByCourses200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModSurveyGetSurveysByCourses200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModSurveyGetSurveysByCourses200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModSurveyGetSurveysByCourses200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


