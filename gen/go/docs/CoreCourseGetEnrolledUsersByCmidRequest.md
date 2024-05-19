# CoreCourseGetEnrolledUsersByCmidRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cmid** | **int32** | id of the course module | [default to null]
**Groupid** | Pointer to **int32** | id of the group | [optional] [default to 0]
**Onlyactive** | Pointer to **bool** | whether to return only active users or all. | [optional] [default to false]

## Methods

### NewCoreCourseGetEnrolledUsersByCmidRequest

`func NewCoreCourseGetEnrolledUsersByCmidRequest(cmid int32, ) *CoreCourseGetEnrolledUsersByCmidRequest`

NewCoreCourseGetEnrolledUsersByCmidRequest instantiates a new CoreCourseGetEnrolledUsersByCmidRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseGetEnrolledUsersByCmidRequestWithDefaults

`func NewCoreCourseGetEnrolledUsersByCmidRequestWithDefaults() *CoreCourseGetEnrolledUsersByCmidRequest`

NewCoreCourseGetEnrolledUsersByCmidRequestWithDefaults instantiates a new CoreCourseGetEnrolledUsersByCmidRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCmid

`func (o *CoreCourseGetEnrolledUsersByCmidRequest) GetCmid() int32`

GetCmid returns the Cmid field if non-nil, zero value otherwise.

### GetCmidOk

`func (o *CoreCourseGetEnrolledUsersByCmidRequest) GetCmidOk() (*int32, bool)`

GetCmidOk returns a tuple with the Cmid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCmid

`func (o *CoreCourseGetEnrolledUsersByCmidRequest) SetCmid(v int32)`

SetCmid sets Cmid field to given value.


### GetGroupid

`func (o *CoreCourseGetEnrolledUsersByCmidRequest) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *CoreCourseGetEnrolledUsersByCmidRequest) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *CoreCourseGetEnrolledUsersByCmidRequest) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *CoreCourseGetEnrolledUsersByCmidRequest) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetOnlyactive

`func (o *CoreCourseGetEnrolledUsersByCmidRequest) GetOnlyactive() bool`

GetOnlyactive returns the Onlyactive field if non-nil, zero value otherwise.

### GetOnlyactiveOk

`func (o *CoreCourseGetEnrolledUsersByCmidRequest) GetOnlyactiveOk() (*bool, bool)`

GetOnlyactiveOk returns a tuple with the Onlyactive field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOnlyactive

`func (o *CoreCourseGetEnrolledUsersByCmidRequest) SetOnlyactive(v bool)`

SetOnlyactive sets Onlyactive field to given value.

### HasOnlyactive

`func (o *CoreCourseGetEnrolledUsersByCmidRequest) HasOnlyactive() bool`

HasOnlyactive returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


