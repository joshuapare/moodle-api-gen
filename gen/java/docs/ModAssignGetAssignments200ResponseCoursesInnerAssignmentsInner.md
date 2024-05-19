

# ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner

assignment information object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activity** | **String** | Description of activity |  [optional] |
|**activityattachments** | [**List&lt;CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner&gt;**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  |  [optional] |
|**activityformat** | **Integer** | activity format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |  [optional] |
|**allowsubmissionsfromdate** | **Integer** | allow submissions from date |  [optional] |
|**attemptreopenmethod** | **String** | method used to control opening new attempts |  [optional] |
|**blindmarking** | **Integer** | if enabled, hide identities until reveal identities actioned |  [optional] |
|**cmid** | **Integer** | course module id |  [optional] |
|**completionsubmit** | **Integer** | if enabled, set activity as complete following submission |  [optional] |
|**configs** | [**List&lt;ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner&gt;**](ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner.md) |  |  [optional] |
|**course** | **Integer** | course id |  [optional] |
|**cutoffdate** | **Integer** | date after which submission is not accepted without an extension |  [optional] |
|**duedate** | **Integer** | assignment due date |  [optional] |
|**grade** | **Integer** | grade type |  [optional] |
|**gradingduedate** | **Integer** | the expected date for marking the submissions |  [optional] |
|**hidegrader** | **Integer** | If enabled, hide grader to student |  [optional] |
|**id** | **Integer** | assignment id |  [optional] |
|**intro** | **String** | assignment intro, not allways returned because it deppends on the activity configuration |  [optional] |
|**introattachments** | [**List&lt;CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner&gt;**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  |  [optional] |
|**introfiles** | [**List&lt;CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner&gt;**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  |  [optional] |
|**introformat** | **Integer** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |  [optional] |
|**markingallocation** | **Integer** | enable marking allocation |  [optional] |
|**markingworkflow** | **Integer** | enable marking workflow |  [optional] |
|**maxattempts** | **Integer** | maximum number of attempts allowed |  [optional] |
|**name** | **String** | assignment name |  [optional] |
|**nosubmissions** | **Integer** | no submissions |  [optional] |
|**preventsubmissionnotingroup** | **Integer** | Prevent submission not in group |  [optional] |
|**requireallteammemberssubmit** | **Integer** | if enabled, all team members must submit |  [optional] |
|**requiresubmissionstatement** | **Integer** | student must accept submission statement |  [optional] |
|**revealidentities** | **Integer** | show identities for a blind marking assignment |  [optional] |
|**sendlatenotifications** | **Integer** | send notifications |  [optional] |
|**sendnotifications** | **Integer** | send notifications |  [optional] |
|**sendstudentnotifications** | **Integer** | send student notifications (default) |  [optional] |
|**submissionattachments** | **Integer** | Flag to only show files during submission |  [optional] |
|**submissiondrafts** | **Integer** | submissions drafts |  [optional] |
|**submissionstatement** | **String** | Submission statement formatted. |  [optional] |
|**submissionstatementformat** | **Integer** | submissionstatement format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |  [optional] |
|**teamsubmission** | **Integer** | if enabled, students submit as a team |  [optional] |
|**teamsubmissiongroupingid** | **Integer** | the grouping id for the team submission groups |  [optional] |
|**timelimit** | **Integer** | Time limit to complete assigment |  [optional] |
|**timemodified** | **Integer** | last time assignment was modified |  [optional] |



