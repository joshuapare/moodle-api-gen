# ToolMobileGetConfig200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Settings** | [**[]ToolMobileGetConfig200ResponseSettingsInner**](ToolMobileGetConfig200ResponseSettingsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewToolMobileGetConfig200Response

`func NewToolMobileGetConfig200Response(settings []ToolMobileGetConfig200ResponseSettingsInner, ) *ToolMobileGetConfig200Response`

NewToolMobileGetConfig200Response instantiates a new ToolMobileGetConfig200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolMobileGetConfig200ResponseWithDefaults

`func NewToolMobileGetConfig200ResponseWithDefaults() *ToolMobileGetConfig200Response`

NewToolMobileGetConfig200ResponseWithDefaults instantiates a new ToolMobileGetConfig200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSettings

`func (o *ToolMobileGetConfig200Response) GetSettings() []ToolMobileGetConfig200ResponseSettingsInner`

GetSettings returns the Settings field if non-nil, zero value otherwise.

### GetSettingsOk

`func (o *ToolMobileGetConfig200Response) GetSettingsOk() (*[]ToolMobileGetConfig200ResponseSettingsInner, bool)`

GetSettingsOk returns a tuple with the Settings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSettings

`func (o *ToolMobileGetConfig200Response) SetSettings(v []ToolMobileGetConfig200ResponseSettingsInner)`

SetSettings sets Settings field to given value.


### GetWarnings

`func (o *ToolMobileGetConfig200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ToolMobileGetConfig200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ToolMobileGetConfig200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ToolMobileGetConfig200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


