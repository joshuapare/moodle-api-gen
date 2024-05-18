# CoreReportbuilderListReportsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Page** | Pointer to **int32** | Page number | [optional] [default to 0]
**Perpage** | Pointer to **int32** | Reports per page | [optional] [default to 10]

## Methods

### NewCoreReportbuilderListReportsRequest

`func NewCoreReportbuilderListReportsRequest() *CoreReportbuilderListReportsRequest`

NewCoreReportbuilderListReportsRequest instantiates a new CoreReportbuilderListReportsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreReportbuilderListReportsRequestWithDefaults

`func NewCoreReportbuilderListReportsRequestWithDefaults() *CoreReportbuilderListReportsRequest`

NewCoreReportbuilderListReportsRequestWithDefaults instantiates a new CoreReportbuilderListReportsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPage

`func (o *CoreReportbuilderListReportsRequest) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *CoreReportbuilderListReportsRequest) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *CoreReportbuilderListReportsRequest) SetPage(v int32)`

SetPage sets Page field to given value.

### HasPage

`func (o *CoreReportbuilderListReportsRequest) HasPage() bool`

HasPage returns a boolean if a field has been set.

### GetPerpage

`func (o *CoreReportbuilderListReportsRequest) GetPerpage() int32`

GetPerpage returns the Perpage field if non-nil, zero value otherwise.

### GetPerpageOk

`func (o *CoreReportbuilderListReportsRequest) GetPerpageOk() (*int32, bool)`

GetPerpageOk returns a tuple with the Perpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPerpage

`func (o *CoreReportbuilderListReportsRequest) SetPerpage(v int32)`

SetPerpage sets Perpage field to given value.

### HasPerpage

`func (o *CoreReportbuilderListReportsRequest) HasPerpage() bool`

HasPerpage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


