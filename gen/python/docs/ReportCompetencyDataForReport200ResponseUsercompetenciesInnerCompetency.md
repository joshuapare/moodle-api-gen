# ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competency** | [**CoreCompetencyCreateCompetency200Response**](CoreCompetencyCreateCompetency200Response.md) |  | 
**comppath** | [**ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath**](ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath.md) |  | 
**framework** | [**CoreCompetencyDuplicateCompetencyFramework200Response**](CoreCompetencyDuplicateCompetencyFramework200Response.md) |  | 
**hascourses** | **bool** | hascourses | [default to False]
**hasrelatedcompetencies** | **bool** | hasrelatedcompetencies | [default to False]
**linkedcourses** | [**List[CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner]**](CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner.md) |  | 
**pluginbaseurl** | **str** | pluginbaseurl | 
**relatedcompetencies** | [**List[CoreCompetencyReadUserEvidence200ResponseCompetenciesInner]**](CoreCompetencyReadUserEvidence200ResponseCompetenciesInner.md) |  | 
**scaleconfiguration** | **str** | scaleconfiguration | 
**scaleid** | **int** | scaleid | 
**taxonomyterm** | **str** | taxonomyterm | [default to 'null']

## Example

```python
from openapi_client.models.report_competency_data_for_report200_response_usercompetencies_inner_competency import ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency

# TODO update the JSON string below
json = "{}"
# create an instance of ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency from a JSON string
report_competency_data_for_report200_response_usercompetencies_inner_competency_instance = ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency.from_json(json)
# print the JSON string representation of the object
print(ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency.to_json())

# convert the object into a dict
report_competency_data_for_report200_response_usercompetencies_inner_competency_dict = report_competency_data_for_report200_response_usercompetencies_inner_competency_instance.to_dict()
# create an instance of ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency from a dict
report_competency_data_for_report200_response_usercompetencies_inner_competency_from_dict = ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency.from_dict(report_competency_data_for_report200_response_usercompetencies_inner_competency_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


