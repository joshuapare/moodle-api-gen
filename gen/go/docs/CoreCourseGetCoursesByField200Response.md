# CoreCourseGetCoursesByField200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courses** | [**[]CoreCourseGetCoursesByField200ResponseCoursesInner**](CoreCourseGetCoursesByField200ResponseCoursesInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreCourseGetCoursesByField200Response

`func NewCoreCourseGetCoursesByField200Response(courses []CoreCourseGetCoursesByField200ResponseCoursesInner, ) *CoreCourseGetCoursesByField200Response`

NewCoreCourseGetCoursesByField200Response instantiates a new CoreCourseGetCoursesByField200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseGetCoursesByField200ResponseWithDefaults

`func NewCoreCourseGetCoursesByField200ResponseWithDefaults() *CoreCourseGetCoursesByField200Response`

NewCoreCourseGetCoursesByField200ResponseWithDefaults instantiates a new CoreCourseGetCoursesByField200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourses

`func (o *CoreCourseGetCoursesByField200Response) GetCourses() []CoreCourseGetCoursesByField200ResponseCoursesInner`

GetCourses returns the Courses field if non-nil, zero value otherwise.

### GetCoursesOk

`func (o *CoreCourseGetCoursesByField200Response) GetCoursesOk() (*[]CoreCourseGetCoursesByField200ResponseCoursesInner, bool)`

GetCoursesOk returns a tuple with the Courses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourses

`func (o *CoreCourseGetCoursesByField200Response) SetCourses(v []CoreCourseGetCoursesByField200ResponseCoursesInner)`

SetCourses sets Courses field to given value.


### GetWarnings

`func (o *CoreCourseGetCoursesByField200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreCourseGetCoursesByField200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreCourseGetCoursesByField200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreCourseGetCoursesByField200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


