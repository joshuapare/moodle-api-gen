# CoreCompetencyListCompetenciesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Filters** | [**[]CoreCompetencyListCompetenciesRequestFiltersInner**](CoreCompetencyListCompetenciesRequestFiltersInner.md) |  | 
**Limit** | Pointer to **int32** | Return this number of records at most. | [optional] [default to 0]
**Order** | Pointer to **string** | Sort direction. Should be either ASC or DESC | [optional] [default to ""]
**Skip** | Pointer to **int32** | Skip this number of records before returning results | [optional] [default to 0]
**Sort** | Pointer to **string** | Column to sort by. | [optional] [default to ""]

## Methods

### NewCoreCompetencyListCompetenciesRequest

`func NewCoreCompetencyListCompetenciesRequest(filters []CoreCompetencyListCompetenciesRequestFiltersInner, ) *CoreCompetencyListCompetenciesRequest`

NewCoreCompetencyListCompetenciesRequest instantiates a new CoreCompetencyListCompetenciesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompetencyListCompetenciesRequestWithDefaults

`func NewCoreCompetencyListCompetenciesRequestWithDefaults() *CoreCompetencyListCompetenciesRequest`

NewCoreCompetencyListCompetenciesRequestWithDefaults instantiates a new CoreCompetencyListCompetenciesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFilters

`func (o *CoreCompetencyListCompetenciesRequest) GetFilters() []CoreCompetencyListCompetenciesRequestFiltersInner`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CoreCompetencyListCompetenciesRequest) GetFiltersOk() (*[]CoreCompetencyListCompetenciesRequestFiltersInner, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CoreCompetencyListCompetenciesRequest) SetFilters(v []CoreCompetencyListCompetenciesRequestFiltersInner)`

SetFilters sets Filters field to given value.


### GetLimit

`func (o *CoreCompetencyListCompetenciesRequest) GetLimit() int32`

GetLimit returns the Limit field if non-nil, zero value otherwise.

### GetLimitOk

`func (o *CoreCompetencyListCompetenciesRequest) GetLimitOk() (*int32, bool)`

GetLimitOk returns a tuple with the Limit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimit

`func (o *CoreCompetencyListCompetenciesRequest) SetLimit(v int32)`

SetLimit sets Limit field to given value.

### HasLimit

`func (o *CoreCompetencyListCompetenciesRequest) HasLimit() bool`

HasLimit returns a boolean if a field has been set.

### GetOrder

`func (o *CoreCompetencyListCompetenciesRequest) GetOrder() string`

GetOrder returns the Order field if non-nil, zero value otherwise.

### GetOrderOk

`func (o *CoreCompetencyListCompetenciesRequest) GetOrderOk() (*string, bool)`

GetOrderOk returns a tuple with the Order field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrder

`func (o *CoreCompetencyListCompetenciesRequest) SetOrder(v string)`

SetOrder sets Order field to given value.

### HasOrder

`func (o *CoreCompetencyListCompetenciesRequest) HasOrder() bool`

HasOrder returns a boolean if a field has been set.

### GetSkip

`func (o *CoreCompetencyListCompetenciesRequest) GetSkip() int32`

GetSkip returns the Skip field if non-nil, zero value otherwise.

### GetSkipOk

`func (o *CoreCompetencyListCompetenciesRequest) GetSkipOk() (*int32, bool)`

GetSkipOk returns a tuple with the Skip field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSkip

`func (o *CoreCompetencyListCompetenciesRequest) SetSkip(v int32)`

SetSkip sets Skip field to given value.

### HasSkip

`func (o *CoreCompetencyListCompetenciesRequest) HasSkip() bool`

HasSkip returns a boolean if a field has been set.

### GetSort

`func (o *CoreCompetencyListCompetenciesRequest) GetSort() string`

GetSort returns the Sort field if non-nil, zero value otherwise.

### GetSortOk

`func (o *CoreCompetencyListCompetenciesRequest) GetSortOk() (*string, bool)`

GetSortOk returns a tuple with the Sort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSort

`func (o *CoreCompetencyListCompetenciesRequest) SetSort(v string)`

SetSort sets Sort field to given value.

### HasSort

`func (o *CoreCompetencyListCompetenciesRequest) HasSort() bool`

HasSort returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


