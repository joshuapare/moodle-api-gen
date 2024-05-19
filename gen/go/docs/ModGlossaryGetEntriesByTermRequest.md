# ModGlossaryGetEntriesByTermRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**From** | Pointer to **int32** | Start returning records from here | [optional] [default to 0]
**Id** | **int32** | Glossary entry ID | 
**Limit** | Pointer to **int32** | Number of records to return | [optional] [default to 20]
**Options** | Pointer to [**ModGlossaryGetEntriesByAuthorRequestOptions**](ModGlossaryGetEntriesByAuthorRequestOptions.md) |  | [optional] 
**Term** | **string** | The entry concept, or alias | [default to "null"]

## Methods

### NewModGlossaryGetEntriesByTermRequest

`func NewModGlossaryGetEntriesByTermRequest(id int32, term string, ) *ModGlossaryGetEntriesByTermRequest`

NewModGlossaryGetEntriesByTermRequest instantiates a new ModGlossaryGetEntriesByTermRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModGlossaryGetEntriesByTermRequestWithDefaults

`func NewModGlossaryGetEntriesByTermRequestWithDefaults() *ModGlossaryGetEntriesByTermRequest`

NewModGlossaryGetEntriesByTermRequestWithDefaults instantiates a new ModGlossaryGetEntriesByTermRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFrom

`func (o *ModGlossaryGetEntriesByTermRequest) GetFrom() int32`

GetFrom returns the From field if non-nil, zero value otherwise.

### GetFromOk

`func (o *ModGlossaryGetEntriesByTermRequest) GetFromOk() (*int32, bool)`

GetFromOk returns a tuple with the From field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrom

`func (o *ModGlossaryGetEntriesByTermRequest) SetFrom(v int32)`

SetFrom sets From field to given value.

### HasFrom

`func (o *ModGlossaryGetEntriesByTermRequest) HasFrom() bool`

HasFrom returns a boolean if a field has been set.

### GetId

`func (o *ModGlossaryGetEntriesByTermRequest) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModGlossaryGetEntriesByTermRequest) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModGlossaryGetEntriesByTermRequest) SetId(v int32)`

SetId sets Id field to given value.


### GetLimit

`func (o *ModGlossaryGetEntriesByTermRequest) GetLimit() int32`

GetLimit returns the Limit field if non-nil, zero value otherwise.

### GetLimitOk

`func (o *ModGlossaryGetEntriesByTermRequest) GetLimitOk() (*int32, bool)`

GetLimitOk returns a tuple with the Limit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimit

`func (o *ModGlossaryGetEntriesByTermRequest) SetLimit(v int32)`

SetLimit sets Limit field to given value.

### HasLimit

`func (o *ModGlossaryGetEntriesByTermRequest) HasLimit() bool`

HasLimit returns a boolean if a field has been set.

### GetOptions

`func (o *ModGlossaryGetEntriesByTermRequest) GetOptions() ModGlossaryGetEntriesByAuthorRequestOptions`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *ModGlossaryGetEntriesByTermRequest) GetOptionsOk() (*ModGlossaryGetEntriesByAuthorRequestOptions, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *ModGlossaryGetEntriesByTermRequest) SetOptions(v ModGlossaryGetEntriesByAuthorRequestOptions)`

SetOptions sets Options field to given value.

### HasOptions

`func (o *ModGlossaryGetEntriesByTermRequest) HasOptions() bool`

HasOptions returns a boolean if a field has been set.

### GetTerm

`func (o *ModGlossaryGetEntriesByTermRequest) GetTerm() string`

GetTerm returns the Term field if non-nil, zero value otherwise.

### GetTermOk

`func (o *ModGlossaryGetEntriesByTermRequest) GetTermOk() (*string, bool)`

GetTermOk returns a tuple with the Term field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTerm

`func (o *ModGlossaryGetEntriesByTermRequest) SetTerm(v string)`

SetTerm sets Term field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


