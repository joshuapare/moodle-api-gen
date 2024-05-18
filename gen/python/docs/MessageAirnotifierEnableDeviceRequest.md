# MessageAirnotifierEnableDeviceRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deviceid** | **int** | The device id | [default to null]
**enable** | **bool** | True for enable the device, false otherwise | [default to False]

## Example

```python
from openapi_client.models.message_airnotifier_enable_device_request import MessageAirnotifierEnableDeviceRequest

# TODO update the JSON string below
json = "{}"
# create an instance of MessageAirnotifierEnableDeviceRequest from a JSON string
message_airnotifier_enable_device_request_instance = MessageAirnotifierEnableDeviceRequest.from_json(json)
# print the JSON string representation of the object
print(MessageAirnotifierEnableDeviceRequest.to_json())

# convert the object into a dict
message_airnotifier_enable_device_request_dict = message_airnotifier_enable_device_request_instance.to_dict()
# create an instance of MessageAirnotifierEnableDeviceRequest from a dict
message_airnotifier_enable_device_request_from_dict = MessageAirnotifierEnableDeviceRequest.from_dict(message_airnotifier_enable_device_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


