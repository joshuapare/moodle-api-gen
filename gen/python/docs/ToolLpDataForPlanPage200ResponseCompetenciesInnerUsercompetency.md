# ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canrequestreview** | **bool** | canrequestreview | 
**canreview** | **bool** | canreview | 
**competencyid** | **int** | competencyid | 
**grade** | **int** | grade | 
**gradename** | **str** | gradename | 
**id** | **int** | id | [default to 0]
**iscancelreviewrequestallowed** | **bool** | iscancelreviewrequestallowed | 
**isrequestreviewallowed** | **bool** | isrequestreviewallowed | 
**isstartreviewallowed** | **bool** | isstartreviewallowed | 
**isstatusidle** | **bool** | isstatusidle | [default to False]
**isstatusinreview** | **bool** | isstatusinreview | [default to False]
**isstatuswaitingforreview** | **bool** | isstatuswaitingforreview | [default to False]
**isstopreviewallowed** | **bool** | isstopreviewallowed | 
**proficiency** | **bool** | proficiency | 
**proficiencyname** | **str** | proficiencyname | 
**reviewer** | [**CoreCompetencyGradeCompetency200ResponseActionuser**](CoreCompetencyGradeCompetency200ResponseActionuser.md) |  | [optional] 
**reviewerid** | **int** | reviewerid | 
**status** | **int** | status | [default to 0]
**statusname** | **str** | statusname | 
**timecreated** | **int** | timecreated | [default to 0]
**timemodified** | **int** | timemodified | [default to 0]
**url** | **str** | url | 
**userid** | **int** | userid | 
**usermodified** | **int** | usermodified | [default to 0]

## Example

```python
from openapi_client.models.tool_lp_data_for_plan_page200_response_competencies_inner_usercompetency import ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency from a JSON string
tool_lp_data_for_plan_page200_response_competencies_inner_usercompetency_instance = ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.to_json())

# convert the object into a dict
tool_lp_data_for_plan_page200_response_competencies_inner_usercompetency_dict = tool_lp_data_for_plan_page200_response_competencies_inner_usercompetency_instance.to_dict()
# create an instance of ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency from a dict
tool_lp_data_for_plan_page200_response_competencies_inner_usercompetency_from_dict = ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.from_dict(tool_lp_data_for_plan_page200_response_competencies_inner_usercompetency_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


