# PaygwPaypalGetConfigForJsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **str** | Component | 
**itemid** | **int** | An identifier for payment area in the component | 
**paymentarea** | **str** | Payment area in the component | 

## Example

```python
from openapi_client.models.paygw_paypal_get_config_for_js_request import PaygwPaypalGetConfigForJsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of PaygwPaypalGetConfigForJsRequest from a JSON string
paygw_paypal_get_config_for_js_request_instance = PaygwPaypalGetConfigForJsRequest.from_json(json)
# print the JSON string representation of the object
print(PaygwPaypalGetConfigForJsRequest.to_json())

# convert the object into a dict
paygw_paypal_get_config_for_js_request_dict = paygw_paypal_get_config_for_js_request_instance.to_dict()
# create an instance of PaygwPaypalGetConfigForJsRequest from a dict
paygw_paypal_get_config_for_js_request_from_dict = PaygwPaypalGetConfigForJsRequest.from_dict(paygw_paypal_get_config_for_js_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


