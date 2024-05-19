# ModForumAddDiscussionPost200ResponsePost


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachments** | [**List[ModForumAddDiscussionPost200ResponsePostAttachmentsInner]**](ModForumAddDiscussionPost200ResponsePostAttachmentsInner.md) |  | 
**author** | [**ModForumAddDiscussionPost200ResponsePostAuthor**](ModForumAddDiscussionPost200ResponsePostAuthor.md) |  | 
**capabilities** | [**ModForumAddDiscussionPost200ResponsePostCapabilities**](ModForumAddDiscussionPost200ResponsePostCapabilities.md) |  | 
**charcount** | **int** | charcount | [optional] [default to null]
**discussionid** | **int** | discussionid | [default to null]
**hasparent** | **bool** | hasparent | [default to False]
**haswordcount** | **bool** | haswordcount | [default to False]
**html** | [**ModForumAddDiscussionPost200ResponsePostHtml**](ModForumAddDiscussionPost200ResponsePostHtml.md) |  | [optional] 
**id** | **int** | id | 
**isdeleted** | **bool** | isdeleted | [default to False]
**isprivatereply** | **bool** | isprivatereply | [default to False]
**message** | **str** | message | [default to 'null']
**messageformat** | **int** | message format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [default to null]
**messageinlinefiles** | [**List[ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner]**](ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner.md) |  | [optional] 
**parentid** | **int** | parentid | [optional] [default to null]
**replysubject** | **str** | replysubject | [default to 'null']
**subject** | **str** | subject | [default to 'null']
**tags** | [**List[ModForumAddDiscussionPost200ResponsePostTagsInner]**](ModForumAddDiscussionPost200ResponsePostTagsInner.md) |  | [optional] 
**timecreated** | **int** | timecreated | [default to null]
**timemodified** | **int** | timemodified | [default to null]
**unread** | **bool** | unread | [optional] [default to False]
**urls** | [**ModForumAddDiscussionPost200ResponsePostUrls**](ModForumAddDiscussionPost200ResponsePostUrls.md) |  | [optional] 
**wordcount** | **int** | wordcount | [optional] [default to null]

## Example

```python
from openapi_client.models.mod_forum_add_discussion_post200_response_post import ModForumAddDiscussionPost200ResponsePost

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumAddDiscussionPost200ResponsePost from a JSON string
mod_forum_add_discussion_post200_response_post_instance = ModForumAddDiscussionPost200ResponsePost.from_json(json)
# print the JSON string representation of the object
print(ModForumAddDiscussionPost200ResponsePost.to_json())

# convert the object into a dict
mod_forum_add_discussion_post200_response_post_dict = mod_forum_add_discussion_post200_response_post_instance.to_dict()
# create an instance of ModForumAddDiscussionPost200ResponsePost from a dict
mod_forum_add_discussion_post200_response_post_from_dict = ModForumAddDiscussionPost200ResponsePost.from_dict(mod_forum_add_discussion_post200_response_post_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


