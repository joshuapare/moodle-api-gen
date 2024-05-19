# ModQuizGetQuizAccessInformation200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessrules** | [**Vec<serde_json::Value>**](serde_json::Value.md) |  | 
**activerulenames** | [**Vec<serde_json::Value>**](serde_json::Value.md) |  | 
**canattempt** | **bool** | Whether the user can do the quiz or not. | [default to null]
**canmanage** | **bool** | Whether the user can edit the quiz settings or not. | [default to null]
**canpreview** | **bool** | Whether the user can preview the quiz or not. | [default to null]
**canreviewmyattempts** | **bool** | Whether the users can review their previous attempts                                                                 or not. | [default to null]
**canviewreports** | **bool** | Whether the user can view the quiz reports or not. | [default to null]
**preventaccessreasons** | [**Vec<serde_json::Value>**](serde_json::Value.md) |  | 
**warnings** | Option<[**Vec<models::AuthEmailSignupUser200ResponseWarningsInner>**](auth_email_signup_user_200_response_warnings_inner.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


