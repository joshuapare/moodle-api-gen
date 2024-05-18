# CoreReportbuilderSetFiltersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Parameters** | Pointer to **string** | JSON encoded report parameters | [optional] [default to ""]
**Reportid** | **int32** | Report ID | 
**Values** | **string** | JSON encoded filter values | [default to "null"]

## Methods

### NewCoreReportbuilderSetFiltersRequest

`func NewCoreReportbuilderSetFiltersRequest(reportid int32, values string, ) *CoreReportbuilderSetFiltersRequest`

NewCoreReportbuilderSetFiltersRequest instantiates a new CoreReportbuilderSetFiltersRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreReportbuilderSetFiltersRequestWithDefaults

`func NewCoreReportbuilderSetFiltersRequestWithDefaults() *CoreReportbuilderSetFiltersRequest`

NewCoreReportbuilderSetFiltersRequestWithDefaults instantiates a new CoreReportbuilderSetFiltersRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetParameters

`func (o *CoreReportbuilderSetFiltersRequest) GetParameters() string`

GetParameters returns the Parameters field if non-nil, zero value otherwise.

### GetParametersOk

`func (o *CoreReportbuilderSetFiltersRequest) GetParametersOk() (*string, bool)`

GetParametersOk returns a tuple with the Parameters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParameters

`func (o *CoreReportbuilderSetFiltersRequest) SetParameters(v string)`

SetParameters sets Parameters field to given value.

### HasParameters

`func (o *CoreReportbuilderSetFiltersRequest) HasParameters() bool`

HasParameters returns a boolean if a field has been set.

### GetReportid

`func (o *CoreReportbuilderSetFiltersRequest) GetReportid() int32`

GetReportid returns the Reportid field if non-nil, zero value otherwise.

### GetReportidOk

`func (o *CoreReportbuilderSetFiltersRequest) GetReportidOk() (*int32, bool)`

GetReportidOk returns a tuple with the Reportid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportid

`func (o *CoreReportbuilderSetFiltersRequest) SetReportid(v int32)`

SetReportid sets Reportid field to given value.


### GetValues

`func (o *CoreReportbuilderSetFiltersRequest) GetValues() string`

GetValues returns the Values field if non-nil, zero value otherwise.

### GetValuesOk

`func (o *CoreReportbuilderSetFiltersRequest) GetValuesOk() (*string, bool)`

GetValuesOk returns a tuple with the Values field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValues

`func (o *CoreReportbuilderSetFiltersRequest) SetValues(v string)`

SetValues sets Values field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


