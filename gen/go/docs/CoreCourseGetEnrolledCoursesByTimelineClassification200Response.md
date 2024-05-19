# CoreCourseGetEnrolledCoursesByTimelineClassification200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courses** | [**[]CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner**](CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner.md) |  | 
**Nextoffset** | **int32** | Offset for the next request | [default to null]

## Methods

### NewCoreCourseGetEnrolledCoursesByTimelineClassification200Response

`func NewCoreCourseGetEnrolledCoursesByTimelineClassification200Response(courses []CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner, nextoffset int32, ) *CoreCourseGetEnrolledCoursesByTimelineClassification200Response`

NewCoreCourseGetEnrolledCoursesByTimelineClassification200Response instantiates a new CoreCourseGetEnrolledCoursesByTimelineClassification200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseGetEnrolledCoursesByTimelineClassification200ResponseWithDefaults

`func NewCoreCourseGetEnrolledCoursesByTimelineClassification200ResponseWithDefaults() *CoreCourseGetEnrolledCoursesByTimelineClassification200Response`

NewCoreCourseGetEnrolledCoursesByTimelineClassification200ResponseWithDefaults instantiates a new CoreCourseGetEnrolledCoursesByTimelineClassification200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourses

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200Response) GetCourses() []CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner`

GetCourses returns the Courses field if non-nil, zero value otherwise.

### GetCoursesOk

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200Response) GetCoursesOk() (*[]CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner, bool)`

GetCoursesOk returns a tuple with the Courses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourses

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200Response) SetCourses(v []CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner)`

SetCourses sets Courses field to given value.


### GetNextoffset

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200Response) GetNextoffset() int32`

GetNextoffset returns the Nextoffset field if non-nil, zero value otherwise.

### GetNextoffsetOk

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200Response) GetNextoffsetOk() (*int32, bool)`

GetNextoffsetOk returns a tuple with the Nextoffset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextoffset

`func (o *CoreCourseGetEnrolledCoursesByTimelineClassification200Response) SetNextoffset(v int32)`

SetNextoffset sets Nextoffset field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


