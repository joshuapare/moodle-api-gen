# MoodleClient.Model.ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Anonymous** | **int** | Whether the feedback is anonymous. | [optional] [default to null]
**Autonumbering** | **bool** | Whether questions should be auto-numbered. | [optional] [default to 1]
**Completionsubmit** | **bool** | If this field is set to 1, then the activity will be automatically marked as complete on submission. | [optional] [default to 0]
**Course** | **int** | Course id this feedback is part of. | [optional] [default to null]
**Coursemodule** | **int** | coursemodule | [optional] 
**EmailNotification** | **bool** | Whether email notifications will be sent to teachers. | [optional] [default to null]
**Id** | **int** | The primary key of the record. | [optional] [default to null]
**Intro** | **string** | Feedback introduction text. | [optional] [default to ""]
**Introfiles** | [**List&lt;CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner&gt;**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**Introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**Lang** | **string** | Forced activity language | [optional] 
**MultipleSubmit** | **bool** | Whether multiple submissions are allowed. | [optional] [default to 1]
**Name** | **string** | Feedback name. | [optional] [default to "null"]
**PageAfterSubmit** | **string** | Text to display after submission. | [optional] [default to "null"]
**PageAfterSubmitformat** | **int** | page_after_submit format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**Pageaftersubmitfiles** | [**List&lt;CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner&gt;**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**PublishStats** | **bool** | Whether stats should be published. | [optional] [default to 0]
**SiteAfterSubmit** | **string** | Link to next page after submission. | [optional] [default to "null"]
**Timeclose** | **int** | Allow answers until this time. | [optional] [default to null]
**Timemodified** | **int** | The time this record was modified. | [optional] [default to null]
**Timeopen** | **int** | Allow answers from this time. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

