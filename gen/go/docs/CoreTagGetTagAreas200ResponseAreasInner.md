# CoreTagGetTagAreas200ResponseAreasInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Callback** | Pointer to **string** | Component callback for processing tags. | [optional] [default to "null"]
**Callbackfile** | Pointer to **string** | Component callback file. | [optional] [default to "null"]
**Component** | Pointer to **string** | Component the area is related to. | [optional] [default to "null"]
**Enabled** | Pointer to **bool** | Whether this area is enabled. | [optional] [default to true]
**Id** | Pointer to **int32** | Area id. | [optional] [default to null]
**Itemtype** | Pointer to **string** | Type of item in the component. | [optional] [default to "null"]
**Locked** | Pointer to **bool** | Whether the area is locked. | [optional] [default to false]
**Multiplecontexts** | Pointer to **bool** | Whether the tag area allows tag instances to be created in multiple contexts.  | [optional] [default to false]
**Showstandard** | Pointer to **int32** | Return whether to display only standard, only non-standard or both tags. | [optional] [default to 0]
**Tagcollid** | Pointer to **int32** | The tag collection this are belongs to. | [optional] [default to null]

## Methods

### NewCoreTagGetTagAreas200ResponseAreasInner

`func NewCoreTagGetTagAreas200ResponseAreasInner() *CoreTagGetTagAreas200ResponseAreasInner`

NewCoreTagGetTagAreas200ResponseAreasInner instantiates a new CoreTagGetTagAreas200ResponseAreasInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreTagGetTagAreas200ResponseAreasInnerWithDefaults

`func NewCoreTagGetTagAreas200ResponseAreasInnerWithDefaults() *CoreTagGetTagAreas200ResponseAreasInner`

NewCoreTagGetTagAreas200ResponseAreasInnerWithDefaults instantiates a new CoreTagGetTagAreas200ResponseAreasInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCallback

`func (o *CoreTagGetTagAreas200ResponseAreasInner) GetCallback() string`

GetCallback returns the Callback field if non-nil, zero value otherwise.

### GetCallbackOk

`func (o *CoreTagGetTagAreas200ResponseAreasInner) GetCallbackOk() (*string, bool)`

GetCallbackOk returns a tuple with the Callback field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCallback

`func (o *CoreTagGetTagAreas200ResponseAreasInner) SetCallback(v string)`

SetCallback sets Callback field to given value.

### HasCallback

`func (o *CoreTagGetTagAreas200ResponseAreasInner) HasCallback() bool`

HasCallback returns a boolean if a field has been set.

### GetCallbackfile

`func (o *CoreTagGetTagAreas200ResponseAreasInner) GetCallbackfile() string`

GetCallbackfile returns the Callbackfile field if non-nil, zero value otherwise.

### GetCallbackfileOk

`func (o *CoreTagGetTagAreas200ResponseAreasInner) GetCallbackfileOk() (*string, bool)`

GetCallbackfileOk returns a tuple with the Callbackfile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCallbackfile

`func (o *CoreTagGetTagAreas200ResponseAreasInner) SetCallbackfile(v string)`

SetCallbackfile sets Callbackfile field to given value.

### HasCallbackfile

`func (o *CoreTagGetTagAreas200ResponseAreasInner) HasCallbackfile() bool`

HasCallbackfile returns a boolean if a field has been set.

### GetComponent

`func (o *CoreTagGetTagAreas200ResponseAreasInner) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreTagGetTagAreas200ResponseAreasInner) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreTagGetTagAreas200ResponseAreasInner) SetComponent(v string)`

SetComponent sets Component field to given value.

### HasComponent

`func (o *CoreTagGetTagAreas200ResponseAreasInner) HasComponent() bool`

HasComponent returns a boolean if a field has been set.

### GetEnabled

`func (o *CoreTagGetTagAreas200ResponseAreasInner) GetEnabled() bool`

GetEnabled returns the Enabled field if non-nil, zero value otherwise.

### GetEnabledOk

`func (o *CoreTagGetTagAreas200ResponseAreasInner) GetEnabledOk() (*bool, bool)`

GetEnabledOk returns a tuple with the Enabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnabled

`func (o *CoreTagGetTagAreas200ResponseAreasInner) SetEnabled(v bool)`

