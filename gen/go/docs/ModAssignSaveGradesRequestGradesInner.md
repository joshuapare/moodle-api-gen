# ModAssignSaveGradesRequestGradesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Addattempt** | Pointer to **bool** | Allow another attempt if manual attempt reopen method | [optional] [default to null]
**Advancedgradingdata** | Pointer to [**ModAssignSaveGradeRequestAdvancedgradingdata**](ModAssignSaveGradeRequestAdvancedgradingdata.md) |  | [optional] 
**Attemptnumber** | Pointer to **int32** | The attempt number (-1 means latest attempt) | [optional] 
**Grade** | Pointer to **float32** | The new grade for this user. Ignored if advanced grading used | [optional] 
**Plugindata** | Pointer to [**ModAssignSaveGradesRequestGradesInnerPlugindata**](ModAssignSaveGradesRequestGradesInnerPlugindata.md) |  | [optional] 
**Userid** | Pointer to **int32** | The student id to operate on | [optional] 
**Workflowstate** | Pointer to **string** | The next marking workflow state | [optional] 

## Methods

### NewModAssignSaveGradesRequestGradesInner

`func NewModAssignSaveGradesRequestGradesInner() *ModAssignSaveGradesRequestGradesInner`

NewModAssignSaveGradesRequestGradesInner instantiates a new ModAssignSaveGradesRequestGradesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignSaveGradesRequestGradesInnerWithDefaults

`func NewModAssignSaveGradesRequestGradesInnerWithDefaults() *ModAssignSaveGradesRequestGradesInner`

NewModAssignSaveGradesRequestGradesInnerWithDefaults instantiates a new ModAssignSaveGradesRequestGradesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAddattempt

`func (o *ModAssignSaveGradesRequestGradesInner) GetAddattempt() bool`

GetAddattempt returns the Addattempt field if non-nil, zero value otherwise.

### GetAddattemptOk

`func (o *ModAssignSaveGradesRequestGradesInner) GetAddattemptOk() (*bool, bool)`

GetAddattemptOk returns a tuple with the Addattempt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddattempt

`func (o *ModAssignSaveGradesRequestGradesInner) SetAddattempt(v bool)`

SetAddattempt sets Addattempt field to given value.

### HasAddattempt

`func (o *ModAssignSaveGradesRequestGradesInner) HasAddattempt() bool`

HasAddattempt returns a boolean if a field has been set.

### GetAdvancedgradingdata

`func (o *ModAssignSaveGradesRequestGradesInner) GetAdvancedgradingdata() ModAssignSaveGradeRequestAdvancedgradingdata`

GetAdvancedgradingdata returns the Advancedgradingdata field if non-nil, zero value otherwise.

### GetAdvancedgradingdataOk

`func (o *ModAssignSaveGradesRequestGradesInner) GetAdvancedgradingdataOk() (*ModAssignSaveGradeRequestAdvancedgradingdata, bool)`

GetAdvancedgradingdataOk returns a tuple with the Advancedgradingdata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdvancedgradingdata

`func (o *ModAssignSaveGradesRequestGradesInner) SetAdvancedgradingdata(v ModAssignSaveGradeRequestAdvancedgradingdata)`

SetAdvancedgradingdata sets Advancedgradingdata field to given value.

### HasAdvancedgradingdata

`func (o *ModAssignSaveGradesRequestGradesInner) HasAdvancedgradingdata() bool`

HasAdvancedgradingdata returns a boolean if a field has been set.

### GetAttemptnumber

`func (o *ModAssignSaveGradesRequestGradesInner) GetAttemptnumber() int32`

GetAttemptnumber returns the Attemptnumber field if non-nil, zero value otherwise.

### GetAttemptnumberOk

`func (o *ModAssignSaveGradesRequestGradesInner) GetAttemptnumberOk() (*int32, bool)`

GetAttemptnumberOk returns a tuple with the Attemptnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttemptnumber

`func (o *ModAssignSaveGradesRequestGradesInner) SetAttemptnumber(v int32)`

SetAttemptnumber sets Attemptnumber field to given value.

### HasAttemptnumber

`func (o *ModAssignSaveGradesRequestGradesInner) HasAttemptnumber() bool`

HasAttemptnumber returns a boolean if a field has been set.

### GetGrade

`func (o *ModAssignSaveGradesRequestGradesInner) GetGrade() float32`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *ModAssignSaveGradesRequestGradesInner) GetGradeOk() (*float32, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *ModAssignSaveGradesRequestGradesInner) SetGrade(v float32)`

SetGrade sets Grade field to given value.

### HasGrade

`func (o *ModAssignSaveGradesRequestGradesInner) HasGrade() bool`

HasGrade returns a boolean if a field has been set.

### GetPlugindata

`func (o *ModAssignSaveGradesRequestGradesInner) GetPlugindata() ModAssignSaveGradesRequestGradesInnerPlugindata`

GetPlugindata returns the Plugindata field if non-nil, zero value otherwise.

### GetPlugindataOk

`func (o *ModAssignSaveGradesRequestGradesInner) GetPlugindataOk() (*ModAssignSaveGradesRequestGradesInnerPlugindata, bool)`

GetPlugindataOk returns a tuple with the Plugindata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlugindata

`func (o *ModAssignSaveGradesRequestGradesInner) SetPlugindata(v ModAssignSaveGradesRequestGradesInnerPlugindata)`

SetPlugindata sets Plugindata field to given value.

### HasPlugindata

`func (o *ModAssignSaveGradesRequestGradesInner) HasPlugindata() bool`

HasPlugindata returns a boolean if a field has been set.

### GetUserid

`func (o *ModAssignSaveGradesRequestGradesInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModAssignSaveGradesRequestGradesInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModAssignSaveGradesRequestGradesInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModAssignSaveGradesRequestGradesInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetWorkflowstate

`func (o *ModAssignSaveGradesRequestGradesInner) GetWorkflowstate() string`

GetWorkflowstate returns the Workflowstate field if non-nil, zero value otherwise.

### GetWorkflowstateOk

`func (o *ModAssignSaveGradesRequestGradesInner) GetWorkflowstateOk() (*string, bool)`

GetWorkflowstateOk returns a tuple with the Workflowstate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWorkflowstate

`func (o *ModAssignSaveGradesRequestGradesInner) SetWorkflowstate(v string)`

SetWorkflowstate sets Workflowstate field to given value.

### HasWorkflowstate

`func (o *ModAssignSaveGradesRequestGradesInner) HasWorkflowstate() bool`

HasWorkflowstate returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


