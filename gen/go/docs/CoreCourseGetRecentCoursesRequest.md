# CoreCourseGetRecentCoursesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Limit** | Pointer to **int32** | result set limit | [optional] [default to 0]
**Offset** | Pointer to **int32** | Result set offset | [optional] [default to 0]
**Sort** | Pointer to **string** | Sort string | [optional] 
**Userid** | Pointer to **int32** | id of the user, default to current user | [optional] [default to 0]

## Methods

### NewCoreCourseGetRecentCoursesRequest

`func NewCoreCourseGetRecentCoursesRequest() *CoreCourseGetRecentCoursesRequest`

NewCoreCourseGetRecentCoursesRequest instantiates a new CoreCourseGetRecentCoursesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseGetRecentCoursesRequestWithDefaults

`func NewCoreCourseGetRecentCoursesRequestWithDefaults() *CoreCourseGetRecentCoursesRequest`

NewCoreCourseGetRecentCoursesRequestWithDefaults instantiates a new CoreCourseGetRecentCoursesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLimit

`func (o *CoreCourseGetRecentCoursesRequest) GetLimit() int32`

GetLimit returns the Limit field if non-nil, zero value otherwise.

### GetLimitOk

`func (o *CoreCourseGetRecentCoursesRequest) GetLimitOk() (*int32, bool)`

GetLimitOk returns a tuple with the Limit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimit

`func (o *CoreCourseGetRecentCoursesRequest) SetLimit(v int32)`

SetLimit sets Limit field to given value.

### HasLimit

`func (o *CoreCourseGetRecentCoursesRequest) HasLimit() bool`

HasLimit returns a boolean if a field has been set.

### GetOffset

`func (o *CoreCourseGetRecentCoursesRequest) GetOffset() int32`

GetOffset returns the Offset field if non-nil, zero value otherwise.

### GetOffsetOk

`func (o *CoreCourseGetRecentCoursesRequest) GetOffsetOk() (*int32, bool)`

GetOffsetOk returns a tuple with the Offset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffset

`func (o *CoreCourseGetRecentCoursesRequest) SetOffset(v int32)`

SetOffset sets Offset field to given value.

### HasOffset

`func (o *CoreCourseGetRecentCoursesRequest) HasOffset() bool`

HasOffset returns a boolean if a field has been set.

### GetSort

`func (o *CoreCourseGetRecentCoursesRequest) GetSort() string`

GetSort returns the Sort field if non-nil, zero value otherwise.

### GetSortOk

`func (o *CoreCourseGetRecentCoursesRequest) GetSortOk() (*string, bool)`

GetSortOk returns a tuple with the Sort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSort

`func (o *CoreCourseGetRecentCoursesRequest) SetSort(v string)`

SetSort sets Sort field to given value.

### HasSort

`func (o *CoreCourseGetRecentCoursesRequest) HasSort() bool`

HasSort returns a boolean if a field has been set.

### GetUserid

`func (o *CoreCourseGetRecentCoursesRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreCourseGetRecentCoursesRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreCourseGetRecentCoursesRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreCourseGetRecentCoursesRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


