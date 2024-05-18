# CoreMessageGetUserNotificationPreferences200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**preferences** | [**CoreMessageGetUserNotificationPreferences200ResponsePreferences**](CoreMessageGetUserNotificationPreferences200ResponsePreferences.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_message_get_user_notification_preferences200_response import CoreMessageGetUserNotificationPreferences200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetUserNotificationPreferences200Response from a JSON string
core_message_get_user_notification_preferences200_response_instance = CoreMessageGetUserNotificationPreferences200Response.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetUserNotificationPreferences200Response.to_json())

# convert the object into a dict
core_message_get_user_notification_preferences200_response_dict = core_message_get_user_notification_preferences200_response_instance.to_dict()
# create an instance of CoreMessageGetUserNotificationPreferences200Response from a dict
core_message_get_user_notification_preferences200_response_from_dict = CoreMessageGetUserNotificationPreferences200Response.from_dict(core_message_get_user_notification_preferences200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


