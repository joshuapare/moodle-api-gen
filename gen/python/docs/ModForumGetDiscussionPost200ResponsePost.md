# ModForumGetDiscussionPost200ResponsePost


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachments** | [**List[ModForumGetDiscussionPost200ResponsePostAttachmentsInner]**](ModForumGetDiscussionPost200ResponsePostAttachmentsInner.md) |  | 
**author** | [**ModForumGetDiscussionPost200ResponsePostAuthor**](ModForumGetDiscussionPost200ResponsePostAuthor.md) |  | 
**capabilities** | [**ModForumGetDiscussionPost200ResponsePostCapabilities**](ModForumGetDiscussionPost200ResponsePostCapabilities.md) |  | 
**charcount** | **int** | charcount | [optional] 
**discussionid** | **int** | discussionid | 
**hasparent** | **bool** | hasparent | 
**haswordcount** | **bool** | haswordcount | 
**html** | [**ModForumGetDiscussionPost200ResponsePostHtml**](ModForumGetDiscussionPost200ResponsePostHtml.md) |  | [optional] 
**id** | **int** | id | 
**isdeleted** | **bool** | isdeleted | 
**isprivatereply** | **bool** | isprivatereply | 
**message** | **str** | message | 
**messageformat** | **int** | message format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | 
**messageinlinefiles** | [**List[ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner]**](ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner.md) |  | [optional] 
**parentid** | **int** | parentid | [optional] 
**replysubject** | **str** | replysubject | 
**subject** | **str** | subject | 
**tags** | [**List[ModForumGetDiscussionPost200ResponsePostTagsInner]**](ModForumGetDiscussionPost200ResponsePostTagsInner.md) |  | [optional] 
**timecreated** | **int** | timecreated | 
**timemodified** | **int** | timemodified | 
**unread** | **bool** | unread | [optional] 
**urls** | [**ModForumGetDiscussionPost200ResponsePostUrls**](ModForumGetDiscussionPost200ResponsePostUrls.md) |  | [optional] 
**wordcount** | **int** | wordcount | [optional] 

## Example

```python
from openapi_client.models.mod_forum_get_discussion_post200_response_post import ModForumGetDiscussionPost200ResponsePost

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumGetDiscussionPost200ResponsePost from a JSON string
mod_forum_get_discussion_post200_response_post_instance = ModForumGetDiscussionPost200ResponsePost.from_json(json)
# print the JSON string representation of the object
print(ModForumGetDiscussionPost200ResponsePost.to_json())

# convert the object into a dict
mod_forum_get_discussion_post200_response_post_dict = mod_forum_get_discussion_post200_response_post_instance.to_dict()
# create an instance of ModForumGetDiscussionPost200ResponsePost from a dict
mod_forum_get_discussion_post200_response_post_from_dict = ModForumGetDiscussionPost200ResponsePost.from_dict(mod_forum_get_discussion_post200_response_post_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


