# CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coursecount** | **int** | coursecount | [default to 0]
**depth** | **int** | depth | [default to 0]
**description** | **str** | description | [optional] [default to 'null']
**id** | **int** | id | [default to null]
**idnumber** | **str** | idnumber | [default to 'null']
**name** | **str** | name | [default to '']
**nestedname** | **str** | nestedname | [default to 'null']
**parent** | **int** | parent | [default to null]
**timemodified** | **int** | timemodified | [default to 0]
**url** | **str** | url | 
**visible** | **int** | visible | [default to 1]

## Example

```python
from openapi_client.models.core_calendar_get_action_events_by_course200_response_events_inner_category import CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory from a JSON string
core_calendar_get_action_events_by_course200_response_events_inner_category_instance = CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory.to_json())

# convert the object into a dict
core_calendar_get_action_events_by_course200_response_events_inner_category_dict = core_calendar_get_action_events_by_course200_response_events_inner_category_instance.to_dict()
# create an instance of CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory from a dict
core_calendar_get_action_events_by_course200_response_events_inner_category_from_dict = CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory.from_dict(core_calendar_get_action_events_by_course200_response_events_inner_category_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


