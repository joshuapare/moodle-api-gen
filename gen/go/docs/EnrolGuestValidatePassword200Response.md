# EnrolGuestValidatePassword200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Hint** | Pointer to **string** | Password hint (if enabled) | [optional] [default to "null"]
**Validated** | **bool** | Whether the password was successfully validated | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewEnrolGuestValidatePassword200Response

`func NewEnrolGuestValidatePassword200Response(validated bool, ) *EnrolGuestValidatePassword200Response`

NewEnrolGuestValidatePassword200Response instantiates a new EnrolGuestValidatePassword200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEnrolGuestValidatePassword200ResponseWithDefaults

`func NewEnrolGuestValidatePassword200ResponseWithDefaults() *EnrolGuestValidatePassword200Response`

NewEnrolGuestValidatePassword200ResponseWithDefaults instantiates a new EnrolGuestValidatePassword200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetHint

`func (o *EnrolGuestValidatePassword200Response) GetHint() string`

GetHint returns the Hint field if non-nil, zero value otherwise.

### GetHintOk

`func (o *EnrolGuestValidatePassword200Response) GetHintOk() (*string, bool)`

GetHintOk returns a tuple with the Hint field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHint

`func (o *EnrolGuestValidatePassword200Response) SetHint(v string)`

SetHint sets Hint field to given value.

### HasHint

`func (o *EnrolGuestValidatePassword200Response) HasHint() bool`

HasHint returns a boolean if a field has been set.

### GetValidated

`func (o *EnrolGuestValidatePassword200Response) GetValidated() bool`

GetValidated returns the Validated field if non-nil, zero value otherwise.

### GetValidatedOk

`func (o *EnrolGuestValidatePassword200Response) GetValidatedOk() (*bool, bool)`

GetValidatedOk returns a tuple with the Validated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidated

`func (o *EnrolGuestValidatePassword200Response) SetValidated(v bool)`

SetValidated sets Validated field to given value.


### GetWarnings

`func (o *EnrolGuestValidatePassword200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *EnrolGuestValidatePassword200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *EnrolGuestValidatePassword200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *EnrolGuestValidatePassword200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


