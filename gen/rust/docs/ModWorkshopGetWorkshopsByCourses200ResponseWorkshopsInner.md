# ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assessmentend** | Option<**i32**> | 0 = will be closed manually, greater than 0 the timestamp of the end of the assessment phase. | [optional][default to 0]
**assessmentstart** | Option<**i32**> | 0 = will be started manually, greater than 0 the timestamp of the start of the assessment phase. | [optional][default to 0]
**conclusion** | Option<**String**> | A text to be displayed at the end of the workshop. | [optional][default to null]
**conclusionfiles** | Option<[**Vec<models::CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>**](core_blog_get_entries_200_response_entries_inner_summaryfiles_inner.md)> |  | [optional]
**conclusionformat** | Option<**i32**> | conclusion format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to 0]
**course** | Option<**i32**> | Course id this workshop is part of. | [optional][default to null]
**coursemodule** | Option<**i32**> | coursemodule | [optional]
**evaluation** | Option<**String**> | The recently used grading evaluation method. | [optional][default to null]
**examplesmode** | Option<**i32**> | 0 = example assessments are voluntary, 1 = examples must be assessed before submission,                     2 = examples are available after own submission and must be assessed before peer/self assessment phase. | [optional][default to 0]
**grade** | Option<**f64**> | The maximum grade for submission. | [optional][default to 80]
**gradedecimals** | Option<**i32**> | Number of digits that should be shown after the decimal point when displaying grades. | [optional][default to 0]
**gradinggrade** | Option<**f64**> | The maximum grade for assessment. | [optional][default to 20]
**id** | Option<**i32**> | The primary key of the record. | [optional]
**instructauthors** | Option<**String**> | Instructions for the submission phase. | [optional][default to null]
**instructauthorsfiles** | Option<[**Vec<models::CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>**](core_blog_get_entries_200_response_entries_inner_summaryfiles_inner.md)> |  | [optional]
**instructauthorsformat** | Option<**i32**> | instructauthors format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to 0]
**instructreviewers** | Option<**String**> | Instructions for the assessment phase. | [optional][default to null]
**instructreviewersfiles** | Option<[**Vec<models::CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>**](core_blog_get_entries_200_response_entries_inner_summaryfiles_inner.md)> |  | [optional]
**instructreviewersformat** | Option<**i32**> | instructreviewers format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to 0]
**intro** | Option<**String**> | Workshop introduction text. | [optional][default to ]
**introfiles** | Option<[**Vec<models::CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>**](core_blog_get_entries_200_response_entries_inner_summaryfiles_inner.md)> |  | [optional]
**introformat** | Option<**i32**> | intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to 0]
**lang** | Option<**String**> | Forced activity language | [optional]
**latesubmissions** | Option<**bool**> | Allow submitting the work after the deadline. | [optional][default to false]
**maxbytes** | Option<**i32**> | Maximum size of the one attached file. | [optional][default to 100000]
**name** | Option<**String**> | Workshop name. | [optional][default to null]
**nattachments** | Option<**i32**> | Maximum number of submission attachments. | [optional][default to 1]
**overallfeedbackfiles** | Option<**i32**> | Number of allowed attachments to the overall feedback. | [optional][default to 0]
**overallfeedbackfiletypes** | Option<**String**> | Comma separated list of file extensions. | [optional][default to null]
**overallfeedbackmaxbytes** | Option<**i32**> | Maximum size of one file attached to the overall feedback. | [optional][default to 100000]
**overallfeedbackmode** | Option<**i32**> | Mode of the overall feedback support. | [optional][default to 1]
**phase** | Option<**i32**> | The current phase of workshop (0 = not available, 1 = submission, 2 = assessment, 3 = closed). | [optional][default to 0]
**phaseswitchassessment** | Option<**bool**> | Automatically switch to the assessment phase after the submissions deadline. | [optional][default to false]
**strategy** | Option<**String**> | The type of the current grading strategy used in this workshop. | [optional][default to null]
**submissionend** | Option<**i32**> | 0 = will be closed manually, greater than 0 the timestamp of the end of the submission phase. | [optional][default to 0]
**submissionfiletypes** | Option<**String**> | Comma separated list of file extensions. | [optional]
**submissionstart** | Option<**i32**> | 0 = will be started manually, greater than 0 the timestamp of the start of the submission phase. | [optional][default to 0]
**submissiontypefile** | Option<**i32**> | Indicates whether a file upload is required as part of each submission. 0 for no, 1 for optional, 2 for required. | [optional][default to 1]
**submissiontypetext** | Option<**i32**> | Indicates whether text is required as part of each submission. 0 for no, 1 for optional, 2 for required. | [optional][default to 1]
**timemodified** | Option<**i32**> | The timestamp when the module was modified. | [optional][default to null]
**useexamples** | Option<**bool**> | Optional feature: students practise evaluating on example submissions from teacher. | [optional][default to false]
**usepeerassessment** | Option<**bool**> | Optional feature: students perform peer assessment of others' work. | [optional][default to false]
**useselfassessment** | Option<**bool**> | Optional feature: students perform self assessment of their own work. | [optional][default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


