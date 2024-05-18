# ToolMobileGetTokensForQrLogin200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Privatetoken** | **string** | Private token used for auto-login processes. | [default to "null"]
**Token** | **string** | A valid WebService token for the official mobile app service. | [default to "null"]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewToolMobileGetTokensForQrLogin200Response

`func NewToolMobileGetTokensForQrLogin200Response(privatetoken string, token string, ) *ToolMobileGetTokensForQrLogin200Response`

NewToolMobileGetTokensForQrLogin200Response instantiates a new ToolMobileGetTokensForQrLogin200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolMobileGetTokensForQrLogin200ResponseWithDefaults

`func NewToolMobileGetTokensForQrLogin200ResponseWithDefaults() *ToolMobileGetTokensForQrLogin200Response`

NewToolMobileGetTokensForQrLogin200ResponseWithDefaults instantiates a new ToolMobileGetTokensForQrLogin200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPrivatetoken

`func (o *ToolMobileGetTokensForQrLogin200Response) GetPrivatetoken() string`

GetPrivatetoken returns the Privatetoken field if non-nil, zero value otherwise.

### GetPrivatetokenOk

`func (o *ToolMobileGetTokensForQrLogin200Response) GetPrivatetokenOk() (*string, bool)`

GetPrivatetokenOk returns a tuple with the Privatetoken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrivatetoken

`func (o *ToolMobileGetTokensForQrLogin200Response) SetPrivatetoken(v string)`

SetPrivatetoken sets Privatetoken field to given value.


### GetToken

`func (o *ToolMobileGetTokensForQrLogin200Response) GetToken() string`

GetToken returns the Token field if non-nil, zero value otherwise.

### GetTokenOk

`func (o *ToolMobileGetTokensForQrLogin200Response) GetTokenOk() (*string, bool)`

GetTokenOk returns a tuple with the Token field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToken

`func (o *ToolMobileGetTokensForQrLogin200Response) SetToken(v string)`

SetToken sets Token field to given value.


### GetWarnings

`func (o *ToolMobileGetTokensForQrLogin200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ToolMobileGetTokensForQrLogin200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ToolMobileGetTokensForQrLogin200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ToolMobileGetTokensForQrLogin200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


