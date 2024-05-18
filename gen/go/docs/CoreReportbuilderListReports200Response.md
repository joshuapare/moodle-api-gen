# CoreReportbuilderListReports200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Reports** | [**[]CoreReportbuilderListReports200ResponseReportsInner**](CoreReportbuilderListReports200ResponseReportsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreReportbuilderListReports200Response

`func NewCoreReportbuilderListReports200Response(reports []CoreReportbuilderListReports200ResponseReportsInner, ) *CoreReportbuilderListReports200Response`

NewCoreReportbuilderListReports200Response instantiates a new CoreReportbuilderListReports200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreReportbuilderListReports200ResponseWithDefaults

`func NewCoreReportbuilderListReports200ResponseWithDefaults() *CoreReportbuilderListReports200Response`

NewCoreReportbuilderListReports200ResponseWithDefaults instantiates a new CoreReportbuilderListReports200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetReports

`func (o *CoreReportbuilderListReports200Response) GetReports() []CoreReportbuilderListReports200ResponseReportsInner`

GetReports returns the Reports field if non-nil, zero value otherwise.

### GetReportsOk

`func (o *CoreReportbuilderListReports200Response) GetReportsOk() (*[]CoreReportbuilderListReports200ResponseReportsInner, bool)`

GetReportsOk returns a tuple with the Reports field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReports

`func (o *CoreReportbuilderListReports200Response) SetReports(v []CoreReportbuilderListReports200ResponseReportsInner)`

SetReports sets Reports field to given value.


### GetWarnings

`func (o *CoreReportbuilderListReports200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreReportbuilderListReports200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreReportbuilderListReports200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreReportbuilderListReports200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


