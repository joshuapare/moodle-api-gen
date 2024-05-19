# CoreAuthRequestPasswordResetRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Email** | Pointer to **string** | User email | [optional] [default to ""]
**Username** | Pointer to **string** | User name | [optional] [default to ""]

## Methods

### NewCoreAuthRequestPasswordResetRequest

`func NewCoreAuthRequestPasswordResetRequest() *CoreAuthRequestPasswordResetRequest`

NewCoreAuthRequestPasswordResetRequest instantiates a new CoreAuthRequestPasswordResetRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreAuthRequestPasswordResetRequestWithDefaults

`func NewCoreAuthRequestPasswordResetRequestWithDefaults() *CoreAuthRequestPasswordResetRequest`

NewCoreAuthRequestPasswordResetRequestWithDefaults instantiates a new CoreAuthRequestPasswordResetRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEmail

`func (o *CoreAuthRequestPasswordResetRequest) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *CoreAuthRequestPasswordResetRequest) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *CoreAuthRequestPasswordResetRequest) SetEmail(v string)`

SetEmail sets Email field to given value.

### HasEmail

`func (o *CoreAuthRequestPasswordResetRequest) HasEmail() bool`

HasEmail returns a boolean if a field has been set.

### GetUsername

`func (o *CoreAuthRequestPasswordResetRequest) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *CoreAuthRequestPasswordResetRequest) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *CoreAuthRequestPasswordResetRequest) SetUsername(v string)`

SetUsername sets Username field to given value.

### HasUsername

`func (o *CoreAuthRequestPasswordResetRequest) HasUsername() bool`

HasUsername returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


