# CoreUpdateInplaceEditable200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Component** | Pointer to **string** | component responsible for the update | [optional] 
**Displayvalue** | **string** | display value (may contain link or other html tags) | [default to "null"]
**Edithint** | Pointer to **string** | hint for editing element | [optional] [default to "null"]
**Editicon** | Pointer to [**CoreUpdateInplaceEditable200ResponseEditicon**](CoreUpdateInplaceEditable200ResponseEditicon.md) |  | [optional] 
**Editlabel** | Pointer to **string** | label for editing element | [optional] [default to "null"]
**Itemid** | Pointer to **string** | identifier of the updated item | [optional] 
**Itemtype** | Pointer to **string** | itemtype | [optional] 
**Linkeverything** | Pointer to **int32** | Should everything be wrapped in the edit link or link displayed separately | [optional] [default to null]
**Options** | Pointer to **string** | options of the element, format depends on type | [optional] [default to "null"]
**Type** | Pointer to **string** | type of the element (text, toggle, select) | [optional] [default to "null"]
**Value** | Pointer to **string** | value of the item as it is stored | [optional] [default to "null"]

## Methods

### NewCoreUpdateInplaceEditable200Response

`func NewCoreUpdateInplaceEditable200Response(displayvalue string, ) *CoreUpdateInplaceEditable200Response`

NewCoreUpdateInplaceEditable200Response instantiates a new CoreUpdateInplaceEditable200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreUpdateInplaceEditable200ResponseWithDefaults

`func NewCoreUpdateInplaceEditable200ResponseWithDefaults() *CoreUpdateInplaceEditable200Response`

NewCoreUpdateInplaceEditable200ResponseWithDefaults instantiates a new CoreUpdateInplaceEditable200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetComponent

`func (o *CoreUpdateInplaceEditable200Response) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreUpdateInplaceEditable200Response) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreUpdateInplaceEditable200Response) SetComponent(v string)`

SetComponent sets Component field to given value.

### HasComponent

`func (o *CoreUpdateInplaceEditable200Response) HasComponent() bool`

HasComponent returns a boolean if a field has been set.

### GetDisplayvalue

`func (o *CoreUpdateInplaceEditable200Response) GetDisplayvalue() string`

GetDisplayvalue returns the Displayvalue field if non-nil, zero value otherwise.

### GetDisplayvalueOk

`func (o *CoreUpdateInplaceEditable200Response) GetDisplayvalueOk() (*string, bool)`

GetDisplayvalueOk returns a tuple with the Displayvalue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayvalue

`func (o *CoreUpdateInplaceEditable200Response) SetDisplayvalue(v string)`

SetDisplayvalue sets Displayvalue field to given value.


### GetEdithint

`func (o *CoreUpdateInplaceEditable200Response) GetEdithint() string`

GetEdithint returns the Edithint field if non-nil, zero value otherwise.

### GetEdithintOk

`func (o *CoreUpdateInplaceEditable200Response) GetEdithintOk() (*string, bool)`

GetEdithintOk returns a tuple with the Edithint field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEdithint

`func (o *CoreUpdateInplaceEditable200Response) SetEdithint(v string)`

SetEdithint sets Edithint field to given value.

### HasEdithint

`func (o *CoreUpdateInplaceEditable200Response) HasEdithint() bool`

HasEdithint returns a boolean if a field has been set.

### GetEditicon

`func (o *CoreUpdateInplaceEditable200Response) GetEditicon() CoreUpdateInplaceEditable200ResponseEditicon`

GetEditicon returns the Editicon field if non-nil, zero value otherwise.

### GetEditiconOk

`func (o *CoreUpdateInplaceEditable200Response) GetEditiconOk() (*CoreUpdateInplaceEditable200ResponseEditicon, bool)`

GetEditiconOk returns a tuple with the Editicon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEditicon

`func (o *CoreUpdateInplaceEditable200Response) SetEditicon(v CoreUpdateInplaceEditable200ResponseEditicon)`

