# ToolLpDataForUserCompetencySummary200ResponseUsercompetency


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
**isstatusidle** | **bool** | isstatusidle | 
**isstatusinreview** | **bool** | isstatusinreview | 
**isstatuswaitingforreview** | **bool** | isstatuswaitingforreview | 
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
from openapi_client.models.tool_lp_data_for_user_competency_summary200_response_usercompetency import ToolLpDataForUserCompetencySummary200ResponseUsercompetency

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForUserCompetencySummary200ResponseUsercompetency from a JSON string
tool_lp_data_for_user_competency_summary200_response_usercompetency_instance = ToolLpDataForUserCompetencySummary200ResponseUsercompetency.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForUserCompetencySummary200ResponseUsercompetency.to_json())

# convert the object into a dict
tool_lp_data_for_user_competency_summary200_response_usercompetency_dict = tool_lp_data_for_user_competency_summary200_response_usercompetency_instance.to_dict()
# create an instance of ToolLpDataForUserCompetencySummary200ResponseUsercompetency from a dict
tool_lp_data_for_user_competency_summary200_response_usercompetency_from_dict = ToolLpDataForUserCompetencySummary200ResponseUsercompetency.from_dict(tool_lp_data_for_user_competency_summary200_response_usercompetency_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


