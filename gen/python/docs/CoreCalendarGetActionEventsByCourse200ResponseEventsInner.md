# CoreCalendarGetActionEventsByCourse200ResponseEventsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**CoreCalendarGetActionEventsByCourse200ResponseEventsInnerAction**](CoreCalendarGetActionEventsByCourse200ResponseEventsInnerAction.md) |  | [optional] 
**activityname** | **str** | activityname | [optional] [default to 'null']
**activitystr** | **str** | activitystr | [optional] [default to 'null']
**candelete** | **bool** | candelete | [optional] [default to False]
**canedit** | **bool** | canedit | [optional] [default to False]
**category** | [**CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory**](CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory.md) |  | [optional] 
**categoryid** | **int** | categoryid | [optional] [default to null]
**component** | **str** | component | [optional] [default to 'null']
**course** | [**CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCourse**](CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCourse.md) |  | [optional] 
**deleteurl** | **str** | deleteurl | [optional] [default to 'null']
**description** | **str** | description | [optional] [default to 'null']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**editurl** | **str** | editurl | [optional] [default to 'null']
**eventcount** | **int** | eventcount | [optional] [default to null]
**eventtype** | **str** | eventtype | [optional] [default to 'null']
**formattedlocation** | **str** | formattedlocation | [optional] [default to 'null']
**formattedtime** | **str** | formattedtime | [optional] [default to 'null']
**groupid** | **int** | groupid | [optional] [default to null]
**groupname** | **str** | groupname | [optional] [default to 'null']
**icon** | [**CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon**](CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon.md) |  | [optional] 
**id** | **int** | id | [optional] 
**instance** | **int** | instance | [optional] [default to null]
**isactionevent** | **bool** | isactionevent | [optional] [default to False]
**iscategoryevent** | **bool** | iscategoryevent | [optional] [default to False]
**iscourseevent** | **bool** | iscourseevent | [optional] [default to False]
**location** | **str** | location | [optional] [default to 'null']
**modulename** | **str** | modulename | [optional] [default to 'null']
**name** | **str** | name | [optional] 
**normalisedeventtype** | **str** | normalisedeventtype | [optional] [default to 'null']
**normalisedeventtypetext** | **str** | normalisedeventtypetext | [optional] [default to 'null']
**overdue** | **bool** | overdue | [optional] [default to False]
**purpose** | **str** | purpose | [optional] [default to 'null']
**repeatid** | **int** | repeatid | [optional] [default to null]
**subscription** | [**CoreCalendarGetActionEventsByCourse200ResponseEventsInnerSubscription**](CoreCalendarGetActionEventsByCourse200ResponseEventsInnerSubscription.md) |  | [optional] 
**timeduration** | **int** | timeduration | [optional] [default to null]
**timemodified** | **int** | timemodified | [optional] [default to null]
**timesort** | **int** | timesort | [optional] [default to null]
**timestart** | **int** | timestart | [optional] [default to null]
**timeusermidnight** | **int** | timeusermidnight | [optional] [default to null]
**url** | **str** | url | [optional] 
**userid** | **int** | userid | [optional] [default to null]
**viewurl** | **str** | viewurl | [optional] 
**visible** | **int** | visible | [optional] [default to null]

## Example

```python
from openapi_client.models.core_calendar_get_action_events_by_course200_response_events_inner import CoreCalendarGetActionEventsByCourse200ResponseEventsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetActionEventsByCourse200ResponseEventsInner from a JSON string
core_calendar_get_action_events_by_course200_response_events_inner_instance = CoreCalendarGetActionEventsByCourse200ResponseEventsInner.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetActionEventsByCourse200ResponseEventsInner.to_json())

# convert the object into a dict
core_calendar_get_action_events_by_course200_response_events_inner_dict = core_calendar_get_action_events_by_course200_response_events_inner_instance.to_dict()
# create an instance of CoreCalendarGetActionEventsByCourse200ResponseEventsInner from a dict
core_calendar_get_action_events_by_course200_response_events_inner_from_dict = CoreCalendarGetActionEventsByCourse200ResponseEventsInner.from_dict(core_calendar_get_action_events_by_course200_response_events_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


