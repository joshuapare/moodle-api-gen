# MessageAirnotifierEnableDevice200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Success** | **bool** | True if success | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewMessageAirnotifierEnableDevice200Response

`func NewMessageAirnotifierEnableDevice200Response(success bool, ) *MessageAirnotifierEnableDevice200Response`

NewMessageAirnotifierEnableDevice200Response instantiates a new MessageAirnotifierEnableDevice200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageAirnotifierEnableDevice200ResponseWithDefaults

`func NewMessageAirnotifierEnableDevice200ResponseWithDefaults() *MessageAirnotifierEnableDevice200Response`

NewMessageAirnotifierEnableDevice200ResponseWithDefaults instantiates a new MessageAirnotifierEnableDevice200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSuccess

`func (o *MessageAirnotifierEnableDevice200Response) GetSuccess() bool`

GetSuccess returns the Success field if non-nil, zero value otherwise.

### GetSuccessOk

`func (o *MessageAirnotifierEnableDevice200Response) GetSuccessOk() (*bool, bool)`

GetSuccessOk returns a tuple with the Success field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuccess

`func (o *MessageAirnotifierEnableDevice200Response) SetSuccess(v bool)`

SetSuccess sets Success field to given value.


### GetWarnings

`func (o *MessageAirnotifierEnableDevice200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *MessageAirnotifierEnableDevice200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *MessageAirnotifierEnableDevice200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *MessageAirnotifierEnableDevice200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


