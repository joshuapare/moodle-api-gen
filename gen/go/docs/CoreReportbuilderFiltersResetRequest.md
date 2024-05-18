# CoreReportbuilderFiltersResetRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Parameters** | Pointer to **string** | JSON encoded report parameters | [optional] [default to ""]
**Reportid** | **int32** | Report ID | 

## Methods

### NewCoreReportbuilderFiltersResetRequest

`func NewCoreReportbuilderFiltersResetRequest(reportid int32, ) *CoreReportbuilderFiltersResetRequest`

NewCoreReportbuilderFiltersResetRequest instantiates a new CoreReportbuilderFiltersResetRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreReportbuilderFiltersResetRequestWithDefaults

`func NewCoreReportbuilderFiltersResetRequestWithDefaults() *CoreReportbuilderFiltersResetRequest`

NewCoreReportbuilderFiltersResetRequestWithDefaults instantiates a new CoreReportbuilderFiltersResetRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetParameters

`func (o *CoreReportbuilderFiltersResetRequest) GetParameters() string`

GetParameters returns the Parameters field if non-nil, zero value otherwise.

### GetParametersOk

`func (o *CoreReportbuilderFiltersResetRequest) GetParametersOk() (*string, bool)`

GetParametersOk returns a tuple with the Parameters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParameters

`func (o *CoreReportbuilderFiltersResetRequest) SetParameters(v string)`

SetParameters sets Parameters field to given value.

### HasParameters

`func (o *CoreReportbuilderFiltersResetRequest) HasParameters() bool`

HasParameters returns a boolean if a field has been set.

### GetReportid

`func (o *CoreReportbuilderFiltersResetRequest) GetReportid() int32`

GetReportid returns the Reportid field if non-nil, zero value otherwise.

### GetReportidOk

`func (o *CoreReportbuilderFiltersResetRequest) GetReportidOk() (*int32, bool)`

GetReportidOk returns a tuple with the Reportid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportid

`func (o *CoreReportbuilderFiltersResetRequest) SetReportid(v int32)`

SetReportid sets Reportid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


