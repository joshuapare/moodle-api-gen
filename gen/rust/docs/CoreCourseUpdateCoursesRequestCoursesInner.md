# CoreCourseUpdateCoursesRequestCoursesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryid** | Option<**i32**> | category id | [optional]
**completionnotify** | Option<**i32**> | 1: yes 0: no | [optional]
**courseformatoptions** | Option<[**Vec<models::CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner>**](core_course_update_courses_request_courses_inner_courseformatoptions_inner.md)> |  | [optional]
**customfields** | Option<[**Vec<models::CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner>**](core_cohort_update_cohorts_request_cohorts_inner_customfields_inner.md)> |  | [optional]
**defaultgroupingid** | Option<**i32**> | default grouping id | [optional]
**enablecompletion** | Option<**i32**> | Enabled, control via completion and activity settings. Disabled,                                         not shown in activity settings. | [optional]
**enddate** | Option<**i32**> | timestamp when the course end | [optional]
**forcetheme** | Option<**String**> | name of the force theme | [optional]
**format** | Option<**String**> | course format: weeks, topics, social, site,.. | [optional][default to null]
**fullname** | Option<**String**> | full name | [optional]
**groupmode** | Option<**i32**> | no group, separate, visible | [optional]
**groupmodeforce** | Option<**i32**> | 1: yes, 0: no | [optional]
**hiddensections** | Option<**i32**> | (deprecated, use courseformatoptions) How the hidden sections in the course are                                         displayed to students | [optional][default to null]
**id** | Option<**i32**> | ID of the course | [optional]
**idnumber** | Option<**String**> | id number | [optional]
**lang** | Option<**String**> | forced course language | [optional]
**maxbytes** | Option<**i32**> | largest size of file that can be uploaded into the course | [optional][default to null]
**newsitems** | Option<**i32**> | number of recent items appearing on the course page | [optional][default to null]
**numsections** | Option<**i32**> | (deprecated, use courseformatoptions) number of weeks/topics | [optional]
**shortname** | Option<**String**> | course short name | [optional]
**showgrades** | Option<**i32**> | 1 if grades are shown, otherwise 0 | [optional]
**showreports** | Option<**i32**> | are activity report shown (yes = 1, no =0) | [optional][default to null]
**startdate** | Option<**i32**> | timestamp when the course start | [optional]
**summary** | Option<**String**> | summary | [optional]
**summaryformat** | Option<**i32**> | summary format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional]
**visible** | Option<**i32**> | 1: available to student, 0:not available | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


