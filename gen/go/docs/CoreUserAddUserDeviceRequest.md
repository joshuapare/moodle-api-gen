# CoreUserAddUserDeviceRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Appid** | **string** | the app id, usually something like com.moodle.moodlemobile | [default to "null"]
**Model** | **string** | the device model &#39;Nexus4&#39; or &#39;iPad1,1&#39; etc. | [default to "null"]
**Name** | **string** | the device name, &#39;occam&#39; or &#39;iPhone&#39; etc. | [default to "null"]
**Platform** | **string** | the device platform &#39;iOS&#39; or &#39;Android&#39; etc. | [default to "null"]
**Publickey** | Pointer to **string** | the app generated public key | [optional] [default to "null"]
**Pushid** | **string** | the device PUSH token/key/identifier/registration id | [default to "null"]
**Uuid** | **string** | the device UUID | [default to "null"]
**Version** | **string** | the device version &#39;6.1.2&#39; or &#39;4.2.2&#39; etc. | [default to "null"]

## Methods

### NewCoreUserAddUserDeviceRequest

`func NewCoreUserAddUserDeviceRequest(appid string, model string, name string, platform string, pushid string, uuid string, version string, ) *CoreUserAddUserDeviceRequest`

NewCoreUserAddUserDeviceRequest instantiates a new CoreUserAddUserDeviceRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreUserAddUserDeviceRequestWithDefaults

`func NewCoreUserAddUserDeviceRequestWithDefaults() *CoreUserAddUserDeviceRequest`

NewCoreUserAddUserDeviceRequestWithDefaults instantiates a new CoreUserAddUserDeviceRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAppid

`func (o *CoreUserAddUserDeviceRequest) GetAppid() string`

GetAppid returns the Appid field if non-nil, zero value otherwise.

### GetAppidOk

`func (o *CoreUserAddUserDeviceRequest) GetAppidOk() (*string, bool)`

GetAppidOk returns a tuple with the Appid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppid

`func (o *CoreUserAddUserDeviceRequest) SetAppid(v string)`

SetAppid sets Appid field to given value.


### GetModel

`func (o *CoreUserAddUserDeviceRequest) GetModel() string`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *CoreUserAddUserDeviceRequest) GetModelOk() (*string, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *CoreUserAddUserDeviceRequest) SetModel(v string)`

SetModel sets Model field to given value.


### GetName

`func (o *CoreUserAddUserDeviceRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreUserAddUserDeviceRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreUserAddUserDeviceRequest) SetName(v string)`

SetName sets Name field to given value.


### GetPlatform

`func (o *CoreUserAddUserDeviceRequest) GetPlatform() string`

GetPlatform returns the Platform field if non-nil, zero value otherwise.

### GetPlatformOk

`func (o *CoreUserAddUserDeviceRequest) GetPlatformOk() (*string, bool)`

GetPlatformOk returns a tuple with the Platform field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlatform

`func (o *CoreUserAddUserDeviceRequest) SetPlatform(v string)`

SetPlatform sets Platform field to given value.


### GetPublickey

`func (o *CoreUserAddUserDeviceRequest) GetPublickey() string`

GetPublickey returns the Publickey field if non-nil, zero value otherwise.

### GetPublickeyOk

`func (o *CoreUserAddUserDeviceRequest) GetPublickeyOk() (*string, bool)`

GetPublickeyOk returns a tuple with the Publickey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPublickey

`func (o *CoreUserAddUserDeviceRequest) SetPublickey(v string)`

SetPublickey sets Publickey field to given value.

### HasPublickey

`func (o *CoreUserAddUserDeviceRequest) HasPublickey() bool`

HasPublickey returns a boolean if a field has been set.

### GetPushid

`func (o *CoreUserAddUserDeviceRequest) GetPushid() string`

GetPushid returns the Pushid field if non-nil, zero value otherwise.

### GetPushidOk

`func (o *CoreUserAddUserDeviceRequest) GetPushidOk() (*string, bool)`

GetPushidOk returns a tuple with the Pushid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPushid

`func (o *CoreUserAddUserDeviceRequest) SetPushid(v string)`

SetPushid sets Pushid field to given value.


### GetUuid

`func (o *CoreUserAddUserDeviceRequest) GetUuid() string`

GetUuid returns the Uuid field if non-nil, zero value otherwise.

### GetUuidOk

`func (o *CoreUserAddUserDeviceRequest) GetUuidOk() (*string, bool)`

GetUuidOk returns a tuple with the Uuid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUuid

`func (o *CoreUserAddUserDeviceRequest) SetUuid(v string)`

SetUuid sets Uuid field to given value.


### GetVersion

`func (o *CoreUserAddUserDeviceRequest) GetVersion() string`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *CoreUserAddUserDeviceRequest) GetVersionOk() (*string, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *CoreUserAddUserDeviceRequest) SetVersion(v string)`

SetVersion sets Version field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


