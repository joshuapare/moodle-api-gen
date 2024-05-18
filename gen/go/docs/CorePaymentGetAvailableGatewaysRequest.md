# CorePaymentGetAvailableGatewaysRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Component** | **string** | Component | [default to "null"]
**Itemid** | **int32** | An identifier for payment area in the component | [default to null]
**Paymentarea** | **string** | Payment area in the component | [default to "null"]

## Methods

### NewCorePaymentGetAvailableGatewaysRequest

`func NewCorePaymentGetAvailableGatewaysRequest(component string, itemid int32, paymentarea string, ) *CorePaymentGetAvailableGatewaysRequest`

NewCorePaymentGetAvailableGatewaysRequest instantiates a new CorePaymentGetAvailableGatewaysRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCorePaymentGetAvailableGatewaysRequestWithDefaults

`func NewCorePaymentGetAvailableGatewaysRequestWithDefaults() *CorePaymentGetAvailableGatewaysRequest`

NewCorePaymentGetAvailableGatewaysRequestWithDefaults instantiates a new CorePaymentGetAvailableGatewaysRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetComponent

`func (o *CorePaymentGetAvailableGatewaysRequest) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CorePaymentGetAvailableGatewaysRequest) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CorePaymentGetAvailableGatewaysRequest) SetComponent(v string)`

SetComponent sets Component field to given value.


### GetItemid

`func (o *CorePaymentGetAvailableGatewaysRequest) GetItemid() int32`

GetItemid returns the Itemid field if non-nil, zero value otherwise.

### GetItemidOk

`func (o *CorePaymentGetAvailableGatewaysRequest) GetItemidOk() (*int32, bool)`

GetItemidOk returns a tuple with the Itemid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemid

`func (o *CorePaymentGetAvailableGatewaysRequest) SetItemid(v int32)`

SetItemid sets Itemid field to given value.


### GetPaymentarea

`func (o *CorePaymentGetAvailableGatewaysRequest) GetPaymentarea() string`

GetPaymentarea returns the Paymentarea field if non-nil, zero value otherwise.

### GetPaymentareaOk

`func (o *CorePaymentGetAvailableGatewaysRequest) GetPaymentareaOk() (*string, bool)`

GetPaymentareaOk returns a tuple with the Paymentarea field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentarea

`func (o *CorePaymentGetAvailableGatewaysRequest) SetPaymentarea(v string)`

SetPaymentarea sets Paymentarea field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


