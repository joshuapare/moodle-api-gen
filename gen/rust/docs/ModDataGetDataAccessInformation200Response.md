# ModDataGetDataAccessInformation200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canaddentry** | **bool** | Whether the user can add entries or not. | [default to null]
**canapprove** | **bool** | Whether the user can approve entries or not. | [default to null]
**canmanageentries** | **bool** | Whether the user can manage entries or not. | [default to null]
**entrieslefttoadd** | **i32** | The number of entries left to complete the activity. | [default to null]
**entrieslefttoview** | **i32** | The number of entries left to view other users entries. | [default to null]
**groupid** | **i32** | User current group id (calculated) | [default to null]
**inreadonlyperiod** | **bool** | Whether the database is in read mode only. | [default to null]
**numentries** | **i32** | The number of entries the current user added. | [default to null]
**timeavailable** | **bool** | Whether the database is available or not by time restrictions. | [default to null]
**warnings** | Option<[**Vec<models::AuthEmailSignupUser200ResponseWarningsInner>**](auth_email_signup_user_200_response_warnings_inner.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


