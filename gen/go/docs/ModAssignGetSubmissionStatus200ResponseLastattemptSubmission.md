# ModAssignGetSubmissionStatus200ResponseLastattemptSubmission

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Assignment** | Pointer to **int32** | assignment id | [optional] 
**Attemptnumber** | **int32** | attempt number | 
**Gradingstatus** | Pointer to **string** | Grading status. | [optional] 
**Groupid** | **int32** | group id | 
**Id** | **int32** | submission id | [default to null]
**Latest** | Pointer to **int32** | latest attempt | [optional] [default to null]
**Plugins** | Pointer to [**[]ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner**](ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner.md) |  | [optional] 
**Status** | **string** | submission status | [default to "null"]
**Timecreated** | **int32** | submission creation time | [default to null]
**Timemodified** | **int32** | submission last modified time | [default to null]
**Timestarted** | Pointer to **int32** | submission start time | [optional] [default to null]
**Userid** | **int32** | student id | 

## Methods

### NewModAssignGetSubmissionStatus200ResponseLastattemptSubmission

`func NewModAssignGetSubmissionStatus200ResponseLastattemptSubmission(attemptnumber int32, groupid int32, id int32, status string, timecreated int32, timemodified int32, userid int32, ) *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission`

NewModAssignGetSubmissionStatus200ResponseLastattemptSubmission instantiates a new ModAssignGetSubmissionStatus200ResponseLastattemptSubmission object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignGetSubmissionStatus200ResponseLastattemptSubmissionWithDefaults

`func NewModAssignGetSubmissionStatus200ResponseLastattemptSubmissionWithDefaults() *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission`

NewModAssignGetSubmissionStatus200ResponseLastattemptSubmissionWithDefaults instantiates a new ModAssignGetSubmissionStatus200ResponseLastattemptSubmission object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssignment

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) GetAssignment() int32`

GetAssignment returns the Assignment field if non-nil, zero value otherwise.

### GetAssignmentOk

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) GetAssignmentOk() (*int32, bool)`

GetAssignmentOk returns a tuple with the Assignment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssignment

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) SetAssignment(v int32)`

SetAssignment sets Assignment field to given value.

### HasAssignment

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) HasAssignment() bool`

HasAssignment returns a boolean if a field has been set.

### GetAttemptnumber

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) GetAttemptnumber() int32`

GetAttemptnumber returns the Attemptnumber field if non-nil, zero value otherwise.

### GetAttemptnumberOk

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) GetAttemptnumberOk() (*int32, bool)`

GetAttemptnumberOk returns a tuple with the Attemptnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttemptnumber

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) SetAttemptnumber(v int32)`

SetAttemptnumber sets Attemptnumber field to given value.


### GetGradingstatus

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) GetGradingstatus() string`

GetGradingstatus returns the Gradingstatus field if non-nil, zero value otherwise.

### GetGradingstatusOk

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) GetGradingstatusOk() (*string, bool)`

GetGradingstatusOk returns a tuple with the Gradingstatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradingstatus

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) SetGradingstatus(v string)`

SetGradingstatus sets Gradingstatus field to given value.

### HasGradingstatus

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) HasGradingstatus() bool`

HasGradingstatus returns a boolean if a field has been set.

### GetGroupid

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.


### GetId

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) SetId(v int32)`

SetId sets Id field to given value.


### GetLatest

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) GetLatest() int32`

GetLatest returns the Latest field if non-nil, zero value otherwise.

### GetLatestOk

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) GetLatestOk() (*int32, bool)`

GetLatestOk returns a tuple with the Latest field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLatest

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) SetLatest(v int32)`

SetLatest sets Latest field to given value.

### HasLatest

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) HasLatest() bool`

HasLatest returns a boolean if a field has been set.

### GetPlugins

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) GetPlugins() []ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner`

GetPlugins returns the Plugins field if non-nil, zero value otherwise.

### GetPluginsOk

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) GetPluginsOk() (*[]ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner, bool)`

GetPluginsOk returns a tuple with the Plugins field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlugins

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) SetPlugins(v []ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner)`

SetPlugins sets Plugins field to given value.

### HasPlugins

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) HasPlugins() bool`

HasPlugins returns a boolean if a field has been set.

### GetStatus

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) SetStatus(v string)`

SetStatus sets Status field to given value.


### GetTimecreated

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.


### GetTimemodified

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.


### GetTimestarted

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) GetTimestarted() int32`

GetTimestarted returns the Timestarted field if non-nil, zero value otherwise.

### GetTimestartedOk

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) GetTimestartedOk() (*int32, bool)`

GetTimestartedOk returns a tuple with the Timestarted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestarted

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) SetTimestarted(v int32)`

SetTimestarted sets Timestarted field to given value.

### HasTimestarted

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) HasTimestarted() bool`

HasTimestarted returns a boolean if a field has been set.

### GetUserid

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModAssignGetSubmissionStatus200ResponseLastattemptSubmission) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


