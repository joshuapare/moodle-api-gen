# CorePaymentGetAvailableGatewaysRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **str** | Component | [default to 'null']
**itemid** | **int** | An identifier for payment area in the component | [default to null]
**paymentarea** | **str** | Payment area in the component | [default to 'null']

## Example

```python
from openapi_client.models.core_payment_get_available_gateways_request import CorePaymentGetAvailableGatewaysRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CorePaymentGetAvailableGatewaysRequest from a JSON string
core_payment_get_available_gateways_request_instance = CorePaymentGetAvailableGatewaysRequest.from_json(json)
# print the JSON string representation of the object
print(CorePaymentGetAvailableGatewaysRequest.to_json())

# convert the object into a dict
core_payment_get_available_gateways_request_dict = core_payment_get_available_gateways_request_instance.to_dict()
# create an instance of CorePaymentGetAvailableGatewaysRequest from a dict
core_payment_get_available_gateways_request_from_dict = CorePaymentGetAvailableGatewaysRequest.from_dict(core_payment_get_available_gateways_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


