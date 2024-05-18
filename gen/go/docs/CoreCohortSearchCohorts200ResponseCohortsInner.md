# CoreCohortSearchCohorts200ResponseCohortsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Customfields** | Pointer to [**[]CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner**](CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner.md) |  | [optional] 
**Description** | Pointer to **string** | cohort description | [optional] 
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Id** | Pointer to **int32** | ID of the cohort | [optional] [default to null]
**Idnumber** | Pointer to **string** | cohort idnumber | [optional] 
**Name** | Pointer to **string** | cohort name | [optional] 
**Theme** | Pointer to **string** | cohort theme | [optional] [default to "null"]
**Visible** | Pointer to **bool** | cohort visible | [optional] [default to null]

## Methods

### NewCoreCohortSearchCohorts200ResponseCohortsInner

`func NewCoreCohortSearchCohorts200ResponseCohortsInner() *CoreCohortSearchCohorts200ResponseCohortsInner`

NewCoreCohortSearchCohorts200ResponseCohortsInner instantiates a new CoreCohortSearchCohorts200ResponseCohortsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCohortSearchCohorts200ResponseCohortsInnerWithDefaults

`func NewCoreCohortSearchCohorts200ResponseCohortsInnerWithDefaults() *CoreCohortSearchCohorts200ResponseCohortsInner`

NewCoreCohortSearchCohorts200ResponseCohortsInnerWithDefaults instantiates a new CoreCohortSearchCohorts200ResponseCohortsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCustomfields

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) GetCustomfields() []CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner`

GetCustomfields returns the Customfields field if non-nil, zero value otherwise.

### GetCustomfieldsOk

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) GetCustomfieldsOk() (*[]CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner, bool)`

GetCustomfieldsOk returns a tuple with the Customfields field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomfields

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) SetCustomfields(v []CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner)`

SetCustomfields sets Customfields field to given value.

### HasCustomfields

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) HasCustomfields() bool`

HasCustomfields returns a boolean if a field has been set.

### GetDescription

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetId

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIdnumber

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) GetIdnumber() string`

GetIdnumber returns the Idnumber field if non-nil, zero value otherwise.

### GetIdnumberOk

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) GetIdnumberOk() (*string, bool)`

GetIdnumberOk returns a tuple with the Idnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdnumber

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) SetIdnumber(v string)`

SetIdnumber sets Idnumber field to given value.

### HasIdnumber

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) HasIdnumber() bool`

HasIdnumber returns a boolean if a field has been set.

### GetName

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetTheme

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) GetTheme() string`

GetTheme returns the Theme field if non-nil, zero value otherwise.

### GetThemeOk

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) GetThemeOk() (*string, bool)`

GetThemeOk returns a tuple with the Theme field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTheme

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) SetTheme(v string)`

SetTheme sets Theme field to given value.

### HasTheme

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) HasTheme() bool`

HasTheme returns a boolean if a field has been set.

### GetVisible

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) GetVisible() bool`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) GetVisibleOk() (*bool, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) SetVisible(v bool)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *CoreCohortSearchCohorts200ResponseCohortsInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


