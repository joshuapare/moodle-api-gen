# ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anonymous** | Option<**i32**> | Whether the feedback is anonymous. | [optional][default to null]
**autonumbering** | Option<**bool**> | Whether questions should be auto-numbered. | [optional][default to 1]
**completionsubmit** | Option<**bool**> | If this field is set to 1, then the activity will be automatically marked as complete on submission. | [optional][default to 0]
**course** | Option<**i32**> | Course id this feedback is part of. | [optional][default to null]
**coursemodule** | Option<**i32**> | coursemodule | [optional]
**email_notification** | Option<**bool**> | Whether email notifications will be sent to teachers. | [optional][default to null]
**id** | Option<**i32**> | The primary key of the record. | [optional][default to null]
**intro** | Option<**String**> | Feedback introduction text. | [optional][default to ]
**introfiles** | Option<[**Vec<models::CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>**](core_blog_get_entries_200_response_entries_inner_summaryfiles_inner.md)> |  | [optional]
**introformat** | Option<**i32**> | intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to 0]
**lang** | Option<**String**> | Forced activity language | [optional]
**multiple_submit** | Option<**bool**> | Whether multiple submissions are allowed. | [optional][default to 1]
**name** | Option<**String**> | Feedback name. | [optional][default to null]
**page_after_submit** | Option<**String**> | Text to display after submission. | [optional][default to null]
**page_after_submitformat** | Option<**i32**> | page_after_submit format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to 0]
**pageaftersubmitfiles** | Option<[**Vec<models::CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>**](core_blog_get_entries_200_response_entries_inner_summaryfiles_inner.md)> |  | [optional]
**publish_stats** | Option<**bool**> | Whether stats should be published. | [optional][default to 0]
**site_after_submit** | Option<**String**> | Link to next page after submission. | [optional][default to null]
**timeclose** | Option<**i32**> | Allow answers until this time. | [optional][default to null]
**timemodified** | Option<**i32**> | The time this record was modified. | [optional][default to null]
**timeopen** | Option<**i32**> | Allow answers from this time. | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


