# ToolMobileValidateSubscriptionKey200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Validated** | **bool** | Whether the key is validated or not. | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewToolMobileValidateSubscriptionKey200Response

`func NewToolMobileValidateSubscriptionKey200Response(validated bool, ) *ToolMobileValidateSubscriptionKey200Response`

NewToolMobileValidateSubscriptionKey200Response instantiates a new ToolMobileValidateSubscriptionKey200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolMobileValidateSubscriptionKey200ResponseWithDefaults

`func NewToolMobileValidateSubscriptionKey200ResponseWithDefaults() *ToolMobileValidateSubscriptionKey200Response`

NewToolMobileValidateSubscriptionKey200ResponseWithDefaults instantiates a new ToolMobileValidateSubscriptionKey200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetValidated

`func (o *ToolMobileValidateSubscriptionKey200Response) GetValidated() bool`

GetValidated returns the Validated field if non-nil, zero value otherwise.

### GetValidatedOk

`func (o *ToolMobileValidateSubscriptionKey200Response) GetValidatedOk() (*bool, bool)`

GetValidatedOk returns a tuple with the Validated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidated

`func (o *ToolMobileValidateSubscriptionKey200Response) SetValidated(v bool)`

SetValidated sets Validated field to given value.


### GetWarnings

`func (o *ToolMobileValidateSubscriptionKey200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ToolMobileValidateSubscriptionKey200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ToolMobileValidateSubscriptionKey200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ToolMobileValidateSubscriptionKey200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


