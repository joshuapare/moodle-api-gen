# ModAssignGetSubmissionStatus200ResponseLastattempt

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Blindmarking** | **bool** | Whether blind marking is enabled. | [default to null]
**Canedit** | **bool** | Whether the user can edit the current submission. | [default to null]
**Caneditowner** | **bool** | Whether the owner of the submission can edit it. | [default to null]
**Cansubmit** | **bool** | Whether the user can submit. | [default to null]
**Extensionduedate** | **int32** | Extension due date. | [default to null]
**Graded** | **bool** | Whether the submission is graded. | [default to null]
**Gradingstatus** | **string** | Grading status. | [default to "null"]
**Locked** | **bool** | Whether new submissions are locked. | [default to null]
**Submission** | Pointer to [**ModAssignGetSubmissionStatus200ResponseLastattemptSubmission**](ModAssignGetSubmissionStatus200ResponseLastattemptSubmission.md) |  | [optional] 
**Submissiongroup** | Pointer to **int32** | The submission group id (for group submissions only). | [optional] [default to null]
**Submissiongroupmemberswhoneedtosubmit** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Submissionsenabled** | **bool** | Whether submissions are enabled or not. | 
**Teamsubmission** | Pointer to [**ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission**](ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.md) |  | [optional] 
**Timelimit** | Pointer to **int32** | Time limit for submission. | [optional] [default to null]
**Usergroups** | **[]map[string]interface{}** |  | 

## Methods

### NewModAssignGetSubmissionStatus200ResponseLastattempt

`func NewModAssignGetSubmissionStatus200ResponseLastattempt(blindmarking bool, canedit bool, caneditowner bool, cansubmit bool, extensionduedate int32, graded bool, gradingstatus string, locked bool, submissionsenabled bool, usergroups []map[string]interface{}, ) *ModAssignGetSubmissionStatus200ResponseLastattempt`

NewModAssignGetSubmissionStatus200ResponseLastattempt instantiates a new ModAssignGetSubmissionStatus200ResponseLastattempt object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignGetSubmissionStatus200ResponseLastattemptWithDefaults

`func NewModAssignGetSubmissionStatus200ResponseLastattemptWithDefaults() *ModAssignGetSubmissionStatus200ResponseLastattempt`

NewModAssignGetSubmissionStatus200ResponseLastattemptWithDefaults instantiates a new ModAssignGetSubmissionStatus200ResponseLastattempt object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBlindmarking

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetBlindmarking() bool`

GetBlindmarking returns the Blindmarking field if non-nil, zero value otherwise.

### GetBlindmarkingOk

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetBlindmarkingOk() (*bool, bool)`

GetBlindmarkingOk returns a tuple with the Blindmarking field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlindmarking

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) SetBlindmarking(v bool)`

SetBlindmarking sets Blindmarking field to given value.


### GetCanedit

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetCanedit() bool`

GetCanedit returns the Canedit field if non-nil, zero value otherwise.

### GetCaneditOk

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetCaneditOk() (*bool, bool)`

GetCaneditOk returns a tuple with the Canedit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanedit

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) SetCanedit(v bool)`

SetCanedit sets Canedit field to given value.


### GetCaneditowner

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetCaneditowner() bool`

GetCaneditowner returns the Caneditowner field if non-nil, zero value otherwise.

### GetCaneditownerOk

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetCaneditownerOk() (*bool, bool)`

GetCaneditownerOk returns a tuple with the Caneditowner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCaneditowner

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) SetCaneditowner(v bool)`

SetCaneditowner sets Caneditowner field to given value.


### GetCansubmit

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetCansubmit() bool`

GetCansubmit returns the Cansubmit field if non-nil, zero value otherwise.

### GetCansubmitOk

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetCansubmitOk() (*bool, bool)`

GetCansubmitOk returns a tuple with the Cansubmit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCansubmit

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) SetCansubmit(v bool)`

SetCansubmit sets Cansubmit field to given value.


### GetExtensionduedate

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetExtensionduedate() int32`

GetExtensionduedate returns the Extensionduedate field if non-nil, zero value otherwise.

### GetExtensionduedateOk

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetExtensionduedateOk() (*int32, bool)`

GetExtensionduedateOk returns a tuple with the Extensionduedate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExtensionduedate

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) SetExtensionduedate(v int32)`

SetExtensionduedate sets Extensionduedate field to given value.


### GetGraded

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetGraded() bool`

GetGraded returns the Graded field if non-nil, zero value otherwise.

### GetGradedOk

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetGradedOk() (*bool, bool)`

GetGradedOk returns a tuple with the Graded field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGraded

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) SetGraded(v bool)`

SetGraded sets Graded field to given value.


### GetGradingstatus

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetGradingstatus() string`

GetGradingstatus returns the Gradingstatus field if non-nil, zero value otherwise.

### GetGradingstatusOk

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetGradingstatusOk() (*string, bool)`

