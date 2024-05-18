# ToolMobileGetTokensForQrLoginRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Qrloginkey** | **string** | The user key for validating the request. | [default to "null"]
**Userid** | **int32** | The user the key belongs to. | [default to null]

## Methods

### NewToolMobileGetTokensForQrLoginRequest

`func NewToolMobileGetTokensForQrLoginRequest(qrloginkey string, userid int32, ) *ToolMobileGetTokensForQrLoginRequest`

NewToolMobileGetTokensForQrLoginRequest instantiates a new ToolMobileGetTokensForQrLoginRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolMobileGetTokensForQrLoginRequestWithDefaults

`func NewToolMobileGetTokensForQrLoginRequestWithDefaults() *ToolMobileGetTokensForQrLoginRequest`

NewToolMobileGetTokensForQrLoginRequestWithDefaults instantiates a new ToolMobileGetTokensForQrLoginRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetQrloginkey

`func (o *ToolMobileGetTokensForQrLoginRequest) GetQrloginkey() string`

GetQrloginkey returns the Qrloginkey field if non-nil, zero value otherwise.

### GetQrloginkeyOk

`func (o *ToolMobileGetTokensForQrLoginRequest) GetQrloginkeyOk() (*string, bool)`

GetQrloginkeyOk returns a tuple with the Qrloginkey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQrloginkey

`func (o *ToolMobileGetTokensForQrLoginRequest) SetQrloginkey(v string)`

SetQrloginkey sets Qrloginkey field to given value.


### GetUserid

`func (o *ToolMobileGetTokensForQrLoginRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ToolMobileGetTokensForQrLoginRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ToolMobileGetTokensForQrLoginRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


