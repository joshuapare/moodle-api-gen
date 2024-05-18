# ModAssignGetSubmissions200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Assignments** | [**[]ModAssignGetSubmissions200ResponseAssignmentsInner**](ModAssignGetSubmissions200ResponseAssignmentsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModAssignGetSubmissions200Response

`func NewModAssignGetSubmissions200Response(assignments []ModAssignGetSubmissions200ResponseAssignmentsInner, ) *ModAssignGetSubmissions200Response`

NewModAssignGetSubmissions200Response instantiates a new ModAssignGetSubmissions200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignGetSubmissions200ResponseWithDefaults

`func NewModAssignGetSubmissions200ResponseWithDefaults() *ModAssignGetSubmissions200Response`

NewModAssignGetSubmissions200ResponseWithDefaults instantiates a new ModAssignGetSubmissions200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssignments

`func (o *ModAssignGetSubmissions200Response) GetAssignments() []ModAssignGetSubmissions200ResponseAssignmentsInner`

GetAssignments returns the Assignments field if non-nil, zero value otherwise.

### GetAssignmentsOk

`func (o *ModAssignGetSubmissions200Response) GetAssignmentsOk() (*[]ModAssignGetSubmissions200ResponseAssignmentsInner, bool)`

GetAssignmentsOk returns a tuple with the Assignments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssignments

`func (o *ModAssignGetSubmissions200Response) SetAssignments(v []ModAssignGetSubmissions200ResponseAssignmentsInner)`

SetAssignments sets Assignments field to given value.


### GetWarnings

`func (o *ModAssignGetSubmissions200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModAssignGetSubmissions200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModAssignGetSubmissions200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModAssignGetSubmissions200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


