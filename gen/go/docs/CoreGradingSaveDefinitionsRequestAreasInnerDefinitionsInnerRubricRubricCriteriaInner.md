# CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | Pointer to **string** | description | [optional] 
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Id** | Pointer to **int32** | criterion id | [optional] 
**Levels** | Pointer to [**[]CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner**](CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner.md) |  | [optional] 
**Sortorder** | Pointer to **int32** | sortorder | [optional] 

## Methods

### NewCoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner

`func NewCoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner() *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner`

NewCoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner instantiates a new CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInnerWithDefaults

`func NewCoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInnerWithDefaults() *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner`

NewCoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInnerWithDefaults instantiates a new CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetId

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetLevels

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner) GetLevels() []CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner`

GetLevels returns the Levels field if non-nil, zero value otherwise.

### GetLevelsOk

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner) GetLevelsOk() (*[]CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner, bool)`

GetLevelsOk returns a tuple with the Levels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLevels

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner) SetLevels(v []CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner)`

SetLevels sets Levels field to given value.

### HasLevels

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner) HasLevels() bool`

HasLevels returns a boolean if a field has been set.

### GetSortorder

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner) GetSortorder() int32`

GetSortorder returns the Sortorder field if non-nil, zero value otherwise.

### GetSortorderOk

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner) GetSortorderOk() (*int32, bool)`

GetSortorderOk returns a tuple with the Sortorder field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortorder

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner) SetSortorder(v int32)`

SetSortorder sets Sortorder field to given value.

### HasSortorder

`func (o *CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner) HasSortorder() bool`

HasSortorder returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


