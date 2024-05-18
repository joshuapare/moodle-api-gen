# ToolLpDataForCompetencySummaryRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyid** | **int** | The competency id | 
**includecourses** | **bool** | Include or not competency courses | [optional] [default to False]
**includerelated** | **bool** | Include or not related competencies | [optional] [default to False]

## Example

```python
from openapi_client.models.tool_lp_data_for_competency_summary_request import ToolLpDataForCompetencySummaryRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForCompetencySummaryRequest from a JSON string
tool_lp_data_for_competency_summary_request_instance = ToolLpDataForCompetencySummaryRequest.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForCompetencySummaryRequest.to_json())

# convert the object into a dict
tool_lp_data_for_competency_summary_request_dict = tool_lp_data_for_competency_summary_request_instance.to_dict()
# create an instance of ToolLpDataForCompetencySummaryRequest from a dict
tool_lp_data_for_competency_summary_request_from_dict = ToolLpDataForCompetencySummaryRequest.from_dict(tool_lp_data_for_competency_summary_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


