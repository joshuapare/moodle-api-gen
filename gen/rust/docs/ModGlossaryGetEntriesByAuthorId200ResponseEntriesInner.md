# ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approved** | Option<**bool**> | Whether the entry was approved | [optional]
**attachment** | Option<**bool**> | Whether or not the entry has attachments | [optional]
**attachments** | Option<[**Vec<models::CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>**](core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner.md)> |  | [optional]
**casesensitive** | Option<**bool**> | When true, the matching is case sensitive | [optional]
**concept** | Option<**String**> | The concept | [optional]
**definition** | Option<**String**> | The definition | [optional]
**definitionformat** | Option<**i32**> | definition format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional]
**definitioninlinefiles** | Option<[**Vec<models::CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>**](core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner.md)> |  | [optional]
**definitiontrust** | Option<**bool**> | The definition trust flag | [optional]
**fullmatch** | Option<**bool**> | When true, the matching is done on full words only | [optional]
**glossaryid** | Option<**i32**> | The glossary ID | [optional]
**id** | Option<**i32**> | The entry ID | [optional]
**sourceglossaryid** | Option<**i32**> | The source glossary ID | [optional]
**tags** | Option<[**Vec<models::ModDataGetEntries200ResponseEntriesInnerTagsInner>**](mod_data_get_entries_200_response_entries_inner_tags_inner.md)> |  | [optional]
**teacherentry** | Option<**bool**> | The entry was created by a teacher, or equivalent. | [optional]
**timecreated** | Option<**i32**> | Time created | [optional]
**timemodified** | Option<**i32**> | Time modified | [optional]
**usedynalink** | Option<**bool**> | Whether the concept should be automatically linked | [optional]
**userfullname** | Option<**String**> | Author full name | [optional]
**userid** | Option<**i32**> | Author ID | [optional]
**userpictureurl** | Option<**String**> | Author picture | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


