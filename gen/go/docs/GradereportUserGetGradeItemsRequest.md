# GradereportUserGetGradeItemsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | **int32** | Course Id | 
**Groupid** | Pointer to **int32** | Get users from this group only | [optional] [default to 0]
**Userid** | Pointer to **int32** | Return grades only for this user (optional) | [optional] [default to 0]

## Methods

### NewGradereportUserGetGradeItemsRequest

`func NewGradereportUserGetGradeItemsRequest(courseid int32, ) *GradereportUserGetGradeItemsRequest`

NewGradereportUserGetGradeItemsRequest instantiates a new GradereportUserGetGradeItemsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGradereportUserGetGradeItemsRequestWithDefaults

`func NewGradereportUserGetGradeItemsRequestWithDefaults() *GradereportUserGetGradeItemsRequest`

NewGradereportUserGetGradeItemsRequestWithDefaults instantiates a new GradereportUserGetGradeItemsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *GradereportUserGetGradeItemsRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *GradereportUserGetGradeItemsRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *GradereportUserGetGradeItemsRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetGroupid

`func (o *GradereportUserGetGradeItemsRequest) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *GradereportUserGetGradeItemsRequest) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *GradereportUserGetGradeItemsRequest) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *GradereportUserGetGradeItemsRequest) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetUserid

`func (o *GradereportUserGetGradeItemsRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *GradereportUserGetGradeItemsRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *GradereportUserGetGradeItemsRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *GradereportUserGetGradeItemsRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


