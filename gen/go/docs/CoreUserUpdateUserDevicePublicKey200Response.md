# CoreUserUpdateUserDevicePublicKey200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | **bool** | Whether the request was successful | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreUserUpdateUserDevicePublicKey200Response

`func NewCoreUserUpdateUserDevicePublicKey200Response(status bool, ) *CoreUserUpdateUserDevicePublicKey200Response`

NewCoreUserUpdateUserDevicePublicKey200Response instantiates a new CoreUserUpdateUserDevicePublicKey200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreUserUpdateUserDevicePublicKey200ResponseWithDefaults

`func NewCoreUserUpdateUserDevicePublicKey200ResponseWithDefaults() *CoreUserUpdateUserDevicePublicKey200Response`

NewCoreUserUpdateUserDevicePublicKey200ResponseWithDefaults instantiates a new CoreUserUpdateUserDevicePublicKey200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *CoreUserUpdateUserDevicePublicKey200Response) GetStatus() bool`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CoreUserUpdateUserDevicePublicKey200Response) GetStatusOk() (*bool, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CoreUserUpdateUserDevicePublicKey200Response) SetStatus(v bool)`

SetStatus sets Status field to given value.


### GetWarnings

`func (o *CoreUserUpdateUserDevicePublicKey200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreUserUpdateUserDevicePublicKey200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreUserUpdateUserDevicePublicKey200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreUserUpdateUserDevicePublicKey200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


