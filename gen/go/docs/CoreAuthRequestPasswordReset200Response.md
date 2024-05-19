# CoreAuthRequestPasswordReset200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Notice** | **string** | Important information for the user about the process. | [default to "null"]
**Status** | **string** | The returned status of the process:                     dataerror: Error in the sent data (username or email). More information in warnings field.                     emailpasswordconfirmmaybesent: Email sent or not (depends on user found in database).                     emailpasswordconfirmnotsent: Failure, user not found.                     emailpasswordconfirmnoemail: Failure, email not found.                     emailalreadysent: Email already sent.                     emailpasswordconfirmsent: User pending confirmation.                     emailresetconfirmsent: Email sent.                  | [default to "null"]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreAuthRequestPasswordReset200Response

`func NewCoreAuthRequestPasswordReset200Response(notice string, status string, ) *CoreAuthRequestPasswordReset200Response`

NewCoreAuthRequestPasswordReset200Response instantiates a new CoreAuthRequestPasswordReset200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreAuthRequestPasswordReset200ResponseWithDefaults

`func NewCoreAuthRequestPasswordReset200ResponseWithDefaults() *CoreAuthRequestPasswordReset200Response`

NewCoreAuthRequestPasswordReset200ResponseWithDefaults instantiates a new CoreAuthRequestPasswordReset200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetNotice

`func (o *CoreAuthRequestPasswordReset200Response) GetNotice() string`

GetNotice returns the Notice field if non-nil, zero value otherwise.

### GetNoticeOk

`func (o *CoreAuthRequestPasswordReset200Response) GetNoticeOk() (*string, bool)`

GetNoticeOk returns a tuple with the Notice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNotice

`func (o *CoreAuthRequestPasswordReset200Response) SetNotice(v string)`

SetNotice sets Notice field to given value.


### GetStatus

`func (o *CoreAuthRequestPasswordReset200Response) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CoreAuthRequestPasswordReset200Response) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CoreAuthRequestPasswordReset200Response) SetStatus(v string)`

SetStatus sets Status field to given value.


### GetWarnings

`func (o *CoreAuthRequestPasswordReset200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreAuthRequestPasswordReset200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreAuthRequestPasswordReset200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreAuthRequestPasswordReset200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


