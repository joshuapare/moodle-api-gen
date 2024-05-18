# # ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approved** | **bool** | Whether the entry was approved | [optional]
**attachment** | **bool** | Whether or not the entry has attachments | [optional]
**attachments** | [**\OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional]
**casesensitive** | **bool** | When true, the matching is case sensitive | [optional]
**concept** | **string** | The concept | [optional]
**definition** | **string** | The definition | [optional]
**definitionformat** | **int** | definition format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional]
**definitioninlinefiles** | [**\OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional]
**definitiontrust** | **bool** | The definition trust flag | [optional]
**fullmatch** | **bool** | When true, the matching is done on full words only | [optional]
**glossaryid** | **int** | The glossary ID | [optional]
**id** | **int** | The entry ID | [optional]
**sourceglossaryid** | **int** | The source glossary ID | [optional]
**tags** | [**\OpenAPI\Client\Model\ModDataGetEntries200ResponseEntriesInnerTagsInner[]**](ModDataGetEntries200ResponseEntriesInnerTagsInner.md) |  | [optional]
**teacherentry** | **bool** | The entry was created by a teacher, or equivalent. | [optional]
**timecreated** | **int** | Time created | [optional]
**timemodified** | **int** | Time modified | [optional]
**usedynalink** | **bool** | Whether the concept should be automatically linked | [optional]
**userfullname** | **string** | Author full name | [optional]
**userid** | **int** | Author ID | [optional]
**userpictureurl** | **string** | Author picture | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
