# ModQuizGetAttemptAccessInformation200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endtime** | Option<**i32**> | When the attempt must be submitted (determined by rules). | [optional][default to null]
**isfinished** | **bool** | Whether there is no way the user will ever be allowed to attempt. | [default to null]
**ispreflightcheckrequired** | Option<**bool**> | whether a check is required before the user                                                                     starts/continues his attempt. | [optional][default to null]
**preventnewattemptreasons** | [**Vec<serde_json::Value>**](serde_json::Value.md) |  | 
**warnings** | Option<[**Vec<models::AuthEmailSignupUser200ResponseWarningsInner>**](auth_email_signup_user_200_response_warnings_inner.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


