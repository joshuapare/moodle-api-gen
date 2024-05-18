# ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feedbackattachmentfiles** | [**List[CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**feedbackauthor** | **str** | The comment/feedback from the reviewer for the author. | [optional] 
**feedbackauthorattachment** | **int** | Are there some files attached to the feedbackauthor field?                     Sets to 1 by file_postupdate_standard_filemanager(). | [optional] [default to 0]
**feedbackauthorformat** | **int** | feedbackauthor format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**feedbackcontentfiles** | [**List[CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**feedbackreviewer** | **str** | The comment/feedback from the teacher for the reviewer.                     For example the reason why the grade for assessment was overridden | [optional] 
**feedbackreviewerformat** | **int** | feedbackreviewer format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**grade** | **float** | The aggregated grade for submission suggested by the reviewer.                     The grade 0..100 is computed from the values assigned to the assessment dimensions fields. If NULL then it has not been aggregated yet. | [optional] 
**gradinggrade** | **float** | The computed grade 0..100 for this assessment. If NULL then it has not been computed yet. | [optional] 
**gradinggradeover** | **float** | Grade for the assessment manually overridden by a teacher.                     Grade is always from interval 0..100. If NULL then the grade is not overriden. | [optional] 
**gradinggradeoverby** | **int** | The id of the user who has overridden the grade for submission. | [optional] 
**id** | **int** | The primary key of the record. | [optional] 
**reviewerid** | **int** | The id of the reviewer who makes this assessment | [optional] 
**submissionid** | **int** | The id of the assessed submission | [optional] 
**timecreated** | **int** | If 0 then the assessment was allocated but the reviewer has not assessed yet.                     If greater than 0 then the timestamp of when the reviewer assessed for the first time | [optional] [default to 0]
**timemodified** | **int** | If 0 then the assessment was allocated but the reviewer has not assessed yet.                     If greater than 0 then the timestamp of when the reviewer assessed for the last time | [optional] [default to 0]
**weight** | **int** | The weight of the assessment for the purposes of aggregation | [optional] [default to 1]

## Example

```python
from openapi_client.models.mod_workshop_get_reviewer_assessments200_response_assessments_inner import ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner from a JSON string
mod_workshop_get_reviewer_assessments200_response_assessments_inner_instance = ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner.to_json())

# convert the object into a dict
mod_workshop_get_reviewer_assessments200_response_assessments_inner_dict = mod_workshop_get_reviewer_assessments200_response_assessments_inner_instance.to_dict()
# create an instance of ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner from a dict
mod_workshop_get_reviewer_assessments200_response_assessments_inner_from_dict = ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner.from_dict(mod_workshop_get_reviewer_assessments200_response_assessments_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

