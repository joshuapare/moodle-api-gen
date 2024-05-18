# CoreCourseSearchCourses200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courses** | [**[]CoreCourseSearchCourses200ResponseCoursesInner**](CoreCourseSearchCourses200ResponseCoursesInner.md) |  | 
**Total** | **int32** | total course count | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreCourseSearchCourses200Response

`func NewCoreCourseSearchCourses200Response(courses []CoreCourseSearchCourses200ResponseCoursesInner, total int32, ) *CoreCourseSearchCourses200Response`

NewCoreCourseSearchCourses200Response instantiates a new CoreCourseSearchCourses200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseSearchCourses200ResponseWithDefaults

`func NewCoreCourseSearchCourses200ResponseWithDefaults() *CoreCourseSearchCourses200Response`

NewCoreCourseSearchCourses200ResponseWithDefaults instantiates a new CoreCourseSearchCourses200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourses

`func (o *CoreCourseSearchCourses200Response) GetCourses() []CoreCourseSearchCourses200ResponseCoursesInner`

GetCourses returns the Courses field if non-nil, zero value otherwise.

### GetCoursesOk

`func (o *CoreCourseSearchCourses200Response) GetCoursesOk() (*[]CoreCourseSearchCourses200ResponseCoursesInner, bool)`

GetCoursesOk returns a tuple with the Courses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourses

`func (o *CoreCourseSearchCourses200Response) SetCourses(v []CoreCourseSearchCourses200ResponseCoursesInner)`

SetCourses sets Courses field to given value.


### GetTotal

`func (o *CoreCourseSearchCourses200Response) GetTotal() int32`

GetTotal returns the Total field if non-nil, zero value otherwise.

### GetTotalOk

`func (o *CoreCourseSearchCourses200Response) GetTotalOk() (*int32, bool)`

GetTotalOk returns a tuple with the Total field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotal

`func (o *CoreCourseSearchCourses200Response) SetTotal(v int32)`

SetTotal sets Total field to given value.


### GetWarnings

`func (o *CoreCourseSearchCourses200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreCourseSearchCourses200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreCourseSearchCourses200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreCourseSearchCourses200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


