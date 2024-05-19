# CoreCourseGetCoursesByField200ResponseCoursesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cacherev** | Option<**i32**> | Cache revision number | [optional][default to null]
**calendartype** | Option<**String**> | Calendar type | [optional][default to null]
**categoryid** | Option<**i32**> | category id | [optional]
**categoryname** | Option<**String**> | category name | [optional][default to null]
**completionnotify** | Option<**i32**> | 1: yes 0: no | [optional]
**contacts** | Option<[**Vec<models::CoreCourseGetCoursesByField200ResponseCoursesInnerContactsInner>**](core_course_get_courses_by_field_200_response_courses_inner_contacts_inner.md)> |  | [optional]
**courseformatoptions** | Option<[**Vec<models::CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInner>**](core_course_get_courses_by_field_200_response_courses_inner_courseformatoptions_inner.md)> |  | [optional]
**courseimage** | Option<**String**> | Course image | [optional][default to null]
**customfields** | Option<[**Vec<models::CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner>**](core_course_get_courses_by_field_200_response_courses_inner_customfields_inner.md)> |  | [optional]
**defaultgroupingid** | Option<**i32**> | default grouping id | [optional][default to null]
**displayname** | Option<**String**> | course display name | [optional][default to null]
**enablecompletion** | Option<**i32**> | Completion enabled? 1: yes 0: no | [optional][default to null]
**enddate** | Option<**i32**> | Timestamp when the course end | [optional][default to null]
**enrollmentmethods** | Option<[**Vec<serde_json::Value>**](serde_json::Value.md)> |  | [optional]
**filters** | Option<[**Vec<models::CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner>**](core_course_get_courses_by_field_200_response_courses_inner_filters_inner.md)> |  | [optional]
**format** | Option<**String**> | Course format: weeks, topics, social, site,.. | [optional][default to null]
**fullname** | Option<**String**> | course full name | [optional][default to null]
**groupmode** | Option<**i32**> | no group, separate, visible | [optional][default to null]
**groupmodeforce** | Option<**i32**> | 1: yes, 0: no | [optional][default to null]
**id** | Option<**i32**> | course id | [optional]
**idnumber** | Option<**String**> | Id number | [optional][default to null]
**lang** | Option<**String**> | Forced course language | [optional][default to null]
**legacyfiles** | Option<**i32**> | If legacy files are enabled | [optional][default to null]
**marker** | Option<**i32**> | Current course marker | [optional][default to null]
**maxbytes** | Option<**i32**> | Largest size of file that can be uploaded into | [optional][default to null]
**newsitems** | Option<**i32**> | Number of recent items appearing on the course page | [optional][default to null]
**overviewfiles** | Option<[**Vec<models::CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>**](core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner.md)> |  | [optional]
**requested** | Option<**i32**> | If is a requested course | [optional][default to null]
**shortname** | Option<**String**> | course short name | [optional]
**showactivitydates** | Option<**bool**> | Whether the activity dates are shown or not | [optional][default to null]
**showcompletionconditions** | Option<**bool**> | Whether the activity completion conditions are shown or not | [optional][default to null]
**showgrades** | Option<**i32**> | 1 if grades are shown, otherwise 0 | [optional][default to null]
**showreports** | Option<**i32**> | Are activity report shown (yes = 1, no =0) | [optional][default to null]
**sortorder** | Option<**i32**> | Sort order in the category | [optional][default to null]
**startdate** | Option<**i32**> | Timestamp when the course start | [optional][default to null]
**summary** | Option<**String**> | summary | [optional]
**summaryfiles** | Option<[**Vec<models::CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>**](core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner.md)> |  | [optional]
**summaryformat** | Option<**i32**> | summary format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional]
**theme** | Option<**String**> | Fame of the forced theme | [optional][default to null]
**timecreated** | Option<**i32**> | Time when the course was created | [optional][default to null]
**timemodified** | Option<**i32**> | Last time  the course was updated | [optional][default to null]
**visible** | Option<**i32**> | 1: available to student, 0:not available | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


