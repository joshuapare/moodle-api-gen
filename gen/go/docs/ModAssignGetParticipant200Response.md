# ModAssignGetParticipant200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Allowsubmissionsfromdate** | **int32** | allowsubmissionsfromdate for the user | [default to null]
**Blindmarking** | **bool** | is blind marking enabled for this assignment | [default to null]
**Cutoffdate** | **int32** | cutoffdate for the user | [default to null]
**Duedate** | **int32** | duedate for the user | [default to null]
**Duedatestr** | **string** | duedate for the user | [default to "null"]
**Fullname** | **string** | The fullname of the user | 
**Grantedextension** | **bool** | have they been granted an extension | [default to null]
**Groupid** | Pointer to **int32** | for group assignments this is the group id | [optional] [default to null]
**Groupname** | Pointer to **string** | for group assignments this is the group name | [optional] [default to "null"]
**Id** | **int32** | ID of the user | 
**Requiregrading** | **bool** | is their submission waiting for grading | [default to null]
**Submissionstatus** | Pointer to **string** | The submission status (new, draft, reopened or submitted).                 Empty when not submitted. | [optional] [default to "null"]
**Submitted** | **bool** | have they submitted their assignment | [default to null]
**User** | Pointer to [**ModAssignGetParticipant200ResponseUser**](ModAssignGetParticipant200ResponseUser.md) |  | [optional] 

## Methods

### NewModAssignGetParticipant200Response

`func NewModAssignGetParticipant200Response(allowsubmissionsfromdate int32, blindmarking bool, cutoffdate int32, duedate int32, duedatestr string, fullname string, grantedextension bool, id int32, requiregrading bool, submitted bool, ) *ModAssignGetParticipant200Response`

NewModAssignGetParticipant200Response instantiates a new ModAssignGetParticipant200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignGetParticipant200ResponseWithDefaults

`func NewModAssignGetParticipant200ResponseWithDefaults() *ModAssignGetParticipant200Response`

NewModAssignGetParticipant200ResponseWithDefaults instantiates a new ModAssignGetParticipant200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAllowsubmissionsfromdate

`func (o *ModAssignGetParticipant200Response) GetAllowsubmissionsfromdate() int32`

GetAllowsubmissionsfromdate returns the Allowsubmissionsfromdate field if non-nil, zero value otherwise.

### GetAllowsubmissionsfromdateOk

`func (o *ModAssignGetParticipant200Response) GetAllowsubmissionsfromdateOk() (*int32, bool)`

GetAllowsubmissionsfromdateOk returns a tuple with the Allowsubmissionsfromdate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowsubmissionsfromdate

`func (o *ModAssignGetParticipant200Response) SetAllowsubmissionsfromdate(v int32)`

SetAllowsubmissionsfromdate sets Allowsubmissionsfromdate field to given value.


### GetBlindmarking

`func (o *ModAssignGetParticipant200Response) GetBlindmarking() bool`

GetBlindmarking returns the Blindmarking field if non-nil, zero value otherwise.

### GetBlindmarkingOk

`func (o *ModAssignGetParticipant200Response) GetBlindmarkingOk() (*bool, bool)`

GetBlindmarkingOk returns a tuple with the Blindmarking field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlindmarking

`func (o *ModAssignGetParticipant200Response) SetBlindmarking(v bool)`

SetBlindmarking sets Blindmarking field to given value.


### GetCutoffdate

`func (o *ModAssignGetParticipant200Response) GetCutoffdate() int32`

GetCutoffdate returns the Cutoffdate field if non-nil, zero value otherwise.

### GetCutoffdateOk

`func (o *ModAssignGetParticipant200Response) GetCutoffdateOk() (*int32, bool)`

GetCutoffdateOk returns a tuple with the Cutoffdate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCutoffdate

`func (o *ModAssignGetParticipant200Response) SetCutoffdate(v int32)`

SetCutoffdate sets Cutoffdate field to given value.


### GetDuedate

`func (o *ModAssignGetParticipant200Response) GetDuedate() int32`

GetDuedate returns the Duedate field if non-nil, zero value otherwise.

### GetDuedateOk

`func (o *ModAssignGetParticipant200Response) GetDuedateOk() (*int32, bool)`

GetDuedateOk returns a tuple with the Duedate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuedate

`func (o *ModAssignGetParticipant200Response) SetDuedate(v int32)`

SetDuedate sets Duedate field to given value.


### GetDuedatestr

`func (o *ModAssignGetParticipant200Response) GetDuedatestr() string`

GetDuedatestr returns the Duedatestr field if non-nil, zero value otherwise.

### GetDuedatestrOk

