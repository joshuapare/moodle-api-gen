# ToolLpDataForUserCompetencySummaryInCourse200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**course** | [**CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse**](CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse.md) |  | 
**coursemodules** | [**List[ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner]**](ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner.md) |  | 
**plans** | [**List[ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner]**](ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner.md) |  | 
**pluginbaseurl** | **str** | pluginbaseurl | 
**usercompetencysummary** | [**ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary**](ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary.md) |  | 

## Example

```python
from openapi_client.models.tool_lp_data_for_user_competency_summary_in_course200_response import ToolLpDataForUserCompetencySummaryInCourse200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForUserCompetencySummaryInCourse200Response from a JSON string
tool_lp_data_for_user_competency_summary_in_course200_response_instance = ToolLpDataForUserCompetencySummaryInCourse200Response.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForUserCompetencySummaryInCourse200Response.to_json())

# convert the object into a dict
tool_lp_data_for_user_competency_summary_in_course200_response_dict = tool_lp_data_for_user_competency_summary_in_course200_response_instance.to_dict()
# create an instance of ToolLpDataForUserCompetencySummaryInCourse200Response from a dict
tool_lp_data_for_user_competency_summary_in_course200_response_from_dict = ToolLpDataForUserCompetencySummaryInCourse200Response.from_dict(tool_lp_data_for_user_competency_summary_in_course200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


