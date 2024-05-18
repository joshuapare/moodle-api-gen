# ToolLpDataForUserCompetencySummaryRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyid** | **int** | Data base record id for the competency | 
**userid** | **int** | Data base record id for the user | [default to null]

## Example

```python
from openapi_client.models.tool_lp_data_for_user_competency_summary_request import ToolLpDataForUserCompetencySummaryRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForUserCompetencySummaryRequest from a JSON string
tool_lp_data_for_user_competency_summary_request_instance = ToolLpDataForUserCompetencySummaryRequest.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForUserCompetencySummaryRequest.to_json())

# convert the object into a dict
tool_lp_data_for_user_competency_summary_request_dict = tool_lp_data_for_user_competency_summary_request_instance.to_dict()
# create an instance of ToolLpDataForUserCompetencySummaryRequest from a dict
tool_lp_data_for_user_competency_summary_request_from_dict = ToolLpDataForUserCompetencySummaryRequest.from_dict(tool_lp_data_for_user_competency_summary_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


