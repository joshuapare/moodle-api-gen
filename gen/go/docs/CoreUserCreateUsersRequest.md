# CoreUserCreateUsersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Users** | [**[]CoreUserCreateUsersRequestUsersInner**](CoreUserCreateUsersRequestUsersInner.md) |  | 

## Methods

### NewCoreUserCreateUsersRequest

`func NewCoreUserCreateUsersRequest(users []CoreUserCreateUsersRequestUsersInner, ) *CoreUserCreateUsersRequest`

NewCoreUserCreateUsersRequest instantiates a new CoreUserCreateUsersRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreUserCreateUsersRequestWithDefaults

`func NewCoreUserCreateUsersRequestWithDefaults() *CoreUserCreateUsersRequest`

NewCoreUserCreateUsersRequestWithDefaults instantiates a new CoreUserCreateUsersRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUsers

`func (o *CoreUserCreateUsersRequest) GetUsers() []CoreUserCreateUsersRequestUsersInner`

GetUsers returns the Users field if non-nil, zero value otherwise.

### GetUsersOk

`func (o *CoreUserCreateUsersRequest) GetUsersOk() (*[]CoreUserCreateUsersRequestUsersInner, bool)`

GetUsersOk returns a tuple with the Users field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsers

`func (o *CoreUserCreateUsersRequest) SetUsers(v []CoreUserCreateUsersRequestUsersInner)`

SetUsers sets Users field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


