# ModGlossaryGetEntriesBySearchRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | Option<**i32**> | Start returning records from here | [optional][default to 0]
**fullsearch** | Option<**bool**> | The query | [optional][default to 1]
**id** | **i32** | Glossary entry ID | 
**limit** | Option<**i32**> | Number of records to return | [optional][default to 20]
**options** | Option<[**models::ModGlossaryGetEntriesByAuthorRequestOptions**](mod_glossary_get_entries_by_author_request_options.md)> |  | [optional]
**order** | Option<**String**> | Order by: 'CONCEPT', 'CREATION' or 'UPDATE' | [optional][default to CONCEPT]
**query** | **String** | The query string | [default to null]
**sort** | Option<**String**> | The direction of the order: 'ASC' or 'DESC' | [optional][default to ASC]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


