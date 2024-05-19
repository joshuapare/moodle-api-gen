# # ModGlossaryGetEntriesByAuthor200ResponseEntriesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approved** | **bool** | Whether the entry was approved | [optional] [default to null]
**attachment** | **bool** | Whether or not the entry has attachments | [optional] [default to null]
**attachments** | [**\OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional]
**casesensitive** | **bool** | When true, the matching is case sensitive | [optional] [default to null]
**concept** | **string** | The concept | [optional] [default to 'null']
**definition** | **string** | The definition | [optional] [default to 'null']
**definitionformat** | **int** | definition format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional]
**definitioninlinefiles** | [**\OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional]
**definitiontrust** | **bool** | The definition trust flag | [optional] [default to null]
**fullmatch** | **bool** | When true, the matching is done on full words only | [optional] [default to null]
**glossaryid** | **int** | The glossary ID | [optional]
**id** | **int** | The entry ID | [optional] [default to null]
**sourceglossaryid** | **int** | The source glossary ID | [optional] [default to null]
**tags** | [**\OpenAPI\Client\Model\ModDataGetEntries200ResponseEntriesInnerTagsInner[]**](ModDataGetEntries200ResponseEntriesInnerTagsInner.md) |  | [optional]
**teacherentry** | **bool** | The entry was created by a teacher, or equivalent. | [optional] [default to null]
**timecreated** | **int** | Time created | [optional]
**timemodified** | **int** | Time modified | [optional]
**usedynalink** | **bool** | Whether the concept should be automatically linked | [optional] [default to null]
**userfullname** | **string** | Author full name | [optional] [default to 'null']
**userid** | **int** | Author ID | [optional] [default to null]
**userpictureurl** | **string** | Author picture | [optional] [default to 'null']

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
