# ModGlossaryUpdateEntryRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Concept** | **string** | Glossary concept | 
**Definition** | **string** | Glossary concept definition | 
**Definitionformat** | **int32** | definition format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | 
**Entryid** | **int32** | Glossary entry id to update | 
**Options** | Pointer to [**[]ModGlossaryUpdateEntryRequestOptionsInner**](ModGlossaryUpdateEntryRequestOptionsInner.md) |  | [optional] 

## Methods

### NewModGlossaryUpdateEntryRequest

`func NewModGlossaryUpdateEntryRequest(concept string, definition string, definitionformat int32, entryid int32, ) *ModGlossaryUpdateEntryRequest`

NewModGlossaryUpdateEntryRequest instantiates a new ModGlossaryUpdateEntryRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModGlossaryUpdateEntryRequestWithDefaults

`func NewModGlossaryUpdateEntryRequestWithDefaults() *ModGlossaryUpdateEntryRequest`

NewModGlossaryUpdateEntryRequestWithDefaults instantiates a new ModGlossaryUpdateEntryRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetConcept

`func (o *ModGlossaryUpdateEntryRequest) GetConcept() string`

GetConcept returns the Concept field if non-nil, zero value otherwise.

### GetConceptOk

`func (o *ModGlossaryUpdateEntryRequest) GetConceptOk() (*string, bool)`

GetConceptOk returns a tuple with the Concept field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConcept

`func (o *ModGlossaryUpdateEntryRequest) SetConcept(v string)`

SetConcept sets Concept field to given value.


### GetDefinition

`func (o *ModGlossaryUpdateEntryRequest) GetDefinition() string`

GetDefinition returns the Definition field if non-nil, zero value otherwise.

### GetDefinitionOk

`func (o *ModGlossaryUpdateEntryRequest) GetDefinitionOk() (*string, bool)`

GetDefinitionOk returns a tuple with the Definition field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefinition

`func (o *ModGlossaryUpdateEntryRequest) SetDefinition(v string)`

SetDefinition sets Definition field to given value.


### GetDefinitionformat

`func (o *ModGlossaryUpdateEntryRequest) GetDefinitionformat() int32`

GetDefinitionformat returns the Definitionformat field if non-nil, zero value otherwise.

### GetDefinitionformatOk

`func (o *ModGlossaryUpdateEntryRequest) GetDefinitionformatOk() (*int32, bool)`

GetDefinitionformatOk returns a tuple with the Definitionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefinitionformat

`func (o *ModGlossaryUpdateEntryRequest) SetDefinitionformat(v int32)`

SetDefinitionformat sets Definitionformat field to given value.


### GetEntryid

`func (o *ModGlossaryUpdateEntryRequest) GetEntryid() int32`

GetEntryid returns the Entryid field if non-nil, zero value otherwise.

### GetEntryidOk

`func (o *ModGlossaryUpdateEntryRequest) GetEntryidOk() (*int32, bool)`

GetEntryidOk returns a tuple with the Entryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntryid

`func (o *ModGlossaryUpdateEntryRequest) SetEntryid(v int32)`

SetEntryid sets Entryid field to given value.


### GetOptions

`func (o *ModGlossaryUpdateEntryRequest) GetOptions() []ModGlossaryUpdateEntryRequestOptionsInner`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *ModGlossaryUpdateEntryRequest) GetOptionsOk() (*[]ModGlossaryUpdateEntryRequestOptionsInner, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *ModGlossaryUpdateEntryRequest) SetOptions(v []ModGlossaryUpdateEntryRequestOptionsInner)`

SetOptions sets Options field to given value.

### HasOptions

`func (o *ModGlossaryUpdateEntryRequest) HasOptions() bool`

HasOptions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


