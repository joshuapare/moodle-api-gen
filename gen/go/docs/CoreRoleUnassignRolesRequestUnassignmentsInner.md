# CoreRoleUnassignRolesRequestUnassignmentsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Contextid** | Pointer to **int32** | The context to unassign the user role from | [optional] [default to null]
**Contextlevel** | Pointer to **string** | The context level to unassign the user role in +                                    (block, course, coursecat, system, user, module) | [optional] [default to "null"]
**Instanceid** | Pointer to **int32** | The Instance id of item where the role needs to be unassigned | [optional] [default to null]
**Roleid** | Pointer to **int32** | Role to assign to the user | [optional] 
**Userid** | Pointer to **int32** | The user that is going to be assigned | [optional] 

## Methods

### NewCoreRoleUnassignRolesRequestUnassignmentsInner

`func NewCoreRoleUnassignRolesRequestUnassignmentsInner() *CoreRoleUnassignRolesRequestUnassignmentsInner`

NewCoreRoleUnassignRolesRequestUnassignmentsInner instantiates a new CoreRoleUnassignRolesRequestUnassignmentsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreRoleUnassignRolesRequestUnassignmentsInnerWithDefaults

`func NewCoreRoleUnassignRolesRequestUnassignmentsInnerWithDefaults() *CoreRoleUnassignRolesRequestUnassignmentsInner`

NewCoreRoleUnassignRolesRequestUnassignmentsInnerWithDefaults instantiates a new CoreRoleUnassignRolesRequestUnassignmentsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContextid

`func (o *CoreRoleUnassignRolesRequestUnassignmentsInner) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *CoreRoleUnassignRolesRequestUnassignmentsInner) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *CoreRoleUnassignRolesRequestUnassignmentsInner) SetContextid(v int32)`

SetContextid sets Contextid field to given value.

### HasContextid

`func (o *CoreRoleUnassignRolesRequestUnassignmentsInner) HasContextid() bool`

HasContextid returns a boolean if a field has been set.

### GetContextlevel

`func (o *CoreRoleUnassignRolesRequestUnassignmentsInner) GetContextlevel() string`

GetContextlevel returns the Contextlevel field if non-nil, zero value otherwise.

### GetContextlevelOk

`func (o *CoreRoleUnassignRolesRequestUnassignmentsInner) GetContextlevelOk() (*string, bool)`

GetContextlevelOk returns a tuple with the Contextlevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextlevel

`func (o *CoreRoleUnassignRolesRequestUnassignmentsInner) SetContextlevel(v string)`

SetContextlevel sets Contextlevel field to given value.

### HasContextlevel

`func (o *CoreRoleUnassignRolesRequestUnassignmentsInner) HasContextlevel() bool`

HasContextlevel returns a boolean if a field has been set.

### GetInstanceid

`func (o *CoreRoleUnassignRolesRequestUnassignmentsInner) GetInstanceid() int32`

GetInstanceid returns the Instanceid field if non-nil, zero value otherwise.

### GetInstanceidOk

`func (o *CoreRoleUnassignRolesRequestUnassignmentsInner) GetInstanceidOk() (*int32, bool)`

GetInstanceidOk returns a tuple with the Instanceid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstanceid

`func (o *CoreRoleUnassignRolesRequestUnassignmentsInner) SetInstanceid(v int32)`

SetInstanceid sets Instanceid field to given value.

### HasInstanceid

`func (o *CoreRoleUnassignRolesRequestUnassignmentsInner) HasInstanceid() bool`

HasInstanceid returns a boolean if a field has been set.

### GetRoleid

`func (o *CoreRoleUnassignRolesRequestUnassignmentsInner) GetRoleid() int32`

GetRoleid returns the Roleid field if non-nil, zero value otherwise.

### GetRoleidOk

`func (o *CoreRoleUnassignRolesRequestUnassignmentsInner) GetRoleidOk() (*int32, bool)`

GetRoleidOk returns a tuple with the Roleid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoleid

`func (o *CoreRoleUnassignRolesRequestUnassignmentsInner) SetRoleid(v int32)`

SetRoleid sets Roleid field to given value.

### HasRoleid

`func (o *CoreRoleUnassignRolesRequestUnassignmentsInner) HasRoleid() bool`

HasRoleid returns a boolean if a field has been set.

### GetUserid

`func (o *CoreRoleUnassignRolesRequestUnassignmentsInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreRoleUnassignRolesRequestUnassignmentsInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreRoleUnassignRolesRequestUnassignmentsInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreRoleUnassignRolesRequestUnassignmentsInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


