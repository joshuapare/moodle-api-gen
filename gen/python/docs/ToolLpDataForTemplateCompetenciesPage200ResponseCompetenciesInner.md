# ToolLpDataForTemplateCompetenciesPage200ResponseCompetenciesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competency** | [**CoreCompetencyCreateCompetency200Response**](CoreCompetencyCreateCompetency200Response.md) |  | [optional] 
**comppath** | [**ToolLpDataForCompetencySummary200ResponseComppath**](ToolLpDataForCompetencySummary200ResponseComppath.md) |  | [optional] 
**framework** | [**CoreCompetencyDuplicateCompetencyFramework200Response**](CoreCompetencyDuplicateCompetencyFramework200Response.md) |  | [optional] 
**hascourses** | **bool** | hascourses | [optional] 
**hasrelatedcompetencies** | **bool** | hasrelatedcompetencies | [optional] 
**linkedcourses** | [**List[CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner]**](CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner.md) |  | [optional] 
**pluginbaseurl** | **str** | pluginbaseurl | [optional] 
**relatedcompetencies** | [**List[CoreCompetencyReadUserEvidence200ResponseCompetenciesInner]**](CoreCompetencyReadUserEvidence200ResponseCompetenciesInner.md) |  | [optional] 
**scaleconfiguration** | **str** | scaleconfiguration | [optional] 
**scaleid** | **int** | scaleid | [optional] 
**taxonomyterm** | **str** | taxonomyterm | [optional] 

## Example

```python
from openapi_client.models.tool_lp_data_for_template_competencies_page200_response_competencies_inner import ToolLpDataForTemplateCompetenciesPage200ResponseCompetenciesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForTemplateCompetenciesPage200ResponseCompetenciesInner from a JSON string
tool_lp_data_for_template_competencies_page200_response_competencies_inner_instance = ToolLpDataForTemplateCompetenciesPage200ResponseCompetenciesInner.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForTemplateCompetenciesPage200ResponseCompetenciesInner.to_json())

# convert the object into a dict
tool_lp_data_for_template_competencies_page200_response_competencies_inner_dict = tool_lp_data_for_template_competencies_page200_response_competencies_inner_instance.to_dict()
# create an instance of ToolLpDataForTemplateCompetenciesPage200ResponseCompetenciesInner from a dict
tool_lp_data_for_template_competencies_page200_response_competencies_inner_from_dict = ToolLpDataForTemplateCompetenciesPage200ResponseCompetenciesInner.from_dict(tool_lp_data_for_template_competencies_page200_response_competencies_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


