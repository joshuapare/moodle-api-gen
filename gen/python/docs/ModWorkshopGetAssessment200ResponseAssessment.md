# ModWorkshopGetAssessment200ResponseAssessment


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feedbackattachmentfiles** | [**List[CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | 
**feedbackauthor** | **str** | The comment/feedback from the reviewer for the author. | [default to 'null']
**feedbackauthorattachment** | **int** | Are there some files attached to the feedbackauthor field?                     Sets to 1 by file_postupdate_standard_filemanager(). | [default to 0]
**feedbackauthorformat** | **int** | feedbackauthor format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**feedbackcontentfiles** | [**List[CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | 
**feedbackreviewer** | **str** | The comment/feedback from the teacher for the reviewer.                     For example the reason why the grade for assessment was overridden | [optional] [default to 'null']
**feedbackreviewerformat** | **int** | feedbackreviewer format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**grade** | **float** | The aggregated grade for submission suggested by the reviewer.                     The grade 0..100 is computed from the values assigned to the assessment dimensions fields. If NULL then it has not been aggregated yet. | [default to null]
**gradinggrade** | **float** | The computed grade 0..100 for this assessment. If NULL then it has not been computed yet. | [default to null]
**gradinggradeover** | **float** | Grade for the assessment manually overridden by a teacher.                     Grade is always from interval 0..100. If NULL then the grade is not overriden. | [default to null]
**gradinggradeoverby** | **int** | The id of the user who has overridden the grade for submission. | [default to null]
**id** | **int** | The primary key of the record. | 
**reviewerid** | **int** | The id of the reviewer who makes this assessment | [default to null]
**submissionid** | **int** | The id of the assessed submission | [default to null]
**timecreated** | **int** | If 0 then the assessment was allocated but the reviewer has not assessed yet.                     If greater than 0 then the timestamp of when the reviewer assessed for the first time | [default to 0]
**timemodified** | **int** | If 0 then the assessment was allocated but the reviewer has not assessed yet.                     If greater than 0 then the timestamp of when the reviewer assessed for the last time | [default to 0]
**weight** | **int** | The weight of the assessment for the purposes of aggregation | [default to 1]

## Example

```python
from openapi_client.models.mod_workshop_get_assessment200_response_assessment import ModWorkshopGetAssessment200ResponseAssessment

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetAssessment200ResponseAssessment from a JSON string
mod_workshop_get_assessment200_response_assessment_instance = ModWorkshopGetAssessment200ResponseAssessment.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetAssessment200ResponseAssessment.to_json())

# convert the object into a dict
mod_workshop_get_assessment200_response_assessment_dict = mod_workshop_get_assessment200_response_assessment_instance.to_dict()
# create an instance of ModWorkshopGetAssessment200ResponseAssessment from a dict
mod_workshop_get_assessment200_response_assessment_from_dict = ModWorkshopGetAssessment200ResponseAssessment.from_dict(mod_workshop_get_assessment200_response_assessment_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


