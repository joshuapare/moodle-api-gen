# AuthEmailSignupUserRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**city** | Option<**String**> | Home city of the user | [optional][default to ]
**country** | Option<**String**> | Home country code | [optional][default to ]
**customprofilefields** | Option<[**Vec<models::AuthEmailSignupUserRequestCustomprofilefieldsInner>**](auth_email_signup_user_request_customprofilefields_inner.md)> |  | [optional]
**email** | **String** | A valid and unique email address | [default to null]
**firstname** | **String** | The first name(s) of the user | [default to null]
**lastname** | **String** | The family name of the user | [default to null]
**password** | **String** | Plain text password | [default to null]
**recaptchachallengehash** | Option<**String**> | Recaptcha challenge hash | [optional][default to ]
**recaptcharesponse** | Option<**String**> | Recaptcha response | [optional][default to ]
**redirect** | Option<**String**> | Redirect the user to this site url after confirmation. | [optional][default to ]
**username** | **String** | Username | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


