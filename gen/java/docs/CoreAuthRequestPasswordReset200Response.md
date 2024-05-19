

# CoreAuthRequestPasswordReset200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**notice** | **String** | Important information for the user about the process. |  |
|**status** | **String** | The returned status of the process:                     dataerror: Error in the sent data (username or email). More information in warnings field.                     emailpasswordconfirmmaybesent: Email sent or not (depends on user found in database).                     emailpasswordconfirmnotsent: Failure, user not found.                     emailpasswordconfirmnoemail: Failure, email not found.                     emailalreadysent: Email already sent.                     emailpasswordconfirmsent: User pending confirmation.                     emailresetconfirmsent: Email sent.                  |  |
|**warnings** | [**List&lt;AuthEmailSignupUser200ResponseWarningsInner&gt;**](AuthEmailSignupUser200ResponseWarningsInner.md) |  |  [optional] |



