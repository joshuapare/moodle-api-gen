# ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assessmentid** | **int** | The id of the assessment. | [optional] [default to null]
**grade** | **float** | The grade for submission. | [optional] [default to null]
**gradinggrade** | **float** | The grade for assessment. | [optional] [default to null]
**gradinggradeover** | **float** | The aggregated grade overrided. | [optional] [default to null]
**submissionid** | **int** | The id of the submission assessed. | [optional] [default to null]
**userid** | **int** | The id of the user (0 when is configured to do not display names). | [optional] [default to null]
**weight** | **int** | The weight of the assessment for aggregation. | [optional] [default to null]

## Example

```python
from openapi_client.models.mod_workshop_get_grades_report200_response_report_grades_inner_reviewedby_inner import ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner from a JSON string
mod_workshop_get_grades_report200_response_report_grades_inner_reviewedby_inner_instance = ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner.to_json())

# convert the object into a dict
mod_workshop_get_grades_report200_response_report_grades_inner_reviewedby_inner_dict = mod_workshop_get_grades_report200_response_report_grades_inner_reviewedby_inner_instance.to_dict()
# create an instance of ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner from a dict
mod_workshop_get_grades_report200_response_report_grades_inner_reviewedby_inner_from_dict = ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner.from_dict(mod_workshop_get_grades_report200_response_report_grades_inner_reviewedby_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


