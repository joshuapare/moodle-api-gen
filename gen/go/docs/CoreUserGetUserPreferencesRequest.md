# CoreUserGetUserPreferencesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | preference name, empty for all | [optional] [default to ""]
**Userid** | Pointer to **int32** | id of the user, default to current user | [optional] [default to 0]

## Methods

### NewCoreUserGetUserPreferencesRequest

`func NewCoreUserGetUserPreferencesRequest() *CoreUserGetUserPreferencesRequest`

NewCoreUserGetUserPreferencesRequest instantiates a new CoreUserGetUserPreferencesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreUserGetUserPreferencesRequestWithDefaults

`func NewCoreUserGetUserPreferencesRequestWithDefaults() *CoreUserGetUserPreferencesRequest`

NewCoreUserGetUserPreferencesRequestWithDefaults instantiates a new CoreUserGetUserPreferencesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *CoreUserGetUserPreferencesRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreUserGetUserPreferencesRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreUserGetUserPreferencesRequest) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreUserGetUserPreferencesRequest) HasName() bool`

HasName returns a boolean if a field has been set.

### GetUserid

`func (o *CoreUserGetUserPreferencesRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreUserGetUserPreferencesRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreUserGetUserPreferencesRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreUserGetUserPreferencesRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