SetEditicon sets Editicon field to given value.

### HasEditicon

`func (o *CoreUpdateInplaceEditable200Response) HasEditicon() bool`

HasEditicon returns a boolean if a field has been set.

### GetEditlabel

`func (o *CoreUpdateInplaceEditable200Response) GetEditlabel() string`

GetEditlabel returns the Editlabel field if non-nil, zero value otherwise.

### GetEditlabelOk

`func (o *CoreUpdateInplaceEditable200Response) GetEditlabelOk() (*string, bool)`

GetEditlabelOk returns a tuple with the Editlabel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEditlabel

`func (o *CoreUpdateInplaceEditable200Response) SetEditlabel(v string)`

SetEditlabel sets Editlabel field to given value.

### HasEditlabel

`func (o *CoreUpdateInplaceEditable200Response) HasEditlabel() bool`

HasEditlabel returns a boolean if a field has been set.

### GetItemid

`func (o *CoreUpdateInplaceEditable200Response) GetItemid() string`

GetItemid returns the Itemid field if non-nil, zero value otherwise.

### GetItemidOk

`func (o *CoreUpdateInplaceEditable200Response) GetItemidOk() (*string, bool)`

GetItemidOk returns a tuple with the Itemid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemid

`func (o *CoreUpdateInplaceEditable200Response) SetItemid(v string)`

SetItemid sets Itemid field to given value.

### HasItemid

`func (o *CoreUpdateInplaceEditable200Response) HasItemid() bool`

HasItemid returns a boolean if a field has been set.

### GetItemtype

`func (o *CoreUpdateInplaceEditable200Response) GetItemtype() string`

GetItemtype returns the Itemtype field if non-nil, zero value otherwise.

### GetItemtypeOk

`func (o *CoreUpdateInplaceEditable200Response) GetItemtypeOk() (*string, bool)`

GetItemtypeOk returns a tuple with the Itemtype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemtype

`func (o *CoreUpdateInplaceEditable200Response) SetItemtype(v string)`

SetItemtype sets Itemtype field to given value.

### HasItemtype

`func (o *CoreUpdateInplaceEditable200Response) HasItemtype() bool`

HasItemtype returns a boolean if a field has been set.

### GetLinkeverything

`func (o *CoreUpdateInplaceEditable200Response) GetLinkeverything() int32`

GetLinkeverything returns the Linkeverything field if non-nil, zero value otherwise.

### GetLinkeverythingOk

`func (o *CoreUpdateInplaceEditable200Response) GetLinkeverythingOk() (*int32, bool)`

GetLinkeverythingOk returns a tuple with the Linkeverything field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLinkeverything

`func (o *CoreUpdateInplaceEditable200Response) SetLinkeverything(v int32)`

SetLinkeverything sets Linkeverything field to given value.

### HasLinkeverything

`func (o *CoreUpdateInplaceEditable200Response) HasLinkeverything() bool`

HasLinkeverything returns a boolean if a field has been set.

### GetOptions

`func (o *CoreUpdateInplaceEditable200Response) GetOptions() string`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *CoreUpdateInplaceEditable200Response) GetOptionsOk() (*string, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *CoreUpdateInplaceEditable200Response) SetOptions(v string)`

SetOptions sets Options field to given value.

### HasOptions

`func (o *CoreUpdateInplaceEditable200Response) HasOptions() bool`

HasOptions returns a boolean if a field has been set.

### GetType

`func (o *CoreUpdateInplaceEditable200Response) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CoreUpdateInplaceEditable200Response) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CoreUpdateInplaceEditable200Response) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *CoreUpdateInplaceEditable200Response) HasType() bool`

HasType returns a boolean if a field has been set.

### GetValue

`func (o *CoreUpdateInplaceEditable200Response) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *CoreUpdateInplaceEditable200Response) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *CoreUpdateInplaceEditable200Response) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *CoreUpdateInplaceEditable200Response) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


