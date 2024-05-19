# CoreReportbuilderRetrieveSystemReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Area** | Pointer to **string** | Report area | [optional] [default to ""]
**Component** | Pointer to **string** | Report component | [optional] [default to ""]
**Context** | [**CoreCohortSearchCohortsRequestContext**](CoreCohortSearchCohortsRequestContext.md) |  | 
**Itemid** | Pointer to **int32** | Report item ID | [optional] [default to 0]
**Page** | Pointer to **int32** | Page number | [optional] [default to 0]
**Parameters** | Pointer to [**[]CoreReportbuilderCanViewSystemReportRequestParametersInner**](CoreReportbuilderCanViewSystemReportRequestParametersInner.md) |  | [optional] 
**Perpage** | Pointer to **int32** | Reports per page | [optional] [default to 10]
**Source** | **string** | Report class path | 

## Methods

### NewCoreReportbuilderRetrieveSystemReportRequest

`func NewCoreReportbuilderRetrieveSystemReportRequest(context CoreCohortSearchCohortsRequestContext, source string, ) *CoreReportbuilderRetrieveSystemReportRequest`

NewCoreReportbuilderRetrieveSystemReportRequest instantiates a new CoreReportbuilderRetrieveSystemReportRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreReportbuilderRetrieveSystemReportRequestWithDefaults

`func NewCoreReportbuilderRetrieveSystemReportRequestWithDefaults() *CoreReportbuilderRetrieveSystemReportRequest`

NewCoreReportbuilderRetrieveSystemReportRequestWithDefaults instantiates a new CoreReportbuilderRetrieveSystemReportRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetArea

`func (o *CoreReportbuilderRetrieveSystemReportRequest) GetArea() string`

GetArea returns the Area field if non-nil, zero value otherwise.

### GetAreaOk

`func (o *CoreReportbuilderRetrieveSystemReportRequest) GetAreaOk() (*string, bool)`

GetAreaOk returns a tuple with the Area field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetArea

`func (o *CoreReportbuilderRetrieveSystemReportRequest) SetArea(v string)`

SetArea sets Area field to given value.

### HasArea

`func (o *CoreReportbuilderRetrieveSystemReportRequest) HasArea() bool`

HasArea returns a boolean if a field has been set.

### GetComponent

`func (o *CoreReportbuilderRetrieveSystemReportRequest) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreReportbuilderRetrieveSystemReportRequest) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreReportbuilderRetrieveSystemReportRequest) SetComponent(v string)`

SetComponent sets Component field to given value.

### HasComponent

`func (o *CoreReportbuilderRetrieveSystemReportRequest) HasComponent() bool`

HasComponent returns a boolean if a field has been set.

### GetContext

`func (o *CoreReportbuilderRetrieveSystemReportRequest) GetContext() CoreCohortSearchCohortsRequestContext`

GetContext returns the Context field if non-nil, zero value otherwise.

### GetContextOk

`func (o *CoreReportbuilderRetrieveSystemReportRequest) GetContextOk() (*CoreCohortSearchCohortsRequestContext, bool)`

GetContextOk returns a tuple with the Context field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContext

`func (o *CoreReportbuilderRetrieveSystemReportRequest) SetContext(v CoreCohortSearchCohortsRequestContext)`

SetContext sets Context field to given value.


### GetItemid

`func (o *CoreReportbuilderRetrieveSystemReportRequest) GetItemid() int32`

GetItemid returns the Itemid field if non-nil, zero value otherwise.

### GetItemidOk

`func (o *CoreReportbuilderRetrieveSystemReportRequest) GetItemidOk() (*int32, bool)`

GetItemidOk returns a tuple with the Itemid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemid

`func (o *CoreReportbuilderRetrieveSystemReportRequest) SetItemid(v int32)`

SetItemid sets Itemid field to given value.

### HasItemid

`func (o *CoreReportbuilderRetrieveSystemReportRequest) HasItemid() bool`

HasItemid returns a boolean if a field has been set.

### GetPage

`func (o *CoreReportbuilderRetrieveSystemReportRequest) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *CoreReportbuilderRetrieveSystemReportRequest) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *CoreReportbuilderRetrieveSystemReportRequest) SetPage(v int32)`

SetPage sets Page field to given value.

### HasPage

`func (o *CoreReportbuilderRetrieveSystemReportRequest) HasPage() bool`

HasPage returns a boolean if a field has been set.

### GetParameters

`func (o *CoreReportbuilderRetrieveSystemReportRequest) GetParameters() []CoreReportbuilderCanViewSystemReportRequestParametersInner`

GetParameters returns the Parameters field if non-nil, zero value otherwise.

### GetParametersOk

`func (o *CoreReportbuilderRetrieveSystemReportRequest) GetParametersOk() (*[]CoreReportbuilderCanViewSystemReportRequestParametersInner, bool)`

GetParametersOk returns a tuple with the Parameters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParameters

`func (o *CoreReportbuilderRetrieveSystemReportRequest) SetParameters(v []CoreReportbuilderCanViewSystemReportRequestParametersInner)`

SetParameters sets Parameters field to given value.

### HasParameters

`func (o *CoreReportbuilderRetrieveSystemReportRequest) HasParameters() bool`

HasParameters returns a boolean if a field has been set.

### GetPerpage

`func (o *CoreReportbuilderRetrieveSystemReportRequest) GetPerpage() int32`

GetPerpage returns the Perpage field if non-nil, zero value otherwise.

### GetPerpageOk

`func (o *CoreReportbuilderRetrieveSystemReportRequest) GetPerpageOk() (*int32, bool)`

GetPerpageOk returns a tuple with the Perpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPerpage

`func (o *CoreReportbuilderRetrieveSystemReportRequest) SetPerpage(v int32)`

SetPerpage sets Perpage field to given value.

### HasPerpage

`func (o *CoreReportbuilderRetrieveSystemReportRequest) HasPerpage() bool`

HasPerpage returns a boolean if a field has been set.

### GetSource

`func (o *CoreReportbuilderRetrieveSystemReportRequest) GetSource() string`

GetSource returns the Source field if non-nil, zero value otherwise.

### GetSourceOk

`func (o *CoreReportbuilderRetrieveSystemReportRequest) GetSourceOk() (*string, bool)`

GetSourceOk returns a tuple with the Source field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSource

`func (o *CoreReportbuilderRetrieveSystemReportRequest) SetSource(v string)`

SetSource sets Source field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


