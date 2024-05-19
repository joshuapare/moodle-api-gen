# ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyid** | **int** | competencyid | 
**courseid** | **int** | courseid | 
**grade** | **int** | grade | 
**gradename** | **str** | gradename | 
**id** | **int** | id | [default to 0]
**proficiency** | **bool** | proficiency | [default to False]
**proficiencyname** | **str** | proficiencyname | [default to 'null']
**timecreated** | **int** | timecreated | [default to 0]
**timemodified** | **int** | timemodified | [default to 0]
**userid** | **int** | userid | 
**usermodified** | **int** | usermodified | [default to 0]

## Example

```python
from openapi_client.models.report_competency_data_for_report200_response_usercompetencies_inner_usercompetencycourse import ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse

# TODO update the JSON string below
json = "{}"
# create an instance of ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse from a JSON string
report_competency_data_for_report200_response_usercompetencies_inner_usercompetencycourse_instance = ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse.from_json(json)
# print the JSON string representation of the object
print(ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse.to_json())

# convert the object into a dict
report_competency_data_for_report200_response_usercompetencies_inner_usercompetencycourse_dict = report_competency_data_for_report200_response_usercompetencies_inner_usercompetencycourse_instance.to_dict()
# create an instance of ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse from a dict
report_competency_data_for_report200_response_usercompetencies_inner_usercompetencycourse_from_dict = ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse.from_dict(report_competency_data_for_report200_response_usercompetencies_inner_usercompetencycourse_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


