

# ModWikiGetSubwikiPages200ResponsePagesInner

Pages

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cachedcontent** | **String** | Page contents. |  [optional] |
|**caneditpage** | **Boolean** | True if user can edit the page. |  [optional] |
|**contentformat** | **Integer** | cachedcontent format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |  [optional] |
|**contentsize** | **Integer** | Size of page contents in bytes (doesn&#39;t include size of attached files). |  [optional] |
|**firstpage** | **Boolean** | True if it&#39;s the first page. |  [optional] |
|**id** | **Integer** | Page ID. |  [optional] |
|**pageviews** | **Integer** | Number of times the page has been viewed. |  [optional] |
|**readonly** | **Integer** | 1 if readonly, 0 otherwise. |  [optional] |
|**subwikiid** | **Integer** | Page&#39;s subwiki ID. |  [optional] |
|**tags** | [**List&lt;ModDataGetEntries200ResponseEntriesInnerTagsInner&gt;**](ModDataGetEntries200ResponseEntriesInnerTagsInner.md) |  |  [optional] |
|**timecreated** | **Integer** | Time of creation. |  [optional] |
|**timemodified** | **Integer** | Time of last modification. |  [optional] |
|**timerendered** | **Integer** | Time of last renderization. |  [optional] |
|**title** | **String** | Page title. |  [optional] |
|**userid** | **Integer** | ID of the user that last modified the page. |  [optional] |



