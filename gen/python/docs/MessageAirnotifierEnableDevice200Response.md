# MessageAirnotifierEnableDevice200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**success** | **bool** | True if success | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.message_airnotifier_enable_device200_response import MessageAirnotifierEnableDevice200Response

# TODO update the JSON string below
json = "{}"
# create an instance of MessageAirnotifierEnableDevice200Response from a JSON string
message_airnotifier_enable_device200_response_instance = MessageAirnotifierEnableDevice200Response.from_json(json)
# print the JSON string representation of the object
print(MessageAirnotifierEnableDevice200Response.to_json())

# convert the object into a dict
message_airnotifier_enable_device200_response_dict = message_airnotifier_enable_device200_response_instance.to_dict()
# create an instance of MessageAirnotifierEnableDevice200Response from a dict
message_airnotifier_enable_device200_response_from_dict = MessageAirnotifierEnableDevice200Response.from_dict(message_airnotifier_enable_device200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


