# ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assessmentend** | **int** | 0 &#x3D; will be closed manually, greater than 0 the timestamp of the end of the assessment phase. | [optional] [default to 0]
**assessmentstart** | **int** | 0 &#x3D; will be started manually, greater than 0 the timestamp of the start of the assessment phase. | [optional] [default to 0]
**conclusion** | **str** | A text to be displayed at the end of the workshop. | [optional] [default to 'null']
**conclusionfiles** | [**List[CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**conclusionformat** | **int** | conclusion format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**course** | **int** | Course id this workshop is part of. | [optional] [default to null]
**coursemodule** | **int** | coursemodule | [optional] 
**evaluation** | **str** | The recently used grading evaluation method. | [optional] [default to 'null']
**examplesmode** | **int** | 0 &#x3D; example assessments are voluntary, 1 &#x3D; examples must be assessed before submission,                     2 &#x3D; examples are available after own submission and must be assessed before peer/self assessment phase. | [optional] [default to 0]
**grade** | **float** | The maximum grade for submission. | [optional] [default to 80]
**gradedecimals** | **int** | Number of digits that should be shown after the decimal point when displaying grades. | [optional] [default to 0]
**gradinggrade** | **float** | The maximum grade for assessment. | [optional] [default to 20]
**id** | **int** | The primary key of the record. | [optional] 
**instructauthors** | **str** | Instructions for the submission phase. | [optional] [default to 'null']
**instructauthorsfiles** | [**List[CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**instructauthorsformat** | **int** | instructauthors format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**instructreviewers** | **str** | Instructions for the assessment phase. | [optional] [default to 'null']
**instructreviewersfiles** | [**List[CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**instructreviewersformat** | **int** | instructreviewers format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**intro** | **str** | Workshop introduction text. | [optional] [default to '']
**introfiles** | [**List[CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**lang** | **str** | Forced activity language | [optional] 
**latesubmissions** | **bool** | Allow submitting the work after the deadline. | [optional] [default to False]
**maxbytes** | **int** | Maximum size of the one attached file. | [optional] [default to 100000]
**name** | **str** | Workshop name. | [optional] [default to 'null']
**nattachments** | **int** | Maximum number of submission attachments. | [optional] [default to 1]
**overallfeedbackfiles** | **int** | Number of allowed attachments to the overall feedback. | [optional] [default to 0]
**overallfeedbackfiletypes** | **str** | Comma separated list of file extensions. | [optional] [default to 'null']
**overallfeedbackmaxbytes** | **int** | Maximum size of one file attached to the overall feedback. | [optional] [default to 100000]
**overallfeedbackmode** | **int** | Mode of the overall feedback support. | [optional] [default to 1]
**phase** | **int** | The current phase of workshop (0 &#x3D; not available, 1 &#x3D; submission, 2 &#x3D; assessment, 3 &#x3D; closed). | [optional] [default to 0]
**phaseswitchassessment** | **bool** | Automatically switch to the assessment phase after the submissions deadline. | [optional] [default to False]
**strategy** | **str** | The type of the current grading strategy used in this workshop. | [optional] [default to 'null']
**submissionend** | **int** | 0 &#x3D; will be closed manually, greater than 0 the timestamp of the end of the submission phase. | [optional] [default to 0]
**submissionfiletypes** | **str** | Comma separated list of file extensions. | [optional] 
**submissionstart** | **int** | 0 &#x3D; will be started manually, greater than 0 the timestamp of the start of the submission phase. | [optional] [default to 0]
**submissiontypefile** | **int** | Indicates whether a file upload is required as part of each submission. 0 for no, 1 for optional, 2 for required. | [optional] [default to 1]
**submissiontypetext** | **int** | Indicates whether text is required as part of each submission. 0 for no, 1 for optional, 2 for required. | [optional] [default to 1]
**timemodified** | **int** | The timestamp when the module was modified. | [optional] [default to null]
**useexamples** | **bool** | Optional feature: students practise evaluating on example submissions from teacher. | [optional] [default to False]
**usepeerassessment** | **bool** | Optional feature: students perform peer assessment of others&#39; work. | [optional] [default to False]
**useselfassessment** | **bool** | Optional feature: students perform self assessment of their own work. | [optional] [default to False]

## Example

```python
from openapi_client.models.mod_workshop_get_workshops_by_courses200_response_workshops_inner import ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner from a JSON string
mod_workshop_get_workshops_by_courses200_response_workshops_inner_instance = ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner.to_json())

# convert the object into a dict
mod_workshop_get_workshops_by_courses200_response_workshops_inner_dict = mod_workshop_get_workshops_by_courses200_response_workshops_inner_instance.to_dict()
# create an instance of ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner from a dict
mod_workshop_get_workshops_by_courses200_response_workshops_inner_from_dict = ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner.from_dict(mod_workshop_get_workshops_by_courses200_response_workshops_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


