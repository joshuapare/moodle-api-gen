

# CoreCourseCreateCoursesRequestCoursesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**categoryid** | **Integer** | category id |  [optional] |
|**completionnotify** | **Integer** | 1: yes 0: no |  [optional] |
|**courseformatoptions** | [**List&lt;CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner&gt;**](CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner.md) |  |  [optional] |
|**customfields** | [**List&lt;CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner&gt;**](CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner.md) |  |  [optional] |
|**defaultgroupingid** | **Integer** | default grouping id |  [optional] |
|**enablecompletion** | **Integer** | Enabled, control via completion and activity settings. Disabled,                                         not shown in activity settings. |  [optional] |
|**enddate** | **Integer** | timestamp when the course end |  [optional] |
|**forcetheme** | **String** | name of the force theme |  [optional] |
|**format** | **String** | course format: weeks, topics, social, site,.. |  [optional] |
|**fullname** | **String** | full name |  [optional] |
|**groupmode** | **Integer** | no group, separate, visible |  [optional] |
|**groupmodeforce** | **Integer** | 1: yes, 0: no |  [optional] |
|**hiddensections** | **Integer** | (deprecated, use courseformatoptions) How the hidden sections in the course are displayed to students |  [optional] |
|**idnumber** | **String** | id number |  [optional] |
|**lang** | **String** | forced course language |  [optional] |
|**maxbytes** | **Integer** | largest size of file that can be uploaded into the course |  [optional] |
|**newsitems** | **Integer** | number of recent items appearing on the course page |  [optional] |
|**numsections** | **Integer** | (deprecated, use courseformatoptions) number of weeks/topics |  [optional] |
|**shortname** | **String** | course short name |  [optional] |
|**showgrades** | **Integer** | 1 if grades are shown, otherwise 0 |  [optional] |
|**showreports** | **Integer** | are activity report shown (yes &#x3D; 1, no &#x3D;0) |  [optional] |
|**startdate** | **Integer** | timestamp when the course start |  [optional] |
|**summary** | **String** | summary |  [optional] |
|**summaryformat** | **Integer** | summary format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |  [optional] |
|**visible** | **Integer** | 1: available to student, 0:not available |  [optional] |



