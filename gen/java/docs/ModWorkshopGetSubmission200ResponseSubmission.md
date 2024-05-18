

# ModWorkshopGetSubmission200ResponseSubmission


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attachment** | **Integer** | Used by File API file_postupdate_standard_filemanager. |  |
|**attachmentfiles** | [**List&lt;CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner&gt;**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  |  [optional] |
|**authorid** | **Integer** | The author of the submission. |  |
|**content** | **String** | Submission text. |  |
|**contentfiles** | [**List&lt;CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner&gt;**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  |  [optional] |
|**contentformat** | **Integer** | content format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |  [optional] |
|**contenttrust** | **Integer** | The trust mode of the data. |  |
|**example** | **Boolean** | Is this submission an example from teacher. |  |
|**feedbackauthor** | **String** | Teacher comment/feedback for the author of the submission, for example describing the reasons                     for the grade overriding. |  [optional] |
|**feedbackauthorformat** | **Integer** | feedbackauthor format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |  [optional] |
|**grade** | **BigDecimal** | Aggregated grade for the submission. The grade is a decimal number from interval 0..100.                     If NULL then the grade for submission has not been aggregated yet. |  [optional] |
|**gradeover** | **BigDecimal** | Grade for the submission manually overridden by a teacher. Grade is always from interval 0..100.                     If NULL then the grade is not overriden. |  [optional] |
|**gradeoverby** | **Integer** | The id of the user who has overridden the grade for submission. |  [optional] |
|**id** | **Integer** | The primary key of the record. |  |
|**late** | **Integer** | Has this submission been submitted after the deadline or during the assessment phase? |  |
|**published** | **Boolean** | Shall the submission be available to other when the workshop is closed. |  |
|**timecreated** | **Integer** | Timestamp when the work was submitted for the first time. |  |
|**timegraded** | **Integer** | The timestamp when grade or gradeover was recently modified. |  [optional] |
|**timemodified** | **Integer** | Timestamp when the submission has been updated. |  |
|**title** | **String** | The submission title. |  |
|**workshopid** | **Integer** | The id of the workshop instance. |  |


