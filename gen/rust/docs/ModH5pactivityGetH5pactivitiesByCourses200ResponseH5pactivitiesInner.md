# ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contenthash** | Option<**String**> | Sha1 hash of file content. | [optional][default to null]
**context** | Option<**i32**> | context | [optional][default to null]
**course** | Option<**i32**> | Course id this h5p activity is part of. | [optional][default to null]
**coursemodule** | Option<**i32**> | coursemodule | [optional]
**deployedfile** | Option<[**models::ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile**](mod_h5pactivity_get_h5pactivities_by_courses_200_response_h5pactivities_inner_deployedfile.md)> |  | [optional]
**displayoptions** | Option<**i32**> | H5P Button display options. | [optional][default to 0]
**enabletracking** | Option<**i32**> | Enable xAPI tracking. | [optional][default to 1]
**grade** | Option<**i32**> | The maximum grade for submission. | [optional][default to 0]
**grademethod** | Option<**i32**> | Which H5P attempt is used for grading. | [optional][default to 1]
**id** | Option<**i32**> | The primary key of the record. | [optional]
**intro** | Option<**String**> | H5P activity description. | [optional][default to ]
**introfiles** | Option<[**Vec<models::CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>**](core_blog_get_entries_200_response_entries_inner_summaryfiles_inner.md)> |  | [optional]
**introformat** | Option<**i32**> | intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to 0]
**name** | Option<**String**> | The name of the activity module instance. | [optional][default to null]
**package** | Option<[**Vec<models::CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>**](core_blog_get_entries_200_response_entries_inner_summaryfiles_inner.md)> |  | [optional]
**timecreated** | Option<**i32**> | Timestamp of when the instance was added to the course. | [optional][default to null]
**timemodified** | Option<**i32**> | Timestamp of when the instance was last modified. | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


