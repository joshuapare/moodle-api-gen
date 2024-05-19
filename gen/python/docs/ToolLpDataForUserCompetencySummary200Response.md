# ToolLpDataForUserCompetencySummary200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cangrade** | **bool** | cangrade | [default to False]
**commentarea** | [**CoreCompetencyReadPlan200ResponseCommentarea**](CoreCompetencyReadPlan200ResponseCommentarea.md) |  | [optional] 
**competency** | [**ToolLpDataForCompetencySummary200Response**](ToolLpDataForCompetencySummary200Response.md) |  | 
**evidence** | [**List[ToolLpDataForUserCompetencySummary200ResponseEvidenceInner]**](ToolLpDataForUserCompetencySummary200ResponseEvidenceInner.md) |  | 
**showrelatedcompetencies** | **bool** | showrelatedcompetencies | [default to False]
**user** | [**CoreCompetencyGradeCompetency200ResponseActionuser**](CoreCompetencyGradeCompetency200ResponseActionuser.md) |  | 
**usercompetency** | [**ToolLpDataForUserCompetencySummary200ResponseUsercompetency**](ToolLpDataForUserCompetencySummary200ResponseUsercompetency.md) |  | [optional] 
**usercompetencycourse** | [**ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse**](ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse.md) |  | [optional] 
**usercompetencyplan** | [**ToolLpDataForUserCompetencySummary200ResponseUsercompetencyplan**](ToolLpDataForUserCompetencySummary200ResponseUsercompetencyplan.md) |  | [optional] 

## Example

```python
from openapi_client.models.tool_lp_data_for_user_competency_summary200_response import ToolLpDataForUserCompetencySummary200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForUserCompetencySummary200Response from a JSON string
tool_lp_data_for_user_competency_summary200_response_instance = ToolLpDataForUserCompetencySummary200Response.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForUserCompetencySummary200Response.to_json())

# convert the object into a dict
tool_lp_data_for_user_competency_summary200_response_dict = tool_lp_data_for_user_competency_summary200_response_instance.to_dict()
# create an instance of ToolLpDataForUserCompetencySummary200Response from a dict
tool_lp_data_for_user_competency_summary200_response_from_dict = ToolLpDataForUserCompetencySummary200Response.from_dict(tool_lp_data_for_user_competency_summary200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


