# CoreUserUpdateUserDevicePublicKeyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appid** | **str** | The app id, something like com.moodle.moodlemobile | [default to 'null']
**publickey** | **str** | the app generated public key | 
**uuid** | **str** | the device UUID | 

## Example

```python
from openapi_client.models.core_user_update_user_device_public_key_request import CoreUserUpdateUserDevicePublicKeyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserUpdateUserDevicePublicKeyRequest from a JSON string
core_user_update_user_device_public_key_request_instance = CoreUserUpdateUserDevicePublicKeyRequest.from_json(json)
# print the JSON string representation of the object
print(CoreUserUpdateUserDevicePublicKeyRequest.to_json())

# convert the object into a dict
core_user_update_user_device_public_key_request_dict = core_user_update_user_device_public_key_request_instance.to_dict()
# create an instance of CoreUserUpdateUserDevicePublicKeyRequest from a dict
core_user_update_user_device_public_key_request_from_dict = CoreUserUpdateUserDevicePublicKeyRequest.from_dict(core_user_update_user_device_public_key_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


