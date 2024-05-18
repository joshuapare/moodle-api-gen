# ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner

assignment information object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activity** | **str** | Description of activity | [optional] [default to 'null']
**activityattachments** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**activityformat** | **int** | activity format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**allowsubmissionsfromdate** | **int** | allow submissions from date | [optional] [default to null]
**attemptreopenmethod** | **str** | method used to control opening new attempts | [optional] [default to 'null']
**blindmarking** | **int** | if enabled, hide identities until reveal identities actioned | [optional] [default to null]
**cmid** | **int** | course module id | [optional] 
**completionsubmit** | **int** | if enabled, set activity as complete following submission | [optional] [default to null]
**configs** | [**List[ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner]**](ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner.md) |  | [optional] 
**course** | **int** | course id | [optional] 
**cutoffdate** | **int** | date after which submission is not accepted without an extension | [optional] [default to null]
**duedate** | **int** | assignment due date | [optional] [default to null]
**grade** | **int** | grade type | [optional] [default to null]
**gradingduedate** | **int** | the expected date for marking the submissions | [optional] [default to null]
**hidegrader** | **int** | If enabled, hide grader to student | [optional] [default to null]
**id** | **int** | assignment id | [optional] 
**intro** | **str** | assignment intro, not allways returned because it deppends on the activity configuration | [optional] [default to 'null']
**introattachments** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**introfiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**markingallocation** | **int** | enable marking allocation | [optional] [default to null]
**markingworkflow** | **int** | enable marking workflow | [optional] [default to null]
**maxattempts** | **int** | maximum number of attempts allowed | [optional] [default to null]
**name** | **str** | assignment name | [optional] [default to 'null']
**nosubmissions** | **int** | no submissions | [optional] [default to null]
**preventsubmissionnotingroup** | **int** | Prevent submission not in group | [optional] [default to null]
**requireallteammemberssubmit** | **int** | if enabled, all team members must submit | [optional] [default to null]
**requiresubmissionstatement** | **int** | student must accept submission statement | [optional] [default to null]
**revealidentities** | **int** | show identities for a blind marking assignment | [optional] [default to null]
**sendlatenotifications** | **int** | send notifications | [optional] [default to null]
**sendnotifications** | **int** | send notifications | [optional] 
**sendstudentnotifications** | **int** | send student notifications (default) | [optional] [default to null]
**submissionattachments** | **int** | Flag to only show files during submission | [optional] [default to null]
**submissiondrafts** | **int** | submissions drafts | [optional] [default to null]
**submissionstatement** | **str** | Submission statement formatted. | [optional] [default to 'null']
**submissionstatementformat** | **int** | submissionstatement format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**teamsubmission** | **int** | if enabled, students submit as a team | [optional] [default to null]
**teamsubmissiongroupingid** | **int** | the grouping id for the team submission groups | [optional] [default to null]
**timelimit** | **int** | Time limit to complete assigment | [optional] [default to null]
**timemodified** | **int** | last time assignment was modified | [optional] [default to null]

## Example

```python
from openapi_client.models.mod_assign_get_assignments200_response_courses_inner_assignments_inner import ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner from a JSON string
mod_assign_get_assignments200_response_courses_inner_assignments_inner_instance = ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner.to_json())

# convert the object into a dict
mod_assign_get_assignments200_response_courses_inner_assignments_inner_dict = mod_assign_get_assignments200_response_courses_inner_assignments_inner_instance.to_dict()
# create an instance of ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner from a dict
mod_assign_get_assignments200_response_courses_inner_assignments_inner_from_dict = ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner.from_dict(mod_assign_get_assignments200_response_courses_inner_assignments_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


