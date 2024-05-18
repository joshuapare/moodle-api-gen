# Org.OpenAPITools.Model.CoreAuthRequestPasswordReset200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Notice** | **string** | Important information for the user about the process. | [default to "null"]
**Status** | **string** | The returned status of the process:                     dataerror: Error in the sent data (username or email). More information in warnings field.                     emailpasswordconfirmmaybesent: Email sent or not (depends on user found in database).                     emailpasswordconfirmnotsent: Failure, user not found.                     emailpasswordconfirmnoemail: Failure, email not found.                     emailalreadysent: Email already sent.                     emailpasswordconfirmsent: User pending confirmation.                     emailresetconfirmsent: Email sent.                  | [default to "null"]
**Warnings** | [**List&lt;AuthEmailSignupUser200ResponseWarningsInner&gt;**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

