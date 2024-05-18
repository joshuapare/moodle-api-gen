# CoreAuthRequestPasswordReset200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**notice** | **String** | Important information for the user about the process. | [default to null]
**status** | **String** | The returned status of the process:                     dataerror: Error in the sent data (username or email). More information in warnings field.                     emailpasswordconfirmmaybesent: Email sent or not (depends on user found in database).                     emailpasswordconfirmnotsent: Failure, user not found.                     emailpasswordconfirmnoemail: Failure, email not found.                     emailalreadysent: Email already sent.                     emailpasswordconfirmsent: User pending confirmation.                     emailresetconfirmsent: Email sent.                  | [default to null]
**warnings** | Option<[**Vec<models::AuthEmailSignupUser200ResponseWarningsInner>**](auth_email_signup_user_200_response_warnings_inner.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


