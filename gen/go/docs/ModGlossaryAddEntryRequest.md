# ModGlossaryAddEntryRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Concept** | **string** | Glossary concept | [default to "null"]
**Definition** | **string** | Glossary concept definition | [default to "null"]
**Definitionformat** | **int32** | definition format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | 
**Glossaryid** | **int32** | Glossary id | [default to null]
**Options** | Pointer to [**[]ModGlossaryAddEntryRequestOptionsInner**](ModGlossaryAddEntryRequestOptionsInner.md) |  | [optional] 

## Methods

### NewModGlossaryAddEntryRequest

`func NewModGlossaryAddEntryRequest(concept string, definition string, definitionformat int32, glossaryid int32, ) *ModGlossaryAddEntryRequest`

NewModGlossaryAddEntryRequest instantiates a new ModGlossaryAddEntryRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModGlossaryAddEntryRequestWithDefaults

`func NewModGlossaryAddEntryRequestWithDefaults() *ModGlossaryAddEntryRequest`

NewModGlossaryAddEntryRequestWithDefaults instantiates a new ModGlossaryAddEntryRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetConcept

`func (o *ModGlossaryAddEntryRequest) GetConcept() string`

GetConcept returns the Concept field if non-nil, zero value otherwise.

### GetConceptOk

`func (o *ModGlossaryAddEntryRequest) GetConceptOk() (*string, bool)`

GetConceptOk returns a tuple with the Concept field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConcept

`func (o *ModGlossaryAddEntryRequest) SetConcept(v string)`

SetConcept sets Concept field to given value.


### GetDefinition

`func (o *ModGlossaryAddEntryRequest) GetDefinition() string`

GetDefinition returns the Definition field if non-nil, zero value otherwise.

### GetDefinitionOk

`func (o *ModGlossaryAddEntryRequest) GetDefinitionOk() (*string, bool)`

GetDefinitionOk returns a tuple with the Definition field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefinition

`func (o *ModGlossaryAddEntryRequest) SetDefinition(v string)`

SetDefinition sets Definition field to given value.


### GetDefinitionformat

`func (o *ModGlossaryAddEntryRequest) GetDefinitionformat() int32`

GetDefinitionformat returns the Definitionformat field if non-nil, zero value otherwise.

### GetDefinitionformatOk

`func (o *ModGlossaryAddEntryRequest) GetDefinitionformatOk() (*int32, bool)`

GetDefinitionformatOk returns a tuple with the Definitionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefinitionformat

`func (o *ModGlossaryAddEntryRequest) SetDefinitionformat(v int32)`

SetDefinitionformat sets Definitionformat field to given value.


### GetGlossaryid

`func (o *ModGlossaryAddEntryRequest) GetGlossaryid() int32`

GetGlossaryid returns the Glossaryid field if non-nil, zero value otherwise.

### GetGlossaryidOk

`func (o *ModGlossaryAddEntryRequest) GetGlossaryidOk() (*int32, bool)`

GetGlossaryidOk returns a tuple with the Glossaryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGlossaryid

`func (o *ModGlossaryAddEntryRequest) SetGlossaryid(v int32)`

SetGlossaryid sets Glossaryid field to given value.


### GetOptions

`func (o *ModGlossaryAddEntryRequest) GetOptions() []ModGlossaryAddEntryRequestOptionsInner`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *ModGlossaryAddEntryRequest) GetOptionsOk() (*[]ModGlossaryAddEntryRequestOptionsInner, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *ModGlossaryAddEntryRequest) SetOptions(v []ModGlossaryAddEntryRequestOptionsInner)`

SetOptions sets Options field to given value.

### HasOptions

`func (o *ModGlossaryAddEntryRequest) HasOptions() bool`

HasOptions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


