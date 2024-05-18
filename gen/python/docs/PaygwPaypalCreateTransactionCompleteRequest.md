# PaygwPaypalCreateTransactionCompleteRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **str** | The component name | [default to 'null']
**itemid** | **int** | The item id in the context of the component area | [default to null]
**orderid** | **str** | The order id coming back from PayPal | [default to 'null']
**paymentarea** | **str** | Payment area in the component | 

## Example

```python
from openapi_client.models.paygw_paypal_create_transaction_complete_request import PaygwPaypalCreateTransactionCompleteRequest

# TODO update the JSON string below
json = "{}"
# create an instance of PaygwPaypalCreateTransactionCompleteRequest from a JSON string
paygw_paypal_create_transaction_complete_request_instance = PaygwPaypalCreateTransactionCompleteRequest.from_json(json)
# print the JSON string representation of the object
print(PaygwPaypalCreateTransactionCompleteRequest.to_json())

# convert the object into a dict
paygw_paypal_create_transaction_complete_request_dict = paygw_paypal_create_transaction_complete_request_instance.to_dict()
# create an instance of PaygwPaypalCreateTransactionCompleteRequest from a dict
paygw_paypal_create_transaction_complete_request_from_dict = PaygwPaypalCreateTransactionCompleteRequest.from_dict(paygw_paypal_create_transaction_complete_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


