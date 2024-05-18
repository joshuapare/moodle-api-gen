# ModLtiGetToolTypesAndProxiesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Limit** | Pointer to **int32** | How many tool types displayed per page | [optional] [default to 60]
**Offset** | Pointer to **int32** | Current offset of tool elements | [optional] [default to 0]
**Orphanedonly** | Pointer to **bool** | Orphaned tool types only | [optional] [default to 0]
**Toolproxyid** | Pointer to **int32** | Tool proxy id | [optional] [default to 0]

## Methods

### NewModLtiGetToolTypesAndProxiesRequest

`func NewModLtiGetToolTypesAndProxiesRequest() *ModLtiGetToolTypesAndProxiesRequest`

NewModLtiGetToolTypesAndProxiesRequest instantiates a new ModLtiGetToolTypesAndProxiesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLtiGetToolTypesAndProxiesRequestWithDefaults

`func NewModLtiGetToolTypesAndProxiesRequestWithDefaults() *ModLtiGetToolTypesAndProxiesRequest`

NewModLtiGetToolTypesAndProxiesRequestWithDefaults instantiates a new ModLtiGetToolTypesAndProxiesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLimit

`func (o *ModLtiGetToolTypesAndProxiesRequest) GetLimit() int32`

GetLimit returns the Limit field if non-nil, zero value otherwise.

### GetLimitOk

`func (o *ModLtiGetToolTypesAndProxiesRequest) GetLimitOk() (*int32, bool)`

GetLimitOk returns a tuple with the Limit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimit

`func (o *ModLtiGetToolTypesAndProxiesRequest) SetLimit(v int32)`

SetLimit sets Limit field to given value.

### HasLimit

`func (o *ModLtiGetToolTypesAndProxiesRequest) HasLimit() bool`

HasLimit returns a boolean if a field has been set.

### GetOffset

`func (o *ModLtiGetToolTypesAndProxiesRequest) GetOffset() int32`

GetOffset returns the Offset field if non-nil, zero value otherwise.

### GetOffsetOk

`func (o *ModLtiGetToolTypesAndProxiesRequest) GetOffsetOk() (*int32, bool)`

GetOffsetOk returns a tuple with the Offset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffset

`func (o *ModLtiGetToolTypesAndProxiesRequest) SetOffset(v int32)`

SetOffset sets Offset field to given value.

### HasOffset

`func (o *ModLtiGetToolTypesAndProxiesRequest) HasOffset() bool`

HasOffset returns a boolean if a field has been set.

### GetOrphanedonly

`func (o *ModLtiGetToolTypesAndProxiesRequest) GetOrphanedonly() bool`

GetOrphanedonly returns the Orphanedonly field if non-nil, zero value otherwise.

### GetOrphanedonlyOk

`func (o *ModLtiGetToolTypesAndProxiesRequest) GetOrphanedonlyOk() (*bool, bool)`

GetOrphanedonlyOk returns a tuple with the Orphanedonly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrphanedonly

`func (o *ModLtiGetToolTypesAndProxiesRequest) SetOrphanedonly(v bool)`

SetOrphanedonly sets Orphanedonly field to given value.

### HasOrphanedonly

`func (o *ModLtiGetToolTypesAndProxiesRequest) HasOrphanedonly() bool`

HasOrphanedonly returns a boolean if a field has been set.

### GetToolproxyid

`func (o *ModLtiGetToolTypesAndProxiesRequest) GetToolproxyid() int32`

GetToolproxyid returns the Toolproxyid field if non-nil, zero value otherwise.

### GetToolproxyidOk

`func (o *ModLtiGetToolTypesAndProxiesRequest) GetToolproxyidOk() (*int32, bool)`

GetToolproxyidOk returns a tuple with the Toolproxyid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolproxyid

`func (o *ModLtiGetToolTypesAndProxiesRequest) SetToolproxyid(v int32)`

SetToolproxyid sets Toolproxyid field to given value.

### HasToolproxyid

`func (o *ModLtiGetToolTypesAndProxiesRequest) HasToolproxyid() bool`

HasToolproxyid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


