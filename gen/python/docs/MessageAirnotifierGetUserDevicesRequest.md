# MessageAirnotifierGetUserDevicesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appid** | **str** | App unique id (usually a reversed domain) | [default to 'null']
**userid** | **int** | User id, 0 for current user | [optional] [default to 0]

## Example

```python
from openapi_client.models.message_airnotifier_get_user_devices_request import MessageAirnotifierGetUserDevicesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of MessageAirnotifierGetUserDevicesRequest from a JSON string
message_airnotifier_get_user_devices_request_instance = MessageAirnotifierGetUserDevicesRequest.from_json(json)
# print the JSON string representation of the object
print(MessageAirnotifierGetUserDevicesRequest.to_json())

# convert the object into a dict
message_airnotifier_get_user_devices_request_dict = message_airnotifier_get_user_devices_request_instance.to_dict()
# create an instance of MessageAirnotifierGetUserDevicesRequest from a dict
message_airnotifier_get_user_devices_request_from_dict = MessageAirnotifierGetUserDevicesRequest.from_dict(message_airnotifier_get_user_devices_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


