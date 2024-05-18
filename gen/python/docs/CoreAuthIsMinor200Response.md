# CoreAuthIsMinor200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **bool** | True if the user is considered to be a digital minor,                     false if not | [default to False]

## Example

```python
from openapi_client.models.core_auth_is_minor200_response import CoreAuthIsMinor200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreAuthIsMinor200Response from a JSON string
core_auth_is_minor200_response_instance = CoreAuthIsMinor200Response.from_json(json)
# print the JSON string representation of the object
print(CoreAuthIsMinor200Response.to_json())

# convert the object into a dict
core_auth_is_minor200_response_dict = core_auth_is_minor200_response_instance.to_dict()
# create an instance of CoreAuthIsMinor200Response from a dict
core_auth_is_minor200_response_from_dict = CoreAuthIsMinor200Response.from_dict(core_auth_is_minor200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


