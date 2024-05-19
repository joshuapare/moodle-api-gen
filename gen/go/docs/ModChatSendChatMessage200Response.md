# ModChatSendChatMessage200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Messageid** | **int32** | message sent id | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModChatSendChatMessage200Response

`func NewModChatSendChatMessage200Response(messageid int32, ) *ModChatSendChatMessage200Response`

NewModChatSendChatMessage200Response instantiates a new ModChatSendChatMessage200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModChatSendChatMessage200ResponseWithDefaults

`func NewModChatSendChatMessage200ResponseWithDefaults() *ModChatSendChatMessage200Response`

NewModChatSendChatMessage200ResponseWithDefaults instantiates a new ModChatSendChatMessage200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessageid

`func (o *ModChatSendChatMessage200Response) GetMessageid() int32`

GetMessageid returns the Messageid field if non-nil, zero value otherwise.

### GetMessageidOk

`func (o *ModChatSendChatMessage200Response) GetMessageidOk() (*int32, bool)`

GetMessageidOk returns a tuple with the Messageid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageid

`func (o *ModChatSendChatMessage200Response) SetMessageid(v int32)`

SetMessageid sets Messageid field to given value.


### GetWarnings

`func (o *ModChatSendChatMessage200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModChatSendChatMessage200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModChatSendChatMessage200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModChatSendChatMessage200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


