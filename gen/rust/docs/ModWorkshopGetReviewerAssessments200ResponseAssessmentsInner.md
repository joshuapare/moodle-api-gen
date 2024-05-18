# ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feedbackattachmentfiles** | Option<[**Vec<models::CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>**](core_blog_get_entries_200_response_entries_inner_summaryfiles_inner.md)> |  | [optional]
**feedbackauthor** | Option<**String**> | The comment/feedback from the reviewer for the author. | [optional]
**feedbackauthorattachment** | Option<**i32**> | Are there some files attached to the feedbackauthor field?                     Sets to 1 by file_postupdate_standard_filemanager(). | [optional][default to 0]
**feedbackauthorformat** | Option<**i32**> | feedbackauthor format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to 0]
**feedbackcontentfiles** | Option<[**Vec<models::CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>**](core_blog_get_entries_200_response_entries_inner_summaryfiles_inner.md)> |  | [optional]
**feedbackreviewer** | Option<**String**> | The comment/feedback from the teacher for the reviewer.                     For example the reason why the grade for assessment was overridden | [optional]
**feedbackreviewerformat** | Option<**i32**> | feedbackreviewer format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to 0]
**grade** | Option<**f64**> | The aggregated grade for submission suggested by the reviewer.                     The grade 0..100 is computed from the values assigned to the assessment dimensions fields. If NULL then it has not been aggregated yet. | [optional]
**gradinggrade** | Option<**f64**> | The computed grade 0..100 for this assessment. If NULL then it has not been computed yet. | [optional]
**gradinggradeover** | Option<**f64**> | Grade for the assessment manually overridden by a teacher.                     Grade is always from interval 0..100. If NULL then the grade is not overriden. | [optional]
**gradinggradeoverby** | Option<**i32**> | The id of the user who has overridden the grade for submission. | [optional]
**id** | Option<**i32**> | The primary key of the record. | [optional]
**reviewerid** | Option<**i32**> | The id of the reviewer who makes this assessment | [optional]
**submissionid** | Option<**i32**> | The id of the assessed submission | [optional]
**timecreated** | Option<**i32**> | If 0 then the assessment was allocated but the reviewer has not assessed yet.                     If greater than 0 then the timestamp of when the reviewer assessed for the first time | [optional][default to 0]
**timemodified** | Option<**i32**> | If 0 then the assessment was allocated but the reviewer has not assessed yet.                     If greater than 0 then the timestamp of when the reviewer assessed for the last time | [optional][default to 0]
**weight** | Option<**i32**> | The weight of the assessment for the purposes of aggregation | [optional][default to 1]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


