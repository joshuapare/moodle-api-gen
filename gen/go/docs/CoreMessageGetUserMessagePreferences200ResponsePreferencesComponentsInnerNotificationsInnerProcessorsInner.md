# CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Displayname** | Pointer to **string** | Display name | [optional] 
**Enabled** | Pointer to **bool** | Is enabled? | [optional] [default to null]
**Locked** | Pointer to **bool** | Is locked by admin? | [optional] [default to null]
**Lockedmessage** | Pointer to **string** | Text to display if locked | [optional] [default to "null"]
**Loggedin** | Pointer to [**CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedin**](CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedin.md) |  | [optional] 
**Loggedoff** | Pointer to [**CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff**](CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff.md) |  | [optional] 
**Name** | Pointer to **string** | Processor name | [optional] [default to "null"]
**Userconfigured** | Pointer to **int32** | Is configured? | [optional] [default to null]

## Methods

### NewCoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner

`func NewCoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner() *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner`

NewCoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner instantiates a new CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerWithDefaults

`func NewCoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerWithDefaults() *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner`

NewCoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerWithDefaults instantiates a new CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDisplayname

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetDisplayname() string`

GetDisplayname returns the Displayname field if non-nil, zero value otherwise.

### GetDisplaynameOk

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetDisplaynameOk() (*string, bool)`

GetDisplaynameOk returns a tuple with the Displayname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayname

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) SetDisplayname(v string)`

SetDisplayname sets Displayname field to given value.

### HasDisplayname

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) HasDisplayname() bool`

HasDisplayname returns a boolean if a field has been set.

### GetEnabled

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetEnabled() bool`

GetEnabled returns the Enabled field if non-nil, zero value otherwise.

### GetEnabledOk

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetEnabledOk() (*bool, bool)`

GetEnabledOk returns a tuple with the Enabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnabled

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) SetEnabled(v bool)`

SetEnabled sets Enabled field to given value.

### HasEnabled

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) HasEnabled() bool`

HasEnabled returns a boolean if a field has been set.

### GetLocked

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetLocked() bool`

GetLocked returns the Locked field if non-nil, zero value otherwise.

### GetLockedOk

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetLockedOk() (*bool, bool)`

GetLockedOk returns a tuple with the Locked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocked

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) SetLocked(v bool)`

SetLocked sets Locked field to given value.

### HasLocked

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) HasLocked() bool`

HasLocked returns a boolean if a field has been set.

### GetLockedmessage

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetLockedmessage() string`

GetLockedmessage returns the Lockedmessage field if non-nil, zero value otherwise.

### GetLockedmessageOk

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetLockedmessageOk() (*string, bool)`

GetLockedmessageOk returns a tuple with the Lockedmessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLockedmessage

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) SetLockedmessage(v string)`

SetLockedmessage sets Lockedmessage field to given value.

### HasLockedmessage

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) HasLockedmessage() bool`

HasLockedmessage returns a boolean if a field has been set.

### GetLoggedin

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetLoggedin() CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedin`

GetLoggedin returns the Loggedin field if non-nil, zero value otherwise.

### GetLoggedinOk

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetLoggedinOk() (*CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedin, bool)`

GetLoggedinOk returns a tuple with the Loggedin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLoggedin

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) SetLoggedin(v CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedin)`

SetLoggedin sets Loggedin field to given value.

### HasLoggedin

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) HasLoggedin() bool`

HasLoggedin returns a boolean if a field has been set.

### GetLoggedoff

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetLoggedoff() CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff`

GetLoggedoff returns the Loggedoff field if non-nil, zero value otherwise.

### GetLoggedoffOk

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetLoggedoffOk() (*CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff, bool)`

GetLoggedoffOk returns a tuple with the Loggedoff field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLoggedoff

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) SetLoggedoff(v CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff)`

SetLoggedoff sets Loggedoff field to given value.

### HasLoggedoff

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) HasLoggedoff() bool`

HasLoggedoff returns a boolean if a field has been set.

### GetName

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetUserconfigured

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetUserconfigured() int32`

GetUserconfigured returns the Userconfigured field if non-nil, zero value otherwise.

### GetUserconfiguredOk

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetUserconfiguredOk() (*int32, bool)`

GetUserconfiguredOk returns a tuple with the Userconfigured field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserconfigured

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) SetUserconfigured(v int32)`

SetUserconfigured sets Userconfigured field to given value.

### HasUserconfigured

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) HasUserconfigured() bool`

HasUserconfigured returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


