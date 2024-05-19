# CoreCalendarDeleteSubscriptionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subscriptionid** | **int** | The id of the subscription | [default to null]

## Example

```python
from openapi_client.models.core_calendar_delete_subscription_request import CoreCalendarDeleteSubscriptionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarDeleteSubscriptionRequest from a JSON string
core_calendar_delete_subscription_request_instance = CoreCalendarDeleteSubscriptionRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarDeleteSubscriptionRequest.to_json())

# convert the object into a dict
core_calendar_delete_subscription_request_dict = core_calendar_delete_subscription_request_instance.to_dict()
# create an instance of CoreCalendarDeleteSubscriptionRequest from a dict
core_calendar_delete_subscription_request_from_dict = CoreCalendarDeleteSubscriptionRequest.from_dict(core_calendar_delete_subscription_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


