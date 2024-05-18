# ModWikiGetSubwikiPagesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupid** | Option<**i32**> | Subwiki's group ID, -1 means current group. It will be ignored if the wiki doesn't use groups. | [optional][default to -1]
**options** | Option<[**models::ModWikiGetSubwikiPagesRequestOptions**](mod_wiki_get_subwiki_pages_request_options.md)> |  | [optional]
**userid** | Option<**i32**> | Subwiki's user ID, 0 means current user. It will be ignored in collaborative wikis. | [optional][default to 0]
**wikiid** | **i32** | Wiki instance ID. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


