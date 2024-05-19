# ModGlossaryGetAuthorsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**From** | Pointer to **int32** | Start returning records from here | [optional] [default to 0]
**Id** | **int32** | Glossary entry ID | [default to null]
**Limit** | Pointer to **int32** | Number of records to return | [optional] [default to 20]
**Options** | Pointer to [**ModGlossaryGetAuthorsRequestOptions**](ModGlossaryGetAuthorsRequestOptions.md) |  | [optional] 

## Methods

### NewModGlossaryGetAuthorsRequest

`func NewModGlossaryGetAuthorsRequest(id int32, ) *ModGlossaryGetAuthorsRequest`

NewModGlossaryGetAuthorsRequest instantiates a new ModGlossaryGetAuthorsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModGlossaryGetAuthorsRequestWithDefaults

`func NewModGlossaryGetAuthorsRequestWithDefaults() *ModGlossaryGetAuthorsRequest`

NewModGlossaryGetAuthorsRequestWithDefaults instantiates a new ModGlossaryGetAuthorsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFrom

`func (o *ModGlossaryGetAuthorsRequest) GetFrom() int32`

GetFrom returns the From field if non-nil, zero value otherwise.

### GetFromOk

`func (o *ModGlossaryGetAuthorsRequest) GetFromOk() (*int32, bool)`

GetFromOk returns a tuple with the From field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrom

`func (o *ModGlossaryGetAuthorsRequest) SetFrom(v int32)`

SetFrom sets From field to given value.

### HasFrom

`func (o *ModGlossaryGetAuthorsRequest) HasFrom() bool`

HasFrom returns a boolean if a field has been set.

### GetId

`func (o *ModGlossaryGetAuthorsRequest) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModGlossaryGetAuthorsRequest) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModGlossaryGetAuthorsRequest) SetId(v int32)`

SetId sets Id field to given value.


### GetLimit

`func (o *ModGlossaryGetAuthorsRequest) GetLimit() int32`

GetLimit returns the Limit field if non-nil, zero value otherwise.

### GetLimitOk

`func (o *ModGlossaryGetAuthorsRequest) GetLimitOk() (*int32, bool)`

GetLimitOk returns a tuple with the Limit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimit

`func (o *ModGlossaryGetAuthorsRequest) SetLimit(v int32)`

SetLimit sets Limit field to given value.

### HasLimit

`func (o *ModGlossaryGetAuthorsRequest) HasLimit() bool`

HasLimit returns a boolean if a field has been set.

### GetOptions

`func (o *ModGlossaryGetAuthorsRequest) GetOptions() ModGlossaryGetAuthorsRequestOptions`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *ModGlossaryGetAuthorsRequest) GetOptionsOk() (*ModGlossaryGetAuthorsRequestOptions, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *ModGlossaryGetAuthorsRequest) SetOptions(v ModGlossaryGetAuthorsRequestOptions)`

SetOptions sets Options field to given value.

### HasOptions

`func (o *ModGlossaryGetAuthorsRequest) HasOptions() bool`

HasOptions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


