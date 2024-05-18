# CoreCourseViewCourseRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | **int32** | id of the course | [default to null]
**Sectionnumber** | Pointer to **int32** | section number | [optional] [default to 0]

## Methods

### NewCoreCourseViewCourseRequest

`func NewCoreCourseViewCourseRequest(courseid int32, ) *CoreCourseViewCourseRequest`

NewCoreCourseViewCourseRequest instantiates a new CoreCourseViewCourseRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseViewCourseRequestWithDefaults

`func NewCoreCourseViewCourseRequestWithDefaults() *CoreCourseViewCourseRequest`

NewCoreCourseViewCourseRequestWithDefaults instantiates a new CoreCourseViewCourseRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *CoreCourseViewCourseRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreCourseViewCourseRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreCourseViewCourseRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetSectionnumber

`func (o *CoreCourseViewCourseRequest) GetSectionnumber() int32`

GetSectionnumber returns the Sectionnumber field if non-nil, zero value otherwise.

### GetSectionnumberOk

`func (o *CoreCourseViewCourseRequest) GetSectionnumberOk() (*int32, bool)`

GetSectionnumberOk returns a tuple with the Sectionnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSectionnumber

`func (o *CoreCourseViewCourseRequest) SetSectionnumber(v int32)`

SetSectionnumber sets Sectionnumber field to given value.

### HasSectionnumber

`func (o *CoreCourseViewCourseRequest) HasSectionnumber() bool`

HasSectionnumber returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


