# CoreBlockGetDashboardBlocks200ResponseBlocksInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Collapsible** | Pointer to **bool** | Whether the block is collapsible. | [optional] 
**Configs** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerConfigsInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerConfigsInner.md) |  | [optional] 
**Contents** | Pointer to [**CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents.md) |  | [optional] 
**Dockable** | Pointer to **bool** | Whether the block is dockable. | [optional] 
**Instanceid** | Pointer to **int32** | Block instance id. | [optional] 
**Name** | Pointer to **string** | Block name. | [optional] 
**Positionid** | Pointer to **int32** | Position id. | [optional] 
**Region** | Pointer to **string** | Block region. | [optional] 
**Visible** | Pointer to **bool** | Whether the block is visible. | [optional] 
**Weight** | Pointer to **int32** | Used to order blocks within a region. | [optional] 

## Methods

### NewCoreBlockGetDashboardBlocks200ResponseBlocksInner

`func NewCoreBlockGetDashboardBlocks200ResponseBlocksInner() *CoreBlockGetDashboardBlocks200ResponseBlocksInner`

NewCoreBlockGetDashboardBlocks200ResponseBlocksInner instantiates a new CoreBlockGetDashboardBlocks200ResponseBlocksInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreBlockGetDashboardBlocks200ResponseBlocksInnerWithDefaults

`func NewCoreBlockGetDashboardBlocks200ResponseBlocksInnerWithDefaults() *CoreBlockGetDashboardBlocks200ResponseBlocksInner`

NewCoreBlockGetDashboardBlocks200ResponseBlocksInnerWithDefaults instantiates a new CoreBlockGetDashboardBlocks200ResponseBlocksInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCollapsible

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) GetCollapsible() bool`

GetCollapsible returns the Collapsible field if non-nil, zero value otherwise.

### GetCollapsibleOk

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) GetCollapsibleOk() (*bool, bool)`

GetCollapsibleOk returns a tuple with the Collapsible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCollapsible

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) SetCollapsible(v bool)`

SetCollapsible sets Collapsible field to given value.

### HasCollapsible

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) HasCollapsible() bool`

HasCollapsible returns a boolean if a field has been set.

### GetConfigs

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) GetConfigs() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerConfigsInner`

GetConfigs returns the Configs field if non-nil, zero value otherwise.

### GetConfigsOk

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) GetConfigsOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerConfigsInner, bool)`

GetConfigsOk returns a tuple with the Configs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConfigs

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) SetConfigs(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerConfigsInner)`

SetConfigs sets Configs field to given value.

### HasConfigs

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) HasConfigs() bool`

HasConfigs returns a boolean if a field has been set.

### GetContents

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) GetContents() CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents`

GetContents returns the Contents field if non-nil, zero value otherwise.

### GetContentsOk

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) GetContentsOk() (*CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents, bool)`

GetContentsOk returns a tuple with the Contents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContents

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) SetContents(v CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents)`

SetContents sets Contents field to given value.

### HasContents

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) HasContents() bool`

HasContents returns a boolean if a field has been set.

### GetDockable

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) GetDockable() bool`

GetDockable returns the Dockable field if non-nil, zero value otherwise.

### GetDockableOk

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) GetDockableOk() (*bool, bool)`

GetDockableOk returns a tuple with the Dockable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDockable

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) SetDockable(v bool)`

SetDockable sets Dockable field to given value.

### HasDockable

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) HasDockable() bool`

HasDockable returns a boolean if a field has been set.

### GetInstanceid

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) GetInstanceid() int32`

GetInstanceid returns the Instanceid field if non-nil, zero value otherwise.

### GetInstanceidOk

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) GetInstanceidOk() (*int32, bool)`

GetInstanceidOk returns a tuple with the Instanceid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstanceid

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) SetInstanceid(v int32)`

SetInstanceid sets Instanceid field to given value.

### HasInstanceid

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) HasInstanceid() bool`

HasInstanceid returns a boolean if a field has been set.

### GetName

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetPositionid

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) GetPositionid() int32`

GetPositionid returns the Positionid field if non-nil, zero value otherwise.

### GetPositionidOk

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) GetPositionidOk() (*int32, bool)`

GetPositionidOk returns a tuple with the Positionid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPositionid

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) SetPositionid(v int32)`

SetPositionid sets Positionid field to given value.

### HasPositionid

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) HasPositionid() bool`

HasPositionid returns a boolean if a field has been set.

### GetRegion

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) GetRegion() string`

GetRegion returns the Region field if non-nil, zero value otherwise.

### GetRegionOk

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) GetRegionOk() (*string, bool)`

GetRegionOk returns a tuple with the Region field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegion

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) SetRegion(v string)`

SetRegion sets Region field to given value.

### HasRegion

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) HasRegion() bool`

HasRegion returns a boolean if a field has been set.

### GetVisible

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) GetVisible() bool`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) GetVisibleOk() (*bool, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) SetVisible(v bool)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.

### GetWeight

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) GetWeight() int32`

GetWeight returns the Weight field if non-nil, zero value otherwise.

### GetWeightOk

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) GetWeightOk() (*int32, bool)`

GetWeightOk returns a tuple with the Weight field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWeight

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) SetWeight(v int32)`

SetWeight sets Weight field to given value.

### HasWeight

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInner) HasWeight() bool`

HasWeight returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


