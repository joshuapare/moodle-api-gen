# AuthEmailSignupUser200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Success** | **bool** | True if the user was created false otherwise | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewAuthEmailSignupUser200Response

`func NewAuthEmailSignupUser200Response(success bool, ) *AuthEmailSignupUser200Response`

NewAuthEmailSignupUser200Response instantiates a new AuthEmailSignupUser200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuthEmailSignupUser200ResponseWithDefaults

`func NewAuthEmailSignupUser200ResponseWithDefaults() *AuthEmailSignupUser200Response`

NewAuthEmailSignupUser200ResponseWithDefaults instantiates a new AuthEmailSignupUser200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSuccess

`func (o *AuthEmailSignupUser200Response) GetSuccess() bool`

GetSuccess returns the Success field if non-nil, zero value otherwise.

### GetSuccessOk

`func (o *AuthEmailSignupUser200Response) GetSuccessOk() (*bool, bool)`

GetSuccessOk returns a tuple with the Success field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuccess

`func (o *AuthEmailSignupUser200Response) SetSuccess(v bool)`

SetSuccess sets Success field to given value.


### GetWarnings

`func (o *AuthEmailSignupUser200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *AuthEmailSignupUser200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *AuthEmailSignupUser200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *AuthEmailSignupUser200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


