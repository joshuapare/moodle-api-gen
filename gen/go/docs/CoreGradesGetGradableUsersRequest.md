# CoreGradesGetGradableUsersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | **int32** | Course Id | 
**Groupid** | Pointer to **int32** | Group Id | [optional] [default to 0]
**Onlyactive** | Pointer to **bool** | Only active enrolment | [optional] [default to false]

## Methods

### NewCoreGradesGetGradableUsersRequest

`func NewCoreGradesGetGradableUsersRequest(courseid int32, ) *CoreGradesGetGradableUsersRequest`

NewCoreGradesGetGradableUsersRequest instantiates a new CoreGradesGetGradableUsersRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGradesGetGradableUsersRequestWithDefaults

`func NewCoreGradesGetGradableUsersRequestWithDefaults() *CoreGradesGetGradableUsersRequest`

NewCoreGradesGetGradableUsersRequestWithDefaults instantiates a new CoreGradesGetGradableUsersRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *CoreGradesGetGradableUsersRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreGradesGetGradableUsersRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreGradesGetGradableUsersRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetGroupid

`func (o *CoreGradesGetGradableUsersRequest) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *CoreGradesGetGradableUsersRequest) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *CoreGradesGetGradableUsersRequest) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *CoreGradesGetGradableUsersRequest) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetOnlyactive

`func (o *CoreGradesGetGradableUsersRequest) GetOnlyactive() bool`

GetOnlyactive returns the Onlyactive field if non-nil, zero value otherwise.

### GetOnlyactiveOk

`func (o *CoreGradesGetGradableUsersRequest) GetOnlyactiveOk() (*bool, bool)`

GetOnlyactiveOk returns a tuple with the Onlyactive field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOnlyactive

`func (o *CoreGradesGetGradableUsersRequest) SetOnlyactive(v bool)`

SetOnlyactive sets Onlyactive field to given value.

### HasOnlyactive

`func (o *CoreGradesGetGradableUsersRequest) HasOnlyactive() bool`

HasOnlyactive returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


