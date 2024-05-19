# ModAssignGetGrades200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Assignments** | [**[]ModAssignGetGrades200ResponseAssignmentsInner**](ModAssignGetGrades200ResponseAssignmentsInner.md) |  | 
**Warnings** | Pointer to [**[]ModAssignGetGrades200ResponseWarningsInner**](ModAssignGetGrades200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModAssignGetGrades200Response

`func NewModAssignGetGrades200Response(assignments []ModAssignGetGrades200ResponseAssignmentsInner, ) *ModAssignGetGrades200Response`

NewModAssignGetGrades200Response instantiates a new ModAssignGetGrades200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignGetGrades200ResponseWithDefaults

`func NewModAssignGetGrades200ResponseWithDefaults() *ModAssignGetGrades200Response`

NewModAssignGetGrades200ResponseWithDefaults instantiates a new ModAssignGetGrades200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssignments

`func (o *ModAssignGetGrades200Response) GetAssignments() []ModAssignGetGrades200ResponseAssignmentsInner`

GetAssignments returns the Assignments field if non-nil, zero value otherwise.

### GetAssignmentsOk

`func (o *ModAssignGetGrades200Response) GetAssignmentsOk() (*[]ModAssignGetGrades200ResponseAssignmentsInner, bool)`

GetAssignmentsOk returns a tuple with the Assignments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssignments

`func (o *ModAssignGetGrades200Response) SetAssignments(v []ModAssignGetGrades200ResponseAssignmentsInner)`

SetAssignments sets Assignments field to given value.


### GetWarnings

`func (o *ModAssignGetGrades200Response) GetWarnings() []ModAssignGetGrades200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModAssignGetGrades200Response) GetWarningsOk() (*[]ModAssignGetGrades200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModAssignGetGrades200Response) SetWarnings(v []ModAssignGetGrades200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModAssignGetGrades200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


