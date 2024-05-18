

# ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assessmentend** | **Integer** | 0 &#x3D; will be closed manually, greater than 0 the timestamp of the end of the assessment phase. |  [optional] |
|**assessmentstart** | **Integer** | 0 &#x3D; will be started manually, greater than 0 the timestamp of the start of the assessment phase. |  [optional] |
|**conclusion** | **String** | A text to be displayed at the end of the workshop. |  [optional] |
|**conclusionfiles** | [**List&lt;CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner&gt;**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  |  [optional] |
|**conclusionformat** | **Integer** | conclusion format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |  [optional] |
|**course** | **Integer** | Course id this workshop is part of. |  [optional] |
|**coursemodule** | **Integer** | coursemodule |  [optional] |
|**evaluation** | **String** | The recently used grading evaluation method. |  [optional] |
|**examplesmode** | **Integer** | 0 &#x3D; example assessments are voluntary, 1 &#x3D; examples must be assessed before submission,                     2 &#x3D; examples are available after own submission and must be assessed before peer/self assessment phase. |  [optional] |
|**grade** | **BigDecimal** | The maximum grade for submission. |  [optional] |
|**gradedecimals** | **Integer** | Number of digits that should be shown after the decimal point when displaying grades. |  [optional] |
|**gradinggrade** | **BigDecimal** | The maximum grade for assessment. |  [optional] |
|**id** | **Integer** | The primary key of the record. |  [optional] |
|**instructauthors** | **String** | Instructions for the submission phase. |  [optional] |
|**instructauthorsfiles** | [**List&lt;CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner&gt;**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  |  [optional] |
|**instructauthorsformat** | **Integer** | instructauthors format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |  [optional] |
|**instructreviewers** | **String** | Instructions for the assessment phase. |  [optional] |
|**instructreviewersfiles** | [**List&lt;CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner&gt;**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  |  [optional] |
|**instructreviewersformat** | **Integer** | instructreviewers format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |  [optional] |
|**intro** | **String** | Workshop introduction text. |  [optional] |
|**introfiles** | [**List&lt;CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner&gt;**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  |  [optional] |
|**introformat** | **Integer** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |  [optional] |
|**lang** | **String** | Forced activity language |  [optional] |
|**latesubmissions** | **Boolean** | Allow submitting the work after the deadline. |  [optional] |
|**maxbytes** | **Integer** | Maximum size of the one attached file. |  [optional] |
|**name** | **String** | Workshop name. |  [optional] |
|**nattachments** | **Integer** | Maximum number of submission attachments. |  [optional] |
|**overallfeedbackfiles** | **Integer** | Number of allowed attachments to the overall feedback. |  [optional] |
|**overallfeedbackfiletypes** | **String** | Comma separated list of file extensions. |  [optional] |
|**overallfeedbackmaxbytes** | **Integer** | Maximum size of one file attached to the overall feedback. |  [optional] |
|**overallfeedbackmode** | **Integer** | Mode of the overall feedback support. |  [optional] |
|**phase** | **Integer** | The current phase of workshop (0 &#x3D; not available, 1 &#x3D; submission, 2 &#x3D; assessment, 3 &#x3D; closed). |  [optional] |
|**phaseswitchassessment** | **Boolean** | Automatically switch to the assessment phase after the submissions deadline. |  [optional] |
|**strategy** | **String** | The type of the current grading strategy used in this workshop. |  [optional] |
|**submissionend** | **Integer** | 0 &#x3D; will be closed manually, greater than 0 the timestamp of the end of the submission phase. |  [optional] |
|**submissionfiletypes** | **String** | Comma separated list of file extensions. |  [optional] |
|**submissionstart** | **Integer** | 0 &#x3D; will be started manually, greater than 0 the timestamp of the start of the submission phase. |  [optional] |
|**submissiontypefile** | **Integer** | Indicates whether a file upload is required as part of each submission. 0 for no, 1 for optional, 2 for required. |  [optional] |
|**submissiontypetext** | **Integer** | Indicates whether text is required as part of each submission. 0 for no, 1 for optional, 2 for required. |  [optional] |
|**timemodified** | **Integer** | The timestamp when the module was modified. |  [optional] |
|**useexamples** | **Boolean** | Optional feature: students practise evaluating on example submissions from teacher. |  [optional] |
|**usepeerassessment** | **Boolean** | Optional feature: students perform peer assessment of others&#39; work. |  [optional] |
|**useselfassessment** | **Boolean** | Optional feature: students perform self assessment of their own work. |  [optional] |



