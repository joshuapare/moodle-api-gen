# ToolMobileGetAutologinKey200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Autologinurl** | **string** | Auto-login URL. | [default to "null"]
**Key** | **string** | Auto-login key for a single usage with time expiration. | [default to "null"]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewToolMobileGetAutologinKey200Response

`func NewToolMobileGetAutologinKey200Response(autologinurl string, key string, ) *ToolMobileGetAutologinKey200Response`

NewToolMobileGetAutologinKey200Response instantiates a new ToolMobileGetAutologinKey200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolMobileGetAutologinKey200ResponseWithDefaults

`func NewToolMobileGetAutologinKey200ResponseWithDefaults() *ToolMobileGetAutologinKey200Response`

NewToolMobileGetAutologinKey200ResponseWithDefaults instantiates a new ToolMobileGetAutologinKey200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAutologinurl

`func (o *ToolMobileGetAutologinKey200Response) GetAutologinurl() string`

GetAutologinurl returns the Autologinurl field if non-nil, zero value otherwise.

### GetAutologinurlOk

`func (o *ToolMobileGetAutologinKey200Response) GetAutologinurlOk() (*string, bool)`

GetAutologinurlOk returns a tuple with the Autologinurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutologinurl

`func (o *ToolMobileGetAutologinKey200Response) SetAutologinurl(v string)`

SetAutologinurl sets Autologinurl field to given value.


### GetKey

`func (o *ToolMobileGetAutologinKey200Response) GetKey() string`

GetKey returns the Key field if non-nil, zero value otherwise.

### GetKeyOk

`func (o *ToolMobileGetAutologinKey200Response) GetKeyOk() (*string, bool)`

GetKeyOk returns a tuple with the Key field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKey

`func (o *ToolMobileGetAutologinKey200Response) SetKey(v string)`

SetKey sets Key field to given value.


### GetWarnings

`func (o *ToolMobileGetAutologinKey200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ToolMobileGetAutologinKey200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ToolMobileGetAutologinKey200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ToolMobileGetAutologinKey200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


