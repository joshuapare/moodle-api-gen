# ModAssignLockSubmissionsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Assignmentid** | **int32** | The assignment id to operate on | 
**Userids** | **[]map[string]interface{}** |  | 

## Methods

### NewModAssignLockSubmissionsRequest

`func NewModAssignLockSubmissionsRequest(assignmentid int32, userids []map[string]interface{}, ) *ModAssignLockSubmissionsRequest`

NewModAssignLockSubmissionsRequest instantiates a new ModAssignLockSubmissionsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignLockSubmissionsRequestWithDefaults

`func NewModAssignLockSubmissionsRequestWithDefaults() *ModAssignLockSubmissionsRequest`

NewModAssignLockSubmissionsRequestWithDefaults instantiates a new ModAssignLockSubmissionsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssignmentid

`func (o *ModAssignLockSubmissionsRequest) GetAssignmentid() int32`

GetAssignmentid returns the Assignmentid field if non-nil, zero value otherwise.

### GetAssignmentidOk

`func (o *ModAssignLockSubmissionsRequest) GetAssignmentidOk() (*int32, bool)`

GetAssignmentidOk returns a tuple with the Assignmentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssignmentid

`func (o *ModAssignLockSubmissionsRequest) SetAssignmentid(v int32)`

SetAssignmentid sets Assignmentid field to given value.


### GetUserids

`func (o *ModAssignLockSubmissionsRequest) GetUserids() []map[string]interface{}`

GetUserids returns the Userids field if non-nil, zero value otherwise.

### GetUseridsOk

`func (o *ModAssignLockSubmissionsRequest) GetUseridsOk() (*[]map[string]interface{}, bool)`

GetUseridsOk returns a tuple with the Userids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserids

`func (o *ModAssignLockSubmissionsRequest) SetUserids(v []map[string]interface{})`

SetUserids sets Userids field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


