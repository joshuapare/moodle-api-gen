# ModForumGetDiscussionPost200ResponsePost

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachments** | [**Vec<models::ModForumGetDiscussionPost200ResponsePostAttachmentsInner>**](mod_forum_get_discussion_post_200_response_post_attachments_inner.md) |  | 
**author** | [**models::ModForumGetDiscussionPost200ResponsePostAuthor**](mod_forum_get_discussion_post_200_response_post_author.md) |  | 
**capabilities** | [**models::ModForumGetDiscussionPost200ResponsePostCapabilities**](mod_forum_get_discussion_post_200_response_post_capabilities.md) |  | 
**charcount** | Option<**i32**> | charcount | [optional]
**discussionid** | **i32** | discussionid | 
**hasparent** | **bool** | hasparent | 
**haswordcount** | **bool** | haswordcount | 
**html** | Option<[**models::ModForumGetDiscussionPost200ResponsePostHtml**](mod_forum_get_discussion_post_200_response_post_html.md)> |  | [optional]
**id** | **i32** | id | 
**isdeleted** | **bool** | isdeleted | 
**isprivatereply** | **bool** | isprivatereply | 
**message** | **String** | message | 
**messageformat** | **i32** | message format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | 
**messageinlinefiles** | Option<[**Vec<models::ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner>**](mod_feedback_get_analysis_200_response_itemsdata_inner_item_itemfiles_inner.md)> |  | [optional]
**parentid** | Option<**i32**> | parentid | [optional]
**replysubject** | **String** | replysubject | 
**subject** | **String** | subject | 
**tags** | Option<[**Vec<models::ModForumGetDiscussionPost200ResponsePostTagsInner>**](mod_forum_get_discussion_post_200_response_post_tags_inner.md)> |  | [optional]
**timecreated** | **i32** | timecreated | 
**timemodified** | **i32** | timemodified | 
**unread** | Option<**bool**> | unread | [optional]
**urls** | Option<[**models::ModForumGetDiscussionPost200ResponsePostUrls**](mod_forum_get_discussion_post_200_response_post_urls.md)> |  | [optional]
**wordcount** | Option<**i32**> | wordcount | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


