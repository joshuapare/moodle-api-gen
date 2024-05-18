# CoreTableGetDynamicTableContentRequestFiltersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Filteroptions** | Pointer to [**[]CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInner**](CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInner.md) |  | [optional] 
**Jointype** | Pointer to **int32** | Type of join for filter values | [optional] [default to null]
**Name** | Pointer to **string** | Name of the filter | [optional] [default to "null"]
**Values** | Pointer to **[]map[string]interface{}** |  | [optional] 

## Methods

### NewCoreTableGetDynamicTableContentRequestFiltersInner

`func NewCoreTableGetDynamicTableContentRequestFiltersInner() *CoreTableGetDynamicTableContentRequestFiltersInner`

NewCoreTableGetDynamicTableContentRequestFiltersInner instantiates a new CoreTableGetDynamicTableContentRequestFiltersInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreTableGetDynamicTableContentRequestFiltersInnerWithDefaults

`func NewCoreTableGetDynamicTableContentRequestFiltersInnerWithDefaults() *CoreTableGetDynamicTableContentRequestFiltersInner`

NewCoreTableGetDynamicTableContentRequestFiltersInnerWithDefaults instantiates a new CoreTableGetDynamicTableContentRequestFiltersInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFilteroptions

`func (o *CoreTableGetDynamicTableContentRequestFiltersInner) GetFilteroptions() []CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInner`

GetFilteroptions returns the Filteroptions field if non-nil, zero value otherwise.

### GetFilteroptionsOk

`func (o *CoreTableGetDynamicTableContentRequestFiltersInner) GetFilteroptionsOk() (*[]CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInner, bool)`

GetFilteroptionsOk returns a tuple with the Filteroptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilteroptions

`func (o *CoreTableGetDynamicTableContentRequestFiltersInner) SetFilteroptions(v []CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInner)`

SetFilteroptions sets Filteroptions field to given value.

### HasFilteroptions

`func (o *CoreTableGetDynamicTableContentRequestFiltersInner) HasFilteroptions() bool`

HasFilteroptions returns a boolean if a field has been set.

### GetJointype

`func (o *CoreTableGetDynamicTableContentRequestFiltersInner) GetJointype() int32`

GetJointype returns the Jointype field if non-nil, zero value otherwise.

### GetJointypeOk

`func (o *CoreTableGetDynamicTableContentRequestFiltersInner) GetJointypeOk() (*int32, bool)`

GetJointypeOk returns a tuple with the Jointype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJointype

`func (o *CoreTableGetDynamicTableContentRequestFiltersInner) SetJointype(v int32)`

SetJointype sets Jointype field to given value.

### HasJointype

`func (o *CoreTableGetDynamicTableContentRequestFiltersInner) HasJointype() bool`

HasJointype returns a boolean if a field has been set.

### GetName

`func (o *CoreTableGetDynamicTableContentRequestFiltersInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreTableGetDynamicTableContentRequestFiltersInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreTableGetDynamicTableContentRequestFiltersInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreTableGetDynamicTableContentRequestFiltersInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetValues

`func (o *CoreTableGetDynamicTableContentRequestFiltersInner) GetValues() []map[string]interface{}`

GetValues returns the Values field if non-nil, zero value otherwise.

### GetValuesOk

`func (o *CoreTableGetDynamicTableContentRequestFiltersInner) GetValuesOk() (*[]map[string]interface{}, bool)`

GetValuesOk returns a tuple with the Values field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValues

`func (o *CoreTableGetDynamicTableContentRequestFiltersInner) SetValues(v []map[string]interface{})`

SetValues sets Values field to given value.

### HasValues

`func (o *CoreTableGetDynamicTableContentRequestFiltersInner) HasValues() bool`

HasValues returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


