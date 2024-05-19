# CoreBlogGetEntries200ResponseEntriesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachment** | Option<**String**> | Post atachment. | [optional][default to null]
**attachmentfiles** | Option<[**Vec<models::CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner>**](core_blog_get_entries_200_response_entries_inner_attachmentfiles_inner.md)> |  | [optional]
**content** | Option<**String**> | Post content. | [optional][default to null]
**courseid** | Option<**i32**> | Course where the post was created. | [optional][default to 0]
**coursemoduleid** | Option<**i32**> | Course module id where the post was created. | [optional][default to 0]
**created** | Option<**i32**> | When it was created. | [optional][default to 0]
**format** | Option<**i32**> | Post content format. | [optional][default to 0]
**groupid** | Option<**i32**> | Group post was created for. | [optional][default to 0]
**id** | Option<**i32**> | Post/entry id. | [optional][default to null]
**lastmodified** | Option<**i32**> | When it was last modified. | [optional][default to 0]
**module** | Option<**String**> | Where it was published the post (blog, blog_external...). | [optional][default to null]
**moduleid** | Option<**i32**> | Module id where the post was created (not used anymore). | [optional][default to 0]
**publishstate** | Option<**String**> | Post publish state. | [optional][default to draft]
**rating** | Option<**i32**> | Post rating. | [optional][default to 0]
**subject** | Option<**String**> | Post subject. | [optional][default to null]
**summary** | Option<**String**> | Post summary. | [optional][default to null]
**summaryfiles** | Option<[**Vec<models::CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>**](core_blog_get_entries_200_response_entries_inner_summaryfiles_inner.md)> |  | [optional]
**summaryformat** | Option<**i32**> | summary format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to 0]
**tags** | Option<[**Vec<models::CoreBlogGetEntries200ResponseEntriesInnerTagsInner>**](core_blog_get_entries_200_response_entries_inner_tags_inner.md)> |  | [optional]
**uniquehash** | Option<**String**> | Post unique hash. | [optional][default to null]
**userid** | Option<**i32**> | Post author. | [optional][default to 0]
**usermodified** | Option<**i32**> | User that updated the post. | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


