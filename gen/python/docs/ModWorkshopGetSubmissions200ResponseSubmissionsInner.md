# ModWorkshopGetSubmissions200ResponseSubmissionsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachment** | **int** | Used by File API file_postupdate_standard_filemanager. | [optional] [default to 0]
**attachmentfiles** | [**List[CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**authorid** | **int** | The author of the submission. | [optional] 
**content** | **str** | Submission text. | [optional] 
**contentfiles** | [**List[CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**contentformat** | **int** | content format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**contenttrust** | **int** | The trust mode of the data. | [optional] [default to 0]
**example** | **bool** | Is this submission an example from teacher. | [optional] [default to False]
**feedbackauthor** | **str** | Teacher comment/feedback for the author of the submission, for example describing the reasons                     for the grade overriding. | [optional] 
**feedbackauthorformat** | **int** | feedbackauthor format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**grade** | **float** | Aggregated grade for the submission. The grade is a decimal number from interval 0..100.                     If NULL then the grade for submission has not been aggregated yet. | [optional] 
**gradeover** | **float** | Grade for the submission manually overridden by a teacher. Grade is always from interval 0..100.                     If NULL then the grade is not overriden. | [optional] 
**gradeoverby** | **int** | The id of the user who has overridden the grade for submission. | [optional] 
**id** | **int** | The primary key of the record. | [optional] 
**late** | **int** | Has this submission been submitted after the deadline or during the assessment phase? | [optional] [default to 0]
**published** | **bool** | Shall the submission be available to other when the workshop is closed. | [optional] [default to False]
**timecreated** | **int** | Timestamp when the work was submitted for the first time. | [optional] 
**timegraded** | **int** | The timestamp when grade or gradeover was recently modified. | [optional] 
**timemodified** | **int** | Timestamp when the submission has been updated. | [optional] 
**title** | **str** | The submission title. | [optional] 
**workshopid** | **int** | The id of the workshop instance. | [optional] 

## Example

```python
from openapi_client.models.mod_workshop_get_submissions200_response_submissions_inner import ModWorkshopGetSubmissions200ResponseSubmissionsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetSubmissions200ResponseSubmissionsInner from a JSON string
mod_workshop_get_submissions200_response_submissions_inner_instance = ModWorkshopGetSubmissions200ResponseSubmissionsInner.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetSubmissions200ResponseSubmissionsInner.to_json())

# convert the object into a dict
mod_workshop_get_submissions200_response_submissions_inner_dict = mod_workshop_get_submissions200_response_submissions_inner_instance.to_dict()
# create an instance of ModWorkshopGetSubmissions200ResponseSubmissionsInner from a dict
mod_workshop_get_submissions200_response_submissions_inner_from_dict = ModWorkshopGetSubmissions200ResponseSubmissionsInner.from_dict(mod_workshop_get_submissions200_response_submissions_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


