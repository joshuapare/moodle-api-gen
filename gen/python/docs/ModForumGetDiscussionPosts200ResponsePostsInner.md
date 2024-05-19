# ModForumGetDiscussionPosts200ResponsePostsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachments** | [**List[ModForumGetDiscussionPost200ResponsePostAttachmentsInner]**](ModForumGetDiscussionPost200ResponsePostAttachmentsInner.md) |  | [optional] 
**author** | [**ModForumGetDiscussionPost200ResponsePostAuthor**](ModForumGetDiscussionPost200ResponsePostAuthor.md) |  | [optional] 
**capabilities** | [**ModForumGetDiscussionPost200ResponsePostCapabilities**](ModForumGetDiscussionPost200ResponsePostCapabilities.md) |  | [optional] 
**charcount** | **int** | charcount | [optional] 
**discussionid** | **int** | discussionid | [optional] 
**hasparent** | **bool** | hasparent | [optional] 
**haswordcount** | **bool** | haswordcount | [optional] 
**html** | [**ModForumGetDiscussionPost200ResponsePostHtml**](ModForumGetDiscussionPost200ResponsePostHtml.md) |  | [optional] 
**id** | **int** | id | [optional] 
**isdeleted** | **bool** | isdeleted | [optional] 
**isprivatereply** | **bool** | isprivatereply | [optional] 
**message** | **str** | message | [optional] 
**messageformat** | **int** | message format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**messageinlinefiles** | [**List[ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner]**](ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner.md) |  | [optional] 
**parentid** | **int** | parentid | [optional] 
**replysubject** | **str** | replysubject | [optional] 
**subject** | **str** | subject | [optional] 
**tags** | [**List[ModForumGetDiscussionPost200ResponsePostTagsInner]**](ModForumGetDiscussionPost200ResponsePostTagsInner.md) |  | [optional] 
**timecreated** | **int** | timecreated | [optional] 
**timemodified** | **int** | timemodified | [optional] 
**unread** | **bool** | unread | [optional] 
**urls** | [**ModForumGetDiscussionPost200ResponsePostUrls**](ModForumGetDiscussionPost200ResponsePostUrls.md) |  | [optional] 
**wordcount** | **int** | wordcount | [optional] 

## Example

```python
from openapi_client.models.mod_forum_get_discussion_posts200_response_posts_inner import ModForumGetDiscussionPosts200ResponsePostsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumGetDiscussionPosts200ResponsePostsInner from a JSON string
mod_forum_get_discussion_posts200_response_posts_inner_instance = ModForumGetDiscussionPosts200ResponsePostsInner.from_json(json)
# print the JSON string representation of the object
print(ModForumGetDiscussionPosts200ResponsePostsInner.to_json())

# convert the object into a dict
mod_forum_get_discussion_posts200_response_posts_inner_dict = mod_forum_get_discussion_posts200_response_posts_inner_instance.to_dict()
# create an instance of ModForumGetDiscussionPosts200ResponsePostsInner from a dict
mod_forum_get_discussion_posts200_response_posts_inner_from_dict = ModForumGetDiscussionPosts200ResponsePostsInner.from_dict(mod_forum_get_discussion_posts200_response_posts_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


