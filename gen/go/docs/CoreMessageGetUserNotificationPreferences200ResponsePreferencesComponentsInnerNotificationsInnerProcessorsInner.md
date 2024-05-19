# CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Displayname** | Pointer to **string** | Display name | [optional] 
**Enabled** | Pointer to **bool** | Is enabled? | [optional] 
**Locked** | Pointer to **bool** | Is locked by admin? | [optional] 
**Lockedmessage** | Pointer to **string** | Text to display if locked | [optional] 
**Loggedin** | Pointer to [**CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff**](CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff.md) |  | [optional] 
**Loggedoff** | Pointer to [**CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff**](CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff.md) |  | [optional] 
**Name** | Pointer to **string** | Processor name | [optional] 
**Userconfigured** | Pointer to **int32** | Is configured? | [optional] 

## Methods

### NewCoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner

`func NewCoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner() *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner`

NewCoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner instantiates a new CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerWithDefaults

`func NewCoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerWithDefaults() *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner`

NewCoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerWithDefaults instantiates a new CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDisplayname

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetDisplayname() string`

GetDisplayname returns the Displayname field if non-nil, zero value otherwise.

### GetDisplaynameOk

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetDisplaynameOk() (*string, bool)`

GetDisplaynameOk returns a tuple with the Displayname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayname

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) SetDisplayname(v string)`

SetDisplayname sets Displayname field to given value.

### HasDisplayname

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) HasDisplayname() bool`

HasDisplayname returns a boolean if a field has been set.

### GetEnabled

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetEnabled() bool`

GetEnabled returns the Enabled field if non-nil, zero value otherwise.

### GetEnabledOk

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetEnabledOk() (*bool, bool)`

GetEnabledOk returns a tuple with the Enabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnabled

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) SetEnabled(v bool)`

SetEnabled sets Enabled field to given value.

### HasEnabled

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) HasEnabled() bool`

HasEnabled returns a boolean if a field has been set.

### GetLocked

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetLocked() bool`

GetLocked returns the Locked field if non-nil, zero value otherwise.

### GetLockedOk

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetLockedOk() (*bool, bool)`

GetLockedOk returns a tuple with the Locked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocked

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) SetLocked(v bool)`

SetLocked sets Locked field to given value.

### HasLocked

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) HasLocked() bool`

HasLocked returns a boolean if a field has been set.

### GetLockedmessage

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetLockedmessage() string`

GetLockedmessage returns the Lockedmessage field if non-nil, zero value otherwise.

### GetLockedmessageOk

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetLockedmessageOk() (*string, bool)`

GetLockedmessageOk returns a tuple with the Lockedmessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLockedmessage

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) SetLockedmessage(v string)`

SetLockedmessage sets Lockedmessage field to given value.

### HasLockedmessage

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) HasLockedmessage() bool`

HasLockedmessage returns a boolean if a field has been set.

### GetLoggedin

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetLoggedin() CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff`

GetLoggedin returns the Loggedin field if non-nil, zero value otherwise.

### GetLoggedinOk

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetLoggedinOk() (*CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff, bool)`

GetLoggedinOk returns a tuple with the Loggedin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLoggedin

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) SetLoggedin(v CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff)`

SetLoggedin sets Loggedin field to given value.

### HasLoggedin

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) HasLoggedin() bool`

HasLoggedin returns a boolean if a field has been set.

### GetLoggedoff

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetLoggedoff() CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff`

GetLoggedoff returns the Loggedoff field if non-nil, zero value otherwise.

### GetLoggedoffOk

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetLoggedoffOk() (*CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff, bool)`

GetLoggedoffOk returns a tuple with the Loggedoff field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLoggedoff

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) SetLoggedoff(v CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff)`

SetLoggedoff sets Loggedoff field to given value.

### HasLoggedoff

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) HasLoggedoff() bool`

HasLoggedoff returns a boolean if a field has been set.

### GetName

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetUserconfigured

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetUserconfigured() int32`

GetUserconfigured returns the Userconfigured field if non-nil, zero value otherwise.

### GetUserconfiguredOk

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) GetUserconfiguredOk() (*int32, bool)`

GetUserconfiguredOk returns a tuple with the Userconfigured field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserconfigured

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) SetUserconfigured(v int32)`

SetUserconfigured sets Userconfigured field to given value.

### HasUserconfigured

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner) HasUserconfigured() bool`

HasUserconfigured returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


