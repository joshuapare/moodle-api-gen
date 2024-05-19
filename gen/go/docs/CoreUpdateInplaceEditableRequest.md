# CoreUpdateInplaceEditableRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Component** | **string** | component responsible for the update | [default to "null"]
**Itemid** | **string** | identifier of the updated item | [default to "null"]
**Itemtype** | **string** | type of the updated item inside the component | [default to "null"]
**Value** | **string** | new value | [default to "null"]

## Methods

### NewCoreUpdateInplaceEditableRequest

`func NewCoreUpdateInplaceEditableRequest(component string, itemid string, itemtype string, value string, ) *CoreUpdateInplaceEditableRequest`

NewCoreUpdateInplaceEditableRequest instantiates a new CoreUpdateInplaceEditableRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreUpdateInplaceEditableRequestWithDefaults

`func NewCoreUpdateInplaceEditableRequestWithDefaults() *CoreUpdateInplaceEditableRequest`

NewCoreUpdateInplaceEditableRequestWithDefaults instantiates a new CoreUpdateInplaceEditableRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetComponent

`func (o *CoreUpdateInplaceEditableRequest) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreUpdateInplaceEditableRequest) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreUpdateInplaceEditableRequest) SetComponent(v string)`

SetComponent sets Component field to given value.


### GetItemid

`func (o *CoreUpdateInplaceEditableRequest) GetItemid() string`

GetItemid returns the Itemid field if non-nil, zero value otherwise.

### GetItemidOk

`func (o *CoreUpdateInplaceEditableRequest) GetItemidOk() (*string, bool)`

GetItemidOk returns a tuple with the Itemid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemid

`func (o *CoreUpdateInplaceEditableRequest) SetItemid(v string)`

SetItemid sets Itemid field to given value.


### GetItemtype

`func (o *CoreUpdateInplaceEditableRequest) GetItemtype() string`

GetItemtype returns the Itemtype field if non-nil, zero value otherwise.

### GetItemtypeOk

`func (o *CoreUpdateInplaceEditableRequest) GetItemtypeOk() (*string, bool)`

GetItemtypeOk returns a tuple with the Itemtype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemtype

`func (o *CoreUpdateInplaceEditableRequest) SetItemtype(v string)`

SetItemtype sets Itemtype field to given value.


### GetValue

`func (o *CoreUpdateInplaceEditableRequest) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *CoreUpdateInplaceEditableRequest) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *CoreUpdateInplaceEditableRequest) SetValue(v string)`

SetValue sets Value field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


