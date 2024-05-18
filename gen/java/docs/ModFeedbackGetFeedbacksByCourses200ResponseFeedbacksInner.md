

# ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**anonymous** | **Integer** | Whether the feedback is anonymous. |  [optional] |
|**autonumbering** | **Boolean** | Whether questions should be auto-numbered. |  [optional] |
|**completionsubmit** | **Boolean** | If this field is set to 1, then the activity will be automatically marked as complete on submission. |  [optional] |
|**course** | **Integer** | Course id this feedback is part of. |  [optional] |
|**coursemodule** | **Integer** | coursemodule |  [optional] |
|**emailNotification** | **Boolean** | Whether email notifications will be sent to teachers. |  [optional] |
|**id** | **Integer** | The primary key of the record. |  [optional] |
|**intro** | **String** | Feedback introduction text. |  [optional] |
|**introfiles** | [**List&lt;CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner&gt;**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  |  [optional] |
|**introformat** | **Integer** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |  [optional] |
|**lang** | **String** | Forced activity language |  [optional] |
|**multipleSubmit** | **Boolean** | Whether multiple submissions are allowed. |  [optional] |
|**name** | **String** | Feedback name. |  [optional] |
|**pageAfterSubmit** | **String** | Text to display after submission. |  [optional] |
|**pageAfterSubmitformat** | **Integer** | page_after_submit format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |  [optional] |
|**pageaftersubmitfiles** | [**List&lt;CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner&gt;**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  |  [optional] |
|**publishStats** | **Boolean** | Whether stats should be published. |  [optional] |
|**siteAfterSubmit** | **String** | Link to next page after submission. |  [optional] |
|**timeclose** | **Integer** | Allow answers until this time. |  [optional] |
|**timemodified** | **Integer** | The time this record was modified. |  [optional] |
|**timeopen** | **Integer** | Allow answers from this time. |  [optional] |



