# MessageAirnotifierGetUserDevices200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**devices** | [**List[MessageAirnotifierGetUserDevices200ResponseDevicesInner]**](MessageAirnotifierGetUserDevices200ResponseDevicesInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.message_airnotifier_get_user_devices200_response import MessageAirnotifierGetUserDevices200Response

# TODO update the JSON string below
json = "{}"
# create an instance of MessageAirnotifierGetUserDevices200Response from a JSON string
message_airnotifier_get_user_devices200_response_instance = MessageAirnotifierGetUserDevices200Response.from_json(json)
# print the JSON string representation of the object
print(MessageAirnotifierGetUserDevices200Response.to_json())

# convert the object into a dict
message_airnotifier_get_user_devices200_response_dict = message_airnotifier_get_user_devices200_response_instance.to_dict()
# create an instance of MessageAirnotifierGetUserDevices200Response from a dict
message_airnotifier_get_user_devices200_response_from_dict = MessageAirnotifierGetUserDevices200Response.from_dict(message_airnotifier_get_user_devices200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