GetGradingstatusOk returns a tuple with the Gradingstatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradingstatus

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) SetGradingstatus(v string)`

SetGradingstatus sets Gradingstatus field to given value.


### GetLocked

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetLocked() bool`

GetLocked returns the Locked field if non-nil, zero value otherwise.

### GetLockedOk

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetLockedOk() (*bool, bool)`

GetLockedOk returns a tuple with the Locked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocked

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) SetLocked(v bool)`

SetLocked sets Locked field to given value.


### GetSubmission

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetSubmission() ModAssignGetSubmissionStatus200ResponseLastattemptSubmission`

GetSubmission returns the Submission field if non-nil, zero value otherwise.

### GetSubmissionOk

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetSubmissionOk() (*ModAssignGetSubmissionStatus200ResponseLastattemptSubmission, bool)`

GetSubmissionOk returns a tuple with the Submission field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmission

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) SetSubmission(v ModAssignGetSubmissionStatus200ResponseLastattemptSubmission)`

SetSubmission sets Submission field to given value.

### HasSubmission

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) HasSubmission() bool`

HasSubmission returns a boolean if a field has been set.

### GetSubmissiongroup

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetSubmissiongroup() int32`

GetSubmissiongroup returns the Submissiongroup field if non-nil, zero value otherwise.

### GetSubmissiongroupOk

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetSubmissiongroupOk() (*int32, bool)`

GetSubmissiongroupOk returns a tuple with the Submissiongroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissiongroup

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) SetSubmissiongroup(v int32)`

SetSubmissiongroup sets Submissiongroup field to given value.

### HasSubmissiongroup

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) HasSubmissiongroup() bool`

HasSubmissiongroup returns a boolean if a field has been set.

### GetSubmissiongroupmemberswhoneedtosubmit

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetSubmissiongroupmemberswhoneedtosubmit() []map[string]interface{}`

GetSubmissiongroupmemberswhoneedtosubmit returns the Submissiongroupmemberswhoneedtosubmit field if non-nil, zero value otherwise.

### GetSubmissiongroupmemberswhoneedtosubmitOk

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetSubmissiongroupmemberswhoneedtosubmitOk() (*[]map[string]interface{}, bool)`

GetSubmissiongroupmemberswhoneedtosubmitOk returns a tuple with the Submissiongroupmemberswhoneedtosubmit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissiongroupmemberswhoneedtosubmit

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) SetSubmissiongroupmemberswhoneedtosubmit(v []map[string]interface{})`

SetSubmissiongroupmemberswhoneedtosubmit sets Submissiongroupmemberswhoneedtosubmit field to given value.

### HasSubmissiongroupmemberswhoneedtosubmit

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) HasSubmissiongroupmemberswhoneedtosubmit() bool`

HasSubmissiongroupmemberswhoneedtosubmit returns a boolean if a field has been set.

### GetSubmissionsenabled

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetSubmissionsenabled() bool`

GetSubmissionsenabled returns the Submissionsenabled field if non-nil, zero value otherwise.

### GetSubmissionsenabledOk

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetSubmissionsenabledOk() (*bool, bool)`

GetSubmissionsenabledOk returns a tuple with the Submissionsenabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissionsenabled

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) SetSubmissionsenabled(v bool)`

SetSubmissionsenabled sets Submissionsenabled field to given value.


### GetTeamsubmission

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetTeamsubmission() ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission`

GetTeamsubmission returns the Teamsubmission field if non-nil, zero value otherwise.

### GetTeamsubmissionOk

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetTeamsubmissionOk() (*ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission, bool)`

GetTeamsubmissionOk returns a tuple with the Teamsubmission field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeamsubmission

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) SetTeamsubmission(v ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission)`

SetTeamsubmission sets Teamsubmission field to given value.

### HasTeamsubmission

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) HasTeamsubmission() bool`

HasTeamsubmission returns a boolean if a field has been set.

### GetTimelimit

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetTimelimit() int32`

GetTimelimit returns the Timelimit field if non-nil, zero value otherwise.

### GetTimelimitOk

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetTimelimitOk() (*int32, bool)`

GetTimelimitOk returns a tuple with the Timelimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimelimit

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) SetTimelimit(v int32)`

SetTimelimit sets Timelimit field to given value.

### HasTimelimit

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) HasTimelimit() bool`

HasTimelimit returns a boolean if a field has been set.

### GetUsergroups

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetUsergroups() []map[string]interface{}`

GetUsergroups returns the Usergroups field if non-nil, zero value otherwise.

### GetUsergroupsOk

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) GetUsergroupsOk() (*[]map[string]interface{}, bool)`

GetUsergroupsOk returns a tuple with the Usergroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsergroups

`func (o *ModAssignGetSubmissionStatus200ResponseLastattempt) SetUsergroups(v []map[string]interface{})`

SetUsergroups sets Usergroups field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


