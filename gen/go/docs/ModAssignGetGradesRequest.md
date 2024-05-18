# ModAssignGetGradesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Assignmentids** | **[]map[string]interface{}** |  | 
**Since** | Pointer to **int32** | timestamp, only return records where timemodified &gt;&#x3D; since | [optional] [default to 0]

## Methods

### NewModAssignGetGradesRequest

`func NewModAssignGetGradesRequest(assignmentids []map[string]interface{}, ) *ModAssignGetGradesRequest`

NewModAssignGetGradesRequest instantiates a new ModAssignGetGradesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignGetGradesRequestWithDefaults

`func NewModAssignGetGradesRequestWithDefaults() *ModAssignGetGradesRequest`

NewModAssignGetGradesRequestWithDefaults instantiates a new ModAssignGetGradesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssignmentids

`func (o *ModAssignGetGradesRequest) GetAssignmentids() []map[string]interface{}`

GetAssignmentids returns the Assignmentids field if non-nil, zero value otherwise.

### GetAssignmentidsOk

`func (o *ModAssignGetGradesRequest) GetAssignmentidsOk() (*[]map[string]interface{}, bool)`

GetAssignmentidsOk returns a tuple with the Assignmentids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssignmentids

`func (o *ModAssignGetGradesRequest) SetAssignmentids(v []map[string]interface{})`

SetAssignmentids sets Assignmentids field to given value.


### GetSince

`func (o *ModAssignGetGradesRequest) GetSince() int32`

GetSince returns the Since field if non-nil, zero value otherwise.

### GetSinceOk

`func (o *ModAssignGetGradesRequest) GetSinceOk() (*int32, bool)`

GetSinceOk returns a tuple with the Since field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSince

`func (o *ModAssignGetGradesRequest) SetSince(v int32)`

SetSince sets Since field to given value.

### HasSince

`func (o *ModAssignGetGradesRequest) HasSince() bool`

HasSince returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


