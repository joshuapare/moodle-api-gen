# ReportInsightsActionExecutedRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Actionname** | **string** | The name of the action | [default to "null"]
**Predictionids** | **[]map[string]interface{}** |  | 

## Methods

### NewReportInsightsActionExecutedRequest

`func NewReportInsightsActionExecutedRequest(actionname string, predictionids []map[string]interface{}, ) *ReportInsightsActionExecutedRequest`

NewReportInsightsActionExecutedRequest instantiates a new ReportInsightsActionExecutedRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewReportInsightsActionExecutedRequestWithDefaults

`func NewReportInsightsActionExecutedRequestWithDefaults() *ReportInsightsActionExecutedRequest`

NewReportInsightsActionExecutedRequestWithDefaults instantiates a new ReportInsightsActionExecutedRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetActionname

`func (o *ReportInsightsActionExecutedRequest) GetActionname() string`

GetActionname returns the Actionname field if non-nil, zero value otherwise.

### GetActionnameOk

`func (o *ReportInsightsActionExecutedRequest) GetActionnameOk() (*string, bool)`

GetActionnameOk returns a tuple with the Actionname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActionname

`func (o *ReportInsightsActionExecutedRequest) SetActionname(v string)`

SetActionname sets Actionname field to given value.


### GetPredictionids

`func (o *ReportInsightsActionExecutedRequest) GetPredictionids() []map[string]interface{}`

GetPredictionids returns the Predictionids field if non-nil, zero value otherwise.

### GetPredictionidsOk

`func (o *ReportInsightsActionExecutedRequest) GetPredictionidsOk() (*[]map[string]interface{}, bool)`

GetPredictionidsOk returns a tuple with the Predictionids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPredictionids

`func (o *ReportInsightsActionExecutedRequest) SetPredictionids(v []map[string]interface{})`

SetPredictionids sets Predictionids field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


