# CoreFormGetFiletypesBrowserData200ResponseGroupsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Expanded** | Pointer to **bool** | Should the group start as expanded or collapsed | [optional] [default to null]
**Ext** | Pointer to **string** | The list of file extensions associated with the group | [optional] [default to "null"]
**Key** | Pointer to **string** | The file type group identifier | [optional] [default to "null"]
**Name** | Pointer to **string** | The file type group name | [optional] [default to "null"]
**Selectable** | Pointer to **bool** | Can it be marked as selected | [optional] [default to null]
**Selected** | Pointer to **bool** | Should it be marked as selected | [optional] [default to null]
**Types** | Pointer to [**[]CoreFormGetFiletypesBrowserData200ResponseGroupsInnerTypesInner**](CoreFormGetFiletypesBrowserData200ResponseGroupsInnerTypesInner.md) |  | [optional] 

## Methods

### NewCoreFormGetFiletypesBrowserData200ResponseGroupsInner

`func NewCoreFormGetFiletypesBrowserData200ResponseGroupsInner() *CoreFormGetFiletypesBrowserData200ResponseGroupsInner`

NewCoreFormGetFiletypesBrowserData200ResponseGroupsInner instantiates a new CoreFormGetFiletypesBrowserData200ResponseGroupsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreFormGetFiletypesBrowserData200ResponseGroupsInnerWithDefaults

`func NewCoreFormGetFiletypesBrowserData200ResponseGroupsInnerWithDefaults() *CoreFormGetFiletypesBrowserData200ResponseGroupsInner`

NewCoreFormGetFiletypesBrowserData200ResponseGroupsInnerWithDefaults instantiates a new CoreFormGetFiletypesBrowserData200ResponseGroupsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetExpanded

`func (o *CoreFormGetFiletypesBrowserData200ResponseGroupsInner) GetExpanded() bool`

GetExpanded returns the Expanded field if non-nil, zero value otherwise.

### GetExpandedOk

`func (o *CoreFormGetFiletypesBrowserData200ResponseGroupsInner) GetExpandedOk() (*bool, bool)`

GetExpandedOk returns a tuple with the Expanded field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpanded

`func (o *CoreFormGetFiletypesBrowserData200ResponseGroupsInner) SetExpanded(v bool)`

SetExpanded sets Expanded field to given value.

### HasExpanded

`func (o *CoreFormGetFiletypesBrowserData200ResponseGroupsInner) HasExpanded() bool`

HasExpanded returns a boolean if a field has been set.

### GetExt

`func (o *CoreFormGetFiletypesBrowserData200ResponseGroupsInner) GetExt() string`

GetExt returns the Ext field if non-nil, zero value otherwise.

### GetExtOk

`func (o *CoreFormGetFiletypesBrowserData200ResponseGroupsInner) GetExtOk() (*string, bool)`

GetExtOk returns a tuple with the Ext field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExt

`func (o *CoreFormGetFiletypesBrowserData200ResponseGroupsInner) SetExt(v string)`

SetExt sets Ext field to given value.

### HasExt

`func (o *CoreFormGetFiletypesBrowserData200ResponseGroupsInner) HasExt() bool`

HasExt returns a boolean if a field has been set.

### GetKey

`func (o *CoreFormGetFiletypesBrowserData200ResponseGroupsInner) GetKey() string`

GetKey returns the Key field if non-nil, zero value otherwise.

### GetKeyOk

`func (o *CoreFormGetFiletypesBrowserData200ResponseGroupsInner) GetKeyOk() (*string, bool)`

GetKeyOk returns a tuple with the Key field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKey

`func (o *CoreFormGetFiletypesBrowserData200ResponseGroupsInner) SetKey(v string)`

SetKey sets Key field to given value.

### HasKey

`func (o *CoreFormGetFiletypesBrowserData200ResponseGroupsInner) HasKey() bool`

HasKey returns a boolean if a field has been set.

### GetName

`func (o *CoreFormGetFiletypesBrowserData200ResponseGroupsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreFormGetFiletypesBrowserData200ResponseGroupsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreFormGetFiletypesBrowserData200ResponseGroupsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreFormGetFiletypesBrowserData200ResponseGroupsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetSelectable

`func (o *CoreFormGetFiletypesBrowserData200ResponseGroupsInner) GetSelectable() bool`

GetSelectable returns the Selectable field if non-nil, zero value otherwise.

### GetSelectableOk

`func (o *CoreFormGetFiletypesBrowserData200ResponseGroupsInner) GetSelectableOk() (*bool, bool)`

GetSelectableOk returns a tuple with the Selectable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSelectable

`func (o *CoreFormGetFiletypesBrowserData200ResponseGroupsInner) SetSelectable(v bool)`

SetSelectable sets Selectable field to given value.

### HasSelectable

`func (o *CoreFormGetFiletypesBrowserData200ResponseGroupsInner) HasSelectable() bool`

HasSelectable returns a boolean if a field has been set.

### GetSelected

`func (o *CoreFormGetFiletypesBrowserData200ResponseGroupsInner) GetSelected() bool`

GetSelected returns the Selected field if non-nil, zero value otherwise.

### GetSelectedOk

`func (o *CoreFormGetFiletypesBrowserData200ResponseGroupsInner) GetSelectedOk() (*bool, bool)`

GetSelectedOk returns a tuple with the Selected field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSelected

`func (o *CoreFormGetFiletypesBrowserData200ResponseGroupsInner) SetSelected(v bool)`

SetSelected sets Selected field to given value.

### HasSelected

`func (o *CoreFormGetFiletypesBrowserData200ResponseGroupsInner) HasSelected() bool`

HasSelected returns a boolean if a field has been set.

### GetTypes

`func (o *CoreFormGetFiletypesBrowserData200ResponseGroupsInner) GetTypes() []CoreFormGetFiletypesBrowserData200ResponseGroupsInnerTypesInner`

GetTypes returns the Types field if non-nil, zero value otherwise.

### GetTypesOk

`func (o *CoreFormGetFiletypesBrowserData200ResponseGroupsInner) GetTypesOk() (*[]CoreFormGetFiletypesBrowserData200ResponseGroupsInnerTypesInner, bool)`

GetTypesOk returns a tuple with the Types field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTypes

`func (o *CoreFormGetFiletypesBrowserData200ResponseGroupsInner) SetTypes(v []CoreFormGetFiletypesBrowserData200ResponseGroupsInnerTypesInner)`

SetTypes sets Types field to given value.

### HasTypes

`func (o *CoreFormGetFiletypesBrowserData200ResponseGroupsInner) HasTypes() bool`

HasTypes returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


