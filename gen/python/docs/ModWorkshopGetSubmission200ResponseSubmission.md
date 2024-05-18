# ModWorkshopGetSubmission200ResponseSubmission


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachment** | **int** | Used by File API file_postupdate_standard_filemanager. | [default to 0]
**attachmentfiles** | [**List[CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**authorid** | **int** | The author of the submission. | [default to null]
**content** | **str** | Submission text. | [default to 'null']
**contentfiles** | [**List[CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**contentformat** | **int** | content format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**contenttrust** | **int** | The trust mode of the data. | [default to 0]
**example** | **bool** | Is this submission an example from teacher. | [default to False]
**feedbackauthor** | **str** | Teacher comment/feedback for the author of the submission, for example describing the reasons                     for the grade overriding. | [optional] [default to 'null']
**feedbackauthorformat** | **int** | feedbackauthor format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**grade** | **float** | Aggregated grade for the submission. The grade is a decimal number from interval 0..100.                     If NULL then the grade for submission has not been aggregated yet. | [optional] [default to null]
**gradeover** | **float** | Grade for the submission manually overridden by a teacher. Grade is always from interval 0..100.                     If NULL then the grade is not overriden. | [optional] [default to null]
**gradeoverby** | **int** | The id of the user who has overridden the grade for submission. | [optional] 
**id** | **int** | The primary key of the record. | 
**late** | **int** | Has this submission been submitted after the deadline or during the assessment phase? | [default to 0]
**published** | **bool** | Shall the submission be available to other when the workshop is closed. | [default to False]
**timecreated** | **int** | Timestamp when the work was submitted for the first time. | [default to null]
**timegraded** | **int** | The timestamp when grade or gradeover was recently modified. | [optional] [default to null]
**timemodified** | **int** | Timestamp when the submission has been updated. | [default to null]
**title** | **str** | The submission title. | [default to 'null']
**workshopid** | **int** | The id of the workshop instance. | [default to null]

## Example

```python
from openapi_client.models.mod_workshop_get_submission200_response_submission import ModWorkshopGetSubmission200ResponseSubmission

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetSubmission200ResponseSubmission from a JSON string
mod_workshop_get_submission200_response_submission_instance = ModWorkshopGetSubmission200ResponseSubmission.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetSubmission200ResponseSubmission.to_json())

# convert the object into a dict
mod_workshop_get_submission200_response_submission_dict = mod_workshop_get_submission200_response_submission_instance.to_dict()
# create an instance of ModWorkshopGetSubmission200ResponseSubmission from a dict
mod_workshop_get_submission200_response_submission_from_dict = ModWorkshopGetSubmission200ResponseSubmission.from_dict(mod_workshop_get_submission200_response_submission_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


