# Org.OpenAPITools.Model.ModGlossaryGetEntriesByAuthor200ResponseEntriesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Approved** | **bool** | Whether the entry was approved | [optional] [default to null]
**Attachment** | **bool** | Whether or not the entry has attachments | [optional] [default to null]
**Attachments** | [**List&lt;CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner&gt;**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Casesensitive** | **bool** | When true, the matching is case sensitive | [optional] [default to null]
**Concept** | **string** | The concept | [optional] [default to "null"]
**Definition** | **string** | The definition | [optional] [default to "null"]
**Definitionformat** | **int** | definition format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Definitioninlinefiles** | [**List&lt;CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner&gt;**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Definitiontrust** | **bool** | The definition trust flag | [optional] [default to null]
**Fullmatch** | **bool** | When true, the matching is done on full words only | [optional] [default to null]
**Glossaryid** | **int** | The glossary ID | [optional] 
**Id** | **int** | The entry ID | [optional] [default to null]
**Sourceglossaryid** | **int** | The source glossary ID | [optional] [default to null]
**Tags** | [**List&lt;ModDataGetEntries200ResponseEntriesInnerTagsInner&gt;**](ModDataGetEntries200ResponseEntriesInnerTagsInner.md) |  | [optional] 
**Teacherentry** | **bool** | The entry was created by a teacher, or equivalent. | [optional] [default to null]
**Timecreated** | **int** | Time created | [optional] 
**Timemodified** | **int** | Time modified | [optional] 
**Usedynalink** | **bool** | Whether the concept should be automatically linked | [optional] [default to null]
**Userfullname** | **string** | Author full name | [optional] [default to "null"]
**Userid** | **int** | Author ID | [optional] [default to null]
**Userpictureurl** | **string** | Author picture | [optional] [default to "null"]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

