# ToolLpDataForCourseCompetenciesPageRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | The course id | 
**moduleid** | **int** | The module id | [optional] [default to 0]

## Example

```python
from openapi_client.models.tool_lp_data_for_course_competencies_page_request import ToolLpDataForCourseCompetenciesPageRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForCourseCompetenciesPageRequest from a JSON string
tool_lp_data_for_course_competencies_page_request_instance = ToolLpDataForCourseCompetenciesPageRequest.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForCourseCompetenciesPageRequest.to_json())

# convert the object into a dict
tool_lp_data_for_course_competencies_page_request_dict = tool_lp_data_for_course_competencies_page_request_instance.to_dict()
# create an instance of ToolLpDataForCourseCompetenciesPageRequest from a dict
tool_lp_data_for_course_competencies_page_request_from_dict = ToolLpDataForCourseCompetenciesPageRequest.from_dict(tool_lp_data_for_course_competencies_page_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


