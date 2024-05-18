# CoreUserRemoveUserDeviceRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appid** | **str** | the app id, if empty devices matching the UUID for the user will be removed | [optional] [default to '']
**uuid** | **str** | the device UUID | 

## Example

```python
from openapi_client.models.core_user_remove_user_device_request import CoreUserRemoveUserDeviceRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserRemoveUserDeviceRequest from a JSON string
core_user_remove_user_device_request_instance = CoreUserRemoveUserDeviceRequest.from_json(json)
# print the JSON string representation of the object
print(CoreUserRemoveUserDeviceRequest.to_json())

# convert the object into a dict
core_user_remove_user_device_request_dict = core_user_remove_user_device_request_instance.to_dict()
# create an instance of CoreUserRemoveUserDeviceRequest from a dict
core_user_remove_user_device_request_from_dict = CoreUserRemoveUserDeviceRequest.from_dict(core_user_remove_user_device_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


