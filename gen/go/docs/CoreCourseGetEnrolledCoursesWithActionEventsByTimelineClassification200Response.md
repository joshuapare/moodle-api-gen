# CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courses** | [**[]CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner**](CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner.md) |  | 
**Morecoursesavailable** | **bool** | Whether more courses with events exist within the provided parameters | [default to null]
**Nextoffset** | **int32** | Offset for the next request | 

## Methods

### NewCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response

`func NewCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response(courses []CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner, morecoursesavailable bool, nextoffset int32, ) *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response`

NewCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response instantiates a new CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200ResponseWithDefaults

`func NewCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200ResponseWithDefaults() *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response`

NewCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200ResponseWithDefaults instantiates a new CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourses

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response) GetCourses() []CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner`

GetCourses returns the Courses field if non-nil, zero value otherwise.

### GetCoursesOk

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response) GetCoursesOk() (*[]CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner, bool)`

GetCoursesOk returns a tuple with the Courses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourses

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response) SetCourses(v []CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner)`

SetCourses sets Courses field to given value.


### GetMorecoursesavailable

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response) GetMorecoursesavailable() bool`

GetMorecoursesavailable returns the Morecoursesavailable field if non-nil, zero value otherwise.

### GetMorecoursesavailableOk

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response) GetMorecoursesavailableOk() (*bool, bool)`

GetMorecoursesavailableOk returns a tuple with the Morecoursesavailable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMorecoursesavailable

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response) SetMorecoursesavailable(v bool)`

SetMorecoursesavailable sets Morecoursesavailable field to given value.


### GetNextoffset

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response) GetNextoffset() int32`

GetNextoffset returns the Nextoffset field if non-nil, zero value otherwise.

### GetNextoffsetOk

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response) GetNextoffsetOk() (*int32, bool)`

GetNextoffsetOk returns a tuple with the Nextoffset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextoffset

`func (o *CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response) SetNextoffset(v int32)`

SetNextoffset sets Nextoffset field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


