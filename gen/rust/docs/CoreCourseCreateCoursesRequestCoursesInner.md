# CoreCourseCreateCoursesRequestCoursesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryid** | Option<**i32**> | category id | [optional][default to null]
**completionnotify** | Option<**i32**> | 1: yes 0: no | [optional][default to null]
**courseformatoptions** | Option<[**Vec<models::CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner>**](core_course_create_courses_request_courses_inner_courseformatoptions_inner.md)> |  | [optional]
**customfields** | Option<[**Vec<models::CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner>**](core_cohort_update_cohorts_request_cohorts_inner_customfields_inner.md)> |  | [optional]
**defaultgroupingid** | Option<**i32**> | default grouping id | [optional][default to 0]
**enablecompletion** | Option<**i32**> | Enabled, control via completion and activity settings. Disabled,                                         not shown in activity settings. | [optional][default to null]
**enddate** | Option<**i32**> | timestamp when the course end | [optional][default to null]
**forcetheme** | Option<**String**> | name of the force theme | [optional][default to null]
**format** | Option<**String**> | course format: weeks, topics, social, site,.. | [optional][default to topics]
**fullname** | Option<**String**> | full name | [optional][default to null]
**groupmode** | Option<**i32**> | no group, separate, visible | [optional][default to 0]
**groupmodeforce** | Option<**i32**> | 1: yes, 0: no | [optional][default to 0]
**hiddensections** | Option<**i32**> | (deprecated, use courseformatoptions) How the hidden sections in the course are displayed to students | [optional][default to null]
**idnumber** | Option<**String**> | id number | [optional][default to null]
**lang** | Option<**String**> | forced course language | [optional][default to null]
**maxbytes** | Option<**i32**> | largest size of file that can be uploaded into the course | [optional][default to 0]
**newsitems** | Option<**i32**> | number of recent items appearing on the course page | [optional][default to 5]
**numsections** | Option<**i32**> | (deprecated, use courseformatoptions) number of weeks/topics | [optional][default to null]
**shortname** | Option<**String**> | course short name | [optional][default to null]
**showgrades** | Option<**i32**> | 1 if grades are shown, otherwise 0 | [optional][default to 1]
**showreports** | Option<**i32**> | are activity report shown (yes = 1, no =0) | [optional][default to 0]
**startdate** | Option<**i32**> | timestamp when the course start | [optional][default to null]
**summary** | Option<**String**> | summary | [optional]
**summaryformat** | Option<**i32**> | summary format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to 1]
**visible** | Option<**i32**> | 1: available to student, 0:not available | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


