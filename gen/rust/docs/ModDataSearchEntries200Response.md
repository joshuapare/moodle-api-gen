# ModDataSearchEntries200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entries** | [**Vec<models::ModDataSearchEntries200ResponseEntriesInner>**](mod_data_search_entries_200_response_entries_inner.md) |  | 
**listviewcontents** | Option<**String**> | The list view contents as is rendered in the site. | [optional]
**maxcount** | Option<**i32**> | Total count of records that the user could see in the database                     (if all the search criterias were removed). | [optional][default to null]
**totalcount** | **i32** | Total count of records returned by the search. | [default to null]
**warnings** | Option<[**Vec<models::AuthEmailSignupUser200ResponseWarningsInner>**](auth_email_signup_user_200_response_warnings_inner.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


