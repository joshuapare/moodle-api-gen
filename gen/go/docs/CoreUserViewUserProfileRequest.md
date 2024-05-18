# CoreUserViewUserProfileRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | Pointer to **int32** | id of the course, default site course | [optional] [default to 0]
**Userid** | **int32** | id of the user, 0 for current user | 

## Methods

### NewCoreUserViewUserProfileRequest

`func NewCoreUserViewUserProfileRequest(userid int32, ) *CoreUserViewUserProfileRequest`

NewCoreUserViewUserProfileRequest instantiates a new CoreUserViewUserProfileRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreUserViewUserProfileRequestWithDefaults

`func NewCoreUserViewUserProfileRequestWithDefaults() *CoreUserViewUserProfileRequest`

NewCoreUserViewUserProfileRequestWithDefaults instantiates a new CoreUserViewUserProfileRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *CoreUserViewUserProfileRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreUserViewUserProfileRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreUserViewUserProfileRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *CoreUserViewUserProfileRequest) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetUserid

`func (o *CoreUserViewUserProfileRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreUserViewUserProfileRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreUserViewUserProfileRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


