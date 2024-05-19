# CoreUserRemoveUserDeviceRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Appid** | Pointer to **string** | the app id, if empty devices matching the UUID for the user will be removed | [optional] [default to ""]
**Uuid** | **string** | the device UUID | 

## Methods

### NewCoreUserRemoveUserDeviceRequest

`func NewCoreUserRemoveUserDeviceRequest(uuid string, ) *CoreUserRemoveUserDeviceRequest`

NewCoreUserRemoveUserDeviceRequest instantiates a new CoreUserRemoveUserDeviceRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreUserRemoveUserDeviceRequestWithDefaults

`func NewCoreUserRemoveUserDeviceRequestWithDefaults() *CoreUserRemoveUserDeviceRequest`

NewCoreUserRemoveUserDeviceRequestWithDefaults instantiates a new CoreUserRemoveUserDeviceRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAppid

`func (o *CoreUserRemoveUserDeviceRequest) GetAppid() string`

GetAppid returns the Appid field if non-nil, zero value otherwise.

### GetAppidOk

`func (o *CoreUserRemoveUserDeviceRequest) GetAppidOk() (*string, bool)`

GetAppidOk returns a tuple with the Appid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppid

`func (o *CoreUserRemoveUserDeviceRequest) SetAppid(v string)`

SetAppid sets Appid field to given value.

### HasAppid

`func (o *CoreUserRemoveUserDeviceRequest) HasAppid() bool`

HasAppid returns a boolean if a field has been set.

### GetUuid

`func (o *CoreUserRemoveUserDeviceRequest) GetUuid() string`

GetUuid returns the Uuid field if non-nil, zero value otherwise.

### GetUuidOk

`func (o *CoreUserRemoveUserDeviceRequest) GetUuidOk() (*string, bool)`

GetUuidOk returns a tuple with the Uuid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUuid

`func (o *CoreUserRemoveUserDeviceRequest) SetUuid(v string)`

SetUuid sets Uuid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


