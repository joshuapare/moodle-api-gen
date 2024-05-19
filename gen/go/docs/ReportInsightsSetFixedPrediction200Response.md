# ReportInsightsSetFixedPrediction200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Success** | **bool** | True if the prediction was successfully flagged as fixed. | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewReportInsightsSetFixedPrediction200Response

`func NewReportInsightsSetFixedPrediction200Response(success bool, ) *ReportInsightsSetFixedPrediction200Response`

NewReportInsightsSetFixedPrediction200Response instantiates a new ReportInsightsSetFixedPrediction200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewReportInsightsSetFixedPrediction200ResponseWithDefaults

`func NewReportInsightsSetFixedPrediction200ResponseWithDefaults() *ReportInsightsSetFixedPrediction200Response`

NewReportInsightsSetFixedPrediction200ResponseWithDefaults instantiates a new ReportInsightsSetFixedPrediction200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSuccess

`func (o *ReportInsightsSetFixedPrediction200Response) GetSuccess() bool`

GetSuccess returns the Success field if non-nil, zero value otherwise.

### GetSuccessOk

`func (o *ReportInsightsSetFixedPrediction200Response) GetSuccessOk() (*bool, bool)`

GetSuccessOk returns a tuple with the Success field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuccess

`func (o *ReportInsightsSetFixedPrediction200Response) SetSuccess(v bool)`

SetSuccess sets Success field to given value.


### GetWarnings

`func (o *ReportInsightsSetFixedPrediction200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ReportInsightsSetFixedPrediction200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ReportInsightsSetFixedPrediction200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ReportInsightsSetFixedPrediction200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


