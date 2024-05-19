# MoodleClient.Model.ModWorkshopGetAssessment200ResponseAssessment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Feedbackattachmentfiles** | [**List&lt;CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner&gt;**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | 
**Feedbackauthor** | **string** | The comment/feedback from the reviewer for the author. | [default to "null"]
**Feedbackauthorattachment** | **int** | Are there some files attached to the feedbackauthor field?                     Sets to 1 by file_postupdate_standard_filemanager(). | [default to 0]
**Feedbackauthorformat** | **int** | feedbackauthor format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**Feedbackcontentfiles** | [**List&lt;CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner&gt;**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | 
**Feedbackreviewer** | **string** | The comment/feedback from the teacher for the reviewer.                     For example the reason why the grade for assessment was overridden | [optional] [default to "null"]
**Feedbackreviewerformat** | **int** | feedbackreviewer format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**Grade** | **decimal** | The aggregated grade for submission suggested by the reviewer.                     The grade 0..100 is computed from the values assigned to the assessment dimensions fields. If NULL then it has not been aggregated yet. | [default to nullM]
**Gradinggrade** | **decimal** | The computed grade 0..100 for this assessment. If NULL then it has not been computed yet. | [default to nullM]
**Gradinggradeover** | **decimal** | Grade for the assessment manually overridden by a teacher.                     Grade is always from interval 0..100. If NULL then the grade is not overriden. | [default to nullM]
**Gradinggradeoverby** | **int** | The id of the user who has overridden the grade for submission. | [default to null]
**Id** | **int** | The primary key of the record. | 
**Reviewerid** | **int** | The id of the reviewer who makes this assessment | [default to null]
**Submissionid** | **int** | The id of the assessed submission | [default to null]
**Timecreated** | **int** | If 0 then the assessment was allocated but the reviewer has not assessed yet.                     If greater than 0 then the timestamp of when the reviewer assessed for the first time | [default to 0]
**Timemodified** | **int** | If 0 then the assessment was allocated but the reviewer has not assessed yet.                     If greater than 0 then the timestamp of when the reviewer assessed for the last time | [default to 0]
**Weight** | **int** | The weight of the assessment for the purposes of aggregation | [default to 1]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

