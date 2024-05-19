# ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorfullname** | **str** | Full name of the user that started the discussion | [optional] [default to 'null']
**id** | **int** | ID of the discussion | [optional] [default to null]
**name** | **str** | Name of the discussion | [optional] [default to 'null']
**posts** | [**ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts**](ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts.md) |  | [optional] 
**timecreated** | **int** | Timestamp of the discussion start | [optional] [default to null]

## Example

```python
from openapi_client.models.mod_forum_get_discussion_posts_by_userid200_response_discussions_inner import ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInner from a JSON string
mod_forum_get_discussion_posts_by_userid200_response_discussions_inner_instance = ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInner.from_json(json)
# print the JSON string representation of the object
print(ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInner.to_json())

# convert the object into a dict
mod_forum_get_discussion_posts_by_userid200_response_discussions_inner_dict = mod_forum_get_discussion_posts_by_userid200_response_discussions_inner_instance.to_dict()
# create an instance of ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInner from a dict
mod_forum_get_discussion_posts_by_userid200_response_discussions_inner_from_dict = ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInner.from_dict(mod_forum_get_discussion_posts_by_userid200_response_discussions_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


