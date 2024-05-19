# ModWorkshopGetGradesReport200ResponseReportGradesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gradinggrade** | **float** | Computed grade for the assessment. | [optional] [default to null]
**reviewedby** | [**List[ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner]**](ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner.md) |  | [optional] 
**reviewerof** | [**List[ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner]**](ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner.md) |  | [optional] 
**submissiongrade** | **float** | Aggregated grade for the submission. | [optional] [default to null]
**submissiongradeover** | **float** | Grade for the assessment overrided                                         by the teacher. | [optional] [default to null]
**submissiongradeoverby** | **int** | The id of the user who overrided                                         the grade. | [optional] [default to null]
**submissionid** | **int** | Submission id. | [optional] [default to null]
**submissionmodified** | **int** | Timestamp submission was updated. | [optional] [default to null]
**submissionpublished** | **int** | Whether is a submission published. | [optional] [default to null]
**submissiontitle** | **str** | Submission title. | [optional] [default to 'null']
**userid** | **int** | The id of the user being displayed in the report. | [optional] [default to null]

## Example

```python
from openapi_client.models.mod_workshop_get_grades_report200_response_report_grades_inner import ModWorkshopGetGradesReport200ResponseReportGradesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetGradesReport200ResponseReportGradesInner from a JSON string
mod_workshop_get_grades_report200_response_report_grades_inner_instance = ModWorkshopGetGradesReport200ResponseReportGradesInner.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetGradesReport200ResponseReportGradesInner.to_json())

# convert the object into a dict
mod_workshop_get_grades_report200_response_report_grades_inner_dict = mod_workshop_get_grades_report200_response_report_grades_inner_instance.to_dict()
# create an instance of ModWorkshopGetGradesReport200ResponseReportGradesInner from a dict
mod_workshop_get_grades_report200_response_report_grades_inner_from_dict = ModWorkshopGetGradesReport200ResponseReportGradesInner.from_dict(mod_workshop_get_grades_report200_response_report_grades_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


