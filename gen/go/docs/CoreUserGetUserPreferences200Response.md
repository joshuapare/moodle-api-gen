# CoreUserGetUserPreferences200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Preferences** | [**[]CoreUserGetUserPreferences200ResponsePreferencesInner**](CoreUserGetUserPreferences200ResponsePreferencesInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreUserGetUserPreferences200Response

`func NewCoreUserGetUserPreferences200Response(preferences []CoreUserGetUserPreferences200ResponsePreferencesInner, ) *CoreUserGetUserPreferences200Response`

NewCoreUserGetUserPreferences200Response instantiates a new CoreUserGetUserPreferences200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreUserGetUserPreferences200ResponseWithDefaults

`func NewCoreUserGetUserPreferences200ResponseWithDefaults() *CoreUserGetUserPreferences200Response`

NewCoreUserGetUserPreferences200ResponseWithDefaults instantiates a new CoreUserGetUserPreferences200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPreferences

`func (o *CoreUserGetUserPreferences200Response) GetPreferences() []CoreUserGetUserPreferences200ResponsePreferencesInner`

GetPreferences returns the Preferences field if non-nil, zero value otherwise.

### GetPreferencesOk

`func (o *CoreUserGetUserPreferences200Response) GetPreferencesOk() (*[]CoreUserGetUserPreferences200ResponsePreferencesInner, bool)`

GetPreferencesOk returns a tuple with the Preferences field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreferences

`func (o *CoreUserGetUserPreferences200Response) SetPreferences(v []CoreUserGetUserPreferences200ResponsePreferencesInner)`

SetPreferences sets Preferences field to given value.


### GetWarnings

`func (o *CoreUserGetUserPreferences200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreUserGetUserPreferences200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreUserGetUserPreferences200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreUserGetUserPreferences200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


