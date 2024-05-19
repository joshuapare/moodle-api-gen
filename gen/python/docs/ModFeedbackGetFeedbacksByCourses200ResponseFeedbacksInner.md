# ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anonymous** | **int** | Whether the feedback is anonymous. | [optional] [default to null]
**autonumbering** | **bool** | Whether questions should be auto-numbered. | [optional] [default to False]
**completionsubmit** | **bool** | If this field is set to 1, then the activity will be automatically marked as complete on submission. | [optional] [default to False]
**course** | **int** | Course id this feedback is part of. | [optional] [default to null]
**coursemodule** | **int** | coursemodule | [optional] 
**email_notification** | **bool** | Whether email notifications will be sent to teachers. | [optional] [default to False]
**id** | **int** | The primary key of the record. | [optional] [default to null]
**intro** | **str** | Feedback introduction text. | [optional] [default to '']
**introfiles** | [**List[CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**lang** | **str** | Forced activity language | [optional] 
**multiple_submit** | **bool** | Whether multiple submissions are allowed. | [optional] [default to False]
**name** | **str** | Feedback name. | [optional] [default to 'null']
**page_after_submit** | **str** | Text to display after submission. | [optional] [default to 'null']
**page_after_submitformat** | **int** | page_after_submit format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**pageaftersubmitfiles** | [**List[CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**publish_stats** | **bool** | Whether stats should be published. | [optional] [default to False]
**site_after_submit** | **str** | Link to next page after submission. | [optional] [default to 'null']
**timeclose** | **int** | Allow answers until this time. | [optional] [default to null]
**timemodified** | **int** | The time this record was modified. | [optional] [default to null]
**timeopen** | **int** | Allow answers from this time. | [optional] [default to null]

## Example

```python
from openapi_client.models.mod_feedback_get_feedbacks_by_courses200_response_feedbacks_inner import ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner from a JSON string
mod_feedback_get_feedbacks_by_courses200_response_feedbacks_inner_instance = ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.from_json(json)
# print the JSON string representation of the object
print(ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.to_json())

# convert the object into a dict
mod_feedback_get_feedbacks_by_courses200_response_feedbacks_inner_dict = mod_feedback_get_feedbacks_by_courses200_response_feedbacks_inner_instance.to_dict()
# create an instance of ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner from a dict
mod_feedback_get_feedbacks_by_courses200_response_feedbacks_inner_from_dict = ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.from_dict(mod_feedback_get_feedbacks_by_courses200_response_feedbacks_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


