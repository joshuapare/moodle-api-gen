

# ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feedbackattachmentfiles** | [**List&lt;CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner&gt;**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  |  [optional] |
|**feedbackauthor** | **String** | The comment/feedback from the reviewer for the author. |  [optional] |
|**feedbackauthorattachment** | **Integer** | Are there some files attached to the feedbackauthor field?                     Sets to 1 by file_postupdate_standard_filemanager(). |  [optional] |
|**feedbackauthorformat** | **Integer** | feedbackauthor format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |  [optional] |
|**feedbackcontentfiles** | [**List&lt;CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner&gt;**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  |  [optional] |
|**feedbackreviewer** | **String** | The comment/feedback from the teacher for the reviewer.                     For example the reason why the grade for assessment was overridden |  [optional] |
|**feedbackreviewerformat** | **Integer** | feedbackreviewer format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |  [optional] |
|**grade** | **BigDecimal** | The aggregated grade for submission suggested by the reviewer.                     The grade 0..100 is computed from the values assigned to the assessment dimensions fields. If NULL then it has not been aggregated yet. |  [optional] |
|**gradinggrade** | **BigDecimal** | The computed grade 0..100 for this assessment. If NULL then it has not been computed yet. |  [optional] |
|**gradinggradeover** | **BigDecimal** | Grade for the assessment manually overridden by a teacher.                     Grade is always from interval 0..100. If NULL then the grade is not overriden. |  [optional] |
|**gradinggradeoverby** | **Integer** | The id of the user who has overridden the grade for submission. |  [optional] |
|**id** | **Integer** | The primary key of the record. |  [optional] |
|**reviewerid** | **Integer** | The id of the reviewer who makes this assessment |  [optional] |
|**submissionid** | **Integer** | The id of the assessed submission |  [optional] |
|**timecreated** | **Integer** | If 0 then the assessment was allocated but the reviewer has not assessed yet.                     If greater than 0 then the timestamp of when the reviewer assessed for the first time |  [optional] |
|**timemodified** | **Integer** | If 0 then the assessment was allocated but the reviewer has not assessed yet.                     If greater than 0 then the timestamp of when the reviewer assessed for the last time |  [optional] |
|**weight** | **Integer** | The weight of the assessment for the purposes of aggregation |  [optional] |



