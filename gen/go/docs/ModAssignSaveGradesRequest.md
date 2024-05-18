# ModAssignSaveGradesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Applytoall** | **bool** | If true, this grade will be applied to all members of the group (for group assignments). | 
**Assignmentid** | **int32** | The assignment id to operate on | 
**Grades** | [**[]ModAssignSaveGradesRequestGradesInner**](ModAssignSaveGradesRequestGradesInner.md) |  | 

## Methods

### NewModAssignSaveGradesRequest

`func NewModAssignSaveGradesRequest(applytoall bool, assignmentid int32, grades []ModAssignSaveGradesRequestGradesInner, ) *ModAssignSaveGradesRequest`

NewModAssignSaveGradesRequest instantiates a new ModAssignSaveGradesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignSaveGradesRequestWithDefaults

`func NewModAssignSaveGradesRequestWithDefaults() *ModAssignSaveGradesRequest`

NewModAssignSaveGradesRequestWithDefaults instantiates a new ModAssignSaveGradesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetApplytoall

`func (o *ModAssignSaveGradesRequest) GetApplytoall() bool`

GetApplytoall returns the Applytoall field if non-nil, zero value otherwise.

### GetApplytoallOk

`func (o *ModAssignSaveGradesRequest) GetApplytoallOk() (*bool, bool)`

GetApplytoallOk returns a tuple with the Applytoall field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApplytoall

`func (o *ModAssignSaveGradesRequest) SetApplytoall(v bool)`

SetApplytoall sets Applytoall field to given value.


### GetAssignmentid

`func (o *ModAssignSaveGradesRequest) GetAssignmentid() int32`

GetAssignmentid returns the Assignmentid field if non-nil, zero value otherwise.

### GetAssignmentidOk

`func (o *ModAssignSaveGradesRequest) GetAssignmentidOk() (*int32, bool)`

GetAssignmentidOk returns a tuple with the Assignmentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssignmentid

`func (o *ModAssignSaveGradesRequest) SetAssignmentid(v int32)`

SetAssignmentid sets Assignmentid field to given value.


### GetGrades

`func (o *ModAssignSaveGradesRequest) GetGrades() []ModAssignSaveGradesRequestGradesInner`

GetGrades returns the Grades field if non-nil, zero value otherwise.

### GetGradesOk

`func (o *ModAssignSaveGradesRequest) GetGradesOk() (*[]ModAssignSaveGradesRequestGradesInner, bool)`

GetGradesOk returns a tuple with the Grades field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrades

`func (o *ModAssignSaveGradesRequest) SetGrades(v []ModAssignSaveGradesRequestGradesInner)`

SetGrades sets Grades field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


