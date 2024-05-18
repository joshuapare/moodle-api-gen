# ModGlossaryGetEntriesByCategoryRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Categoryid** | **int32** | The category ID. Use &#39;0&#39; for all categories, or &#39;-1&#39; for uncategorised entries. | [default to null]
**From** | Pointer to **int32** | Start returning records from here | [optional] [default to 0]
**Id** | **int32** | The glossary ID. | [default to null]
**Limit** | Pointer to **int32** | Number of records to return | [optional] [default to 20]
**Options** | Pointer to [**ModGlossaryGetEntriesByAuthorRequestOptions**](ModGlossaryGetEntriesByAuthorRequestOptions.md) |  | [optional] 

## Methods

### NewModGlossaryGetEntriesByCategoryRequest

`func NewModGlossaryGetEntriesByCategoryRequest(categoryid int32, id int32, ) *ModGlossaryGetEntriesByCategoryRequest`

NewModGlossaryGetEntriesByCategoryRequest instantiates a new ModGlossaryGetEntriesByCategoryRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModGlossaryGetEntriesByCategoryRequestWithDefaults

`func NewModGlossaryGetEntriesByCategoryRequestWithDefaults() *ModGlossaryGetEntriesByCategoryRequest`

NewModGlossaryGetEntriesByCategoryRequestWithDefaults instantiates a new ModGlossaryGetEntriesByCategoryRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCategoryid

`func (o *ModGlossaryGetEntriesByCategoryRequest) GetCategoryid() int32`

GetCategoryid returns the Categoryid field if non-nil, zero value otherwise.

### GetCategoryidOk

`func (o *ModGlossaryGetEntriesByCategoryRequest) GetCategoryidOk() (*int32, bool)`

GetCategoryidOk returns a tuple with the Categoryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryid

`func (o *ModGlossaryGetEntriesByCategoryRequest) SetCategoryid(v int32)`

SetCategoryid sets Categoryid field to given value.


### GetFrom

`func (o *ModGlossaryGetEntriesByCategoryRequest) GetFrom() int32`

GetFrom returns the From field if non-nil, zero value otherwise.

### GetFromOk

`func (o *ModGlossaryGetEntriesByCategoryRequest) GetFromOk() (*int32, bool)`

GetFromOk returns a tuple with the From field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrom

`func (o *ModGlossaryGetEntriesByCategoryRequest) SetFrom(v int32)`

SetFrom sets From field to given value.

### HasFrom

`func (o *ModGlossaryGetEntriesByCategoryRequest) HasFrom() bool`

HasFrom returns a boolean if a field has been set.

### GetId

`func (o *ModGlossaryGetEntriesByCategoryRequest) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModGlossaryGetEntriesByCategoryRequest) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModGlossaryGetEntriesByCategoryRequest) SetId(v int32)`

SetId sets Id field to given value.


### GetLimit

`func (o *ModGlossaryGetEntriesByCategoryRequest) GetLimit() int32`

GetLimit returns the Limit field if non-nil, zero value otherwise.

### GetLimitOk

`func (o *ModGlossaryGetEntriesByCategoryRequest) GetLimitOk() (*int32, bool)`

GetLimitOk returns a tuple with the Limit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimit

`func (o *ModGlossaryGetEntriesByCategoryRequest) SetLimit(v int32)`

SetLimit sets Limit field to given value.

### HasLimit

`func (o *ModGlossaryGetEntriesByCategoryRequest) HasLimit() bool`

HasLimit returns a boolean if a field has been set.

### GetOptions

`func (o *ModGlossaryGetEntriesByCategoryRequest) GetOptions() ModGlossaryGetEntriesByAuthorRequestOptions`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *ModGlossaryGetEntriesByCategoryRequest) GetOptionsOk() (*ModGlossaryGetEntriesByAuthorRequestOptions, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *ModGlossaryGetEntriesByCategoryRequest) SetOptions(v ModGlossaryGetEntriesByAuthorRequestOptions)`

SetOptions sets Options field to given value.

### HasOptions

`func (o *ModGlossaryGetEntriesByCategoryRequest) HasOptions() bool`

HasOptions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


