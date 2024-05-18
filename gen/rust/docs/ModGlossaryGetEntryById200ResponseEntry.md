# ModGlossaryGetEntryById200ResponseEntry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approved** | **bool** | Whether the entry was approved | 
**attachment** | **bool** | Whether or not the entry has attachments | 
**attachments** | Option<[**Vec<models::CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>**](core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner.md)> |  | [optional]
**casesensitive** | **bool** | When true, the matching is case sensitive | 
**concept** | **String** | The concept | 
**definition** | **String** | The definition | 
**definitionformat** | **i32** | definition format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | 
**definitioninlinefiles** | Option<[**Vec<models::CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>**](core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner.md)> |  | [optional]
**definitiontrust** | **bool** | The definition trust flag | 
**fullmatch** | **bool** | When true, the matching is done on full words only | 
**glossaryid** | **i32** | The glossary ID | 
**id** | **i32** | The entry ID | 
**sourceglossaryid** | **i32** | The source glossary ID | 
**tags** | Option<[**Vec<models::ModDataGetEntries200ResponseEntriesInnerTagsInner>**](mod_data_get_entries_200_response_entries_inner_tags_inner.md)> |  | [optional]
**teacherentry** | **bool** | The entry was created by a teacher, or equivalent. | 
**timecreated** | **i32** | Time created | 
**timemodified** | **i32** | Time modified | 
**usedynalink** | **bool** | Whether the concept should be automatically linked | 
**userfullname** | **String** | Author full name | 
**userid** | **i32** | Author ID | 
**userpictureurl** | **String** | Author picture | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


