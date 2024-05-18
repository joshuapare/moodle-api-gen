# ModGlossaryGetEntriesByCategoryRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryid** | **i32** | The category ID. Use '0' for all categories, or '-1' for uncategorised entries. | [default to null]
**from** | Option<**i32**> | Start returning records from here | [optional][default to 0]
**id** | **i32** | The glossary ID. | [default to null]
**limit** | Option<**i32**> | Number of records to return | [optional][default to 20]
**options** | Option<[**models::ModGlossaryGetEntriesByAuthorRequestOptions**](mod_glossary_get_entries_by_author_request_options.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


