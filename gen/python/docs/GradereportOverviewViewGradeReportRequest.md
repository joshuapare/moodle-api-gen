# GradereportOverviewViewGradeReportRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | id of the course | 
**userid** | **int** | id of the user, 0 means current user | [optional] [default to 0]

## Example

```python
from openapi_client.models.gradereport_overview_view_grade_report_request import GradereportOverviewViewGradeReportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GradereportOverviewViewGradeReportRequest from a JSON string
gradereport_overview_view_grade_report_request_instance = GradereportOverviewViewGradeReportRequest.from_json(json)
# print the JSON string representation of the object
print(GradereportOverviewViewGradeReportRequest.to_json())

# convert the object into a dict
gradereport_overview_view_grade_report_request_dict = gradereport_overview_view_grade_report_request_instance.to_dict()
# create an instance of GradereportOverviewViewGradeReportRequest from a dict
gradereport_overview_view_grade_report_request_from_dict = GradereportOverviewViewGradeReportRequest.from_dict(gradereport_overview_view_grade_report_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


