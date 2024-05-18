# ToolLpDataForCourseCompetenciesPage200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canconfigurecoursecompetencies** | **bool** | User can configure course competency settings | [default to False]
**cangradecompetencies** | **bool** | User can grade competencies. | [default to False]
**canmanagecompetencyframeworks** | **bool** | User can manage competency frameworks | [default to False]
**canmanagecoursecompetencies** | **bool** | User can manage linked course competencies | [default to False]
**competencies** | [**List[ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner]**](ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner.md) |  | 
**courseid** | **int** | The current course id | [default to null]
**gradableuserid** | **int** | Current user id, if the user is a gradable user. | [optional] [default to null]
**manageurl** | **str** | Url to the manage competencies page. | [default to 'null']
**pagecontextid** | **int** | The current page context ID. | [default to null]
**pluginbaseurl** | **str** | Url to the course competencies page. | [default to 'null']
**settings** | [**ToolLpDataForCourseCompetenciesPage200ResponseSettings**](ToolLpDataForCourseCompetenciesPage200ResponseSettings.md) |  | 
**statistics** | [**ToolLpDataForCourseCompetenciesPage200ResponseStatistics**](ToolLpDataForCourseCompetenciesPage200ResponseStatistics.md) |  | 

## Example

```python
from openapi_client.models.tool_lp_data_for_course_competencies_page200_response import ToolLpDataForCourseCompetenciesPage200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForCourseCompetenciesPage200Response from a JSON string
tool_lp_data_for_course_competencies_page200_response_instance = ToolLpDataForCourseCompetenciesPage200Response.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForCourseCompetenciesPage200Response.to_json())

# convert the object into a dict
tool_lp_data_for_course_competencies_page200_response_dict = tool_lp_data_for_course_competencies_page200_response_instance.to_dict()
# create an instance of ToolLpDataForCourseCompetenciesPage200Response from a dict
tool_lp_data_for_course_competencies_page200_response_from_dict = ToolLpDataForCourseCompetenciesPage200Response.from_dict(tool_lp_data_for_course_competencies_page200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


