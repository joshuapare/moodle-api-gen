# CoreBlogGetEntriesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Filters** | Pointer to [**[]CoreBlogGetEntriesRequestFiltersInner**](CoreBlogGetEntriesRequestFiltersInner.md) |  | [optional] 
**Page** | Pointer to **int32** | The blog page to return. | [optional] [default to 0]
**Perpage** | Pointer to **int32** | The number of posts to return per page. | [optional] [default to 10]

## Methods

### NewCoreBlogGetEntriesRequest

`func NewCoreBlogGetEntriesRequest() *CoreBlogGetEntriesRequest`

NewCoreBlogGetEntriesRequest instantiates a new CoreBlogGetEntriesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreBlogGetEntriesRequestWithDefaults

`func NewCoreBlogGetEntriesRequestWithDefaults() *CoreBlogGetEntriesRequest`

NewCoreBlogGetEntriesRequestWithDefaults instantiates a new CoreBlogGetEntriesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFilters

`func (o *CoreBlogGetEntriesRequest) GetFilters() []CoreBlogGetEntriesRequestFiltersInner`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CoreBlogGetEntriesRequest) GetFiltersOk() (*[]CoreBlogGetEntriesRequestFiltersInner, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CoreBlogGetEntriesRequest) SetFilters(v []CoreBlogGetEntriesRequestFiltersInner)`

SetFilters sets Filters field to given value.

### HasFilters

`func (o *CoreBlogGetEntriesRequest) HasFilters() bool`

HasFilters returns a boolean if a field has been set.

### GetPage

`func (o *CoreBlogGetEntriesRequest) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *CoreBlogGetEntriesRequest) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *CoreBlogGetEntriesRequest) SetPage(v int32)`

SetPage sets Page field to given value.

### HasPage

`func (o *CoreBlogGetEntriesRequest) HasPage() bool`

HasPage returns a boolean if a field has been set.

### GetPerpage

`func (o *CoreBlogGetEntriesRequest) GetPerpage() int32`

GetPerpage returns the Perpage field if non-nil, zero value otherwise.

### GetPerpageOk

`func (o *CoreBlogGetEntriesRequest) GetPerpageOk() (*int32, bool)`

GetPerpageOk returns a tuple with the Perpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPerpage

`func (o *CoreBlogGetEntriesRequest) SetPerpage(v int32)`

SetPerpage sets Perpage field to given value.

### HasPerpage

`func (o *CoreBlogGetEntriesRequest) HasPerpage() bool`

HasPerpage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


