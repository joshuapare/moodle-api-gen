# CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction**](CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction.md) |  | [optional] 
**activityname** | **str** | activityname | [optional] 
**activitystr** | **str** | activitystr | [optional] 
**candelete** | **bool** | candelete | [optional] 
**canedit** | **bool** | canedit | [optional] 
**category** | [**CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory**](CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory.md) |  | [optional] 
**categoryid** | **int** | categoryid | [optional] 
**component** | **str** | component | [optional] 
**course** | [**CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse**](CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse.md) |  | [optional] 
**deleteurl** | **str** | deleteurl | [optional] 
**description** | **str** | description | [optional] 
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**draggable** | **bool** | draggable | [optional] [default to False]
**editurl** | **str** | editurl | [optional] 
**eventcount** | **int** | eventcount | [optional] 
**eventtype** | **str** | eventtype | [optional] 
**formattedlocation** | **str** | formattedlocation | [optional] 
**formattedtime** | **str** | formattedtime | [optional] 
**groupid** | **int** | groupid | [optional] 
**groupname** | **str** | groupname | [optional] 
**icon** | [**CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon**](CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon.md) |  | [optional] 
**id** | **int** | id | [optional] 
**instance** | **int** | instance | [optional] 
**isactionevent** | **bool** | isactionevent | [optional] 
**iscategoryevent** | **bool** | iscategoryevent | [optional] 
**iscourseevent** | **bool** | iscourseevent | [optional] 
**islastday** | **bool** | islastday | [optional] [default to False]
**location** | **str** | location | [optional] 
**maxdayerror** | **str** | maxdayerror | [optional] 
**maxdaytimestamp** | **int** | maxdaytimestamp | [optional] 
**mindayerror** | **str** | mindayerror | [optional] 
**mindaytimestamp** | **int** | mindaytimestamp | [optional] 
**modulename** | **str** | modulename | [optional] 
**name** | **str** | name | [optional] 
**normalisedeventtype** | **str** | normalisedeventtype | [optional] 
**normalisedeventtypetext** | **str** | normalisedeventtypetext | [optional] 
**overdue** | **bool** | overdue | [optional] [default to False]
**popupname** | **str** | popupname | [optional] 
**purpose** | **str** | purpose | [optional] 
**repeatid** | **int** | repeatid | [optional] 
**subscription** | [**CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription**](CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription.md) |  | [optional] 
**timeduration** | **int** | timeduration | [optional] 
**timemodified** | **int** | timemodified | [optional] 
**timesort** | **int** | timesort | [optional] 
**timestart** | **int** | timestart | [optional] 
**timeusermidnight** | **int** | timeusermidnight | [optional] 
**url** | **str** | url | [optional] 
**userid** | **int** | userid | [optional] 
**viewurl** | **str** | viewurl | [optional] 
**visible** | **int** | visible | [optional] 

## Example

```python
from openapi_client.models.core_calendar_get_calendar_monthly_view200_response_weeks_inner_days_inner_events_inner import CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner from a JSON string
core_calendar_get_calendar_monthly_view200_response_weeks_inner_days_inner_events_inner_instance = CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner.to_json())

# convert the object into a dict
core_calendar_get_calendar_monthly_view200_response_weeks_inner_days_inner_events_inner_dict = core_calendar_get_calendar_monthly_view200_response_weeks_inner_days_inner_events_inner_instance.to_dict()
# create an instance of CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner from a dict
core_calendar_get_calendar_monthly_view200_response_weeks_inner_days_inner_events_inner_from_dict = CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner.from_dict(core_calendar_get_calendar_monthly_view200_response_weeks_inner_days_inner_events_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


