# ModWorkshopGetSubmissions200ResponseSubmissionsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachment** | Option<**i32**> | Used by File API file_postupdate_standard_filemanager. | [optional][default to 0]
**attachmentfiles** | Option<[**Vec<models::CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>**](core_blog_get_entries_200_response_entries_inner_summaryfiles_inner.md)> |  | [optional]
**authorid** | Option<**i32**> | The author of the submission. | [optional]
**content** | Option<**String**> | Submission text. | [optional]
**contentfiles** | Option<[**Vec<models::CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>**](core_blog_get_entries_200_response_entries_inner_summaryfiles_inner.md)> |  | [optional]
**contentformat** | Option<**i32**> | content format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to 0]
**contenttrust** | Option<**i32**> | The trust mode of the data. | [optional][default to 0]
**example** | Option<**bool**> | Is this submission an example from teacher. | [optional][default to false]
**feedbackauthor** | Option<**String**> | Teacher comment/feedback for the author of the submission, for example describing the reasons                     for the grade overriding. | [optional]
**feedbackauthorformat** | Option<**i32**> | feedbackauthor format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to 0]
**grade** | Option<**f64**> | Aggregated grade for the submission. The grade is a decimal number from interval 0..100.                     If NULL then the grade for submission has not been aggregated yet. | [optional]
**gradeover** | Option<**f64**> | Grade for the submission manually overridden by a teacher. Grade is always from interval 0..100.                     If NULL then the grade is not overriden. | [optional]
**gradeoverby** | Option<**i32**> | The id of the user who has overridden the grade for submission. | [optional]
**id** | Option<**i32**> | The primary key of the record. | [optional]
**late** | Option<**i32**> | Has this submission been submitted after the deadline or during the assessment phase? | [optional][default to 0]
**published** | Option<**bool**> | Shall the submission be available to other when the workshop is closed. | [optional][default to false]
**timecreated** | Option<**i32**> | Timestamp when the work was submitted for the first time. | [optional]
**timegraded** | Option<**i32**> | The timestamp when grade or gradeover was recently modified. | [optional]
**timemodified** | Option<**i32**> | Timestamp when the submission has been updated. | [optional]
**title** | Option<**String**> | The submission title. | [optional]
**workshopid** | Option<**i32**> | The id of the workshop instance. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


