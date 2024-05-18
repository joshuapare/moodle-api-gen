# CoreCalendarDeleteSubscription200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **bool** | status: true if success | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarDeleteSubscription200Response from a JSON string
core_calendar_delete_subscription200_response_instance = CoreCalendarDeleteSubscription200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarDeleteSubscription200Response.to_json())

# convert the object into a dict
core_calendar_delete_subscription200_response_dict = core_calendar_delete_subscription200_response_instance.to_dict()
# create an instance of CoreCalendarDeleteSubscription200Response from a dict
core_calendar_delete_subscription200_response_from_dict = CoreCalendarDeleteSubscription200Response.from_dict(core_calendar_delete_subscription200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


