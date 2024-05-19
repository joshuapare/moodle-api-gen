# ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Activity** | Pointer to **string** | Description of activity | [optional] [default to "null"]
**Activityattachments** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Activityformat** | Pointer to **int32** | activity format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**Allowsubmissionsfromdate** | Pointer to **int32** | allow submissions from date | [optional] [default to null]
**Attemptreopenmethod** | Pointer to **string** | method used to control opening new attempts | [optional] [default to "null"]
**Blindmarking** | Pointer to **int32** | if enabled, hide identities until reveal identities actioned | [optional] [default to null]
**Cmid** | Pointer to **int32** | course module id | [optional] 
**Completionsubmit** | Pointer to **int32** | if enabled, set activity as complete following submission | [optional] [default to null]
**Configs** | Pointer to [**[]ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner**](ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner.md) |  | [optional] 
**Course** | Pointer to **int32** | course id | [optional] 
**Cutoffdate** | Pointer to **int32** | date after which submission is not accepted without an extension | [optional] [default to null]
**Duedate** | Pointer to **int32** | assignment due date | [optional] [default to null]
**Grade** | Pointer to **int32** | grade type | [optional] [default to null]
**Gradingduedate** | Pointer to **int32** | the expected date for marking the submissions | [optional] [default to null]
**Hidegrader** | Pointer to **int32** | If enabled, hide grader to student | [optional] [default to null]
**Id** | Pointer to **int32** | assignment id | [optional] 
**Intro** | Pointer to **string** | assignment intro, not allways returned because it deppends on the activity configuration | [optional] [default to "null"]
**Introattachments** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Introfiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Introformat** | Pointer to **int32** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**Markingallocation** | Pointer to **int32** | enable marking allocation | [optional] [default to null]
**Markingworkflow** | Pointer to **int32** | enable marking workflow | [optional] [default to null]
**Maxattempts** | Pointer to **int32** | maximum number of attempts allowed | [optional] [default to null]
**Name** | Pointer to **string** | assignment name | [optional] [default to "null"]
**Nosubmissions** | Pointer to **int32** | no submissions | [optional] [default to null]
**Preventsubmissionnotingroup** | Pointer to **int32** | Prevent submission not in group | [optional] [default to null]
**Requireallteammemberssubmit** | Pointer to **int32** | if enabled, all team members must submit | [optional] [default to null]
**Requiresubmissionstatement** | Pointer to **int32** | student must accept submission statement | [optional] [default to null]
**Revealidentities** | Pointer to **int32** | show identities for a blind marking assignment | [optional] [default to null]
**Sendlatenotifications** | Pointer to **int32** | send notifications | [optional] [default to null]
**Sendnotifications** | Pointer to **int32** | send notifications | [optional] 
**Sendstudentnotifications** | Pointer to **int32** | send student notifications (default) | [optional] [default to null]
**Submissionattachments** | Pointer to **int32** | Flag to only show files during submission | [optional] [default to null]
**Submissiondrafts** | Pointer to **int32** | submissions drafts | [optional] [default to null]
**Submissionstatement** | Pointer to **string** | Submission statement formatted. | [optional] [default to "null"]
**Submissionstatementformat** | Pointer to **int32** | submissionstatement format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**Teamsubmission** | Pointer to **int32** | if enabled, students submit as a team | [optional] [default to null]
**Teamsubmissiongroupingid** | Pointer to **int32** | the grouping id for the team submission groups | [optional] [default to null]
**Timelimit** | Pointer to **int32** | Time limit to complete assigment | [optional] [default to null]
**Timemodified** | Pointer to **int32** | last time assignment was modified | [optional] [default to null]

## Methods

### NewModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner

`func NewModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner() *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner`

NewModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner instantiates a new ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerWithDefaults

`func NewModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerWithDefaults() *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner`

NewModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerWithDefaults instantiates a new ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetActivity

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetActivity() string`

GetActivity returns the Activity field if non-nil, zero value otherwise.

### GetActivityOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetActivityOk() (*string, bool)`

GetActivityOk returns a tuple with the Activity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActivity

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetActivity(v string)`

SetActivity sets Activity field to given value.

### HasActivity

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasActivity() bool`

HasActivity returns a boolean if a field has been set.

### GetActivityattachments

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetActivityattachments() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetActivityattachments returns the Activityattachments field if non-nil, zero value otherwise.

### GetActivityattachmentsOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetActivityattachmentsOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetActivityattachmentsOk returns a tuple with the Activityattachments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActivityattachments

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetActivityattachments(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetActivityattachments sets Activityattachments field to given value.

### HasActivityattachments

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasActivityattachments() bool`

HasActivityattachments returns a boolean if a field has been set.

### GetActivityformat

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetActivityformat() int32`

GetActivityformat returns the Activityformat field if non-nil, zero value otherwise.

### GetActivityformatOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetActivityformatOk() (*int32, bool)`

GetActivityformatOk returns a tuple with the Activityformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActivityformat

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetActivityformat(v int32)`

SetActivityformat sets Activityformat field to given value.

### HasActivityformat

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasActivityformat() bool`

HasActivityformat returns a boolean if a field has been set.

### GetAllowsubmissionsfromdate

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetAllowsubmissionsfromdate() int32`

GetAllowsubmissionsfromdate returns the Allowsubmissionsfromdate field if non-nil, zero value otherwise.

### GetAllowsubmissionsfromdateOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetAllowsubmissionsfromdateOk() (*int32, bool)`

GetAllowsubmissionsfromdateOk returns a tuple with the Allowsubmissionsfromdate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowsubmissionsfromdate

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetAllowsubmissionsfromdate(v int32)`

SetAllowsubmissionsfromdate sets Allowsubmissionsfromdate field to given value.

### HasAllowsubmissionsfromdate

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasAllowsubmissionsfromdate() bool`

HasAllowsubmissionsfromdate returns a boolean if a field has been set.

### GetAttemptreopenmethod

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetAttemptreopenmethod() string`

GetAttemptreopenmethod returns the Attemptreopenmethod field if non-nil, zero value otherwise.

### GetAttemptreopenmethodOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetAttemptreopenmethodOk() (*string, bool)`

GetAttemptreopenmethodOk returns a tuple with the Attemptreopenmethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttemptreopenmethod

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetAttemptreopenmethod(v string)`

SetAttemptreopenmethod sets Attemptreopenmethod field to given value.

### HasAttemptreopenmethod

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasAttemptreopenmethod() bool`

HasAttemptreopenmethod returns a boolean if a field has been set.

### GetBlindmarking

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetBlindmarking() int32`

GetBlindmarking returns the Blindmarking field if non-nil, zero value otherwise.

### GetBlindmarkingOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetBlindmarkingOk() (*int32, bool)`

GetBlindmarkingOk returns a tuple with the Blindmarking field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlindmarking

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetBlindmarking(v int32)`

SetBlindmarking sets Blindmarking field to given value.

### HasBlindmarking

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasBlindmarking() bool`

HasBlindmarking returns a boolean if a field has been set.

### GetCmid

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetCmid() int32`

GetCmid returns the Cmid field if non-nil, zero value otherwise.

### GetCmidOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetCmidOk() (*int32, bool)`

GetCmidOk returns a tuple with the Cmid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCmid

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetCmid(v int32)`

SetCmid sets Cmid field to given value.

### HasCmid

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasCmid() bool`

HasCmid returns a boolean if a field has been set.

### GetCompletionsubmit

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetCompletionsubmit() int32`

GetCompletionsubmit returns the Completionsubmit field if non-nil, zero value otherwise.

### GetCompletionsubmitOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetCompletionsubmitOk() (*int32, bool)`

GetCompletionsubmitOk returns a tuple with the Completionsubmit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionsubmit

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetCompletionsubmit(v int32)`

SetCompletionsubmit sets Completionsubmit field to given value.

### HasCompletionsubmit

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasCompletionsubmit() bool`

HasCompletionsubmit returns a boolean if a field has been set.

### GetConfigs

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetConfigs() []ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner`

GetConfigs returns the Configs field if non-nil, zero value otherwise.

### GetConfigsOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetConfigsOk() (*[]ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner, bool)`

GetConfigsOk returns a tuple with the Configs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConfigs

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetConfigs(v []ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner)`

SetConfigs sets Configs field to given value.

### HasConfigs

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasConfigs() bool`

HasConfigs returns a boolean if a field has been set.

### GetCourse

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetCourse() int32`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetCourseOk() (*int32, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetCourse(v int32)`

SetCourse sets Course field to given value.

### HasCourse

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasCourse() bool`

HasCourse returns a boolean if a field has been set.

### GetCutoffdate

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetCutoffdate() int32`

GetCutoffdate returns the Cutoffdate field if non-nil, zero value otherwise.

### GetCutoffdateOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetCutoffdateOk() (*int32, bool)`

GetCutoffdateOk returns a tuple with the Cutoffdate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCutoffdate

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetCutoffdate(v int32)`

SetCutoffdate sets Cutoffdate field to given value.

### HasCutoffdate

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasCutoffdate() bool`

HasCutoffdate returns a boolean if a field has been set.

### GetDuedate

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetDuedate() int32`

GetDuedate returns the Duedate field if non-nil, zero value otherwise.

### GetDuedateOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetDuedateOk() (*int32, bool)`

GetDuedateOk returns a tuple with the Duedate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuedate

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetDuedate(v int32)`

SetDuedate sets Duedate field to given value.

### HasDuedate

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasDuedate() bool`

HasDuedate returns a boolean if a field has been set.

### GetGrade

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetGrade() int32`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetGradeOk() (*int32, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetGrade(v int32)`

SetGrade sets Grade field to given value.

### HasGrade

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasGrade() bool`

HasGrade returns a boolean if a field has been set.

### GetGradingduedate

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetGradingduedate() int32`

GetGradingduedate returns the Gradingduedate field if non-nil, zero value otherwise.

### GetGradingduedateOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetGradingduedateOk() (*int32, bool)`

GetGradingduedateOk returns a tuple with the Gradingduedate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradingduedate

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetGradingduedate(v int32)`

SetGradingduedate sets Gradingduedate field to given value.

### HasGradingduedate

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasGradingduedate() bool`

HasGradingduedate returns a boolean if a field has been set.

### GetHidegrader

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetHidegrader() int32`

GetHidegrader returns the Hidegrader field if non-nil, zero value otherwise.

### GetHidegraderOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetHidegraderOk() (*int32, bool)`

GetHidegraderOk returns a tuple with the Hidegrader field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHidegrader

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetHidegrader(v int32)`

SetHidegrader sets Hidegrader field to given value.

### HasHidegrader

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasHidegrader() bool`

HasHidegrader returns a boolean if a field has been set.

### GetId

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIntro

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetIntro() string`

GetIntro returns the Intro field if non-nil, zero value otherwise.

### GetIntroOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetIntroOk() (*string, bool)`

GetIntroOk returns a tuple with the Intro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntro

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetIntro(v string)`

SetIntro sets Intro field to given value.

### HasIntro

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasIntro() bool`

HasIntro returns a boolean if a field has been set.

### GetIntroattachments

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetIntroattachments() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetIntroattachments returns the Introattachments field if non-nil, zero value otherwise.

### GetIntroattachmentsOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetIntroattachmentsOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetIntroattachmentsOk returns a tuple with the Introattachments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntroattachments

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetIntroattachments(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetIntroattachments sets Introattachments field to given value.

### HasIntroattachments

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasIntroattachments() bool`

HasIntroattachments returns a boolean if a field has been set.

### GetIntrofiles

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetIntrofiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetIntrofiles returns the Introfiles field if non-nil, zero value otherwise.

### GetIntrofilesOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetIntrofilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetIntrofilesOk returns a tuple with the Introfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntrofiles

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetIntrofiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetIntrofiles sets Introfiles field to given value.

### HasIntrofiles

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasIntrofiles() bool`

HasIntrofiles returns a boolean if a field has been set.

### GetIntroformat

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetIntroformat() int32`

GetIntroformat returns the Introformat field if non-nil, zero value otherwise.

### GetIntroformatOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetIntroformatOk() (*int32, bool)`

GetIntroformatOk returns a tuple with the Introformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntroformat

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetIntroformat(v int32)`

SetIntroformat sets Introformat field to given value.

### HasIntroformat

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasIntroformat() bool`

HasIntroformat returns a boolean if a field has been set.

### GetMarkingallocation

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetMarkingallocation() int32`

GetMarkingallocation returns the Markingallocation field if non-nil, zero value otherwise.

### GetMarkingallocationOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetMarkingallocationOk() (*int32, bool)`

GetMarkingallocationOk returns a tuple with the Markingallocation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMarkingallocation

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetMarkingallocation(v int32)`

SetMarkingallocation sets Markingallocation field to given value.

### HasMarkingallocation

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasMarkingallocation() bool`

HasMarkingallocation returns a boolean if a field has been set.

### GetMarkingworkflow

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetMarkingworkflow() int32`

GetMarkingworkflow returns the Markingworkflow field if non-nil, zero value otherwise.

### GetMarkingworkflowOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetMarkingworkflowOk() (*int32, bool)`

GetMarkingworkflowOk returns a tuple with the Markingworkflow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMarkingworkflow

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetMarkingworkflow(v int32)`

SetMarkingworkflow sets Markingworkflow field to given value.

### HasMarkingworkflow

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasMarkingworkflow() bool`

HasMarkingworkflow returns a boolean if a field has been set.

### GetMaxattempts

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetMaxattempts() int32`

GetMaxattempts returns the Maxattempts field if non-nil, zero value otherwise.

### GetMaxattemptsOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetMaxattemptsOk() (*int32, bool)`

GetMaxattemptsOk returns a tuple with the Maxattempts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxattempts

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetMaxattempts(v int32)`

SetMaxattempts sets Maxattempts field to given value.

### HasMaxattempts

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasMaxattempts() bool`

HasMaxattempts returns a boolean if a field has been set.

### GetName

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetNosubmissions

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetNosubmissions() int32`

GetNosubmissions returns the Nosubmissions field if non-nil, zero value otherwise.

### GetNosubmissionsOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetNosubmissionsOk() (*int32, bool)`

GetNosubmissionsOk returns a tuple with the Nosubmissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNosubmissions

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetNosubmissions(v int32)`

SetNosubmissions sets Nosubmissions field to given value.

### HasNosubmissions

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasNosubmissions() bool`

HasNosubmissions returns a boolean if a field has been set.

### GetPreventsubmissionnotingroup

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetPreventsubmissionnotingroup() int32`

GetPreventsubmissionnotingroup returns the Preventsubmissionnotingroup field if non-nil, zero value otherwise.

### GetPreventsubmissionnotingroupOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetPreventsubmissionnotingroupOk() (*int32, bool)`

GetPreventsubmissionnotingroupOk returns a tuple with the Preventsubmissionnotingroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreventsubmissionnotingroup

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetPreventsubmissionnotingroup(v int32)`

SetPreventsubmissionnotingroup sets Preventsubmissionnotingroup field to given value.

### HasPreventsubmissionnotingroup

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasPreventsubmissionnotingroup() bool`

HasPreventsubmissionnotingroup returns a boolean if a field has been set.

### GetRequireallteammemberssubmit

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetRequireallteammemberssubmit() int32`

GetRequireallteammemberssubmit returns the Requireallteammemberssubmit field if non-nil, zero value otherwise.

### GetRequireallteammemberssubmitOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetRequireallteammemberssubmitOk() (*int32, bool)`

GetRequireallteammemberssubmitOk returns a tuple with the Requireallteammemberssubmit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequireallteammemberssubmit

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetRequireallteammemberssubmit(v int32)`

SetRequireallteammemberssubmit sets Requireallteammemberssubmit field to given value.

### HasRequireallteammemberssubmit

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasRequireallteammemberssubmit() bool`

HasRequireallteammemberssubmit returns a boolean if a field has been set.

### GetRequiresubmissionstatement

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetRequiresubmissionstatement() int32`

GetRequiresubmissionstatement returns the Requiresubmissionstatement field if non-nil, zero value otherwise.

### GetRequiresubmissionstatementOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetRequiresubmissionstatementOk() (*int32, bool)`

GetRequiresubmissionstatementOk returns a tuple with the Requiresubmissionstatement field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequiresubmissionstatement

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetRequiresubmissionstatement(v int32)`

SetRequiresubmissionstatement sets Requiresubmissionstatement field to given value.

### HasRequiresubmissionstatement

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasRequiresubmissionstatement() bool`

HasRequiresubmissionstatement returns a boolean if a field has been set.

### GetRevealidentities

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetRevealidentities() int32`

GetRevealidentities returns the Revealidentities field if non-nil, zero value otherwise.

### GetRevealidentitiesOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetRevealidentitiesOk() (*int32, bool)`

GetRevealidentitiesOk returns a tuple with the Revealidentities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRevealidentities

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetRevealidentities(v int32)`

SetRevealidentities sets Revealidentities field to given value.

### HasRevealidentities

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasRevealidentities() bool`

HasRevealidentities returns a boolean if a field has been set.

### GetSendlatenotifications

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetSendlatenotifications() int32`

GetSendlatenotifications returns the Sendlatenotifications field if non-nil, zero value otherwise.

### GetSendlatenotificationsOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetSendlatenotificationsOk() (*int32, bool)`

GetSendlatenotificationsOk returns a tuple with the Sendlatenotifications field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSendlatenotifications

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetSendlatenotifications(v int32)`

SetSendlatenotifications sets Sendlatenotifications field to given value.

### HasSendlatenotifications

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasSendlatenotifications() bool`

HasSendlatenotifications returns a boolean if a field has been set.

### GetSendnotifications

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetSendnotifications() int32`

GetSendnotifications returns the Sendnotifications field if non-nil, zero value otherwise.

### GetSendnotificationsOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetSendnotificationsOk() (*int32, bool)`

GetSendnotificationsOk returns a tuple with the Sendnotifications field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSendnotifications

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetSendnotifications(v int32)`

SetSendnotifications sets Sendnotifications field to given value.

### HasSendnotifications

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasSendnotifications() bool`

HasSendnotifications returns a boolean if a field has been set.

### GetSendstudentnotifications

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetSendstudentnotifications() int32`

GetSendstudentnotifications returns the Sendstudentnotifications field if non-nil, zero value otherwise.

### GetSendstudentnotificationsOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetSendstudentnotificationsOk() (*int32, bool)`

GetSendstudentnotificationsOk returns a tuple with the Sendstudentnotifications field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSendstudentnotifications

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetSendstudentnotifications(v int32)`

SetSendstudentnotifications sets Sendstudentnotifications field to given value.

### HasSendstudentnotifications

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasSendstudentnotifications() bool`

HasSendstudentnotifications returns a boolean if a field has been set.

### GetSubmissionattachments

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetSubmissionattachments() int32`

GetSubmissionattachments returns the Submissionattachments field if non-nil, zero value otherwise.

### GetSubmissionattachmentsOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetSubmissionattachmentsOk() (*int32, bool)`

GetSubmissionattachmentsOk returns a tuple with the Submissionattachments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissionattachments

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetSubmissionattachments(v int32)`

SetSubmissionattachments sets Submissionattachments field to given value.

### HasSubmissionattachments

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasSubmissionattachments() bool`

HasSubmissionattachments returns a boolean if a field has been set.

### GetSubmissiondrafts

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetSubmissiondrafts() int32`

GetSubmissiondrafts returns the Submissiondrafts field if non-nil, zero value otherwise.

### GetSubmissiondraftsOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetSubmissiondraftsOk() (*int32, bool)`

GetSubmissiondraftsOk returns a tuple with the Submissiondrafts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissiondrafts

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetSubmissiondrafts(v int32)`

SetSubmissiondrafts sets Submissiondrafts field to given value.

### HasSubmissiondrafts

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasSubmissiondrafts() bool`

HasSubmissiondrafts returns a boolean if a field has been set.

### GetSubmissionstatement

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetSubmissionstatement() string`

GetSubmissionstatement returns the Submissionstatement field if non-nil, zero value otherwise.

### GetSubmissionstatementOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetSubmissionstatementOk() (*string, bool)`

GetSubmissionstatementOk returns a tuple with the Submissionstatement field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissionstatement

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetSubmissionstatement(v string)`

SetSubmissionstatement sets Submissionstatement field to given value.

### HasSubmissionstatement

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasSubmissionstatement() bool`

HasSubmissionstatement returns a boolean if a field has been set.

### GetSubmissionstatementformat

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetSubmissionstatementformat() int32`

GetSubmissionstatementformat returns the Submissionstatementformat field if non-nil, zero value otherwise.

### GetSubmissionstatementformatOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetSubmissionstatementformatOk() (*int32, bool)`

GetSubmissionstatementformatOk returns a tuple with the Submissionstatementformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissionstatementformat

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetSubmissionstatementformat(v int32)`

SetSubmissionstatementformat sets Submissionstatementformat field to given value.

### HasSubmissionstatementformat

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasSubmissionstatementformat() bool`

HasSubmissionstatementformat returns a boolean if a field has been set.

### GetTeamsubmission

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetTeamsubmission() int32`

GetTeamsubmission returns the Teamsubmission field if non-nil, zero value otherwise.

### GetTeamsubmissionOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetTeamsubmissionOk() (*int32, bool)`

GetTeamsubmissionOk returns a tuple with the Teamsubmission field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeamsubmission

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetTeamsubmission(v int32)`

SetTeamsubmission sets Teamsubmission field to given value.

### HasTeamsubmission

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasTeamsubmission() bool`

HasTeamsubmission returns a boolean if a field has been set.

### GetTeamsubmissiongroupingid

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetTeamsubmissiongroupingid() int32`

GetTeamsubmissiongroupingid returns the Teamsubmissiongroupingid field if non-nil, zero value otherwise.

### GetTeamsubmissiongroupingidOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetTeamsubmissiongroupingidOk() (*int32, bool)`

GetTeamsubmissiongroupingidOk returns a tuple with the Teamsubmissiongroupingid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeamsubmissiongroupingid

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetTeamsubmissiongroupingid(v int32)`

SetTeamsubmissiongroupingid sets Teamsubmissiongroupingid field to given value.

### HasTeamsubmissiongroupingid

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasTeamsubmissiongroupingid() bool`

HasTeamsubmissiongroupingid returns a boolean if a field has been set.

### GetTimelimit

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetTimelimit() int32`

GetTimelimit returns the Timelimit field if non-nil, zero value otherwise.

### GetTimelimitOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetTimelimitOk() (*int32, bool)`

GetTimelimitOk returns a tuple with the Timelimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimelimit

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetTimelimit(v int32)`

SetTimelimit sets Timelimit field to given value.

### HasTimelimit

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasTimelimit() bool`

HasTimelimit returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


