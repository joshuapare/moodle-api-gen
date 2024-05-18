# ModH5pactivityGetResults200ResponseAttemptsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attempt** | Pointer to **int32** | Attempt number | [optional] 
**Completion** | Pointer to **int32** | Attempt completion | [optional] 
**Duration** | Pointer to **int32** | Attempt duration in seconds | [optional] 
**H5pactivityid** | Pointer to **int32** | ID of the H5P activity | [optional] 
**Id** | Pointer to **int32** | ID of the context | [optional] 
**Maxscore** | Pointer to **int32** | Attempt max score | [optional] 
**Rawscore** | Pointer to **int32** | Attempt score value | [optional] 
**Results** | Pointer to [**[]ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner**](ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner.md) |  | [optional] 
**Scaled** | Pointer to **float32** | Attempt scaled | [optional] 
**Success** | Pointer to **int32** | Attempt success | [optional] 
**Timecreated** | Pointer to **int32** | Attempt creation | [optional] 
**Timemodified** | Pointer to **int32** | Attempt modified | [optional] 
**Userid** | Pointer to **int32** | ID of the user | [optional] 

## Methods

### NewModH5pactivityGetResults200ResponseAttemptsInner

`func NewModH5pactivityGetResults200ResponseAttemptsInner() *ModH5pactivityGetResults200ResponseAttemptsInner`

NewModH5pactivityGetResults200ResponseAttemptsInner instantiates a new ModH5pactivityGetResults200ResponseAttemptsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModH5pactivityGetResults200ResponseAttemptsInnerWithDefaults

`func NewModH5pactivityGetResults200ResponseAttemptsInnerWithDefaults() *ModH5pactivityGetResults200ResponseAttemptsInner`

NewModH5pactivityGetResults200ResponseAttemptsInnerWithDefaults instantiates a new ModH5pactivityGetResults200ResponseAttemptsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttempt

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) GetAttempt() int32`

GetAttempt returns the Attempt field if non-nil, zero value otherwise.

### GetAttemptOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) GetAttemptOk() (*int32, bool)`

GetAttemptOk returns a tuple with the Attempt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttempt

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) SetAttempt(v int32)`

SetAttempt sets Attempt field to given value.

### HasAttempt

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) HasAttempt() bool`

HasAttempt returns a boolean if a field has been set.

### GetCompletion

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) GetCompletion() int32`

GetCompletion returns the Completion field if non-nil, zero value otherwise.

### GetCompletionOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) GetCompletionOk() (*int32, bool)`

GetCompletionOk returns a tuple with the Completion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletion

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) SetCompletion(v int32)`

SetCompletion sets Completion field to given value.

### HasCompletion

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) HasCompletion() bool`

HasCompletion returns a boolean if a field has been set.

### GetDuration

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) GetDuration() int32`

GetDuration returns the Duration field if non-nil, zero value otherwise.

### GetDurationOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) GetDurationOk() (*int32, bool)`

GetDurationOk returns a tuple with the Duration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuration

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) SetDuration(v int32)`

SetDuration sets Duration field to given value.

### HasDuration

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) HasDuration() bool`

HasDuration returns a boolean if a field has been set.

### GetH5pactivityid

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) GetH5pactivityid() int32`

GetH5pactivityid returns the H5pactivityid field if non-nil, zero value otherwise.

### GetH5pactivityidOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) GetH5pactivityidOk() (*int32, bool)`

GetH5pactivityidOk returns a tuple with the H5pactivityid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetH5pactivityid

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) SetH5pactivityid(v int32)`

SetH5pactivityid sets H5pactivityid field to given value.

### HasH5pactivityid

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) HasH5pactivityid() bool`

HasH5pactivityid returns a boolean if a field has been set.

### GetId

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetMaxscore

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) GetMaxscore() int32`

GetMaxscore returns the Maxscore field if non-nil, zero value otherwise.

### GetMaxscoreOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) GetMaxscoreOk() (*int32, bool)`

GetMaxscoreOk returns a tuple with the Maxscore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxscore

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) SetMaxscore(v int32)`

SetMaxscore sets Maxscore field to given value.

### HasMaxscore

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) HasMaxscore() bool`

HasMaxscore returns a boolean if a field has been set.

### GetRawscore

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) GetRawscore() int32`

GetRawscore returns the Rawscore field if non-nil, zero value otherwise.

### GetRawscoreOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) GetRawscoreOk() (*int32, bool)`

GetRawscoreOk returns a tuple with the Rawscore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRawscore

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) SetRawscore(v int32)`

SetRawscore sets Rawscore field to given value.

### HasRawscore

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) HasRawscore() bool`

HasRawscore returns a boolean if a field has been set.

### GetResults

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) GetResults() []ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner`

GetResults returns the Results field if non-nil, zero value otherwise.

### GetResultsOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) GetResultsOk() (*[]ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner, bool)`

GetResultsOk returns a tuple with the Results field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResults

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) SetResults(v []ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner)`

SetResults sets Results field to given value.

### HasResults

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) HasResults() bool`

HasResults returns a boolean if a field has been set.

### GetScaled

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) GetScaled() float32`

GetScaled returns the Scaled field if non-nil, zero value otherwise.

### GetScaledOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) GetScaledOk() (*float32, bool)`

GetScaledOk returns a tuple with the Scaled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScaled

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) SetScaled(v float32)`

SetScaled sets Scaled field to given value.

### HasScaled

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) HasScaled() bool`

HasScaled returns a boolean if a field has been set.

### GetSuccess

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) GetSuccess() int32`

GetSuccess returns the Success field if non-nil, zero value otherwise.

### GetSuccessOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) GetSuccessOk() (*int32, bool)`

GetSuccessOk returns a tuple with the Success field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuccess

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) SetSuccess(v int32)`

SetSuccess sets Success field to given value.

### HasSuccess

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) HasSuccess() bool`

HasSuccess returns a boolean if a field has been set.

### GetTimecreated

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetUserid

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModH5pactivityGetResults200ResponseAttemptsInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


