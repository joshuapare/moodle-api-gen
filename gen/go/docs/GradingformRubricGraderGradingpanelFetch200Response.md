# GradingformRubricGraderGradingpanelFetch200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Grade** | [**GradingformRubricGraderGradingpanelFetch200ResponseGrade**](GradingformRubricGraderGradingpanelFetch200ResponseGrade.md) |  | 
**Hasgrade** | **bool** | Does the user have a grade? | 
**Templatename** | **string** | The template to use when rendering this data | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewGradingformRubricGraderGradingpanelFetch200Response

`func NewGradingformRubricGraderGradingpanelFetch200Response(grade GradingformRubricGraderGradingpanelFetch200ResponseGrade, hasgrade bool, templatename string, ) *GradingformRubricGraderGradingpanelFetch200Response`

NewGradingformRubricGraderGradingpanelFetch200Response instantiates a new GradingformRubricGraderGradingpanelFetch200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGradingformRubricGraderGradingpanelFetch200ResponseWithDefaults

`func NewGradingformRubricGraderGradingpanelFetch200ResponseWithDefaults() *GradingformRubricGraderGradingpanelFetch200Response`

NewGradingformRubricGraderGradingpanelFetch200ResponseWithDefaults instantiates a new GradingformRubricGraderGradingpanelFetch200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGrade

`func (o *GradingformRubricGraderGradingpanelFetch200Response) GetGrade() GradingformRubricGraderGradingpanelFetch200ResponseGrade`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *GradingformRubricGraderGradingpanelFetch200Response) GetGradeOk() (*GradingformRubricGraderGradingpanelFetch200ResponseGrade, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *GradingformRubricGraderGradingpanelFetch200Response) SetGrade(v GradingformRubricGraderGradingpanelFetch200ResponseGrade)`

SetGrade sets Grade field to given value.


### GetHasgrade

`func (o *GradingformRubricGraderGradingpanelFetch200Response) GetHasgrade() bool`

GetHasgrade returns the Hasgrade field if non-nil, zero value otherwise.

### GetHasgradeOk

`func (o *GradingformRubricGraderGradingpanelFetch200Response) GetHasgradeOk() (*bool, bool)`

GetHasgradeOk returns a tuple with the Hasgrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasgrade

`func (o *GradingformRubricGraderGradingpanelFetch200Response) SetHasgrade(v bool)`

SetHasgrade sets Hasgrade field to given value.


### GetTemplatename

`func (o *GradingformRubricGraderGradingpanelFetch200Response) GetTemplatename() string`

GetTemplatename returns the Templatename field if non-nil, zero value otherwise.

### GetTemplatenameOk

`func (o *GradingformRubricGraderGradingpanelFetch200Response) GetTemplatenameOk() (*string, bool)`

GetTemplatenameOk returns a tuple with the Templatename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemplatename

`func (o *GradingformRubricGraderGradingpanelFetch200Response) SetTemplatename(v string)`

SetTemplatename sets Templatename field to given value.


### GetWarnings

`func (o *GradingformRubricGraderGradingpanelFetch200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *GradingformRubricGraderGradingpanelFetch200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *GradingformRubricGraderGradingpanelFetch200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *GradingformRubricGraderGradingpanelFetch200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


