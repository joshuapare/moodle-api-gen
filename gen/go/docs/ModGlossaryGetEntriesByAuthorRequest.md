# ModGlossaryGetEntriesByAuthorRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Field** | Pointer to **string** | Search and order using: &#39;FIRSTNAME&#39; or &#39;LASTNAME&#39; | [optional] [default to "LASTNAME"]
**From** | Pointer to **int32** | Start returning records from here | [optional] [default to 0]
**Id** | **int32** | Glossary entry ID | 
**Letter** | **string** | First letter of firstname or lastname, or either keywords: &#39;ALL&#39; or &#39;SPECIAL&#39;. | [default to "null"]
**Limit** | Pointer to **int32** | Number of records to return | [optional] [default to 20]
**Options** | Pointer to [**ModGlossaryGetEntriesByAuthorRequestOptions**](ModGlossaryGetEntriesByAuthorRequestOptions.md) |  | [optional] 
**Sort** | Pointer to **string** | The direction of the order: &#39;ASC&#39; or &#39;DESC&#39; | [optional] [default to "ASC"]

## Methods

### NewModGlossaryGetEntriesByAuthorRequest

`func NewModGlossaryGetEntriesByAuthorRequest(id int32, letter string, ) *ModGlossaryGetEntriesByAuthorRequest`

NewModGlossaryGetEntriesByAuthorRequest instantiates a new ModGlossaryGetEntriesByAuthorRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModGlossaryGetEntriesByAuthorRequestWithDefaults

`func NewModGlossaryGetEntriesByAuthorRequestWithDefaults() *ModGlossaryGetEntriesByAuthorRequest`

NewModGlossaryGetEntriesByAuthorRequestWithDefaults instantiates a new ModGlossaryGetEntriesByAuthorRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetField

`func (o *ModGlossaryGetEntriesByAuthorRequest) GetField() string`

GetField returns the Field field if non-nil, zero value otherwise.

### GetFieldOk

`func (o *ModGlossaryGetEntriesByAuthorRequest) GetFieldOk() (*string, bool)`

GetFieldOk returns a tuple with the Field field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetField

`func (o *ModGlossaryGetEntriesByAuthorRequest) SetField(v string)`

SetField sets Field field to given value.

### HasField

`func (o *ModGlossaryGetEntriesByAuthorRequest) HasField() bool`

HasField returns a boolean if a field has been set.

### GetFrom

`func (o *ModGlossaryGetEntriesByAuthorRequest) GetFrom() int32`

GetFrom returns the From field if non-nil, zero value otherwise.

### GetFromOk

`func (o *ModGlossaryGetEntriesByAuthorRequest) GetFromOk() (*int32, bool)`

GetFromOk returns a tuple with the From field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrom

`func (o *ModGlossaryGetEntriesByAuthorRequest) SetFrom(v int32)`

SetFrom sets From field to given value.

### HasFrom

`func (o *ModGlossaryGetEntriesByAuthorRequest) HasFrom() bool`

HasFrom returns a boolean if a field has been set.

### GetId

`func (o *ModGlossaryGetEntriesByAuthorRequest) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModGlossaryGetEntriesByAuthorRequest) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModGlossaryGetEntriesByAuthorRequest) SetId(v int32)`

SetId sets Id field to given value.


### GetLetter

`func (o *ModGlossaryGetEntriesByAuthorRequest) GetLetter() string`

GetLetter returns the Letter field if non-nil, zero value otherwise.

### GetLetterOk

`func (o *ModGlossaryGetEntriesByAuthorRequest) GetLetterOk() (*string, bool)`

GetLetterOk returns a tuple with the Letter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLetter

`func (o *ModGlossaryGetEntriesByAuthorRequest) SetLetter(v string)`

SetLetter sets Letter field to given value.


### GetLimit

`func (o *ModGlossaryGetEntriesByAuthorRequest) GetLimit() int32`

GetLimit returns the Limit field if non-nil, zero value otherwise.

### GetLimitOk

`func (o *ModGlossaryGetEntriesByAuthorRequest) GetLimitOk() (*int32, bool)`

GetLimitOk returns a tuple with the Limit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimit

`func (o *ModGlossaryGetEntriesByAuthorRequest) SetLimit(v int32)`

SetLimit sets Limit field to given value.

### HasLimit

`func (o *ModGlossaryGetEntriesByAuthorRequest) HasLimit() bool`

HasLimit returns a boolean if a field has been set.

### GetOptions

`func (o *ModGlossaryGetEntriesByAuthorRequest) GetOptions() ModGlossaryGetEntriesByAuthorRequestOptions`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *ModGlossaryGetEntriesByAuthorRequest) GetOptionsOk() (*ModGlossaryGetEntriesByAuthorRequestOptions, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *ModGlossaryGetEntriesByAuthorRequest) SetOptions(v ModGlossaryGetEntriesByAuthorRequestOptions)`

SetOptions sets Options field to given value.

### HasOptions

`func (o *ModGlossaryGetEntriesByAuthorRequest) HasOptions() bool`

HasOptions returns a boolean if a field has been set.

### GetSort

`func (o *ModGlossaryGetEntriesByAuthorRequest) GetSort() string`

GetSort returns the Sort field if non-nil, zero value otherwise.

### GetSortOk

`func (o *ModGlossaryGetEntriesByAuthorRequest) GetSortOk() (*string, bool)`

GetSortOk returns a tuple with the Sort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSort

`func (o *ModGlossaryGetEntriesByAuthorRequest) SetSort(v string)`

SetSort sets Sort field to given value.

### HasSort

`func (o *ModGlossaryGetEntriesByAuthorRequest) HasSort() bool`

HasSort returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


