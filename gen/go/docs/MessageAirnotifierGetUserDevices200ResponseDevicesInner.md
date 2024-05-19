# MessageAirnotifierGetUserDevices200ResponseDevicesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Appid** | Pointer to **string** | The app id, something like com.moodle.moodlemobile | [optional] 
**Enable** | Pointer to **int32** | Whether the device is enabled or not | [optional] [default to null]
**Id** | Pointer to **int32** | Device id (in the message_airnotifier table) | [optional] [default to null]
**Model** | Pointer to **string** | The device model &#39;Nexus4&#39; or &#39;iPad1,1&#39; etc. | [optional] [default to "null"]
**Name** | Pointer to **string** | The device name, &#39;occam&#39; or &#39;iPhone&#39; etc. | [optional] [default to "null"]
**Platform** | Pointer to **string** | The device platform &#39;iOS&#39; or &#39;Android&#39; etc. | [optional] [default to "null"]
**Pushid** | Pointer to **string** | The device PUSH token/key/identifier/registration id | [optional] [default to "null"]
**Timecreated** | Pointer to **int32** | Time created | [optional] 
**Timemodified** | Pointer to **int32** | Time modified | [optional] [default to null]
**Uuid** | Pointer to **string** | The device UUID | [optional] [default to "null"]
**Version** | Pointer to **string** | The device version &#39;6.1.2&#39; or &#39;4.2.2&#39; etc. | [optional] [default to "null"]

## Methods

### NewMessageAirnotifierGetUserDevices200ResponseDevicesInner

`func NewMessageAirnotifierGetUserDevices200ResponseDevicesInner() *MessageAirnotifierGetUserDevices200ResponseDevicesInner`

NewMessageAirnotifierGetUserDevices200ResponseDevicesInner instantiates a new MessageAirnotifierGetUserDevices200ResponseDevicesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageAirnotifierGetUserDevices200ResponseDevicesInnerWithDefaults

`func NewMessageAirnotifierGetUserDevices200ResponseDevicesInnerWithDefaults() *MessageAirnotifierGetUserDevices200ResponseDevicesInner`

NewMessageAirnotifierGetUserDevices200ResponseDevicesInnerWithDefaults instantiates a new MessageAirnotifierGetUserDevices200ResponseDevicesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAppid

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) GetAppid() string`

GetAppid returns the Appid field if non-nil, zero value otherwise.

### GetAppidOk

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) GetAppidOk() (*string, bool)`

GetAppidOk returns a tuple with the Appid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppid

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) SetAppid(v string)`

SetAppid sets Appid field to given value.

### HasAppid

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) HasAppid() bool`

HasAppid returns a boolean if a field has been set.

### GetEnable

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) GetEnable() int32`

GetEnable returns the Enable field if non-nil, zero value otherwise.

### GetEnableOk

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) GetEnableOk() (*int32, bool)`

GetEnableOk returns a tuple with the Enable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnable

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) SetEnable(v int32)`

SetEnable sets Enable field to given value.

### HasEnable

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) HasEnable() bool`

HasEnable returns a boolean if a field has been set.

### GetId

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetModel

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) GetModel() string`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) GetModelOk() (*string, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) SetModel(v string)`

SetModel sets Model field to given value.

### HasModel

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) HasModel() bool`

HasModel returns a boolean if a field has been set.

### GetName

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetPlatform

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) GetPlatform() string`

GetPlatform returns the Platform field if non-nil, zero value otherwise.

### GetPlatformOk

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) GetPlatformOk() (*string, bool)`

GetPlatformOk returns a tuple with the Platform field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlatform

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) SetPlatform(v string)`

SetPlatform sets Platform field to given value.

### HasPlatform

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) HasPlatform() bool`

HasPlatform returns a boolean if a field has been set.

### GetPushid

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) GetPushid() string`

GetPushid returns the Pushid field if non-nil, zero value otherwise.

### GetPushidOk

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) GetPushidOk() (*string, bool)`

GetPushidOk returns a tuple with the Pushid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPushid

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) SetPushid(v string)`

SetPushid sets Pushid field to given value.

### HasPushid

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) HasPushid() bool`

HasPushid returns a boolean if a field has been set.

### GetTimecreated

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetUuid

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) GetUuid() string`

GetUuid returns the Uuid field if non-nil, zero value otherwise.

### GetUuidOk

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) GetUuidOk() (*string, bool)`

GetUuidOk returns a tuple with the Uuid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUuid

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) SetUuid(v string)`

SetUuid sets Uuid field to given value.

### HasUuid

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) HasUuid() bool`

HasUuid returns a boolean if a field has been set.

### GetVersion

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) GetVersion() string`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) GetVersionOk() (*string, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) SetVersion(v string)`

SetVersion sets Version field to given value.

### HasVersion

`func (o *MessageAirnotifierGetUserDevices200ResponseDevicesInner) HasVersion() bool`

HasVersion returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


