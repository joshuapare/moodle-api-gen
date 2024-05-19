# ReportInsightsSetNotusefulPrediction200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Success** | **bool** | True if the prediction was successfully flagged as not useful. | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewReportInsightsSetNotusefulPrediction200Response

`func NewReportInsightsSetNotusefulPrediction200Response(success bool, ) *ReportInsightsSetNotusefulPrediction200Response`

NewReportInsightsSetNotusefulPrediction200Response instantiates a new ReportInsightsSetNotusefulPrediction200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewReportInsightsSetNotusefulPrediction200ResponseWithDefaults

`func NewReportInsightsSetNotusefulPrediction200ResponseWithDefaults() *ReportInsightsSetNotusefulPrediction200Response`

NewReportInsightsSetNotusefulPrediction200ResponseWithDefaults instantiates a new ReportInsightsSetNotusefulPrediction200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSuccess

`func (o *ReportInsightsSetNotusefulPrediction200Response) GetSuccess() bool`

GetSuccess returns the Success field if non-nil, zero value otherwise.

### GetSuccessOk

`func (o *ReportInsightsSetNotusefulPrediction200Response) GetSuccessOk() (*bool, bool)`

GetSuccessOk returns a tuple with the Success field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuccess

`func (o *ReportInsightsSetNotusefulPrediction200Response) SetSuccess(v bool)`

SetSuccess sets Success field to given value.


### GetWarnings

`func (o *ReportInsightsSetNotusefulPrediction200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ReportInsightsSetNotusefulPrediction200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ReportInsightsSetNotusefulPrediction200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ReportInsightsSetNotusefulPrediction200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


