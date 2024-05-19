# CoreEnrolGetEnrolledUsersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | **int32** | course id | 
**Options** | Pointer to [**[]CoreEnrolGetEnrolledUsersRequestOptionsInner**](CoreEnrolGetEnrolledUsersRequestOptionsInner.md) |  | [optional] 

## Methods

### NewCoreEnrolGetEnrolledUsersRequest

`func NewCoreEnrolGetEnrolledUsersRequest(courseid int32, ) *CoreEnrolGetEnrolledUsersRequest`

NewCoreEnrolGetEnrolledUsersRequest instantiates a new CoreEnrolGetEnrolledUsersRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreEnrolGetEnrolledUsersRequestWithDefaults

`func NewCoreEnrolGetEnrolledUsersRequestWithDefaults() *CoreEnrolGetEnrolledUsersRequest`

NewCoreEnrolGetEnrolledUsersRequestWithDefaults instantiates a new CoreEnrolGetEnrolledUsersRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *CoreEnrolGetEnrolledUsersRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreEnrolGetEnrolledUsersRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreEnrolGetEnrolledUsersRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetOptions

`func (o *CoreEnrolGetEnrolledUsersRequest) GetOptions() []CoreEnrolGetEnrolledUsersRequestOptionsInner`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *CoreEnrolGetEnrolledUsersRequest) GetOptionsOk() (*[]CoreEnrolGetEnrolledUsersRequestOptionsInner, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *CoreEnrolGetEnrolledUsersRequest) SetOptions(v []CoreEnrolGetEnrolledUsersRequestOptionsInner)`

SetOptions sets Options field to given value.

### HasOptions

`func (o *CoreEnrolGetEnrolledUsersRequest) HasOptions() bool`

HasOptions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


