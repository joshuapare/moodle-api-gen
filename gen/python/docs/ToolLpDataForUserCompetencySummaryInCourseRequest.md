# ToolLpDataForUserCompetencySummaryInCourseRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyid** | **int** | Data base record id for the competency | 
**courseid** | **int** | Data base record id for the course | [default to null]
**userid** | **int** | Data base record id for the user | 

## Example

```python
from openapi_client.models.tool_lp_data_for_user_competency_summary_in_course_request import ToolLpDataForUserCompetencySummaryInCourseRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForUserCompetencySummaryInCourseRequest from a JSON string
tool_lp_data_for_user_competency_summary_in_course_request_instance = ToolLpDataForUserCompetencySummaryInCourseRequest.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForUserCompetencySummaryInCourseRequest.to_json())

# convert the object into a dict
tool_lp_data_for_user_competency_summary_in_course_request_dict = tool_lp_data_for_user_competency_summary_in_course_request_instance.to_dict()
# create an instance of ToolLpDataForUserCompetencySummaryInCourseRequest from a dict
tool_lp_data_for_user_competency_summary_in_course_request_from_dict = ToolLpDataForUserCompetencySummaryInCourseRequest.from_dict(tool_lp_data_for_user_competency_summary_in_course_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


