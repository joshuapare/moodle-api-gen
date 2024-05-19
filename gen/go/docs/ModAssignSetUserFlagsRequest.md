# ModAssignSetUserFlagsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Assignmentid** | **int32** | assignment id | 
**Userflags** | [**[]ModAssignSetUserFlagsRequestUserflagsInner**](ModAssignSetUserFlagsRequestUserflagsInner.md) |  | 

## Methods

### NewModAssignSetUserFlagsRequest

`func NewModAssignSetUserFlagsRequest(assignmentid int32, userflags []ModAssignSetUserFlagsRequestUserflagsInner, ) *ModAssignSetUserFlagsRequest`

NewModAssignSetUserFlagsRequest instantiates a new ModAssignSetUserFlagsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignSetUserFlagsRequestWithDefaults

`func NewModAssignSetUserFlagsRequestWithDefaults() *ModAssignSetUserFlagsRequest`

NewModAssignSetUserFlagsRequestWithDefaults instantiates a new ModAssignSetUserFlagsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssignmentid

`func (o *ModAssignSetUserFlagsRequest) GetAssignmentid() int32`

GetAssignmentid returns the Assignmentid field if non-nil, zero value otherwise.

### GetAssignmentidOk

`func (o *ModAssignSetUserFlagsRequest) GetAssignmentidOk() (*int32, bool)`

GetAssignmentidOk returns a tuple with the Assignmentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssignmentid

`func (o *ModAssignSetUserFlagsRequest) SetAssignmentid(v int32)`

SetAssignmentid sets Assignmentid field to given value.


### GetUserflags

`func (o *ModAssignSetUserFlagsRequest) GetUserflags() []ModAssignSetUserFlagsRequestUserflagsInner`

GetUserflags returns the Userflags field if non-nil, zero value otherwise.

### GetUserflagsOk

`func (o *ModAssignSetUserFlagsRequest) GetUserflagsOk() (*[]ModAssignSetUserFlagsRequestUserflagsInner, bool)`

GetUserflagsOk returns a tuple with the Userflags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserflags

`func (o *ModAssignSetUserFlagsRequest) SetUserflags(v []ModAssignSetUserFlagsRequestUserflagsInner)`

SetUserflags sets Userflags field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


