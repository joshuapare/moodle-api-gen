# PaygwPaypalCreateTransactionCompleteRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Component** | **string** | The component name | [default to "null"]
**Itemid** | **int32** | The item id in the context of the component area | [default to null]
**Orderid** | **string** | The order id coming back from PayPal | [default to "null"]
**Paymentarea** | **string** | Payment area in the component | 

## Methods

### NewPaygwPaypalCreateTransactionCompleteRequest

`func NewPaygwPaypalCreateTransactionCompleteRequest(component string, itemid int32, orderid string, paymentarea string, ) *PaygwPaypalCreateTransactionCompleteRequest`

NewPaygwPaypalCreateTransactionCompleteRequest instantiates a new PaygwPaypalCreateTransactionCompleteRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPaygwPaypalCreateTransactionCompleteRequestWithDefaults

`func NewPaygwPaypalCreateTransactionCompleteRequestWithDefaults() *PaygwPaypalCreateTransactionCompleteRequest`

NewPaygwPaypalCreateTransactionCompleteRequestWithDefaults instantiates a new PaygwPaypalCreateTransactionCompleteRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetComponent

`func (o *PaygwPaypalCreateTransactionCompleteRequest) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *PaygwPaypalCreateTransactionCompleteRequest) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *PaygwPaypalCreateTransactionCompleteRequest) SetComponent(v string)`

SetComponent sets Component field to given value.


### GetItemid

`func (o *PaygwPaypalCreateTransactionCompleteRequest) GetItemid() int32`

GetItemid returns the Itemid field if non-nil, zero value otherwise.

### GetItemidOk

`func (o *PaygwPaypalCreateTransactionCompleteRequest) GetItemidOk() (*int32, bool)`

GetItemidOk returns a tuple with the Itemid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemid

`func (o *PaygwPaypalCreateTransactionCompleteRequest) SetItemid(v int32)`

SetItemid sets Itemid field to given value.


### GetOrderid

`func (o *PaygwPaypalCreateTransactionCompleteRequest) GetOrderid() string`

GetOrderid returns the Orderid field if non-nil, zero value otherwise.

### GetOrderidOk

`func (o *PaygwPaypalCreateTransactionCompleteRequest) GetOrderidOk() (*string, bool)`

GetOrderidOk returns a tuple with the Orderid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderid

`func (o *PaygwPaypalCreateTransactionCompleteRequest) SetOrderid(v string)`

SetOrderid sets Orderid field to given value.


### GetPaymentarea

`func (o *PaygwPaypalCreateTransactionCompleteRequest) GetPaymentarea() string`

GetPaymentarea returns the Paymentarea field if non-nil, zero value otherwise.

### GetPaymentareaOk

`func (o *PaygwPaypalCreateTransactionCompleteRequest) GetPaymentareaOk() (*string, bool)`

GetPaymentareaOk returns a tuple with the Paymentarea field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentarea

`func (o *PaygwPaypalCreateTransactionCompleteRequest) SetPaymentarea(v string)`

SetPaymentarea sets Paymentarea field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


