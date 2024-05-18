# MessageAirnotifierAreNotificationPreferencesConfigured200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**users** | [**List[MessageAirnotifierAreNotificationPreferencesConfigured200ResponseUsersInner]**](MessageAirnotifierAreNotificationPreferencesConfigured200ResponseUsersInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.message_airnotifier_are_notification_preferences_configured200_response import MessageAirnotifierAreNotificationPreferencesConfigured200Response

# TODO update the JSON string below
json = "{}"
# create an instance of MessageAirnotifierAreNotificationPreferencesConfigured200Response from a JSON string
message_airnotifier_are_notification_preferences_configured200_response_instance = MessageAirnotifierAreNotificationPreferencesConfigured200Response.from_json(json)
# print the JSON string representation of the object
print(MessageAirnotifierAreNotificationPreferencesConfigured200Response.to_json())

# convert the object into a dict
message_airnotifier_are_notification_preferences_configured200_response_dict = message_airnotifier_are_notification_preferences_configured200_response_instance.to_dict()
# create an instance of MessageAirnotifierAreNotificationPreferencesConfigured200Response from a dict
message_airnotifier_are_notification_preferences_configured200_response_from_dict = MessageAirnotifierAreNotificationPreferencesConfigured200Response.from_dict(message_airnotifier_are_notification_preferences_configured200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


