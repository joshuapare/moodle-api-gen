# CoreBlockGetCourseBlocks200ResponseBlocksInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Collapsible** | Pointer to **bool** | Whether the block is collapsible. | [optional] [default to null]
**Configs** | Pointer to [**[]CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner**](CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner.md) |  | [optional] 
**Contents** | Pointer to [**CoreBlockGetCourseBlocks200ResponseBlocksInnerContents**](CoreBlockGetCourseBlocks200ResponseBlocksInnerContents.md) |  | [optional] 
**Dockable** | Pointer to **bool** | Whether the block is dockable. | [optional] [default to null]
**Instanceid** | Pointer to **int32** | Block instance id. | [optional] [default to null]
**Name** | Pointer to **string** | Block name. | [optional] [default to "null"]
**Positionid** | Pointer to **int32** | Position id. | [optional] [default to null]
**Region** | Pointer to **string** | Block region. | [optional] [default to "null"]
**Visible** | Pointer to **bool** | Whether the block is visible. | [optional] [default to null]
**Weight** | Pointer to **int32** | Used to order blocks within a region. | [optional] [default to null]

## Methods

### NewCoreBlockGetCourseBlocks200ResponseBlocksInner

`func NewCoreBlockGetCourseBlocks200ResponseBlocksInner() *CoreBlockGetCourseBlocks200ResponseBlocksInner`

NewCoreBlockGetCourseBlocks200ResponseBlocksInner instantiates a new CoreBlockGetCourseBlocks200ResponseBlocksInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreBlockGetCourseBlocks200ResponseBlocksInnerWithDefaults

`func NewCoreBlockGetCourseBlocks200ResponseBlocksInnerWithDefaults() *CoreBlockGetCourseBlocks200ResponseBlocksInner`

NewCoreBlockGetCourseBlocks200ResponseBlocksInnerWithDefaults instantiates a new CoreBlockGetCourseBlocks200ResponseBlocksInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCollapsible

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) GetCollapsible() bool`

GetCollapsible returns the Collapsible field if non-nil, zero value otherwise.

### GetCollapsibleOk

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) GetCollapsibleOk() (*bool, bool)`

GetCollapsibleOk returns a tuple with the Collapsible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCollapsible

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) SetCollapsible(v bool)`

SetCollapsible sets Collapsible field to given value.

### HasCollapsible

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) HasCollapsible() bool`

HasCollapsible returns a boolean if a field has been set.

### GetConfigs

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) GetConfigs() []CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner`

GetConfigs returns the Configs field if non-nil, zero value otherwise.

### GetConfigsOk

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) GetConfigsOk() (*[]CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner, bool)`

GetConfigsOk returns a tuple with the Configs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConfigs

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) SetConfigs(v []CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner)`

SetConfigs sets Configs field to given value.

### HasConfigs

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) HasConfigs() bool`

HasConfigs returns a boolean if a field has been set.

### GetContents

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) GetContents() CoreBlockGetCourseBlocks200ResponseBlocksInnerContents`

GetContents returns the Contents field if non-nil, zero value otherwise.

### GetContentsOk

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) GetContentsOk() (*CoreBlockGetCourseBlocks200ResponseBlocksInnerContents, bool)`

GetContentsOk returns a tuple with the Contents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContents

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) SetContents(v CoreBlockGetCourseBlocks200ResponseBlocksInnerContents)`

SetContents sets Contents field to given value.

### HasContents

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) HasContents() bool`

HasContents returns a boolean if a field has been set.

### GetDockable

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) GetDockable() bool`

GetDockable returns the Dockable field if non-nil, zero value otherwise.

### GetDockableOk

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) GetDockableOk() (*bool, bool)`

GetDockableOk returns a tuple with the Dockable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDockable

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) SetDockable(v bool)`

SetDockable sets Dockable field to given value.

### HasDockable

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) HasDockable() bool`

HasDockable returns a boolean if a field has been set.

### GetInstanceid

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) GetInstanceid() int32`

GetInstanceid returns the Instanceid field if non-nil, zero value otherwise.

### GetInstanceidOk

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) GetInstanceidOk() (*int32, bool)`

GetInstanceidOk returns a tuple with the Instanceid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstanceid

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) SetInstanceid(v int32)`

SetInstanceid sets Instanceid field to given value.

### HasInstanceid

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) HasInstanceid() bool`

HasInstanceid returns a boolean if a field has been set.

### GetName

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetPositionid

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) GetPositionid() int32`

GetPositionid returns the Positionid field if non-nil, zero value otherwise.

### GetPositionidOk

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) GetPositionidOk() (*int32, bool)`

GetPositionidOk returns a tuple with the Positionid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPositionid

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) SetPositionid(v int32)`

SetPositionid sets Positionid field to given value.

### HasPositionid

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) HasPositionid() bool`

HasPositionid returns a boolean if a field has been set.

### GetRegion

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) GetRegion() string`

GetRegion returns the Region field if non-nil, zero value otherwise.

### GetRegionOk

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) GetRegionOk() (*string, bool)`

GetRegionOk returns a tuple with the Region field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegion

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) SetRegion(v string)`

SetRegion sets Region field to given value.

### HasRegion

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) HasRegion() bool`

HasRegion returns a boolean if a field has been set.

### GetVisible

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) GetVisible() bool`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) GetVisibleOk() (*bool, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) SetVisible(v bool)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.

### GetWeight

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) GetWeight() int32`

GetWeight returns the Weight field if non-nil, zero value otherwise.

### GetWeightOk

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) GetWeightOk() (*int32, bool)`

GetWeightOk returns a tuple with the Weight field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWeight

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) SetWeight(v int32)`

SetWeight sets Weight field to given value.

### HasWeight

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInner) HasWeight() bool`

HasWeight returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


