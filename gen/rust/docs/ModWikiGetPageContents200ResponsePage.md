# ModWikiGetPageContents200ResponsePage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cachedcontent** | **String** | Page contents. | 
**caneditpage** | **bool** | True if user can edit the page. | [default to null]
**contentformat** | Option<**i32**> | cachedcontent format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to null]
**groupid** | **i32** | Page's group ID. | [default to null]
**id** | **i32** | Page ID. | 
**subwikiid** | **i32** | Page's subwiki ID. | [default to null]
**tags** | Option<[**Vec<models::ModDataGetEntries200ResponseEntriesInnerTagsInner>**](mod_data_get_entries_200_response_entries_inner_tags_inner.md)> |  | [optional]
**title** | **String** | Page title. | 
**userid** | **i32** | Page's user ID. | [default to null]
**version** | Option<**i32**> | Latest version of the page. | [optional][default to null]
**wikiid** | **i32** | Page's wiki ID. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


