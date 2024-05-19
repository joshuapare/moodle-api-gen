# ToolLpDataForPlanPage200ResponseCompetenciesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competency** | [**CoreCompetencyCreateCompetency200Response**](CoreCompetencyCreateCompetency200Response.md) |  | [optional] 
**comppath** | [**ToolLpDataForCompetencySummary200ResponseComppath**](ToolLpDataForCompetencySummary200ResponseComppath.md) |  | [optional] 
**usercompetency** | [**ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency**](ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.md) |  | [optional] 
**usercompetencyplan** | [**ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan**](ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan.md) |  | [optional] 

## Example

```python
from openapi_client.models.tool_lp_data_for_plan_page200_response_competencies_inner import ToolLpDataForPlanPage200ResponseCompetenciesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForPlanPage200ResponseCompetenciesInner from a JSON string
tool_lp_data_for_plan_page200_response_competencies_inner_instance = ToolLpDataForPlanPage200ResponseCompetenciesInner.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForPlanPage200ResponseCompetenciesInner.to_json())

# convert the object into a dict
tool_lp_data_for_plan_page200_response_competencies_inner_dict = tool_lp_data_for_plan_page200_response_competencies_inner_instance.to_dict()
# create an instance of ToolLpDataForPlanPage200ResponseCompetenciesInner from a dict
tool_lp_data_for_plan_page200_response_competencies_inner_from_dict = ToolLpDataForPlanPage200ResponseCompetenciesInner.from_dict(tool_lp_data_for_plan_page200_response_competencies_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


