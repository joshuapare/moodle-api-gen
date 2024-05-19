# # ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anonymous** | **int** | Whether the feedback is anonymous. | [optional] [default to null]
**autonumbering** | **bool** | Whether questions should be auto-numbered. | [optional] [default to 1]
**completionsubmit** | **bool** | If this field is set to 1, then the activity will be automatically marked as complete on submission. | [optional] [default to 0]
**course** | **int** | Course id this feedback is part of. | [optional] [default to null]
**coursemodule** | **int** | coursemodule | [optional]
**email_notification** | **bool** | Whether email notifications will be sent to teachers. | [optional] [default to null]
**id** | **int** | The primary key of the record. | [optional] [default to null]
**intro** | **string** | Feedback introduction text. | [optional] [default to '']
**introfiles** | [**\OpenAPI\Client\Model\CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner[]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional]
**introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**lang** | **string** | Forced activity language | [optional]
**multiple_submit** | **bool** | Whether multiple submissions are allowed. | [optional] [default to 1]
**name** | **string** | Feedback name. | [optional] [default to 'null']
**page_after_submit** | **string** | Text to display after submission. | [optional] [default to 'null']
**page_after_submitformat** | **int** | page_after_submit format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**pageaftersubmitfiles** | [**\OpenAPI\Client\Model\CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner[]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional]
**publish_stats** | **bool** | Whether stats should be published. | [optional] [default to 0]
**site_after_submit** | **string** | Link to next page after submission. | [optional] [default to 'null']
**timeclose** | **int** | Allow answers until this time. | [optional] [default to null]
**timemodified** | **int** | The time this record was modified. | [optional] [default to null]
**timeopen** | **int** | Allow answers from this time. | [optional] [default to null]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
