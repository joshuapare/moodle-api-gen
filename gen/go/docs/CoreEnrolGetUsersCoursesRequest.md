# CoreEnrolGetUsersCoursesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Returnusercount** | Pointer to **bool** | Include count of enrolled users for each course? This can add several seconds to the response time if a user is on several large courses, so set this to false if the value will not be used to improve performance. | [optional] [default to true]
**Userid** | **int32** | user id | 

## Methods

### NewCoreEnrolGetUsersCoursesRequest

`func NewCoreEnrolGetUsersCoursesRequest(userid int32, ) *CoreEnrolGetUsersCoursesRequest`

NewCoreEnrolGetUsersCoursesRequest instantiates a new CoreEnrolGetUsersCoursesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreEnrolGetUsersCoursesRequestWithDefaults

`func NewCoreEnrolGetUsersCoursesRequestWithDefaults() *CoreEnrolGetUsersCoursesRequest`

NewCoreEnrolGetUsersCoursesRequestWithDefaults instantiates a new CoreEnrolGetUsersCoursesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetReturnusercount

`func (o *CoreEnrolGetUsersCoursesRequest) GetReturnusercount() bool`

GetReturnusercount returns the Returnusercount field if non-nil, zero value otherwise.

### GetReturnusercountOk

`func (o *CoreEnrolGetUsersCoursesRequest) GetReturnusercountOk() (*bool, bool)`

GetReturnusercountOk returns a tuple with the Returnusercount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReturnusercount

`func (o *CoreEnrolGetUsersCoursesRequest) SetReturnusercount(v bool)`

SetReturnusercount sets Returnusercount field to given value.

### HasReturnusercount

`func (o *CoreEnrolGetUsersCoursesRequest) HasReturnusercount() bool`

HasReturnusercount returns a boolean if a field has been set.

### GetUserid

`func (o *CoreEnrolGetUsersCoursesRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreEnrolGetUsersCoursesRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreEnrolGetUsersCoursesRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


