# MoodleClient.Model.CoreCourseCreateCoursesRequestCoursesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Categoryid** | **int** | category id | [optional] [default to null]
**Completionnotify** | **int** | 1: yes 0: no | [optional] [default to null]
**Courseformatoptions** | [**List&lt;CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner&gt;**](CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner.md) |  | [optional] 
**Customfields** | [**List&lt;CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner&gt;**](CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner.md) |  | [optional] 
**Defaultgroupingid** | **int** | default grouping id | [optional] [default to 0]
**Enablecompletion** | **int** | Enabled, control via completion and activity settings. Disabled,                                         not shown in activity settings. | [optional] [default to null]
**Enddate** | **int** | timestamp when the course end | [optional] [default to null]
**Forcetheme** | **string** | name of the force theme | [optional] [default to "null"]
**Format** | **string** | course format: weeks, topics, social, site,.. | [optional] [default to "topics"]
**Fullname** | **string** | full name | [optional] [default to "null"]
**Groupmode** | **int** | no group, separate, visible | [optional] [default to 0]
**Groupmodeforce** | **int** | 1: yes, 0: no | [optional] [default to 0]
**Hiddensections** | **int** | (deprecated, use courseformatoptions) How the hidden sections in the course are displayed to students | [optional] [default to null]
**Idnumber** | **string** | id number | [optional] [default to "null"]
**Lang** | **string** | forced course language | [optional] [default to "null"]
**Maxbytes** | **int** | largest size of file that can be uploaded into the course | [optional] [default to 0]
**Newsitems** | **int** | number of recent items appearing on the course page | [optional] [default to 5]
**Numsections** | **int** | (deprecated, use courseformatoptions) number of weeks/topics | [optional] [default to null]
**Shortname** | **string** | course short name | [optional] [default to "null"]
**Showgrades** | **int** | 1 if grades are shown, otherwise 0 | [optional] [default to 1]
**Showreports** | **int** | are activity report shown (yes &#x3D; 1, no &#x3D;0) | [optional] [default to 0]
**Startdate** | **int** | timestamp when the course start | [optional] [default to null]
**Summary** | **string** | summary | [optional] 
**Summaryformat** | **int** | summary format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Visible** | **int** | 1: available to student, 0:not available | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

