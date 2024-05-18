# ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cangrade** | **bool** | cangrade | 
**commentarea** | [**CoreCompetencyReadPlan200ResponseCommentarea**](CoreCompetencyReadPlan200ResponseCommentarea.md) |  | [optional] 
**competency** | [**ToolLpDataForCompetencySummary200Response**](ToolLpDataForCompetencySummary200Response.md) |  | 
**evidence** | [**List[ToolLpDataForUserCompetencySummary200ResponseEvidenceInner]**](ToolLpDataForUserCompetencySummary200ResponseEvidenceInner.md) |  | 
**showrelatedcompetencies** | **bool** | showrelatedcompetencies | 
**user** | [**CoreCompetencyGradeCompetency200ResponseActionuser**](CoreCompetencyGradeCompetency200ResponseActionuser.md) |  | 
**usercompetency** | [**ToolLpDataForUserCompetencySummary200ResponseUsercompetency**](ToolLpDataForUserCompetencySummary200ResponseUsercompetency.md) |  | [optional] 
**usercompetencycourse** | [**ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse**](ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse.md) |  | [optional] 
**usercompetencyplan** | [**ToolLpDataForUserCompetencySummary200ResponseUsercompetencyplan**](ToolLpDataForUserCompetencySummary200ResponseUsercompetencyplan.md) |  | [optional] 

## Example

```python
from openapi_client.models.tool_lp_data_for_user_competency_summary_in_course200_response_usercompetencysummary import ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary from a JSON string
tool_lp_data_for_user_competency_summary_in_course200_response_usercompetencysummary_instance = ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary.to_json())

# convert the object into a dict
tool_lp_data_for_user_competency_summary_in_course200_response_usercompetencysummary_dict = tool_lp_data_for_user_competency_summary_in_course200_response_usercompetencysummary_instance.to_dict()
# create an instance of ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary from a dict
tool_lp_data_for_user_competency_summary_in_course200_response_usercompetencysummary_from_dict = ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary.from_dict(tool_lp_data_for_user_competency_summary_in_course200_response_usercompetencysummary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


