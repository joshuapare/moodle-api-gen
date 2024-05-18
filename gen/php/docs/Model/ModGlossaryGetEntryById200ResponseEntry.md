# # ModGlossaryGetEntryById200ResponseEntry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approved** | **bool** | Whether the entry was approved |
**attachment** | **bool** | Whether or not the entry has attachments |
**attachments** | [**\OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional]
**casesensitive** | **bool** | When true, the matching is case sensitive |
**concept** | **string** | The concept |
**definition** | **string** | The definition |
**definitionformat** | **int** | definition format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |
**definitioninlinefiles** | [**\OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional]
**definitiontrust** | **bool** | The definition trust flag |
**fullmatch** | **bool** | When true, the matching is done on full words only |
**glossaryid** | **int** | The glossary ID |
**id** | **int** | The entry ID |
**sourceglossaryid** | **int** | The source glossary ID |
**tags** | [**\OpenAPI\Client\Model\ModDataGetEntries200ResponseEntriesInnerTagsInner[]**](ModDataGetEntries200ResponseEntriesInnerTagsInner.md) |  | [optional]
**teacherentry** | **bool** | The entry was created by a teacher, or equivalent. |
**timecreated** | **int** | Time created |
**timemodified** | **int** | Time modified |
**usedynalink** | **bool** | Whether the concept should be automatically linked |
**userfullname** | **string** | Author full name |
**userid** | **int** | Author ID |
**userpictureurl** | **string** | Author picture |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
