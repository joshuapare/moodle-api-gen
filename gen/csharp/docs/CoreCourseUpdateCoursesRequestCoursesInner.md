# MoodleClient.Model.CoreCourseUpdateCoursesRequestCoursesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Categoryid** | **int** | category id | [optional] 
**Completionnotify** | **int** | 1: yes 0: no | [optional] 
**Courseformatoptions** | [**List&lt;CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner&gt;**](CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner.md) |  | [optional] 
**Customfields** | [**List&lt;CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner&gt;**](CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner.md) |  | [optional] 
**Defaultgroupingid** | **int** | default grouping id | [optional] 
**Enablecompletion** | **int** | Enabled, control via completion and activity settings. Disabled,                                         not shown in activity settings. | [optional] 
**Enddate** | **int** | timestamp when the course end | [optional] 
**Forcetheme** | **string** | name of the force theme | [optional] 
**Format** | **string** | course format: weeks, topics, social, site,.. | [optional] [default to "null"]
**Fullname** | **string** | full name | [optional] 
**Groupmode** | **int** | no group, separate, visible | [optional] 
**Groupmodeforce** | **int** | 1: yes, 0: no | [optional] 
**Hiddensections** | **int** | (deprecated, use courseformatoptions) How the hidden sections in the course are                                         displayed to students | [optional] [default to null]
**Id** | **int** | ID of the course | [optional] 
**Idnumber** | **string** | id number | [optional] 
**Lang** | **string** | forced course language | [optional] 
**Maxbytes** | **int** | largest size of file that can be uploaded into the course | [optional] [default to null]
**Newsitems** | **int** | number of recent items appearing on the course page | [optional] [default to null]
**Numsections** | **int** | (deprecated, use courseformatoptions) number of weeks/topics | [optional] 
**Shortname** | **string** | course short name | [optional] 
**Showgrades** | **int** | 1 if grades are shown, otherwise 0 | [optional] 
**Showreports** | **int** | are activity report shown (yes &#x3D; 1, no &#x3D;0) | [optional] [default to null]
**Startdate** | **int** | timestamp when the course start | [optional] 
**Summary** | **string** | summary | [optional] 
**Summaryformat** | **int** | summary format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Visible** | **int** | 1: available to student, 0:not available | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

