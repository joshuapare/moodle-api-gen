# ModGlossaryGetEntriesByAuthorIdRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Authorid** | **int32** | The author ID | [default to null]
**From** | Pointer to **int32** | Start returning records from here | [optional] [default to 0]
**Id** | **int32** | Glossary entry ID | 
**Limit** | Pointer to **int32** | Number of records to return | [optional] [default to 20]
**Options** | Pointer to [**ModGlossaryGetEntriesByAuthorRequestOptions**](ModGlossaryGetEntriesByAuthorRequestOptions.md) |  | [optional] 
**Order** | Pointer to **string** | Order by: &#39;CONCEPT&#39;, &#39;CREATION&#39; or &#39;UPDATE&#39; | [optional] [default to "CONCEPT"]
**Sort** | Pointer to **string** | The direction of the order: &#39;ASC&#39; or &#39;DESC&#39; | [optional] [default to "ASC"]

## Methods

### NewModGlossaryGetEntriesByAuthorIdRequest

`func NewModGlossaryGetEntriesByAuthorIdRequest(authorid int32, id int32, ) *ModGlossaryGetEntriesByAuthorIdRequest`

NewModGlossaryGetEntriesByAuthorIdRequest instantiates a new ModGlossaryGetEntriesByAuthorIdRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModGlossaryGetEntriesByAuthorIdRequestWithDefaults

`func NewModGlossaryGetEntriesByAuthorIdRequestWithDefaults() *ModGlossaryGetEntriesByAuthorIdRequest`

NewModGlossaryGetEntriesByAuthorIdRequestWithDefaults instantiates a new ModGlossaryGetEntriesByAuthorIdRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAuthorid

`func (o *ModGlossaryGetEntriesByAuthorIdRequest) GetAuthorid() int32`

GetAuthorid returns the Authorid field if non-nil, zero value otherwise.

### GetAuthoridOk

`func (o *ModGlossaryGetEntriesByAuthorIdRequest) GetAuthoridOk() (*int32, bool)`

GetAuthoridOk returns a tuple with the Authorid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthorid

`func (o *ModGlossaryGetEntriesByAuthorIdRequest) SetAuthorid(v int32)`

SetAuthorid sets Authorid field to given value.


### GetFrom

`func (o *ModGlossaryGetEntriesByAuthorIdRequest) GetFrom() int32`

GetFrom returns the From field if non-nil, zero value otherwise.

### GetFromOk

`func (o *ModGlossaryGetEntriesByAuthorIdRequest) GetFromOk() (*int32, bool)`

GetFromOk returns a tuple with the From field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrom

`func (o *ModGlossaryGetEntriesByAuthorIdRequest) SetFrom(v int32)`

SetFrom sets From field to given value.

### HasFrom

`func (o *ModGlossaryGetEntriesByAuthorIdRequest) HasFrom() bool`

HasFrom returns a boolean if a field has been set.

### GetId

`func (o *ModGlossaryGetEntriesByAuthorIdRequest) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModGlossaryGetEntriesByAuthorIdRequest) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModGlossaryGetEntriesByAuthorIdRequest) SetId(v int32)`

SetId sets Id field to given value.


### GetLimit

`func (o *ModGlossaryGetEntriesByAuthorIdRequest) GetLimit() int32`

GetLimit returns the Limit field if non-nil, zero value otherwise.

### GetLimitOk

`func (o *ModGlossaryGetEntriesByAuthorIdRequest) GetLimitOk() (*int32, bool)`

GetLimitOk returns a tuple with the Limit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimit

`func (o *ModGlossaryGetEntriesByAuthorIdRequest) SetLimit(v int32)`

SetLimit sets Limit field to given value.

### HasLimit

`func (o *ModGlossaryGetEntriesByAuthorIdRequest) HasLimit() bool`

HasLimit returns a boolean if a field has been set.

### GetOptions

`func (o *ModGlossaryGetEntriesByAuthorIdRequest) GetOptions() ModGlossaryGetEntriesByAuthorRequestOptions`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *ModGlossaryGetEntriesByAuthorIdRequest) GetOptionsOk() (*ModGlossaryGetEntriesByAuthorRequestOptions, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *ModGlossaryGetEntriesByAuthorIdRequest) SetOptions(v ModGlossaryGetEntriesByAuthorRequestOptions)`

SetOptions sets Options field to given value.

### HasOptions

`func (o *ModGlossaryGetEntriesByAuthorIdRequest) HasOptions() bool`

HasOptions returns a boolean if a field has been set.

### GetOrder

`func (o *ModGlossaryGetEntriesByAuthorIdRequest) GetOrder() string`

GetOrder returns the Order field if non-nil, zero value otherwise.

### GetOrderOk

`func (o *ModGlossaryGetEntriesByAuthorIdRequest) GetOrderOk() (*string, bool)`

GetOrderOk returns a tuple with the Order field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrder

`func (o *ModGlossaryGetEntriesByAuthorIdRequest) SetOrder(v string)`

SetOrder sets Order field to given value.

### HasOrder

`func (o *ModGlossaryGetEntriesByAuthorIdRequest) HasOrder() bool`

HasOrder returns a boolean if a field has been set.

### GetSort

`func (o *ModGlossaryGetEntriesByAuthorIdRequest) GetSort() string`

GetSort returns the Sort field if non-nil, zero value otherwise.

### GetSortOk

`func (o *ModGlossaryGetEntriesByAuthorIdRequest) GetSortOk() (*string, bool)`

GetSortOk returns a tuple with the Sort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSort

`func (o *ModGlossaryGetEntriesByAuthorIdRequest) SetSort(v string)`

SetSort sets Sort field to given value.

### HasSort

`func (o *ModGlossaryGetEntriesByAuthorIdRequest) HasSort() bool`

HasSort returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


