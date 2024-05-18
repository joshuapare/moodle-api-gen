# CoreRoleAssignRolesRequestAssignmentsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Contextid** | Pointer to **int32** | The context to assign the user role in | [optional] [default to null]
**Contextlevel** | Pointer to **string** | The context level to assign the user role in                                     (block, course, coursecat, system, user, module) | [optional] [default to "null"]
**Instanceid** | Pointer to **int32** | The Instance id of item where the role needs to be assigned | [optional] [default to null]
**Roleid** | Pointer to **int32** | Role to assign to the user | [optional] 
**Userid** | Pointer to **int32** | The user that is going to be assigned | [optional] [default to null]

## Methods

### NewCoreRoleAssignRolesRequestAssignmentsInner

`func NewCoreRoleAssignRolesRequestAssignmentsInner() *CoreRoleAssignRolesRequestAssignmentsInner`

NewCoreRoleAssignRolesRequestAssignmentsInner instantiates a new CoreRoleAssignRolesRequestAssignmentsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreRoleAssignRolesRequestAssignmentsInnerWithDefaults

`func NewCoreRoleAssignRolesRequestAssignmentsInnerWithDefaults() *CoreRoleAssignRolesRequestAssignmentsInner`

NewCoreRoleAssignRolesRequestAssignmentsInnerWithDefaults instantiates a new CoreRoleAssignRolesRequestAssignmentsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContextid

`func (o *CoreRoleAssignRolesRequestAssignmentsInner) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *CoreRoleAssignRolesRequestAssignmentsInner) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *CoreRoleAssignRolesRequestAssignmentsInner) SetContextid(v int32)`

SetContextid sets Contextid field to given value.

### HasContextid

`func (o *CoreRoleAssignRolesRequestAssignmentsInner) HasContextid() bool`

HasContextid returns a boolean if a field has been set.

### GetContextlevel

`func (o *CoreRoleAssignRolesRequestAssignmentsInner) GetContextlevel() string`

GetContextlevel returns the Contextlevel field if non-nil, zero value otherwise.

### GetContextlevelOk

`func (o *CoreRoleAssignRolesRequestAssignmentsInner) GetContextlevelOk() (*string, bool)`

GetContextlevelOk returns a tuple with the Contextlevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextlevel

`func (o *CoreRoleAssignRolesRequestAssignmentsInner) SetContextlevel(v string)`

SetContextlevel sets Contextlevel field to given value.

### HasContextlevel

`func (o *CoreRoleAssignRolesRequestAssignmentsInner) HasContextlevel() bool`

HasContextlevel returns a boolean if a field has been set.

### GetInstanceid

`func (o *CoreRoleAssignRolesRequestAssignmentsInner) GetInstanceid() int32`

GetInstanceid returns the Instanceid field if non-nil, zero value otherwise.

### GetInstanceidOk

`func (o *CoreRoleAssignRolesRequestAssignmentsInner) GetInstanceidOk() (*int32, bool)`

GetInstanceidOk returns a tuple with the Instanceid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstanceid

`func (o *CoreRoleAssignRolesRequestAssignmentsInner) SetInstanceid(v int32)`

SetInstanceid sets Instanceid field to given value.

### HasInstanceid

`func (o *CoreRoleAssignRolesRequestAssignmentsInner) HasInstanceid() bool`

HasInstanceid returns a boolean if a field has been set.

### GetRoleid

`func (o *CoreRoleAssignRolesRequestAssignmentsInner) GetRoleid() int32`

GetRoleid returns the Roleid field if non-nil, zero value otherwise.

### GetRoleidOk

`func (o *CoreRoleAssignRolesRequestAssignmentsInner) GetRoleidOk() (*int32, bool)`

GetRoleidOk returns a tuple with the Roleid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoleid

`func (o *CoreRoleAssignRolesRequestAssignmentsInner) SetRoleid(v int32)`

SetRoleid sets Roleid field to given value.

### HasRoleid

`func (o *CoreRoleAssignRolesRequestAssignmentsInner) HasRoleid() bool`

HasRoleid returns a boolean if a field has been set.

### GetUserid

`func (o *CoreRoleAssignRolesRequestAssignmentsInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreRoleAssignRolesRequestAssignmentsInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreRoleAssignRolesRequestAssignmentsInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreRoleAssignRolesRequestAssignmentsInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


