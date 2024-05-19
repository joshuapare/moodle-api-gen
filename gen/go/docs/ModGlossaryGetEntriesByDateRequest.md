# ModGlossaryGetEntriesByDateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**From** | Pointer to **int32** | Start returning records from here | [optional] [default to 0]
**Id** | **int32** | Glossary entry ID | 
**Limit** | Pointer to **int32** | Number of records to return | [optional] [default to 20]
**Options** | Pointer to [**ModGlossaryGetEntriesByAuthorRequestOptions**](ModGlossaryGetEntriesByAuthorRequestOptions.md) |  | [optional] 
**Order** | Pointer to **string** | Order the records by: &#39;CREATION&#39; or &#39;UPDATE&#39;. | [optional] [default to "UPDATE"]
**Sort** | Pointer to **string** | The direction of the order: &#39;ASC&#39; or &#39;DESC&#39; | [optional] [default to "DESC"]

## Methods

### NewModGlossaryGetEntriesByDateRequest

`func NewModGlossaryGetEntriesByDateRequest(id int32, ) *ModGlossaryGetEntriesByDateRequest`

NewModGlossaryGetEntriesByDateRequest instantiates a new ModGlossaryGetEntriesByDateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModGlossaryGetEntriesByDateRequestWithDefaults

`func NewModGlossaryGetEntriesByDateRequestWithDefaults() *ModGlossaryGetEntriesByDateRequest`

NewModGlossaryGetEntriesByDateRequestWithDefaults instantiates a new ModGlossaryGetEntriesByDateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFrom

`func (o *ModGlossaryGetEntriesByDateRequest) GetFrom() int32`

GetFrom returns the From field if non-nil, zero value otherwise.

### GetFromOk

`func (o *ModGlossaryGetEntriesByDateRequest) GetFromOk() (*int32, bool)`

GetFromOk returns a tuple with the From field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrom

`func (o *ModGlossaryGetEntriesByDateRequest) SetFrom(v int32)`

SetFrom sets From field to given value.

### HasFrom

`func (o *ModGlossaryGetEntriesByDateRequest) HasFrom() bool`

HasFrom returns a boolean if a field has been set.

### GetId

`func (o *ModGlossaryGetEntriesByDateRequest) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModGlossaryGetEntriesByDateRequest) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModGlossaryGetEntriesByDateRequest) SetId(v int32)`

SetId sets Id field to given value.


### GetLimit

`func (o *ModGlossaryGetEntriesByDateRequest) GetLimit() int32`

GetLimit returns the Limit field if non-nil, zero value otherwise.

### GetLimitOk

`func (o *ModGlossaryGetEntriesByDateRequest) GetLimitOk() (*int32, bool)`

GetLimitOk returns a tuple with the Limit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimit

`func (o *ModGlossaryGetEntriesByDateRequest) SetLimit(v int32)`

SetLimit sets Limit field to given value.

### HasLimit

`func (o *ModGlossaryGetEntriesByDateRequest) HasLimit() bool`

HasLimit returns a boolean if a field has been set.

### GetOptions

`func (o *ModGlossaryGetEntriesByDateRequest) GetOptions() ModGlossaryGetEntriesByAuthorRequestOptions`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *ModGlossaryGetEntriesByDateRequest) GetOptionsOk() (*ModGlossaryGetEntriesByAuthorRequestOptions, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *ModGlossaryGetEntriesByDateRequest) SetOptions(v ModGlossaryGetEntriesByAuthorRequestOptions)`

SetOptions sets Options field to given value.

### HasOptions

`func (o *ModGlossaryGetEntriesByDateRequest) HasOptions() bool`

HasOptions returns a boolean if a field has been set.

### GetOrder

`func (o *ModGlossaryGetEntriesByDateRequest) GetOrder() string`

GetOrder returns the Order field if non-nil, zero value otherwise.

### GetOrderOk

`func (o *ModGlossaryGetEntriesByDateRequest) GetOrderOk() (*string, bool)`

GetOrderOk returns a tuple with the Order field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrder

`func (o *ModGlossaryGetEntriesByDateRequest) SetOrder(v string)`

SetOrder sets Order field to given value.

### HasOrder

`func (o *ModGlossaryGetEntriesByDateRequest) HasOrder() bool`

HasOrder returns a boolean if a field has been set.

### GetSort

`func (o *ModGlossaryGetEntriesByDateRequest) GetSort() string`

GetSort returns the Sort field if non-nil, zero value otherwise.

### GetSortOk

`func (o *ModGlossaryGetEntriesByDateRequest) GetSortOk() (*string, bool)`

GetSortOk returns a tuple with the Sort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSort

`func (o *ModGlossaryGetEntriesByDateRequest) SetSort(v string)`

SetSort sets Sort field to given value.

### HasSort

`func (o *ModGlossaryGetEntriesByDateRequest) HasSort() bool`

HasSort returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


