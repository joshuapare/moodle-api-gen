# ModAssignGetUserFlags200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Assignments** | [**[]ModAssignGetUserFlags200ResponseAssignmentsInner**](ModAssignGetUserFlags200ResponseAssignmentsInner.md) |  | 
**Warnings** | Pointer to [**[]ModAssignGetUserFlags200ResponseWarningsInner**](ModAssignGetUserFlags200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModAssignGetUserFlags200Response

`func NewModAssignGetUserFlags200Response(assignments []ModAssignGetUserFlags200ResponseAssignmentsInner, ) *ModAssignGetUserFlags200Response`

NewModAssignGetUserFlags200Response instantiates a new ModAssignGetUserFlags200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignGetUserFlags200ResponseWithDefaults

`func NewModAssignGetUserFlags200ResponseWithDefaults() *ModAssignGetUserFlags200Response`

NewModAssignGetUserFlags200ResponseWithDefaults instantiates a new ModAssignGetUserFlags200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssignments

`func (o *ModAssignGetUserFlags200Response) GetAssignments() []ModAssignGetUserFlags200ResponseAssignmentsInner`

GetAssignments returns the Assignments field if non-nil, zero value otherwise.

### GetAssignmentsOk

`func (o *ModAssignGetUserFlags200Response) GetAssignmentsOk() (*[]ModAssignGetUserFlags200ResponseAssignmentsInner, bool)`

GetAssignmentsOk returns a tuple with the Assignments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssignments

`func (o *ModAssignGetUserFlags200Response) SetAssignments(v []ModAssignGetUserFlags200ResponseAssignmentsInner)`

SetAssignments sets Assignments field to given value.


### GetWarnings

`func (o *ModAssignGetUserFlags200Response) GetWarnings() []ModAssignGetUserFlags200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModAssignGetUserFlags200Response) GetWarningsOk() (*[]ModAssignGetUserFlags200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModAssignGetUserFlags200Response) SetWarnings(v []ModAssignGetUserFlags200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModAssignGetUserFlags200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


