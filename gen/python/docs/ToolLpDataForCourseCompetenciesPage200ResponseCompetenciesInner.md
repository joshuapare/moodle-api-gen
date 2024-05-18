# ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competency** | [**CoreCompetencyCreateCompetency200Response**](CoreCompetencyCreateCompetency200Response.md) |  | [optional] 
**comppath** | [**ToolLpDataForCompetencySummary200ResponseComppath**](ToolLpDataForCompetencySummary200ResponseComppath.md) |  | [optional] 
**coursecompetency** | [**ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursecompetency**](ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursecompetency.md) |  | [optional] 
**coursemodules** | [**List[ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner]**](ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner.md) |  | [optional] 
**plans** | [**List[ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner]**](ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner.md) |  | [optional] 
**ruleoutcomeoptions** | [**List[ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerRuleoutcomeoptionsInner]**](ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerRuleoutcomeoptionsInner.md) |  | [optional] 
**usercompetencycourse** | [**ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse**](ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse.md) |  | [optional] 

## Example

```python
from openapi_client.models.tool_lp_data_for_course_competencies_page200_response_competencies_inner import ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner from a JSON string
tool_lp_data_for_course_competencies_page200_response_competencies_inner_instance = ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner.to_json())

# convert the object into a dict
tool_lp_data_for_course_competencies_page200_response_competencies_inner_dict = tool_lp_data_for_course_competencies_page200_response_competencies_inner_instance.to_dict()
# create an instance of ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner from a dict
tool_lp_data_for_course_competencies_page200_response_competencies_inner_from_dict = ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner.from_dict(tool_lp_data_for_course_competencies_page200_response_competencies_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


