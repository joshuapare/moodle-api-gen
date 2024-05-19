# CoreGroupGetCourseUserGroupsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | Pointer to **int32** | Id of course (empty or 0 for all the courses where the user is enrolled). | [optional] [default to 0]
**Groupingid** | Pointer to **int32** | returns only groups in the specified grouping | [optional] [default to 0]
**Userid** | Pointer to **int32** | Id of user (empty or 0 for current user). | [optional] [default to 0]

## Methods

### NewCoreGroupGetCourseUserGroupsRequest

`func NewCoreGroupGetCourseUserGroupsRequest() *CoreGroupGetCourseUserGroupsRequest`

NewCoreGroupGetCourseUserGroupsRequest instantiates a new CoreGroupGetCourseUserGroupsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGroupGetCourseUserGroupsRequestWithDefaults

`func NewCoreGroupGetCourseUserGroupsRequestWithDefaults() *CoreGroupGetCourseUserGroupsRequest`

NewCoreGroupGetCourseUserGroupsRequestWithDefaults instantiates a new CoreGroupGetCourseUserGroupsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *CoreGroupGetCourseUserGroupsRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreGroupGetCourseUserGroupsRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreGroupGetCourseUserGroupsRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *CoreGroupGetCourseUserGroupsRequest) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetGroupingid

`func (o *CoreGroupGetCourseUserGroupsRequest) GetGroupingid() int32`

GetGroupingid returns the Groupingid field if non-nil, zero value otherwise.

### GetGroupingidOk

`func (o *CoreGroupGetCourseUserGroupsRequest) GetGroupingidOk() (*int32, bool)`

GetGroupingidOk returns a tuple with the Groupingid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupingid

`func (o *CoreGroupGetCourseUserGroupsRequest) SetGroupingid(v int32)`

SetGroupingid sets Groupingid field to given value.

### HasGroupingid

`func (o *CoreGroupGetCourseUserGroupsRequest) HasGroupingid() bool`

HasGroupingid returns a boolean if a field has been set.

### GetUserid

`func (o *CoreGroupGetCourseUserGroupsRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreGroupGetCourseUserGroupsRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreGroupGetCourseUserGroupsRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreGroupGetCourseUserGroupsRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


