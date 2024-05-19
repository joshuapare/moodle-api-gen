# ModAssignSaveUserExtensionsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Assignmentid** | **int32** | The assignment id to operate on | 
**Dates** | **[]map[string]interface{}** |  | 
**Userids** | **[]map[string]interface{}** |  | 

## Methods

### NewModAssignSaveUserExtensionsRequest

`func NewModAssignSaveUserExtensionsRequest(assignmentid int32, dates []map[string]interface{}, userids []map[string]interface{}, ) *ModAssignSaveUserExtensionsRequest`

NewModAssignSaveUserExtensionsRequest instantiates a new ModAssignSaveUserExtensionsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignSaveUserExtensionsRequestWithDefaults

`func NewModAssignSaveUserExtensionsRequestWithDefaults() *ModAssignSaveUserExtensionsRequest`

NewModAssignSaveUserExtensionsRequestWithDefaults instantiates a new ModAssignSaveUserExtensionsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssignmentid

`func (o *ModAssignSaveUserExtensionsRequest) GetAssignmentid() int32`

GetAssignmentid returns the Assignmentid field if non-nil, zero value otherwise.

### GetAssignmentidOk

`func (o *ModAssignSaveUserExtensionsRequest) GetAssignmentidOk() (*int32, bool)`

GetAssignmentidOk returns a tuple with the Assignmentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssignmentid

`func (o *ModAssignSaveUserExtensionsRequest) SetAssignmentid(v int32)`

SetAssignmentid sets Assignmentid field to given value.


### GetDates

`func (o *ModAssignSaveUserExtensionsRequest) GetDates() []map[string]interface{}`

GetDates returns the Dates field if non-nil, zero value otherwise.

### GetDatesOk

`func (o *ModAssignSaveUserExtensionsRequest) GetDatesOk() (*[]map[string]interface{}, bool)`

GetDatesOk returns a tuple with the Dates field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDates

`func (o *ModAssignSaveUserExtensionsRequest) SetDates(v []map[string]interface{})`

SetDates sets Dates field to given value.


### GetUserids

`func (o *ModAssignSaveUserExtensionsRequest) GetUserids() []map[string]interface{}`

GetUserids returns the Userids field if non-nil, zero value otherwise.

### GetUseridsOk

`func (o *ModAssignSaveUserExtensionsRequest) GetUseridsOk() (*[]map[string]interface{}, bool)`

GetUseridsOk returns a tuple with the Userids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserids

`func (o *ModAssignSaveUserExtensionsRequest) SetUserids(v []map[string]interface{})`

SetUserids sets Userids field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


