# CoreUserUpdateUserPreferencesRequestPreferencesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | Pointer to **string** | The name of the preference | [optional] 
**Value** | Pointer to **string** | The value of the preference, do not set this field if you                                 want to remove (unset) the current value. | [optional] [default to "null"]

## Methods

### NewCoreUserUpdateUserPreferencesRequestPreferencesInner

`func NewCoreUserUpdateUserPreferencesRequestPreferencesInner() *CoreUserUpdateUserPreferencesRequestPreferencesInner`

NewCoreUserUpdateUserPreferencesRequestPreferencesInner instantiates a new CoreUserUpdateUserPreferencesRequestPreferencesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreUserUpdateUserPreferencesRequestPreferencesInnerWithDefaults

`func NewCoreUserUpdateUserPreferencesRequestPreferencesInnerWithDefaults() *CoreUserUpdateUserPreferencesRequestPreferencesInner`

NewCoreUserUpdateUserPreferencesRequestPreferencesInnerWithDefaults instantiates a new CoreUserUpdateUserPreferencesRequestPreferencesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *CoreUserUpdateUserPreferencesRequestPreferencesInner) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CoreUserUpdateUserPreferencesRequestPreferencesInner) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CoreUserUpdateUserPreferencesRequestPreferencesInner) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *CoreUserUpdateUserPreferencesRequestPreferencesInner) HasType() bool`

HasType returns a boolean if a field has been set.

### GetValue

`func (o *CoreUserUpdateUserPreferencesRequestPreferencesInner) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *CoreUserUpdateUserPreferencesRequestPreferencesInner) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *CoreUserUpdateUserPreferencesRequestPreferencesInner) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *CoreUserUpdateUserPreferencesRequestPreferencesInner) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


