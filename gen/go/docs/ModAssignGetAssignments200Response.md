# ModAssignGetAssignments200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courses** | [**[]ModAssignGetAssignments200ResponseCoursesInner**](ModAssignGetAssignments200ResponseCoursesInner.md) |  | 
**Warnings** | Pointer to [**[]ModAssignGetAssignments200ResponseWarningsInner**](ModAssignGetAssignments200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModAssignGetAssignments200Response

`func NewModAssignGetAssignments200Response(courses []ModAssignGetAssignments200ResponseCoursesInner, ) *ModAssignGetAssignments200Response`

NewModAssignGetAssignments200Response instantiates a new ModAssignGetAssignments200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignGetAssignments200ResponseWithDefaults

`func NewModAssignGetAssignments200ResponseWithDefaults() *ModAssignGetAssignments200Response`

NewModAssignGetAssignments200ResponseWithDefaults instantiates a new ModAssignGetAssignments200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourses

`func (o *ModAssignGetAssignments200Response) GetCourses() []ModAssignGetAssignments200ResponseCoursesInner`

GetCourses returns the Courses field if non-nil, zero value otherwise.

### GetCoursesOk

`func (o *ModAssignGetAssignments200Response) GetCoursesOk() (*[]ModAssignGetAssignments200ResponseCoursesInner, bool)`

GetCoursesOk returns a tuple with the Courses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourses

`func (o *ModAssignGetAssignments200Response) SetCourses(v []ModAssignGetAssignments200ResponseCoursesInner)`

SetCourses sets Courses field to given value.


### GetWarnings

`func (o *ModAssignGetAssignments200Response) GetWarnings() []ModAssignGetAssignments200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModAssignGetAssignments200Response) GetWarningsOk() (*[]ModAssignGetAssignments200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModAssignGetAssignments200Response) SetWarnings(v []ModAssignGetAssignments200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModAssignGetAssignments200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


