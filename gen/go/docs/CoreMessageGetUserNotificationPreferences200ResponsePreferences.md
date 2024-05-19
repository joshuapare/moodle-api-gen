# CoreMessageGetUserNotificationPreferences200ResponsePreferences

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Components** | [**[]CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner**](CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner.md) |  | 
**Disableall** | **int32** | Whether all the preferences are disabled | 
**Processors** | [**[]CoreMessageGetUserNotificationPreferences200ResponsePreferencesProcessorsInner**](CoreMessageGetUserNotificationPreferences200ResponsePreferencesProcessorsInner.md) |  | 
**Userid** | **int32** | User id | 

## Methods

### NewCoreMessageGetUserNotificationPreferences200ResponsePreferences

`func NewCoreMessageGetUserNotificationPreferences200ResponsePreferences(components []CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner, disableall int32, processors []CoreMessageGetUserNotificationPreferences200ResponsePreferencesProcessorsInner, userid int32, ) *CoreMessageGetUserNotificationPreferences200ResponsePreferences`

NewCoreMessageGetUserNotificationPreferences200ResponsePreferences instantiates a new CoreMessageGetUserNotificationPreferences200ResponsePreferences object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageGetUserNotificationPreferences200ResponsePreferencesWithDefaults

`func NewCoreMessageGetUserNotificationPreferences200ResponsePreferencesWithDefaults() *CoreMessageGetUserNotificationPreferences200ResponsePreferences`

NewCoreMessageGetUserNotificationPreferences200ResponsePreferencesWithDefaults instantiates a new CoreMessageGetUserNotificationPreferences200ResponsePreferences object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetComponents

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferences) GetComponents() []CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner`

GetComponents returns the Components field if non-nil, zero value otherwise.

### GetComponentsOk

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferences) GetComponentsOk() (*[]CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner, bool)`

GetComponentsOk returns a tuple with the Components field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponents

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferences) SetComponents(v []CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner)`

SetComponents sets Components field to given value.


### GetDisableall

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferences) GetDisableall() int32`

GetDisableall returns the Disableall field if non-nil, zero value otherwise.

### GetDisableallOk

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferences) GetDisableallOk() (*int32, bool)`

GetDisableallOk returns a tuple with the Disableall field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisableall

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferences) SetDisableall(v int32)`

SetDisableall sets Disableall field to given value.


### GetProcessors

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferences) GetProcessors() []CoreMessageGetUserNotificationPreferences200ResponsePreferencesProcessorsInner`

GetProcessors returns the Processors field if non-nil, zero value otherwise.

### GetProcessorsOk

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferences) GetProcessorsOk() (*[]CoreMessageGetUserNotificationPreferences200ResponsePreferencesProcessorsInner, bool)`

GetProcessorsOk returns a tuple with the Processors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProcessors

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferences) SetProcessors(v []CoreMessageGetUserNotificationPreferences200ResponsePreferencesProcessorsInner)`

SetProcessors sets Processors field to given value.


### GetUserid

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferences) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferences) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreMessageGetUserNotificationPreferences200ResponsePreferences) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


