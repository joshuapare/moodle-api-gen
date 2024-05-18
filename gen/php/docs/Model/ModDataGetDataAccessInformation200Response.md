# # ModDataGetDataAccessInformation200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canaddentry** | **bool** | Whether the user can add entries or not. | [default to null]
**canapprove** | **bool** | Whether the user can approve entries or not. | [default to null]
**canmanageentries** | **bool** | Whether the user can manage entries or not. | [default to null]
**entrieslefttoadd** | **int** | The number of entries left to complete the activity. | [default to null]
**entrieslefttoview** | **int** | The number of entries left to view other users entries. | [default to null]
**groupid** | **int** | User current group id (calculated) | [default to null]
**inreadonlyperiod** | **bool** | Whether the database is in read mode only. | [default to null]
**numentries** | **int** | The number of entries the current user added. | [default to null]
**timeavailable** | **bool** | Whether the database is available or not by time restrictions. | [default to null]
**warnings** | [**\OpenAPI\Client\Model\AuthEmailSignupUser200ResponseWarningsInner[]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
