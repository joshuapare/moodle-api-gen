# ModAssignGetSubmissionsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Assignmentids** | **[]map[string]interface{}** |  | 
**Before** | Pointer to **int32** | submitted before | [optional] [default to 0]
**Since** | Pointer to **int32** | submitted since | [optional] [default to 0]
**Status** | Pointer to **string** | status | [optional] [default to ""]

## Methods

### NewModAssignGetSubmissionsRequest

`func NewModAssignGetSubmissionsRequest(assignmentids []map[string]interface{}, ) *ModAssignGetSubmissionsRequest`

NewModAssignGetSubmissionsRequest instantiates a new ModAssignGetSubmissionsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignGetSubmissionsRequestWithDefaults

`func NewModAssignGetSubmissionsRequestWithDefaults() *ModAssignGetSubmissionsRequest`

NewModAssignGetSubmissionsRequestWithDefaults instantiates a new ModAssignGetSubmissionsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssignmentids

`func (o *ModAssignGetSubmissionsRequest) GetAssignmentids() []map[string]interface{}`

GetAssignmentids returns the Assignmentids field if non-nil, zero value otherwise.

### GetAssignmentidsOk

`func (o *ModAssignGetSubmissionsRequest) GetAssignmentidsOk() (*[]map[string]interface{}, bool)`

GetAssignmentidsOk returns a tuple with the Assignmentids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssignmentids

`func (o *ModAssignGetSubmissionsRequest) SetAssignmentids(v []map[string]interface{})`

SetAssignmentids sets Assignmentids field to given value.


### GetBefore

`func (o *ModAssignGetSubmissionsRequest) GetBefore() int32`

GetBefore returns the Before field if non-nil, zero value otherwise.

### GetBeforeOk

`func (o *ModAssignGetSubmissionsRequest) GetBeforeOk() (*int32, bool)`

GetBeforeOk returns a tuple with the Before field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBefore

`func (o *ModAssignGetSubmissionsRequest) SetBefore(v int32)`

SetBefore sets Before field to given value.

### HasBefore

`func (o *ModAssignGetSubmissionsRequest) HasBefore() bool`

HasBefore returns a boolean if a field has been set.

### GetSince

`func (o *ModAssignGetSubmissionsRequest) GetSince() int32`

GetSince returns the Since field if non-nil, zero value otherwise.

### GetSinceOk

`func (o *ModAssignGetSubmissionsRequest) GetSinceOk() (*int32, bool)`

GetSinceOk returns a tuple with the Since field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSince

`func (o *ModAssignGetSubmissionsRequest) SetSince(v int32)`

SetSince sets Since field to given value.

### HasSince

`func (o *ModAssignGetSubmissionsRequest) HasSince() bool`

HasSince returns a boolean if a field has been set.

### GetStatus

`func (o *ModAssignGetSubmissionsRequest) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ModAssignGetSubmissionsRequest) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ModAssignGetSubmissionsRequest) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *ModAssignGetSubmissionsRequest) HasStatus() bool`

HasStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


