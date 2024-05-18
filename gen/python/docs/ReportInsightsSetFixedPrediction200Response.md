# ReportInsightsSetFixedPrediction200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**success** | **bool** | True if the prediction was successfully flagged as fixed. | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.report_insights_set_fixed_prediction200_response import ReportInsightsSetFixedPrediction200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ReportInsightsSetFixedPrediction200Response from a JSON string
report_insights_set_fixed_prediction200_response_instance = ReportInsightsSetFixedPrediction200Response.from_json(json)
# print the JSON string representation of the object
print(ReportInsightsSetFixedPrediction200Response.to_json())

# convert the object into a dict
report_insights_set_fixed_prediction200_response_dict = report_insights_set_fixed_prediction200_response_instance.to_dict()
# create an instance of ReportInsightsSetFixedPrediction200Response from a dict
report_insights_set_fixed_prediction200_response_from_dict = ReportInsightsSetFixedPrediction200Response.from_dict(report_insights_set_fixed_prediction200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


