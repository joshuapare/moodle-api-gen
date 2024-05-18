# ReportCompetencyDataForReport200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**course** | [**CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse**](CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse.md) |  | 
**courseid** | **int** | Course id | 
**pushratingstouserplans** | **bool** | True if rating is push to user plans | [default to False]
**user** | [**CoreCompetencyGradeCompetency200ResponseActionuser**](CoreCompetencyGradeCompetency200ResponseActionuser.md) |  | 
**usercompetencies** | [**List[ReportCompetencyDataForReport200ResponseUsercompetenciesInner]**](ReportCompetencyDataForReport200ResponseUsercompetenciesInner.md) |  | 

## Example

```python
from openapi_client.models.report_competency_data_for_report200_response import ReportCompetencyDataForReport200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ReportCompetencyDataForReport200Response from a JSON string
report_competency_data_for_report200_response_instance = ReportCompetencyDataForReport200Response.from_json(json)
# print the JSON string representation of the object
print(ReportCompetencyDataForReport200Response.to_json())

# convert the object into a dict
report_competency_data_for_report200_response_dict = report_competency_data_for_report200_response_instance.to_dict()
# create an instance of ReportCompetencyDataForReport200Response from a dict
report_competency_data_for_report200_response_from_dict = ReportCompetencyDataForReport200Response.from_dict(report_competency_data_for_report200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


