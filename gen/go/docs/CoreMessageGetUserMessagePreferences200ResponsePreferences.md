# CoreMessageGetUserMessagePreferences200ResponsePreferences

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Components** | [**[]CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInner**](CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInner.md) |  | 
**Disableall** | **int32** | Whether all the preferences are disabled | [default to null]
**Processors** | [**[]CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner**](CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner.md) |  | 
**Userid** | **int32** | User id | 

## Methods

### NewCoreMessageGetUserMessagePreferences200ResponsePreferences

`func NewCoreMessageGetUserMessagePreferences200ResponsePreferences(components []CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInner, disableall int32, processors []CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner, userid int32, ) *CoreMessageGetUserMessagePreferences200ResponsePreferences`

NewCoreMessageGetUserMessagePreferences200ResponsePreferences instantiates a new CoreMessageGetUserMessagePreferences200ResponsePreferences object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageGetUserMessagePreferences200ResponsePreferencesWithDefaults

`func NewCoreMessageGetUserMessagePreferences200ResponsePreferencesWithDefaults() *CoreMessageGetUserMessagePreferences200ResponsePreferences`

NewCoreMessageGetUserMessagePreferences200ResponsePreferencesWithDefaults instantiates a new CoreMessageGetUserMessagePreferences200ResponsePreferences object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetComponents

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferences) GetComponents() []CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInner`

GetComponents returns the Components field if non-nil, zero value otherwise.

### GetComponentsOk

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferences) GetComponentsOk() (*[]CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInner, bool)`

GetComponentsOk returns a tuple with the Components field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponents

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferences) SetComponents(v []CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInner)`

SetComponents sets Components field to given value.


### GetDisableall

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferences) GetDisableall() int32`

GetDisableall returns the Disableall field if non-nil, zero value otherwise.

### GetDisableallOk

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferences) GetDisableallOk() (*int32, bool)`

GetDisableallOk returns a tuple with the Disableall field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisableall

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferences) SetDisableall(v int32)`

SetDisableall sets Disableall field to given value.


### GetProcessors

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferences) GetProcessors() []CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner`

GetProcessors returns the Processors field if non-nil, zero value otherwise.

### GetProcessorsOk

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferences) GetProcessorsOk() (*[]CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner, bool)`

GetProcessorsOk returns a tuple with the Processors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProcessors

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferences) SetProcessors(v []CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner)`

SetProcessors sets Processors field to given value.


### GetUserid

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferences) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferences) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreMessageGetUserMessagePreferences200ResponsePreferences) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


