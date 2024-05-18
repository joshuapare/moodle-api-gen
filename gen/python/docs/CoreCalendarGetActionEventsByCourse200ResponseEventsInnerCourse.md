# CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCourse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coursecategory** | **str** | coursecategory | [default to 'null']
**courseimage** | **str** | courseimage | [default to 'null']
**enddate** | **int** | enddate | [default to null]
**fullname** | **str** | fullname | [default to 'null']
**fullnamedisplay** | **str** | fullnamedisplay | [default to 'null']
**hasprogress** | **bool** | hasprogress | [default to False]
**hidden** | **bool** | hidden | [default to False]
**id** | **int** | id | 
**idnumber** | **str** | idnumber | [default to 'null']
**isfavourite** | **bool** | isfavourite | [default to False]
**pdfexportfont** | **str** | pdfexportfont | [default to 'null']
**progress** | **int** | progress | [optional] [default to null]
**shortname** | **str** | shortname | [default to 'null']
**showactivitydates** | **bool** | showactivitydates | [default to False]
**showcompletionconditions** | **bool** | showcompletionconditions | [default to False]
**showshortname** | **bool** | showshortname | [default to False]
**startdate** | **int** | startdate | [default to null]
**summary** | **str** | summary | [default to 'null']
**summaryformat** | **int** | summary format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [default to null]
**timeaccess** | **int** | timeaccess | [optional] [default to null]
**viewurl** | **str** | viewurl | [default to 'null']
**visible** | **bool** | visible | [default to False]

## Example

```python
from openapi_client.models.core_calendar_get_action_events_by_course200_response_events_inner_course import CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCourse

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCourse from a JSON string
core_calendar_get_action_events_by_course200_response_events_inner_course_instance = CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCourse.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCourse.to_json())

# convert the object into a dict
core_calendar_get_action_events_by_course200_response_events_inner_course_dict = core_calendar_get_action_events_by_course200_response_events_inner_course_instance.to_dict()
# create an instance of CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCourse from a dict
core_calendar_get_action_events_by_course200_response_events_inner_course_from_dict = CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCourse.from_dict(core_calendar_get_action_events_by_course200_response_events_inner_course_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


