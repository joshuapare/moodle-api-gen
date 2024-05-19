# ToolLpDataForPlanPage200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencies** | [**List[ToolLpDataForPlanPage200ResponseCompetenciesInner]**](ToolLpDataForPlanPage200ResponseCompetenciesInner.md) |  | 
**competencycount** | **int** | Count of competencies | [default to null]
**contextid** | **int** | Context ID. | [default to null]
**plan** | [**CoreCompetencyReadPlan200Response**](CoreCompetencyReadPlan200Response.md) |  | 
**pluginbaseurl** | **str** | Plugin base URL. | [default to 'null']
**proficientcompetencycount** | **int** | Count of proficientcompetencies | [default to null]
**proficientcompetencypercentage** | **float** | Percentage of competencies proficient | [default to null]
**proficientcompetencypercentageformatted** | **str** | Displayable percentage | [default to 'null']

## Example

```python
from openapi_client.models.tool_lp_data_for_plan_page200_response import ToolLpDataForPlanPage200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForPlanPage200Response from a JSON string
tool_lp_data_for_plan_page200_response_instance = ToolLpDataForPlanPage200Response.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForPlanPage200Response.to_json())

# convert the object into a dict
tool_lp_data_for_plan_page200_response_dict = tool_lp_data_for_plan_page200_response_instance.to_dict()
# create an instance of ToolLpDataForPlanPage200Response from a dict
tool_lp_data_for_plan_page200_response_from_dict = ToolLpDataForPlanPage200Response.from_dict(tool_lp_data_for_plan_page200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


