# CoreReportbuilderRetrieveReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Page** | Pointer to **int32** | Page number | [optional] [default to 0]
**Perpage** | Pointer to **int32** | Reports per page | [optional] [default to 10]
**Reportid** | **int32** | Report ID | 

## Methods

### NewCoreReportbuilderRetrieveReportRequest

`func NewCoreReportbuilderRetrieveReportRequest(reportid int32, ) *CoreReportbuilderRetrieveReportRequest`

NewCoreReportbuilderRetrieveReportRequest instantiates a new CoreReportbuilderRetrieveReportRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreReportbuilderRetrieveReportRequestWithDefaults

`func NewCoreReportbuilderRetrieveReportRequestWithDefaults() *CoreReportbuilderRetrieveReportRequest`

NewCoreReportbuilderRetrieveReportRequestWithDefaults instantiates a new CoreReportbuilderRetrieveReportRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPage

`func (o *CoreReportbuilderRetrieveReportRequest) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *CoreReportbuilderRetrieveReportRequest) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *CoreReportbuilderRetrieveReportRequest) SetPage(v int32)`

SetPage sets Page field to given value.

### HasPage

`func (o *CoreReportbuilderRetrieveReportRequest) HasPage() bool`

HasPage returns a boolean if a field has been set.

### GetPerpage

`func (o *CoreReportbuilderRetrieveReportRequest) GetPerpage() int32`

GetPerpage returns the Perpage field if non-nil, zero value otherwise.

### GetPerpageOk

`func (o *CoreReportbuilderRetrieveReportRequest) GetPerpageOk() (*int32, bool)`

GetPerpageOk returns a tuple with the Perpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPerpage

`func (o *CoreReportbuilderRetrieveReportRequest) SetPerpage(v int32)`

SetPerpage sets Perpage field to given value.

### HasPerpage

`func (o *CoreReportbuilderRetrieveReportRequest) HasPerpage() bool`

HasPerpage returns a boolean if a field has been set.

### GetReportid

`func (o *CoreReportbuilderRetrieveReportRequest) GetReportid() int32`

GetReportid returns the Reportid field if non-nil, zero value otherwise.

### GetReportidOk

`func (o *CoreReportbuilderRetrieveReportRequest) GetReportidOk() (*int32, bool)`

GetReportidOk returns a tuple with the Reportid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportid

`func (o *CoreReportbuilderRetrieveReportRequest) SetReportid(v int32)`

SetReportid sets Reportid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


