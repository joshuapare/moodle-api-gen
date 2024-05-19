# # CoreCourseUpdateCoursesRequestCoursesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryid** | **int** | category id | [optional]
**completionnotify** | **int** | 1: yes 0: no | [optional]
**courseformatoptions** | [**\OpenAPI\Client\Model\CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner[]**](CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner.md) |  | [optional]
**customfields** | [**\OpenAPI\Client\Model\CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner[]**](CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner.md) |  | [optional]
**defaultgroupingid** | **int** | default grouping id | [optional]
**enablecompletion** | **int** | Enabled, control via completion and activity settings. Disabled,                                         not shown in activity settings. | [optional]
**enddate** | **int** | timestamp when the course end | [optional]
**forcetheme** | **string** | name of the force theme | [optional]
**format** | **string** | course format: weeks, topics, social, site,.. | [optional] [default to 'null']
**fullname** | **string** | full name | [optional]
**groupmode** | **int** | no group, separate, visible | [optional]
**groupmodeforce** | **int** | 1: yes, 0: no | [optional]
**hiddensections** | **int** | (deprecated, use courseformatoptions) How the hidden sections in the course are                                         displayed to students | [optional] [default to null]
**id** | **int** | ID of the course | [optional]
**idnumber** | **string** | id number | [optional]
**lang** | **string** | forced course language | [optional]
**maxbytes** | **int** | largest size of file that can be uploaded into the course | [optional] [default to null]
**newsitems** | **int** | number of recent items appearing on the course page | [optional] [default to null]
**numsections** | **int** | (deprecated, use courseformatoptions) number of weeks/topics | [optional]
**shortname** | **string** | course short name | [optional]
**showgrades** | **int** | 1 if grades are shown, otherwise 0 | [optional]
**showreports** | **int** | are activity report shown (yes &#x3D; 1, no &#x3D;0) | [optional] [default to null]
**startdate** | **int** | timestamp when the course start | [optional]
**summary** | **string** | summary | [optional]
**summaryformat** | **int** | summary format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional]
**visible** | **int** | 1: available to student, 0:not available | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