SetEnabled sets Enabled field to given value.

### HasEnabled

`func (o *CoreTagGetTagAreas200ResponseAreasInner) HasEnabled() bool`

HasEnabled returns a boolean if a field has been set.

### GetId

`func (o *CoreTagGetTagAreas200ResponseAreasInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreTagGetTagAreas200ResponseAreasInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreTagGetTagAreas200ResponseAreasInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreTagGetTagAreas200ResponseAreasInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetItemtype

`func (o *CoreTagGetTagAreas200ResponseAreasInner) GetItemtype() string`

GetItemtype returns the Itemtype field if non-nil, zero value otherwise.

### GetItemtypeOk

`func (o *CoreTagGetTagAreas200ResponseAreasInner) GetItemtypeOk() (*string, bool)`

GetItemtypeOk returns a tuple with the Itemtype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemtype

`func (o *CoreTagGetTagAreas200ResponseAreasInner) SetItemtype(v string)`

SetItemtype sets Itemtype field to given value.

### HasItemtype

`func (o *CoreTagGetTagAreas200ResponseAreasInner) HasItemtype() bool`

HasItemtype returns a boolean if a field has been set.

### GetLocked

`func (o *CoreTagGetTagAreas200ResponseAreasInner) GetLocked() bool`

GetLocked returns the Locked field if non-nil, zero value otherwise.

### GetLockedOk

`func (o *CoreTagGetTagAreas200ResponseAreasInner) GetLockedOk() (*bool, bool)`

GetLockedOk returns a tuple with the Locked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocked

`func (o *CoreTagGetTagAreas200ResponseAreasInner) SetLocked(v bool)`

SetLocked sets Locked field to given value.

### HasLocked

`func (o *CoreTagGetTagAreas200ResponseAreasInner) HasLocked() bool`

HasLocked returns a boolean if a field has been set.

### GetMultiplecontexts

`func (o *CoreTagGetTagAreas200ResponseAreasInner) GetMultiplecontexts() bool`

GetMultiplecontexts returns the Multiplecontexts field if non-nil, zero value otherwise.

### GetMultiplecontextsOk

`func (o *CoreTagGetTagAreas200ResponseAreasInner) GetMultiplecontextsOk() (*bool, bool)`

GetMultiplecontextsOk returns a tuple with the Multiplecontexts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMultiplecontexts

`func (o *CoreTagGetTagAreas200ResponseAreasInner) SetMultiplecontexts(v bool)`

SetMultiplecontexts sets Multiplecontexts field to given value.

### HasMultiplecontexts

`func (o *CoreTagGetTagAreas200ResponseAreasInner) HasMultiplecontexts() bool`

HasMultiplecontexts returns a boolean if a field has been set.

### GetShowstandard

`func (o *CoreTagGetTagAreas200ResponseAreasInner) GetShowstandard() int32`

GetShowstandard returns the Showstandard field if non-nil, zero value otherwise.

### GetShowstandardOk

`func (o *CoreTagGetTagAreas200ResponseAreasInner) GetShowstandardOk() (*int32, bool)`

GetShowstandardOk returns a tuple with the Showstandard field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowstandard

`func (o *CoreTagGetTagAreas200ResponseAreasInner) SetShowstandard(v int32)`

SetShowstandard sets Showstandard field to given value.

### HasShowstandard

`func (o *CoreTagGetTagAreas200ResponseAreasInner) HasShowstandard() bool`

HasShowstandard returns a boolean if a field has been set.

### GetTagcollid

`func (o *CoreTagGetTagAreas200ResponseAreasInner) GetTagcollid() int32`

GetTagcollid returns the Tagcollid field if non-nil, zero value otherwise.

### GetTagcollidOk

`func (o *CoreTagGetTagAreas200ResponseAreasInner) GetTagcollidOk() (*int32, bool)`

GetTagcollidOk returns a tuple with the Tagcollid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTagcollid

`func (o *CoreTagGetTagAreas200ResponseAreasInner) SetTagcollid(v int32)`

SetTagcollid sets Tagcollid field to given value.

### HasTagcollid

`func (o *CoreTagGetTagAreas200ResponseAreasInner) HasTagcollid() bool`

HasTagcollid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


