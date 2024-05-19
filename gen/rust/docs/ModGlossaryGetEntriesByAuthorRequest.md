# ModGlossaryGetEntriesByAuthorRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | Option<**String**> | Search and order using: 'FIRSTNAME' or 'LASTNAME' | [optional][default to LASTNAME]
**from** | Option<**i32**> | Start returning records from here | [optional][default to 0]
**id** | **i32** | Glossary entry ID | 
**letter** | **String** | First letter of firstname or lastname, or either keywords: 'ALL' or 'SPECIAL'. | [default to null]
**limit** | Option<**i32**> | Number of records to return | [optional][default to 20]
**options** | Option<[**models::ModGlossaryGetEntriesByAuthorRequestOptions**](mod_glossary_get_entries_by_author_request_options.md)> |  | [optional]
**sort** | Option<**String**> | The direction of the order: 'ASC' or 'DESC' | [optional][default to ASC]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


