# TinyPremiumGetApiKeyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextid** | **int** | The current context ID. | [default to null]

## Example

```python
from openapi_client.models.tiny_premium_get_api_key_request import TinyPremiumGetApiKeyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of TinyPremiumGetApiKeyRequest from a JSON string
tiny_premium_get_api_key_request_instance = TinyPremiumGetApiKeyRequest.from_json(json)
# print the JSON string representation of the object
print(TinyPremiumGetApiKeyRequest.to_json())

# convert the object into a dict
tiny_premium_get_api_key_request_dict = tiny_premium_get_api_key_request_instance.to_dict()
# create an instance of TinyPremiumGetApiKeyRequest from a dict
tiny_premium_get_api_key_request_from_dict = TinyPremiumGetApiKeyRequest.from_dict(tiny_premium_get_api_key_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


