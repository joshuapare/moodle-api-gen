# CoreSearchViewResultsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Filters** | Pointer to [**CoreSearchViewResultsRequestFilters**](CoreSearchViewResultsRequestFilters.md) |  | [optional] 
**Page** | Pointer to **int32** | results page number starting from 0, defaults to the first page | [optional] [default to 0]
**Query** | **string** | the search query | 

## Methods

### NewCoreSearchViewResultsRequest

`func NewCoreSearchViewResultsRequest(query string, ) *CoreSearchViewResultsRequest`

NewCoreSearchViewResultsRequest instantiates a new CoreSearchViewResultsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreSearchViewResultsRequestWithDefaults

`func NewCoreSearchViewResultsRequestWithDefaults() *CoreSearchViewResultsRequest`

NewCoreSearchViewResultsRequestWithDefaults instantiates a new CoreSearchViewResultsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFilters

`func (o *CoreSearchViewResultsRequest) GetFilters() CoreSearchViewResultsRequestFilters`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CoreSearchViewResultsRequest) GetFiltersOk() (*CoreSearchViewResultsRequestFilters, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CoreSearchViewResultsRequest) SetFilters(v CoreSearchViewResultsRequestFilters)`

SetFilters sets Filters field to given value.

### HasFilters

`func (o *CoreSearchViewResultsRequest) HasFilters() bool`

HasFilters returns a boolean if a field has been set.

### GetPage

`func (o *CoreSearchViewResultsRequest) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *CoreSearchViewResultsRequest) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *CoreSearchViewResultsRequest) SetPage(v int32)`

SetPage sets Page field to given value.

### HasPage

`func (o *CoreSearchViewResultsRequest) HasPage() bool`

HasPage returns a boolean if a field has been set.

### GetQuery

`func (o *CoreSearchViewResultsRequest) GetQuery() string`

GetQuery returns the Query field if non-nil, zero value otherwise.

### GetQueryOk

`func (o *CoreSearchViewResultsRequest) GetQueryOk() (*string, bool)`

GetQueryOk returns a tuple with the Query field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuery

`func (o *CoreSearchViewResultsRequest) SetQuery(v string)`

SetQuery sets Query field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


