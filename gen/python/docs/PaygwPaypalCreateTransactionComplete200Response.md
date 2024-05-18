# PaygwPaypalCreateTransactionComplete200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Message (usually the error message). | [default to 'null']
**success** | **bool** | Whether everything was successful or not. | [default to False]

## Example

```python
from openapi_client.models.paygw_paypal_create_transaction_complete200_response import PaygwPaypalCreateTransactionComplete200Response

# TODO update the JSON string below
json = "{}"
# create an instance of PaygwPaypalCreateTransactionComplete200Response from a JSON string
paygw_paypal_create_transaction_complete200_response_instance = PaygwPaypalCreateTransactionComplete200Response.from_json(json)
# print the JSON string representation of the object
print(PaygwPaypalCreateTransactionComplete200Response.to_json())

# convert the object into a dict
paygw_paypal_create_transaction_complete200_response_dict = paygw_paypal_create_transaction_complete200_response_instance.to_dict()
# create an instance of PaygwPaypalCreateTransactionComplete200Response from a dict
paygw_paypal_create_transaction_complete200_response_from_dict = PaygwPaypalCreateTransactionComplete200Response.from_dict(paygw_paypal_create_transaction_complete200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


