# CoreCourseGetEnrolledUsersByCmid200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Users** | [**[]CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner**](CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreCourseGetEnrolledUsersByCmid200Response

`func NewCoreCourseGetEnrolledUsersByCmid200Response(users []CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner, ) *CoreCourseGetEnrolledUsersByCmid200Response`

NewCoreCourseGetEnrolledUsersByCmid200Response instantiates a new CoreCourseGetEnrolledUsersByCmid200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseGetEnrolledUsersByCmid200ResponseWithDefaults

`func NewCoreCourseGetEnrolledUsersByCmid200ResponseWithDefaults() *CoreCourseGetEnrolledUsersByCmid200Response`

NewCoreCourseGetEnrolledUsersByCmid200ResponseWithDefaults instantiates a new CoreCourseGetEnrolledUsersByCmid200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUsers

`func (o *CoreCourseGetEnrolledUsersByCmid200Response) GetUsers() []CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner`

GetUsers returns the Users field if non-nil, zero value otherwise.

### GetUsersOk

`func (o *CoreCourseGetEnrolledUsersByCmid200Response) GetUsersOk() (*[]CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner, bool)`

GetUsersOk returns a tuple with the Users field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsers

`func (o *CoreCourseGetEnrolledUsersByCmid200Response) SetUsers(v []CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner)`

SetUsers sets Users field to given value.


### GetWarnings

`func (o *CoreCourseGetEnrolledUsersByCmid200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreCourseGetEnrolledUsersByCmid200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreCourseGetEnrolledUsersByCmid200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreCourseGetEnrolledUsersByCmid200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


