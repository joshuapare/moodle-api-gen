# # ModWorkshopGetSubmission200ResponseSubmission

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachment** | **int** | Used by File API file_postupdate_standard_filemanager. | [default to 0]
**attachmentfiles** | [**\OpenAPI\Client\Model\CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner[]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional]
**authorid** | **int** | The author of the submission. | [default to null]
**content** | **string** | Submission text. | [default to 'null']
**contentfiles** | [**\OpenAPI\Client\Model\CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner[]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional]
**contentformat** | **int** | content format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**contenttrust** | **int** | The trust mode of the data. | [default to 0]
**example** | **bool** | Is this submission an example from teacher. | [default to false]
**feedbackauthor** | **string** | Teacher comment/feedback for the author of the submission, for example describing the reasons                     for the grade overriding. | [optional] [default to 'null']
**feedbackauthorformat** | **int** | feedbackauthor format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**grade** | **float** | Aggregated grade for the submission. The grade is a decimal number from interval 0..100.                     If NULL then the grade for submission has not been aggregated yet. | [optional] [default to null]
**gradeover** | **float** | Grade for the submission manually overridden by a teacher. Grade is always from interval 0..100.                     If NULL then the grade is not overriden. | [optional] [default to null]
**gradeoverby** | **int** | The id of the user who has overridden the grade for submission. | [optional]
**id** | **int** | The primary key of the record. |
**late** | **int** | Has this submission been submitted after the deadline or during the assessment phase? | [default to 0]
**published** | **bool** | Shall the submission be available to other when the workshop is closed. | [default to false]
**timecreated** | **int** | Timestamp when the work was submitted for the first time. | [default to null]
**timegraded** | **int** | The timestamp when grade or gradeover was recently modified. | [optional] [default to null]
**timemodified** | **int** | Timestamp when the submission has been updated. | [default to null]
**title** | **string** | The submission title. | [default to 'null']
**workshopid** | **int** | The id of the workshop instance. | [default to null]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
