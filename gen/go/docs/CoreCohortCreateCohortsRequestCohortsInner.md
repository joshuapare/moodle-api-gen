# CoreCohortCreateCohortsRequestCohortsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Categorytype** | Pointer to [**CoreCohortCreateCohortsRequestCohortsInnerCategorytype**](CoreCohortCreateCohortsRequestCohortsInnerCategorytype.md) |  | [optional] 
**Customfields** | Pointer to [**[]CoreCohortCreateCohortsRequestCohortsInnerCustomfieldsInner**](CoreCohortCreateCohortsRequestCohortsInnerCustomfieldsInner.md) |  | [optional] 
**Description** | Pointer to **string** | cohort description | [optional] [default to "null"]
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Idnumber** | Pointer to **string** | cohort idnumber | [optional] [default to "null"]
**Name** | Pointer to **string** | cohort name | [optional] [default to "null"]
**Theme** | Pointer to **string** | the cohort theme. The allowcohortthemes setting must be enabled on Moodle | [optional] [default to "null"]
**Visible** | Pointer to **bool** | cohort visible | [optional] [default to true]

## Methods

### NewCoreCohortCreateCohortsRequestCohortsInner

`func NewCoreCohortCreateCohortsRequestCohortsInner() *CoreCohortCreateCohortsRequestCohortsInner`

NewCoreCohortCreateCohortsRequestCohortsInner instantiates a new CoreCohortCreateCohortsRequestCohortsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCohortCreateCohortsRequestCohortsInnerWithDefaults

`func NewCoreCohortCreateCohortsRequestCohortsInnerWithDefaults() *CoreCohortCreateCohortsRequestCohortsInner`

NewCoreCohortCreateCohortsRequestCohortsInnerWithDefaults instantiates a new CoreCohortCreateCohortsRequestCohortsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCategorytype

`func (o *CoreCohortCreateCohortsRequestCohortsInner) GetCategorytype() CoreCohortCreateCohortsRequestCohortsInnerCategorytype`

GetCategorytype returns the Categorytype field if non-nil, zero value otherwise.

### GetCategorytypeOk

`func (o *CoreCohortCreateCohortsRequestCohortsInner) GetCategorytypeOk() (*CoreCohortCreateCohortsRequestCohortsInnerCategorytype, bool)`

GetCategorytypeOk returns a tuple with the Categorytype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategorytype

`func (o *CoreCohortCreateCohortsRequestCohortsInner) SetCategorytype(v CoreCohortCreateCohortsRequestCohortsInnerCategorytype)`

SetCategorytype sets Categorytype field to given value.

### HasCategorytype

`func (o *CoreCohortCreateCohortsRequestCohortsInner) HasCategorytype() bool`

HasCategorytype returns a boolean if a field has been set.

### GetCustomfields

`func (o *CoreCohortCreateCohortsRequestCohortsInner) GetCustomfields() []CoreCohortCreateCohortsRequestCohortsInnerCustomfieldsInner`

GetCustomfields returns the Customfields field if non-nil, zero value otherwise.

### GetCustomfieldsOk

`func (o *CoreCohortCreateCohortsRequestCohortsInner) GetCustomfieldsOk() (*[]CoreCohortCreateCohortsRequestCohortsInnerCustomfieldsInner, bool)`

GetCustomfieldsOk returns a tuple with the Customfields field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomfields

`func (o *CoreCohortCreateCohortsRequestCohortsInner) SetCustomfields(v []CoreCohortCreateCohortsRequestCohortsInnerCustomfieldsInner)`

SetCustomfields sets Customfields field to given value.

### HasCustomfields

`func (o *CoreCohortCreateCohortsRequestCohortsInner) HasCustomfields() bool`

HasCustomfields returns a boolean if a field has been set.

### GetDescription

`func (o *CoreCohortCreateCohortsRequestCohortsInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreCohortCreateCohortsRequestCohortsInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreCohortCreateCohortsRequestCohortsInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreCohortCreateCohortsRequestCohortsInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *CoreCohortCreateCohortsRequestCohortsInner) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreCohortCreateCohortsRequestCohortsInner) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreCohortCreateCohortsRequestCohortsInner) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreCohortCreateCohortsRequestCohortsInner) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetIdnumber

`func (o *CoreCohortCreateCohortsRequestCohortsInner) GetIdnumber() string`

GetIdnumber returns the Idnumber field if non-nil, zero value otherwise.

### GetIdnumberOk

`func (o *CoreCohortCreateCohortsRequestCohortsInner) GetIdnumberOk() (*string, bool)`

GetIdnumberOk returns a tuple with the Idnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdnumber

`func (o *CoreCohortCreateCohortsRequestCohortsInner) SetIdnumber(v string)`

SetIdnumber sets Idnumber field to given value.

### HasIdnumber

`func (o *CoreCohortCreateCohortsRequestCohortsInner) HasIdnumber() bool`

HasIdnumber returns a boolean if a field has been set.

### GetName

`func (o *CoreCohortCreateCohortsRequestCohortsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreCohortCreateCohortsRequestCohortsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreCohortCreateCohortsRequestCohortsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreCohortCreateCohortsRequestCohortsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetTheme

`func (o *CoreCohortCreateCohortsRequestCohortsInner) GetTheme() string`

GetTheme returns the Theme field if non-nil, zero value otherwise.

### GetThemeOk

`func (o *CoreCohortCreateCohortsRequestCohortsInner) GetThemeOk() (*string, bool)`

GetThemeOk returns a tuple with the Theme field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTheme

`func (o *CoreCohortCreateCohortsRequestCohortsInner) SetTheme(v string)`

SetTheme sets Theme field to given value.

### HasTheme

`func (o *CoreCohortCreateCohortsRequestCohortsInner) HasTheme() bool`

HasTheme returns a boolean if a field has been set.

### GetVisible

`func (o *CoreCohortCreateCohortsRequestCohortsInner) GetVisible() bool`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *CoreCohortCreateCohortsRequestCohortsInner) GetVisibleOk() (*bool, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *CoreCohortCreateCohortsRequestCohortsInner) SetVisible(v bool)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *CoreCohortCreateCohortsRequestCohortsInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


