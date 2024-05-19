# CoreCalendarSubmitCreateUpdateForm200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | [**CoreCalendarGetCalendarEventById200ResponseEvent**](CoreCalendarGetCalendarEventById200ResponseEvent.md) |  | [optional] 
**validationerror** | **bool** | Invalid form data | [optional] [default to False]

## Example

```python
from openapi_client.models.core_calendar_submit_create_update_form200_response import CoreCalendarSubmitCreateUpdateForm200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarSubmitCreateUpdateForm200Response from a JSON string
core_calendar_submit_create_update_form200_response_instance = CoreCalendarSubmitCreateUpdateForm200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarSubmitCreateUpdateForm200Response.to_json())

# convert the object into a dict
core_calendar_submit_create_update_form200_response_dict = core_calendar_submit_create_update_form200_response_instance.to_dict()
# create an instance of CoreCalendarSubmitCreateUpdateForm200Response from a dict
core_calendar_submit_create_update_form200_response_from_dict = CoreCalendarSubmitCreateUpdateForm200Response.from_dict(core_calendar_submit_create_update_form200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


