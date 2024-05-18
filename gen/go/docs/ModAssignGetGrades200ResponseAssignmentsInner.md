# ModAssignGetGrades200ResponseAssignmentsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Assignmentid** | Pointer to **int32** | assignment id | [optional] 
**Grades** | Pointer to [**[]ModAssignGetGrades200ResponseAssignmentsInnerGradesInner**](ModAssignGetGrades200ResponseAssignmentsInnerGradesInner.md) |  | [optional] 

## Methods

### NewModAssignGetGrades200ResponseAssignmentsInner

`func NewModAssignGetGrades200ResponseAssignmentsInner() *ModAssignGetGrades200ResponseAssignmentsInner`

NewModAssignGetGrades200ResponseAssignmentsInner instantiates a new ModAssignGetGrades200ResponseAssignmentsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignGetGrades200ResponseAssignmentsInnerWithDefaults

`func NewModAssignGetGrades200ResponseAssignmentsInnerWithDefaults() *ModAssignGetGrades200ResponseAssignmentsInner`

NewModAssignGetGrades200ResponseAssignmentsInnerWithDefaults instantiates a new ModAssignGetGrades200ResponseAssignmentsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssignmentid

`func (o *ModAssignGetGrades200ResponseAssignmentsInner) GetAssignmentid() int32`

GetAssignmentid returns the Assignmentid field if non-nil, zero value otherwise.

### GetAssignmentidOk

`func (o *ModAssignGetGrades200ResponseAssignmentsInner) GetAssignmentidOk() (*int32, bool)`

GetAssignmentidOk returns a tuple with the Assignmentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssignmentid

`func (o *ModAssignGetGrades200ResponseAssignmentsInner) SetAssignmentid(v int32)`

SetAssignmentid sets Assignmentid field to given value.

### HasAssignmentid

`func (o *ModAssignGetGrades200ResponseAssignmentsInner) HasAssignmentid() bool`

HasAssignmentid returns a boolean if a field has been set.

### GetGrades

`func (o *ModAssignGetGrades200ResponseAssignmentsInner) GetGrades() []ModAssignGetGrades200ResponseAssignmentsInnerGradesInner`

GetGrades returns the Grades field if non-nil, zero value otherwise.

### GetGradesOk

`func (o *ModAssignGetGrades200ResponseAssignmentsInner) GetGradesOk() (*[]ModAssignGetGrades200ResponseAssignmentsInnerGradesInner, bool)`

GetGradesOk returns a tuple with the Grades field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrades

`func (o *ModAssignGetGrades200ResponseAssignmentsInner) SetGrades(v []ModAssignGetGrades200ResponseAssignmentsInnerGradesInner)`

SetGrades sets Grades field to given value.

### HasGrades

`func (o *ModAssignGetGrades200ResponseAssignmentsInner) HasGrades() bool`

HasGrades returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


