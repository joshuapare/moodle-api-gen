# MoodleClient.Model.ModWorkshopGetSubmissions200ResponseSubmissionsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attachment** | **int** | Used by File API file_postupdate_standard_filemanager. | [optional] [default to 0]
**Attachmentfiles** | [**List&lt;CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner&gt;**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**Authorid** | **int** | The author of the submission. | [optional] 
**Content** | **string** | Submission text. | [optional] 
**Contentfiles** | [**List&lt;CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner&gt;**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**Contentformat** | **int** | content format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**Contenttrust** | **int** | The trust mode of the data. | [optional] [default to 0]
**Example** | **bool** | Is this submission an example from teacher. | [optional] [default to false]
**Feedbackauthor** | **string** | Teacher comment/feedback for the author of the submission, for example describing the reasons                     for the grade overriding. | [optional] 
**Feedbackauthorformat** | **int** | feedbackauthor format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**Grade** | **decimal** | Aggregated grade for the submission. The grade is a decimal number from interval 0..100.                     If NULL then the grade for submission has not been aggregated yet. | [optional] 
**Gradeover** | **decimal** | Grade for the submission manually overridden by a teacher. Grade is always from interval 0..100.                     If NULL then the grade is not overriden. | [optional] 
**Gradeoverby** | **int** | The id of the user who has overridden the grade for submission. | [optional] 
**Id** | **int** | The primary key of the record. | [optional] 
**Late** | **int** | Has this submission been submitted after the deadline or during the assessment phase? | [optional] [default to 0]
**Published** | **bool** | Shall the submission be available to other when the workshop is closed. | [optional] [default to false]
**Timecreated** | **int** | Timestamp when the work was submitted for the first time. | [optional] 
**Timegraded** | **int** | The timestamp when grade or gradeover was recently modified. | [optional] 
**Timemodified** | **int** | Timestamp when the submission has been updated. | [optional] 
**Title** | **string** | The submission title. | [optional] 
**Workshopid** | **int** | The id of the workshop instance. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

