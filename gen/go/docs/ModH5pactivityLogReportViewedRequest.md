# ModH5pactivityLogReportViewedRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attemptid** | Pointer to **int32** | The attempt id | [optional] [default to null]
**H5pactivityid** | **int32** | h5p activity instance id | 
**Userid** | Pointer to **int32** | The user id to log attempt (null means only current user) | [optional] [default to null]

## Methods

### NewModH5pactivityLogReportViewedRequest

`func NewModH5pactivityLogReportViewedRequest(h5pactivityid int32, ) *ModH5pactivityLogReportViewedRequest`

NewModH5pactivityLogReportViewedRequest instantiates a new ModH5pactivityLogReportViewedRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModH5pactivityLogReportViewedRequestWithDefaults

`func NewModH5pactivityLogReportViewedRequestWithDefaults() *ModH5pactivityLogReportViewedRequest`

NewModH5pactivityLogReportViewedRequestWithDefaults instantiates a new ModH5pactivityLogReportViewedRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttemptid

`func (o *ModH5pactivityLogReportViewedRequest) GetAttemptid() int32`

GetAttemptid returns the Attemptid field if non-nil, zero value otherwise.

### GetAttemptidOk

`func (o *ModH5pactivityLogReportViewedRequest) GetAttemptidOk() (*int32, bool)`

GetAttemptidOk returns a tuple with the Attemptid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttemptid

`func (o *ModH5pactivityLogReportViewedRequest) SetAttemptid(v int32)`

SetAttemptid sets Attemptid field to given value.

### HasAttemptid

`func (o *ModH5pactivityLogReportViewedRequest) HasAttemptid() bool`

HasAttemptid returns a boolean if a field has been set.

### GetH5pactivityid

`func (o *ModH5pactivityLogReportViewedRequest) GetH5pactivityid() int32`

GetH5pactivityid returns the H5pactivityid field if non-nil, zero value otherwise.

### GetH5pactivityidOk

`func (o *ModH5pactivityLogReportViewedRequest) GetH5pactivityidOk() (*int32, bool)`

GetH5pactivityidOk returns a tuple with the H5pactivityid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetH5pactivityid

`func (o *ModH5pactivityLogReportViewedRequest) SetH5pactivityid(v int32)`

SetH5pactivityid sets H5pactivityid field to given value.


### GetUserid

`func (o *ModH5pactivityLogReportViewedRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModH5pactivityLogReportViewedRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModH5pactivityLogReportViewedRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModH5pactivityLogReportViewedRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


