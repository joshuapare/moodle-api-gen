# ModGlossaryGetEntriesToApproveRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**From** | Pointer to **int32** | Start returning records from here | [optional] [default to 0]
**Id** | **int32** | Glossary entry ID | 
**Letter** | **string** | A letter, or either keywords: &#39;ALL&#39; or &#39;SPECIAL&#39;. | 
**Limit** | Pointer to **int32** | Number of records to return | [optional] [default to 20]
**Options** | Pointer to **map[string]interface{}** |  | [optional] 
**Order** | Pointer to **string** | Order by: &#39;CONCEPT&#39;, &#39;CREATION&#39; or &#39;UPDATE&#39; | [optional] [default to "CONCEPT"]
**Sort** | Pointer to **string** | The direction of the order: &#39;ASC&#39; or &#39;DESC&#39; | [optional] [default to "ASC"]

## Methods

### NewModGlossaryGetEntriesToApproveRequest

`func NewModGlossaryGetEntriesToApproveRequest(id int32, letter string, ) *ModGlossaryGetEntriesToApproveRequest`

NewModGlossaryGetEntriesToApproveRequest instantiates a new ModGlossaryGetEntriesToApproveRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModGlossaryGetEntriesToApproveRequestWithDefaults

`func NewModGlossaryGetEntriesToApproveRequestWithDefaults() *ModGlossaryGetEntriesToApproveRequest`

NewModGlossaryGetEntriesToApproveRequestWithDefaults instantiates a new ModGlossaryGetEntriesToApproveRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFrom

`func (o *ModGlossaryGetEntriesToApproveRequest) GetFrom() int32`

GetFrom returns the From field if non-nil, zero value otherwise.

### GetFromOk

`func (o *ModGlossaryGetEntriesToApproveRequest) GetFromOk() (*int32, bool)`

GetFromOk returns a tuple with the From field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrom

`func (o *ModGlossaryGetEntriesToApproveRequest) SetFrom(v int32)`

SetFrom sets From field to given value.

### HasFrom

`func (o *ModGlossaryGetEntriesToApproveRequest) HasFrom() bool`

HasFrom returns a boolean if a field has been set.

### GetId

`func (o *ModGlossaryGetEntriesToApproveRequest) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModGlossaryGetEntriesToApproveRequest) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModGlossaryGetEntriesToApproveRequest) SetId(v int32)`

SetId sets Id field to given value.


### GetLetter

`func (o *ModGlossaryGetEntriesToApproveRequest) GetLetter() string`

GetLetter returns the Letter field if non-nil, zero value otherwise.

### GetLetterOk

`func (o *ModGlossaryGetEntriesToApproveRequest) GetLetterOk() (*string, bool)`

GetLetterOk returns a tuple with the Letter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLetter

`func (o *ModGlossaryGetEntriesToApproveRequest) SetLetter(v string)`

SetLetter sets Letter field to given value.


### GetLimit

`func (o *ModGlossaryGetEntriesToApproveRequest) GetLimit() int32`

GetLimit returns the Limit field if non-nil, zero value otherwise.

### GetLimitOk

`func (o *ModGlossaryGetEntriesToApproveRequest) GetLimitOk() (*int32, bool)`

GetLimitOk returns a tuple with the Limit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimit

`func (o *ModGlossaryGetEntriesToApproveRequest) SetLimit(v int32)`

SetLimit sets Limit field to given value.

### HasLimit

`func (o *ModGlossaryGetEntriesToApproveRequest) HasLimit() bool`

HasLimit returns a boolean if a field has been set.

### GetOptions

`func (o *ModGlossaryGetEntriesToApproveRequest) GetOptions() map[string]interface{}`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *ModGlossaryGetEntriesToApproveRequest) GetOptionsOk() (*map[string]interface{}, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *ModGlossaryGetEntriesToApproveRequest) SetOptions(v map[string]interface{})`

SetOptions sets Options field to given value.

### HasOptions

`func (o *ModGlossaryGetEntriesToApproveRequest) HasOptions() bool`

HasOptions returns a boolean if a field has been set.

### GetOrder

`func (o *ModGlossaryGetEntriesToApproveRequest) GetOrder() string`

GetOrder returns the Order field if non-nil, zero value otherwise.

### GetOrderOk

`func (o *ModGlossaryGetEntriesToApproveRequest) GetOrderOk() (*string, bool)`

GetOrderOk returns a tuple with the Order field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrder

`func (o *ModGlossaryGetEntriesToApproveRequest) SetOrder(v string)`

SetOrder sets Order field to given value.

### HasOrder

`func (o *ModGlossaryGetEntriesToApproveRequest) HasOrder() bool`

HasOrder returns a boolean if a field has been set.

### GetSort

`func (o *ModGlossaryGetEntriesToApproveRequest) GetSort() string`

GetSort returns the Sort field if non-nil, zero value otherwise.

### GetSortOk

`func (o *ModGlossaryGetEntriesToApproveRequest) GetSortOk() (*string, bool)`

GetSortOk returns a tuple with the Sort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSort

`func (o *ModGlossaryGetEntriesToApproveRequest) SetSort(v string)`

SetSort sets Sort field to given value.

### HasSort

`func (o *ModGlossaryGetEntriesToApproveRequest) HasSort() bool`

HasSort returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


