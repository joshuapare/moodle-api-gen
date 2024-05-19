# ToolLpDataForCompetencySummary200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competency** | [**CoreCompetencyCreateCompetency200Response**](CoreCompetencyCreateCompetency200Response.md) |  | 
**comppath** | [**ToolLpDataForCompetencySummary200ResponseComppath**](ToolLpDataForCompetencySummary200ResponseComppath.md) |  | 
**framework** | [**CoreCompetencyDuplicateCompetencyFramework200Response**](CoreCompetencyDuplicateCompetencyFramework200Response.md) |  | 
**hascourses** | **bool** | hascourses | 
**hasrelatedcompetencies** | **bool** | hasrelatedcompetencies | 
**linkedcourses** | [**List[CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner]**](CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner.md) |  | 
**pluginbaseurl** | **str** | pluginbaseurl | 
**relatedcompetencies** | [**List[CoreCompetencyReadUserEvidence200ResponseCompetenciesInner]**](CoreCompetencyReadUserEvidence200ResponseCompetenciesInner.md) |  | 
**scaleconfiguration** | **str** | scaleconfiguration | 
**scaleid** | **int** | scaleid | 
**taxonomyterm** | **str** | taxonomyterm | 

## Example

```python
from openapi_client.models.tool_lp_data_for_competency_summary200_response import ToolLpDataForCompetencySummary200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForCompetencySummary200Response from a JSON string
tool_lp_data_for_competency_summary200_response_instance = ToolLpDataForCompetencySummary200Response.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForCompetencySummary200Response.to_json())

# convert the object into a dict
tool_lp_data_for_competency_summary200_response_dict = tool_lp_data_for_competency_summary200_response_instance.to_dict()
# create an instance of ToolLpDataForCompetencySummary200Response from a dict
tool_lp_data_for_competency_summary200_response_from_dict = ToolLpDataForCompetencySummary200Response.from_dict(tool_lp_data_for_competency_summary200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


