# CoreReportbuilderCanViewSystemReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Area** | Pointer to **string** | Report area | [optional] [default to ""]
**Component** | Pointer to **string** | Report component | [optional] [default to ""]
**Context** | [**CoreCohortSearchCohortsRequestContext**](CoreCohortSearchCohortsRequestContext.md) |  | 
**Itemid** | Pointer to **int32** | Report item ID | [optional] [default to 0]
**Parameters** | Pointer to [**[]CoreReportbuilderCanViewSystemReportRequestParametersInner**](CoreReportbuilderCanViewSystemReportRequestParametersInner.md) |  | [optional] 
**Source** | **string** | Report class path | [default to "null"]

## Methods

### NewCoreReportbuilderCanViewSystemReportRequest

`func NewCoreReportbuilderCanViewSystemReportRequest(context CoreCohortSearchCohortsRequestContext, source string, ) *CoreReportbuilderCanViewSystemReportRequest`

NewCoreReportbuilderCanViewSystemReportRequest instantiates a new CoreReportbuilderCanViewSystemReportRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreReportbuilderCanViewSystemReportRequestWithDefaults

`func NewCoreReportbuilderCanViewSystemReportRequestWithDefaults() *CoreReportbuilderCanViewSystemReportRequest`

NewCoreReportbuilderCanViewSystemReportRequestWithDefaults instantiates a new CoreReportbuilderCanViewSystemReportRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetArea

`func (o *CoreReportbuilderCanViewSystemReportRequest) GetArea() string`

GetArea returns the Area field if non-nil, zero value otherwise.

### GetAreaOk

`func (o *CoreReportbuilderCanViewSystemReportRequest) GetAreaOk() (*string, bool)`

GetAreaOk returns a tuple with the Area field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetArea

`func (o *CoreReportbuilderCanViewSystemReportRequest) SetArea(v string)`

SetArea sets Area field to given value.

### HasArea

`func (o *CoreReportbuilderCanViewSystemReportRequest) HasArea() bool`

HasArea returns a boolean if a field has been set.

### GetComponent

`func (o *CoreReportbuilderCanViewSystemReportRequest) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreReportbuilderCanViewSystemReportRequest) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreReportbuilderCanViewSystemReportRequest) SetComponent(v string)`

SetComponent sets Component field to given value.

### HasComponent

`func (o *CoreReportbuilderCanViewSystemReportRequest) HasComponent() bool`

HasComponent returns a boolean if a field has been set.

### GetContext

`func (o *CoreReportbuilderCanViewSystemReportRequest) GetContext() CoreCohortSearchCohortsRequestContext`

GetContext returns the Context field if non-nil, zero value otherwise.

### GetContextOk

`func (o *CoreReportbuilderCanViewSystemReportRequest) GetContextOk() (*CoreCohortSearchCohortsRequestContext, bool)`

GetContextOk returns a tuple with the Context field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContext

`func (o *CoreReportbuilderCanViewSystemReportRequest) SetContext(v CoreCohortSearchCohortsRequestContext)`

SetContext sets Context field to given value.


### GetItemid

`func (o *CoreReportbuilderCanViewSystemReportRequest) GetItemid() int32`

GetItemid returns the Itemid field if non-nil, zero value otherwise.

### GetItemidOk

`func (o *CoreReportbuilderCanViewSystemReportRequest) GetItemidOk() (*int32, bool)`

GetItemidOk returns a tuple with the Itemid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemid

`func (o *CoreReportbuilderCanViewSystemReportRequest) SetItemid(v int32)`

SetItemid sets Itemid field to given value.

### HasItemid

`func (o *CoreReportbuilderCanViewSystemReportRequest) HasItemid() bool`

HasItemid returns a boolean if a field has been set.

### GetParameters

`func (o *CoreReportbuilderCanViewSystemReportRequest) GetParameters() []CoreReportbuilderCanViewSystemReportRequestParametersInner`

GetParameters returns the Parameters field if non-nil, zero value otherwise.

### GetParametersOk

`func (o *CoreReportbuilderCanViewSystemReportRequest) GetParametersOk() (*[]CoreReportbuilderCanViewSystemReportRequestParametersInner, bool)`

GetParametersOk returns a tuple with the Parameters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParameters

`func (o *CoreReportbuilderCanViewSystemReportRequest) SetParameters(v []CoreReportbuilderCanViewSystemReportRequestParametersInner)`

SetParameters sets Parameters field to given value.

### HasParameters

`func (o *CoreReportbuilderCanViewSystemReportRequest) HasParameters() bool`

HasParameters returns a boolean if a field has been set.

### GetSource

`func (o *CoreReportbuilderCanViewSystemReportRequest) GetSource() string`

GetSource returns the Source field if non-nil, zero value otherwise.

### GetSourceOk

`func (o *CoreReportbuilderCanViewSystemReportRequest) GetSourceOk() (*string, bool)`

GetSourceOk returns a tuple with the Source field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSource

`func (o *CoreReportbuilderCanViewSystemReportRequest) SetSource(v string)`

SetSource sets Source field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


