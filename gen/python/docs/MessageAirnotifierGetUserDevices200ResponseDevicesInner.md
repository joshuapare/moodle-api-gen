# MessageAirnotifierGetUserDevices200ResponseDevicesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appid** | **str** | The app id, something like com.moodle.moodlemobile | [optional] 
**enable** | **int** | Whether the device is enabled or not | [optional] [default to null]
**id** | **int** | Device id (in the message_airnotifier table) | [optional] [default to null]
**model** | **str** | The device model &#39;Nexus4&#39; or &#39;iPad1,1&#39; etc. | [optional] [default to 'null']
**name** | **str** | The device name, &#39;occam&#39; or &#39;iPhone&#39; etc. | [optional] [default to 'null']
**platform** | **str** | The device platform &#39;iOS&#39; or &#39;Android&#39; etc. | [optional] [default to 'null']
**pushid** | **str** | The device PUSH token/key/identifier/registration id | [optional] [default to 'null']
**timecreated** | **int** | Time created | [optional] 
**timemodified** | **int** | Time modified | [optional] [default to null]
**uuid** | **str** | The device UUID | [optional] [default to 'null']
**version** | **str** | The device version &#39;6.1.2&#39; or &#39;4.2.2&#39; etc. | [optional] [default to 'null']

## Example

```python
from openapi_client.models.message_airnotifier_get_user_devices200_response_devices_inner import MessageAirnotifierGetUserDevices200ResponseDevicesInner

# TODO update the JSON string below
json = "{}"
# create an instance of MessageAirnotifierGetUserDevices200ResponseDevicesInner from a JSON string
message_airnotifier_get_user_devices200_response_devices_inner_instance = MessageAirnotifierGetUserDevices200ResponseDevicesInner.from_json(json)
# print the JSON string representation of the object
print(MessageAirnotifierGetUserDevices200ResponseDevicesInner.to_json())

# convert the object into a dict
message_airnotifier_get_user_devices200_response_devices_inner_dict = message_airnotifier_get_user_devices200_response_devices_inner_instance.to_dict()
# create an instance of MessageAirnotifierGetUserDevices200ResponseDevicesInner from a dict
message_airnotifier_get_user_devices200_response_devices_inner_from_dict = MessageAirnotifierGetUserDevices200ResponseDevicesInner.from_dict(message_airnotifier_get_user_devices200_response_devices_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


