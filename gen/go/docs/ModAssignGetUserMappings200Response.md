# ModAssignGetUserMappings200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Assignments** | [**[]ModAssignGetUserMappings200ResponseAssignmentsInner**](ModAssignGetUserMappings200ResponseAssignmentsInner.md) |  | 
**Warnings** | Pointer to [**[]ModAssignGetUserMappings200ResponseWarningsInner**](ModAssignGetUserMappings200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModAssignGetUserMappings200Response

`func NewModAssignGetUserMappings200Response(assignments []ModAssignGetUserMappings200ResponseAssignmentsInner, ) *ModAssignGetUserMappings200Response`

NewModAssignGetUserMappings200Response instantiates a new ModAssignGetUserMappings200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignGetUserMappings200ResponseWithDefaults

`func NewModAssignGetUserMappings200ResponseWithDefaults() *ModAssignGetUserMappings200Response`

NewModAssignGetUserMappings200ResponseWithDefaults instantiates a new ModAssignGetUserMappings200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssignments

`func (o *ModAssignGetUserMappings200Response) GetAssignments() []ModAssignGetUserMappings200ResponseAssignmentsInner`

GetAssignments returns the Assignments field if non-nil, zero value otherwise.

### GetAssignmentsOk

`func (o *ModAssignGetUserMappings200Response) GetAssignmentsOk() (*[]ModAssignGetUserMappings200ResponseAssignmentsInner, bool)`

GetAssignmentsOk returns a tuple with the Assignments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssignments

`func (o *ModAssignGetUserMappings200Response) SetAssignments(v []ModAssignGetUserMappings200ResponseAssignmentsInner)`

SetAssignments sets Assignments field to given value.


### GetWarnings

`func (o *ModAssignGetUserMappings200Response) GetWarnings() []ModAssignGetUserMappings200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModAssignGetUserMappings200Response) GetWarningsOk() (*[]ModAssignGetUserMappings200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModAssignGetUserMappings200Response) SetWarnings(v []ModAssignGetUserMappings200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModAssignGetUserMappings200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


