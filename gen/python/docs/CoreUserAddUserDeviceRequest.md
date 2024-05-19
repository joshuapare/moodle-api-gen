# CoreUserAddUserDeviceRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appid** | **str** | the app id, usually something like com.moodle.moodlemobile | [default to 'null']
**model** | **str** | the device model &#39;Nexus4&#39; or &#39;iPad1,1&#39; etc. | [default to 'null']
**name** | **str** | the device name, &#39;occam&#39; or &#39;iPhone&#39; etc. | [default to 'null']
**platform** | **str** | the device platform &#39;iOS&#39; or &#39;Android&#39; etc. | [default to 'null']
**publickey** | **str** | the app generated public key | [optional] [default to 'null']
**pushid** | **str** | the device PUSH token/key/identifier/registration id | [default to 'null']
**uuid** | **str** | the device UUID | [default to 'null']
**version** | **str** | the device version &#39;6.1.2&#39; or &#39;4.2.2&#39; etc. | [default to 'null']

## Example

```python
from openapi_client.models.core_user_add_user_device_request import CoreUserAddUserDeviceRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserAddUserDeviceRequest from a JSON string
core_user_add_user_device_request_instance = CoreUserAddUserDeviceRequest.from_json(json)
# print the JSON string representation of the object
print(CoreUserAddUserDeviceRequest.to_json())

# convert the object into a dict
core_user_add_user_device_request_dict = core_user_add_user_device_request_instance.to_dict()
# create an instance of CoreUserAddUserDeviceRequest from a dict
core_user_add_user_device_request_from_dict = CoreUserAddUserDeviceRequest.from_dict(core_user_add_user_device_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


