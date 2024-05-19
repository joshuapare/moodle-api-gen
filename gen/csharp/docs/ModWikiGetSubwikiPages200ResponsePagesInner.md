# MoodleClient.Model.ModWikiGetSubwikiPages200ResponsePagesInner
Pages

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cachedcontent** | **string** | Page contents. | [optional] 
**Caneditpage** | **bool** | True if user can edit the page. | [optional] 
**Contentformat** | **int** | cachedcontent format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Contentsize** | **int** | Size of page contents in bytes (doesn&#39;t include size of attached files). | [optional] [default to null]
**Firstpage** | **bool** | True if it&#39;s the first page. | [optional] [default to null]
**Id** | **int** | Page ID. | [optional] 
**Pageviews** | **int** | Number of times the page has been viewed. | [optional] [default to null]
**Readonly** | **int** | 1 if readonly, 0 otherwise. | [optional] [default to null]
**Subwikiid** | **int** | Page&#39;s subwiki ID. | [optional] 
**Tags** | [**List&lt;ModDataGetEntries200ResponseEntriesInnerTagsInner&gt;**](ModDataGetEntries200ResponseEntriesInnerTagsInner.md) |  | [optional] 
**Timecreated** | **int** | Time of creation. | [optional] [default to null]
**Timemodified** | **int** | Time of last modification. | [optional] [default to null]
**Timerendered** | **int** | Time of last renderization. | [optional] [default to null]
**Title** | **string** | Page title. | [optional] 
**Userid** | **int** | ID of the user that last modified the page. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

