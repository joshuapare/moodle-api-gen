# Org.OpenAPITools.Model.ModGlossaryGetEntryById200ResponseEntry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Approved** | **bool** | Whether the entry was approved | 
**Attachment** | **bool** | Whether or not the entry has attachments | 
**Attachments** | [**List&lt;CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner&gt;**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Casesensitive** | **bool** | When true, the matching is case sensitive | 
**Concept** | **string** | The concept | 
**Definition** | **string** | The definition | 
**Definitionformat** | **int** | definition format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | 
**Definitioninlinefiles** | [**List&lt;CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner&gt;**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Definitiontrust** | **bool** | The definition trust flag | 
**Fullmatch** | **bool** | When true, the matching is done on full words only | 
**Glossaryid** | **int** | The glossary ID | 
**Id** | **int** | The entry ID | 
**Sourceglossaryid** | **int** | The source glossary ID | 
**Tags** | [**List&lt;ModDataGetEntries200ResponseEntriesInnerTagsInner&gt;**](ModDataGetEntries200ResponseEntriesInnerTagsInner.md) |  | [optional] 
**Teacherentry** | **bool** | The entry was created by a teacher, or equivalent. | 
**Timecreated** | **int** | Time created | 
**Timemodified** | **int** | Time modified | 
**Usedynalink** | **bool** | Whether the concept should be automatically linked | 
**Userfullname** | **string** | Author full name | 
**Userid** | **int** | Author ID | 
**Userpictureurl** | **string** | Author picture | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

