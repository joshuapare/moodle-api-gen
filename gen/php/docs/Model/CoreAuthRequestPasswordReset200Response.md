# # CoreAuthRequestPasswordReset200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**notice** | **string** | Important information for the user about the process. | [default to 'null']
**status** | **string** | The returned status of the process:                     dataerror: Error in the sent data (username or email). More information in warnings field.                     emailpasswordconfirmmaybesent: Email sent or not (depends on user found in database).                     emailpasswordconfirmnotsent: Failure, user not found.                     emailpasswordconfirmnoemail: Failure, email not found.                     emailalreadysent: Email already sent.                     emailpasswordconfirmsent: User pending confirmation.                     emailresetconfirmsent: Email sent. | [default to 'null']
**warnings** | [**\OpenAPI\Client\Model\AuthEmailSignupUser200ResponseWarningsInner[]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
