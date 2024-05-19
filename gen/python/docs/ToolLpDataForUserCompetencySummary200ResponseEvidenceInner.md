# ToolLpDataForUserCompetencySummary200ResponseEvidenceInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **int** | action | [optional] 
**actionuser** | [**CoreCompetencyGradeCompetency200ResponseActionuser**](CoreCompetencyGradeCompetency200ResponseActionuser.md) |  | [optional] 
**actionuserid** | **int** | actionuserid | [optional] 
**candelete** | **bool** | candelete | [optional] 
**contextid** | **int** | contextid | [optional] 
**desca** | **str** | desca | [optional] 
**desccomponent** | **str** | desccomponent | [optional] 
**descidentifier** | **str** | descidentifier | [optional] 
**description** | **str** | description | [optional] 
**grade** | **int** | grade | [optional] 
**gradename** | **str** | gradename | [optional] 
**id** | **int** | id | [optional] [default to 0]
**note** | **str** | note | [optional] 
**timecreated** | **int** | timecreated | [optional] [default to 0]
**timemodified** | **int** | timemodified | [optional] [default to 0]
**url** | **str** | url | [optional] 
**usercompetencyid** | **int** | usercompetencyid | [optional] 
**userdate** | **str** | userdate | [optional] 
**usermodified** | **int** | usermodified | [optional] [default to 0]

## Example

```python
from openapi_client.models.tool_lp_data_for_user_competency_summary200_response_evidence_inner import ToolLpDataForUserCompetencySummary200ResponseEvidenceInner

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForUserCompetencySummary200ResponseEvidenceInner from a JSON string
tool_lp_data_for_user_competency_summary200_response_evidence_inner_instance = ToolLpDataForUserCompetencySummary200ResponseEvidenceInner.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForUserCompetencySummary200ResponseEvidenceInner.to_json())

# convert the object into a dict
tool_lp_data_for_user_competency_summary200_response_evidence_inner_dict = tool_lp_data_for_user_competency_summary200_response_evidence_inner_instance.to_dict()
# create an instance of ToolLpDataForUserCompetencySummary200ResponseEvidenceInner from a dict
tool_lp_data_for_user_competency_summary200_response_evidence_inner_from_dict = ToolLpDataForUserCompetencySummary200ResponseEvidenceInner.from_dict(tool_lp_data_for_user_competency_summary200_response_evidence_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


