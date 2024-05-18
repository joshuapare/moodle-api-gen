# Org.OpenAPITools.Model.ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
assignment information object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Activity** | **string** | Description of activity | [optional] [default to "null"]
**Activityattachments** | [**List&lt;CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner&gt;**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Activityformat** | **int** | activity format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**Allowsubmissionsfromdate** | **int** | allow submissions from date | [optional] [default to null]
**Attemptreopenmethod** | **string** | method used to control opening new attempts | [optional] [default to "null"]
**Blindmarking** | **int** | if enabled, hide identities until reveal identities actioned | [optional] [default to null]
**Cmid** | **int** | course module id | [optional] 
**Completionsubmit** | **int** | if enabled, set activity as complete following submission | [optional] [default to null]
**Configs** | [**List&lt;ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner&gt;**](ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner.md) |  | [optional] 
**Course** | **int** | course id | [optional] 
**Cutoffdate** | **int** | date after which submission is not accepted without an extension | [optional] [default to null]
**Duedate** | **int** | assignment due date | [optional] [default to null]
**Grade** | **int** | grade type | [optional] [default to null]
**Gradingduedate** | **int** | the expected date for marking the submissions | [optional] [default to null]
**Hidegrader** | **int** | If enabled, hide grader to student | [optional] [default to null]
**Id** | **int** | assignment id | [optional] 
**Intro** | **string** | assignment intro, not allways returned because it deppends on the activity configuration | [optional] [default to "null"]
**Introattachments** | [**List&lt;CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner&gt;**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Introfiles** | [**List&lt;CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner&gt;**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**Markingallocation** | **int** | enable marking allocation | [optional] [default to null]
**Markingworkflow** | **int** | enable marking workflow | [optional] [default to null]
**Maxattempts** | **int** | maximum number of attempts allowed | [optional] [default to null]
**Name** | **string** | assignment name | [optional] [default to "null"]
**Nosubmissions** | **int** | no submissions | [optional] [default to null]
**Preventsubmissionnotingroup** | **int** | Prevent submission not in group | [optional] [default to null]
**Requireallteammemberssubmit** | **int** | if enabled, all team members must submit | [optional] [default to null]
**Requiresubmissionstatement** | **int** | student must accept submission statement | [optional] [default to null]
**Revealidentities** | **int** | show identities for a blind marking assignment | [optional] [default to null]
**Sendlatenotifications** | **int** | send notifications | [optional] [default to null]
**Sendnotifications** | **int** | send notifications | [optional] 
**Sendstudentnotifications** | **int** | send student notifications (default) | [optional] [default to null]
**Submissionattachments** | **int** | Flag to only show files during submission | [optional] [default to null]
**Submissiondrafts** | **int** | submissions drafts | [optional] [default to null]
**Submissionstatement** | **string** | Submission statement formatted. | [optional] [default to "null"]
**Submissionstatementformat** | **int** | submissionstatement format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**Teamsubmission** | **int** | if enabled, students submit as a team | [optional] [default to null]
**Teamsubmissiongroupingid** | **int** | the grouping id for the team submission groups | [optional] [default to null]
**Timelimit** | **int** | Time limit to complete assigment | [optional] [default to null]
**Timemodified** | **int** | last time assignment was modified | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

