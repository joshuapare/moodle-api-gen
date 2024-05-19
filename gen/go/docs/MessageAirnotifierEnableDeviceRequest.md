# MessageAirnotifierEnableDeviceRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Deviceid** | **int32** | The device id | [default to null]
**Enable** | **bool** | True for enable the device, false otherwise | [default to null]

## Methods

### NewMessageAirnotifierEnableDeviceRequest

`func NewMessageAirnotifierEnableDeviceRequest(deviceid int32, enable bool, ) *MessageAirnotifierEnableDeviceRequest`

NewMessageAirnotifierEnableDeviceRequest instantiates a new MessageAirnotifierEnableDeviceRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageAirnotifierEnableDeviceRequestWithDefaults

`func NewMessageAirnotifierEnableDeviceRequestWithDefaults() *MessageAirnotifierEnableDeviceRequest`

NewMessageAirnotifierEnableDeviceRequestWithDefaults instantiates a new MessageAirnotifierEnableDeviceRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDeviceid

`func (o *MessageAirnotifierEnableDeviceRequest) GetDeviceid() int32`

GetDeviceid returns the Deviceid field if non-nil, zero value otherwise.

### GetDeviceidOk

`func (o *MessageAirnotifierEnableDeviceRequest) GetDeviceidOk() (*int32, bool)`

GetDeviceidOk returns a tuple with the Deviceid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeviceid

`func (o *MessageAirnotifierEnableDeviceRequest) SetDeviceid(v int32)`

SetDeviceid sets Deviceid field to given value.


### GetEnable

`func (o *MessageAirnotifierEnableDeviceRequest) GetEnable() bool`

GetEnable returns the Enable field if non-nil, zero value otherwise.

### GetEnableOk

`func (o *MessageAirnotifierEnableDeviceRequest) GetEnableOk() (*bool, bool)`

GetEnableOk returns a tuple with the Enable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnable

`func (o *MessageAirnotifierEnableDeviceRequest) SetEnable(v bool)`

SetEnable sets Enable field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


