# CoreUserSetUserPreferencesRequestPreferencesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | The name of the preference | [optional] 
**Userid** | Pointer to **int32** | Id of the user to set the preference (default to current user) | [optional] [default to 0]
**Value** | Pointer to **string** | The value of the preference | [optional] 

## Methods

### NewCoreUserSetUserPreferencesRequestPreferencesInner

`func NewCoreUserSetUserPreferencesRequestPreferencesInner() *CoreUserSetUserPreferencesRequestPreferencesInner`

NewCoreUserSetUserPreferencesRequestPreferencesInner instantiates a new CoreUserSetUserPreferencesRequestPreferencesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreUserSetUserPreferencesRequestPreferencesInnerWithDefaults

`func NewCoreUserSetUserPreferencesRequestPreferencesInnerWithDefaults() *CoreUserSetUserPreferencesRequestPreferencesInner`

NewCoreUserSetUserPreferencesRequestPreferencesInnerWithDefaults instantiates a new CoreUserSetUserPreferencesRequestPreferencesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *CoreUserSetUserPreferencesRequestPreferencesInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreUserSetUserPreferencesRequestPreferencesInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreUserSetUserPreferencesRequestPreferencesInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreUserSetUserPreferencesRequestPreferencesInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetUserid

`func (o *CoreUserSetUserPreferencesRequestPreferencesInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreUserSetUserPreferencesRequestPreferencesInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreUserSetUserPreferencesRequestPreferencesInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreUserSetUserPreferencesRequestPreferencesInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetValue

`func (o *CoreUserSetUserPreferencesRequestPreferencesInner) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *CoreUserSetUserPreferencesRequestPreferencesInner) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *CoreUserSetUserPreferencesRequestPreferencesInner) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *CoreUserSetUserPreferencesRequestPreferencesInner) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


