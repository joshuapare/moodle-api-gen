# CoreSearchGetTopResultsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Filters** | Pointer to [**CoreSearchGetTopResultsRequestFilters**](CoreSearchGetTopResultsRequestFilters.md) |  | [optional] 
**Query** | **string** | the search query | 

## Methods

### NewCoreSearchGetTopResultsRequest

`func NewCoreSearchGetTopResultsRequest(query string, ) *CoreSearchGetTopResultsRequest`

NewCoreSearchGetTopResultsRequest instantiates a new CoreSearchGetTopResultsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreSearchGetTopResultsRequestWithDefaults

`func NewCoreSearchGetTopResultsRequestWithDefaults() *CoreSearchGetTopResultsRequest`

NewCoreSearchGetTopResultsRequestWithDefaults instantiates a new CoreSearchGetTopResultsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFilters

`func (o *CoreSearchGetTopResultsRequest) GetFilters() CoreSearchGetTopResultsRequestFilters`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CoreSearchGetTopResultsRequest) GetFiltersOk() (*CoreSearchGetTopResultsRequestFilters, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CoreSearchGetTopResultsRequest) SetFilters(v CoreSearchGetTopResultsRequestFilters)`

SetFilters sets Filters field to given value.

### HasFilters

`func (o *CoreSearchGetTopResultsRequest) HasFilters() bool`

HasFilters returns a boolean if a field has been set.

### GetQuery

`func (o *CoreSearchGetTopResultsRequest) GetQuery() string`

GetQuery returns the Query field if non-nil, zero value otherwise.

### GetQueryOk

`func (o *CoreSearchGetTopResultsRequest) GetQueryOk() (*string, bool)`

GetQueryOk returns a tuple with the Query field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuery

`func (o *CoreSearchGetTopResultsRequest) SetQuery(v string)`

SetQuery sets Query field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


