# ModAssignSaveGradeRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Addattempt** | **bool** | Allow another attempt if the attempt reopen method is manual | [default to null]
**Advancedgradingdata** | Pointer to [**ModAssignSaveGradeRequestAdvancedgradingdata**](ModAssignSaveGradeRequestAdvancedgradingdata.md) |  | [optional] 
**Applytoall** | **bool** | If true, this grade will be applied to all members of the group (for group assignments). | [default to null]
**Assignmentid** | **int32** | The assignment id to operate on | 
**Attemptnumber** | **int32** | The attempt number (-1 means latest attempt) | [default to null]
**Grade** | **float32** | The new grade for this user. Ignored if advanced grading used | [default to null]
**Plugindata** | Pointer to [**ModAssignSaveGradeRequestPlugindata**](ModAssignSaveGradeRequestPlugindata.md) |  | [optional] 
**Userid** | **int32** | The student id to operate on | [default to null]
**Workflowstate** | **string** | The next marking workflow state | [default to "null"]

## Methods

### NewModAssignSaveGradeRequest

`func NewModAssignSaveGradeRequest(addattempt bool, applytoall bool, assignmentid int32, attemptnumber int32, grade float32, userid int32, workflowstate string, ) *ModAssignSaveGradeRequest`

NewModAssignSaveGradeRequest instantiates a new ModAssignSaveGradeRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignSaveGradeRequestWithDefaults

`func NewModAssignSaveGradeRequestWithDefaults() *ModAssignSaveGradeRequest`

NewModAssignSaveGradeRequestWithDefaults instantiates a new ModAssignSaveGradeRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAddattempt

`func (o *ModAssignSaveGradeRequest) GetAddattempt() bool`

GetAddattempt returns the Addattempt field if non-nil, zero value otherwise.

### GetAddattemptOk

`func (o *ModAssignSaveGradeRequest) GetAddattemptOk() (*bool, bool)`

GetAddattemptOk returns a tuple with the Addattempt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddattempt

`func (o *ModAssignSaveGradeRequest) SetAddattempt(v bool)`

SetAddattempt sets Addattempt field to given value.


### GetAdvancedgradingdata

`func (o *ModAssignSaveGradeRequest) GetAdvancedgradingdata() ModAssignSaveGradeRequestAdvancedgradingdata`

GetAdvancedgradingdata returns the Advancedgradingdata field if non-nil, zero value otherwise.

### GetAdvancedgradingdataOk

`func (o *ModAssignSaveGradeRequest) GetAdvancedgradingdataOk() (*ModAssignSaveGradeRequestAdvancedgradingdata, bool)`

GetAdvancedgradingdataOk returns a tuple with the Advancedgradingdata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdvancedgradingdata

`func (o *ModAssignSaveGradeRequest) SetAdvancedgradingdata(v ModAssignSaveGradeRequestAdvancedgradingdata)`

SetAdvancedgradingdata sets Advancedgradingdata field to given value.

### HasAdvancedgradingdata

`func (o *ModAssignSaveGradeRequest) HasAdvancedgradingdata() bool`

HasAdvancedgradingdata returns a boolean if a field has been set.

### GetApplytoall

`func (o *ModAssignSaveGradeRequest) GetApplytoall() bool`

GetApplytoall returns the Applytoall field if non-nil, zero value otherwise.

### GetApplytoallOk

`func (o *ModAssignSaveGradeRequest) GetApplytoallOk() (*bool, bool)`

GetApplytoallOk returns a tuple with the Applytoall field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApplytoall

`func (o *ModAssignSaveGradeRequest) SetApplytoall(v bool)`

SetApplytoall sets Applytoall field to given value.


### GetAssignmentid

`func (o *ModAssignSaveGradeRequest) GetAssignmentid() int32`

GetAssignmentid returns the Assignmentid field if non-nil, zero value otherwise.

### GetAssignmentidOk

`func (o *ModAssignSaveGradeRequest) GetAssignmentidOk() (*int32, bool)`

GetAssignmentidOk returns a tuple with the Assignmentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssignmentid

`func (o *ModAssignSaveGradeRequest) SetAssignmentid(v int32)`

SetAssignmentid sets Assignmentid field to given value.


### GetAttemptnumber

`func (o *ModAssignSaveGradeRequest) GetAttemptnumber() int32`

GetAttemptnumber returns the Attemptnumber field if non-nil, zero value otherwise.

### GetAttemptnumberOk

`func (o *ModAssignSaveGradeRequest) GetAttemptnumberOk() (*int32, bool)`

GetAttemptnumberOk returns a tuple with the Attemptnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttemptnumber

`func (o *ModAssignSaveGradeRequest) SetAttemptnumber(v int32)`

SetAttemptnumber sets Attemptnumber field to given value.


### GetGrade

`func (o *ModAssignSaveGradeRequest) GetGrade() float32`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *ModAssignSaveGradeRequest) GetGradeOk() (*float32, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *ModAssignSaveGradeRequest) SetGrade(v float32)`

SetGrade sets Grade field to given value.


### GetPlugindata

`func (o *ModAssignSaveGradeRequest) GetPlugindata() ModAssignSaveGradeRequestPlugindata`

GetPlugindata returns the Plugindata field if non-nil, zero value otherwise.

### GetPlugindataOk

`func (o *ModAssignSaveGradeRequest) GetPlugindataOk() (*ModAssignSaveGradeRequestPlugindata, bool)`

GetPlugindataOk returns a tuple with the Plugindata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlugindata

`func (o *ModAssignSaveGradeRequest) SetPlugindata(v ModAssignSaveGradeRequestPlugindata)`

SetPlugindata sets Plugindata field to given value.

### HasPlugindata

`func (o *ModAssignSaveGradeRequest) HasPlugindata() bool`

HasPlugindata returns a boolean if a field has been set.

### GetUserid

`func (o *ModAssignSaveGradeRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModAssignSaveGradeRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModAssignSaveGradeRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.


### GetWorkflowstate

`func (o *ModAssignSaveGradeRequest) GetWorkflowstate() string`

GetWorkflowstate returns the Workflowstate field if non-nil, zero value otherwise.

### GetWorkflowstateOk

`func (o *ModAssignSaveGradeRequest) GetWorkflowstateOk() (*string, bool)`

GetWorkflowstateOk returns a tuple with the Workflowstate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWorkflowstate

`func (o *ModAssignSaveGradeRequest) SetWorkflowstate(v string)`

SetWorkflowstate sets Workflowstate field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


