# CoreUserViewUserListRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | **int32** | id of the course, 0 for site | [default to null]

## Methods

### NewCoreUserViewUserListRequest

`func NewCoreUserViewUserListRequest(courseid int32, ) *CoreUserViewUserListRequest`

NewCoreUserViewUserListRequest instantiates a new CoreUserViewUserListRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreUserViewUserListRequestWithDefaults

`func NewCoreUserViewUserListRequestWithDefaults() *CoreUserViewUserListRequest`

NewCoreUserViewUserListRequestWithDefaults instantiates a new CoreUserViewUserListRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *CoreUserViewUserListRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreUserViewUserListRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreUserViewUserListRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


