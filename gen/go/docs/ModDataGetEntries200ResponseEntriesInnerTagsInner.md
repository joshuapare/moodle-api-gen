# ModDataGetEntries200ResponseEntriesInnerTagsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Flag** | Pointer to **int32** | Whether the tag is flagged as inappropriate. | [optional] [default to 0]
**Id** | Pointer to **int32** | Tag id. | [optional] 
**Isstandard** | Pointer to **bool** | Whether this tag is standard. | [optional] [default to false]
**Itemid** | Pointer to **int32** | Id of the record tagged. | [optional] 
**Name** | Pointer to **string** | Tag name. | [optional] 
**Ordering** | Pointer to **int32** | Tag ordering. | [optional] 
**Rawname** | Pointer to **string** | The raw, unnormalised name for the tag as entered by users. | [optional] 
**Tagcollid** | Pointer to **int32** | Tag collection id. | [optional] 
**Taginstancecontextid** | Pointer to **int32** | Context the tag instance belongs to. | [optional] 
**Taginstanceid** | Pointer to **int32** | Tag instance id. | [optional] 

## Methods

### NewModDataGetEntries200ResponseEntriesInnerTagsInner

`func NewModDataGetEntries200ResponseEntriesInnerTagsInner() *ModDataGetEntries200ResponseEntriesInnerTagsInner`

NewModDataGetEntries200ResponseEntriesInnerTagsInner instantiates a new ModDataGetEntries200ResponseEntriesInnerTagsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModDataGetEntries200ResponseEntriesInnerTagsInnerWithDefaults

`func NewModDataGetEntries200ResponseEntriesInnerTagsInnerWithDefaults() *ModDataGetEntries200ResponseEntriesInnerTagsInner`

NewModDataGetEntries200ResponseEntriesInnerTagsInnerWithDefaults instantiates a new ModDataGetEntries200ResponseEntriesInnerTagsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFlag

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) GetFlag() int32`

GetFlag returns the Flag field if non-nil, zero value otherwise.

### GetFlagOk

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) GetFlagOk() (*int32, bool)`

GetFlagOk returns a tuple with the Flag field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlag

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) SetFlag(v int32)`

SetFlag sets Flag field to given value.

### HasFlag

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) HasFlag() bool`

HasFlag returns a boolean if a field has been set.

### GetId

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIsstandard

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) GetIsstandard() bool`

GetIsstandard returns the Isstandard field if non-nil, zero value otherwise.

### GetIsstandardOk

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) GetIsstandardOk() (*bool, bool)`

GetIsstandardOk returns a tuple with the Isstandard field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsstandard

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) SetIsstandard(v bool)`

SetIsstandard sets Isstandard field to given value.

### HasIsstandard

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) HasIsstandard() bool`

HasIsstandard returns a boolean if a field has been set.

### GetItemid

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) GetItemid() int32`

GetItemid returns the Itemid field if non-nil, zero value otherwise.

### GetItemidOk

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) GetItemidOk() (*int32, bool)`

GetItemidOk returns a tuple with the Itemid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemid

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) SetItemid(v int32)`

SetItemid sets Itemid field to given value.

### HasItemid

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) HasItemid() bool`

HasItemid returns a boolean if a field has been set.

### GetName

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetOrdering

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) GetOrdering() int32`

GetOrdering returns the Ordering field if non-nil, zero value otherwise.

### GetOrderingOk

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) GetOrderingOk() (*int32, bool)`

GetOrderingOk returns a tuple with the Ordering field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrdering

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) SetOrdering(v int32)`

SetOrdering sets Ordering field to given value.

### HasOrdering

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) HasOrdering() bool`

HasOrdering returns a boolean if a field has been set.

### GetRawname

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) GetRawname() string`

GetRawname returns the Rawname field if non-nil, zero value otherwise.

### GetRawnameOk

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) GetRawnameOk() (*string, bool)`

GetRawnameOk returns a tuple with the Rawname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRawname

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) SetRawname(v string)`

SetRawname sets Rawname field to given value.

### HasRawname

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) HasRawname() bool`

HasRawname returns a boolean if a field has been set.

### GetTagcollid

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) GetTagcollid() int32`

GetTagcollid returns the Tagcollid field if non-nil, zero value otherwise.

### GetTagcollidOk

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) GetTagcollidOk() (*int32, bool)`

GetTagcollidOk returns a tuple with the Tagcollid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTagcollid

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) SetTagcollid(v int32)`

SetTagcollid sets Tagcollid field to given value.

### HasTagcollid

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) HasTagcollid() bool`

HasTagcollid returns a boolean if a field has been set.

### GetTaginstancecontextid

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) GetTaginstancecontextid() int32`

GetTaginstancecontextid returns the Taginstancecontextid field if non-nil, zero value otherwise.

### GetTaginstancecontextidOk

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) GetTaginstancecontextidOk() (*int32, bool)`

GetTaginstancecontextidOk returns a tuple with the Taginstancecontextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTaginstancecontextid

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) SetTaginstancecontextid(v int32)`

SetTaginstancecontextid sets Taginstancecontextid field to given value.

### HasTaginstancecontextid

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) HasTaginstancecontextid() bool`

HasTaginstancecontextid returns a boolean if a field has been set.

### GetTaginstanceid

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) GetTaginstanceid() int32`

GetTaginstanceid returns the Taginstanceid field if non-nil, zero value otherwise.

### GetTaginstanceidOk

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) GetTaginstanceidOk() (*int32, bool)`

GetTaginstanceidOk returns a tuple with the Taginstanceid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTaginstanceid

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) SetTaginstanceid(v int32)`

SetTaginstanceid sets Taginstanceid field to given value.

### HasTaginstanceid

`func (o *ModDataGetEntries200ResponseEntriesInnerTagsInner) HasTaginstanceid() bool`

HasTaginstanceid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


