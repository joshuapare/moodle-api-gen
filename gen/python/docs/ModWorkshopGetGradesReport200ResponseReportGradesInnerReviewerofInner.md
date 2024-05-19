# ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assessmentid** | **int** | The id of the assessment. | [optional] 
**grade** | **float** | The grade for submission. | [optional] 
**gradinggrade** | **float** | The grade for assessment. | [optional] 
**gradinggradeover** | **float** | The aggregated grade overrided. | [optional] 
**submissionid** | **int** | The id of the submission assessed. | [optional] 
**userid** | **int** | The id of the user (0 when is configured to do not display names). | [optional] 
**weight** | **int** | The weight of the assessment for aggregation. | [optional] 

## Example

```python
from openapi_client.models.mod_workshop_get_grades_report200_response_report_grades_inner_reviewerof_inner import ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner from a JSON string
mod_workshop_get_grades_report200_response_report_grades_inner_reviewerof_inner_instance = ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner.to_json())

# convert the object into a dict
mod_workshop_get_grades_report200_response_report_grades_inner_reviewerof_inner_dict = mod_workshop_get_grades_report200_response_report_grades_inner_reviewerof_inner_instance.to_dict()
# create an instance of ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner from a dict
mod_workshop_get_grades_report200_response_report_grades_inner_reviewerof_inner_from_dict = ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner.from_dict(mod_workshop_get_grades_report200_response_report_grades_inner_reviewerof_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


