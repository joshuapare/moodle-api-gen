# CoreUserUpdateUserPreferencesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Emailstop** | Pointer to **int32** | Enable or disable notifications for this user | [optional] [default to null]
**Preferences** | Pointer to [**[]CoreUserUpdateUserPreferencesRequestPreferencesInner**](CoreUserUpdateUserPreferencesRequestPreferencesInner.md) |  | [optional] 
**Userid** | Pointer to **int32** | id of the user, default to current user | [optional] [default to 0]

## Methods

### NewCoreUserUpdateUserPreferencesRequest

`func NewCoreUserUpdateUserPreferencesRequest() *CoreUserUpdateUserPreferencesRequest`

NewCoreUserUpdateUserPreferencesRequest instantiates a new CoreUserUpdateUserPreferencesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreUserUpdateUserPreferencesRequestWithDefaults

`func NewCoreUserUpdateUserPreferencesRequestWithDefaults() *CoreUserUpdateUserPreferencesRequest`

NewCoreUserUpdateUserPreferencesRequestWithDefaults instantiates a new CoreUserUpdateUserPreferencesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEmailstop

`func (o *CoreUserUpdateUserPreferencesRequest) GetEmailstop() int32`

GetEmailstop returns the Emailstop field if non-nil, zero value otherwise.

### GetEmailstopOk

`func (o *CoreUserUpdateUserPreferencesRequest) GetEmailstopOk() (*int32, bool)`

GetEmailstopOk returns a tuple with the Emailstop field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmailstop

`func (o *CoreUserUpdateUserPreferencesRequest) SetEmailstop(v int32)`

SetEmailstop sets Emailstop field to given value.

### HasEmailstop

`func (o *CoreUserUpdateUserPreferencesRequest) HasEmailstop() bool`

HasEmailstop returns a boolean if a field has been set.

### GetPreferences

`func (o *CoreUserUpdateUserPreferencesRequest) GetPreferences() []CoreUserUpdateUserPreferencesRequestPreferencesInner`

GetPreferences returns the Preferences field if non-nil, zero value otherwise.

### GetPreferencesOk

`func (o *CoreUserUpdateUserPreferencesRequest) GetPreferencesOk() (*[]CoreUserUpdateUserPreferencesRequestPreferencesInner, bool)`

GetPreferencesOk returns a tuple with the Preferences field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreferences

`func (o *CoreUserUpdateUserPreferencesRequest) SetPreferences(v []CoreUserUpdateUserPreferencesRequestPreferencesInner)`

SetPreferences sets Preferences field to given value.

### HasPreferences

`func (o *CoreUserUpdateUserPreferencesRequest) HasPreferences() bool`

HasPreferences returns a boolean if a field has been set.

### GetUserid

`func (o *CoreUserUpdateUserPreferencesRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreUserUpdateUserPreferencesRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreUserUpdateUserPreferencesRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreUserUpdateUserPreferencesRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


