# CoreCalendarGetCalendarEventById200ResponseEvent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction**](CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction.md) |  | [optional] 
**activityname** | **str** | activityname | [optional] 
**activitystr** | **str** | activitystr | [optional] 
**candelete** | **bool** | candelete | 
**canedit** | **bool** | canedit | 
**category** | [**CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory**](CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory.md) |  | [optional] 
**categoryid** | **int** | categoryid | [optional] 
**component** | **str** | component | [optional] 
**course** | [**CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse**](CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse.md) |  | [optional] 
**deleteurl** | **str** | deleteurl | 
**description** | **str** | description | [optional] 
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**editurl** | **str** | editurl | 
**eventcount** | **int** | eventcount | [optional] 
**eventtype** | **str** | eventtype | 
**formattedlocation** | **str** | formattedlocation | 
**formattedtime** | **str** | formattedtime | 
**groupid** | **int** | groupid | [optional] 
**groupname** | **str** | groupname | [optional] 
**icon** | [**CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon**](CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon.md) |  | 
**id** | **int** | id | 
**instance** | **int** | instance | [optional] 
**isactionevent** | **bool** | isactionevent | 
**iscategoryevent** | **bool** | iscategoryevent | 
**iscourseevent** | **bool** | iscourseevent | 
**location** | **str** | location | [optional] 
**modulename** | **str** | modulename | [optional] 
**name** | **str** | name | 
**normalisedeventtype** | **str** | normalisedeventtype | 
**normalisedeventtypetext** | **str** | normalisedeventtypetext | 
**overdue** | **bool** | overdue | [optional] [default to False]
**purpose** | **str** | purpose | 
**repeatid** | **int** | repeatid | [optional] 
**subscription** | [**CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription**](CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription.md) |  | [optional] 
**timeduration** | **int** | timeduration | 
**timemodified** | **int** | timemodified | 
**timesort** | **int** | timesort | 
**timestart** | **int** | timestart | 
**timeusermidnight** | **int** | timeusermidnight | 
**url** | **str** | url | 
**userid** | **int** | userid | [optional] 
**viewurl** | **str** | viewurl | 
**visible** | **int** | visible | 

## Example

```python
from openapi_client.models.core_calendar_get_calendar_event_by_id200_response_event import CoreCalendarGetCalendarEventById200ResponseEvent

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetCalendarEventById200ResponseEvent from a JSON string
core_calendar_get_calendar_event_by_id200_response_event_instance = CoreCalendarGetCalendarEventById200ResponseEvent.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetCalendarEventById200ResponseEvent.to_json())

# convert the object into a dict
core_calendar_get_calendar_event_by_id200_response_event_dict = core_calendar_get_calendar_event_by_id200_response_event_instance.to_dict()
# create an instance of CoreCalendarGetCalendarEventById200ResponseEvent from a dict
core_calendar_get_calendar_event_by_id200_response_event_from_dict = CoreCalendarGetCalendarEventById200ResponseEvent.from_dict(core_calendar_get_calendar_event_by_id200_response_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


