# CoreUserUpdateUserDevicePublicKeyRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Appid** | **string** | The app id, something like com.moodle.moodlemobile | [default to "null"]
**Publickey** | **string** | the app generated public key | 
**Uuid** | **string** | the device UUID | 

## Methods

### NewCoreUserUpdateUserDevicePublicKeyRequest

`func NewCoreUserUpdateUserDevicePublicKeyRequest(appid string, publickey string, uuid string, ) *CoreUserUpdateUserDevicePublicKeyRequest`

NewCoreUserUpdateUserDevicePublicKeyRequest instantiates a new CoreUserUpdateUserDevicePublicKeyRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreUserUpdateUserDevicePublicKeyRequestWithDefaults

`func NewCoreUserUpdateUserDevicePublicKeyRequestWithDefaults() *CoreUserUpdateUserDevicePublicKeyRequest`

NewCoreUserUpdateUserDevicePublicKeyRequestWithDefaults instantiates a new CoreUserUpdateUserDevicePublicKeyRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAppid

`func (o *CoreUserUpdateUserDevicePublicKeyRequest) GetAppid() string`

GetAppid returns the Appid field if non-nil, zero value otherwise.

### GetAppidOk

`func (o *CoreUserUpdateUserDevicePublicKeyRequest) GetAppidOk() (*string, bool)`

GetAppidOk returns a tuple with the Appid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppid

`func (o *CoreUserUpdateUserDevicePublicKeyRequest) SetAppid(v string)`

SetAppid sets Appid field to given value.


### GetPublickey

`func (o *CoreUserUpdateUserDevicePublicKeyRequest) GetPublickey() string`

GetPublickey returns the Publickey field if non-nil, zero value otherwise.

### GetPublickeyOk

`func (o *CoreUserUpdateUserDevicePublicKeyRequest) GetPublickeyOk() (*string, bool)`

GetPublickeyOk returns a tuple with the Publickey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPublickey

`func (o *CoreUserUpdateUserDevicePublicKeyRequest) SetPublickey(v string)`

SetPublickey sets Publickey field to given value.


### GetUuid

`func (o *CoreUserUpdateUserDevicePublicKeyRequest) GetUuid() string`

GetUuid returns the Uuid field if non-nil, zero value otherwise.

### GetUuidOk

`func (o *CoreUserUpdateUserDevicePublicKeyRequest) GetUuidOk() (*string, bool)`

GetUuidOk returns a tuple with the Uuid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUuid

`func (o *CoreUserUpdateUserDevicePublicKeyRequest) SetUuid(v string)`

SetUuid sets Uuid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


