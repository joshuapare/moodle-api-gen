# CoreAuthResendConfirmationEmailRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Password** | **string** | Plain text password. | [default to "null"]
**Redirect** | Pointer to **string** | Redirect the user to this site url after confirmation. | [optional] [default to ""]
**Username** | **string** | Username. | [default to "null"]

## Methods

### NewCoreAuthResendConfirmationEmailRequest

`func NewCoreAuthResendConfirmationEmailRequest(password string, username string, ) *CoreAuthResendConfirmationEmailRequest`

NewCoreAuthResendConfirmationEmailRequest instantiates a new CoreAuthResendConfirmationEmailRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreAuthResendConfirmationEmailRequestWithDefaults

`func NewCoreAuthResendConfirmationEmailRequestWithDefaults() *CoreAuthResendConfirmationEmailRequest`

NewCoreAuthResendConfirmationEmailRequestWithDefaults instantiates a new CoreAuthResendConfirmationEmailRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPassword

`func (o *CoreAuthResendConfirmationEmailRequest) GetPassword() string`

GetPassword returns the Password field if non-nil, zero value otherwise.

### GetPasswordOk

`func (o *CoreAuthResendConfirmationEmailRequest) GetPasswordOk() (*string, bool)`

GetPasswordOk returns a tuple with the Password field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPassword

`func (o *CoreAuthResendConfirmationEmailRequest) SetPassword(v string)`

SetPassword sets Password field to given value.


### GetRedirect

`func (o *CoreAuthResendConfirmationEmailRequest) GetRedirect() string`

GetRedirect returns the Redirect field if non-nil, zero value otherwise.

### GetRedirectOk

`func (o *CoreAuthResendConfirmationEmailRequest) GetRedirectOk() (*string, bool)`

GetRedirectOk returns a tuple with the Redirect field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRedirect

`func (o *CoreAuthResendConfirmationEmailRequest) SetRedirect(v string)`

SetRedirect sets Redirect field to given value.

### HasRedirect

`func (o *CoreAuthResendConfirmationEmailRequest) HasRedirect() bool`

HasRedirect returns a boolean if a field has been set.

### GetUsername

`func (o *CoreAuthResendConfirmationEmailRequest) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *CoreAuthResendConfirmationEmailRequest) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *CoreAuthResendConfirmationEmailRequest) SetUsername(v string)`

SetUsername sets Username field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


