# ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activity** | Option<**String**> | Description of activity | [optional][default to null]
**activityattachments** | Option<[**Vec<models::CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>**](core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner.md)> |  | [optional]
**activityformat** | Option<**i32**> | activity format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to null]
**allowsubmissionsfromdate** | Option<**i32**> | allow submissions from date | [optional][default to null]
**attemptreopenmethod** | Option<**String**> | method used to control opening new attempts | [optional][default to null]
**blindmarking** | Option<**i32**> | if enabled, hide identities until reveal identities actioned | [optional][default to null]
**cmid** | Option<**i32**> | course module id | [optional]
**completionsubmit** | Option<**i32**> | if enabled, set activity as complete following submission | [optional][default to null]
**configs** | Option<[**Vec<models::ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner>**](mod_assign_get_assignments_200_response_courses_inner_assignments_inner_configs_inner.md)> |  | [optional]
**course** | Option<**i32**> | course id | [optional]
**cutoffdate** | Option<**i32**> | date after which submission is not accepted without an extension | [optional][default to null]
**duedate** | Option<**i32**> | assignment due date | [optional][default to null]
**grade** | Option<**i32**> | grade type | [optional][default to null]
**gradingduedate** | Option<**i32**> | the expected date for marking the submissions | [optional][default to null]
**hidegrader** | Option<**i32**> | If enabled, hide grader to student | [optional][default to null]
**id** | Option<**i32**> | assignment id | [optional]
**intro** | Option<**String**> | assignment intro, not allways returned because it deppends on the activity configuration | [optional][default to null]
**introattachments** | Option<[**Vec<models::CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>**](core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner.md)> |  | [optional]
**introfiles** | Option<[**Vec<models::CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>**](core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner.md)> |  | [optional]
**introformat** | Option<**i32**> | intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to null]
**markingallocation** | Option<**i32**> | enable marking allocation | [optional][default to null]
**markingworkflow** | Option<**i32**> | enable marking workflow | [optional][default to null]
**maxattempts** | Option<**i32**> | maximum number of attempts allowed | [optional][default to null]
**name** | Option<**String**> | assignment name | [optional][default to null]
**nosubmissions** | Option<**i32**> | no submissions | [optional][default to null]
**preventsubmissionnotingroup** | Option<**i32**> | Prevent submission not in group | [optional][default to null]
**requireallteammemberssubmit** | Option<**i32**> | if enabled, all team members must submit | [optional][default to null]
**requiresubmissionstatement** | Option<**i32**> | student must accept submission statement | [optional][default to null]
**revealidentities** | Option<**i32**> | show identities for a blind marking assignment | [optional][default to null]
**sendlatenotifications** | Option<**i32**> | send notifications | [optional][default to null]
**sendnotifications** | Option<**i32**> | send notifications | [optional]
**sendstudentnotifications** | Option<**i32**> | send student notifications (default) | [optional][default to null]
**submissionattachments** | Option<**i32**> | Flag to only show files during submission | [optional][default to null]
**submissiondrafts** | Option<**i32**> | submissions drafts | [optional][default to null]
**submissionstatement** | Option<**String**> | Submission statement formatted. | [optional][default to null]
**submissionstatementformat** | Option<**i32**> | submissionstatement format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to null]
**teamsubmission** | Option<**i32**> | if enabled, students submit as a team | [optional][default to null]
**teamsubmissiongroupingid** | Option<**i32**> | the grouping id for the team submission groups | [optional][default to null]
**timelimit** | Option<**i32**> | Time limit to complete assigment | [optional][default to null]
**timemodified** | Option<**i32**> | last time assignment was modified | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


