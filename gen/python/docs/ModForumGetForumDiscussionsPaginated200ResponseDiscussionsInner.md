# ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner

post

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachment** | **str** | Has attachments? | [optional] 
**attachments** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**canlock** | **bool** | Can the user lock the discussion | [optional] 
**canreply** | **bool** | Can the user reply to the discussion | [optional] 
**created** | **int** | Creation time | [optional] 
**discussion** | **int** | Discussion id | [optional] 
**groupid** | **int** | Group id | [optional] 
**id** | **int** | Post id | [optional] 
**locked** | **bool** | Is the discussion locked | [optional] 
**mailed** | **int** | Mailed? | [optional] 
**mailnow** | **int** | Mail now? | [optional] 
**message** | **str** | The post message | [optional] 
**messageformat** | **int** | message format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**messageinlinefiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**messagetrust** | **int** | Can we trust? | [optional] 
**modified** | **int** | Time modified | [optional] 
**name** | **str** | Discussion name | [optional] 
**numreplies** | **int** | The number of replies in the discussion | [optional] 
**numunread** | **int** | The number of unread discussions. | [optional] 
**parent** | **int** | Parent id | [optional] 
**pinned** | **bool** | Is the discussion pinned | [optional] 
**subject** | **str** | The post subject | [optional] 
**timeend** | **int** | Time discussion ends | [optional] 
**timemodified** | **int** | Time modified | [optional] 
**timestart** | **int** | Time discussion can start | [optional] 
**totalscore** | **int** | The post message total score | [optional] 
**userfullname** | **str** | Post author full name | [optional] 
**userid** | **int** | User who started the discussion id | [optional] 
**usermodified** | **int** | The id of the user who last modified | [optional] 
**usermodifiedfullname** | **str** | Post modifier full name | [optional] 
**usermodifiedpictureurl** | **str** | Post modifier picture. | [optional] 
**userpictureurl** | **str** | Post author picture. | [optional] 

## Example

```python
from openapi_client.models.mod_forum_get_forum_discussions_paginated200_response_discussions_inner import ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner from a JSON string
mod_forum_get_forum_discussions_paginated200_response_discussions_inner_instance = ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner.from_json(json)
# print the JSON string representation of the object
print(ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner.to_json())

# convert the object into a dict
mod_forum_get_forum_discussions_paginated200_response_discussions_inner_dict = mod_forum_get_forum_discussions_paginated200_response_discussions_inner_instance.to_dict()
# create an instance of ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner from a dict
mod_forum_get_forum_discussions_paginated200_response_discussions_inner_from_dict = ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner.from_dict(mod_forum_get_forum_discussions_paginated200_response_discussions_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


