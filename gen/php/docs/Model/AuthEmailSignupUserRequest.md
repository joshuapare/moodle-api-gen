# # AuthEmailSignupUserRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**city** | **string** | Home city of the user | [optional] [default to '']
**country** | **string** | Home country code | [optional] [default to '']
**customprofilefields** | [**\OpenAPI\Client\Model\AuthEmailSignupUserRequestCustomprofilefieldsInner[]**](AuthEmailSignupUserRequestCustomprofilefieldsInner.md) |  | [optional]
**email** | **string** | A valid and unique email address | [default to 'null']
**firstname** | **string** | The first name(s) of the user | [default to 'null']
**lastname** | **string** | The family name of the user | [default to 'null']
**password** | **string** | Plain text password | [default to 'null']
**recaptchachallengehash** | **string** | Recaptcha challenge hash | [optional] [default to '']
**recaptcharesponse** | **string** | Recaptcha response | [optional] [default to '']
**redirect** | **string** | Redirect the user to this site url after confirmation. | [optional] [default to '']
**username** | **string** | Username | [default to 'null']

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
