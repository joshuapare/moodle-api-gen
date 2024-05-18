# CoreNotesGetCourseNotesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | **int32** | course id, 0 for SITE | [default to null]
**Userid** | Pointer to **int32** | user id | [optional] [default to 0]

## Methods

### NewCoreNotesGetCourseNotesRequest

`func NewCoreNotesGetCourseNotesRequest(courseid int32, ) *CoreNotesGetCourseNotesRequest`

NewCoreNotesGetCourseNotesRequest instantiates a new CoreNotesGetCourseNotesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreNotesGetCourseNotesRequestWithDefaults

`func NewCoreNotesGetCourseNotesRequestWithDefaults() *CoreNotesGetCourseNotesRequest`

NewCoreNotesGetCourseNotesRequestWithDefaults instantiates a new CoreNotesGetCourseNotesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *CoreNotesGetCourseNotesRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreNotesGetCourseNotesRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreNotesGetCourseNotesRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetUserid

`func (o *CoreNotesGetCourseNotesRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreNotesGetCourseNotesRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreNotesGetCourseNotesRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreNotesGetCourseNotesRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


