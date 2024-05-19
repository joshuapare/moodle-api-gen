# CoreAuthConfirmUserRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Secret** | **string** | Confirmation secret | [default to "null"]
**Username** | **string** | User name | [default to "null"]

## Methods

### NewCoreAuthConfirmUserRequest

`func NewCoreAuthConfirmUserRequest(secret string, username string, ) *CoreAuthConfirmUserRequest`

NewCoreAuthConfirmUserRequest instantiates a new CoreAuthConfirmUserRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreAuthConfirmUserRequestWithDefaults

`func NewCoreAuthConfirmUserRequestWithDefaults() *CoreAuthConfirmUserRequest`

NewCoreAuthConfirmUserRequestWithDefaults instantiates a new CoreAuthConfirmUserRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSecret

`func (o *CoreAuthConfirmUserRequest) GetSecret() string`

GetSecret returns the Secret field if non-nil, zero value otherwise.

### GetSecretOk

`func (o *CoreAuthConfirmUserRequest) GetSecretOk() (*string, bool)`

GetSecretOk returns a tuple with the Secret field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSecret

`func (o *CoreAuthConfirmUserRequest) SetSecret(v string)`

SetSecret sets Secret field to given value.


### GetUsername

`func (o *CoreAuthConfirmUserRequest) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *CoreAuthConfirmUserRequest) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *CoreAuthConfirmUserRequest) SetUsername(v string)`

SetUsername sets Username field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


