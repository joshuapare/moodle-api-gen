# CoreReportbuilderReportsGetRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Editmode** | Pointer to **bool** | Whether editing mode is enabled | [optional] [default to 0]
**Pagesize** | Pointer to **int32** | Page size | [optional] [default to 0]
**Reportid** | **int32** | Report ID | 

## Methods

### NewCoreReportbuilderReportsGetRequest

`func NewCoreReportbuilderReportsGetRequest(reportid int32, ) *CoreReportbuilderReportsGetRequest`

NewCoreReportbuilderReportsGetRequest instantiates a new CoreReportbuilderReportsGetRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreReportbuilderReportsGetRequestWithDefaults

`func NewCoreReportbuilderReportsGetRequestWithDefaults() *CoreReportbuilderReportsGetRequest`

NewCoreReportbuilderReportsGetRequestWithDefaults instantiates a new CoreReportbuilderReportsGetRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEditmode

`func (o *CoreReportbuilderReportsGetRequest) GetEditmode() bool`

GetEditmode returns the Editmode field if non-nil, zero value otherwise.

### GetEditmodeOk

`func (o *CoreReportbuilderReportsGetRequest) GetEditmodeOk() (*bool, bool)`

GetEditmodeOk returns a tuple with the Editmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEditmode

`func (o *CoreReportbuilderReportsGetRequest) SetEditmode(v bool)`

SetEditmode sets Editmode field to given value.

### HasEditmode

`func (o *CoreReportbuilderReportsGetRequest) HasEditmode() bool`

HasEditmode returns a boolean if a field has been set.

### GetPagesize

`func (o *CoreReportbuilderReportsGetRequest) GetPagesize() int32`

GetPagesize returns the Pagesize field if non-nil, zero value otherwise.

### GetPagesizeOk

`func (o *CoreReportbuilderReportsGetRequest) GetPagesizeOk() (*int32, bool)`

GetPagesizeOk returns a tuple with the Pagesize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPagesize

`func (o *CoreReportbuilderReportsGetRequest) SetPagesize(v int32)`

SetPagesize sets Pagesize field to given value.

### HasPagesize

`func (o *CoreReportbuilderReportsGetRequest) HasPagesize() bool`

HasPagesize returns a boolean if a field has been set.

### GetReportid

`func (o *CoreReportbuilderReportsGetRequest) GetReportid() int32`

GetReportid returns the Reportid field if non-nil, zero value otherwise.

### GetReportidOk

`func (o *CoreReportbuilderReportsGetRequest) GetReportidOk() (*int32, bool)`

GetReportidOk returns a tuple with the Reportid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportid

`func (o *CoreReportbuilderReportsGetRequest) SetReportid(v int32)`

SetReportid sets Reportid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


