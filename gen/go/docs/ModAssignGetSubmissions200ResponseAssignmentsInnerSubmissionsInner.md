# ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Assignment** | Pointer to **int32** | assignment id | [optional] 
**Attemptnumber** | Pointer to **int32** | attempt number | [optional] 
**Gradingstatus** | Pointer to **string** | Grading status. | [optional] 
**Groupid** | Pointer to **int32** | group id | [optional] 
**Id** | Pointer to **int32** | submission id | [optional] 
**Latest** | Pointer to **int32** | latest attempt | [optional] 
**Plugins** | Pointer to [**[]ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner**](ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner.md) |  | [optional] 
**Status** | Pointer to **string** | submission status | [optional] 
**Timecreated** | Pointer to **int32** | submission creation time | [optional] 
**Timemodified** | Pointer to **int32** | submission last modified time | [optional] 
**Timestarted** | Pointer to **int32** | submission start time | [optional] 
**Userid** | Pointer to **int32** | student id | [optional] 

## Methods

### NewModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner

`func NewModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner() *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner`

NewModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner instantiates a new ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInnerWithDefaults

`func NewModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInnerWithDefaults() *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner`

NewModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInnerWithDefaults instantiates a new ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssignment

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) GetAssignment() int32`

GetAssignment returns the Assignment field if non-nil, zero value otherwise.

### GetAssignmentOk

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) GetAssignmentOk() (*int32, bool)`

GetAssignmentOk returns a tuple with the Assignment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssignment

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) SetAssignment(v int32)`

SetAssignment sets Assignment field to given value.

### HasAssignment

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) HasAssignment() bool`

HasAssignment returns a boolean if a field has been set.

### GetAttemptnumber

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) GetAttemptnumber() int32`

GetAttemptnumber returns the Attemptnumber field if non-nil, zero value otherwise.

### GetAttemptnumberOk

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) GetAttemptnumberOk() (*int32, bool)`

GetAttemptnumberOk returns a tuple with the Attemptnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttemptnumber

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) SetAttemptnumber(v int32)`

SetAttemptnumber sets Attemptnumber field to given value.

### HasAttemptnumber

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) HasAttemptnumber() bool`

HasAttemptnumber returns a boolean if a field has been set.

### GetGradingstatus

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) GetGradingstatus() string`

GetGradingstatus returns the Gradingstatus field if non-nil, zero value otherwise.

### GetGradingstatusOk

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) GetGradingstatusOk() (*string, bool)`

GetGradingstatusOk returns a tuple with the Gradingstatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradingstatus

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) SetGradingstatus(v string)`

SetGradingstatus sets Gradingstatus field to given value.

### HasGradingstatus

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) HasGradingstatus() bool`

HasGradingstatus returns a boolean if a field has been set.

### GetGroupid

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetId

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetLatest

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) GetLatest() int32`

GetLatest returns the Latest field if non-nil, zero value otherwise.

### GetLatestOk

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) GetLatestOk() (*int32, bool)`

GetLatestOk returns a tuple with the Latest field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLatest

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) SetLatest(v int32)`

SetLatest sets Latest field to given value.

### HasLatest

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) HasLatest() bool`

HasLatest returns a boolean if a field has been set.

### GetPlugins

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) GetPlugins() []ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner`

GetPlugins returns the Plugins field if non-nil, zero value otherwise.

### GetPluginsOk

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) GetPluginsOk() (*[]ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner, bool)`

GetPluginsOk returns a tuple with the Plugins field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlugins

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) SetPlugins(v []ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner)`

SetPlugins sets Plugins field to given value.

### HasPlugins

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) HasPlugins() bool`

HasPlugins returns a boolean if a field has been set.

### GetStatus

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetTimecreated

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetTimestarted

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) GetTimestarted() int32`

GetTimestarted returns the Timestarted field if non-nil, zero value otherwise.

### GetTimestartedOk

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) GetTimestartedOk() (*int32, bool)`

GetTimestartedOk returns a tuple with the Timestarted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestarted

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) SetTimestarted(v int32)`

SetTimestarted sets Timestarted field to given value.

### HasTimestarted

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) HasTimestarted() bool`

HasTimestarted returns a boolean if a field has been set.

### GetUserid

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


