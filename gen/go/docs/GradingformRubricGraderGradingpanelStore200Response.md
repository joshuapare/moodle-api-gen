# GradingformRubricGraderGradingpanelStore200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Grade** | [**GradingformRubricGraderGradingpanelStore200ResponseGrade**](GradingformRubricGraderGradingpanelStore200ResponseGrade.md) |  | 
**Hasgrade** | **bool** | Does the user have a grade? | 
**Templatename** | **string** | The template to use when rendering this data | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewGradingformRubricGraderGradingpanelStore200Response

`func NewGradingformRubricGraderGradingpanelStore200Response(grade GradingformRubricGraderGradingpanelStore200ResponseGrade, hasgrade bool, templatename string, ) *GradingformRubricGraderGradingpanelStore200Response`

NewGradingformRubricGraderGradingpanelStore200Response instantiates a new GradingformRubricGraderGradingpanelStore200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGradingformRubricGraderGradingpanelStore200ResponseWithDefaults

`func NewGradingformRubricGraderGradingpanelStore200ResponseWithDefaults() *GradingformRubricGraderGradingpanelStore200Response`

NewGradingformRubricGraderGradingpanelStore200ResponseWithDefaults instantiates a new GradingformRubricGraderGradingpanelStore200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGrade

`func (o *GradingformRubricGraderGradingpanelStore200Response) GetGrade() GradingformRubricGraderGradingpanelStore200ResponseGrade`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *GradingformRubricGraderGradingpanelStore200Response) GetGradeOk() (*GradingformRubricGraderGradingpanelStore200ResponseGrade, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *GradingformRubricGraderGradingpanelStore200Response) SetGrade(v GradingformRubricGraderGradingpanelStore200ResponseGrade)`

SetGrade sets Grade field to given value.


### GetHasgrade

`func (o *GradingformRubricGraderGradingpanelStore200Response) GetHasgrade() bool`

GetHasgrade returns the Hasgrade field if non-nil, zero value otherwise.

### GetHasgradeOk

`func (o *GradingformRubricGraderGradingpanelStore200Response) GetHasgradeOk() (*bool, bool)`

GetHasgradeOk returns a tuple with the Hasgrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasgrade

`func (o *GradingformRubricGraderGradingpanelStore200Response) SetHasgrade(v bool)`

SetHasgrade sets Hasgrade field to given value.


### GetTemplatename

`func (o *GradingformRubricGraderGradingpanelStore200Response) GetTemplatename() string`

GetTemplatename returns the Templatename field if non-nil, zero value otherwise.

### GetTemplatenameOk

`func (o *GradingformRubricGraderGradingpanelStore200Response) GetTemplatenameOk() (*string, bool)`

GetTemplatenameOk returns a tuple with the Templatename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemplatename

`func (o *GradingformRubricGraderGradingpanelStore200Response) SetTemplatename(v string)`

SetTemplatename sets Templatename field to given value.


### GetWarnings

`func (o *GradingformRubricGraderGradingpanelStore200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *GradingformRubricGraderGradingpanelStore200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *GradingformRubricGraderGradingpanelStore200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *GradingformRubricGraderGradingpanelStore200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


