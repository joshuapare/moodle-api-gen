# ModForumGetForumDiscussions200ResponseDiscussionsInner

post

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachment** | **str** | Has attachments? | [optional] [default to 'null']
**attachments** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**canfavourite** | **bool** | Can the user star the discussion | [optional] [default to False]
**canlock** | **bool** | Can the user lock the discussion | [optional] [default to False]
**canreply** | **bool** | Can the user reply to the discussion | [optional] [default to False]
**created** | **int** | Creation time | [optional] [default to null]
**discussion** | **int** | Discussion id | [optional] [default to null]
**groupid** | **int** | Group id | [optional] 
**id** | **int** | Post id | [optional] [default to null]
**locked** | **bool** | Is the discussion locked | [optional] [default to False]
**mailed** | **int** | Mailed? | [optional] [default to null]
**mailnow** | **int** | Mail now? | [optional] [default to null]
**message** | **str** | The post message | [optional] [default to 'null']
**messageformat** | **int** | message format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**messageinlinefiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**messagetrust** | **int** | Can we trust? | [optional] [default to null]
**modified** | **int** | Time modified | [optional] 
**name** | **str** | Discussion name | [optional] [default to 'null']
**numreplies** | **int** | The number of replies in the discussion | [optional] [default to null]
**numunread** | **int** | The number of unread discussions. | [optional] [default to null]
**parent** | **int** | Parent id | [optional] [default to null]
**pinned** | **bool** | Is the discussion pinned | [optional] [default to False]
**starred** | **bool** | Is the discussion starred | [optional] [default to False]
**subject** | **str** | The post subject | [optional] [default to 'null']
**timeend** | **int** | Time discussion ends | [optional] [default to null]
**timemodified** | **int** | Time modified | [optional] 
**timestart** | **int** | Time discussion can start | [optional] [default to null]
**totalscore** | **int** | The post message total score | [optional] [default to null]
**userfullname** | **str** | Post author full name | [optional] [default to 'null']
**userid** | **int** | User who started the discussion id | [optional] [default to null]
**usermodified** | **int** | The id of the user who last modified | [optional] [default to null]
**usermodifiedfullname** | **str** | Post modifier full name | [optional] [default to 'null']
**usermodifiedpictureurl** | **str** | Post modifier picture. | [optional] [default to 'null']
**userpictureurl** | **str** | Post author picture. | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_forum_get_forum_discussions200_response_discussions_inner import ModForumGetForumDiscussions200ResponseDiscussionsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumGetForumDiscussions200ResponseDiscussionsInner from a JSON string
mod_forum_get_forum_discussions200_response_discussions_inner_instance = ModForumGetForumDiscussions200ResponseDiscussionsInner.from_json(json)
# print the JSON string representation of the object
print(ModForumGetForumDiscussions200ResponseDiscussionsInner.to_json())

# convert the object into a dict
mod_forum_get_forum_discussions200_response_discussions_inner_dict = mod_forum_get_forum_discussions200_response_discussions_inner_instance.to_dict()
# create an instance of ModForumGetForumDiscussions200ResponseDiscussionsInner from a dict
mod_forum_get_forum_discussions200_response_discussions_inner_from_dict = ModForumGetForumDiscussions200ResponseDiscussionsInner.from_dict(mod_forum_get_forum_discussions200_response_discussions_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


