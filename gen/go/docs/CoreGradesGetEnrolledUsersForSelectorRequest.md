# CoreGradesGetEnrolledUsersForSelectorRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | **int32** | Course Id | 
**Groupid** | Pointer to **int32** | Group Id | [optional] [default to 0]

## Methods

### NewCoreGradesGetEnrolledUsersForSelectorRequest

`func NewCoreGradesGetEnrolledUsersForSelectorRequest(courseid int32, ) *CoreGradesGetEnrolledUsersForSelectorRequest`

NewCoreGradesGetEnrolledUsersForSelectorRequest instantiates a new CoreGradesGetEnrolledUsersForSelectorRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGradesGetEnrolledUsersForSelectorRequestWithDefaults

`func NewCoreGradesGetEnrolledUsersForSelectorRequestWithDefaults() *CoreGradesGetEnrolledUsersForSelectorRequest`

NewCoreGradesGetEnrolledUsersForSelectorRequestWithDefaults instantiates a new CoreGradesGetEnrolledUsersForSelectorRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *CoreGradesGetEnrolledUsersForSelectorRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreGradesGetEnrolledUsersForSelectorRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreGradesGetEnrolledUsersForSelectorRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetGroupid

`func (o *CoreGradesGetEnrolledUsersForSelectorRequest) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *CoreGradesGetEnrolledUsersForSelectorRequest) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *CoreGradesGetEnrolledUsersForSelectorRequest) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *CoreGradesGetEnrolledUsersForSelectorRequest) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


