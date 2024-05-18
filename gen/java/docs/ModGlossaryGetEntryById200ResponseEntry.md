

# ModGlossaryGetEntryById200ResponseEntry


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**approved** | **Boolean** | Whether the entry was approved |  |
|**attachment** | **Boolean** | Whether or not the entry has attachments |  |
|**attachments** | [**List&lt;CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner&gt;**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  |  [optional] |
|**casesensitive** | **Boolean** | When true, the matching is case sensitive |  |
|**concept** | **String** | The concept |  |
|**definition** | **String** | The definition |  |
|**definitionformat** | **Integer** | definition format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |  |
|**definitioninlinefiles** | [**List&lt;CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner&gt;**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  |  [optional] |
|**definitiontrust** | **Boolean** | The definition trust flag |  |
|**fullmatch** | **Boolean** | When true, the matching is done on full words only |  |
|**glossaryid** | **Integer** | The glossary ID |  |
|**id** | **Integer** | The entry ID |  |
|**sourceglossaryid** | **Integer** | The source glossary ID |  |
|**tags** | [**List&lt;ModDataGetEntries200ResponseEntriesInnerTagsInner&gt;**](ModDataGetEntries200ResponseEntriesInnerTagsInner.md) |  |  [optional] |
|**teacherentry** | **Boolean** | The entry was created by a teacher, or equivalent. |  |
|**timecreated** | **Integer** | Time created |  |
|**timemodified** | **Integer** | Time modified |  |
|**usedynalink** | **Boolean** | Whether the concept should be automatically linked |  |
|**userfullname** | **String** | Author full name |  |
|**userid** | **Integer** | Author ID |  |
|**userpictureurl** | **String** | Author picture |  |



