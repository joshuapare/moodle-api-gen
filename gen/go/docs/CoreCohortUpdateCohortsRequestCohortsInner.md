# CoreCohortUpdateCohortsRequestCohortsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Categorytype** | Pointer to [**CoreCohortUpdateCohortsRequestCohortsInnerCategorytype**](CoreCohortUpdateCohortsRequestCohortsInnerCategorytype.md) |  | [optional] 
**Customfields** | Pointer to [**[]CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner**](CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner.md) |  | [optional] 
**Description** | Pointer to **string** | cohort description | [optional] 
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Id** | Pointer to **int32** | ID of the cohort | [optional] 
**Idnumber** | Pointer to **string** | cohort idnumber | [optional] 
**Name** | Pointer to **string** | cohort name | [optional] 
**Theme** | Pointer to **string** | the cohort theme. The allowcohortthemes setting must be enabled on Moodle | [optional] 
**Visible** | Pointer to **bool** | cohort visible | [optional] 

## Methods

### NewCoreCohortUpdateCohortsRequestCohortsInner

`func NewCoreCohortUpdateCohortsRequestCohortsInner() *CoreCohortUpdateCohortsRequestCohortsInner`

NewCoreCohortUpdateCohortsRequestCohortsInner instantiates a new CoreCohortUpdateCohortsRequestCohortsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCohortUpdateCohortsRequestCohortsInnerWithDefaults

`func NewCoreCohortUpdateCohortsRequestCohortsInnerWithDefaults() *CoreCohortUpdateCohortsRequestCohortsInner`

NewCoreCohortUpdateCohortsRequestCohortsInnerWithDefaults instantiates a new CoreCohortUpdateCohortsRequestCohortsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCategorytype

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) GetCategorytype() CoreCohortUpdateCohortsRequestCohortsInnerCategorytype`

GetCategorytype returns the Categorytype field if non-nil, zero value otherwise.

### GetCategorytypeOk

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) GetCategorytypeOk() (*CoreCohortUpdateCohortsRequestCohortsInnerCategorytype, bool)`

GetCategorytypeOk returns a tuple with the Categorytype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategorytype

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) SetCategorytype(v CoreCohortUpdateCohortsRequestCohortsInnerCategorytype)`

SetCategorytype sets Categorytype field to given value.

### HasCategorytype

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) HasCategorytype() bool`

HasCategorytype returns a boolean if a field has been set.

### GetCustomfields

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) GetCustomfields() []CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner`

GetCustomfields returns the Customfields field if non-nil, zero value otherwise.

### GetCustomfieldsOk

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) GetCustomfieldsOk() (*[]CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner, bool)`

GetCustomfieldsOk returns a tuple with the Customfields field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomfields

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) SetCustomfields(v []CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner)`

SetCustomfields sets Customfields field to given value.

### HasCustomfields

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) HasCustomfields() bool`

HasCustomfields returns a boolean if a field has been set.

### GetDescription

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetId

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIdnumber

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) GetIdnumber() string`

GetIdnumber returns the Idnumber field if non-nil, zero value otherwise.

### GetIdnumberOk

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) GetIdnumberOk() (*string, bool)`

GetIdnumberOk returns a tuple with the Idnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdnumber

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) SetIdnumber(v string)`

SetIdnumber sets Idnumber field to given value.

### HasIdnumber

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) HasIdnumber() bool`

HasIdnumber returns a boolean if a field has been set.

### GetName

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetTheme

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) GetTheme() string`

GetTheme returns the Theme field if non-nil, zero value otherwise.

### GetThemeOk

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) GetThemeOk() (*string, bool)`

GetThemeOk returns a tuple with the Theme field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTheme

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) SetTheme(v string)`

SetTheme sets Theme field to given value.

### HasTheme

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) HasTheme() bool`

HasTheme returns a boolean if a field has been set.

### GetVisible

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) GetVisible() bool`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) GetVisibleOk() (*bool, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) SetVisible(v bool)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *CoreCohortUpdateCohortsRequestCohortsInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


