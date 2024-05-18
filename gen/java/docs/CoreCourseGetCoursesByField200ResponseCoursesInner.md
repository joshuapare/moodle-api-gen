

# CoreCourseGetCoursesByField200ResponseCoursesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cacherev** | **Integer** | Cache revision number |  [optional] |
|**calendartype** | **String** | Calendar type |  [optional] |
|**categoryid** | **Integer** | category id |  [optional] |
|**categoryname** | **String** | category name |  [optional] |
|**completionnotify** | **Integer** | 1: yes 0: no |  [optional] |
|**contacts** | [**List&lt;CoreCourseGetCoursesByField200ResponseCoursesInnerContactsInner&gt;**](CoreCourseGetCoursesByField200ResponseCoursesInnerContactsInner.md) |  |  [optional] |
|**courseformatoptions** | [**List&lt;CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInner&gt;**](CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInner.md) |  |  [optional] |
|**courseimage** | **String** | Course image |  [optional] |
|**customfields** | [**List&lt;CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner&gt;**](CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner.md) |  |  [optional] |
|**defaultgroupingid** | **Integer** | default grouping id |  [optional] |
|**displayname** | **String** | course display name |  [optional] |
|**enablecompletion** | **Integer** | Completion enabled? 1: yes 0: no |  [optional] |
|**enddate** | **Integer** | Timestamp when the course end |  [optional] |
|**enrollmentmethods** | **List&lt;Object&gt;** |  |  [optional] |
|**filters** | [**List&lt;CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner&gt;**](CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner.md) |  |  [optional] |
|**format** | **String** | Course format: weeks, topics, social, site,.. |  [optional] |
|**fullname** | **String** | course full name |  [optional] |
|**groupmode** | **Integer** | no group, separate, visible |  [optional] |
|**groupmodeforce** | **Integer** | 1: yes, 0: no |  [optional] |
|**id** | **Integer** | course id |  [optional] |
|**idnumber** | **String** | Id number |  [optional] |
|**lang** | **String** | Forced course language |  [optional] |
|**legacyfiles** | **Integer** | If legacy files are enabled |  [optional] |
|**marker** | **Integer** | Current course marker |  [optional] |
|**maxbytes** | **Integer** | Largest size of file that can be uploaded into |  [optional] |
|**newsitems** | **Integer** | Number of recent items appearing on the course page |  [optional] |
|**overviewfiles** | [**List&lt;CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner&gt;**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  |  [optional] |
|**requested** | **Integer** | If is a requested course |  [optional] |
|**shortname** | **String** | course short name |  [optional] |
|**showactivitydates** | **Boolean** | Whether the activity dates are shown or not |  [optional] |
|**showcompletionconditions** | **Boolean** | Whether the activity completion conditions are shown or not |  [optional] |
|**showgrades** | **Integer** | 1 if grades are shown, otherwise 0 |  [optional] |
|**showreports** | **Integer** | Are activity report shown (yes &#x3D; 1, no &#x3D;0) |  [optional] |
|**sortorder** | **Integer** | Sort order in the category |  [optional] |
|**startdate** | **Integer** | Timestamp when the course start |  [optional] |
|**summary** | **String** | summary |  [optional] |
|**summaryfiles** | [**List&lt;CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner&gt;**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  |  [optional] |
|**summaryformat** | **Integer** | summary format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |  [optional] |
|**theme** | **String** | Fame of the forced theme |  [optional] |
|**timecreated** | **Integer** | Time when the course was created |  [optional] |
|**timemodified** | **Integer** | Last time  the course was updated |  [optional] |
|**visible** | **Integer** | 1: available to student, 0:not available |  [optional] |



