

# ModGlossaryGetEntriesByCategory200ResponseEntriesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**approved** | **Boolean** | Whether the entry was approved |  [optional] |
|**attachment** | **Boolean** | Whether or not the entry has attachments |  [optional] |
|**attachments** | [**List&lt;CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner&gt;**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  |  [optional] |
|**casesensitive** | **Boolean** | When true, the matching is case sensitive |  [optional] |
|**categoryid** | **Integer** | The category ID. This may be &#39;-1&#39; when the entry is not categorised |  [optional] |
|**categoryname** | **String** | The category name. May be empty when the entry is not categorised, or the request was limited to one category. |  [optional] |
|**concept** | **String** | The concept |  [optional] |
|**definition** | **String** | The definition |  [optional] |
|**definitionformat** | **Integer** | definition format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |  [optional] |
|**definitioninlinefiles** | [**List&lt;CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner&gt;**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  |  [optional] |
|**definitiontrust** | **Boolean** | The definition trust flag |  [optional] |
|**fullmatch** | **Boolean** | When true, the matching is done on full words only |  [optional] |
|**glossaryid** | **Integer** | The glossary ID |  [optional] |
|**id** | **Integer** | The entry ID |  [optional] |
|**sourceglossaryid** | **Integer** | The source glossary ID |  [optional] |
|**tags** | [**List&lt;ModDataGetEntries200ResponseEntriesInnerTagsInner&gt;**](ModDataGetEntries200ResponseEntriesInnerTagsInner.md) |  |  [optional] |
|**teacherentry** | **Boolean** | The entry was created by a teacher, or equivalent. |  [optional] |
|**timecreated** | **Integer** | Time created |  [optional] |
|**timemodified** | **Integer** | Time modified |  [optional] |
|**usedynalink** | **Boolean** | Whether the concept should be automatically linked |  [optional] |
|**userfullname** | **String** | Author full name |  [optional] |
|**userid** | **Integer** | Author ID |  [optional] |
|**userpictureurl** | **String** | Author picture |  [optional] |



