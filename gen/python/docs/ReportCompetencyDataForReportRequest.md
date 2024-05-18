# ReportCompetencyDataForReportRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | The course id | 
**moduleid** | **int** | The module id | [default to null]
**userid** | **int** | The user id | 

## Example

```python
from openapi_client.models.report_competency_data_for_report_request import ReportCompetencyDataForReportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ReportCompetencyDataForReportRequest from a JSON string
report_competency_data_for_report_request_instance = ReportCompetencyDataForReportRequest.from_json(json)
# print the JSON string representation of the object
print(ReportCompetencyDataForReportRequest.to_json())

# convert the object into a dict
report_competency_data_for_report_request_dict = report_competency_data_for_report_request_instance.to_dict()
# create an instance of ReportCompetencyDataForReportRequest from a dict
report_competency_data_for_report_request_from_dict = ReportCompetencyDataForReportRequest.from_dict(report_competency_data_for_report_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


