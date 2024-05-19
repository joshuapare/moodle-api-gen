# MessageAirnotifierGetUserDevicesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Appid** | **string** | App unique id (usually a reversed domain) | [default to "null"]
**Userid** | Pointer to **int32** | User id, 0 for current user | [optional] [default to 0]

## Methods

### NewMessageAirnotifierGetUserDevicesRequest

`func NewMessageAirnotifierGetUserDevicesRequest(appid string, ) *MessageAirnotifierGetUserDevicesRequest`

NewMessageAirnotifierGetUserDevicesRequest instantiates a new MessageAirnotifierGetUserDevicesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageAirnotifierGetUserDevicesRequestWithDefaults

`func NewMessageAirnotifierGetUserDevicesRequestWithDefaults() *MessageAirnotifierGetUserDevicesRequest`

NewMessageAirnotifierGetUserDevicesRequestWithDefaults instantiates a new MessageAirnotifierGetUserDevicesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAppid

`func (o *MessageAirnotifierGetUserDevicesRequest) GetAppid() string`

GetAppid returns the Appid field if non-nil, zero value otherwise.

### GetAppidOk

`func (o *MessageAirnotifierGetUserDevicesRequest) GetAppidOk() (*string, bool)`

GetAppidOk returns a tuple with the Appid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppid

`func (o *MessageAirnotifierGetUserDevicesRequest) SetAppid(v string)`

SetAppid sets Appid field to given value.


### GetUserid

`func (o *MessageAirnotifierGetUserDevicesRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *MessageAirnotifierGetUserDevicesRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *MessageAirnotifierGetUserDevicesRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *MessageAirnotifierGetUserDevicesRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


