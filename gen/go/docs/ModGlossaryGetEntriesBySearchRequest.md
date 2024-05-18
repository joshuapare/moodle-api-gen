# ModGlossaryGetEntriesBySearchRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**From** | Pointer to **int32** | Start returning records from here | [optional] [default to 0]
**Fullsearch** | Pointer to **bool** | The query | [optional] [default to 1]
**Id** | **int32** | Glossary entry ID | 
**Limit** | Pointer to **int32** | Number of records to return | [optional] [default to 20]
**Options** | Pointer to [**ModGlossaryGetEntriesByAuthorRequestOptions**](ModGlossaryGetEntriesByAuthorRequestOptions.md) |  | [optional] 
**Order** | Pointer to **string** | Order by: &#39;CONCEPT&#39;, &#39;CREATION&#39; or &#39;UPDATE&#39; | [optional] [default to "CONCEPT"]
**Query** | **string** | The query string | [default to "null"]
**Sort** | Pointer to **string** | The direction of the order: &#39;ASC&#39; or &#39;DESC&#39; | [optional] [default to "ASC"]

## Methods

### NewModGlossaryGetEntriesBySearchRequest

`func NewModGlossaryGetEntriesBySearchRequest(id int32, query string, ) *ModGlossaryGetEntriesBySearchRequest`

NewModGlossaryGetEntriesBySearchRequest instantiates a new ModGlossaryGetEntriesBySearchRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModGlossaryGetEntriesBySearchRequestWithDefaults

`func NewModGlossaryGetEntriesBySearchRequestWithDefaults() *ModGlossaryGetEntriesBySearchRequest`

NewModGlossaryGetEntriesBySearchRequestWithDefaults instantiates a new ModGlossaryGetEntriesBySearchRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFrom

`func (o *ModGlossaryGetEntriesBySearchRequest) GetFrom() int32`

GetFrom returns the From field if non-nil, zero value otherwise.

### GetFromOk

`func (o *ModGlossaryGetEntriesBySearchRequest) GetFromOk() (*int32, bool)`

GetFromOk returns a tuple with the From field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrom

`func (o *ModGlossaryGetEntriesBySearchRequest) SetFrom(v int32)`

SetFrom sets From field to given value.

### HasFrom

`func (o *ModGlossaryGetEntriesBySearchRequest) HasFrom() bool`

HasFrom returns a boolean if a field has been set.

### GetFullsearch

`func (o *ModGlossaryGetEntriesBySearchRequest) GetFullsearch() bool`

GetFullsearch returns the Fullsearch field if non-nil, zero value otherwise.

### GetFullsearchOk

`func (o *ModGlossaryGetEntriesBySearchRequest) GetFullsearchOk() (*bool, bool)`

GetFullsearchOk returns a tuple with the Fullsearch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullsearch

`func (o *ModGlossaryGetEntriesBySearchRequest) SetFullsearch(v bool)`

SetFullsearch sets Fullsearch field to given value.

### HasFullsearch

`func (o *ModGlossaryGetEntriesBySearchRequest) HasFullsearch() bool`

HasFullsearch returns a boolean if a field has been set.

### GetId

`func (o *ModGlossaryGetEntriesBySearchRequest) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModGlossaryGetEntriesBySearchRequest) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModGlossaryGetEntriesBySearchRequest) SetId(v int32)`

SetId sets Id field to given value.


### GetLimit

`func (o *ModGlossaryGetEntriesBySearchRequest) GetLimit() int32`

GetLimit returns the Limit field if non-nil, zero value otherwise.

### GetLimitOk

`func (o *ModGlossaryGetEntriesBySearchRequest) GetLimitOk() (*int32, bool)`

GetLimitOk returns a tuple with the Limit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimit

`func (o *ModGlossaryGetEntriesBySearchRequest) SetLimit(v int32)`

SetLimit sets Limit field to given value.

### HasLimit

`func (o *ModGlossaryGetEntriesBySearchRequest) HasLimit() bool`

HasLimit returns a boolean if a field has been set.

### GetOptions

`func (o *ModGlossaryGetEntriesBySearchRequest) GetOptions() ModGlossaryGetEntriesByAuthorRequestOptions`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *ModGlossaryGetEntriesBySearchRequest) GetOptionsOk() (*ModGlossaryGetEntriesByAuthorRequestOptions, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *ModGlossaryGetEntriesBySearchRequest) SetOptions(v ModGlossaryGetEntriesByAuthorRequestOptions)`

SetOptions sets Options field to given value.

### HasOptions

`func (o *ModGlossaryGetEntriesBySearchRequest) HasOptions() bool`

HasOptions returns a boolean if a field has been set.

### GetOrder

`func (o *ModGlossaryGetEntriesBySearchRequest) GetOrder() string`

GetOrder returns the Order field if non-nil, zero value otherwise.

### GetOrderOk

`func (o *ModGlossaryGetEntriesBySearchRequest) GetOrderOk() (*string, bool)`

GetOrderOk returns a tuple with the Order field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrder

`func (o *ModGlossaryGetEntriesBySearchRequest) SetOrder(v string)`

SetOrder sets Order field to given value.

### HasOrder

`func (o *ModGlossaryGetEntriesBySearchRequest) HasOrder() bool`

HasOrder returns a boolean if a field has been set.

### GetQuery

`func (o *ModGlossaryGetEntriesBySearchRequest) GetQuery() string`

GetQuery returns the Query field if non-nil, zero value otherwise.

### GetQueryOk

`func (o *ModGlossaryGetEntriesBySearchRequest) GetQueryOk() (*string, bool)`

GetQueryOk returns a tuple with the Query field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuery

`func (o *ModGlossaryGetEntriesBySearchRequest) SetQuery(v string)`

SetQuery sets Query field to given value.


### GetSort

`func (o *ModGlossaryGetEntriesBySearchRequest) GetSort() string`

GetSort returns the Sort field if non-nil, zero value otherwise.

### GetSortOk

`func (o *ModGlossaryGetEntriesBySearchRequest) GetSortOk() (*string, bool)`

GetSortOk returns a tuple with the Sort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSort

`func (o *ModGlossaryGetEntriesBySearchRequest) SetSort(v string)`

SetSort sets Sort field to given value.

### HasSort

`func (o *ModGlossaryGetEntriesBySearchRequest) HasSort() bool`

HasSort returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