`func (o *ModAssignGetParticipant200Response) GetDuedatestrOk() (*string, bool)`

GetDuedatestrOk returns a tuple with the Duedatestr field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuedatestr

`func (o *ModAssignGetParticipant200Response) SetDuedatestr(v string)`

SetDuedatestr sets Duedatestr field to given value.


### GetFullname

`func (o *ModAssignGetParticipant200Response) GetFullname() string`

GetFullname returns the Fullname field if non-nil, zero value otherwise.

### GetFullnameOk

`func (o *ModAssignGetParticipant200Response) GetFullnameOk() (*string, bool)`

GetFullnameOk returns a tuple with the Fullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullname

`func (o *ModAssignGetParticipant200Response) SetFullname(v string)`

SetFullname sets Fullname field to given value.


### GetGrantedextension

`func (o *ModAssignGetParticipant200Response) GetGrantedextension() bool`

GetGrantedextension returns the Grantedextension field if non-nil, zero value otherwise.

### GetGrantedextensionOk

`func (o *ModAssignGetParticipant200Response) GetGrantedextensionOk() (*bool, bool)`

GetGrantedextensionOk returns a tuple with the Grantedextension field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrantedextension

`func (o *ModAssignGetParticipant200Response) SetGrantedextension(v bool)`

SetGrantedextension sets Grantedextension field to given value.


### GetGroupid

`func (o *ModAssignGetParticipant200Response) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModAssignGetParticipant200Response) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModAssignGetParticipant200Response) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *ModAssignGetParticipant200Response) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetGroupname

`func (o *ModAssignGetParticipant200Response) GetGroupname() string`

GetGroupname returns the Groupname field if non-nil, zero value otherwise.

### GetGroupnameOk

`func (o *ModAssignGetParticipant200Response) GetGroupnameOk() (*string, bool)`

GetGroupnameOk returns a tuple with the Groupname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupname

`func (o *ModAssignGetParticipant200Response) SetGroupname(v string)`

SetGroupname sets Groupname field to given value.

### HasGroupname

`func (o *ModAssignGetParticipant200Response) HasGroupname() bool`

HasGroupname returns a boolean if a field has been set.

### GetId

`func (o *ModAssignGetParticipant200Response) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModAssignGetParticipant200Response) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModAssignGetParticipant200Response) SetId(v int32)`

SetId sets Id field to given value.


### GetRequiregrading

`func (o *ModAssignGetParticipant200Response) GetRequiregrading() bool`

GetRequiregrading returns the Requiregrading field if non-nil, zero value otherwise.

### GetRequiregradingOk

`func (o *ModAssignGetParticipant200Response) GetRequiregradingOk() (*bool, bool)`

GetRequiregradingOk returns a tuple with the Requiregrading field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequiregrading

`func (o *ModAssignGetParticipant200Response) SetRequiregrading(v bool)`

SetRequiregrading sets Requiregrading field to given value.


### GetSubmissionstatus

`func (o *ModAssignGetParticipant200Response) GetSubmissionstatus() string`

GetSubmissionstatus returns the Submissionstatus field if non-nil, zero value otherwise.

### GetSubmissionstatusOk

`func (o *ModAssignGetParticipant200Response) GetSubmissionstatusOk() (*string, bool)`

GetSubmissionstatusOk returns a tuple with the Submissionstatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissionstatus

`func (o *ModAssignGetParticipant200Response) SetSubmissionstatus(v string)`

SetSubmissionstatus sets Submissionstatus field to given value.

### HasSubmissionstatus

`func (o *ModAssignGetParticipant200Response) HasSubmissionstatus() bool`

HasSubmissionstatus returns a boolean if a field has been set.

### GetSubmitted

`func (o *ModAssignGetParticipant200Response) GetSubmitted() bool`

GetSubmitted returns the Submitted field if non-nil, zero value otherwise.

### GetSubmittedOk

`func (o *ModAssignGetParticipant200Response) GetSubmittedOk() (*bool, bool)`

GetSubmittedOk returns a tuple with the Submitted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmitted

`func (o *ModAssignGetParticipant200Response) SetSubmitted(v bool)`

SetSubmitted sets Submitted field to given value.


### GetUser

`func (o *ModAssignGetParticipant200Response) GetUser() ModAssignGetParticipant200ResponseUser`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *ModAssignGetParticipant200Response) GetUserOk() (*ModAssignGetParticipant200ResponseUser, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *ModAssignGetParticipant200Response) SetUser(v ModAssignGetParticipant200ResponseUser)`

SetUser sets User field to given value.

### HasUser

`func (o *ModAssignGetParticipant200Response) HasUser() bool`

HasUser returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


