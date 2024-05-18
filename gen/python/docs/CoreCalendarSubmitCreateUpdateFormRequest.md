# CoreCalendarSubmitCreateUpdateFormRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**formdata** | **str** | The data from the event form | [default to 'null']

## Example

```python
from openapi_client.models.core_calendar_submit_create_update_form_request import CoreCalendarSubmitCreateUpdateFormRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarSubmitCreateUpdateFormRequest from a JSON string
core_calendar_submit_create_update_form_request_instance = CoreCalendarSubmitCreateUpdateFormRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarSubmitCreateUpdateFormRequest.to_json())

# convert the object into a dict
core_calendar_submit_create_update_form_request_dict = core_calendar_submit_create_update_form_request_instance.to_dict()
# create an instance of CoreCalendarSubmitCreateUpdateFormRequest from a dict
core_calendar_submit_create_update_form_request_from_dict = CoreCalendarSubmitCreateUpdateFormRequest.from_dict(core_calendar_submit_create_update_form_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


