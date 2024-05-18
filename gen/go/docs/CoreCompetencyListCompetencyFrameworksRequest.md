# CoreCompetencyListCompetencyFrameworksRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Context** | [**CoreCohortSearchCohortsRequestContext**](CoreCohortSearchCohortsRequestContext.md) |  | 
**Includes** | Pointer to **string** | What other contextes to fetch the frameworks from. (children, parents, self) | [optional] [default to "children"]
**Limit** | Pointer to **int32** | Return this number of records at most. | [optional] [default to 0]
**Onlyvisible** | Pointer to **bool** | Only visible frameworks will be returned if visible true | [optional] [default to false]
**Order** | Pointer to **string** | Sort direction. Should be either ASC or DESC | [optional] [default to ""]
**Query** | Pointer to **string** | A query string to filter the results | [optional] [default to ""]
**Skip** | Pointer to **int32** | Skip this number of records before returning results | [optional] [default to 0]
**Sort** | Pointer to **string** | Column to sort by. | [optional] [default to "shortname"]

## Methods

### NewCoreCompetencyListCompetencyFrameworksRequest

`func NewCoreCompetencyListCompetencyFrameworksRequest(context CoreCohortSearchCohortsRequestContext, ) *CoreCompetencyListCompetencyFrameworksRequest`

NewCoreCompetencyListCompetencyFrameworksRequest instantiates a new CoreCompetencyListCompetencyFrameworksRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompetencyListCompetencyFrameworksRequestWithDefaults

`func NewCoreCompetencyListCompetencyFrameworksRequestWithDefaults() *CoreCompetencyListCompetencyFrameworksRequest`

NewCoreCompetencyListCompetencyFrameworksRequestWithDefaults instantiates a new CoreCompetencyListCompetencyFrameworksRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContext

`func (o *CoreCompetencyListCompetencyFrameworksRequest) GetContext() CoreCohortSearchCohortsRequestContext`

GetContext returns the Context field if non-nil, zero value otherwise.

### GetContextOk

`func (o *CoreCompetencyListCompetencyFrameworksRequest) GetContextOk() (*CoreCohortSearchCohortsRequestContext, bool)`

GetContextOk returns a tuple with the Context field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContext

`func (o *CoreCompetencyListCompetencyFrameworksRequest) SetContext(v CoreCohortSearchCohortsRequestContext)`

SetContext sets Context field to given value.


### GetIncludes

`func (o *CoreCompetencyListCompetencyFrameworksRequest) GetIncludes() string`

GetIncludes returns the Includes field if non-nil, zero value otherwise.

### GetIncludesOk

`func (o *CoreCompetencyListCompetencyFrameworksRequest) GetIncludesOk() (*string, bool)`

GetIncludesOk returns a tuple with the Includes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludes

`func (o *CoreCompetencyListCompetencyFrameworksRequest) SetIncludes(v string)`

SetIncludes sets Includes field to given value.

### HasIncludes

`func (o *CoreCompetencyListCompetencyFrameworksRequest) HasIncludes() bool`

HasIncludes returns a boolean if a field has been set.

### GetLimit

`func (o *CoreCompetencyListCompetencyFrameworksRequest) GetLimit() int32`

GetLimit returns the Limit field if non-nil, zero value otherwise.

### GetLimitOk

`func (o *CoreCompetencyListCompetencyFrameworksRequest) GetLimitOk() (*int32, bool)`

GetLimitOk returns a tuple with the Limit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimit

`func (o *CoreCompetencyListCompetencyFrameworksRequest) SetLimit(v int32)`

SetLimit sets Limit field to given value.

### HasLimit

`func (o *CoreCompetencyListCompetencyFrameworksRequest) HasLimit() bool`

HasLimit returns a boolean if a field has been set.

### GetOnlyvisible

`func (o *CoreCompetencyListCompetencyFrameworksRequest) GetOnlyvisible() bool`

GetOnlyvisible returns the Onlyvisible field if non-nil, zero value otherwise.

### GetOnlyvisibleOk

`func (o *CoreCompetencyListCompetencyFrameworksRequest) GetOnlyvisibleOk() (*bool, bool)`

GetOnlyvisibleOk returns a tuple with the Onlyvisible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOnlyvisible

`func (o *CoreCompetencyListCompetencyFrameworksRequest) SetOnlyvisible(v bool)`

SetOnlyvisible sets Onlyvisible field to given value.

### HasOnlyvisible

`func (o *CoreCompetencyListCompetencyFrameworksRequest) HasOnlyvisible() bool`

HasOnlyvisible returns a boolean if a field has been set.

### GetOrder

`func (o *CoreCompetencyListCompetencyFrameworksRequest) GetOrder() string`

GetOrder returns the Order field if non-nil, zero value otherwise.

### GetOrderOk

`func (o *CoreCompetencyListCompetencyFrameworksRequest) GetOrderOk() (*string, bool)`

GetOrderOk returns a tuple with the Order field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrder

`func (o *CoreCompetencyListCompetencyFrameworksRequest) SetOrder(v string)`

SetOrder sets Order field to given value.

### HasOrder

`func (o *CoreCompetencyListCompetencyFrameworksRequest) HasOrder() bool`

HasOrder returns a boolean if a field has been set.

### GetQuery

`func (o *CoreCompetencyListCompetencyFrameworksRequest) GetQuery() string`

GetQuery returns the Query field if non-nil, zero value otherwise.

### GetQueryOk

`func (o *CoreCompetencyListCompetencyFrameworksRequest) GetQueryOk() (*string, bool)`

GetQueryOk returns a tuple with the Query field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuery

`func (o *CoreCompetencyListCompetencyFrameworksRequest) SetQuery(v string)`

SetQuery sets Query field to given value.

### HasQuery

`func (o *CoreCompetencyListCompetencyFrameworksRequest) HasQuery() bool`

HasQuery returns a boolean if a field has been set.

### GetSkip

`func (o *CoreCompetencyListCompetencyFrameworksRequest) GetSkip() int32`

GetSkip returns the Skip field if non-nil, zero value otherwise.

### GetSkipOk

`func (o *CoreCompetencyListCompetencyFrameworksRequest) GetSkipOk() (*int32, bool)`

GetSkipOk returns a tuple with the Skip field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSkip

`func (o *CoreCompetencyListCompetencyFrameworksRequest) SetSkip(v int32)`

SetSkip sets Skip field to given value.

### HasSkip

`func (o *CoreCompetencyListCompetencyFrameworksRequest) HasSkip() bool`

HasSkip returns a boolean if a field has been set.

### GetSort

`func (o *CoreCompetencyListCompetencyFrameworksRequest) GetSort() string`

GetSort returns the Sort field if non-nil, zero value otherwise.

### GetSortOk

`func (o *CoreCompetencyListCompetencyFrameworksRequest) GetSortOk() (*string, bool)`

GetSortOk returns a tuple with the Sort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSort

`func (o *CoreCompetencyListCompetencyFrameworksRequest) SetSort(v string)`

SetSort sets Sort field to given value.

### HasSort

`func (o *CoreCompetencyListCompetencyFrameworksRequest) HasSort() bool`

HasSort returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


