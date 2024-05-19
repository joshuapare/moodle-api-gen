# CoreCohortSearchCohortsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Context** | [**CoreCohortSearchCohortsRequestContext**](CoreCohortSearchCohortsRequestContext.md) |  | 
**Includes** | Pointer to **string** | What other contexts to fetch the frameworks from. (all, parents, self) | [optional] [default to "parents"]
**Limitfrom** | Pointer to **int32** | limitfrom we are fetching the records from | [optional] [default to 0]
**Limitnum** | Pointer to **int32** | Number of records to fetch | [optional] [default to 25]
**Query** | **string** | Query string | [default to "null"]

## Methods

### NewCoreCohortSearchCohortsRequest

`func NewCoreCohortSearchCohortsRequest(context CoreCohortSearchCohortsRequestContext, query string, ) *CoreCohortSearchCohortsRequest`

NewCoreCohortSearchCohortsRequest instantiates a new CoreCohortSearchCohortsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCohortSearchCohortsRequestWithDefaults

`func NewCoreCohortSearchCohortsRequestWithDefaults() *CoreCohortSearchCohortsRequest`

NewCoreCohortSearchCohortsRequestWithDefaults instantiates a new CoreCohortSearchCohortsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContext

`func (o *CoreCohortSearchCohortsRequest) GetContext() CoreCohortSearchCohortsRequestContext`

GetContext returns the Context field if non-nil, zero value otherwise.

### GetContextOk

`func (o *CoreCohortSearchCohortsRequest) GetContextOk() (*CoreCohortSearchCohortsRequestContext, bool)`

GetContextOk returns a tuple with the Context field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContext

`func (o *CoreCohortSearchCohortsRequest) SetContext(v CoreCohortSearchCohortsRequestContext)`

SetContext sets Context field to given value.


### GetIncludes

`func (o *CoreCohortSearchCohortsRequest) GetIncludes() string`

GetIncludes returns the Includes field if non-nil, zero value otherwise.

### GetIncludesOk

`func (o *CoreCohortSearchCohortsRequest) GetIncludesOk() (*string, bool)`

GetIncludesOk returns a tuple with the Includes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludes

`func (o *CoreCohortSearchCohortsRequest) SetIncludes(v string)`

SetIncludes sets Includes field to given value.

### HasIncludes

`func (o *CoreCohortSearchCohortsRequest) HasIncludes() bool`

HasIncludes returns a boolean if a field has been set.

### GetLimitfrom

`func (o *CoreCohortSearchCohortsRequest) GetLimitfrom() int32`

GetLimitfrom returns the Limitfrom field if non-nil, zero value otherwise.

### GetLimitfromOk

`func (o *CoreCohortSearchCohortsRequest) GetLimitfromOk() (*int32, bool)`

GetLimitfromOk returns a tuple with the Limitfrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimitfrom

`func (o *CoreCohortSearchCohortsRequest) SetLimitfrom(v int32)`

SetLimitfrom sets Limitfrom field to given value.

### HasLimitfrom

`func (o *CoreCohortSearchCohortsRequest) HasLimitfrom() bool`

HasLimitfrom returns a boolean if a field has been set.

### GetLimitnum

`func (o *CoreCohortSearchCohortsRequest) GetLimitnum() int32`

GetLimitnum returns the Limitnum field if non-nil, zero value otherwise.

### GetLimitnumOk

`func (o *CoreCohortSearchCohortsRequest) GetLimitnumOk() (*int32, bool)`

GetLimitnumOk returns a tuple with the Limitnum field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimitnum

`func (o *CoreCohortSearchCohortsRequest) SetLimitnum(v int32)`

SetLimitnum sets Limitnum field to given value.

### HasLimitnum

`func (o *CoreCohortSearchCohortsRequest) HasLimitnum() bool`

HasLimitnum returns a boolean if a field has been set.

### GetQuery

`func (o *CoreCohortSearchCohortsRequest) GetQuery() string`

GetQuery returns the Query field if non-nil, zero value otherwise.

### GetQueryOk

`func (o *CoreCohortSearchCohortsRequest) GetQueryOk() (*string, bool)`

GetQueryOk returns a tuple with the Query field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuery

`func (o *CoreCohortSearchCohortsRequest) SetQuery(v string)`

SetQuery sets Query field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


