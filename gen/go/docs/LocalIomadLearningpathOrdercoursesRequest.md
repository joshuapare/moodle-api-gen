# LocalIomadLearningpathOrdercoursesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courses** | [**[]LocalIomadLearningpathOrdercoursesRequestCoursesInner**](LocalIomadLearningpathOrdercoursesRequestCoursesInner.md) |  | 
**Pathid** | **int32** | ID of Iomad Learning Path | 

## Methods

### NewLocalIomadLearningpathOrdercoursesRequest

`func NewLocalIomadLearningpathOrdercoursesRequest(courses []LocalIomadLearningpathOrdercoursesRequestCoursesInner, pathid int32, ) *LocalIomadLearningpathOrdercoursesRequest`

NewLocalIomadLearningpathOrdercoursesRequest instantiates a new LocalIomadLearningpathOrdercoursesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLocalIomadLearningpathOrdercoursesRequestWithDefaults

`func NewLocalIomadLearningpathOrdercoursesRequestWithDefaults() *LocalIomadLearningpathOrdercoursesRequest`

NewLocalIomadLearningpathOrdercoursesRequestWithDefaults instantiates a new LocalIomadLearningpathOrdercoursesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourses

`func (o *LocalIomadLearningpathOrdercoursesRequest) GetCourses() []LocalIomadLearningpathOrdercoursesRequestCoursesInner`

GetCourses returns the Courses field if non-nil, zero value otherwise.

### GetCoursesOk

`func (o *LocalIomadLearningpathOrdercoursesRequest) GetCoursesOk() (*[]LocalIomadLearningpathOrdercoursesRequestCoursesInner, bool)`

GetCoursesOk returns a tuple with the Courses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourses

`func (o *LocalIomadLearningpathOrdercoursesRequest) SetCourses(v []LocalIomadLearningpathOrdercoursesRequestCoursesInner)`

SetCourses sets Courses field to given value.


### GetPathid

`func (o *LocalIomadLearningpathOrdercoursesRequest) GetPathid() int32`

GetPathid returns the Pathid field if non-nil, zero value otherwise.

### GetPathidOk

`func (o *LocalIomadLearningpathOrdercoursesRequest) GetPathidOk() (*int32, bool)`

GetPathidOk returns a tuple with the Pathid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPathid

`func (o *LocalIomadLearningpathOrdercoursesRequest) SetPathid(v int32)`

SetPathid sets Pathid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


