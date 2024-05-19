# MessageAirnotifierGetUserDevices200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Devices** | [**[]MessageAirnotifierGetUserDevices200ResponseDevicesInner**](MessageAirnotifierGetUserDevices200ResponseDevicesInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewMessageAirnotifierGetUserDevices200Response

`func NewMessageAirnotifierGetUserDevices200Response(devices []MessageAirnotifierGetUserDevices200ResponseDevicesInner, ) *MessageAirnotifierGetUserDevices200Response`

NewMessageAirnotifierGetUserDevices200Response instantiates a new MessageAirnotifierGetUserDevices200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageAirnotifierGetUserDevices200ResponseWithDefaults

`func NewMessageAirnotifierGetUserDevices200ResponseWithDefaults() *MessageAirnotifierGetUserDevices200Response`

NewMessageAirnotifierGetUserDevices200ResponseWithDefaults instantiates a new MessageAirnotifierGetUserDevices200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDevices

`func (o *MessageAirnotifierGetUserDevices200Response) GetDevices() []MessageAirnotifierGetUserDevices200ResponseDevicesInner`

GetDevices returns the Devices field if non-nil, zero value otherwise.

### GetDevicesOk

`func (o *MessageAirnotifierGetUserDevices200Response) GetDevicesOk() (*[]MessageAirnotifierGetUserDevices200ResponseDevicesInner, bool)`

GetDevicesOk returns a tuple with the Devices field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDevices

`func (o *MessageAirnotifierGetUserDevices200Response) SetDevices(v []MessageAirnotifierGetUserDevices200ResponseDevicesInner)`

SetDevices sets Devices field to given value.


### GetWarnings

`func (o *MessageAirnotifierGetUserDevices200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *MessageAirnotifierGetUserDevices200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *MessageAirnotifierGetUserDevices200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *MessageAirnotifierGetUserDevices200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


