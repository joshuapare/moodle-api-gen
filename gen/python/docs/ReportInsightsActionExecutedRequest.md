# ReportInsightsActionExecutedRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionname** | **str** | The name of the action | [default to 'null']
**predictionids** | **List[object]** |  | 

## Example

```python
from openapi_client.models.report_insights_action_executed_request import ReportInsightsActionExecutedRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ReportInsightsActionExecutedRequest from a JSON string
report_insights_action_executed_request_instance = ReportInsightsActionExecutedRequest.from_json(json)
# print the JSON string representation of the object
print(ReportInsightsActionExecutedRequest.to_json())

# convert the object into a dict
report_insights_action_executed_request_dict = report_insights_action_executed_request_instance.to_dict()
# create an instance of ReportInsightsActionExecutedRequest from a dict
report_insights_action_executed_request_from_dict = ReportInsightsActionExecutedRequest.from_dict(report_insights_action_executed_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


