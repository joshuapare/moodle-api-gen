# CoreUserGetPrivateFilesInfoRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Userid** | Pointer to **int32** | Id of the user, default to current user. | [optional] [default to 0]

## Methods

### NewCoreUserGetPrivateFilesInfoRequest

`func NewCoreUserGetPrivateFilesInfoRequest() *CoreUserGetPrivateFilesInfoRequest`

NewCoreUserGetPrivateFilesInfoRequest instantiates a new CoreUserGetPrivateFilesInfoRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreUserGetPrivateFilesInfoRequestWithDefaults

`func NewCoreUserGetPrivateFilesInfoRequestWithDefaults() *CoreUserGetPrivateFilesInfoRequest`

NewCoreUserGetPrivateFilesInfoRequestWithDefaults instantiates a new CoreUserGetPrivateFilesInfoRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUserid

`func (o *CoreUserGetPrivateFilesInfoRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreUserGetPrivateFilesInfoRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreUserGetPrivateFilesInfoRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreUserGetPrivateFilesInfoRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


