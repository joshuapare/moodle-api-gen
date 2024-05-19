# CoreSearchGetResultsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Filters** | Pointer to [**CoreSearchGetResultsRequestFilters**](CoreSearchGetResultsRequestFilters.md) |  | [optional] 
**Page** | Pointer to **int32** | results page number starting from 0, defaults to the first page | [optional] [default to 0]
**Query** | **string** | the search query | [default to "null"]

## Methods

### NewCoreSearchGetResultsRequest

`func NewCoreSearchGetResultsRequest(query string, ) *CoreSearchGetResultsRequest`

NewCoreSearchGetResultsRequest instantiates a new CoreSearchGetResultsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreSearchGetResultsRequestWithDefaults

`func NewCoreSearchGetResultsRequestWithDefaults() *CoreSearchGetResultsRequest`

NewCoreSearchGetResultsRequestWithDefaults instantiates a new CoreSearchGetResultsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFilters

`func (o *CoreSearchGetResultsRequest) GetFilters() CoreSearchGetResultsRequestFilters`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CoreSearchGetResultsRequest) GetFiltersOk() (*CoreSearchGetResultsRequestFilters, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CoreSearchGetResultsRequest) SetFilters(v CoreSearchGetResultsRequestFilters)`

SetFilters sets Filters field to given value.

### HasFilters

`func (o *CoreSearchGetResultsRequest) HasFilters() bool`

HasFilters returns a boolean if a field has been set.

### GetPage

`func (o *CoreSearchGetResultsRequest) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *CoreSearchGetResultsRequest) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *CoreSearchGetResultsRequest) SetPage(v int32)`

SetPage sets Page field to given value.

### HasPage

`func (o *CoreSearchGetResultsRequest) HasPage() bool`

HasPage returns a boolean if a field has been set.

### GetQuery

`func (o *CoreSearchGetResultsRequest) GetQuery() string`

GetQuery returns the Query field if non-nil, zero value otherwise.

### GetQueryOk

`func (o *CoreSearchGetResultsRequest) GetQueryOk() (*string, bool)`

GetQueryOk returns a tuple with the Query field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuery

`func (o *CoreSearchGetResultsRequest) SetQuery(v string)`

SetQuery sets Query field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


