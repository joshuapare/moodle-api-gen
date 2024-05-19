# CoreGradesGetEnrolledUsersForSearchWidgetRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Actionbaseurl** | **string** | The base URL for the user option | [default to "null"]
**Courseid** | **int32** | Course Id | [default to null]
**Groupid** | Pointer to **int32** | Group Id | [optional] [default to 0]

## Methods

### NewCoreGradesGetEnrolledUsersForSearchWidgetRequest

`func NewCoreGradesGetEnrolledUsersForSearchWidgetRequest(actionbaseurl string, courseid int32, ) *CoreGradesGetEnrolledUsersForSearchWidgetRequest`

NewCoreGradesGetEnrolledUsersForSearchWidgetRequest instantiates a new CoreGradesGetEnrolledUsersForSearchWidgetRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGradesGetEnrolledUsersForSearchWidgetRequestWithDefaults

`func NewCoreGradesGetEnrolledUsersForSearchWidgetRequestWithDefaults() *CoreGradesGetEnrolledUsersForSearchWidgetRequest`

NewCoreGradesGetEnrolledUsersForSearchWidgetRequestWithDefaults instantiates a new CoreGradesGetEnrolledUsersForSearchWidgetRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetActionbaseurl

`func (o *CoreGradesGetEnrolledUsersForSearchWidgetRequest) GetActionbaseurl() string`

GetActionbaseurl returns the Actionbaseurl field if non-nil, zero value otherwise.

### GetActionbaseurlOk

`func (o *CoreGradesGetEnrolledUsersForSearchWidgetRequest) GetActionbaseurlOk() (*string, bool)`

GetActionbaseurlOk returns a tuple with the Actionbaseurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActionbaseurl

`func (o *CoreGradesGetEnrolledUsersForSearchWidgetRequest) SetActionbaseurl(v string)`

SetActionbaseurl sets Actionbaseurl field to given value.


### GetCourseid

`func (o *CoreGradesGetEnrolledUsersForSearchWidgetRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreGradesGetEnrolledUsersForSearchWidgetRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreGradesGetEnrolledUsersForSearchWidgetRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetGroupid

`func (o *CoreGradesGetEnrolledUsersForSearchWidgetRequest) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *CoreGradesGetEnrolledUsersForSearchWidgetRequest) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *CoreGradesGetEnrolledUsersForSearchWidgetRequest) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *CoreGradesGetEnrolledUsersForSearchWidgetRequest) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


