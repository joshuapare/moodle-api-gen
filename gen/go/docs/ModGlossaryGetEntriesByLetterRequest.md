# ModGlossaryGetEntriesByLetterRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**From** | Pointer to **int32** | Start returning records from here | [optional] [default to 0]
**Id** | **int32** | Glossary entry ID | 
**Letter** | **string** | A letter, or either keywords: &#39;ALL&#39; or &#39;SPECIAL&#39;. | [default to "null"]
**Limit** | Pointer to **int32** | Number of records to return | [optional] [default to 20]
**Options** | Pointer to [**ModGlossaryGetEntriesByAuthorRequestOptions**](ModGlossaryGetEntriesByAuthorRequestOptions.md) |  | [optional] 

## Methods

### NewModGlossaryGetEntriesByLetterRequest

`func NewModGlossaryGetEntriesByLetterRequest(id int32, letter string, ) *ModGlossaryGetEntriesByLetterRequest`

NewModGlossaryGetEntriesByLetterRequest instantiates a new ModGlossaryGetEntriesByLetterRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModGlossaryGetEntriesByLetterRequestWithDefaults

`func NewModGlossaryGetEntriesByLetterRequestWithDefaults() *ModGlossaryGetEntriesByLetterRequest`

NewModGlossaryGetEntriesByLetterRequestWithDefaults instantiates a new ModGlossaryGetEntriesByLetterRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFrom

`func (o *ModGlossaryGetEntriesByLetterRequest) GetFrom() int32`

GetFrom returns the From field if non-nil, zero value otherwise.

### GetFromOk

`func (o *ModGlossaryGetEntriesByLetterRequest) GetFromOk() (*int32, bool)`

GetFromOk returns a tuple with the From field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrom

`func (o *ModGlossaryGetEntriesByLetterRequest) SetFrom(v int32)`

SetFrom sets From field to given value.

### HasFrom

`func (o *ModGlossaryGetEntriesByLetterRequest) HasFrom() bool`

HasFrom returns a boolean if a field has been set.

### GetId

`func (o *ModGlossaryGetEntriesByLetterRequest) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModGlossaryGetEntriesByLetterRequest) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModGlossaryGetEntriesByLetterRequest) SetId(v int32)`

SetId sets Id field to given value.


### GetLetter

`func (o *ModGlossaryGetEntriesByLetterRequest) GetLetter() string`

GetLetter returns the Letter field if non-nil, zero value otherwise.

### GetLetterOk

`func (o *ModGlossaryGetEntriesByLetterRequest) GetLetterOk() (*string, bool)`

GetLetterOk returns a tuple with the Letter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLetter

`func (o *ModGlossaryGetEntriesByLetterRequest) SetLetter(v string)`

SetLetter sets Letter field to given value.


### GetLimit

`func (o *ModGlossaryGetEntriesByLetterRequest) GetLimit() int32`

GetLimit returns the Limit field if non-nil, zero value otherwise.

### GetLimitOk

`func (o *ModGlossaryGetEntriesByLetterRequest) GetLimitOk() (*int32, bool)`

GetLimitOk returns a tuple with the Limit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimit

`func (o *ModGlossaryGetEntriesByLetterRequest) SetLimit(v int32)`

SetLimit sets Limit field to given value.

### HasLimit

`func (o *ModGlossaryGetEntriesByLetterRequest) HasLimit() bool`

HasLimit returns a boolean if a field has been set.

### GetOptions

`func (o *ModGlossaryGetEntriesByLetterRequest) GetOptions() ModGlossaryGetEntriesByAuthorRequestOptions`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *ModGlossaryGetEntriesByLetterRequest) GetOptionsOk() (*ModGlossaryGetEntriesByAuthorRequestOptions, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *ModGlossaryGetEntriesByLetterRequest) SetOptions(v ModGlossaryGetEntriesByAuthorRequestOptions)`

SetOptions sets Options field to given value.

### HasOptions

`func (o *ModGlossaryGetEntriesByLetterRequest) HasOptions() bool`

HasOptions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


