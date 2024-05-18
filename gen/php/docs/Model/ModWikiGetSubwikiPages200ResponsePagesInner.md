# # ModWikiGetSubwikiPages200ResponsePagesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cachedcontent** | **string** | Page contents. | [optional]
**caneditpage** | **bool** | True if user can edit the page. | [optional]
**contentformat** | **int** | cachedcontent format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional]
**contentsize** | **int** | Size of page contents in bytes (doesn&#39;t include size of attached files). | [optional] [default to null]
**firstpage** | **bool** | True if it&#39;s the first page. | [optional] [default to null]
**id** | **int** | Page ID. | [optional]
**pageviews** | **int** | Number of times the page has been viewed. | [optional] [default to null]
**readonly** | **int** | 1 if readonly, 0 otherwise. | [optional] [default to null]
**subwikiid** | **int** | Page&#39;s subwiki ID. | [optional]
**tags** | [**\OpenAPI\Client\Model\ModDataGetEntries200ResponseEntriesInnerTagsInner[]**](ModDataGetEntries200ResponseEntriesInnerTagsInner.md) |  | [optional]
**timecreated** | **int** | Time of creation. | [optional] [default to null]
**timemodified** | **int** | Time of last modification. | [optional] [default to null]
**timerendered** | **int** | Time of last renderization. | [optional] [default to null]
**title** | **string** | Page title. | [optional]
**userid** | **int** | ID of the user that last modified the page. | [optional] [default to null]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
